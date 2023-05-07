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

package cn.zenliu.units.codegen;


import cn.zenliu.units.binary.Bytes;
import lombok.*;
import lombok.experimental.Accessors;

import java.lang.reflect.*;
import java.util.*;


/**
 * TypeInfo for a generated type
 */
@Builder
@EqualsAndHashCode(doNotUseGetters = true)
public class TypeInfo {
    public String toString() {
        return "TypeInfo(name=" + this.name +
                ", typeClass=" + (this.typeClass != null ? this.typeClass.name : null) +
                ", type=" + this.type +
                ", parameterized=" + this.parameterized +
                ", typeArguments=" + this.typeArguments +
                ", array=" + this.array +
                ", boundary=" + this.boundary +
                ", upper=" + this.upper +
                ", lower=" + this.lower + ")";
    }

    @Getter
    @Accessors(fluent = true)
    public static class LazyClass {
        /**
         * The class name, same as {@link Class#getName()}
         */
        final String name;


        Class<?> cls;

        @SneakyThrows
        public Class<?> cls() {
            if (cls == null) {
                cls = Class.forName(name);
            }
            return cls;
        }

        public LazyClass(Class<?> cls) {
            this.cls = cls;
            this.name = cls.getName();
        }

        public static LazyClass of(Class<?> cls) {
            return new LazyClass(cls);
        }

        public LazyClass(String name) {
            this.name = name;
            this.cls = null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LazyClass lazyClass = (LazyClass) o;
            return name.equals(lazyClass.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return name;
        }

        public static LazyClass of(String clsName) {
            return new LazyClass(clsName);
        }

        public static LazyClass OBJECT = of(Object.class);
    }

    @Getter
    final String name;

    public Class<?> getTypeClass() {
        return typeClass == null ? null : typeClass.cls();
    }

    final LazyClass typeClass;

    public LazyClass typeClass() {
        return typeClass;
    }

    @Getter
    final TypeInfo type;

    @Getter
    final boolean parameterized;
    /**
     * for a root container, it also contains type parameters passed to super interfaces and classes.
     */
    @Getter
    final List<TypeInfo> typeArguments;

    @Getter
    final boolean array;

    @Getter
    final boolean boundary;
    @Getter
    final List<TypeInfo> upper;
    @Getter
    final List<TypeInfo> lower;

    /**
     * check one of {@link #typeClass} or {@link #type} should exist;
     */
    public boolean empty() {
        return typeClass == null && type == null;
    }

    /**
     * Current info not contains any things but a {@link #type}
     */
    public boolean isHolder() {
        return type != null &&
                (name == null || name.isEmpty()) &&
                !parameterized &&
                !boundary &&
                !array &&
                typeClass == null;
    }

    /**
     * reduce useless level
     */
    public TypeInfo flatten() {
        if (empty()) return this;
        if (isHolder()) {
            return type.flatten();
        }
        return this;
    }

    @SneakyThrows
    static TypeInfo deserialize(Bytes buf) {
        var b = TypeInfo.builder()
                .name(buf.readString());
        //type class
        if (buf.readBoolean()) {
            b.typeClass(new LazyClass(buf.readString()));
        }
        //type
        if (buf.readBoolean()) {
            b.type(deserialize(buf));
        }
        //parameterized
        {
            var n = buf.readInt();
            if (n > 0) {
                var l = new ArrayList<TypeInfo>();
                for (int i = 0; i < n; i++) {
                    l.add(deserialize(buf));
                }
                b.parameterized(true)
                        .typeArguments(l);
            }
        }
        //array
        b.array(buf.readBoolean());
        //boundary
        var boundary = buf.readBoolean();
        b.boundary(boundary);
        if (boundary) {
            //boundary upper
            if (buf.readBoolean()) {
                var n = buf.readInt();
                var lst = new ArrayList<TypeInfo>();
                for (int i = 0; i < n; i++) {
                    lst.add(deserialize(buf));
                }
                b.upper(lst);
            }
            //boundary lower
            if (buf.readBoolean()) {
                var n = buf.readInt();
                var lst = new ArrayList<TypeInfo>();
                for (int i = 0; i < n; i++) {
                    lst.add(deserialize(buf));
                }
                b.lower(lst);
            }
        }

        return b.build();
    }

    static void serialize(TypeInfo info, Bytes buf) {
        buf.put(info.name);
        //type class
        if (info.typeClass != null) {
            buf.put(true).put(info.typeClass.name());
        } else
            buf.put(false);
        //type
        if (info.type != null) {
            buf.put(true);
            serialize(info.type, buf);
        } else
            buf.put(false);
        //parameterized
        if (info.parameterized && info.typeArguments != null && !info.typeArguments.isEmpty()) {
            buf.put(info.typeArguments.size());
            for (var a : info.typeArguments) serialize(a, buf);
        } else {
            buf.put(0);
        }
        //array
        buf.put(info.array);
        //boundary
        buf.put(info.boundary);
        if (info.boundary) {
            if (info.upper != null && !info.upper.isEmpty()) {
                buf.put(true);
                buf.put(info.upper.size());
                for (var i : info.upper) {
                    serialize(i, buf);
                }
            } else {
                buf.put(false);
            }
            if (info.lower != null) {
                buf.put(true);
                buf.put(info.lower.size());
                for (var i : info.lower) {
                    serialize(i, buf);
                }
            } else {
                buf.put(false);
            }
        }
    }

    /**
     * Write to binary present.
     */
    public static byte[] serialize(TypeInfo info) {
        var buf = Bytes.write(new byte[1024], 0, 256);
        serialize(info, buf);
        return Arrays.copyOf(buf.buf(), buf.index());
    }

    /**
     * From a byte array.
     */
    public static TypeInfo deserialize(byte[] buf) {
        return deserialize(Bytes.read(buf));
    }

    /**
     * From a Base64 binary.
     *
     * @param base64 base64 std encoded string
     */
    public static TypeInfo deserialize(String base64) {
        return deserialize(Bytes.read(Base64.getDecoder().decode(base64)));
    }

    public static TypeInfo from(Type info) {
        var b = TypeInfo.builder().name("");
        if (info instanceof Class<?>) {
            var cls = (Class<?>) info;
            b.array(cls.isArray())
                    .typeClass(new LazyClass(cls));
        } else if (info instanceof ParameterizedType ) {
            var p=(ParameterizedType)info;
            var raw = p.getRawType();
            b.parameterized(true);
            b.type(from(raw));
            var lst = new ArrayList<TypeInfo>();
            for (var argument : p.getActualTypeArguments()) {
                lst.add(from(argument));
            }
            b.typeArguments(lst);
        } else if (info instanceof GenericArrayType ) {
            var p=(GenericArrayType)info;
            var raw = p.getGenericComponentType();
            b.array(true);
            b.type(from(raw));
        } else if (info instanceof TypeVariable<?> ) {
            var p=(TypeVariable<?>)info;
            b.name(p.getName());
            var boundary = p.getBounds().length > 0;
            b.boundary(boundary);
            if (boundary) {
                var lst = new ArrayList<TypeInfo>();
                for (var bound : p.getBounds()) {
                    lst.add(from(bound));
                }
                b.upper(lst);
            } else {
                b.typeClass(new LazyClass(Object.class));
            }
        } else if (info instanceof WildcardType ) {
            var p=(WildcardType)info;
            b.name("*");
            var boundary = p.getLowerBounds().length > 0 || p.getUpperBounds().length > 0;
            b.boundary(boundary);
            if (boundary) {
                {
                    var lst = new ArrayList<TypeInfo>();
                    for (var bound : p.getUpperBounds()) {
                        lst.add(from(bound));
                    }
                    b.upper(lst);
                }
                {
                    var lst = new ArrayList<TypeInfo>();
                    for (var bound : p.getLowerBounds()) {
                        lst.add(from(bound));
                    }
                    b.upper(lst);
                }
            } else {
                b.typeClass(LazyClass.of(Object.class));
            }
        } else {
            throw new IllegalStateException("unknown type to process: " + info);
        }
        return b.build().flatten();
    }


    /**
     * @param filed the field may have a {@link Info.Type}
     * @return empty if not found
     */
    public static Optional<TypeInfo> visit(Field filed) {
        var a = filed.getAnnotationsByType(Info.Type.class);
        if (a.length == 0) return Optional.empty();
        return Optional.of(deserialize(a[0].value()));
    }

    public static Optional<TypeInfo> onType(Class<?> type) {
        var an = type.getAnnotation(Info.Type.class);
        if (an == null) return Optional.empty();
        return Optional.of(TypeInfo.deserialize(an.value()));
    }

}