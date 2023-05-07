/*
 * Source of units
 * Copyright (C) 2023.  Zen.Liu
 *
 * SPDX-License-Identifier: GPL-2.0-only WITH Classpath-exception-2.0"
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; version 2.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * Class Path Exception
 * Linking this library statically or dynamically with other modules is making a combined work based on this library. Thus, the terms and conditions of the GNU General Public License cover the whole combination.
 *  As a special exception, the copyright holders of this library give you permission to link this library with independent modules to produce an executable, regardless of the license terms of these independent modules, and to copy and distribute the resulting executable under terms of your choice, provided that you also meet, for each linked independent module, the terms and conditions of the license of that module. An independent module is a module which is not derived from or based on this library. If you modify this library, you may extend this exception to your version of the library, but you are not obligated to do so. If you do not wish to do so, delete this exception statement from your version.
 */

package cn.zenliu.units.reflect;

import lombok.Getter;
import lombok.SneakyThrows;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.var;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * New Ref
 *
 * @author Zen.Liu
 * @since 2022-12-30
 */

@SuppressWarnings({"unchecked", "unused", "SameParameterValue"})
public interface Ref<E> {
    E element();

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



    interface Type extends Ref<Class<?>> {
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
                    t==null||t.isEmpty()?null:
                    t.equals("void") ?void.class :
                    t.equals("boolean") ?boolean.class :
                    t.equals("byte") ?byte.class :
                    t.equals("char") ?char.class :
                    t.equals("short") ?short.class :
                    t.equals("int") ?int.class :
                    t.equals("long") ?long.class :
                    t.equals("float") ?float.class :
                    t.equals("double") ?double.class :
                    null ;
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

        default Optional<Creator> creator(Class<?>... args) {
            return Optional.ofNullable($.find(element(), args)).map(f -> () -> f);
        }

        default Optional<Func> func(String name, Class<?> returnType, Class<?>... args) {
            return Optional.ofNullable($.find(element(), name, returnType, args)).map(f -> () -> f);
        }

        default Optional<Func> fun(String name, Class<?>... args) {
            return Optional.ofNullable($.find(element(), name, null, args)).map(f -> () -> f);
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

    interface Prop extends Acc<Field>, Mem<Field> {
        interface Alive extends Acc<Field>, Mem<Field>, Live<Field> {
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
                                .orElseThrow(() -> new IllegalStateException("fetch field const")).get(null);
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
