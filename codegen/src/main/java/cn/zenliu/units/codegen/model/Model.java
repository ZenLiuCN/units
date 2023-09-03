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

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

/**
 * Simple Model
 *
 * @author Zen.Liu
 * @since 2023-05-09
 */
@SuppressWarnings("unused")

@Value.Enclosing
@ModelStyle
public interface Model {
  /*  interface TypeVisitor<R> {

        default R onType(Type type, R value) {
            if (type.isEnumType()) return onEnumType(type.asEnumType().get(), value);
            if (type.isRecordType()) return onRecordType(type.asRecordType().get(), value);
            if (type.isAnnotationType()) return onAnnotationType(type.asAnnotationType().get(), value);
            if (type.isArrayType()) return onArrayType(type.asArrayType().get(), value);
            return value;
        }


        default R onEnumType(EnumType type, R value) {
            return value;
        }

        default R onRecordType(RecordType type, R value) {
            return value;
        }

        default R onArrayType(ArrayType type, R value) {
            return onType(type.getComponent(), value);
        }

        default R onAnnotationType(AnnotationType type, R value) {
            return value;
        }

    }

    interface GenericTypeVisitor<R> {
        @SuppressWarnings("OptionalGetWithoutIsPresent")
        default R onType(Type type, R value) {
            if (type.isGenericType()) return onGenericType(type.asGenericType().get(), value);
            if (type.isParameterizedType()) return onParameterizedType(type.asParameterizedType().get(), value);
            return value;
        }

        default R onGenericType(GenericType element, R value) {
            return value;
        }

        default R onParameterizedType(ParameterizedType element, R value) {
            return value;
        }

    }*/

    interface With {
        interface Modifier {

            int modifier();

            //   void setModifier(int modifier);

            //region Defaults

            default boolean isAbstract() {
                return java.lang.reflect.Modifier.isAbstract(modifier());
            }

            default boolean isPublic() {
                return java.lang.reflect.Modifier.isPublic(modifier());
            }

            default boolean isPrivate() {
                return java.lang.reflect.Modifier.isPrivate(modifier());
            }

            default boolean isProtected() {
                return java.lang.reflect.Modifier.isProtected(modifier());
            }

            default boolean isStatic() {
                return java.lang.reflect.Modifier.isStatic(modifier());
            }

            default boolean isFinal() {
                return java.lang.reflect.Modifier.isFinal(modifier());
            }

            default boolean isSynchronized() {
                return java.lang.reflect.Modifier.isSynchronized(modifier());
            }

            default boolean isVolatile() {
                return java.lang.reflect.Modifier.isVolatile(modifier());
            }

            default boolean isTransient() {
                return java.lang.reflect.Modifier.isTransient(modifier());
            }

            default boolean isNative() {
                return java.lang.reflect.Modifier.isNative(modifier());
            }

            default boolean isInterface() {
                return java.lang.reflect.Modifier.isInterface(modifier());
            }

            default boolean isStrict() {
                return java.lang.reflect.Modifier.isStrict(modifier());
            }
           default boolean isBridge(){return (modifier()& 0x00000040)!=0;}
           default boolean isVarargs(){return (modifier()& 0x00000080)!=0;}
           default boolean isSynthetic(){return (modifier()& 0x00001000)!=0;}
           default boolean isAnnotation(){return (modifier()& 0x00002000)!=0;}
           default boolean isEnum(){return (modifier()& 0x00004000)!=0;}
           default boolean isMandated(){return (modifier()& 0x00008000)!=0;}
/*
            //---------------
            default void setAbstract() {

                setModifier(getModifier() | java.lang.reflect.Modifier.ABSTRACT);
            }

            default void setPublic() {

                setModifier(getModifier() | java.lang.reflect.Modifier.PUBLIC);
            }

            default void setPrivate() {

                setModifier(getModifier() | java.lang.reflect.Modifier.PRIVATE);
            }

            default void setProtected() {

                setModifier(getModifier() | java.lang.reflect.Modifier.PROTECTED);
            }

            default void setStatic() {

                setModifier(getModifier() | java.lang.reflect.Modifier.STATIC);
            }

            default void setFinal() {

                setModifier(getModifier() | java.lang.reflect.Modifier.FINAL);
            }

            default void setSynchronized() {

                setModifier(getModifier() | java.lang.reflect.Modifier.SYNCHRONIZED);
            }

            default void setVolatile() {

                setModifier(getModifier() | java.lang.reflect.Modifier.VOLATILE);
            }

            default void setTransient() {

                setModifier(getModifier() | java.lang.reflect.Modifier.TRANSIENT);
            }

            default void setNative() {

                setModifier(getModifier() | java.lang.reflect.Modifier.NATIVE);
            }

            default void setInterface() {

                setModifier(getModifier() | java.lang.reflect.Modifier.INTERFACE);
            }

            default void setStrict() {

                setModifier(getModifier() | java.lang.reflect.Modifier.STRICT);
            }*/

            //endregion
        }


        interface Name {

            String name();
        }


        interface Package {

            Pkg pkg();
        }

        interface Annotated {
            List<Annotation> annotations();
        }

        interface GeneralParams {
            List<TypeParam> typeParams();
        }

        interface GeneralVars {
            List<TypeVar> typeVars();

        }

        interface DeclaringType {
            Optional<Model.Type> declaringType();
        }

        interface Type {
            Optional<Model.Type> type();
        }

        interface DeclaredTypes {
            List<Model.Type> declaredTypes();
        }

        interface Extended {
            Optional<Model.Type> superType();
        }

        interface Implements {
            List<Model.Type> implemented();
        }

        interface FieldHolder {
            List<Field> fields();
        }

        interface MethodHolder {
            List<Method> methods();
        }
    }


    //region Types

    interface Type extends Model
            , With.Package
            , With.Annotated
            , With.Modifier
            , With.Name
            , With.DeclaringType
            , With.DeclaredTypes {


        default boolean isAnnotationType() {
            return this instanceof AnnotationType;
        }

        default Optional<AnnotationType> asAnnotationType() {
            return isEnumType() ? Optional.of((AnnotationType) this) : Optional.empty();
        }

        default boolean isEnumType() {
            return this instanceof EnumType;
        }

        default Optional<EnumType> asEnumType() {
            return isEnumType() ? Optional.of((EnumType) this) : Optional.empty();
        }

        default boolean isRecordType() {
            return this instanceof RecordType;
        }

        default Optional<RecordType> asRecordType() {
            return isEnumType() ? Optional.of((RecordType) this) : Optional.empty();
        }

        default boolean isArrayType() {
            return this instanceof ArrayType;
        }

        default Optional<ArrayType> asArrayType() {
            return isEnumType() ? Optional.of((ArrayType) this) : Optional.empty();
        }

        default boolean isGenericType() {
            return this instanceof GenericType;
        }

        default Optional<GenericType> asGenericType() {
            return isEnumType() ? Optional.of((GenericType) this) : Optional.empty();
        }

        default boolean isParameterizedType() {
            return this instanceof ParameterizedType;
        }

        default Optional<ParameterizedType> asParameterizedType() {
            return isEnumType() ? Optional.of((ParameterizedType) this) : Optional.empty();
        }
    }

    @Value.Immutable
    interface Pkg extends Model
            , With.Name
            , With.Annotated {
        String DEFAULT = "";

        @Override
        @Value.Parameter
        String name();

        default boolean isDefault() {
            return name().equals(DEFAULT);
        }
    }

    @Value.Immutable
    interface RawType extends Type
            , With.FieldHolder
            , With.MethodHolder
            , With.Implements
            , With.Extended {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();
    }

    @Value.Immutable
    interface EnumType extends Type
            , With.FieldHolder
            , With.MethodHolder
            , With.Implements {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();

        List<String> names();
    }

    @Value.Immutable
    interface RecordType extends Type
            , With.FieldHolder
            , With.MethodHolder
            , With.Implements {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();
    }


    @Value.Immutable
    interface ArrayType extends Type {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();

        Optional<Type> componentType();

        @Value.Parameter
        int dimension();
    }

    @Value.Immutable
    interface AnnotationType extends Type
            , With.MethodHolder {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();

    }


    //endregion

    //region Method
    @Value.Immutable
    interface Method extends Model
            , With.Modifier
            , With.Name
            , With.Annotated
            , With.GeneralVars
            , With.DeclaringType {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();


        List<Parameter> parameters();

        Optional<Type> returnType();

    }

    @Value.Immutable
    interface Parameter extends Model
            , With.Modifier
            , With.Name
            , With.Annotated
            , With.Type {

        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();
    }

    //endregion

    //region Field
    @Value.Immutable
    interface Field extends Model
            , With.Name
            , With.Modifier
            , With.Annotated
            , With.DeclaringType {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();


        @Value.Parameter
        Type type();
    }
    //endregion

    //region Generic
    interface Generic extends Model {
    }

    interface RawGenericType extends Generic
            , Type
            , With.GeneralVars {
        default boolean isParameterizedType() {
            return this instanceof ParameterizedType;
        }
    }

    @Value.Immutable
    interface GenericType extends RawGenericType {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();
    }

    @Value.Immutable
    interface ParameterizedType extends RawGenericType
            , With.GeneralParams {
        @Override
        @Value.Parameter
        int modifier();

        @Override
        @Value.Parameter
        String name();

        @Override
        @Value.Parameter
        Pkg pkg();
    }

    @Value.Immutable
    interface TypeVar extends Generic
            , With.Name {
        String ANY = "?";
        String WILDCARD = "*";

        @Override
        @Value.Parameter
        String name();

        default boolean isAny() {
            return name().equals(ANY);
        }

        default boolean isWildcard() {
            return name().equals(WILDCARD);
        }

        List<Generic> getUpBound();

        List<Generic> getLowBound();
    }

    @Value.Immutable
    interface TypeParam extends Model
            , With.Name {
        @Override
        @Value.Parameter
        String name();

        @Value.Parameter
        Type type();
    }
    //endregion

    //region Values
    interface Values extends Model {
    }

    @Value.Immutable
    interface Annotation extends Values, With.DeclaringType {
        @Value.Parameter
        AnnotationType type();

        List<AnnotatedValue> values();
    }

    @Value.Immutable
    interface AnnotatedValue extends Values, With.Name {
        @Override
        @Value.Parameter
        String name();

        @Value.Parameter
        Type type();

        default boolean isDefault() {
            return !value().isPresent();
        }

        /**
         * One of String, Primitives, Annotation and their array type.
         */
        Optional<Object> value();
    }

    @Value.Immutable
    interface Enum extends Values {
        @Value.Parameter
        Type type();
        @Value.Parameter
        String name();
    }

    //endregion

}
