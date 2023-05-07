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

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.experimental.Accessors;
import lombok.experimental.UtilityClass;
import lombok.var;
import sun.misc.Unsafe;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.*;
import java.time.Duration;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
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
        public static final Unsafe UNSAFE = getUnsafe();

        public UnsafeAccess() {
        }

        @SuppressWarnings("RedundantCast")
        private static Unsafe getUnsafe() {
            Unsafe instance;
            try {
                Field field = Unsafe.class.getDeclaredField("theUnsafe");
                field.setAccessible(true);
                instance = (Unsafe) field.get((Object) null);
            } catch (Exception var4) {
                try {
                    Constructor<Unsafe> c = Unsafe.class.getDeclaredConstructor();
                    c.setAccessible(true);
                    instance = (Unsafe) c.newInstance();
                } catch (Exception var3) {
                    throw new RuntimeException(var3);
                }
            }

            return instance;
        }

        private static boolean hasGetAndSetSupport() {
            try {
                Unsafe.class.getMethod("getAndSetObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Exception var1) {
                return false;
            }
        }

        private static boolean hasGetAndAddLongSupport() {
            try {
                Unsafe.class.getMethod("getAndAddLong", Object.class, Long.TYPE, Long.TYPE);
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

    Lazy<Function<Class<?>, MethodHandles.Lookup>> Lookup$Constructor = Ref.lazy(() -> {
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
    Lazy<Function<Class<?>, Object>> Class$getModule = Ref.lazy(() -> {
        if (version <= 8) return x -> null;
        var m = Objects.requireNonNull(access(declared(Class.class, "getModule")));
        var h = unreflect(m);
        return x -> invoke(h, x);
    });

    Lazy<BiConsumer<String, Object>> Module$implAddExportsOrOpens = Ref.lazy(() -> {
        if (version <= (8)) return (a, b) -> {
        };
        var cls = forName("java.lang.Module");
        var m = declared(cls, "implAddExportsOrOpens", void.class, String.class, cls, boolean.class, boolean.class);
        var everyone = declaredField(cls, "EVERYONE_MODULE");
        var h = unreflect(m);
        return (pn, mod) -> invoke(h, mod, pn, everyone, true, true);
    });

    Lazy<Predicate<Object>> Module$isNamed = Ref.lazy(() -> {
        if (version <= (8)) return x -> false;
        var m = declared(forName("java.lang.Module"), "isNamed", boolean.class);
        var h = unreflect(m);
        return x -> (boolean) invoke(h, x);
    });
    public static final LazyBool modular = Ref.bool(() -> {
        if ($.version <= 8) return false;
        return Module$isNamed.get().test(Class$getModule.get().apply(Ref.class));
    });
    //endregion
    //region 12+
    Lazy<UnaryOperator<Field>> Field$copy = Ref.lazy(() -> {
        var copy = access(declared(Field.class, "copy"));
        assert copy != null;
        var h = unreflect(copy);
        return x -> access((Field) invoke(h, x));
    });
    Lazy<UnaryOperator<Method>> Method$copy = Ref.lazy(() -> {
        var copy = access(declared(Method.class, "copy"));
        var h = unreflect(copy);
        return x -> access((Method) invoke(h, x));
    });
    Lazy<UnaryOperator<Constructor<?>>> Constructor$Copy = Ref.lazy(() -> {
        var copy = access(declared(Constructor.class, "copy"));
        var h = unreflect(copy);
        return x -> access((Constructor<?>) invoke(h, x));
    });
    Lazy<Function<Class<?>, Field[]>> Class$getDeclaredFields0 = Ref.lazy(() -> {
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
    Lazy<Function<Class<?>, Method[]>> Class$getDeclaredMethods0 = Ref.lazy(() -> {
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
    Lazy<Function<Class<?>, Class<?>[]>> Class$getDeclaredClasses0 = Ref.lazy(() -> {
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
    Lazy<Function<Class<?>, Constructor<?>[]>> Class$getDeclaredConstructors0 = Ref.lazy(() -> {
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
        Lazy<Ref.Type> $Type = Ref.lazy(() -> Ref.type(Class.class));
        /**
         * private transient volatile java.lang.Class$AnnotationData java.lang.Class.annotationData
         **/
        Lazy<Ref.Handle> AnnotationDataGetter = Ref.lazy(() -> $Type.get().findGetter("annotationData", Ref.type("java.lang.Class.AnnotationData").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> AnnotationDataSetter = Ref.lazy(() -> $Type.get().findSetter("annotationData", Ref.type("java.lang.Class.AnnotationData").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile sun.reflect.generics.repository.ClassRepository java.lang.Class.genericInfo
         **/
        Lazy<Ref.Handle> GenericInfoGetter = Ref.lazy(() -> $Type.get().findGetter("genericInfo", Ref.type("sun.reflect.generics.repository.ClassRepository").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> GenericInfoSetter = Ref.lazy(() -> $Type.get().findSetter("genericInfo", Ref.type("sun.reflect.generics.repository.ClassRepository").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile java.util.Map<java.lang.String, T> java.lang.Class.enumConstantDirectory
         **/
        Lazy<Ref.Handle> EnumConstantDirectoryGetter = Ref.lazy(() -> $Type.get().findGetter("enumConstantDirectory", Map.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> EnumConstantDirectorySetter = Ref.lazy(() -> $Type.get().findSetter("enumConstantDirectory", Map.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private final java.lang.Class<?> java.lang.Class.componentType
         **/
        Lazy<Ref.Handle> ComponentTypeGetter = Ref.lazy(() -> $Type.get().findGetter("componentType", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ComponentTypeSetter = Ref.lazy(() -> $Type.get().findSetter("componentType", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static final int java.lang.Class.ENUM
         **/
        Lazy<Ref.Handle.Alive> ENUMGetter = Ref.lazy(() -> $Type.get().findStaticGetter("ENUM", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> ENUMSetter = Ref.lazy(() -> $Type.get().findStaticSetter("ENUM", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile int java.lang.Class.classRedefinedCount
         **/
        Lazy<Ref.Handle> ClassRedefinedCountGetter = Ref.lazy(() -> $Type.get().findGetter("classRedefinedCount", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ClassRedefinedCountSetter = Ref.lazy(() -> $Type.get().findSetter("classRedefinedCount", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private final java.lang.ClassLoader java.lang.Class.classLoader
         **/
        Lazy<Ref.Handle> ClassLoaderGetter = Ref.lazy(() -> $Type.get().findGetter("classLoader", ClassLoader.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ClassLoaderSetter = Ref.lazy(() -> $Type.get().findSetter("classLoader", ClassLoader.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile java.lang.reflect.Constructor<T> java.lang.Class.cachedConstructor
         **/
        Lazy<Ref.Handle> CachedConstructorGetter = Ref.lazy(() -> $Type.get().findGetter("cachedConstructor", Constructor.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> CachedConstructorSetter = Ref.lazy(() -> $Type.get().findSetter("cachedConstructor", Constructor.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient java.lang.Object java.lang.Class.classData
         **/
        Lazy<Ref.Handle> ClassDataGetter = Ref.lazy(() -> $Type.get().findGetter("classData", Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ClassDataSetter = Ref.lazy(() -> $Type.get().findSetter("classData", Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient java.lang.Module java.lang.Class.module
         **/
        Lazy<Ref.Handle> ModuleGetter = Ref.lazy(() -> $Type.get().findGetter("module", $Type.get().element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ModuleSetter = Ref.lazy(() -> $Type.get().findSetter("module", $Type.get().element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile sun.reflect.annotation.AnnotationType java.lang.Class.annotationType
         **/
        Lazy<Ref.Handle> AnnotationTypeGetter = Ref.lazy(() -> $Type.get().findGetter("annotationType", Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> AnnotationTypeSetter = Ref.lazy(() -> $Type.get().findSetter("annotationType", Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static final int java.lang.Class.SYNTHETIC
         **/
        Lazy<Ref.Handle.Alive> SYNTHETICGetter = Ref.lazy(() -> $Type.get().findStaticGetter("SYNTHETIC", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> SYNTHETICSetter = Ref.lazy(() -> $Type.get().findStaticSetter("SYNTHETIC", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>> java.lang.Class.reflectionData
         **/
        Lazy<Ref.Handle> ReflectionDataGetter = Ref.lazy(() -> $Type.get().findGetter("reflectionData", java.lang.ref.SoftReference.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ReflectionDataSetter = Ref.lazy(() -> $Type.get().findSetter("reflectionData", java.lang.ref.SoftReference.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * transient java.lang.ClassValue$ClassValueMap java.lang.Class.classValueMap
         **/
        Lazy<Ref.Handle> ClassValueMapGetter = Ref.lazy(() -> $Type.get().findGetter("classValueMap", Ref.type("java.lang.ClassValue.ClassValueMap").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> ClassValueMapSetter = Ref.lazy(() -> $Type.get().findSetter("classValueMap", Ref.type("java.lang.ClassValue.ClassValueMap").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static final java.io.ObjectStreamField[] java.lang.Class.serialPersistentFields
         **/
        Lazy<Ref.Handle.Alive> SerialPersistentFieldsGetter = Ref.lazy(() -> $Type.get().findStaticGetter("serialPersistentFields", Ref.type("java.io.ObjectStreamField[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> SerialPersistentFieldsSetter = Ref.lazy(() -> $Type.get().findStaticSetter("serialPersistentFields", Ref.type("java.io.ObjectStreamField[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient volatile T[] java.lang.Class.enumConstants
         **/
        Lazy<Ref.Handle> EnumConstantsGetter = Ref.lazy(() -> $Type.get().findGetter("enumConstants", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> EnumConstantsSetter = Ref.lazy(() -> $Type.get().findSetter("enumConstants", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static final int java.lang.Class.ANNOTATION
         **/
        Lazy<Ref.Handle.Alive> ANNOTATIONGetter = Ref.lazy(() -> $Type.get().findStaticGetter("ANNOTATION", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> ANNOTATIONSetter = Ref.lazy(() -> $Type.get().findStaticSetter("ANNOTATION", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient java.lang.String java.lang.Class.name
         **/
        Lazy<Ref.Handle> NameGetter = Ref.lazy(() -> $Type.get().findGetter("name", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> NameSetter = Ref.lazy(() -> $Type.get().findSetter("name", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static jdk.internal.reflect.ReflectionFactory java.lang.Class.reflectionFactory
         **/
        Lazy<Ref.Handle.Alive> ReflectionFactoryGetter = Ref.lazy(() -> $Type.get().findStaticGetter("reflectionFactory", Ref.type("jdk.internal.reflect.ReflectionFactory").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> ReflectionFactorySetter = Ref.lazy(() -> $Type.get().findStaticSetter("reflectionFactory", Ref.type("jdk.internal.reflect.ReflectionFactory").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private transient java.lang.String java.lang.Class.packageName
         **/
        Lazy<Ref.Handle> PackageNameGetter = Ref.lazy(() -> $Type.get().findGetter("packageName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle> PackageNameSetter = Ref.lazy(() -> $Type.get().findSetter("packageName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static java.security.ProtectionDomain java.lang.Class.allPermDomain
         **/
        Lazy<Ref.Handle.Alive> AllPermDomainGetter = Ref.lazy(() -> $Type.get().findStaticGetter("allPermDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> AllPermDomainSetter = Ref.lazy(() -> $Type.get().findStaticSetter("allPermDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static final java.lang.Class<?>[] java.lang.Class.EMPTY_CLASS_ARRAY
         **/
        Lazy<Ref.Handle.Alive> EMPTY_CLASS_ARRAYGetter = Ref.lazy(() -> $Type.get().findStaticGetter("EMPTY_CLASS_ARRAY", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        Lazy<Ref.Handle.Alive> EMPTY_CLASS_ARRAYSetter = Ref.lazy(() -> $Type.get().findStaticSetter("EMPTY_CLASS_ARRAY", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Module java.lang.Class.getModule()
         **/
        Lazy<Ref.Handle> GetModule = Ref.lazy(() -> $Type.get().handle("getModule", $Type.get().element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isSealed()
         **/
        Lazy<Ref.Handle> IsSealed = Ref.lazy(() -> $Type.get().handle("isSealed", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.net.URL java.lang.Class.getResource(java.lang.String)
         **/
        Lazy<Ref.Handle> GetResource = Ref.lazy(() -> $Type.get().handle("getResource", java.net.URL.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private boolean java.lang.Class.isLocalOrAnonymousClass()
         **/
        Lazy<Ref.Handle> IsLocalOrAnonymousClass = Ref.lazy(() -> $Type.get().handle("isLocalOrAnonymousClass", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isLocalClass()
         **/
        Lazy<Ref.Handle> IsLocalClass = Ref.lazy(() -> $Type.get().handle("isLocalClass", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isSynthetic()
         **/
        Lazy<Ref.Handle> IsSynthetic = Ref.lazy(() -> $Type.get().handle("isSynthetic", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.getCanonicalName()
         **/
        Lazy<Ref.Handle> GetCanonicalName = Ref.lazy(() -> $Type.get().handle("getCanonicalName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Method java.lang.Class.getMethod(java.lang.String,java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetMethod = Ref.lazy(() -> $Type.get().handle("getMethod", Method.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Method[] java.lang.Class.privateGetDeclaredMethods(boolean)
         **/
        Lazy<Ref.Handle> PrivateGetDeclaredMethods = Ref.lazy(() -> $Type.get().handle("privateGetDeclaredMethods", Ref.type("java.lang.reflect.Method[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * java.util.List<java.lang.reflect.Method> java.lang.Class.getDeclaredPublicMethods(java.lang.String,java.lang.Class<?>...)
         **/
        Lazy<Ref.Handle> GetDeclaredPublicMethods = Ref.lazy(() -> $Type.get().handle("getDeclaredPublicMethods", List.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Field[] java.lang.Class.getDeclaredFields() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredFields = Ref.lazy(() -> $Type.get().handle("getDeclaredFields", Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.reflect.Constructor<T>[] java.lang.Class.getDeclaredConstructors0(boolean)
         **/
        Lazy<Ref.Handle> GetDeclaredConstructors0 = Ref.lazy(() -> $Type.get().handle("getDeclaredConstructors0", Ref.type("java.lang.reflect.Constructor[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public T java.lang.Class.cast(java.lang.Object)
         **/
        Lazy<Ref.Handle> Cast = Ref.lazy(() -> $Type.get().handle("cast", Object.class, Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native boolean java.lang.Class.isInstance(java.lang.Object)
         **/
        Lazy<Ref.Handle> IsInstance = Ref.lazy(() -> $Type.get().handle("isInstance", boolean.class, Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private boolean java.lang.Class.isDirectSubType(java.lang.Class<?>)
         **/
        Lazy<Ref.Handle> IsDirectSubType = Ref.lazy(() -> $Type.get().handle("isDirectSubType", boolean.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Method java.lang.Class.getEnclosingMethod() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetEnclosingMethod = Ref.lazy(() -> $Type.get().handle("getEnclosingMethod", Method.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native java.lang.Object[] java.lang.Class.getSigners()
         **/
        Lazy<Ref.Handle> GetSigners = Ref.lazy(() -> $Type.get().handle("getSigners", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Constructor<T> java.lang.Class.getConstructor0(java.lang.Class<?>[],int) throws java.lang.NoSuchMethodException
         **/
        Lazy<Ref.Handle> GetConstructor0 = Ref.lazy(() -> $Type.get().handle("getConstructor0", Constructor.class, Ref.type("java.lang.Class[]").element(), int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Field[] java.lang.Class.privateGetPublicFields()
         **/
        Lazy<Ref.Handle> PrivateGetPublicFields = Ref.lazy(() -> $Type.get().handle("privateGetPublicFields", Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native boolean java.lang.Class.isInterface()
         **/
        Lazy<Ref.Handle> IsInterface = Ref.lazy(() -> $Type.get().handle("isInterface", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.invoke.TypeDescriptor$OfField java.lang.Class.arrayType()
         **/
        Lazy<Ref.Handle> ArrayType = Ref.lazy(() -> $Type.get().handle("arrayType", Ref.type("java.lang.invoke.TypeDescriptor.OfField").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?> java.lang.Class.arrayType()
         **/
        Lazy<Ref.Handle> ArrayType1 = Ref.lazy(() -> $Type.get().handle("arrayType", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static java.lang.Class<?> java.lang.Class.toClass(java.lang.reflect.Type)
         **/
        Lazy<Ref.Handle.Alive> ToClass = Ref.lazy(() -> $Type.get().findStatic("toClass", Class.class, Type.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private boolean java.lang.Class.hasEnclosingMethodInfo()
         **/
        Lazy<Ref.Handle> HasEnclosingMethodInfo = Ref.lazy(() -> $Type.get().handle("hasEnclosingMethodInfo", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * java.security.ProtectionDomain java.lang.Class.protectionDomain()
         **/
        Lazy<Ref.Handle> ProtectionDomain = Ref.lazy(() -> $Type.get().handle("protectionDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public <U> java.lang.Class<? extends U> java.lang.Class.asSubclass(java.lang.Class<U>)
         **/
        Lazy<Ref.Handle> AsSubclass = Ref.lazy(() -> $Type.get().handle("asSubclass", Class.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Field java.lang.Class.getField(java.lang.String) throws java.lang.NoSuchFieldException,java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetField = Ref.lazy(() -> $Type.get().handle("getField", Field.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.descriptorString()
         **/
        Lazy<Ref.Handle> DescriptorString = Ref.lazy(() -> $Type.get().handle("descriptorString", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Constructor<T>[] java.lang.Class.privateGetDeclaredConstructors(boolean)
         **/
        Lazy<Ref.Handle> PrivateGetDeclaredConstructors = Ref.lazy(() -> $Type.get().handle("privateGetDeclaredConstructors", Ref.type("java.lang.reflect.Constructor[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Method[] java.lang.Class.privateGetPublicMethods()
         **/
        Lazy<Ref.Handle> PrivateGetPublicMethods = Ref.lazy(() -> $Type.get().handle("privateGetPublicMethods", Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static native java.lang.Class<?> java.lang.Class.forName0(java.lang.String,boolean,java.lang.ClassLoader,java.lang.Class<?>) throws java.lang.ClassNotFoundException
         **/
        Lazy<Ref.Handle.Alive> ForName0 = Ref.lazy(() -> $Type.get().findStatic("forName0", Class.class, String.class, boolean.class, ClassLoader.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private boolean java.lang.Class.isTopLevelClass()
         **/
        Lazy<Ref.Handle> IsTopLevelClass = Ref.lazy(() -> $Type.get().handle("isTopLevelClass", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class$ReflectionData<T> java.lang.Class.newReflectionData(java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>>,int)
         **/
        Lazy<Ref.Handle> NewReflectionData = Ref.lazy(() -> $Type.get().handle("newReflectionData", Ref.type("java.lang.Class.ReflectionData").element(), java.lang.ref.SoftReference.class, int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private boolean java.lang.Class.isOpenToCaller(java.lang.String,java.lang.Class<?>)
         **/
        Lazy<Ref.Handle> IsOpenToCaller = Ref.lazy(() -> $Type.get().handle("isOpenToCaller", boolean.class, String.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.reflect.Method[] java.lang.Class.getDeclaredMethods0(boolean)
         **/
        Lazy<Ref.Handle> GetDeclaredMethods0 = Ref.lazy(() -> $Type.get().handle("getDeclaredMethods0", Ref.type("java.lang.reflect.Method[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.RecordComponent[] java.lang.Class.getRecordComponents()
         **/
        Lazy<Ref.Handle> GetRecordComponents = Ref.lazy(() -> $Type.get().handle("getRecordComponents", Ref.type("java.lang.reflect.RecordComponent[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?> java.lang.Class.getComponentType()
         **/
        Lazy<Ref.Handle> GetComponentType = Ref.lazy(() -> $Type.get().handle("getComponentType", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native boolean java.lang.Class.isArray()
         **/
        Lazy<Ref.Handle> IsArray = Ref.lazy(() -> $Type.get().handle("isArray", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native boolean java.lang.Class.isPrimitive()
         **/
        Lazy<Ref.Handle> IsPrimitive = Ref.lazy(() -> $Type.get().handle("isPrimitive", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isAnnotation()
         **/
        Lazy<Ref.Handle> IsAnnotation = Ref.lazy(() -> $Type.get().handle("isAnnotation", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Constructor<?>[] java.lang.Class.getDeclaredConstructors() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredConstructors = Ref.lazy(() -> $Type.get().handle("getDeclaredConstructors", Ref.type("java.lang.reflect.Constructor[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation>)
         **/
        Lazy<Ref.Handle> IsAnnotationPresent = Ref.lazy(() -> $Type.get().handle("isAnnotationPresent", boolean.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * sun.reflect.annotation.AnnotationType java.lang.Class.getAnnotationType()
         **/
        Lazy<Ref.Handle> GetAnnotationType = Ref.lazy(() -> $Type.get().handle("getAnnotationType", Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static native void java.lang.Class.registerNatives()
         **/
        Lazy<Ref.Handle.Alive> RegisterNatives = Ref.lazy(() -> $Type.get().findStatic("registerNatives", void.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class$ReflectionData<T> java.lang.Class.reflectionData()
         **/
        Lazy<Ref.Handle> ReflectionData = Ref.lazy(() -> $Type.get().handle("reflectionData", Ref.type("java.lang.Class.ReflectionData").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         **/
        Lazy<Ref.Handle> IsAssignableFrom = Ref.lazy(() -> $Type.get().handle("isAssignableFrom", boolean.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Method[] java.lang.Class.getDeclaredMethods() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredMethods = Ref.lazy(() -> $Type.get().handle("getDeclaredMethods", Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?> java.lang.Class.getDeclaringClass() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaringClass = Ref.lazy(() -> $Type.get().handle("getDeclaringClass", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.String java.lang.Class.getCanonicalName0()
         **/
        Lazy<Ref.Handle> GetCanonicalName0 = Ref.lazy(() -> $Type.get().handle("getCanonicalName0", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.String java.lang.Class.getSimpleBinaryName()
         **/
        Lazy<Ref.Handle> GetSimpleBinaryName = Ref.lazy(() -> $Type.get().handle("getSimpleBinaryName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.toGenericString()
         **/
        Lazy<Ref.Handle> ToGenericString = Ref.lazy(() -> $Type.get().handle("toGenericString", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static java.lang.reflect.Field[] java.lang.Class.copyFields(java.lang.reflect.Field[])
         **/
        Lazy<Ref.Handle.Alive> CopyFields = Ref.lazy(() -> $Type.get().findStatic("copyFields", Ref.type("java.lang.reflect.Field[]").element(), Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?>[] java.lang.Class.getClasses()
         **/
        Lazy<Ref.Handle> GetClasses = Ref.lazy(() -> $Type.get().handle("getClasses", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * java.lang.Object java.lang.Class.getClassData()
         **/
        Lazy<Ref.Handle> GetClassData = Ref.lazy(() -> $Type.get().handle("getClassData", Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class$AnnotationData java.lang.Class.annotationData()
         **/
        Lazy<Ref.Handle> AnnotationData = Ref.lazy(() -> $Type.get().handle("annotationData", Ref.type("java.lang.Class.AnnotationData").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.String java.lang.Class.methodToString(java.lang.String,java.lang.Class<?>[])
         **/
        Lazy<Ref.Handle> MethodToString = Ref.lazy(() -> $Type.get().handle("methodToString", String.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.invoke.TypeDescriptor$OfField java.lang.Class.componentType()
         **/
        Lazy<Ref.Handle> ComponentType = Ref.lazy(() -> $Type.get().handle("componentType", Ref.type("java.lang.invoke.TypeDescriptor.OfField").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?> java.lang.Class.componentType()
         **/
        Lazy<Ref.Handle> ComponentType1 = Ref.lazy(() -> $Type.get().handle("componentType", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public static java.lang.Class<?> java.lang.Class.forName(java.lang.String) throws java.lang.ClassNotFoundException
         **/
        Lazy<Ref.Handle.Alive> ForName = Ref.lazy(() -> $Type.get().findStatic("forName", Class.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public static java.lang.Class<?> java.lang.Class.forName(java.lang.Module,java.lang.String)
         **/
        Lazy<Ref.Handle.Alive> ForName1 = Ref.lazy(() -> $Type.get().findStatic("forName", Class.class, $Type.get().element(), String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public static java.lang.Class<?> java.lang.Class.forName(java.lang.String,boolean,java.lang.ClassLoader) throws java.lang.ClassNotFoundException
         **/
        Lazy<Ref.Handle.Alive> ForName2 = Ref.lazy(() -> $Type.get().findStatic("forName", Class.class, String.class, boolean.class, ClassLoader.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Class<?>[] java.lang.Class.getPermittedSubclasses0()
         **/
        Lazy<Ref.Handle> GetPermittedSubclasses0 = Ref.lazy(() -> $Type.get().handle("getPermittedSubclasses0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isRecord()
         **/
        Lazy<Ref.Handle> IsRecord = Ref.lazy(() -> $Type.get().handle("isRecord", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Constructor<T> java.lang.Class.getDeclaredConstructor(java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredConstructor = Ref.lazy(() -> $Type.get().handle("getDeclaredConstructor", Constructor.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private sun.reflect.generics.factory.GenericsFactory java.lang.Class.getFactory()
         **/
        Lazy<Ref.Handle> GetFactory = Ref.lazy(() -> $Type.get().handle("getFactory", Ref.type("sun.reflect.generics.factory.GenericsFactory").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.annotation.Annotation[] java.lang.Class.getAnnotations()
         **/
        Lazy<Ref.Handle> GetAnnotations = Ref.lazy(() -> $Type.get().handle("getAnnotations", Ref.type("java.lang.annotation.Annotation[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Class<?> java.lang.Class.getNestHost0()
         **/
        Lazy<Ref.Handle> GetNestHost0 = Ref.lazy(() -> $Type.get().handle("getNestHost0", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Field java.lang.Class.getField0(java.lang.String)
         **/
        Lazy<Ref.Handle> GetField0 = Ref.lazy(() -> $Type.get().handle("getField0", Field.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * native void java.lang.Class.setSigners(java.lang.Object[])
         **/
        Lazy<Ref.Handle> SetSigners = Ref.lazy(() -> $Type.get().handle("setSigners", void.class, Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.String java.lang.Class.getSimpleName0()
         **/
        Lazy<Ref.Handle> GetSimpleName0 = Ref.lazy(() -> $Type.get().handle("getSimpleName0", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.security.ProtectionDomain java.lang.Class.getProtectionDomain0()
         **/
        Lazy<Ref.Handle> GetProtectionDomain0 = Ref.lazy(() -> $Type.get().handle("getProtectionDomain0", java.security.ProtectionDomain.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Class<?> java.lang.Class.getDeclaringClass0()
         **/
        Lazy<Ref.Handle> GetDeclaringClass0 = Ref.lazy(() -> $Type.get().handle("getDeclaringClass0", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public <A extends java.lang.annotation.Annotation> A[] java.lang.Class.getDeclaredAnnotationsByType(java.lang.Class<A>)
         **/
        Lazy<Ref.Handle> GetDeclaredAnnotationsByType = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotationsByType", Ref.type("java.lang.annotation.Annotation[]").element(), Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static void java.lang.Class.addAll(java.util.Collection<java.lang.reflect.Field>,java.lang.reflect.Field[])
         **/
        Lazy<Ref.Handle.Alive> AddAll = Ref.lazy(() -> $Type.get().findStatic("addAll", void.class, Collection.class, Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * java.lang.ClassLoader java.lang.Class.getClassLoader0()
         **/
        Lazy<Ref.Handle> GetClassLoader0 = Ref.lazy(() -> $Type.get().handle("getClassLoader0", ClassLoader.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.toString()
         **/
        Lazy<Ref.Handle> ToString = Ref.lazy(() -> $Type.get().handle("toString", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Type java.lang.Class.getGenericSuperclass()
         **/
        Lazy<Ref.Handle> GetGenericSuperclass = Ref.lazy(() -> $Type.get().handle("getGenericSuperclass", Type.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * T[] java.lang.Class.getEnumConstantsShared()
         **/
        Lazy<Ref.Handle> GetEnumConstantsShared = Ref.lazy(() -> $Type.get().handle("getEnumConstantsShared", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class<?> java.lang.Class.elementType()
         **/
        Lazy<Ref.Handle> ElementType = Ref.lazy(() -> $Type.get().handle("elementType", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * native byte[] java.lang.Class.getRawAnnotations()
         **/
        Lazy<Ref.Handle> GetRawAnnotations = Ref.lazy(() -> $Type.get().handle("getRawAnnotations", byte[][].class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Class<?>[] java.lang.Class.getNestMembers0()
         **/
        Lazy<Ref.Handle> GetNestMembers0 = Ref.lazy(() -> $Type.get().handle("getNestMembers0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.getName()
         **/
        Lazy<Ref.Handle> GetName = Ref.lazy(() -> $Type.get().handle("getName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * static java.lang.String java.lang.Class.typeVarBounds(java.lang.reflect.TypeVariable<?>)
         **/
        Lazy<Ref.Handle.Alive> TypeVarBounds = Ref.lazy(() -> $Type.get().findStatic("typeVarBounds", String.class, TypeVariable.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static java.lang.reflect.Method java.lang.Class.searchMethods(java.lang.reflect.Method[],java.lang.String,java.lang.Class<?>[])
         **/
        Lazy<Ref.Handle.Alive> SearchMethods = Ref.lazy(() -> $Type.get().findStatic("searchMethods", Method.class, Ref.type("java.lang.reflect.Method[]").element(), String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static native boolean java.lang.Class.desiredAssertionStatus0(java.lang.Class<?>)
         **/
        Lazy<Ref.Handle.Alive> DesiredAssertionStatus0 = Ref.lazy(() -> $Type.get().findStatic("desiredAssertionStatus0", boolean.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native boolean java.lang.Class.isRecord0()
         **/
        Lazy<Ref.Handle> IsRecord0 = Ref.lazy(() -> $Type.get().handle("isRecord0", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.util.Optional<java.lang.constant.ClassDesc> java.lang.Class.describeConstable()
         **/
        Lazy<Ref.Handle> DescribeConstable = Ref.lazy(() -> $Type.get().handle("describeConstable", Optional.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isMemberClass()
         **/
        Lazy<Ref.Handle> IsMemberClass = Ref.lazy(() -> $Type.get().handle("isMemberClass", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.PublicMethods$MethodList java.lang.Class.getMethodsRecursive(java.lang.String,java.lang.Class<?>[],boolean)
         **/
        Lazy<Ref.Handle> GetMethodsRecursive = Ref.lazy(() -> $Type.get().handle("getMethodsRecursive", Ref.type("java.lang.PublicMethods.MethodList").element(), String.class, Ref.type("java.lang.Class[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Object[] java.lang.Class.getEnclosingMethod0()
         **/
        Lazy<Ref.Handle> GetEnclosingMethod0 = Ref.lazy(() -> $Type.get().handle("getEnclosingMethod0", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?>[] java.lang.Class.getPermittedSubclasses()
         **/
        Lazy<Ref.Handle> GetPermittedSubclasses = Ref.lazy(() -> $Type.get().handle("getPermittedSubclasses", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static <U> java.lang.reflect.Constructor<U>[] java.lang.Class.copyConstructors(java.lang.reflect.Constructor<U>[])
         **/
        Lazy<Ref.Handle.Alive> CopyConstructors = Ref.lazy(() -> $Type.get().findStatic("copyConstructors", Ref.type("java.lang.reflect.Constructor[]").element(), Ref.type("java.lang.reflect.Constructor[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.TypeVariable<java.lang.Class<T>>[] java.lang.Class.getTypeParameters()
         **/
        Lazy<Ref.Handle> GetTypeParameters = Ref.lazy(() -> $Type.get().handle("getTypeParameters", Ref.type("java.lang.reflect.TypeVariable[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static boolean java.lang.Class.arrayContentsEq(java.lang.Object[],java.lang.Object[])
         **/
        Lazy<Ref.Handle.Alive> ArrayContentsEq = Ref.lazy(() -> $Type.get().findStatic("arrayContentsEq", boolean.class, Ref.type("java.lang.Object[]").element(), Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Package java.lang.Class.getPackage()
         **/
        Lazy<Ref.Handle> GetPackage = Ref.lazy(() -> $Type.get().handle("getPackage", Package.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?> java.lang.Class.getNestHost()
         **/
        Lazy<Ref.Handle> GetNestHost = Ref.lazy(() -> $Type.get().handle("getNestHost", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?>[] java.lang.Class.getInterfaces()
         **/
        Lazy<Ref.Handle> GetInterfaces = Ref.lazy(() -> $Type.get().handle("getInterfaces", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class<?>[] java.lang.Class.getInterfaces(boolean)
         **/
        Lazy<Ref.Handle> GetInterfaces1 = Ref.lazy(() -> $Type.get().handle("getInterfaces", Ref.type("java.lang.Class[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.AnnotatedType[] java.lang.Class.getAnnotatedInterfaces()
         **/
        Lazy<Ref.Handle> GetAnnotatedInterfaces = Ref.lazy(() -> $Type.get().handle("getAnnotatedInterfaces", Ref.type("java.lang.reflect.AnnotatedType[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static java.lang.reflect.Method[] java.lang.Class.copyMethods(java.lang.reflect.Method[])
         **/
        Lazy<Ref.Handle.Alive> CopyMethods = Ref.lazy(() -> $Type.get().findStatic("copyMethods", Ref.type("java.lang.reflect.Method[]").element(), Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public T java.lang.Class.newInstance() throws java.lang.InstantiationException,java.lang.IllegalAccessException
         **/
        Lazy<Ref.Handle> NewInstance = Ref.lazy(() -> $Type.get().handle("newInstance", Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.reflect.Field[] java.lang.Class.getDeclaredFields0(boolean)
         **/
        Lazy<Ref.Handle> GetDeclaredFields0 = Ref.lazy(() -> $Type.get().handle("getDeclaredFields0", Ref.type("java.lang.reflect.Field[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static jdk.internal.reflect.ReflectionFactory java.lang.Class.getReflectionFactory()
         **/
        Lazy<Ref.Handle.Alive> GetReflectionFactory = Ref.lazy(() -> $Type.get().findStatic("getReflectionFactory", Ref.type("jdk.internal.reflect.ReflectionFactory").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Field[] java.lang.Class.getFields() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetFields = Ref.lazy(() -> $Type.get().handle("getFields", Ref.type("java.lang.reflect.Field[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private sun.reflect.generics.repository.ClassRepository java.lang.Class.getGenericInfo()
         **/
        Lazy<Ref.Handle> GetGenericInfo = Ref.lazy(() -> $Type.get().handle("getGenericInfo", Ref.type("sun.reflect.generics.repository.ClassRepository").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public <A extends java.lang.annotation.Annotation> A java.lang.Class.getAnnotation(java.lang.Class<A>)
         **/
        Lazy<Ref.Handle> GetAnnotation = Ref.lazy(() -> $Type.get().handle("getAnnotation", Annotation.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public <A extends java.lang.annotation.Annotation> A java.lang.Class.getDeclaredAnnotation(java.lang.Class<A>)
         **/
        Lazy<Ref.Handle> GetDeclaredAnnotation = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotation", Annotation.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.getSimpleName()
         **/
        Lazy<Ref.Handle> GetSimpleName = Ref.lazy(() -> $Type.get().handle("getSimpleName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.getPackageName()
         **/
        Lazy<Ref.Handle> GetPackageName = Ref.lazy(() -> $Type.get().handle("getPackageName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Method[] java.lang.Class.getMethods() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetMethods = Ref.lazy(() -> $Type.get().handle("getMethods", Ref.type("java.lang.reflect.Method[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /** private static void java.lang.Class.checkPackageAccessForPermittedSubclasses(java.lang.SecurityManager,java.lang.ClassLoader,java.lang.Class<?>[]) **/
        //Ref.Lazy<Ref.Handle.Alive> CheckPackageAccessForPermittedSubclasses=Ref.lazy(()->$Type.get().findStatic("checkPackageAccessForPermittedSubclasses",void.class,java.lang.SecurityManager.class,java.lang.ClassLoader.class,Ref.type("java.lang.Class[]").element()).orElseThrow(()->new IllegalStateException("No value present")));
        /**
         * public java.security.ProtectionDomain java.lang.Class.getProtectionDomain()
         **/
        Lazy<Ref.Handle> GetProtectionDomain = Ref.lazy(() -> $Type.get().handle("getProtectionDomain", java.security.ProtectionDomain.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Class<?>[] java.lang.Class.getInterfaces0()
         **/
        Lazy<Ref.Handle> GetInterfaces0 = Ref.lazy(() -> $Type.get().handle("getInterfaces0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.desiredAssertionStatus()
         **/
        Lazy<Ref.Handle> DesiredAssertionStatus = Ref.lazy(() -> $Type.get().handle("desiredAssertionStatus", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * native jdk.internal.reflect.ConstantPool java.lang.Class.getConstantPool()
         **/
        Lazy<Ref.Handle> GetConstantPool = Ref.lazy(() -> $Type.get().handle("getConstantPool", Ref.type("jdk.internal.reflect.ConstantPool").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?>[] java.lang.Class.getNestMembers()
         **/
        Lazy<Ref.Handle> GetNestMembers = Ref.lazy(() -> $Type.get().handle("getNestMembers", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> java.lang.Class.getDeclaredAnnotationMap()
         **/
        Lazy<Ref.Handle> GetDeclaredAnnotationMap = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotationMap", Map.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * static native java.lang.Class<?> java.lang.Class.getPrimitiveClass(java.lang.String)
         **/
        Lazy<Ref.Handle.Alive> GetPrimitiveClass = Ref.lazy(() -> $Type.get().findStatic("getPrimitiveClass", Class.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Type[] java.lang.Class.getGenericInterfaces()
         **/
        Lazy<Ref.Handle> GetGenericInterfaces = Ref.lazy(() -> $Type.get().handle("getGenericInterfaces", Ref.type("java.lang.reflect.Type[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.ClassLoader java.lang.Class.getClassLoader()
         **/
        Lazy<Ref.Handle> GetClassLoader = Ref.lazy(() -> $Type.get().handle("getClassLoader", ClassLoader.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.String java.lang.Class.getSimpleBinaryName0()
         **/
        Lazy<Ref.Handle> GetSimpleBinaryName0 = Ref.lazy(() -> $Type.get().handle("getSimpleBinaryName0", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.annotation.Annotation[] java.lang.Class.getDeclaredAnnotations()
         **/
        Lazy<Ref.Handle> GetDeclaredAnnotations = Ref.lazy(() -> $Type.get().handle("getDeclaredAnnotations", Ref.type("java.lang.annotation.Annotation[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * boolean java.lang.Class.casAnnotationType(sun.reflect.annotation.AnnotationType,sun.reflect.annotation.AnnotationType)
         **/
        Lazy<Ref.Handle> CasAnnotationType = Ref.lazy(() -> $Type.get().handle("casAnnotationType", boolean.class, Ref.type("sun.reflect.annotation.AnnotationType").element(), Ref.type("sun.reflect.annotation.AnnotationType").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /** private void java.lang.Class.checkMemberAccess(java.lang.SecurityManager,int,java.lang.Class<?>,boolean) **/
        //Ref.Lazy<Ref.Handle> CheckMemberAccess=Ref.lazy(()->$Type.get().handle("checkMemberAccess",void.class,java.lang.SecurityManager.class,int.class,java.lang.Class.class,boolean.class).orElseThrow(()->new IllegalStateException("No value present")));
        /**
         * public <A extends java.lang.annotation.Annotation> A[] java.lang.Class.getAnnotationsByType(java.lang.Class<A>)
         **/
        Lazy<Ref.Handle> GetAnnotationsByType = Ref.lazy(() -> $Type.get().handle("getAnnotationsByType", Ref.type("java.lang.annotation.Annotation[]").element(), Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Constructor<?>[] java.lang.Class.getConstructors() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetConstructors = Ref.lazy(() -> $Type.get().handle("getConstructors", Ref.type("java.lang.reflect.Constructor[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Field[] java.lang.Class.privateGetDeclaredFields(boolean)
         **/
        Lazy<Ref.Handle> PrivateGetDeclaredFields = Ref.lazy(() -> $Type.get().handle("privateGetDeclaredFields", Ref.type("java.lang.reflect.Field[]").element(), boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.AnnotatedType java.lang.Class.getAnnotatedSuperclass()
         **/
        Lazy<Ref.Handle> GetAnnotatedSuperclass = Ref.lazy(() -> $Type.get().handle("getAnnotatedSuperclass", AnnotatedType.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private static java.lang.reflect.Field java.lang.Class.searchFields(java.lang.reflect.Field[],java.lang.String)
         **/
        Lazy<Ref.Handle.Alive> SearchFields = Ref.lazy(() -> $Type.get().findStatic("searchFields", Field.class, Ref.type("java.lang.reflect.Field[]").element(), String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native int java.lang.Class.getModifiers()
         **/
        Lazy<Ref.Handle> GetModifiers = Ref.lazy(() -> $Type.get().handle("getModifiers", int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.String java.lang.Class.getTypeName()
         **/
        Lazy<Ref.Handle> GetTypeName = Ref.lazy(() -> $Type.get().handle("getTypeName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Constructor<?> java.lang.Class.getEnclosingConstructor() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetEnclosingConstructor = Ref.lazy(() -> $Type.get().handle("getEnclosingConstructor", Constructor.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isNestmateOf(java.lang.Class<?>)
         **/
        Lazy<Ref.Handle> IsNestmateOf = Ref.lazy(() -> $Type.get().handle("isNestmateOf", boolean.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.reflect.RecordComponent[] java.lang.Class.getRecordComponents0()
         **/
        Lazy<Ref.Handle> GetRecordComponents0 = Ref.lazy(() -> $Type.get().handle("getRecordComponents0", Ref.type("java.lang.reflect.RecordComponent[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native java.lang.Class<? super T> java.lang.Class.getSuperclass()
         **/
        Lazy<Ref.Handle> GetSuperclass = Ref.lazy(() -> $Type.get().handle("getSuperclass", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Field java.lang.Class.getDeclaredField(java.lang.String) throws java.lang.NoSuchFieldException,java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredField = Ref.lazy(() -> $Type.get().handle("getDeclaredField", Field.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * java.util.Map<java.lang.String, T> java.lang.Class.enumConstantDirectory()
         **/
        Lazy<Ref.Handle> EnumConstantDirectory = Ref.lazy(() -> $Type.get().handle("enumConstantDirectory", Map.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.io.InputStream java.lang.Class.getResourceAsStream(java.lang.String)
         **/
        Lazy<Ref.Handle> GetResourceAsStream = Ref.lazy(() -> $Type.get().handle("getResourceAsStream", java.io.InputStream.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class$EnclosingMethodInfo java.lang.Class.getEnclosingMethodInfo()
         **/
        Lazy<Ref.Handle> GetEnclosingMethodInfo = Ref.lazy(() -> $Type.get().handle("getEnclosingMethodInfo", Ref.type("java.lang.Class.EnclosingMethodInfo").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Method java.lang.Class.getDeclaredMethod(java.lang.String,java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredMethod = Ref.lazy(() -> $Type.get().handle("getDeclaredMethod", Method.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * native byte[] java.lang.Class.getRawTypeAnnotations()
         **/
        Lazy<Ref.Handle> GetRawTypeAnnotations = Ref.lazy(() -> $Type.get().handle("getRawTypeAnnotations", byte[][].class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isEnum()
         **/
        Lazy<Ref.Handle> IsEnum = Ref.lazy(() -> $Type.get().handle("isEnum", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.String java.lang.Class.cannotCastMsg(java.lang.Object)
         **/
        Lazy<Ref.Handle> CannotCastMsg = Ref.lazy(() -> $Type.get().handle("cannotCastMsg", String.class, Object.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.reflect.Constructor<T> java.lang.Class.getConstructor(java.lang.Class<?>...) throws java.lang.NoSuchMethodException,java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetConstructor = Ref.lazy(() -> $Type.get().handle("getConstructor", Constructor.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public T[] java.lang.Class.getEnumConstants()
         **/
        Lazy<Ref.Handle> GetEnumConstants = Ref.lazy(() -> $Type.get().handle("getEnumConstants", Ref.type("java.lang.Object[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public native boolean java.lang.Class.isHidden()
         **/
        Lazy<Ref.Handle> IsHidden = Ref.lazy(() -> $Type.get().handle("isHidden", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.String java.lang.Class.initClassName()
         **/
        Lazy<Ref.Handle> InitClassName = Ref.lazy(() -> $Type.get().handle("initClassName", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.String java.lang.Class.resolveName(java.lang.String)
         **/
        Lazy<Ref.Handle> ResolveName = Ref.lazy(() -> $Type.get().handle("resolveName", String.class, String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?>[] java.lang.Class.getDeclaredClasses() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetDeclaredClasses = Ref.lazy(() -> $Type.get().handle("getDeclaredClasses", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * static byte[] java.lang.Class.getExecutableTypeAnnotationBytes(java.lang.reflect.Executable)
         **/
        Lazy<Ref.Handle.Alive> GetExecutableTypeAnnotationBytes = Ref.lazy(() -> $Type.get().findStatic("getExecutableTypeAnnotationBytes", byte[][].class, Executable.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.String java.lang.Class.getGenericSignature0()
         **/
        Lazy<Ref.Handle> GetGenericSignature0 = Ref.lazy(() -> $Type.get().handle("getGenericSignature0", String.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private native java.lang.Class<?>[] java.lang.Class.getDeclaredClasses0()
         **/
        Lazy<Ref.Handle> GetDeclaredClasses0 = Ref.lazy(() -> $Type.get().handle("getDeclaredClasses0", Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /** private void java.lang.Class.checkPackageAccess(java.lang.SecurityManager,java.lang.ClassLoader,boolean) **/
        //Ref.Lazy<Ref.Handle> CheckPackageAccess=Ref.lazy(()->$Type.get().handle("checkPackageAccess",void.class,java.lang.SecurityManager.class,java.lang.ClassLoader.class,boolean.class).orElseThrow(()->new IllegalStateException("No value present")));
        /**
         * public boolean java.lang.Class.isAnonymousClass()
         **/
        Lazy<Ref.Handle> IsAnonymousClass = Ref.lazy(() -> $Type.get().handle("isAnonymousClass", boolean.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.reflect.Method java.lang.Class.getMethod0(java.lang.String,java.lang.Class<?>[])
         **/
        Lazy<Ref.Handle> GetMethod0 = Ref.lazy(() -> $Type.get().handle("getMethod0", Method.class, String.class, Ref.type("java.lang.Class[]").element()).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * public java.lang.Class<?> java.lang.Class.getEnclosingClass() throws java.lang.SecurityException
         **/
        Lazy<Ref.Handle> GetEnclosingClass = Ref.lazy(() -> $Type.get().handle("getEnclosingClass", Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class$AnnotationData java.lang.Class.createAnnotationData(int)
         **/
        Lazy<Ref.Handle> CreateAnnotationData = Ref.lazy(() -> $Type.get().handle("createAnnotationData", Ref.type("java.lang.Class.AnnotationData").element(), int.class).orElseThrow(() -> new IllegalStateException("No value present")));
        /**
         * private java.lang.Class(java.lang.ClassLoader,java.lang.Class<?>)
         **/
        Lazy<Ref.Handle.Alive> CREATE = Ref.lazy(() -> $Type.get().findConstructor(ClassLoader.class, Class.class).orElseThrow(() -> new IllegalStateException("No value present")));
    }
    //endregion
}
