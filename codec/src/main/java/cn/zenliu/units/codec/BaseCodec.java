package cn.zenliu.units.codec;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.ResourceLeakDetector;
import lombok.SneakyThrows;

import javax.annotation.Nullable;
import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;



/**
 * CodeBase is a extendable basic implement .<br/>
 * configuration: <br/>
 * <ol>
 *     <li>system property: "codec.cache" config internal TypeInfo caffeine cache behave. default is "expireAfterAccess=1h,softValues" </li>
 *     <li>system property: "codec.debug" enable debug function. </li>
 *     <li>system property: "io.netty.leakDetection.level" enabled also enable debug function. </li>
 * </ol>
 *
 * @author Zen.Liu
 * @since 2023-08-22
 */

@SuppressWarnings("rawtypes")
public class BaseCodec implements Codec {
    protected static final AtomicBoolean debugFlag = new AtomicBoolean(false);
    //region Types
    protected static final TypeInfo BOOLEAN = of(Codec::decodeBoolean, (b, v) -> Codec.encodeBoolean(b, (boolean) v));
    protected static final TypeInfo INT32 = of(Codec::decodeInt32, (b, v) -> Codec.encodeInt32(b, (int) v));
    protected static final TypeInfo INT64 = of(Codec::decodeInt64, (b, v) -> Codec.encodeInt64(b, (long) v));
    protected static final TypeInfo FLOAT32 = of(Codec::decodeFloat32, (b, v) -> Codec.encodeFloat32(b, (float) v));
    protected static final TypeInfo FLOAT64 = of(Codec::decodeFloat64, (b, v) -> Codec.encodeFloat64(b, (double) v));
    protected static final TypeInfo BYTES = of(Codec::decodeByteArray, (b, v) -> Codec.encodeByteArray(b, (byte[]) v));

    protected static final TypeInfo BOOLEAN_ARRAY = array(boolean.class, BOOLEAN);
    protected static final TypeInfo INT32_ARRAY = array(int.class, INT32);
    protected static final TypeInfo INT64_ARRAY = array(long.class, INT64);
    protected static final TypeInfo FLOAT32_ARRAY = array(float.class, FLOAT32);
    protected static final TypeInfo FLOAT64_ARRAY = array(double.class, FLOAT64);

    @SuppressWarnings("unchecked")
    protected static final TypeInfo BOX_BOOLEAN = optional((TypeInfo<Object>) BOOLEAN);
    @SuppressWarnings("unchecked")
    protected static final TypeInfo BOX_INT32 = optional((TypeInfo<Object>) INT32);
    @SuppressWarnings("unchecked")
    protected static final TypeInfo BOX_INT64 = optional((TypeInfo<Object>) INT64);
    @SuppressWarnings("unchecked")
    protected static final TypeInfo BOX_FLOAT32 = optional((TypeInfo<Object>) FLOAT32);
    @SuppressWarnings("unchecked")
    protected static final TypeInfo BOX_FLOAT64 = optional((TypeInfo<Object>) FLOAT64);


    protected static final TypeInfo BOX_BOOLEAN_ARRAY = array(Boolean.class, BOX_BOOLEAN);
    protected static final TypeInfo BOX_INT32_ARRAY = array(Integer.class, BOX_INT32);
    protected static final TypeInfo BOX_INT64_ARRAY = array(Long.class, BOX_INT64);
    protected static final TypeInfo BOX_FLOAT32_ARRAY = array(Float.class, BOX_FLOAT32);
    protected static final TypeInfo BOX_FLOAT64_ARRAY = array(Double.class, BOX_FLOAT64);
    protected static final TypeInfo STRING = new TypeInfo<String>() {
        @Override
        public String read(ByteBuf buf) {
            return Codec.decodeString(buf);
        }

        @Override
        public void write(ByteBuf buf, String value) {
            Codec.encodeString(buf, value);
        }
    };

    protected static final TypeInfo BIG_DECIMAL = new TypeInfo<BigDecimal>() {
        @Override
        public BigDecimal read(ByteBuf buf) {
            var s = Codec.decodeString(buf);
            return s == null || s.isEmpty() ? null : new BigDecimal(s);
        }

        @Override
        public void write(ByteBuf buf, BigDecimal value) {
            Codec.encodeString(buf, value == null ? null : value.toEngineeringString());
        }
    };
    protected static final TypeInfo BIG_INTEGER = new TypeInfo<BigInteger>() {
        @Override
        public BigInteger read(ByteBuf buf) {
            var s = Codec.decodeString(buf);
            return s == null || s.isEmpty() ? null : new BigInteger(s);
        }

        @Override
        public void write(ByteBuf buf, BigInteger value) {
            Codec.encodeString(buf, value == null ? null : value.toString(16));
        }
    };
    protected static final TypeInfo INSTANT = new TypeInfo<Instant>() {
        @Override
        public Instant read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var sec = Codec.zigZagVarInt64(buf);
            var nano = Codec.zigZagVarInt32(buf);
            return Instant.ofEpochSecond(sec, nano);
        }

        @Override
        public void write(ByteBuf buf, Instant value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            Codec.zigZagVarInt64(buf, value.getEpochSecond());
            Codec.zigZagVarInt32(buf, value.getNano());
        }
    };
    protected static final TypeInfo TIMESTAMP_SQL = new TypeInfo<Timestamp>() {
        @Override
        public Timestamp read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var mills = Codec.zigZagVarInt64(buf);
            return new Timestamp(mills);
        }

        @Override
        public void write(ByteBuf buf, Timestamp value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            Codec.zigZagVarInt64(buf, value.getTime());
        }
    };
    protected static final TypeInfo DURATION = new TypeInfo<Duration>() {
        @Override
        public Duration read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var sec = Codec.zigZagVarInt64(buf);
            var non = Codec.zigZagVarInt64(buf);
            return Duration.ofSeconds(sec, non);
        }

        @Override
        public void write(ByteBuf buf, Duration value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            Codec.zigZagVarInt64(buf, value.getSeconds());
            Codec.zigZagVarInt32(buf, value.getNano());
        }
    };
    protected static final TypeInfo PERIOD = new TypeInfo<Period>() {
        @Override
        public Period read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var y = Codec.zigZagVarInt32(buf);
            var m = Codec.zigZagVarInt32(buf);
            var d = Codec.zigZagVarInt32(buf);
            return Period.of(y, m, d);
        }

        @Override
        public void write(ByteBuf buf, Period value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            Codec.zigZagVarInt32(buf, value.getYears());
            Codec.zigZagVarInt32(buf, value.getMonths());
            Codec.zigZagVarInt32(buf, value.getDays());
        }
    };

    protected static TypeInfo of(Function<ByteBuf, Object> read, BiConsumer<ByteBuf, Object> write) {
        return new TypeInfo<>() {
            @Override
            public Object read(ByteBuf buf) {
                return read.apply(buf);
            }

            @Override
            public void write(ByteBuf buf, Object value) {
                write.accept(buf, value);
            }
        };
    }

    protected static TypeInfo optional(TypeInfo<Object> nonnull) {
        return new TypeInfo<>() {
            @Override
            public Object read(ByteBuf buf) {
                if (buf.readByte() > 0)
                    return nonnull.read(buf);
                return null;
            }

            @Override
            public void write(ByteBuf buf, Object value) {
                if (value != null) {
                    buf.writeByte(1);
                    nonnull.write(buf, value);
                    return;
                }
                buf.writeByte(0);

            }
        };
    }

    protected static TypeInfo array(Class ele, Function<ByteBuf, Object> read, BiConsumer<ByteBuf, Object> write) {
        return new TypeInfo<>() {
            @Override
            public Object read(ByteBuf buf) {
                return Codec.decodeAnyArray(buf, ele, read);
            }

            @Override
            public void write(ByteBuf buf, Object value) {
                Codec.encodeAnyArray(buf, value, write);
            }
        };
    }


    protected static TypeInfo array(Class ele, TypeInfo element) {
        return new TypeInfo<>() {
            @Override
            public Object read(ByteBuf buf) {
                return Codec.decodeAnyArray(buf, ele, element::read);
            }

            @SuppressWarnings("unchecked")
            @Override
            public void write(ByteBuf buf, Object value) {
                Codec.encodeAnyArray(buf, value, element::write);
            }
        };
    }

    protected static TypeInfo stringEnum(Class<? extends Enum<?>> ele) {
        var cache = Arrays.stream(ele.getEnumConstants()).collect(Collectors.toUnmodifiableMap(Enum::name, Function.identity()));
        return new TypeInfo<>() {
            @Override
            public Object read(ByteBuf buf) {
                var s = Codec.decodeString(buf);
                return s == null || s.isEmpty() ? null : cache.get(s);
            }

            @Override
            public void write(ByteBuf buf, Object value) {
                Codec.encodeString(buf, value == null ? null : ((Enum<?>) value).name());
            }
        };
    }

    //endregion

    //region Factories
    @SuppressWarnings("unchecked")
    public static <E extends Throwable> void exception(Throwable throwable) throws E {
        throw (E) throwable;
    }

    protected static Class box(Class<?> t) {
        if (t.isPrimitive()) {
            if (t.isAssignableFrom(boolean.class)) return Boolean.class;
            if (t.isAssignableFrom(byte.class)) return Byte.class;
            if (t.isAssignableFrom(short.class)) return Short.class;
            if (t.isAssignableFrom(char.class)) return Character.class;
            if (t.isAssignableFrom(long.class)) return Long.class;
            if (t.isAssignableFrom(float.class)) return Float.class;
            if (t.isAssignableFrom(double.class)) return Double.class;
            if (t.isAssignableFrom(void.class)) return Void.class;
        }
        return t;
    }

    public static Class raw(Type type) {
        while (!(type instanceof Class<?> cls)) {
            if (type instanceof ParameterizedType p) {
                type = p.getRawType();
            } else if (type instanceof GenericArrayType p) {
                type = p.getGenericComponentType();
            } /*else if (type instanceof TypeVariable<?> var) {

            }*/
        }
        return cls;
    }

    protected static @Nullable TypeInfo<?> simpleClassFactory(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls.isAssignableFrom(boolean.class)) return BOOLEAN;
            if (cls.isAssignableFrom(int.class)) return INT32;
            if (cls.isAssignableFrom(long.class)) return INT64;
            if (cls.isAssignableFrom(float.class)) return FLOAT32;
            if (cls.isAssignableFrom(double.class)) return FLOAT64;
            return null;
        } else if (cls.isAssignableFrom(Boolean.class)) return BOX_BOOLEAN;
        else if (cls.isAssignableFrom(Integer.class)) return BOX_INT32;
        else if (cls.isAssignableFrom(Long.class)) return BOX_INT64;
        else if (cls.isAssignableFrom(Float.class)) return BOX_FLOAT32;
        else if (cls.isAssignableFrom(Double.class)) return BOX_FLOAT64;
        else if (cls.isArray()) {
            var com = cls.getComponentType();
            if (com.isPrimitive()) {
                if (com.isAssignableFrom(boolean.class)) return BOOLEAN_ARRAY;
                if (com.isAssignableFrom(byte.class)) return BYTES;
                if (com.isAssignableFrom(int.class)) return INT32_ARRAY;
                if (com.isAssignableFrom(long.class)) return INT64_ARRAY;
                if (com.isAssignableFrom(float.class)) return FLOAT32_ARRAY;
                if (com.isAssignableFrom(double.class)) return FLOAT64_ARRAY;
                return null;
            } else if (com.isAssignableFrom(Boolean.class)) return BOX_BOOLEAN_ARRAY;
            else if (com.isAssignableFrom(Integer.class)) return BOX_INT32_ARRAY;
            else if (com.isAssignableFrom(Long.class)) return BOX_INT64_ARRAY;
            else if (com.isAssignableFrom(Float.class)) return BOX_FLOAT32_ARRAY;
            else if (com.isAssignableFrom(Double.class)) return BOX_FLOAT64_ARRAY;
        }
        return null;
    }

    interface Getter {
        Object get(Object obj);

    }

    interface Setter {
        void set(Object obj, Object val);

        @SuppressWarnings("UnusedReturnValue")
        interface Chain extends Setter {
            Object setChain(Object obj, Object val);

            @Override
            default void set(Object obj, Object val) {
                setChain(obj, val);
            }
        }
    }

    @SuppressWarnings("rawtypes")
    record Accessor(Setter set, Getter get, TypeInfo codec) {
        static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();

        public void read(ByteBuf buf, Object instance) {
            set.set(instance, codec.read(buf));
        }

        @SuppressWarnings("unchecked")
        public void write(ByteBuf buf, Object instance) {
            codec.write(buf, get.get(instance));
        }

        static String cap(CharSequence name) {
            return Character.toUpperCase(name.charAt(0)) + name.subSequence(1, name.length()).toString();
        }

        @SneakyThrows
        public static Accessor create(Field field, TypeInfo<?> codec) {
            var setter = LOOKUP.unreflectSetter(field);
            Setter setterLambda;
            try {
                setterLambda = (Setter) LambdaMetafactory.metafactory(
                        LOOKUP,
                        "set",
                        MethodType.methodType(Setter.class),
                        setter.type().wrap().generic().changeReturnType(void.class),
                        setter,
                        setter.type().wrap()
                ).getTarget().invokeExact();
            } catch (LambdaConversionException e) {
                setter = null;
                for (var m : field.getDeclaringClass().getDeclaredMethods()) {
                    if (m.getParameterCount() == 1 && m.getParameterTypes()[0] == field.getType()) {
                        setter = LOOKUP.unreflect(m);
                        break;
                    }
                }
                if (setter == null) throw new IllegalStateException("can't found setter for field: " + field);
                setterLambda = (Setter) (Setter.Chain) LambdaMetafactory.metafactory(
                        LOOKUP,
                        "setChain",
                        MethodType.methodType(Setter.Chain.class),
                        setter.type().wrap().generic(),
                        setter,
                        setter.type().wrap()
                ).getTarget().invokeExact();

            }
            var getter = LOOKUP.unreflectGetter(field);
            Getter getterLambda;
            try {
                getterLambda = (Getter) LambdaMetafactory.metafactory(
                        LOOKUP,
                        "get",
                        MethodType.methodType(Getter.class),
                        MethodType.methodType(Object.class, Object.class),
                        getter,
                        getter.type().wrap()
                ).getTarget().invokeExact();
            } catch (LambdaConversionException e) {
                getter = null;
                for (var m : field.getDeclaringClass().getDeclaredMethods()) {
                    if (m.getDeclaringClass() == field.getDeclaringClass()
                            && m.getParameterCount() == 0
                            && m.getReturnType() == field.getType()
                            && (m.getName().contains(field.getName()) || m.getName().contains(cap(field.getName())))
                    ) {
                        getter = LOOKUP.unreflect(m);
                        break;
                    }
                }
                if (getter == null) throw new IllegalStateException("can't found getter for field: " + field);
                getterLambda = (Getter) LambdaMetafactory.metafactory(
                        LOOKUP,
                        "get",
                        MethodType.methodType(Getter.class),
                        MethodType.methodType(Object.class, Object.class),
                        getter,
                        getter.type().wrap()
                ).getTarget().invokeExact();
            }

            return new Accessor(setterLambda, getterLambda, codec);
        }
    }

    record PojoTypeInfo(
            LinkedList<Accessor> accessors,
            Instantiate creator
    ) implements TypeInfo<Object> {
        @Override
        public Object read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var o = creator.apply(null); //!! null is fine , case only Instantiate.I0 allowed.
            for (var accessor : accessors) {
                accessor.read(buf, o);
            }
            return o;
        }

        @Override
        public void write(ByteBuf buf, Object value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            for (var accessor : accessors) {
                accessor.write(buf, value);
            }
        }


        /**
         * no throws
         */
        public static @Nullable PojoTypeInfo make(Class<?> type, Function<Type, TypeInfo> resolve) {
            try {
                var ctor = Instantiate.select(null, type);
                if (ctor == null) return null;
                var accessor = new LinkedList<Accessor>();
                for (var field : type.getDeclaredFields()) {
                    var mod = field.getModifiers();
                    if (Modifier.isStatic(mod) || Modifier.isFinal(mod) || Modifier.isTransient(mod)) continue;
                    field.setAccessible(true);
                    accessor.add(Accessor.create(field, Objects.requireNonNull(resolve.apply(field.getGenericType()), "can't create field")));
                }
                return new PojoTypeInfo(accessor, ctor);
            } catch (Throwable e) {
                if (debugFlag.get()) exception(e);
                return null;
            }
        }

    }

    record SerializerTypeInfo(Supplier<Serializer> creator) implements TypeInfo<Object> {
        @SuppressWarnings("unchecked")
        public static TypeInfo make(Class<?> cls) {
            if (!Serializer.class.isAssignableFrom(cls)) return null;

            try {
                final Supplier<Serializer> creator;
                var getCallSite = LambdaMetafactory.metafactory(
                        Accessor.LOOKUP,
                        "get",
                        MethodType.methodType(Supplier.class),
                        MethodType.methodType(Serializer.class),
                        Accessor.LOOKUP.unreflectConstructor(cls.getConstructor()),
                        MethodType.methodType(cls)
                );
                creator = (Supplier<Serializer>) getCallSite.getTarget().invokeExact();
                return new SerializerTypeInfo(creator);
            } catch (Throwable e) {
                return null;
            }
        }

        @Override
        public Object read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var o = creator.get();
            o.read(buf);
            return o;
        }

        @Override
        public void write(ByteBuf buf, Object value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            ((Serializer) value).write(buf);
        }
    }

    record MapTypeInfo(IntFunction creator, TypeInfo key, TypeInfo value) implements TypeInfo<Object> {
        public static TypeInfo make(Class<?> container, TypeInfo key, TypeInfo value) {
            if (!Map.class.isAssignableFrom(container)) return null;
            try {
                IntFunction creator = null;
                Supplier creator2 = null;
                if (container.isInterface()) creator = HashMap::new;
                else {
                    try {
                        var ctor = container.getConstructor(int.class);
                        var site = LambdaMetafactory.metafactory(
                                Accessor.LOOKUP,
                                "apply",
                                MethodType.methodType(IntFunction.class),
                                MethodType.methodType(Object.class, int.class),
                                Accessor.LOOKUP.unreflectConstructor(ctor),
                                MethodType.methodType(container, int.class)
                        );
                        creator = (IntFunction) site.getTarget().invokeExact();
                    } catch (Throwable ignore) {
                        try {
                            var ctor = container.getConstructor();
                            var site = LambdaMetafactory.metafactory(
                                    Accessor.LOOKUP,
                                    "get",
                                    MethodType.methodType(Supplier.class),
                                    MethodType.methodType(Object.class),
                                    Accessor.LOOKUP.unreflectConstructor(ctor),
                                    MethodType.methodType(container)
                            );
                            creator2 = (Supplier) site.getTarget().invokeExact();
                        } catch (Throwable ignore2) {
                            return null;
                        }
                    }
                }
                if (creator2 != null) {
                    var c = creator2;
                    creator = i -> c.get();
                }
                return new MapTypeInfo(creator, key, value);
            } catch (Exception e) {
                if (debugFlag.get()) exception(e);
                return null;
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Object read(ByteBuf buf) {
            var n = Codec.zigZagVarInt32(buf);
            if (n < 0) return null;
            var m = (Map) creator.apply(n);
            if (n == 0) return m;
            for (int i = 0; i < n; i++) {
                m.put(key.read(buf), value.read(buf));
            }
            return m;
        }

        @SuppressWarnings("unchecked")
        @Override
        public void write(ByteBuf buf, Object value) {
            if (!(value instanceof Map<?, ?> m)) {
                Codec.zigZagVarInt32(buf, -1);
            } else if (m.isEmpty()) {
                Codec.zigZagVarInt32(buf, 0);
            } else {
                var n = m.size();
                Codec.zigZagVarInt32(buf, n);
                m.forEach((k, v) -> {
                    key.write(buf, k);
                    this.value.write(buf, v);
                });
            }
        }
    }

    /*
    generated
     */
    interface Instantiate {
        Object apply(Object[] args);

        interface I0 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args == null || args.length == 0 : "0 args required";
                return apply0();
            }

            Object apply0();
        }

        interface I1 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 1 : "1 args required";
                return apply1(args[0]);
            }

            Object apply1(Object args0);
        }

        interface I2 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 2 : "2 args required";
                return apply2(args[0], args[1]);
            }

            Object apply2(Object args0, Object args1);
        }

        interface I3 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 3 : "3 args required";
                return apply3(args[0], args[1], args[2]);
            }

            Object apply3(Object args0, Object args1, Object args2);
        }

        interface I4 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 4 : "4 args required";
                return apply4(args[0], args[1], args[2], args[3]);
            }

            Object apply4(Object args0, Object args1, Object args2, Object args3);
        }

        interface I5 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 5 : "5 args required";
                return apply5(args[0], args[1], args[2], args[3], args[4]);
            }

            Object apply5(Object args0, Object args1, Object args2, Object args3, Object args4);
        }

        interface I6 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 6 : "6 args required";
                return apply6(args[0], args[1], args[2], args[3], args[4], args[5]);
            }

            Object apply6(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5);
        }

        interface I7 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 7 : "7 args required";
                return apply7(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            }

            Object apply7(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6);
        }

        interface I8 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 8 : "8 args required";
                return apply8(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
            }

            Object apply8(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7);
        }

        interface I9 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 9 : "9 args required";
                return apply9(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8]);
            }

            Object apply9(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8);
        }

        interface I10 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 10 : "10 args required";
                return apply10(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
            }

            Object apply10(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9);
        }

        interface I11 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 11 : "11 args required";
                return apply11(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10]);
            }

            Object apply11(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10);
        }

        interface I12 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 12 : "12 args required";
                return apply12(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11]);
            }

            Object apply12(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11);
        }

        interface I13 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 13 : "13 args required";
                return apply13(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12]);
            }

            Object apply13(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12);
        }

        interface I14 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 14 : "14 args required";
                return apply14(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13]);
            }

            Object apply14(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13);
        }

        interface I15 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 15 : "15 args required";
                return apply15(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14]);
            }

            Object apply15(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14);
        }

        interface I16 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 16 : "16 args required";
                return apply16(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15]);
            }

            Object apply16(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15);
        }

        interface I17 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 17 : "17 args required";
                return apply17(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16]);
            }

            Object apply17(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16);
        }

        interface I18 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 18 : "18 args required";
                return apply18(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17]);
            }

            Object apply18(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17);
        }

        interface I19 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 19 : "19 args required";
                return apply19(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18]);
            }

            Object apply19(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18);
        }

        interface I20 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 20 : "20 args required";
                return apply20(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19]);
            }

            Object apply20(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19);
        }

        interface I21 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 21 : "21 args required";
                return apply21(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20]);
            }

            Object apply21(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20);
        }

        interface I22 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 22 : "22 args required";
                return apply22(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21]);
            }

            Object apply22(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21);
        }

        interface I23 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 23 : "23 args required";
                return apply23(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22]);
            }

            Object apply23(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22);
        }

        interface I24 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 24 : "24 args required";
                return apply24(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23]);
            }

            Object apply24(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23);
        }

        interface I25 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 25 : "25 args required";
                return apply25(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23], args[24]);
            }

            Object apply25(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23, Object args24);
        }

        interface I26 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 26 : "26 args required";
                return apply26(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23], args[24], args[25]);
            }

            Object apply26(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23, Object args24, Object args25);
        }

        interface I27 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 27 : "27 args required";
                return apply27(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23], args[24], args[25], args[26]);
            }

            Object apply27(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23, Object args24, Object args25, Object args26);
        }

        interface I28 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 28 : "28 args required";
                return apply28(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23], args[24], args[25], args[26], args[27]);
            }

            Object apply28(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23, Object args24, Object args25, Object args26, Object args27);
        }

        interface I29 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 29 : "29 args required";
                return apply29(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23], args[24], args[25], args[26], args[27], args[28]);
            }

            Object apply29(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23, Object args24, Object args25, Object args26, Object args27, Object args28);
        }

        interface I30 extends Instantiate {
            @Override
            default Object apply(Object[] args) {
                assert args.length == 30 : "30 args required";
                return apply30(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19], args[20], args[21], args[22], args[23], args[24], args[25], args[26], args[27], args[28], args[29]);
            }

            Object apply30(Object args0, Object args1, Object args2, Object args3, Object args4, Object args5, Object args6, Object args7, Object args8, Object args9, Object args10, Object args11, Object args12, Object args13, Object args14, Object args15, Object args16, Object args17, Object args18, Object args19, Object args20, Object args21, Object args22, Object args23, Object args24, Object args25, Object args26, Object args27, Object args28, Object args29);
        }

        static @Nullable Instantiate select(@Nullable Class<?>[] args, Class<?> type) {
            try {
                var ct = args == null || args.length == 0 ? Accessor.LOOKUP.unreflectConstructor(type.getDeclaredConstructor()) : Accessor.LOOKUP.unreflectConstructor(type.getDeclaredConstructor(args));
                return switch (args == null ? 0 : args.length) {
                    case 0 -> (Instantiate) (I0) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply0",
                            MethodType.methodType(I0.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 1 -> (Instantiate) (I1) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply1",
                            MethodType.methodType(I1.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 2 -> (Instantiate) (I2) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply2",
                            MethodType.methodType(I2.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 3 -> (Instantiate) (I3) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply3",
                            MethodType.methodType(I3.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 4 -> (Instantiate) (I4) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply4",
                            MethodType.methodType(I4.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 5 -> (Instantiate) (I5) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply5",
                            MethodType.methodType(I5.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 6 -> (Instantiate) (I6) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply6",
                            MethodType.methodType(I6.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 7 -> (Instantiate) (I7) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply7",
                            MethodType.methodType(I7.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 8 -> (Instantiate) (I8) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply8",
                            MethodType.methodType(I8.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 9 -> (Instantiate) (I9) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply9",
                            MethodType.methodType(I9.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 10 -> (Instantiate) (I10) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply10",
                            MethodType.methodType(I10.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 11 -> (Instantiate) (I11) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply11",
                            MethodType.methodType(I11.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 12 -> (Instantiate) (I12) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply12",
                            MethodType.methodType(I12.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 13 -> (Instantiate) (I13) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply13",
                            MethodType.methodType(I13.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 14 -> (Instantiate) (I14) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply14",
                            MethodType.methodType(I14.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 15 -> (Instantiate) (I15) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply15",
                            MethodType.methodType(I15.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 16 -> (Instantiate) (I16) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply16",
                            MethodType.methodType(I16.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 17 -> (Instantiate) (I17) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply17",
                            MethodType.methodType(I17.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 18 -> (Instantiate) (I18) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply18",
                            MethodType.methodType(I18.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 19 -> (Instantiate) (I19) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply19",
                            MethodType.methodType(I19.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 20 -> (Instantiate) (I20) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply20",
                            MethodType.methodType(I20.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 21 -> (Instantiate) (I21) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply21",
                            MethodType.methodType(I21.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 22 -> (Instantiate) (I22) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply22",
                            MethodType.methodType(I22.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 23 -> (Instantiate) (I23) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply23",
                            MethodType.methodType(I23.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 24 -> (Instantiate) (I24) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply24",
                            MethodType.methodType(I24.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 25 -> (Instantiate) (I25) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply25",
                            MethodType.methodType(I25.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 26 -> (Instantiate) (I26) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply26",
                            MethodType.methodType(I26.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 27 -> (Instantiate) (I27) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply27",
                            MethodType.methodType(I27.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 28 -> (Instantiate) (I28) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply28",
                            MethodType.methodType(I28.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 29 -> (Instantiate) (I29) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply29",
                            MethodType.methodType(I29.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    case 30 -> (Instantiate) (I30) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "apply30",
                            MethodType.methodType(I30.class),
                            ct.type().wrap().generic(),
                            ct,
                            ct.type().wrap()
                    ).getTarget().invokeExact();
                    default -> null;
                };
            } catch (Throwable e) {
                if (debugFlag.get()) exception(e);
                return null;
            }
        }

    }

//generator
//    public static void main(String[] args) {
//        var b = new StringBuilder("""
//                interface Instantiate {
//                    Object apply(Object[] args);
//                """);
//        var g = new StringBuilder(
//                """
//                        static @Nullable Instantiate select(Class<?>[] args,Class<?> type) {
//                            try{
//                                 var ct = args==null||args.length==0?LOOKUP.unreflectConstructor(type.getDeclaredConstructor()):LOOKUP.unreflectConstructor(type.getDeclaredConstructor(args));
//                                 return switch (args==null?0:args.length) {
//                        """);
//        for (int i = 0; i <= 30; i++) {
//            if(i==0)
//            b.append("""
//                    interface I%1$d extends Instantiate {
//                        @Override
//                        default Object apply(Object[] args) {
//                            assert args==null||args.length == %1$d : "%1$d args required";
//                            return apply%1$d(""".formatted(i));
//            else
//            b.append("""
//                    interface I%1$d extends Instantiate {
//                        @Override
//                        default Object apply(Object[] args) {
//                            assert args.length == %1$d : "%1$d args required";
//                            return apply%1$d(""".formatted(i));
//            for (int j = 0; j < i; j++) {
//                if (j > 0) b.append(",");
//                b.append("args[").append(j).append("]");
//            }
//            b.append(");\n\t}\n");
//            b.append("\tObject apply").append(i).append("(");
//            for (int j = 0; j < i; j++) {
//                if (j > 0) b.append(",");
//                b.append("Object args").append(j);
//            }
//            b.append(");\n}\n");
//
//            g.append("""
//                        case %1$d -> (Instantiate)(Instantiate.I%1$d)LambdaMetafactory.metafactory(
//                                                LOOKUP,
//                                                "apply%1$d",
//                                                MethodType.methodType(Instantiate.I%1$d.class),
//                                                ct.type().wrap().generic(),
//                                                ct,
//                                                ct.type().wrap()
//                                        ).getTarget().invokeExact();
//                    """.formatted(i));
//        }
//        g.append("""
//                            default -> null;
//                        };
//                    } catch (Throwable ignore){
//                        return null;
//                    }
//                }
//                """);
//        b.append(g).append("\n}");
//        System.out.println(b);
//    }

    record CollectionTypeInfo(Supplier creator, TypeInfo value) implements TypeInfo<Object> {
        static Optional<TypeInfo> make(Class<?> container, TypeInfo value) {
            if (!Collection.class.isAssignableFrom(container)) return Optional.empty();
            final Supplier creator;
            if (container.isInterface()) {
                if (container.isAssignableFrom(Set.class)) creator = HashSet::new;
                else creator = LinkedList::new;
            } else {
                try {
                    var ctor = container.getConstructor(int.class);
                    var site = LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "get",
                            MethodType.methodType(Supplier.class),
                            MethodType.methodType(Object.class),
                            Accessor.LOOKUP.unreflectConstructor(ctor),
                            MethodType.methodType(container)
                    );
                    creator = (Supplier) site.getTarget().invokeExact();
                } catch (Throwable e) {
                    if (debugFlag.get()) exception(e);
                    return Optional.empty();
                }
            }
            return Optional.of(new CollectionTypeInfo(creator, value));
        }

        @SuppressWarnings("unchecked")
        @Override
        public Object read(ByteBuf buf) {
            var n = Codec.zigZagVarInt32(buf);
            if (n < 0) return null;
            var m = (Collection) creator.get();
            if (n == 0) return m;
            for (int i = 0; i < n; i++) {
                m.add(value.read(buf));
            }
            return m;
        }

        @SuppressWarnings("unchecked")
        @Override
        public void write(ByteBuf buf, Object value) {
            if (!(value instanceof Collection<?> m)) {
                Codec.zigZagVarInt32(buf, -1);
            } else if (m.isEmpty()) {
                Codec.zigZagVarInt32(buf, 0);
            } else {
                var n = m.size();
                Codec.zigZagVarInt32(buf, n);
                m.forEach((v) -> this.value.write(buf, v));
            }
        }
    }

    record RecordTypeInfo(Instantiate creator, LinkedList<Getter> accessor,
                          LinkedList<TypeInfo> types) implements TypeInfo<Object> {


        @Override
        public Object read(ByteBuf buf) {
            if (buf.readByte() <= 0) return null;
            var o = new Object[types.size()];
            for (int i = 0; i < types.size(); i++) {
                o[i] = types.get(i).read(buf);
            }
            return creator.apply(o);
        }

        @SuppressWarnings("unchecked")
        @Override
        public void write(ByteBuf buf, Object value) {
            if (value == null) {
                buf.writeByte(0);
                return;
            }
            buf.writeByte(1);
            for (int i = 0; i < accessor.size(); i++) {
                types.get(i).write(buf, accessor.get(i).get(value));
            }
        }

        /**
         * no throws
         */
        public static @Nullable RecordTypeInfo make(Class<?> cls, Function<Type, TypeInfo> resolve) {
            if (!cls.isRecord()) return null;
            try {
                var components = cls.getRecordComponents();
                assert components.length > 0 : "empty record";
                var com = new Class<?>[components.length];
                var getters = new LinkedList<Getter>();
                var types = new LinkedList<TypeInfo>();
                var idx = new AtomicInteger(-1);
                for (var c : components) {
                    var i = idx.incrementAndGet();
                    com[i] = c.getType();
                    var t = resolve.apply(c.getGenericType());
                    if (t == null) return null;
                    types.add(t);
                    getters.add((Getter) LambdaMetafactory.metafactory(
                            Accessor.LOOKUP,
                            "get",
                            MethodType.methodType(Getter.class),
                            MethodType.methodType(Object.class, Object.class),
                            Accessor.LOOKUP.unreflect(c.getAccessor()),
                            MethodType.methodType(c.getType(), c.getDeclaringRecord())
                    ).getTarget().invokeExact());
                }
                var ctor = Instantiate.select(com, cls);
                if (ctor == null) return null;
                return new RecordTypeInfo(ctor, getters, types);
//                return null;
            } catch (Throwable e) {
                if (debugFlag.get()) exception(e);
                return null;
            }
        }

    }


    protected static @Nullable TypeInfo<?> pojoFactory(Class<?> type, Function<Type, TypeInfo> resolve) {
        if (Serializer.class.isAssignableFrom(type)) {
            return SerializerTypeInfo.make(type);
        }
        if (type.isInterface())
            return null;
        if (type.isRecord())
            return RecordTypeInfo.make(type, resolve);
        return PojoTypeInfo.make(type, resolve);
    }

    /**
     * This is an endpoint factory, should never pass the input type to resolver.
     *
     * @param type     type to build
     * @param resolver component resolver
     * @return result
     */
    @SuppressWarnings({"unchecked"})
    protected static Optional<TypeInfo> genericFactory(Type type, Function<Type, Optional<TypeInfo>> resolver) {
        if (type instanceof Class<?> cls) {
            if (cls.isAssignableFrom(String.class)) return Optional.of(STRING);
            if (cls.isAssignableFrom(BigDecimal.class)) return Optional.of(BIG_DECIMAL);
            if (cls.isAssignableFrom(BigInteger.class)) return Optional.of(BIG_INTEGER);
            if (cls.isAssignableFrom(Instant.class)) return Optional.of(INSTANT);
            if (cls.isAssignableFrom(Timestamp.class)) return Optional.of(TIMESTAMP_SQL);
            if (cls.isAssignableFrom(Duration.class)) return Optional.of(DURATION);
            if (cls.isAssignableFrom(Period.class)) return Optional.of(PERIOD);
            return Optional.ofNullable(pojoFactory(cls, resolver.andThen(o -> o.orElse(null))));
        }
        if (type instanceof ParameterizedType p) {
            var raw = (Class<?>) p.getRawType();
            if (raw.isAssignableFrom(Enum.class)) {
                return Optional.of(stringEnum((Class<? extends Enum<?>>) raw));
            } else if (Map.class.isAssignableFrom(raw)) {
                var key = resolver.apply(p.getActualTypeArguments()[0]).orElse(null);
                if (key == null) return Optional.empty();
                var value = resolver.apply(p.getActualTypeArguments()[1]).orElse(null);
                if (value == null) return Optional.empty();
                return Optional.ofNullable(MapTypeInfo.make(raw, key, value));
            } else if (Collection.class.isAssignableFrom(raw)) {
                var ele = resolver.apply(p.getActualTypeArguments()[0]).orElse(null);
                if (ele == null) return Optional.empty();
                return CollectionTypeInfo.make(raw, ele);
            }
            return Optional.empty();
        } else if (type instanceof GenericArrayType a) {
            var com = a.getGenericComponentType();
            return resolver.apply(com).map(x -> array(raw(com), x));
        }
        /*else if (type instanceof WildcardType w){
            return null;
        }else if (type instanceof TypeVariable<?> v){
            return null;
        }*/
        return Optional.empty();
    }


    //endregion

    //region Impl

    /**
     * instance with custom configuration
     *
     * @param typeCache     the preconfigured cache builder
     * @param typeFactories the type-info factories, null will use ServiceLoader instead.
     * @param debug         debug switch.
     */
    public BaseCodec(Caffeine<Object, Object> typeCache, @Nullable List<TypeInfoFactory> typeFactories, boolean debug) {
        this.typeCache = typeCache.build(this::load);
        this.typeFactories = typeFactories == null ? ServiceLoader.load(TypeInfoFactory.class, this.getClass().getClassLoader())
                .stream()
                .map(ServiceLoader.Provider::get)
                .toList() : typeFactories;
        this.debug = debug;
        debugFlag.set(debug);
    }


    /**
     * instance with default configuration from system properties
     */
    public BaseCodec() {
        this.typeCache = Caffeine
                .from(Optional.ofNullable(System.getProperty("codec.cache")).orElse("expireAfterAccess=1h,softValues"))
                .build(this::load);
        this.debug = System.getProperty("codec.debug") != null || ResourceLeakDetector.isEnabled();
        this.typeFactories = ServiceLoader.load(TypeInfoFactory.class, this.getClass().getClassLoader())
                .stream()
                .map(ServiceLoader.Provider::get)
                .toList();
        debugFlag.set(debug);
    }

    public void initialize(Object value) {
        this.typeFactories.forEach(f -> {
            if (f instanceof TypeInfoFactory.Initialize init) init.initialize(value);
        });
    }


    protected final LoadingCache<Type, TypeInfo<?>> typeCache;
    protected final List<TypeInfoFactory> typeFactories;
    protected final boolean debug;

    @SuppressWarnings("unchecked")
    protected TypeInfo<?> load(Type type) {
        if (type instanceof Class<?> cls) {
            var c = simpleClassFactory(cls);
            if (c != null) return c;
        }
        return typeFactories.stream()
                .map(x -> x.resolve(type))
                .filter(Objects::nonNull)
                .findFirst()
                .or(() -> (Optional<TypeInfo<Object>>) (Optional<?>) genericFactory(type, t -> this.find(t).map(x -> x)))
                .orElse(null);
    }


    @SuppressWarnings("unchecked")
    protected <T> Optional<TypeInfo<T>> find(Type type) {
        if (type instanceof TypeRef<?> ref) type = ref.getType();
        return Optional.ofNullable((TypeInfo<T>) typeCache.get(type));
    }


    @Override
    public ByteBuf encode(ByteBuf buf, Object value) {
        if (debug) ReferenceCountUtil.touch(buf);
        if (value instanceof Serializer ser) {
            ser.write(buf);
            return buf;
        } else if (value instanceof Reference ref) {
            ref.identifier().write(buf);
            return buf;
        }
        find(value instanceof Typed t ? t.type()
                : value.getClass()).orElseThrow(() -> new NoSuchElementException("missing TypeInfo of " + value))
                .write(buf, value);
        return buf;
    }

    @Override
    public <T> ByteBuf encode(ByteBuf buf, T value, TypeInfo<? super T> info) {
        info.write(buf, value);
        return buf;
    }

    @Override
    public <T> T decode(ByteBuf buf, TypeInfo<T> type) {
        return type.read(buf);
    }


    @Override
    public <T> TypeInfo<T> typeInfo(Type type) {
        return this.<T>find(type).orElse(null);
    }
    //endregion


}
