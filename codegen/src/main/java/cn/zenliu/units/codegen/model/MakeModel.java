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

package cn.zenliu.units.codegen.model;


import cn.zenliu.units.codegen.model.Models.*;

import java.lang.reflect.Modifier;
import java.util.function.Supplier;


/**
 * @author Zen.Liu
 * @since 2023-05-09
 */
public interface MakeModel {
    class Lazy<T> {
        volatile T value;

        Lazy(Supplier<T> supplier) {
            this.supplier = supplier;
        }

        public static <T> Lazy<T> of(Supplier<T> supplier) {
            return new Lazy<>(supplier);
        }

        Supplier<T> supplier;

        public T get() {
            if (value == null) synchronized (this) {
                if (value == null) value = supplier.get();
                supplier = null;
            }
            return value;
        }
    }

    Lazy<Model.RawType> INT_TYPE = Lazy.of(() -> rawType(0, "", "int").build());
    Lazy<Model.RawType> LONG_TYPE = Lazy.of(() -> rawType(0, "", "long").build());
    Lazy<Model.RawType> SHORT_TYPE = Lazy.of(() -> rawType(0, "", "short").build());
    Lazy<Model.RawType> BYTE_TYPE = Lazy.of(() -> rawType(0, "", "byte").build());
    Lazy<Model.RawType> BOOLEAN_TYPE = Lazy.of(() -> rawType(0, "", "boolean").build());
    Lazy<Model.RawType> DOUBLE_TYPE = Lazy.of(() -> rawType(0, "", "double").build());
    Lazy<Model.RawType> FLOAT_TYPE = Lazy.of(() -> rawType(0, "", "float").build());
    Lazy<Model.RawType> CHAR_TYPE = Lazy.of(() -> rawType(0, "", "char").build());

    Lazy<Model.RawType> OBJECT = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Object").build());
    Lazy<Model.RawType> STRING = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "String").build());
    Lazy<Model.RawType> INTEGER = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Integer").build());
    Lazy<Model.RawType> LONG = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Long").build());
    Lazy<Model.RawType> SHORT = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Short").build());
    Lazy<Model.RawType> BYTE = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Byte").build());
    Lazy<Model.RawType> BOOLEAN = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Boolean").build());
    Lazy<Model.RawType> DOUBLE = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Double").build());
    Lazy<Model.RawType> FLOAT = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Float").build());
    Lazy<Model.RawType> CHARACTER = Lazy.of(() -> rawType(Modifier.PUBLIC, "java.lang", "Character").build());

    static RawType.Builder rawType(int modifier, String pkg, String name) {
        return RawType.builder().name(name).modifier(modifier).pkg(Pkg.builder().name(pkg).build());
    }

    static RawType.Builder rawType(Class<?> type) {
        return RawType.builder()
                .name(type.getSimpleName()).modifier(type.getModifiers())
                .pkg(Pkg.builder().name(type.getPackage().getName())
                        .build());
    }


    static GenericType.Builder generic(int modifier, String pkg, String name, Iterable<Model.TypeVar> typeVars) {
        return GenericType.builder()
                .name(name)
                .modifier(modifier)
                .pkg(Pkg.builder().name(pkg).build())
                .typeVars(typeVars)
                ;
    }

    static ParameterizedType.Builder parameterized(GenericType genericType, Iterable<Model.TypeParam> typeParams) {
        return ParameterizedType.builder()
                .from(genericType)
                .typeParams(typeParams)
                ;
    }

    static TypeParam.Builder typeParameter(String name, Model.Type type) {
        return TypeParam.builder()
                .name(name)
                .type(type);
    }

    static TypeVar.Builder typeVariable(String name) {
        return TypeVar.builder()
                .name(name)
                ;
    }

    static Parameter.Builder parameter(String name, Model.Type type) {
        return Parameter.builder().modifier(0).name(name).type(type);
    }


    static Method.Builder method(String name) {
        return Method.builder()
                .modifier(0)
                .name(name)
                ;
    }

    static Field.Builder field(String name, Model.Type type) {
        return Field.builder()
                .modifier(0)
                .name(name)
                .type(type)
                ;
    }

    static ModifierBuilder modifier() {
        return new ModifierBuilder();
    }

    class ModifierBuilder implements Model.With.Modifier {
        public int modifier() {
            return modifier;
        }

        public ModifierBuilder setPublic() {
            modifier |= Modifier.PUBLIC;
            return this;
        }

        public ModifierBuilder setPrivate() {
            modifier |= Modifier.PRIVATE;
            return this;
        }

        public ModifierBuilder setProtected() {
            modifier |= Modifier.PROTECTED;
            return this;
        }

        public ModifierBuilder setStatic() {
            modifier |= Modifier.STATIC;
            return this;
        }

        public ModifierBuilder setFinal() {
            modifier |= Modifier.FINAL;
            return this;
        }

        public ModifierBuilder setSynchronized() {
            modifier |= Modifier.SYNCHRONIZED;
            return this;
        }

        public ModifierBuilder setVolatile() {
            modifier |= Modifier.VOLATILE;
            return this;
        }

        public ModifierBuilder setTransient() {
            modifier |= Modifier.TRANSIENT;
            return this;
        }

        public ModifierBuilder setNative() {
            modifier |= Modifier.NATIVE;
            return this;
        }

        public ModifierBuilder setInterface() {
            modifier |= Modifier.INTERFACE;
            return this;
        }

        public ModifierBuilder setAbstract() {
            modifier |= Modifier.ABSTRACT;
            return this;
        }

        public ModifierBuilder setStrict() {
            modifier |= Modifier.STRICT;
            return this;
        }

        public ModifierBuilder setBridge() {
            modifier |= 0x00000040;
            return this;
        }

        public ModifierBuilder setVarargs() {
            modifier |= 0x00000080;
            return this;
        }

        public ModifierBuilder setSynthetic() {
            modifier |= 0x00001000;
            return this;
        }

        public ModifierBuilder setAnnotation() {
            modifier |= 0x00002000;
            return this;
        }

        public ModifierBuilder setEnum() {
            modifier |= 0x00004000;
            return this;
        }

        public ModifierBuilder setMandated() {
            modifier |= 0x00008000;
            return this;
        }

        private int modifier;


    }

}
