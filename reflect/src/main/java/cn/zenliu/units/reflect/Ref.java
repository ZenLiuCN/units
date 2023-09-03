package cn.zenliu.units.reflect;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.UtilityClass;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.*;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ref port from other project
 *
 * @author Zen.Liu
 * @since 2023-07-14
 */
@SuppressWarnings({"unchecked", "unused"})
public interface Ref<E> {
    E element();

    //region Lazy
    final class Lazy<T> {
        private volatile T v;
        private volatile Supplier<T> s;

        public T get() {
            if (s != null) synchronized (this) {
                if (v != null) return v;
                v = s.get();
                s = null;
            }
            return v;
        }

        public Lazy(Supplier<T> s) {
            this.s = s;
        }

    }

    final class LazyInt32 {
        private volatile int v;
        private volatile IntSupplier s;

        public int get() {
            if (s != null) synchronized (this) {
                if (s == null) return v;
                v = s.getAsInt();
                s = null;
            }
            return v;
        }

        public LazyInt32(IntSupplier s) {
            this.s = s;
        }

        //@formatter:off
        public boolean eq(int v) {
            return this.get() == v;
        }

        public boolean ne(int v) {
            return this.get() != v;
        }

        public boolean gt(int v) {
            return this.get() > v;
        }

        public boolean lt(int v) {
            return this.get() < v;
        }

        public boolean ge(int v) {
            return this.get() >= v;
        }

        public boolean le(int v) {
            return this.get() <= v;
        }
        //@formatter:on

    }

    final class LazyInt64 {
        private volatile long v;
        private volatile LongSupplier s;

        public long get() {
            if (s != null) synchronized (this) {
                if (s == null) return v;
                v = s.getAsLong();
                s = null;
            }
            return v;
        }

        public LazyInt64(LongSupplier s) {
            this.s = s;
        }

        //@formatter:off
        public boolean eq(long v) {
            return this.get() == v;
        }

        public boolean ne(long v) {
            return this.get() != v;
        }

        public boolean gt(long v) {
            return this.get() > v;
        }

        public boolean lt(long v) {
            return this.get() < v;
        }

        public boolean ge(long v) {
            return this.get() >= v;
        }

        public boolean le(long v) {
            return this.get() <= v;
        }
        //@formatter:on

    }

    final class LazyBool {
        private volatile boolean v;
        private volatile BooleanSupplier s;

        public boolean get() {
            if (s != null) synchronized (this) {
                if (s == null) return v;
                v = s.getAsBoolean();
                s = null;
            }
            return v;
        }

        public LazyBool(BooleanSupplier s) {
            this.s = s;
        }


    }

    static LazyInt32 int32(IntSupplier s) {
        return new LazyInt32(s);
    }

    static LazyInt64 int64(LongSupplier s) {
        return new LazyInt64(s);
    }

    static LazyBool bool(BooleanSupplier s) {
        return new LazyBool(s);
    }

    static <T> Lazy<T> lazy(Supplier<T> s) {
        return new Lazy<>(s);
    }

    //endregion

    @UtilityClass
    final class $ {
        @Getter
        @Accessors(fluent = true)
        @AllArgsConstructor(staticName = "of")
        final static class Pair<T> {
            final Object value;
            final T element;
        }

        private static final long offset;
        public static final int version;
        public static final Map<Class<?>, Class<?>> BoxType;
        public static final Map<Class<?>, Class<?>> UnboxType;

        static class UnsafeAccess {
            public static final boolean SUPPORTS_GET_AND_SET_REF = hasGetAndSetSupport();
            public static final boolean SUPPORTS_GET_AND_ADD_LONG = hasGetAndAddLongSupport();
            public static final sun.misc.Unsafe UNSAFE = getUnsafe();

            public UnsafeAccess() {
            }

            @SuppressWarnings("RedundantCast")
            private static sun.misc.Unsafe getUnsafe() {
                sun.misc.Unsafe instance;
                try {
                    Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
                    field.setAccessible(true);
                    instance = (sun.misc.Unsafe) field.get((Object) null);
                } catch (Exception var4) {
                    try {
                        Constructor<sun.misc.Unsafe> c = sun.misc.Unsafe.class.getDeclaredConstructor();
                        c.setAccessible(true);
                        instance = (sun.misc.Unsafe) c.newInstance();
                    } catch (Exception var3) {
                        throw new RuntimeException(var3);
                    }
                }

                return instance;
            }

            private static boolean hasGetAndSetSupport() {
                try {
                    sun.misc.Unsafe.class.getMethod("getAndSetObject", Object.class, Long.TYPE, Object.class);
                    return true;
                } catch (Exception var1) {
                    return false;
                }
            }

            private static boolean hasGetAndAddLongSupport() {
                try {
                    sun.misc.Unsafe.class.getMethod("getAndAddLong", Object.class, Long.TYPE, Long.TYPE);
                    return true;
                } catch (Exception var1) {
                    return false;
                }
            }

            public static long fieldOffset(Class<?> clz, String fieldName) throws RuntimeException {
                try {
                    return UNSAFE.objectFieldOffset(clz.getDeclaredField(fieldName));
                } catch (NoSuchFieldException var3) {
                    throw new RuntimeException(var3);
                }
            }
        }

        static {
            class AccessibleObjectLayout {
                static final private String ACCESS_PERMISSION = "";
                boolean override;
            }
            offset = UnsafeAccess.fieldOffset(AccessibleObjectLayout.class, "override");
            var v = System.getProperty("java.version");
            if (v.startsWith("1."))
                version = Integer.parseInt(v.substring(2, 3));
            else
                version = Integer.parseInt(v.substring(0, v.indexOf(".")));

            {
                UnboxType = new HashMap<Class<?>, Class<?>>() {{
                    put(Void.class, Void.TYPE);
                    put(Boolean.class, Boolean.TYPE);
                    put(Integer.class, Integer.TYPE);
                    put(Short.class, Short.TYPE);
                    put(Byte.class, Byte.TYPE);
                    put(Long.class, Long.TYPE);
                    put(Character.class, Character.TYPE);
                    put(Float.class, Float.TYPE);
                    put(Double.class, Double.TYPE);
                }};
            }
            {
                BoxType = new HashMap<Class<?>, Class<?>>() {{
                    put(Void.class, Void.TYPE);
                    put(Boolean.TYPE, Boolean.class);
                    put(Integer.TYPE, Integer.class);
                    put(Short.TYPE, Short.class);
                    put(Byte.TYPE, Byte.class);
                    put(Long.TYPE, Long.class);
                    put(Character.TYPE, Character.class);
                    put(Float.TYPE, Float.class);
                    put(Double.TYPE, Double.class);
                }};
            }

        }

        /**
         * @param c AccessibleObject
         * @return accessible type
         */
        public static <T extends AccessibleObject> T access(T c) {
            try {
                if (c == null) return null;
                c.setAccessible(true);
                return c;
            } catch (Exception e) {
                UnsafeAccess.UNSAFE.putBooleanVolatile(c, offset, true);
                return c;
            }
        }


        @SneakyThrows
        static Object invoke(Method m, Object self, Object... param) {
            return m.invoke(self, param);
        }

        @SneakyThrows
        static Object invoke(MethodHandle m, Object self, Object... param) {
            return m.bindTo(self).invokeWithArguments(param);
        }

        @SneakyThrows
        static Class<?> forName(String fqn) {
            return Class.forName(fqn);
        }

        @SneakyThrows
        static Method declared(Class<?> type, String name, Class<?>... param) {
            return type.getDeclaredMethod(name, param);
        }

        @SneakyThrows
        static Field declaredField(Class<?> type, String name) {
            return type.getDeclaredField(name);
        }

        @SneakyThrows
        static Method declaredMethod0(Class<?> type, String name, Class<?>... parameters) {
            for (var f : Class$getDeclaredMethods0.get().apply(type)) {
                if (f.getName().equals(name) && Arrays.equals(f.getParameterTypes(), parameters)) {
                    return access(f);
                }
            }
            throw new NoSuchMethodException(type.toString() + "#" + name + "" + Arrays.toString(parameters));
        }

        @SneakyThrows
        static Field declaredField0(Class<?> type, String name) {
            for (var f : Class$getDeclaredFields0.get().apply(type)) {
                if (f.getName().equals(name)) {
                    return access(f);
                }
            }
            throw new NoSuchFieldException(type.toString() + "#" + name);
        }

        /**
         * @param type  the class
         * @param param constructor parameters
         * @return the find Constructor, or throw error
         */
        @SneakyThrows
        public static Constructor<?> declared(Class<?> type, Class<?>... param) {
            return type.getDeclaredConstructor(param);
        }

        @SuppressWarnings("SpellCheckingInspection")
        @SneakyThrows
        public static MethodHandle unreflect(MethodHandles.Lookup lookup, Method m) {
            return lookup.unreflect(m);
        }

        @SuppressWarnings("SpellCheckingInspection")
        @SneakyThrows
        public static MethodHandle unreflect(Method m) {
            return lookup.unreflect(m);
        }


        @SuppressWarnings("rawtypes")
        @SneakyThrows
        public static <T> T instance(Constructor constructor, Object... args) {
            return (T) constructor.newInstance(args);
        }

        Lazy<Function<Class<?>, MethodHandles.Lookup>> Lookup$Constructor = lazy(() -> {
            var m = access(
                    version < 14 ? declared(MethodHandles.Lookup.class, Class.class, int.class)
                            //checked in OpenJDK repository changed in
                            // https://github.com/openjdk/jdk16/releases/tag/jdk-14-ga
                            : declared(MethodHandles.Lookup.class, Class.class, Class.class, int.class)
            );
            Objects.requireNonNull(m);
            var mode = (
                    Modifier.PUBLIC
                    | Modifier.PRIVATE
                    | Modifier.PROTECTED
                    | Modifier.STATIC //PACKAGE
                    | (version >= (9) ? Modifier.STATIC << 1 : 0)// MODULE 9+
                    | (version >= (9) ? Modifier.STATIC << 2 : 0) //UNCONDITIONAL 9+
                    | (version >= (16) ? Modifier.STATIC << 3 : 0) //ORIGINAL 16+
            );
            return x -> (MethodHandles.Lookup) instance(m, x, null, mode);
        });
        MethodHandles.Lookup lookup = Lookup$Constructor.get().apply(Ref.class);
        //region 9+
        Lazy<Function<Class<?>, Object>> Class$getModule = lazy(() -> {
            if (version <= 8) return x -> null;
            var m = Objects.requireNonNull(access(declared(Class.class, "getModule")));
            var h = unreflect(m);
            return x -> invoke(h, x);
        });

        Lazy<BiConsumer<String, Object>> Module$implAddExportsOrOpens = lazy(() -> {
            if (version <= (8)) return (a, b) -> {
            };
            var cls = forName("java.lang.Module");
//            var m = declared(cls, "implAddExportsOrOpens", void.class, String.class, cls, boolean.class, boolean.class);
            var m = declaredMethod0(cls, "implAddExportsOrOpens", String.class, cls, boolean.class, boolean.class);
//            var everyone = declaredField(cls, "EVERYONE_MODULE");
            var everyone = getter(declaredField0(cls, "EVERYONE_MODULE")).invoke();
            var h = unreflect(m);
            return (pn, mod) -> invoke(h, mod, pn, everyone, true, true);
        });

        Lazy<Predicate<Object>> Module$isNamed = lazy(() -> {
            if (version <= (8)) return x -> false;
            var m = declared(forName("java.lang.Module"), "isNamed", boolean.class);
            var h = unreflect(m);
            return x -> (boolean) invoke(h, x);
        });
        public static final LazyBool modular = bool(() -> {
            if ($.version <= 8) return false;
            return Module$isNamed.get().test(Class$getModule.get().apply(Ref.class));
        });
        //endregion
        //region 12+
        Lazy<UnaryOperator<Field>> Field$copy = lazy(() -> {
            var copy = access(declared(Field.class, "copy"));
            assert copy != null;
            var h = unreflect(copy);
            return x -> access((Field) invoke(h, x));
        });
        Lazy<UnaryOperator<Method>> Method$copy = lazy(() -> {
            var copy = access(declared(Method.class, "copy"));
            var h = unreflect(copy);
            return x -> access((Method) invoke(h, x));
        });
        Lazy<UnaryOperator<Constructor<?>>> Constructor$Copy = lazy(() -> {
            var copy = access(declared(Constructor.class, "copy"));
            var h = unreflect(copy);
            return x -> access((Constructor<?>) invoke(h, x));
        });
        Lazy<Function<Class<?>, Field[]>> Class$getDeclaredFields0 = lazy(() -> {
            var m = access(declared(Class.class, "getDeclaredFields0", boolean.class));
            var h = unreflect(m);
            var copy = Field$copy.get();
            return x -> {
                var f = (Field[]) invoke(h, x, false);
                for (int i = 0; i < f.length; i++) {
                    f[i] = copy.apply(f[i]);
                }
                return f;
            };
        });
        Lazy<Function<Class<?>, Method[]>> Class$getDeclaredMethods0 = lazy(() -> {
            var m = access(declared(Class.class, "getDeclaredMethods0", boolean.class));
            var h = unreflect(m);
            var copy = Method$copy.get();
            return x -> {
                var f = (Method[]) invoke(h, x, false);
                for (int i = 0; i < f.length; i++) {
                    f[i] = copy.apply(f[i]);
                }
                return f;
            };
        });
        Lazy<Function<Class<?>, Class<?>[]>> Class$getDeclaredClasses0 = lazy(() -> {
            var m = access(declared(Class.class, "getDeclaredClasses0"));
            var h = unreflect(m);
            return x -> {
                try {
                    return (Class<?>[]) h.bindTo(x).invoke();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            };
        });
        Lazy<Function<Class<?>, Constructor<?>[]>> Class$getDeclaredConstructors0 = lazy(() -> {
            var m = access(declared(Class.class, "getDeclaredConstructors0", boolean.class));
            var h = unreflect(m);
            var copy = Constructor$Copy.get();
            return x -> {
                var f = (Constructor<?>[]) invoke(h, x, false);
                for (int i = 0; i < f.length; i++) {
                    f[i] = copy.apply(f[i]);
                }
                return f;
            };
        });

        //endregion

        /**
         * open module for everyone
         *
         * @param target target class in module
         * @param pn     package names
         */
        public static void openModules(Class<?> target, String... pn) {
            if (version <= 8) return;
            var module = Class$getModule.get().apply(target);
            for (String s : pn) {
                Module$implAddExportsOrOpens.get().accept(s, module);
            }
        }

        //region Caches
        static final Cache<String, Class<?>> classes = Caffeine.newBuilder()
                .initialCapacity(32)
                .maximumSize(512)
                .weakValues()
                .expireAfterAccess(Duration.ofSeconds(60))
                .build();
        static final LoadingCache<Class<?>, Method[]> methods = Caffeine.newBuilder()
                .initialCapacity(32)
                .maximumSize(512)
                .weakKeys()
                .expireAfterAccess(Duration.ofSeconds(60))
                .build($::findMethods);
        static final LoadingCache<Class<?>, Field[]> fields = Caffeine.newBuilder()
                .initialCapacity(32)
                .maximumSize(512)
                .weakKeys()
                .expireAfterAccess(Duration.ofSeconds(60))
                .build($::findFields);
        static final LoadingCache<Class<?>, Constructor<?>[]> constructors = Caffeine.newBuilder()
                .initialCapacity(32)
                .maximumSize(512)
                .weakKeys()
                .expireAfterAccess(Duration.ofSeconds(60))
                .build($::findConstructors);
        //endregion

        //region Finders
        static Method[] findMethods(Class<?> type) {
            if (version >= 12) {
                return Class$getDeclaredMethods0.get().apply(type);
            }
            return type.getDeclaredMethods();
        }

        static Field[] findFields(Class<?> type) {
            if (version >= 12) {
                return Class$getDeclaredFields0.get().apply(type);
            }
            return type.getDeclaredFields();
        }

        static Constructor<?>[] findConstructors(Class<?> type) {
            if (version >= 12) {
                return Class$getDeclaredConstructors0.get().apply(type);
            }
            return type.getDeclaredConstructors();
        }

        static Field find(Class<?> declared, String name, Class<?> type) {
            for (var v : fields.get(declared)) {
                if (v.getName().equals(name)) {
                    if (type == null || type == v.getType()) return v;
                }
            }
            return null;
        }

        static Method find(Class<?> declared, String name, Class<?> returnType, Class<?>... parameters) {
            for (var v : methods.get(declared)) {
                if (v.getName().equals(name) && Arrays.equals(v.getParameterTypes(), parameters)) {
                    if (returnType == null || returnType == v.getReturnType()) return v;
                }
            }
            return null;
        }

        static Constructor<?> find(Class<?> declared, Class<?>... parameters) {
            for (var v : constructors.get(declared)) {
                if (Arrays.equals(v.getParameterTypes(), parameters)) {
                    return v;
                }
            }
            return null;
        }

        //endregion
        public static Method[] methods(Class<?> type) {
            return methods.get(type);
        }

        public static Field[] fields(Class<?> type) {
            return fields.get(type);
        }

        public static Constructor<?>[] constructors(Class<?> type) {
            return constructors.get(type);
        }

        public static Class<?>[] declaredClasses(Class<?> type) {
            return ($.version >= 9 ? $.Class$getDeclaredClasses0.get().apply(type) : type.getDeclaredClasses());
        }

        //region Delegates
        @SuppressWarnings({"unused", "SpellCheckingInspection"})
        interface KClass {
            /**
             * public final class java.lang.Class<T>
             **/
            Lazy<Type> $Type = Ref.lazy(() -> Ref.type(Class.class));
            /**
             * private transient volatile java.lang.Class$AnnotationData java.lang.Class.annotationData
             **/
            Lazy<Handle> AnnotationDataGetter = Ref.lazy(() -> $Type.get().findGetter("annotationData", Ref.type("java.lang.Class.AnnotationData").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> AnnotationDataSetter = Ref.lazy(() -> $Type.get().findSetter("annotationData", Ref.type("java.lang.Class.AnnotationData").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile sun.reflect.generics.repository.ClassRepository java.lang.Class.genericInfo
             **/
            Lazy<Handle> GenericInfoGetter = Ref.lazy(() -> $Type.get().findGetter("genericInfo", Ref.type("sun.reflect.generics.repository.ClassRepository").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> GenericInfoSetter = Ref.lazy(() -> $Type.get().findSetter("genericInfo", Ref.type("sun.reflect.generics.repository.ClassRepository").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile java.util.Map<java.lang.String, T> java.lang.Class.enumConstantDirectory
             **/
            Lazy<Handle> EnumConstantDirectoryGetter = Ref.lazy(() -> $Type.get().findGetter("enumConstantDirectory", Map.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> EnumConstantDirectorySetter = Ref.lazy(() -> $Type.get().findSetter("enumConstantDirectory", Map.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private final java.lang.Class<?> java.lang.Class.componentType
             **/
            Lazy<Handle> ComponentTypeGetter = Ref.lazy(() -> $Type.get().findGetter("componentType", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ComponentTypeSetter = Ref.lazy(() -> $Type.get().findSetter("componentType", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static final int java.lang.Class.ENUM
             **/
            Lazy<Handle.Alive> ENUMGetter = Ref.lazy(() -> $Type.get().findStaticGetter("ENUM", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> ENUMSetter = Ref.lazy(() -> $Type.get().findStaticSetter("ENUM", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile int java.lang.Class.classRedefinedCount
             **/
            Lazy<Handle> ClassRedefinedCountGetter = Ref.lazy(() -> $Type.get().findGetter("classRedefinedCount", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ClassRedefinedCountSetter = Ref.lazy(() -> $Type.get().findSetter("classRedefinedCount", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private final java.lang.ClassLoader java.lang.Class.classLoader
             **/
            Lazy<Handle> ClassLoaderGetter = Ref.lazy(() -> $Type.get().findGetter("classLoader", ClassLoader.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ClassLoaderSetter = Ref.lazy(() -> $Type.get().findSetter("classLoader", ClassLoader.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile java.lang.reflect.Constructor<T> java.lang.Class.cachedConstructor
             **/
            Lazy<Handle> CachedConstructorGetter = Ref.lazy(() -> $Type.get().findGetter("cachedConstructor", Constructor.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> CachedConstructorSetter = Ref.lazy(() -> $Type.get().findSetter("cachedConstructor", Constructor.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient java.lang.Object java.lang.Class.classData
             **/
            Lazy<Handle> ClassDataGetter = Ref.lazy(() -> $Type.get().findGetter("classData", Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ClassDataSetter = Ref.lazy(() -> $Type.get().findSetter("classData", Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient java.lang.Module java.lang.Class.module
             **/
            Lazy<Handle> ModuleGetter = Ref.lazy(() -> $Type.get().findGetter("module", $Type.get().element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ModuleSetter = Ref.lazy(() -> $Type.get().findSetter("module", $Type.get().element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile sun.reflect.annotation.AnnotationType java.lang.Class.annotationType
             **/
            Lazy<Handle> AnnotationTypeGetter = Ref.lazy(() -> $Type.get().findGetter("annotationType", Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> AnnotationTypeSetter = Ref.lazy(() -> $Type.get().findSetter("annotationType", Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static final int java.lang.Class.SYNTHETIC
             **/
            Lazy<Handle.Alive> SYNTHETICGetter = Ref.lazy(() -> $Type.get().findStaticGetter("SYNTHETIC", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> SYNTHETICSetter = Ref.lazy(() -> $Type.get().findStaticSetter("SYNTHETIC", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>> java.lang.Class.reflectionData
             **/
            Lazy<Handle> ReflectionDataGetter = Ref.lazy(() -> $Type.get().findGetter("reflectionData", java.lang.ref.SoftReference.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ReflectionDataSetter = Ref.lazy(() -> $Type.get().findSetter("reflectionData", java.lang.ref.SoftReference.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * transient java.lang.ClassValue$ClassValueMap java.lang.Class.classValueMap
             **/
            Lazy<Handle> ClassValueMapGetter = Ref.lazy(() -> $Type.get().findGetter("classValueMap", Ref.type("java.lang.ClassValue.ClassValueMap").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> ClassValueMapSetter = Ref.lazy(() -> $Type.get().findSetter("classValueMap", Ref.type("java.lang.ClassValue.ClassValueMap").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static final java.io.ObjectStreamField[] java.lang.Class.serialPersistentFields
             **/
            Lazy<Handle.Alive> SerialPersistentFieldsGetter = Ref.lazy(() -> $Type.get().findStaticGetter("serialPersistentFields", Ref.type("java.io.ObjectStreamField[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> SerialPersistentFieldsSetter = Ref.lazy(() -> $Type.get().findStaticSetter("serialPersistentFields", Ref.type("java.io.ObjectStreamField[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient volatile T[] java.lang.Class.enumConstants
             **/
            Lazy<Handle> EnumConstantsGetter = Ref.lazy(() -> $Type.get().findGetter("enumConstants", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> EnumConstantsSetter = Ref.lazy(() -> $Type.get().findSetter("enumConstants", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static final int java.lang.Class.ANNOTATION
             **/
            Lazy<Handle.Alive> ANNOTATIONGetter = Ref.lazy(() -> $Type.get().findStaticGetter("ANNOTATION", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> ANNOTATIONSetter = Ref.lazy(() -> $Type.get().findStaticSetter("ANNOTATION", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient java.lang.String java.lang.Class.name
             **/
            Lazy<Handle> NameGetter = Ref.lazy(() -> $Type.get().findGetter("name", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> NameSetter = Ref.lazy(() -> $Type.get().findSetter("name", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static jdk.internal.reflect.ReflectionFactory java.lang.Class.reflectionFactory
             **/
            Lazy<Handle.Alive> ReflectionFactoryGetter = Ref.lazy(() -> $Type.get().findStaticGetter("reflectionFactory", Ref.type("jdk.internal.reflect.ReflectionFactory").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> ReflectionFactorySetter = Ref.lazy(() -> $Type.get().findStaticSetter("reflectionFactory", Ref.type("jdk.internal.reflect.ReflectionFactory").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private transient java.lang.String java.lang.Class.packageName
             **/
            Lazy<Handle> PackageNameGetter = Ref.lazy(() -> $Type.get().findGetter("packageName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle> PackageNameSetter = Ref.lazy(() -> $Type.get().findSetter("packageName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static java.security.ProtectionDomain java.lang.Class.allPermDomain
             **/
            Lazy<Handle.Alive> AllPermDomainGetter = Ref.lazy(() -> $Type.get().findStaticGetter("allPermDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> AllPermDomainSetter = Ref.lazy(() -> $Type.get().findStaticSetter("allPermDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static final java.lang.Class<?>[] java.lang.Class.EMPTY_CLASS_ARRAY
             **/
            Lazy<Handle.Alive> EMPTY_CLASS_ARRAYGetter = Ref.lazy(() -> $Type.get().findStaticGetter("EMPTY_CLASS_ARRAY", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            Lazy<Handle.Alive> EMPTY_CLASS_ARRAYSetter = Ref.lazy(() -> $Type.get().findStaticSetter("EMPTY_CLASS_ARRAY", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Module java.lang.Class.getModule()
             **/
            Lazy<Handle> GetModule = Ref.lazy(() -> $Type.get().handle("getModule", $Type.get().element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isSealed()
             **/
            Lazy<Handle> IsSealed = Ref.lazy(() -> $Type.get().handle("isSealed", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.net.URL java.lang.Class.getResource(java.lang.String)
             **/
            Lazy<Handle> GetResource = Ref.lazy(() -> $Type.get().handle("getResource", java.net.URL.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private boolean java.lang.Class.isLocalOrAnonymousClass()
             **/
            Lazy<Handle> IsLocalOrAnonymousClass = Ref.lazy(() -> $Type.get().handle("isLocalOrAnonymousClass", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isLocalClass()
             **/
            Lazy<Handle> IsLocalClass = Ref.lazy(() -> $Type.get().handle("isLocalClass", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isSynthetic()
             **/
            Lazy<Handle> IsSynthetic = Ref.lazy(() -> $Type.get().handle("isSynthetic", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.getCanonicalName()
             **/
            Lazy<Handle> GetCanonicalName = Ref.lazy(() -> $Type.get().handle("getCanonicalName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Method java.lang.Class.getMethod(java.lang.String,java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
             **/
            Lazy<Handle> GetMethod = Ref.lazy(() -> $Type.get().handle("getMethod", Method.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Method[] java.lang.Class.privateGetDeclaredMethods(boolean)
             **/
            Lazy<Handle> PrivateGetDeclaredMethods = Ref.lazy(() -> $Type.get().handle("privateGetDeclaredMethods", Ref.type("java.lang.reflect.Method[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * java.util.List<java.lang.reflect.Method> java.lang.Class.getDeclaredPublicMethods(java.lang.String,java.lang.Class<?>...)
             **/
            Lazy<Handle> GetDeclaredPublicMethods = Ref.lazy(() -> $Type.get().handle("getDeclaredPublicMethods", List.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Field[] java.lang.Class.getDeclaredFields() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredFields = Ref.lazy(() -> $Type.get().handle("getDeclaredFields", Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.reflect.Constructor<T>[] java.lang.Class.getDeclaredConstructors0(boolean)
             **/
            Lazy<Handle> GetDeclaredConstructors0 = Ref.lazy(() -> $Type.get().handle("getDeclaredConstructors0", Ref.type("java.lang.reflect.Constructor[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public T java.lang.Class.cast(java.lang.Object)
             **/
            Lazy<Handle> Cast = Ref.lazy(() -> $Type.get().handle("cast", Object.class, Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native boolean java.lang.Class.isInstance(java.lang.Object)
             **/
            Lazy<Handle> IsInstance = Ref.lazy(() -> $Type.get().handle("isInstance", boolean.class, Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private boolean java.lang.Class.isDirectSubType(java.lang.Class<?>)
             **/
            Lazy<Handle> IsDirectSubType = Ref.lazy(() -> $Type.get().handle("isDirectSubType", boolean.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Method java.lang.Class.getEnclosingMethod() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetEnclosingMethod = Ref.lazy(() -> $Type.get().handle("getEnclosingMethod", Method.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native java.lang.Object[] java.lang.Class.getSigners()
             **/
            Lazy<Handle> GetSigners = Ref.lazy(() -> $Type.get().handle("getSigners", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Constructor<T> java.lang.Class.getConstructor0(java.lang.Class<?>[],int) throws java.lang.NoSuchMethodException
             **/
            Lazy<Handle> GetConstructor0 = Ref.lazy(() -> $Type.get().handle("getConstructor0", Constructor.class, Ref.type("java.lang.Class[]").element(), int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Field[] java.lang.Class.privateGetPublicFields()
             **/
            Lazy<Handle> PrivateGetPublicFields = Ref.lazy(() -> $Type.get().handle("privateGetPublicFields", Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native boolean java.lang.Class.isInterface()
             **/
            Lazy<Handle> IsInterface = Ref.lazy(() -> $Type.get().handle("isInterface", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.invoke.TypeDescriptor$OfField java.lang.Class.arrayType()
             **/
            Lazy<Handle> ArrayType = Ref.lazy(() -> $Type.get().handle("arrayType", Ref.type("java.lang.invoke.TypeDescriptor.OfField").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?> java.lang.Class.arrayType()
             **/
            Lazy<Handle> ArrayType1 = Ref.lazy(() -> $Type.get().handle("arrayType", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static java.lang.Class<?> java.lang.Class.toClass(java.lang.reflect.Type)
             **/
            Lazy<Handle.Alive> ToClass = Ref.lazy(() -> $Type.get().findStatic("toClass", Class.class, java.lang.reflect.Type.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private boolean java.lang.Class.hasEnclosingMethodInfo()
             **/
            Lazy<Handle> HasEnclosingMethodInfo = Ref.lazy(() -> $Type.get().handle("hasEnclosingMethodInfo", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * java.security.ProtectionDomain java.lang.Class.protectionDomain()
             **/
            Lazy<Handle> ProtectionDomain = Ref.lazy(() -> $Type.get().handle("protectionDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public <U> java.lang.Class<? extends U> java.lang.Class.asSubclass(java.lang.Class<U>)
             **/
            Lazy<Handle> AsSubclass = Ref.lazy(() -> $Type.get().handle("asSubclass", Class.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Field java.lang.Class.getField(java.lang.String) throws java.lang.NoSuchFieldException,java.lang.SecurityException
             **/
            Lazy<Handle> GetField = Ref.lazy(() -> $Type.get().handle("getField", Field.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.descriptorString()
             **/
            Lazy<Handle> DescriptorString = Ref.lazy(() -> $Type.get().handle("descriptorString", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Constructor<T>[] java.lang.Class.privateGetDeclaredConstructors(boolean)
             **/
            Lazy<Handle> PrivateGetDeclaredConstructors = Ref.lazy(() -> $Type.get().handle("privateGetDeclaredConstructors", Ref.type("java.lang.reflect.Constructor[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Method[] java.lang.Class.privateGetPublicMethods()
             **/
            Lazy<Handle> PrivateGetPublicMethods = Ref.lazy(() -> $Type.get().handle("privateGetPublicMethods", Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static native java.lang.Class<?> java.lang.Class.forName0(java.lang.String,boolean,java.lang.ClassLoader,java.lang.Class<?>) throws java.lang.ClassNotFoundException
             **/
            Lazy<Handle.Alive> ForName0 = Ref.lazy(() -> $Type.get().findStatic("forName0", Class.class, String.class, boolean.class, ClassLoader.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private boolean java.lang.Class.isTopLevelClass()
             **/
            Lazy<Handle> IsTopLevelClass = Ref.lazy(() -> $Type.get().handle("isTopLevelClass", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class$ReflectionData<T> java.lang.Class.newReflectionData(java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>>,int)
             **/
            Lazy<Handle> NewReflectionData = Ref.lazy(() -> $Type.get().handle("newReflectionData", Ref.type("java.lang.Class.ReflectionData").element(), java.lang.ref.SoftReference.class, int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private boolean java.lang.Class.isOpenToCaller(java.lang.String,java.lang.Class<?>)
             **/
            Lazy<Handle> IsOpenToCaller = Ref.lazy(() -> $Type.get().handle("isOpenToCaller", boolean.class, String.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.reflect.Method[] java.lang.Class.getDeclaredMethods0(boolean)
             **/
            Lazy<Handle> GetDeclaredMethods0 = Ref.lazy(() -> $Type.get().handle("getDeclaredMethods0", Ref.type("java.lang.reflect.Method[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.RecordComponent[] java.lang.Class.getRecordComponents()
             **/
            Lazy<Handle> GetRecordComponents = Ref.lazy(() -> $Type.get().handle("getRecordComponents", Ref.type("java.lang.reflect.RecordComponent[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?> java.lang.Class.getComponentType()
             **/
            Lazy<Handle> GetComponentType = Ref.lazy(() -> $Type.get().handle("getComponentType", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native boolean java.lang.Class.isArray()
             **/
            Lazy<Handle> IsArray = Ref.lazy(() -> $Type.get().handle("isArray", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native boolean java.lang.Class.isPrimitive()
             **/
            Lazy<Handle> IsPrimitive = Ref.lazy(() -> $Type.get().handle("isPrimitive", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isAnnotation()
             **/
            Lazy<Handle> IsAnnotation = Ref.lazy(() -> $Type.get().handle("isAnnotation", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Constructor<?>[] java.lang.Class.getDeclaredConstructors() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredConstructors = Ref.lazy(() -> $Type.get().handle("getDeclaredConstructors", Ref.type("java.lang.reflect.Constructor[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation>)
             **/
            Lazy<Handle> IsAnnotationPresent = Ref.lazy(() -> $Type.get().handle("isAnnotationPresent", boolean.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * sun.reflect.annotation.AnnotationType java.lang.Class.getAnnotationType()
             **/
            Lazy<Handle> GetAnnotationType = Ref.lazy(() -> $Type.get().handle("getAnnotationType", Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static native void java.lang.Class.registerNatives()
             **/
            Lazy<Handle.Alive> RegisterNatives = Ref.lazy(() -> $Type.get().findStatic("registerNatives", void.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class$ReflectionData<T> java.lang.Class.reflectionData()
             **/
            Lazy<Handle> ReflectionData = Ref.lazy(() -> $Type.get().handle("reflectionData", Ref.type("java.lang.Class.ReflectionData").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
             **/
            Lazy<Handle> IsAssignableFrom = Ref.lazy(() -> $Type.get().handle("isAssignableFrom", boolean.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Method[] java.lang.Class.getDeclaredMethods() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredMethods = Ref.lazy(() -> $Type.get().handle("getDeclaredMethods", Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?> java.lang.Class.getDeclaringClass() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaringClass = Ref.lazy(() -> $Type.get().handle("getDeclaringClass", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.String java.lang.Class.getCanonicalName0()
             **/
            Lazy<Handle> GetCanonicalName0 = Ref.lazy(() -> $Type.get().handle("getCanonicalName0", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.String java.lang.Class.getSimpleBinaryName()
             **/
            Lazy<Handle> GetSimpleBinaryName = Ref.lazy(() -> $Type.get().handle("getSimpleBinaryName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.toGenericString()
             **/
            Lazy<Handle> ToGenericString = Ref.lazy(() -> $Type.get().handle("toGenericString", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static java.lang.reflect.Field[] java.lang.Class.copyFields(java.lang.reflect.Field[])
             **/
            Lazy<Handle.Alive> CopyFields = Ref.lazy(() -> $Type.get().findStatic("copyFields", Ref.type("java.lang.reflect.Field[]").element(), Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?>[] java.lang.Class.getClasses()
             **/
            Lazy<Handle> GetClasses = Ref.lazy(() -> $Type.get().handle("getClasses", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * java.lang.Object java.lang.Class.getClassData()
             **/
            Lazy<Handle> GetClassData = Ref.lazy(() -> $Type.get().handle("getClassData", Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class$AnnotationData java.lang.Class.annotationData()
             **/
            Lazy<Handle> AnnotationData = Ref.lazy(() -> $Type.get().handle("annotationData", Ref.type("java.lang.Class.AnnotationData").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.String java.lang.Class.methodToString(java.lang.String,java.lang.Class<?>[])
             **/
            Lazy<Handle> MethodToString = Ref.lazy(() -> $Type.get().handle("methodToString", String.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.invoke.TypeDescriptor$OfField java.lang.Class.componentType()
             **/
            Lazy<Handle> ComponentType = Ref.lazy(() -> $Type.get().handle("componentType", type("java.lang.invoke.TypeDescriptor.OfField").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?> java.lang.Class.componentType()
             **/
            Lazy<Handle> ComponentType1 = Ref.lazy(() -> $Type.get().handle("componentType", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public static java.lang.Class<?> java.lang.Class.forName(java.lang.String) throws java.lang.ClassNotFoundException
             **/
            Lazy<Handle.Alive> ForName = Ref.lazy(() -> $Type.get().findStatic("forName", Class.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public static java.lang.Class<?> java.lang.Class.forName(java.lang.Module,java.lang.String)
             **/
            Lazy<Handle.Alive> ForName1 = Ref.lazy(() -> $Type.get().findStatic("forName", Class.class, $Type.get().element(), String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public static java.lang.Class<?> java.lang.Class.forName(java.lang.String,boolean,java.lang.ClassLoader) throws java.lang.ClassNotFoundException
             **/
            Lazy<Handle.Alive> ForName2 = Ref.lazy(() -> $Type.get().findStatic("forName", Class.class, String.class, boolean.class, ClassLoader.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Class<?>[] java.lang.Class.getPermittedSubclasses0()
             **/
            Lazy<Handle> GetPermittedSubclasses0 = Ref.lazy(() -> $Type.get().handle("getPermittedSubclasses0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isRecord()
             **/
            Lazy<Handle> IsRecord = Ref.lazy(() -> $Type.get().handle("isRecord", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Constructor<T> java.lang.Class.getDeclaredConstructor(java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredConstructor = Ref.lazy(() -> $Type.get().handle("getDeclaredConstructor", Constructor.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private sun.reflect.generics.factory.GenericsFactory java.lang.Class.getFactory()
             **/
            Lazy<Handle> GetFactory = Ref.lazy(() -> $Type.get().handle("getFactory", Ref.type("sun.reflect.generics.factory.GenericsFactory").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.annotation.Annotation[] java.lang.Class.getAnnotations()
             **/
            Lazy<Handle> GetAnnotations = Ref.lazy(() -> $Type.get().handle("getAnnotations", Ref.type("java.lang.annotation.Annotation[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Class<?> java.lang.Class.getNestHost0()
             **/
            Lazy<Handle> GetNestHost0 = Ref.lazy(() -> $Type.get().handle("getNestHost0", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Field java.lang.Class.getField0(java.lang.String)
             **/
            Lazy<Handle> GetField0 = Ref.lazy(() -> $Type.get().handle("getField0", Field.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * native void java.lang.Class.setSigners(java.lang.Object[])
             **/
            Lazy<Handle> SetSigners = Ref.lazy(() -> $Type.get().handle("setSigners", void.class, Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.String java.lang.Class.getSimpleName0()
             **/
            Lazy<Handle> GetSimpleName0 = Ref.lazy(() -> $Type.get().handle("getSimpleName0", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.security.ProtectionDomain java.lang.Class.getProtectionDomain0()
             **/
            Lazy<Handle> GetProtectionDomain0 = Ref.lazy(() -> $Type.get().handle("getProtectionDomain0", java.security.ProtectionDomain.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Class<?> java.lang.Class.getDeclaringClass0()
             **/
            Lazy<Handle> GetDeclaringClass0 = Ref.lazy(() -> $Type.get().handle("getDeclaringClass0", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public <A extends java.lang.annotation.Annotation> A[] java.lang.Class.getDeclaredAnnotationsByType(java.lang.Class<A>)
             **/
            Lazy<Handle> GetDeclaredAnnotationsByType = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotationsByType", Ref.type("java.lang.annotation.Annotation[]").element(), Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static void java.lang.Class.addAll(java.util.Collection<java.lang.reflect.Field>,java.lang.reflect.Field[])
             **/
            Lazy<Handle.Alive> AddAll = Ref.lazy(() -> $Type.get().findStatic("addAll", void.class, Collection.class, Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * java.lang.ClassLoader java.lang.Class.getClassLoader0()
             **/
            Lazy<Handle> GetClassLoader0 = Ref.lazy(() -> $Type.get().handle("getClassLoader0", ClassLoader.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.toString()
             **/
            Lazy<Handle> ToString = Ref.lazy(() -> $Type.get().handle("toString", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Type java.lang.Class.getGenericSuperclass()
             **/
            Lazy<Handle> GetGenericSuperclass = Ref.lazy(() -> $Type.get().handle("getGenericSuperclass", java.lang.reflect.Type.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * T[] java.lang.Class.getEnumConstantsShared()
             **/
            Lazy<Handle> GetEnumConstantsShared = Ref.lazy(() -> $Type.get().handle("getEnumConstantsShared", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class<?> java.lang.Class.elementType()
             **/
            Lazy<Handle> ElementType = Ref.lazy(() -> $Type.get().handle("elementType", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * native byte[] java.lang.Class.getRawAnnotations()
             **/
            Lazy<Handle> GetRawAnnotations = Ref.lazy(() -> $Type.get().handle("getRawAnnotations", byte[][].class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Class<?>[] java.lang.Class.getNestMembers0()
             **/
            Lazy<Handle> GetNestMembers0 = Ref.lazy(() -> $Type.get().handle("getNestMembers0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.getName()
             **/
            Lazy<Handle> GetName = Ref.lazy(() -> $Type.get().handle("getName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * static java.lang.String java.lang.Class.typeVarBounds(java.lang.reflect.TypeVariable<?>)
             **/
            Lazy<Handle.Alive> TypeVarBounds = Ref.lazy(() -> $Type.get().findStatic("typeVarBounds", String.class, TypeVariable.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static java.lang.reflect.Method java.lang.Class.searchMethods(java.lang.reflect.Method[],java.lang.String,java.lang.Class<?>[])
             **/
            Lazy<Handle.Alive> SearchMethods = Ref.lazy(() -> $Type.get().findStatic("searchMethods", Method.class, Ref.type("java.lang.reflect.Method[]").element(), String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static native boolean java.lang.Class.desiredAssertionStatus0(java.lang.Class<?>)
             **/
            Lazy<Handle.Alive> DesiredAssertionStatus0 = Ref.lazy(() -> $Type.get().findStatic("desiredAssertionStatus0", boolean.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native boolean java.lang.Class.isRecord0()
             **/
            Lazy<Handle> IsRecord0 = Ref.lazy(() -> $Type.get().handle("isRecord0", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.util.Optional<java.lang.constant.ClassDesc> java.lang.Class.describeConstable()
             **/
            Lazy<Handle> DescribeConstable = Ref.lazy(() -> $Type.get().handle("describeConstable", Optional.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isMemberClass()
             **/
            Lazy<Handle> IsMemberClass = Ref.lazy(() -> $Type.get().handle("isMemberClass", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.PublicMethods$MethodList java.lang.Class.getMethodsRecursive(java.lang.String,java.lang.Class<?>[],boolean)
             **/
            Lazy<Handle> GetMethodsRecursive = Ref.lazy(() -> $Type.get().handle("getMethodsRecursive", Ref.type("java.lang.PublicMethods.MethodList").element(), String.class, Ref.type("java.lang.Class[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Object[] java.lang.Class.getEnclosingMethod0()
             **/
            Lazy<Handle> GetEnclosingMethod0 = Ref.lazy(() -> $Type.get().handle("getEnclosingMethod0", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?>[] java.lang.Class.getPermittedSubclasses()
             **/
            Lazy<Handle> GetPermittedSubclasses = Ref.lazy(() -> $Type.get().handle("getPermittedSubclasses", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static <U> java.lang.reflect.Constructor<U>[] java.lang.Class.copyConstructors(java.lang.reflect.Constructor<U>[])
             **/
            Lazy<Handle.Alive> CopyConstructors = Ref.lazy(() -> $Type.get().findStatic("copyConstructors", Ref.type("java.lang.reflect.Constructor[]").element(), Ref.type("java.lang.reflect.Constructor[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.TypeVariable<java.lang.Class<T>>[] java.lang.Class.getTypeParameters()
             **/
            Lazy<Handle> GetTypeParameters = Ref.lazy(() -> $Type.get().handle("getTypeParameters", Ref.type("java.lang.reflect.TypeVariable[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static boolean java.lang.Class.arrayContentsEq(java.lang.Object[],java.lang.Object[])
             **/
            Lazy<Handle.Alive> ArrayContentsEq = Ref.lazy(() -> $Type.get().findStatic("arrayContentsEq", boolean.class, Ref.type("java.lang.Object[]").element(), Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Package java.lang.Class.getPackage()
             **/
            Lazy<Handle> GetPackage = Ref.lazy(() -> $Type.get().handle("getPackage", Package.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?> java.lang.Class.getNestHost()
             **/
            Lazy<Handle> GetNestHost = Ref.lazy(() -> $Type.get().handle("getNestHost", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?>[] java.lang.Class.getInterfaces()
             **/
            Lazy<Handle> GetInterfaces = Ref.lazy(() -> $Type.get().handle("getInterfaces", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class<?>[] java.lang.Class.getInterfaces(boolean)
             **/
            Lazy<Handle> GetInterfaces1 = Ref.lazy(() -> $Type.get().handle("getInterfaces", Ref.type("java.lang.Class[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.AnnotatedType[] java.lang.Class.getAnnotatedInterfaces()
             **/
            Lazy<Handle> GetAnnotatedInterfaces = Ref.lazy(() -> $Type.get().handle("getAnnotatedInterfaces", Ref.type("java.lang.reflect.AnnotatedType[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static java.lang.reflect.Method[] java.lang.Class.copyMethods(java.lang.reflect.Method[])
             **/
            Lazy<Handle.Alive> CopyMethods = Ref.lazy(() -> $Type.get().findStatic("copyMethods", Ref.type("java.lang.reflect.Method[]").element(), Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public T java.lang.Class.newInstance() throws java.lang.InstantiationException,java.lang.IllegalAccessException
             **/
            Lazy<Handle> NewInstance = Ref.lazy(() -> $Type.get().handle("newInstance", Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.reflect.Field[] java.lang.Class.getDeclaredFields0(boolean)
             **/
            Lazy<Handle> GetDeclaredFields0 = Ref.lazy(() -> $Type.get().handle("getDeclaredFields0", Ref.type("java.lang.reflect.Field[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static jdk.internal.reflect.ReflectionFactory java.lang.Class.getReflectionFactory()
             **/
            Lazy<Handle.Alive> GetReflectionFactory = Ref.lazy(() -> $Type.get().findStatic("getReflectionFactory", Ref.type("jdk.internal.reflect.ReflectionFactory").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Field[] java.lang.Class.getFields() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetFields = Ref.lazy(() -> $Type.get().handle("getFields", Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private sun.reflect.generics.repository.ClassRepository java.lang.Class.getGenericInfo()
             **/
            Lazy<Handle> GetGenericInfo = Ref.lazy(() -> $Type.get().handle("getGenericInfo", Ref.type("sun.reflect.generics.repository.ClassRepository").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public <A extends java.lang.annotation.Annotation> A java.lang.Class.getAnnotation(java.lang.Class<A>)
             **/
            Lazy<Handle> GetAnnotation = Ref.lazy(() -> $Type.get().handle("getAnnotation", Annotation.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public <A extends java.lang.annotation.Annotation> A java.lang.Class.getDeclaredAnnotation(java.lang.Class<A>)
             **/
            Lazy<Handle> GetDeclaredAnnotation = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotation", Annotation.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.getSimpleName()
             **/
            Lazy<Handle> GetSimpleName = Ref.lazy(() -> $Type.get().handle("getSimpleName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.getPackageName()
             **/
            Lazy<Handle> GetPackageName = Ref.lazy(() -> $Type.get().handle("getPackageName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Method[] java.lang.Class.getMethods() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetMethods = Ref.lazy(() -> $Type.get().handle("getMethods", Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /** private static void java.lang.Class.checkPackageAccessForPermittedSubclasses(java.lang.SecurityManager,java.lang.ClassLoader,java.lang.Class<?>[]) **/
            //Ref.Lazy<Ref.Handle.Alive> CheckPackageAccessForPermittedSubclasses=Ref.lazy(()->$Type.get().findStatic("checkPackageAccessForPermittedSubclasses",void.class,java.lang.SecurityManager.class,java.lang.ClassLoader.class,Ref.type("java.lang.Class[]").element()).orElseThrow(()->new IllegalStateException("No value present")));
            /**
             * public java.security.ProtectionDomain java.lang.Class.getProtectionDomain()
             **/
            Lazy<Handle> GetProtectionDomain = Ref.lazy(() -> $Type.get().handle("getProtectionDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Class<?>[] java.lang.Class.getInterfaces0()
             **/
            Lazy<Handle> GetInterfaces0 = Ref.lazy(() -> $Type.get().handle("getInterfaces0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.desiredAssertionStatus()
             **/
            Lazy<Handle> DesiredAssertionStatus = Ref.lazy(() -> $Type.get().handle("desiredAssertionStatus", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * native jdk.internal.reflect.ConstantPool java.lang.Class.getConstantPool()
             **/
            Lazy<Handle> GetConstantPool = Ref.lazy(() -> $Type.get().handle("getConstantPool", Ref.type("jdk.internal.reflect.ConstantPool").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?>[] java.lang.Class.getNestMembers()
             **/
            Lazy<Handle> GetNestMembers = Ref.lazy(() -> $Type.get().handle("getNestMembers", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> java.lang.Class.getDeclaredAnnotationMap()
             **/
            Lazy<Handle> GetDeclaredAnnotationMap = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotationMap", Map.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * static native java.lang.Class<?> java.lang.Class.getPrimitiveClass(java.lang.String)
             **/
            Lazy<Handle.Alive> GetPrimitiveClass = Ref.lazy(() -> $Type.get().findStatic("getPrimitiveClass", Class.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Type[] java.lang.Class.getGenericInterfaces()
             **/
            Lazy<Handle> GetGenericInterfaces = Ref.lazy(() -> $Type.get().handle("getGenericInterfaces", Ref.type("java.lang.reflect.Type[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.ClassLoader java.lang.Class.getClassLoader()
             **/
            Lazy<Handle> GetClassLoader = Ref.lazy(() -> $Type.get().handle("getClassLoader", ClassLoader.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.String java.lang.Class.getSimpleBinaryName0()
             **/
            Lazy<Handle> GetSimpleBinaryName0 = Ref.lazy(() -> $Type.get().handle("getSimpleBinaryName0", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.annotation.Annotation[] java.lang.Class.getDeclaredAnnotations()
             **/
            Lazy<Handle> GetDeclaredAnnotations = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotations", Ref.type("java.lang.annotation.Annotation[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * boolean java.lang.Class.casAnnotationType(sun.reflect.annotation.AnnotationType,sun.reflect.annotation.AnnotationType)
             **/
            Lazy<Handle> CasAnnotationType = Ref.lazy(() -> $Type.get().handle("casAnnotationType", boolean.class, Ref.type("sun.reflect.annotation.AnnotationType").element(), Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /** private void java.lang.Class.checkMemberAccess(java.lang.SecurityManager,int,java.lang.Class<?>,boolean) **/
            //Ref.Lazy<Ref.Handle> CheckMemberAccess=Ref.lazy(()->$Type.get().handle("checkMemberAccess",void.class,java.lang.SecurityManager.class,int.class,java.lang.Class.class,boolean.class).orElseThrow(()->new IllegalStateException("No value present")));
            /**
             * public <A extends java.lang.annotation.Annotation> A[] java.lang.Class.getAnnotationsByType(java.lang.Class<A>)
             **/
            Lazy<Handle> GetAnnotationsByType = Ref.lazy(() -> $Type.get().handle("getAnnotationsByType", Ref.type("java.lang.annotation.Annotation[]").element(), Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Constructor<?>[] java.lang.Class.getConstructors() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetConstructors = Ref.lazy(() -> $Type.get().handle("getConstructors", Ref.type("java.lang.reflect.Constructor[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Field[] java.lang.Class.privateGetDeclaredFields(boolean)
             **/
            Lazy<Handle> PrivateGetDeclaredFields = Ref.lazy(() -> $Type.get().handle("privateGetDeclaredFields", Ref.type("java.lang.reflect.Field[]").element(), boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.AnnotatedType java.lang.Class.getAnnotatedSuperclass()
             **/
            Lazy<Handle> GetAnnotatedSuperclass = Ref.lazy(() -> $Type.get().handle("getAnnotatedSuperclass", AnnotatedType.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private static java.lang.reflect.Field java.lang.Class.searchFields(java.lang.reflect.Field[],java.lang.String)
             **/
            Lazy<Handle.Alive> SearchFields = Ref.lazy(() -> $Type.get().findStatic("searchFields", Field.class, Ref.type("java.lang.reflect.Field[]").element(), String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native int java.lang.Class.getModifiers()
             **/
            Lazy<Handle> GetModifiers = Ref.lazy(() -> $Type.get().handle("getModifiers", int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.String java.lang.Class.getTypeName()
             **/
            Lazy<Handle> GetTypeName = Ref.lazy(() -> $Type.get().handle("getTypeName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Constructor<?> java.lang.Class.getEnclosingConstructor() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetEnclosingConstructor = Ref.lazy(() -> $Type.get().handle("getEnclosingConstructor", Constructor.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isNestmateOf(java.lang.Class<?>)
             **/
            Lazy<Handle> IsNestmateOf = Ref.lazy(() -> $Type.get().handle("isNestmateOf", boolean.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.reflect.RecordComponent[] java.lang.Class.getRecordComponents0()
             **/
            Lazy<Handle> GetRecordComponents0 = Ref.lazy(() -> $Type.get().handle("getRecordComponents0", Ref.type("java.lang.reflect.RecordComponent[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native java.lang.Class<? super T> java.lang.Class.getSuperclass()
             **/
            Lazy<Handle> GetSuperclass = Ref.lazy(() -> $Type.get().handle("getSuperclass", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Field java.lang.Class.getDeclaredField(java.lang.String) throws java.lang.NoSuchFieldException,java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredField = Ref.lazy(() -> $Type.get().handle("getDeclaredField", Field.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * java.util.Map<java.lang.String, T> java.lang.Class.enumConstantDirectory()
             **/
            Lazy<Handle> EnumConstantDirectory = Ref.lazy(() -> $Type.get().handle("enumConstantDirectory", Map.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.io.InputStream java.lang.Class.getResourceAsStream(java.lang.String)
             **/
            Lazy<Handle> GetResourceAsStream = Ref.lazy(() -> $Type.get().handle("getResourceAsStream", java.io.InputStream.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class$EnclosingMethodInfo java.lang.Class.getEnclosingMethodInfo()
             **/
            Lazy<Handle> GetEnclosingMethodInfo = Ref.lazy(() -> $Type.get().handle("getEnclosingMethodInfo", Ref.type("java.lang.Class.EnclosingMethodInfo").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Method java.lang.Class.getDeclaredMethod(java.lang.String,java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredMethod = Ref.lazy(() -> $Type.get().handle("getDeclaredMethod", Method.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * native byte[] java.lang.Class.getRawTypeAnnotations()
             **/
            Lazy<Handle> GetRawTypeAnnotations = Ref.lazy(() -> $Type.get().handle("getRawTypeAnnotations", byte[][].class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public boolean java.lang.Class.isEnum()
             **/
            Lazy<Handle> IsEnum = Ref.lazy(() -> $Type.get().handle("isEnum", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.String java.lang.Class.cannotCastMsg(java.lang.Object)
             **/
            Lazy<Handle> CannotCastMsg = Ref.lazy(() -> $Type.get().handle("cannotCastMsg", String.class, Object.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.reflect.Constructor<T> java.lang.Class.getConstructor(java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
             **/
            Lazy<Handle> GetConstructor = Ref.lazy(() -> $Type.get().handle("getConstructor", Constructor.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public T[] java.lang.Class.getEnumConstants()
             **/
            Lazy<Handle> GetEnumConstants = Ref.lazy(() -> $Type.get().handle("getEnumConstants", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public native boolean java.lang.Class.isHidden()
             **/
            Lazy<Handle> IsHidden = Ref.lazy(() -> $Type.get().handle("isHidden", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.String java.lang.Class.initClassName()
             **/
            Lazy<Handle> InitClassName = Ref.lazy(() -> $Type.get().handle("initClassName", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.String java.lang.Class.resolveName(java.lang.String)
             **/
            Lazy<Handle> ResolveName = Ref.lazy(() -> $Type.get().handle("resolveName", String.class, String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?>[] java.lang.Class.getDeclaredClasses() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetDeclaredClasses = Ref.lazy(() -> $Type.get().handle("getDeclaredClasses", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * static byte[] java.lang.Class.getExecutableTypeAnnotationBytes(java.lang.reflect.Executable)
             **/
            Lazy<Handle.Alive> GetExecutableTypeAnnotationBytes = Ref.lazy(() -> $Type.get().findStatic("getExecutableTypeAnnotationBytes", byte[][].class, Executable.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.String java.lang.Class.getGenericSignature0()
             **/
            Lazy<Handle> GetGenericSignature0 = Ref.lazy(() -> $Type.get().handle("getGenericSignature0", String.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private native java.lang.Class<?>[] java.lang.Class.getDeclaredClasses0()
             **/
            Lazy<Handle> GetDeclaredClasses0 = Ref.lazy(() -> $Type.get().handle("getDeclaredClasses0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /** private void java.lang.Class.checkPackageAccess(java.lang.SecurityManager,java.lang.ClassLoader,boolean) **/
            //Ref.Lazy<Ref.Handle> CheckPackageAccess=Ref.lazy(()->$Type.get().handle("checkPackageAccess",void.class,java.lang.SecurityManager.class,java.lang.ClassLoader.class,boolean.class).orElseThrow(()->new IllegalStateException("No value present")));
            /**
             * public boolean java.lang.Class.isAnonymousClass()
             **/
            Lazy<Handle> IsAnonymousClass = Ref.lazy(() -> $Type.get().handle("isAnonymousClass", boolean.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.reflect.Method java.lang.Class.getMethod0(java.lang.String,java.lang.Class<?>[])
             **/
            Lazy<Handle> GetMethod0 = Ref.lazy(() -> $Type.get().handle("getMethod0", Method.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * public java.lang.Class<?> java.lang.Class.getEnclosingClass() throws java.lang.SecurityException
             **/
            Lazy<Handle> GetEnclosingClass = Ref.lazy(() -> $Type.get().handle("getEnclosingClass", Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class$AnnotationData java.lang.Class.createAnnotationData(int)
             **/
            Lazy<Handle> CreateAnnotationData = Ref.lazy(() -> $Type.get().handle("createAnnotationData", Ref.type("java.lang.Class.AnnotationData").element(), int.class).orElseThrow(() -> new NoSuchElementException("No value present")));
            /**
             * private java.lang.Class(java.lang.ClassLoader,java.lang.Class<?>)
             **/
            Lazy<Handle.Alive> CREATE = Ref.lazy(() -> $Type.get().findConstructor(ClassLoader.class, Class.class).orElseThrow(() -> new NoSuchElementException("No value present")));
        }
        //endregion
    }

    //region QualifiedNames
    @Getter
    @Accessors(fluent = true)
    abstract class QualifiedName<T> {
        protected final String qualifiedName;

        protected QualifiedName(String qualifiedName) {
            assert qualifiedName != null && !qualifiedName.isEmpty() : "invalid qualifiedName";
            this.qualifiedName = qualifiedName;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(qualifiedName);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QualifiedName<?>)
                return Objects.equals(((QualifiedName<?>) obj).qualifiedName, qualifiedName);
            return false;
        }

        @Override
        public String toString() {
            return qualifiedName;
        }

        abstract public T find(ClassLoader cl, boolean inStack);

        abstract public T mustFind(ClassLoader cl, boolean inStack);

        public Optional<T> maybe(ClassLoader cl, boolean inStack) {
            return Optional.ofNullable(find(cl, inStack));
        }
    }

    @Getter
    @Accessors(fluent = true)
    final class QualifiedClassName extends QualifiedName<Class<?>> {
        final String name;
        final int dim;


        QualifiedClassName(String fqn) {
            super(fqn);
            var dim = 0;
            var idx = fqn.indexOf('[');
            var com = fqn;
            if (idx > 0) {
                dim = (fqn.length() - idx) / 2;
                com = fqn.substring(0, idx);
            }
            this.name = com;
            this.dim = dim;
        }

        @SuppressWarnings("removal")
        private Class<?> findInStack() {
            Class<?>[] stackTraceClasses = null;
            try {
                stackTraceClasses = new SecurityManager() {

                    public Class<?>[] classContext() {
                        return super.getClassContext();
                    }
                }.classContext();
            } catch (Error ignore) {
            }
            if (stackTraceClasses == null)
                return null;
            var history = new HashSet<ClassLoader>();
            history.add(QualifiedClassName.class.getClassLoader());
            history.add(Thread.currentThread().getContextClassLoader());
            for (var cls : stackTraceClasses) {
                var cl = cls.getClassLoader();
                if (history.contains(cl)) {
                    continue;
                }
                history.add(cl);
                var out = find(cl, false);
                if (out != null) return out;
            }
            return null;
        }

        public Class<?> find(ClassLoader cl, boolean inStack) {
            var p = Type.primitive(name);
            var cached = false;
            if (p == null) p = $.classes.getIfPresent(name);
            if (p != null) cached = true;
            if (p == null) {
                try {
                    p = Class.forName(name);
                } catch (ClassNotFoundException ignore) {
                    var tcl = Thread.currentThread().getContextClassLoader();
                    if (cl != tcl && tcl != null) return find(tcl, inStack);
                    p = inStack ? findInStack() : null;
                }
            }
            if (p != null && !cached) $.classes.put(name, p);
            if (p != null && dim > 0) p = Array.newInstance(p, new int[dim]).getClass();
            return p;
        }

        @SneakyThrows
        public Class<?> mustFind(ClassLoader cl, boolean inStack) {
            var cls = find(cl, inStack);
            if (cls == null) throw new ClassNotFoundException(qualifiedName);
            return cls;
        }

        public static QualifiedClassName of(String fqn) {
            return new QualifiedClassName(fqn);
        }
    }

    @Getter
    @Accessors(fluent = true)
    final class QualifiedMethodName extends QualifiedName<Method> {

        final QualifiedClassName declared;
        final String name;
        final QualifiedClassName[] parameterTypes;
        final QualifiedClassName returnType;


        QualifiedMethodName(String fqm) {
            super(fqm);
            var idx = fqm.indexOf('#');
            var lb = fqm.indexOf('(');
            var rb = fqm.indexOf(')');
            assert idx > 0 : "invalid " + fqm;
            assert lb > idx : "invalid " + fqm;
            assert rb > lb : "invalid " + fqm;
            declared = QualifiedClassName.of(fqm.substring(0, idx));
            name = fqm.substring(idx + 1, lb);
            var p = fqm.substring(lb + 1, rb);
            if (p.isEmpty())
                parameterTypes = new QualifiedClassName[0];
            else {
                parameterTypes = Arrays.stream(p.split(",")).map(String::trim).map(QualifiedClassName::of).toArray(QualifiedClassName[]::new);
            }
            if (fqm.length() > rb + 1) {
                returnType = QualifiedClassName.of(fqm.substring(rb + 1));
            } else {
                returnType = null;
            }
        }

        public Method find(ClassLoader cl, boolean inStack) {
            var t = declared.find(cl, inStack);
            if (t == null) return null;
            var p = Arrays.stream(parameterTypes).map(x -> x.find(cl, inStack)).toArray(Class<?>[]::new);
            var r = returnType != null ? returnType.find(cl, inStack) : null;
            var m = $.methods.get(t);
            if (m != null) {
                for (var v : m) {
                    if (v.getName().equals(name) && Arrays.equals(p, v.getParameterTypes())) {
                        if (r == null || r == v.getReturnType())
                            return $.access(v);
                    }
                }
            }
            return null;
        }

        @SneakyThrows
        public Method mustFind(ClassLoader cl, boolean inStack) {
            var ret = find(cl, inStack);
            if (ret == null) throw new NoSuchMethodException(qualifiedName);
            return ret;
        }

        public static QualifiedMethodName of(String fqm) {
            return new QualifiedMethodName(fqm);
        }
    }

    @Getter
    @Accessors(fluent = true)
    final class QualifiedConstructorName extends QualifiedName<Constructor<?>> {

        final QualifiedClassName declared;

        final QualifiedClassName[] parameterTypes;


        QualifiedConstructorName(String fqm) {
            super(fqm);
            var lb = fqm.indexOf('(');
            var rb = fqm.indexOf(')');
            assert lb > 0 : "invalid " + fqm;
            assert rb > lb : "invalid " + fqm;
            declared = QualifiedClassName.of(fqm.substring(0, lb));
            var p = fqm.substring(lb + 1, rb);
            if (p.isEmpty())
                parameterTypes = new QualifiedClassName[0];
            else {
                parameterTypes = Arrays.stream(p.split(",")).map(String::trim).map(QualifiedClassName::of).toArray(QualifiedClassName[]::new);
            }
        }

        public Constructor<?> find(ClassLoader cl, boolean inStack) {
            var t = declared.find(cl, inStack);
            if (t == null) return null;
            var p = Arrays.stream(parameterTypes).map(x -> x.find(cl, inStack)).toArray(Class<?>[]::new);
            var m = $.constructors.get(t);
            if (m != null) {
                for (var v : m) {
                    if (Arrays.equals(p, v.getParameterTypes())) {
                        return $.access(v);
                    }
                }
            }
            return null;
        }

        @SneakyThrows
        public Constructor<?> mustFind(ClassLoader cl, boolean inStack) {
            var ret = find(cl, inStack);
            if (ret == null) throw new NoSuchMethodException(qualifiedName);
            return ret;
        }

        public static QualifiedConstructorName of(String fqm) {
            return new QualifiedConstructorName(fqm);
        }
    }

    @Getter
    @Accessors(fluent = true)
    final class QualifiedFieldName extends QualifiedName<Field> {

        final QualifiedClassName declared;
        final String name;
        final QualifiedClassName type;


        QualifiedFieldName(String ffn) {
            super(ffn);
            var idx = ffn.indexOf('#');
            var cdx = ffn.indexOf(':');
            assert idx > 0 : "invalid " + ffn;
            declared = QualifiedClassName.of(ffn.substring(0, idx));
            name = ffn.substring(idx + 1, cdx == -1 ? ffn.length() : cdx);
            if (cdx != -1) {
                type = QualifiedClassName.of(ffn.substring(cdx + 1));
            } else {
                type = null;
            }
        }

        public Field find(ClassLoader cl, boolean inStack) {
            var t = declared.find(cl, inStack);
            if (t == null) return null;
            var r = type != null ? type.find(cl, inStack) : null;
            var m = $.fields.get(t);
            if (m != null) {
                for (var v : m) {
                    if (v.getName().equals(name)) {
                        if (r == null || r == v.getType())
                            return $.access(v);
                    }
                }
            }
            return null;
        }

        @SneakyThrows
        public Field mustFind(ClassLoader cl, boolean inStack) {
            var ret = find(cl, inStack);
            if (ret == null) throw new NoSuchFieldException(qualifiedName);
            return ret;
        }

        public static QualifiedFieldName of(String fqn) {
            return new QualifiedFieldName(fqn);
        }
    }
    //endregion

    //region Base Interfaces
    interface Anno<T extends AnnotatedElement> extends Ref<T> {
        default <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass) {
            return element().getAnnotationsByType(annotationClass);
        }

        default <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> annotationClass) {
            return element().getDeclaredAnnotationsByType(annotationClass);
        }

        default <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) {
            return element().getDeclaredAnnotation(annotationClass);
        }

        default boolean hasAnnotation(Class<? extends Annotation> anno) {
            return element().getDeclaredAnnotationsByType(anno).length > 0;
        }

        default Annotation[] getAnnotations() {
            return element().getAnnotations();
        }

        default Annotation[] getDeclaredAnnotations() {
            return element().getDeclaredAnnotations();
        }
    }

    interface Mem<T extends Member> extends Ref<T> {
        default int getModifiers() {
            return element().getModifiers();
        }

        default boolean isSynthetic() {
            return element().isSynthetic();
        }

        default boolean isPublic() {
            return Modifier.isPublic(getModifiers());
        }

        default boolean isPrivate() {
            return Modifier.isPrivate(getModifiers());
        }

        default boolean isProtected() {
            return Modifier.isProtected(getModifiers());
        }

        default boolean isFinal() {
            return Modifier.isFinal(getModifiers());
        }

        default boolean isStatic() {
            return Modifier.isStatic(getModifiers());
        }


        default String getName() {
            return element().getName();
        }


    }

    interface Exec<T extends Executable> extends Anno<T>, Mem<T> {
        default Type getDeclaringClass() {
            var v = element().getDeclaringClass();
            return () -> v;
        }

        default TypeVariable<?>[] getTypeParameters() {
            return element().getTypeParameters();
        }

        default boolean isVarArgs() {
            return element().isVarArgs();
        }

        default String toGenericString() {
            return element().toGenericString();
        }
    }


    interface Live<T> extends Ref<T> {
        $.Pair<T> pair();

        default Object value() {
            return pair().value();
        }

        default T element() {
            return pair().element();
        }
    }
    //endregion
    //region construct

    /**
     * wrap class to  {@link Type}
     *
     * @param t type
     * @return {@link Type}
     */

    static Type type(Class<?> t) {
        return () -> t;
    }

    /**
     * load Type from {@link  QualifiedClassName}, will throw Error on not found
     *
     * @param qcn {@link  QualifiedClassName}
     */
    static Type type(String qcn) {
        var cls = QualifiedClassName.of(qcn).mustFind(null, false);
        return () -> cls;
    }

    /**
     * load Type from {@link  QualifiedClassName}, or empty if not found
     */
    static Optional<Type> typeMaybe(String qcn) {
        return QualifiedClassName.of(qcn).maybe(null, false).map(x -> () -> x);
    }

    /**
     * load Type from {@link  QualifiedClassName}, or empty if not found
     */

    static Optional<Type> typeMaybe(String qcn, ClassLoader cl, boolean inStack) {
        return QualifiedClassName.of(qcn).maybe(cl, inStack).map(x -> () -> x);
    }

    static Type type(String qcn, ClassLoader cl) {
        var cls = QualifiedClassName.of(qcn).mustFind(cl, false);
        return () -> cls;
    }

    static Type type(String qcn, ClassLoader cl, boolean inStack) {
        var cls = QualifiedClassName.of(qcn).mustFind(cl, inStack);
        return () -> cls;
    }

    static Prop prop(Field t) {
        return () -> t;
    }

    static Prop prop(String qfn) {
        var v = QualifiedFieldName.of(qfn).mustFind(null, false);
        return () -> v;
    }

    static Prop prop(String qfn, ClassLoader cl) {
        var v = QualifiedFieldName.of(qfn).mustFind(cl, false);
        return () -> v;
    }

    static Prop prop(String qfn, ClassLoader cl, boolean inStack) {
        var v = QualifiedFieldName.of(qfn).mustFind(cl, inStack);
        return () -> v;
    }

    static Func func(Method t) {
        return () -> t;
    }

    static Func func(String qmn) {
        var v = QualifiedMethodName.of(qmn).mustFind(null, false);
        return () -> v;
    }

    static Func func(String qmn, ClassLoader cl) {
        var v = QualifiedMethodName.of(qmn).mustFind(cl, false);
        return () -> v;
    }

    static Func func(String qmn, ClassLoader cl, boolean inStack) {
        var v = QualifiedMethodName.of(qmn).mustFind(cl, inStack);
        return () -> v;
    }

    static Creator creator(Constructor<?> t) {
        return () -> t;
    }

    static Creator creator(String qcn) {
        var v = QualifiedConstructorName.of(qcn).mustFind(null, false);
        return () -> v;
    }

    static Creator creator(String qcn, ClassLoader cl) {
        var v = QualifiedConstructorName.of(qcn).mustFind(cl, false);
        return () -> v;
    }

    static Creator creator(String qcn, ClassLoader cl, boolean inStack) {
        var v = QualifiedConstructorName.of(qcn).mustFind(cl, inStack);
        return () -> v;
    }


    static Handle handle(MethodHandle h) {
        return () -> h;
    }

    @SneakyThrows
    static Handle getter(Field f) {
        var h = $.lookup.unreflectGetter(f);
        return () -> h;
    }

    @SneakyThrows
    static Handle setter(Field f) {
        var h = $.lookup.unreflectSetter(f);
        return () -> h;
    }

    @SneakyThrows
    static Handle handle(Method f) {
        var h = $.lookup.unreflect(f);
        return () -> h;
    }

    @SneakyThrows
    static Handle handle(Constructor<?> f) {
        var h = $.lookup.unreflectConstructor(f);
        return () -> h;
    }

    @SneakyThrows
    static Handle handle(Method f, Class<?> target) {
        var h = $.lookup.unreflectSpecial(f, target);
        return () -> h;
    }


    //endregion
    interface Type extends Ref<Class<?>>, Anno<Class<?>> {
        //region Utils

        static Class<?> box(Class<?> t) {
            return t.isPrimitive() ? $.BoxType.get(t) : t;
        }

        static Class<?> unbox(Class<?> t) {
            return !t.isPrimitive() ? $.UnboxType.getOrDefault(t, t) : t;
        }

        static Class<?> primitive(String t) {
            //@formatter:off
            return
                    t == null || t.isEmpty() ? null :
                            t.equals("void") ? void.class :
                                    t.equals("boolean") ? boolean.class :
                                            t.equals("byte") ? byte.class :
                                                    t.equals("char") ? char.class :
                                                            t.equals("short") ? short.class :
                                                                    t.equals("int") ? int.class :
                                                                            t.equals("long") ? long.class :
                                                                                    t.equals("float") ? float.class :
                                                                                            t.equals("double") ? double.class :
                                                                                                    null;
            //@formatter:on
        }

        static Optional<Boolean> isInstanceMaybe(Object v, String qcn) {
            if (v == null) return Optional.of(false);
            return QualifiedClassName.of(qcn).maybe(null, false).map(x -> x.isInstance(v));
        }

        static boolean isInstance(Object v, String qcn) {
            if (v == null) return false;
            var cls = QualifiedClassName.of(qcn).find(null, false);
            if (cls == null) return false;
            return cls.isInstance(v);
        }

        //endregion

        default Optional<Prop> prop(String name) {
            return Optional.ofNullable($.find(element(), name, null)).map(f -> () -> f);
        }

        default Optional<Prop> prop(String name, Class<?> type) {
            return Optional.ofNullable($.find(element(), name, type)).map(f -> () -> f);
        }

        default Stream<Prop> props() {
            return Arrays.stream($.fields(element())).map(v -> () -> v);
        }

        default Optional<Creator> creator(Class<?>... args) {
            return Optional.ofNullable($.find(element(), args)).map(f -> () -> f);
        }

        default Optional<Func> func(String name, Class<?> returnType, Class<?>... args) {
            return Optional.ofNullable($.find(element(), name, returnType, args)).map(f -> () -> f);
        }

        default Optional<Func> func(String name, Class<?>... args) {
            return Optional.ofNullable($.find(element(), name, null, args)).map(f -> () -> f);
        }

        default Stream<Func> funcs() {
            return Arrays.stream($.methods(element())).map(m -> () -> m);
        }

        default Optional<Handle> handle(String name, Class<?> returnType, Class<?>... args) {
            return Optional.ofNullable($.find(element(), name, null, args))
                    .map(Ref::handle);
        }

        default Optional<Handle> findSpecial(Class<?> caller, String name, Class<?> returnType, Class<?>... args) {
            try {
                return Optional.ofNullable($.lookup.findSpecial(element(), name, MethodType.methodType(returnType, args), caller))
                        .map(Ref::handle);
            } catch (NoSuchMethodException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle.Alive> findStatic(String name, Class<?> returnType, Class<?>... args) {
            try {
                return Optional.ofNullable($.lookup.findStatic(element(), name, MethodType.methodType(returnType, args)))
                        .map(Handle.Alive::ofStatic);
            } catch (NoSuchMethodException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle> findVirtual(String name, Class<?> returnType, Class<?>... args) {
            try {
                return Optional.ofNullable($.lookup.findVirtual(element(), name, MethodType.methodType(returnType, args)))
                        .map(Ref::handle);
            } catch (NoSuchMethodException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle.Alive> findStaticSetter(String name, Class<?> type) {
            try {
                return Optional.ofNullable($.lookup.findStaticSetter(element(), name, type))
                        .map(Handle.Alive::ofStatic);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle.Alive> findStaticGetter(String name, Class<?> type) {
            try {
                return Optional.ofNullable($.lookup.findStaticGetter(element(), name, type))
                        .map(Handle.Alive::ofStatic);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle> findGetter(String name, Class<?> type) {
            try {
                return Optional.ofNullable($.lookup.findGetter(element(), name, type))
                        .map(Ref::handle);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle> findSetter(String name, Class<?> type) {
            try {
                return Optional.ofNullable($.lookup.findSetter(element(), name, type))
                        .map(Ref::handle);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                return Optional.empty();
            }
        }

        default Optional<Handle.Alive> findConstructor(Class<?>... args) {
            try {
                return Optional.ofNullable($.lookup.findConstructor(element(), MethodType.methodType(void.class, args)))
                        .map(Handle.Alive::ofStatic);
            } catch (NoSuchMethodException | IllegalAccessException e) {
                return Optional.empty();
            }
        }
    }

    interface Prop extends Anno<Field>, Mem<Field> {
        interface Alive extends Anno<Field>, Mem<Field>, Live<Field> {
            @SneakyThrows
            default <T> T get() {
                return (T) element().get(value());
            }

            @SneakyThrows
            default Alive set(Object val) {
                element().set(value(), val);
                return this;
            }
        }

        @SuppressWarnings("unchecked")
        @SneakyThrows
        default <T> T get(Object self) {
            return (T) element().get(self);
        }

        @SneakyThrows
        default Prop set(Object self, Object val) {
            element().set(self, val);
            return this;
        }

        default Alive with(Object instance) {
            assert (isStatic() && instance == null) || (!isStatic() && instance != null) : "none static field should have none instance value";
            var p = $.Pair.of(instance, element());
            return () -> p;
        }


    }

    interface Func extends Exec<Method> {

        @SneakyThrows
        default <T> T invoke(Object self, Object... val) {
            return (T) element().invoke(self, val);
        }

        default boolean isDefault() {
            return element().isDefault();
        }

        default int getParameterCount() {
            return element().getParameterCount();
        }

        default Stream<Type> getParameterTypes() {
            return Arrays.stream(element().getParameterTypes()).map(Ref::type);
        }

        default Stream<java.lang.reflect.Type> getGenericParameterTypes() {
            return Arrays.stream(element().getGenericParameterTypes());
        }

        default Optional<Type> getReturnType() {
            return Optional.of(element().getReturnType()).filter(x -> x != Void.TYPE).map(Ref::type);
        }

        default Optional<java.lang.reflect.Type> getGenericReturnType() {
            return Optional.of(element().getGenericReturnType()).filter(x -> x != Void.TYPE);
        }

        default Type getDeclaringType() {
            return Ref.type(element().getDeclaringClass());
        }

        default Handle asHandle() {
            return handle(element());
        }

        default Alive with(Object instance) {
            assert (isStatic() && instance == null) || (!isStatic() && instance != null) : "none static method should have none instance value";
            var p = $.Pair.of(instance, element());
            return () -> p;
        }


        interface Alive extends Exec<Method>, Live<Method> {
            @SneakyThrows
            default <T> T invoke(Object... val) {
                return (T) element().invoke(value(), val);
            }
        }

    }

    interface Creator extends Exec<Constructor<?>> {


        @SuppressWarnings("unchecked")
        @SneakyThrows
        default <T> T instance(Object... args) {
            return (T) element().newInstance(args);
        }

        default Handle asHandle() {
            return handle(element());
        }
    }

    interface Handle extends Ref<MethodHandle> {


        @SneakyThrows
        default Alive bindTo(Object instance) {

            var h = element().bindTo(instance);
            return () -> h;
        }

        default boolean isVarargsCollector() {
            return element().isVarargsCollector();
        }

        @SneakyThrows
        default <T> T invoke(Object... args) {
            return (T) element().invokeWithArguments(args);
        }

        @SneakyThrows
        default <T> T invokeNormal(Object... args) {
            return (T) element().invoke(args);
        }


        interface Alive extends Handle {
            static Alive ofStatic(MethodHandle handle) {
                return () -> handle;
            }

            @SneakyThrows
            default <T> T invoke(Object... args) {
                return (T) element().invokeWithArguments(args);
            }

            @SneakyThrows
            default <T> T invokeNormal(Object... args) {
                return (T) element().invoke(args);
            }
        }
    }




    /**
     * Util to Generate Mapping Interface for Class
     */
    interface Generate {
        static Object nArrayConvert(Object array, Function<Object, Object> map) {
            var cls = array.getClass();
            if (!cls.isArray()) {
                return map.apply(cls);
            }
            var ar = (Object[]) array;
            if (ar.length == 0) return ar;
            var out = new ArrayList<>();
            for (Object o : ar) {
                var in = nArrayConvert(o, map);
                out.add(in);
            }
            return out.toArray();
        }
        //region Flags
        /**
         * use Class instead of Ref.Type;
         */
        int POS_FLAG_PREFER_CLASS = 0;
        int FLAG_PREFER_CLASS = 1 << POS_FLAG_PREFER_CLASS;
        /**
         * use MethodHandle instead of method
         */

        int POS_FLAG_PREFER_HANDLE = 1;
        int FLAG_PREFER_HANDLE = 1 << POS_FLAG_PREFER_HANDLE;

        /**
         * directly use const field value instead of field
         */
        int POS_FLAG_PREFER_CONST = 2;
        int FLAG_PREFER_CONST = 1 << POS_FLAG_PREFER_CONST;
        /**
         * use MethodHandle Getter Setter instead of field
         */
        int POS_FLAG_PREFER_FIELD_HANDLE = 3;
        int FLAG_PREFER_FIELD_HANDLE = 1 << POS_FLAG_PREFER_FIELD_HANDLE;
        /**
         * process nested classes;
         */
        int POS_FLAG_NEST_CLASSES = 4;
        int FLAG_NEST_CLASSES = 1 << POS_FLAG_NEST_CLASSES;
        /**
         * generate field ref
         */
        int POS_FLAG_REF_FIELD = 5;
        int FLAG_REF_FIELD = 1 << POS_FLAG_REF_FIELD;
        /**
         * generate field ref
         */
        int POS_FLAG_REF_METHOD = 6;
        int FLAG_REF_METHOD = 1 << POS_FLAG_REF_METHOD;
        /**
         * generate constructor ref
         */
        int POS_FLAG_REF_CONSTRUCTOR = 7;
        int FLAG_REF_CONSTRUCTOR = 1 << POS_FLAG_REF_CONSTRUCTOR;
        /**
         * generate enum names const
         */
        int POS_FLAG_REF_ENUM_CONST = 8;
        int FLAG_REF_ENUM_CONST = 1 << POS_FLAG_REF_ENUM_CONST;

        /**
         * generate proxy class interface
         */
        int POS_FLAG_GEN_CLASS_PROXY = 9;
        int FLAG_GEN_CLASS_PROXY = 1 << POS_FLAG_GEN_CLASS_PROXY;
        /**
         * generate proxy for enum
         */
        int POS_FLAG_GEN_ENUM_PROXY = 10;
        int FLAG_GEN_ENUM_PROXY = 1 << POS_FLAG_GEN_ENUM_PROXY;

        int FLAGS_GEN_ALL_PROXY = FLAG_GEN_CLASS_PROXY | FLAG_GEN_ENUM_PROXY;

        int FLAGS_REF_ALL = FLAG_REF_CONSTRUCTOR | FLAG_REF_METHOD | FLAG_REF_FIELD | FLAG_REF_ENUM_CONST;
        //endregion

        @ToString(doNotUseGetters = true)
        final class Context {

            final Map<Class<?>, String> mappings;
            //region Properties
            final StringBuilder seg0;
            final StringBuilder seg1;
            final boolean preferClass;
            final boolean preferHandle;
            final boolean preferFieldHandle;
            final boolean preferConst;
            final boolean nestClasses;
            final boolean refField;
            final boolean refMethod;
            final boolean refConstructor;
            final boolean refEnumConst;
            final boolean genClassProxy;
            final boolean genEnumProxy;

            final String prefix;
            final String proxyName;
            //endregion
            final UnaryOperator<String> pkgModifier;

            Context(StringBuilder seg0, StringBuilder seg1, BitSet set, Class<?> target, String proxyName, Map<Class<?>, String> mappings, UnaryOperator<String> pkgModifier) {
                this.seg0 = seg0;
                this.seg1 = seg1;
                preferClass = set.get(POS_FLAG_PREFER_CLASS);
                preferHandle = set.get(POS_FLAG_PREFER_HANDLE);
                preferFieldHandle = set.get(POS_FLAG_PREFER_FIELD_HANDLE);
                preferConst = set.get(POS_FLAG_PREFER_CONST);
                nestClasses = set.get(POS_FLAG_NEST_CLASSES);
                refField = set.get(POS_FLAG_REF_FIELD);
                refMethod = set.get(POS_FLAG_REF_METHOD);
                refConstructor = set.get(POS_FLAG_REF_CONSTRUCTOR);
                refEnumConst = set.get(POS_FLAG_REF_ENUM_CONST);
                genClassProxy = set.get(POS_FLAG_GEN_CLASS_PROXY);
                genEnumProxy = set.get(POS_FLAG_GEN_ENUM_PROXY);
                //** only generate enum proxy will generate class, other will generate interface
                prefix = (target.isEnum() && genEnumProxy) ? " public static final " : "";
                this.proxyName = proxyName;
                this.mappings = mappings == null ? new ConcurrentHashMap<>() : mappings;
                this.pkgModifier = pkgModifier;
            }

            //region Segments
            static final String SUFFIX_HOLDER = "%1$s";
            static final String TYPE_HOLD = "$Type";
            static final String PROXY_INSTANCE_METHOD_NAME = "proxy";
            static final String TYPE_OF = "Ref.type";

            static final String TYPE_NAME = "Ref.Lazy<Ref.Type>";
            static final String LAZY_TYPE = "Ref.lazy(()->Ref.type";
            static final String PROP_NAME = "Ref.Lazy<Ref.Prop>";
            static final String LAZY_PROP = "Ref.lazy(()->$Type.get().prop";
            static final String FUNC_NAME = "Ref.Lazy<Ref.Func>";

            static final String LAZY_FUNC = "Ref.lazy(()->$Type.get().func";
            static final String HANDLE_NAME = "Ref.Lazy<Ref.Handle>";
            static final String STATIC_HANDLE_NAME = "Ref.Lazy<Ref.Handle.Alive>";
            static final String LAZY_HANDLE = "Ref.lazy(()->$Type.get().handle";
            static final String LAZY_STATIC_HANDLE = "Ref.lazy(()->$Type.get().findStatic";
            static final String LAZY_GETTER_HANDLE = "Ref.lazy(()->$Type.get().findGetter";
            static final String LAZY_SETTER_HANDLE = "Ref.lazy(()->$Type.get().findSetter";
            static final String LAZY_STATIC_GETTER_HANDLE = "Ref.lazy(()->$Type.get().findStaticGetter";
            static final String LAZY_STATIC_SETTER_HANDLE = "Ref.lazy(()->$Type.get().findStaticSetter";
            static final String CREATOR_NAME = "Ref.Lazy<Ref.Creator>";
            static final String CREATOR_HANDLE_NAME = "Ref.Lazy<Ref.Handle.Alive>";
            static final String CREATOR_FIELD_NAME = "CREATE";
            static final String LAZY_CREATOR = "Ref.lazy(()->$Type.get().creator";
            static final String LAZY_CREATOR_HANDLE = "Ref.lazy(()->$Type.get().findConstructor";
            static final String OR_ELSE_THROW = ".orElseThrow(()->new IllegalStateException(\"No value present\"))";
            //endregion

            //region Util
            private static String capitalize(String v) {
                return v == null || v.isEmpty() ? v : Character.isUpperCase(v.charAt(0)) ? v : (Character.toUpperCase(v.charAt(0)) + v.substring(1));
            }

            private static final Comparator<Executable> EXECUTABLE_COMPARATOR = Comparator
                    .comparing(Executable::getParameterCount)
                    .thenComparing(x -> Arrays.stream(x.getParameterTypes()).map(Class::getCanonicalName).collect(Collectors.joining()));

            private static final Comparator<Field> FIELD_COMPARATOR = Comparator
                    .comparing(Field::getName)
                    .thenComparing(Field::getModifiers);

            private static String qualifiedNameOf(Class<?> type) {
                return type.getCanonicalName() == null ? type.getName() : type.getCanonicalName();
            }

            static void putType(StringBuilder b, Class<?> m, boolean preferClass) {
                if (m.isPrimitive()) {
                    b.append(m.getSimpleName()).append(".class");
                } else if (m.isArray() && m.getComponentType().isPrimitive()) {
                    b.append(m.getSimpleName()).append("[].class");
                } else if (m.getName().startsWith("java.") && !m.getName().contains("internal") && Modifier.isPublic(m.getModifiers())) {
                    b.append(qualifiedNameOf(m)).append(".class");
                } else if (preferClass && m.isArray() && Modifier.isPublic(m.getComponentType().getModifiers())) {
                    b.append(qualifiedNameOf(m.getComponentType())).append("[].class");
                } else if (preferClass && Modifier.isPublic(m.getModifiers())) {
                    b.append(qualifiedNameOf(m)).append(".class");
                } else
                    b.append(TYPE_OF + "(\"").append(qualifiedNameOf(m)).append("\").element()");
            }

            private static String typeVarBounds(TypeVariable<?> typeVar) {
                java.lang.reflect.Type[] bounds = typeVar.getBounds();
                if (bounds.length == 1 && bounds[0].equals(Object.class)) {
                    return typeVar.getName();
                } else {
                    return typeVar.getName() + " extends " +
                           Arrays.stream(bounds)
                                   .map(java.lang.reflect.Type::getTypeName)
                                   .collect(Collectors.joining(" & "));
                }
            }

            private static CharSequence typeVar(GenericDeclaration f) {
                var sb = new StringBuilder();
                var typeParams = f.getTypeParameters();
                if (typeParams.length > 0) {
                    sb.append(Arrays.stream(typeParams)
                            .map(Context::typeVarBounds)
                            .collect(Collectors.joining(",", "<", "> ")));
                }
                return sb;
            }

            private static String nameToCanonical(String name) {
                if (name.indexOf('$') > 0) {
                    var chars = name.toCharArray();
                    var cap = false;
                    for (int i = 0; i < chars.length; i++) {
                        var c = chars[i];
                        if (c == '.' || c == ',' || c == '<' || c == '>' || c == ' ') cap = false;
                        else if (c == '$' && cap) {
                            chars[i] = '.';
                            cap = false;
                        } else if (Character.isUpperCase(c)) cap = true;
                    }
                    name = new String(chars);
                    //  System.out.println(name);
                }
                return name;
            }

            private static CharSequence signature(Method f) {
                var sb = new StringBuilder();
                sb.append(typeVar(f)).append(" ")
                        .append(nameToCanonical(f.getGenericReturnType().getTypeName())).append(" ")
                        .append(f.getName());
                sb.append('(');
                var sj = new StringJoiner(",");
                var ps = f.getParameters();
                var params = f.getGenericParameterTypes();
                for (int j = 0; j < params.length; j++) {
                    var param = params[j].getTypeName();
                    if (f.isVarArgs() && (j == params.length - 1)) // replace T[] with T...
                        param = param.replaceFirst("\\[]$", "...");
                    sj.add(nameToCanonical(param) + " " + ps[j].getName());
                }
                return sb.append(sj)
                        .append(')');
            }

            private static CharSequence formatSuffix(StringBuilder sb, String suffix) {
                return sb.indexOf(SUFFIX_HOLDER) != -1 ? String.format(sb.toString(), suffix) : sb;
            }

            private CharSequence proxySignature(Class<?> target, Method f, String suffix) {
                var sb = new StringBuilder();
                var rGeneric = nameToCanonical(f.getGenericReturnType().getTypeName());
                var rType = f.getReturnType();
                while (rType.isArray()) rType = rType.getComponentType();
                if (rType == target) {
                    rGeneric = rGeneric.replaceFirst(rType.getCanonicalName(), proxyName);
                } else if (mappings.containsKey(rType)) {
                    rGeneric = rGeneric.replaceFirst(rType.getCanonicalName(), mappings.get(rType));
                } else if (pkgModifier != null) {
                    rGeneric = rGeneric.replaceFirst(rType.getCanonicalName(),
                            rType.getCanonicalName()
                                    .replace(rType.getPackage().getName(), pkgModifier.apply(rType.getPackage().getName())));
                }
                sb.append(typeVar(f)).append(" ")
                        .append(rGeneric).append(" ")
                        .append(f.getName()).append(suffix);
                sb.append('(');
                var sj = new StringJoiner(",");
                var ps = f.getParameters();
                var params = f.getGenericParameterTypes();
                for (int j = 0; j < params.length; j++) {
                    var param = params[j].getTypeName();
                    if (f.isVarArgs() && (j == params.length - 1)) // replace T[] with T...
                        param = param.replaceFirst("\\[]$", "...");
                    {
                        var p = ps[j].getType();
                        while (p.isArray()) p = p.getComponentType();
                        if (p == target) {
                            sj.add(nameToCanonical(param).replaceFirst(p.getCanonicalName(), proxyName) + " " + ps[j].getName());
                        } else if (mappings.containsKey(p)) {
                            sj.add(nameToCanonical(param).replaceFirst(p.getCanonicalName(), mappings.get(p)) + " " + ps[j].getName());
                        } else if (pkgModifier != null) {
                            sj.add(nameToCanonical(param).replaceFirst(
                                    p.getCanonicalName(),
                                    p.getCanonicalName().replaceFirst(
                                            p.getPackage().getName(),
                                            pkgModifier.apply(p.getPackage().getName())
                                    )
                            ) + " " + ps[j].getName());
                        } else {
                            sj.add(nameToCanonical(param) + " " + ps[j].getName());
                        }
                    }

                }
                return sb.append(sj)
                        .append(')');
            }

            private CharSequence proxyParameters(Class<?> target, Method f) {
                var sj = new StringJoiner(",");
                for (Parameter p : f.getParameters()) {
                    var tType = p.getType();
                    var n = 0;
                    while (tType.isArray()) {
                        tType = tType.getComponentType();
                        n++;
                    }
                    var name = p.getName();
                    if (mappings.containsKey(tType)) {
                        var t = mappings.get(tType);
                        if (n == 0)
                            if (tType.isEnum())
                                name = mappings.get(tType) + ".valueOf(" + name + ".name())";
                            else
                                name = "(" + mappings.get(tType) + ")()->" + name;
                        else if (n == 1)
                            if (tType.isEnum())
                                name = "java.util.Arrays.stream(" + name + ").map(x->" +
                                       t + ".valueOf(x.name()).toArray(new " + t + "[0])";
                            else
                                name = "java.util.Arrays.stream(" + name + ").map(x->(" +
                                       t + ")()->x).toArray(new " + t + "[0])";
                        else {
                            var sb = new StringBuilder();
                            sb.append("Ref.Generate.nArrayConvert(").append(name).append(",x->");
                            if (tType.isEnum())
                                sb.append(mappings.get(tType)).append(".valueOf(x.name()))");
                            else
                                sb.append("(").append(mappings.get(tType)).append(")()->x)");
                            name = sb.toString();
                        }
                    }
                    sj.add(name);

                }
                return sj.toString();
            }


            //endregion

            //region Creator
            static Context context(Class<?> target, String name, BitSet flagSet, Map<Class<?>, String> mappings, UnaryOperator<String> pkgModifier) {
                var b = new StringBuilder().append("@SuppressWarnings({\"unused\", \"SpellCheckingInspection\"})\n");
                var typeName = name == null || name.isEmpty() ? target.getSimpleName() : name.indexOf('%') != -1 ? String.format(name, target.getSimpleName()) : name;
                if (flagSet.get(POS_FLAG_GEN_ENUM_PROXY) && target.isEnum()) {
                    b.append(" enum ").append(typeName)
                            .append('{').append('\n');
                    var ctx = new Context(b, new StringBuilder(), flagSet, target, typeName, mappings, pkgModifier).refType(target);
                    ctx.seg1.append("/** fetch original Enum Value **/\n")
                            .append("@SuppressWarnings({\"unchecked\", \"rawtypes\"})\n")
                            .append("public Object instance(){ return Enum.valueOf((Class<? extends Enum>)").
                            append(TYPE_HOLD)
                            .append(".get().element(),name());}\n");
                    return ctx;
                } else if (!target.isInterface() && !target.isEnum() && flagSet.get(POS_FLAG_GEN_CLASS_PROXY)) {
                    var typeVar = typeVar(target);
                    b.append("interface ").append(typeName).append(typeVar).append("{\n")
                            .append("/** warp instance from original object **/\n")

                            .append(" @SuppressWarnings(\"AssertWithSideEffects\")\n static ").append(typeVar).append(" ").append(typeName).append(typeVar).append(" ")
                            .append(PROXY_INSTANCE_METHOD_NAME).append("(Object val){\nassert val !=null;\n" +
                                                                       "assert val.getClass()==$Type.get().element();\n" +
                                                                       "return ()->val;\n}\n")
                            .append("/** original object **/\nObject val();\n")
                    ;
                    return new Context(b, new StringBuilder(), flagSet, target, typeName, mappings, pkgModifier).refType(target);
                } else b.append("interface ").append(typeName)
                        .append('{').append('\n');
                return new Context(b, null, flagSet, target, typeName, mappings, pkgModifier).refType(target);

            }
            //endregion

            //region Units
            private Context refType(Class<?> target) {
                var b = seg1 != null ? genEnumProxy && target.isEnum() ? seg1 : seg0 : seg0;
                b.append("/** ").append(target.toGenericString()).append(" **/\n").append(prefix);
                if (preferClass || (target.getPackage().getName().equals("java.lang") && Modifier.isPublic(target.getModifiers()))) {
                    b.append(TYPE_NAME + " " + TYPE_HOLD).append("=" + LAZY_TYPE + "(")
                            .append(qualifiedNameOf(target)).append(".class));\n");
                } else
                    b.append(TYPE_NAME + " " + TYPE_HOLD).append("=" + LAZY_TYPE + "(\"").append(qualifiedNameOf(target)).append("\"));\n");
                return this;
            }

            void refMethod(Class<?> target, Method f, Map<String, Map<Method, Map.Entry<StringBuilder, StringBuilder>>> sorted) {
                //skip hidden method
                if (f.isSynthetic() && f.getName().contains("$")) return;
                var b0 = new StringBuilder();
                var b1 = new StringBuilder();
                //duplication process
                var exists = sorted.computeIfAbsent(f.getName(), v -> new HashMap<>());
                var name = f.getName();
                var capName = capitalize(name);
                var isPublic = Modifier.isPublic(f.getModifiers());
                var isProtected = Modifier.isProtected(f.getModifiers());
                var isAbstract = Modifier.isAbstract(f.getModifiers());
                var isStatic = Modifier.isStatic(f.getModifiers());
                var isDefault = f.isDefault();
                var isClone = (isPublic || isProtected) &&
                              name.equals("clone") && f.getReturnType() == Object.class
                              && f.getParameterCount() == 0;
                var isHashCode =
                        isPublic &&
                        name.equals("hashCode") && f.getReturnType() == Integer.TYPE
                        && f.getParameterCount() == 0;
                var isEquals = isPublic &&
                               name.equals("equals") && f.getReturnType() == Boolean.TYPE
                               && f.getParameterCount() == 1 && f.getParameterTypes()[0] == Object.class;
                var isToString = isPublic &&
                                 name.equals("toString") && f.getReturnType() == String.class
                                 && f.getParameterCount() == 0;
                exists.put(f, new AbstractMap.SimpleEntry<>(b0, b1));
                //proxy
                if (!target.isEnum() && genClassProxy
                    && isPublic
                    && !isClone
                    && !isAbstract && !isStatic) {
                    b1.append("default ").append(proxySignature(target, f, "")).append("{\n");
                    if (f.getReturnType() != target) {
                        b1.append(f.getReturnType() != Void.TYPE ? "return " : "").append(capName).append(SUFFIX_HOLDER).append(".get().invoke(val()")
                                .append(f.getParameterCount() > 0 ? ',' : ' ')
                                .append(proxyParameters(target, f))
                                .append(");\n}\n");
                    } else {
                        b1.append("return proxy(").append(capName).append(SUFFIX_HOLDER).append(".get().invoke(val()")
                                .append(f.getParameterCount() > 0 ? ',' : ' ')
                                .append(proxyParameters(target, f))
                                .append("));")
                                .append("\n}\n");
                    }

                }

                b0.append("/** ").append(f.toGenericString()).append(" **/\n");
                b0.append(prefix);
                if (preferHandle) {
                    b0
                            .append(isStatic ? STATIC_HANDLE_NAME : HANDLE_NAME).append(" ").append(capName)
                            .append(SUFFIX_HOLDER).append("=")
                            .append(isStatic ? LAZY_STATIC_HANDLE : LAZY_HANDLE).append("(\"");
                } else {
                    b0.append(FUNC_NAME + " ").append(capName).append(SUFFIX_HOLDER).append("=" + LAZY_FUNC + "(\"");
                }
                b0.append(f.getName()).append('"').append(',');
                putType(b0, f.getReturnType(), preferClass);
                var pm = f.getParameterTypes();
                for (var m : pm) {
                    b0.append(',');
                    putType(b0, m, preferClass);
                }
                b0.append(")" + OR_ELSE_THROW + ");\n");
            }


            void mergeMethod(Map<String, Map<Method, Map.Entry<StringBuilder, StringBuilder>>> sorted, CodeInfo info, Class<?> target) {
                for (Map<Method, Map.Entry<StringBuilder, StringBuilder>> v : sorted.values()) {
                    var keys = v.keySet().stream().sorted(EXECUTABLE_COMPARATOR).collect(Collectors.toList());
                    for (int i = 0; i < keys.size(); i++) {
                        var key = keys.get(i);
                        var suffix = i == 0 ? "" : String.valueOf(i);
                        var b0 = v.get(key).getKey();
                        var b1 = v.get(key).getValue();
                        if (b0 != null && b0.length() > 0) {
                            seg0.append(formatSuffix(b0, suffix));
                            if (b1 != null && b1.length() != 0) {
                                var n = 0;
                                if (seg1 != null)
                                    seg1.append(formatSuffix(b1, suffix));
                                else
                                    seg0.append(formatSuffix(b1, suffix));
                            }

                        } else {
                            var b = seg1 == null ? seg0 : Modifier.isStatic(key.getModifiers()) ? seg1 : seg0;
                            b.append(formatSuffix(b1, suffix));
                        }
                        if (info != null && target != null) {
                            info.funcMapping.computeIfAbsent(target, $ -> new HashMap<>())
                                    .put(key, capitalize(key.getName()) + suffix);
                        }
                    }
                }
            }

            void refConstructor(Class<?> target, Constructor<?> f, Map<String, Map<Constructor<?>, StringBuilder>> sorted) {
                var bx = new StringBuilder();
                //duplication process
                var exists = sorted.computeIfAbsent(f.getName(), v -> new HashMap<>());
                exists.put(f, bx);
                bx.append("/** ").append(f.toGenericString()).append(" **/\n")
                        .append(prefix);
                if (preferHandle) {
                    bx.append(CREATOR_HANDLE_NAME).append(" ").append(CREATOR_FIELD_NAME).append(SUFFIX_HOLDER).append("=" + LAZY_CREATOR_HANDLE + "(");
                } else {
                    bx.append(CREATOR_NAME).append(" ").append(CREATOR_FIELD_NAME).append(SUFFIX_HOLDER).append("=" + LAZY_CREATOR + "(");
                }
                var n = true;
                var pm = f.getParameterTypes();
                for (var m : pm) {
                    if (!n) {
                        bx.append(',');
                    }
                    putType(bx, m, preferClass);
                    if (n) n = false;
                }
                bx.append(")" + OR_ELSE_THROW + ");\n");

            }

            void mergeConstructor(Map<String, Map<Constructor<?>, StringBuilder>> sorted, CodeInfo info, Class<?> target) {
                var b = seg1 == null ? seg0 : seg1;
                for (Map<Constructor<?>, StringBuilder> v : sorted.values()) {
                    var keys = v.keySet().stream().sorted(EXECUTABLE_COMPARATOR).collect(Collectors.toList());
                    for (int i = 0; i < keys.size(); i++) {
                        var key = keys.get(i);
                        var suffix = i == 0 ? "" : String.valueOf(i);
                        b.append(formatSuffix(v.get(key), suffix));
                        if (info != null && target != null)
                            info.creatorMapping.computeIfAbsent(target, $ -> new HashMap<>())
                                    .put(key, key.getName() + suffix);
                    }
                }
            }

            void refField(Class<?> target, Field f, Map<String, Map<Field, Map.Entry<StringBuilder, StringBuilder>>> sorted) {
                var name = f.getName();
                var capName = capitalize(name);
                var isStatic = Modifier.isStatic(f.getModifiers());
                if (isStatic && name.equals("serialVersionUID") && f.getType() == Long.TYPE) return;
                var map = sorted.computeIfAbsent(name, $ -> new HashMap<>());
                var b = new StringBuilder();
                var b1 = new StringBuilder();
                map.put(f, new AbstractMap.SimpleEntry<>(b1, b));
                if (isStatic && target.isEnum() && f.getType() == target && refEnumConst && !genEnumProxy) {
                    b.append("/** ").append(f.toGenericString()).append(" **/\n")
                            .append(prefix).append(" Object ").append(name).append("=")
                            .append("valueOf.get().invoke(null,\"").append(name).append("\");\n");
                }
                if (isStatic && target.isEnum() && f.getType() == target && refEnumConst && genEnumProxy) {
                    b1.append("/** ").append(f.toGenericString()).append(" **/\n")
                            .append(name).append(",\n");
                } else {
                    b.append("/** ").append(f.toGenericString()).append(" **/\n").append(prefix);
                    if (isStatic && Modifier.isFinal(f.getModifiers()) && preferConst
                        && (f.getType() == String.class || Type.box(f.getType()) != f.getType())) {
                        var v = Ref.type(target).prop(f.getName())
                                .orElseThrow(() -> new NoSuchElementException("fetch field const")).get(null);
                        b.append(f.getType().getCanonicalName()).append(" ").append(capName).append(SUFFIX_HOLDER).append("=")
                                .append(v instanceof String ? '"' : ' ')
                                .append(v instanceof String ? v : String.valueOf(v))
                                .append(v instanceof String ? '"' : v instanceof Float ? 'F' : v instanceof Long ? 'L' : ' ')
                                .append(";\n");
                    } else if (preferFieldHandle) {
                        b.append(isStatic ? STATIC_HANDLE_NAME : HANDLE_NAME).append(" ").append(capName)
                                .append(SUFFIX_HOLDER).append("Getter=")
                                .append(isStatic ? LAZY_STATIC_GETTER_HANDLE : LAZY_GETTER_HANDLE).append("(\"")
                                .append(f.getName())
                                .append("\"")
                                .append(",");
                        putType(b, f.getType(), preferClass);
                        b.append(")")
                                .append(OR_ELSE_THROW + ");\n");
                        b.append(prefix)
                                .append(isStatic ? STATIC_HANDLE_NAME : HANDLE_NAME).append(" ").append(capName)
                                .append(SUFFIX_HOLDER).append("Setter=")
                                .append(isStatic ? LAZY_STATIC_SETTER_HANDLE : LAZY_SETTER_HANDLE).append("(\"")
                                .append(f.getName())
                                .append("\"")
                                .append(",");
                        putType(b, f.getType(), preferClass);
                        b.append(")")
                                .append(OR_ELSE_THROW + ");\n");
                    } else {
                        b.append(PROP_NAME + " ").append(capName).append("=" + LAZY_PROP + "(\"")
                                .append(f.getName())
                                .append("\")" + OR_ELSE_THROW + ");\n");
                    }

                }

            }

            void mergeField(Map<String, Map<Field, Map.Entry<StringBuilder, StringBuilder>>> sorted, CodeInfo info, Class<?> target) {
                var b = seg1 == null ? seg0 : seg1;
                var isEnum = false;
                for (Map<Field, Map.Entry<StringBuilder, StringBuilder>> v : sorted.values()) {
                    var keys = v.keySet().stream().sorted(FIELD_COMPARATOR).collect(Collectors.toList());
                    for (int i = 0; i < keys.size(); i++) {
                        var key = keys.get(i);
                        var suffix = i == 0 ? "" : String.valueOf(i);
                        var values = v.get(key);
                        var b0 = values.getKey();
                        var b1 = values.getValue();
                        if (b0.length() > 0 && seg1 != null) {
                            isEnum = true;
                            seg0.append(formatSuffix(b0, suffix));
                            seg1.append(formatSuffix(b1, suffix));
                        } else
                            b.append(formatSuffix(b1, suffix));
                        if (info != null && target != null)
                            info.propMapping.computeIfAbsent(target, $ -> new HashMap<>())
                                    .put(key, capitalize(key.getName()) + suffix);
                    }
                }
                if (isEnum) seg0.append(";\n");
            }

            StringBuilder fold() {
                if (seg1 != null) {
                    seg0.append(seg1);
                }
                seg0.append("}\n");
                return seg0;
            }
            //endregion
        }

        /**
         * Generate Ref for all fields, methods and constructors of the target class.
         *
         * @see Generate#gen(int, String, Class, Map, UnaryOperator)
         */
        static StringBuilder gen(String faceName, Class<?> target, boolean preferClass, boolean innerTypes) {
            return gen(0b111, faceName, target, null, null);
        }

        /**
         * @param flags       see FLAG_XX constants in {@link Generate}
         * @param faceName    the output interface name with three condition:<br/> 1. {@link String#format(String, Object...)} pattern with '%s' reference the target name; <br/> 2. null|'' to use target name;<br/> 3. none empty string to use a given name.;
         * @param target      the target class
         * @param mappings    (optional) already exists mapping class to canonical name of Proxy Ref
         * @param pkgModifier (optional) mapping a package to other
         * @return StringBuilder contains generated code
         */
        static StringBuilder gen(int flags, String faceName, Class<?> target, Map<Class<?>, String> mappings, UnaryOperator<String> pkgModifier) {
            var allMapping = new ConcurrentHashMap<>(mappings == null ? Collections.emptyMap() : mappings);
            var ctx = Context.context(target, faceName, BitSet.valueOf(new long[]{flags}), allMapping, pkgModifier);
            if (ctx.refField || (target.isEnum() && ctx.refEnumConst)) {
                var p = $.fields.get(target);
                var sorted = new HashMap<String, Map<Field, Map.Entry<StringBuilder, StringBuilder>>>();
                for (var f : p) {
                    ctx.refField(target, f, sorted);
                }
                ctx.mergeField(sorted, null, null);
            }
            if (ctx.refMethod) {
                var p = $.methods.get(target);
                var sorted = new HashMap<String, Map<Method, Map.Entry<StringBuilder, StringBuilder>>>();
                for (var f : p) {
                    ctx.refMethod(target, f, sorted);
                }
                ctx.mergeMethod(sorted, null, null);
            }
            if (ctx.refConstructor) {
                var p = $.constructors.get(target);
                var sorted = new HashMap<String, Map<Constructor<?>, StringBuilder>>();
                for (var f : p) {
                    ctx.refConstructor(target, f, sorted);
                }
                ctx.mergeConstructor(sorted, null, null);
            }
            if (ctx.nestClasses) {
                Class<?>[] classes = $.declaredClasses(target);
                var b = ctx.seg1 == null ? ctx.seg0 : ctx.seg1;
                for (Class<?> inner : classes) {
                    b.append(gen(flags, inner.getSimpleName(), inner, allMapping, pkgModifier));
                }
            }
            return ctx.fold();
        }

        @Getter
        @Accessors(fluent = true)
        @ToString
        final class CodeInfo {
            /**
             * mapping of constructors
             */
            final Map<Class<?>, Map<Constructor<?>, String>> creatorMapping = new HashMap<>();
            /**
             * mapping of methods
             */
            final Map<Class<?>, Map<Method, String>> funcMapping = new HashMap<>();
            /**
             * mapping of fields
             */
            final Map<Class<?>, Map<Field, String>> propMapping = new HashMap<>();
            /**
             * generated code
             */
            private StringBuilder code;
        }

        /**
         * @param flags       see FLAG_XX constants in {@link Generate}
         * @param faceName    the output interface name with three condition:<br/> 1. {@link String#format(String, Object...)} pattern with '%s' reference the target name; <br/> 2. null|'' to use target name;<br/> 3. none empty string to use a given name.;
         * @param target      the target class
         * @param mappings    (optional) already exists mapping class to canonical name of Proxy Ref
         * @param pkgModifier (optional) mapping a package to other
         * @param root        root info ( for internal use)  by user pass null.
         * @return StringBuilder contains generated code
         */
        @SuppressWarnings("UnusedReturnValue")
        static CodeInfo genInfo(int flags, String faceName, Class<?> target, Map<Class<?>, String> mappings, UnaryOperator<String> pkgModifier, CodeInfo root) {
            var allMapping = new ConcurrentHashMap<>(mappings == null ? Collections.emptyMap() : mappings);
            var ctx = Context.context(target, faceName, BitSet.valueOf(new long[]{flags}), allMapping, pkgModifier);
            var info = root == null ? new CodeInfo() : root;
            if (ctx.refField || (target.isEnum() && ctx.refEnumConst)) {
                var p = $.fields.get(target);
                var sorted = new HashMap<String, Map<Field, Map.Entry<StringBuilder, StringBuilder>>>();
                for (var f : p) {
                    ctx.refField(target, f, sorted);
                }
                ctx.mergeField(sorted, info, target);
            }
            if (ctx.refMethod) {
                var p = $.methods.get(target);
                var sorted = new HashMap<String, Map<Method, Map.Entry<StringBuilder, StringBuilder>>>();
                for (var f : p) {
                    ctx.refMethod(target, f, sorted);
                }
                ctx.mergeMethod(sorted, info, target);

            }
            if (ctx.refConstructor) {
                var p = $.constructors.get(target);
                var sorted = new HashMap<String, Map<Constructor<?>, StringBuilder>>();
                for (var f : p) {
                    ctx.refConstructor(target, f, sorted);
                }
                ctx.mergeConstructor(sorted, info, target);
            }
            if (ctx.nestClasses) {
                Class<?>[] classes = $.declaredClasses(target);
                for (Class<?> inner : classes) {
                    genInfo(flags, inner.getSimpleName(), inner, allMapping, pkgModifier, root != null ? root : info);
                }
            }
            if (root != null) root.code.append(ctx.fold());
            else info.code = ctx.fold();
            return info;
        }


    }
}
