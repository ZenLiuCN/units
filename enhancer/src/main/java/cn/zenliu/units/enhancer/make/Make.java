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

package cn.zenliu.units.enhancer.make;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeDescription.Generic;
import net.bytebuddy.description.type.TypeVariableToken;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.UnaryOperator;

import static java.util.Collections.emptyList;
import static net.bytebuddy.matcher.ElementMatchers.none;

/**
 * ElementMaker
 */
@SuppressWarnings("unused")
public interface Make<S extends Make<S>> {
    S $self();

    void $validate();

    //region Components

    interface Modifiers<S extends Modifiers<S>> extends Make<S> {
        int $modifiers();

        void $modifiers(int v);

        default Integer maybe() {
            int i = $modifiers();
            return i == 0 ? null : i;
        }

        default S modifiers(int v) {
            $modifiers(v);
            return $self();
        }

        //region Api
        //@formatter:off
        default S Public() {
            $modifiers($modifiers() | Modifier.PUBLIC);
            return $self();
        }

        default S Private() {
            $modifiers($modifiers() | Modifier.PRIVATE);
            return $self();
        }

        default S Protected() {
            $modifiers($modifiers() | Modifier.PROTECTED);
            return $self();
        }

        default S Static() {
            $modifiers($modifiers() | Modifier.STATIC);
            return $self();
        }

        default S Final() {
            $modifiers($modifiers() | Modifier.FINAL);
            return $self();
        }

        default S Synchronized() {
            $modifiers($modifiers() | Modifier.SYNCHRONIZED);
            return $self();
        }

        default S Volatile() {
            $modifiers($modifiers() | Modifier.VOLATILE);
            return $self();
        }

        default S Transient() {
            $modifiers($modifiers() | Modifier.TRANSIENT);
            return $self();
        }

        default S Native() {
            $modifiers($modifiers() | Modifier.NATIVE);
            return $self();
        }

        default S Interface() {
            $modifiers($modifiers() | Modifier.INTERFACE);
            return $self();
        }

        default S Abstract() {
            $modifiers($modifiers() | Modifier.ABSTRACT);
            return $self();
        }

        default S Bridge() {
            $modifiers($modifiers() | 0x00000040);
            return $self();
        }

        default S Varargs() {
            $modifiers($modifiers() | 0x00000080);
            return $self();
        }

        default S Synthetic() {
            $modifiers($modifiers() | 0x00001000);
            return $self();
        }

        default S Annotation() {
            $modifiers($modifiers() | 0x00002000);
            return $self();
        }

        default S Enum() {
            $modifiers($modifiers() | 0x00004000);
            return $self();
        }

        default S Mandated() {
            $modifiers($modifiers() | 0x00008000);
            return $self();
        }

        default S NotPublic() {
            $modifiers($modifiers() & ~Modifier.PUBLIC);
            return $self();
        }

        default S NotPrivate() {
            $modifiers($modifiers() & ~Modifier.PRIVATE);
            return $self();
        }

        default S NotProtected() {
            $modifiers($modifiers() & ~Modifier.PROTECTED);
            return $self();
        }

        default S NotStatic() {
            $modifiers($modifiers() & ~Modifier.STATIC);
            return $self();
        }

        default S NotFinal() {
            $modifiers($modifiers() & ~Modifier.FINAL);
            return $self();
        }

        default S NotSynchronized() {
            $modifiers($modifiers() & ~Modifier.SYNCHRONIZED);
            return $self();
        }

        default S NotVolatile() {
            $modifiers($modifiers() & ~Modifier.VOLATILE);
            return $self();
        }

        default S NotTransient() {
            $modifiers($modifiers() & ~Modifier.TRANSIENT);
            return $self();
        }

        default S NotNative() {
            $modifiers($modifiers() & ~Modifier.NATIVE);
            return $self();
        }

        default S NotInterface() {
            $modifiers($modifiers() & ~Modifier.INTERFACE);
            return $self();
        }

        default S NotAbstract() {
            $modifiers($modifiers() & ~Modifier.ABSTRACT);
            return $self();
        }

        default S NotBridge() {
            $modifiers($modifiers() & ~0x00000040);
            return $self();
        }

        default S NotVarargs() {
            $modifiers($modifiers() & ~0x00000080);
            return $self();
        }

        default S NotSynthetic() {
            $modifiers($modifiers() & ~0x00001000);
            return $self();
        }

        default S NotAnnotation() {
            $modifiers($modifiers() & ~0x00002000);
            return $self();
        }

        default S NotEnum() {
            $modifiers($modifiers() & ~0x00004000);
            return $self();
        }

        default S NotMandated() {
            $modifiers($modifiers() & ~0x00008000);
            return $self();
        }

        //@formatter:on
        //endregion
        default S And(int v) {
            $modifiers($modifiers() | v);
            return $self();
        }

        default S Not(int v) {
            $modifiers($modifiers() & ~v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($modifiers() == 0) $modifiers(Modifier.PRIVATE);
        }

        default int modifiers() {
            return $modifiers();
        }


    }

    interface Name<S extends Name<S>> extends Make<S> {
        String $name();

        void $name(String v);

        default String name() {
            return $name();
        }

        default S name(String v) {
            $name(v);
            return $self();
        }

        @Override
        default void $validate() {
            String name = $name();
            if (name == null || name.isEmpty()
                    || (!Character.isUnicodeIdentifierStart(name.charAt(0)))
                    || (!name.chars().skip(1).allMatch(Character::isUnicodeIdentifierPart))
            )
                throw new AssertionError("invalid name '" + name + "'");
        }

        abstract class Base<S extends Base<S>> implements Name<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected String $name;
        }
    }

    interface Identifier<S extends Identifier<S>> extends Make<S> {
        String $identifier();

        void $identifier(String v);

        default String identifier() {
            return $identifier();
        }

        default S identifier(String v) {
            $identifier(v);
            return $self();
        }

        @Override
        default void $validate() {
            String name = $identifier();
            if (name == null || name.isEmpty()
                    || (!Character.isUnicodeIdentifierStart(name.charAt(0)))
                    || (!name.chars().skip(1)
                    .allMatch(DOT.or(Character::isUnicodeIdentifierPart)))
            )
                throw new AssertionError("invalid name '" + name + "'");
        }

        IntPredicate DOT = x -> x == '.';


    }

    /*
    //LIST TEMPLATE

    interface $Name$<S extends $Name$<S>> extends Maker<S> {
        void $name$($Type$ v);
        $Type$ $name$();
        default S add$EName$($EType$ v){
            var vs=$name$();
            if(vs==null) $name$(vs=new ArrayList<>());
            vs.add(v);
            return $self();
        }
        default $Type$ $name0$(){
                return $name$();
        }
        default S $name0$($Type$ v){
            $name$(v);
            return $self();
        }
        @Override
        default void $validate() {
            if ($name$() == null)
                $name$(Collections.emptyList());
        }
        abstract class Base<S extends Base<S>> implements $Name$<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected $Type$ $name$;
        }
    }
     */
    interface Annotations<S extends Annotations<S>> extends Make<S> {
        void $annotations(List<AnnotationDescription> v);

        List<AnnotationDescription> $annotations();

        default S addAnnotation(AnnotationDescription v) {
            List<AnnotationDescription> vs = $annotations();
            if (vs == null) $annotations(vs = new ArrayList<>());
            vs.add(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($annotations() == null)
                $annotations(emptyList());
        }

        default List<AnnotationDescription> annotations() {
            return $annotations();
        }

        default S annotations(List<AnnotationDescription> v) {
            $annotations(v);
            return $self();
        }

        default S annotation(TypeDescription anno, UnaryOperator<AnnotationDescription.Builder> v) {
            return addAnnotation(v.apply(AnnotationDescription.Builder.ofType(anno)).build());
        }

        abstract class Base<S extends Base<S>> implements Annotations<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<AnnotationDescription> $annotations;
        }
    }

    interface Bounds<S extends Bounds<S>> extends Make<S> {
        void $bounds(List<Generic> v);

        List<Generic> $bounds();

        default S addBound(Generic v) {
            List<Generic> vs = $bounds();
            if (vs == null) $bounds(vs = new ArrayList<>());
            vs.add(v);
            return $self();
        }

        default List<Generic> bounds() {
            return $bounds();
        }

        default S bounds(List<Generic> v) {
            $bounds(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($bounds() == null)
                $bounds(emptyList());
        }

        default S bound(Class<?> simple) {
            assert simple.getTypeParameters().length == 0 : "type parameters should be zero";
            return addBound(Generic.OfNonGenericType.ForLoadedType.of(simple));
        }

        default S bound(Class<?> raw, UnaryOperator<Generic.Builder> build) {
            assert raw.getTypeParameters().length != 0 : "type parameters is empty";
            return addBound(build.apply(Generic.Builder.of(raw)).build());
        }

        abstract class Base<S extends Base<S>> implements Bounds<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<Generic> $bounds;
        }
    }

    interface DeclaringClass<S extends DeclaringClass<S>> extends Make<S> {
        TypeDescription $declaringClass();

        void $declaringClass(TypeDescription v);

        default TypeDescription declaringClass() {
            return $declaringClass();
        }

        default S declaringClass(TypeDescription v) {
            $declaringClass(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($declaringClass() == null) throw new IllegalStateException("missing DeclaringClass");
        }

        default S declaringClass(Class<?> simple) {
            assert simple.getTypeParameters().length == 0 : "type parameters should be zero";
            return declaringClass(TypeDescription.ForLoadedType.of(simple));
        }

        abstract class Base<S extends Base<S>> implements DeclaringClass<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected TypeDescription $declaringClass;
        }

        interface Generic<S extends Generic<S>> extends Make<S> {
            TypeDescription.Generic $declaringClass();

            void $declaringClass(TypeDescription.Generic v);

            default TypeDescription.Generic declaringClass() {
                return $declaringClass();
            }

            default S declaringClass(TypeDescription.Generic v) {
                $declaringClass(v);
                return $self();
            }

            @Override
            default void $validate() {
                if ($declaringClass() == null) throw new IllegalStateException("missing DeclaringClass");
            }

            default S declaringClass(Class<?> simple) {
                assert simple.getTypeParameters().length == 0 : "type parameters should be zero";
                return declaringClass(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(simple));
            }

            default S declaringClass(Class<?> raw, UnaryOperator<TypeDescription.Generic.Builder> build) {
                return declaringClass(build.apply(TypeDescription.Generic.Builder.of(raw)).build());
            }

            abstract class Base<S extends Base<S>> implements Generic<S> {
                @Getter
                @Setter
                @Accessors(fluent = true, chain = false)
                protected TypeDescription.Generic $declaringClass;
            }
        }
    }

    interface ExceptionTypes<S extends ExceptionTypes<S>> extends Make<S> {
        void $exceptionTypes(List<TypeDescription> v);

        List<TypeDescription> $exceptionTypes();

        default S addExceptionType(TypeDescription v) {
            List<TypeDescription> vs = $exceptionTypes();
            if (vs == null) $exceptionTypes(vs = new ArrayList<>());
            vs.add(v);
            return $self();
        }

        default List<TypeDescription> exceptionTypes() {
            return $exceptionTypes();
        }

        default S exceptionTypes(List<TypeDescription> v) {
            $exceptionTypes(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($exceptionTypes() == null)
                $exceptionTypes(emptyList());
        }

        default S exceptionType(Class<?> simple) {

            return addExceptionType(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(simple).asErasure());
        }


        abstract class Base<S extends Base<S>> implements ExceptionTypes<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<TypeDescription> $exceptionTypes;
        }

        interface Generic<S extends Generic<S>> extends Make<S> {
            void $exceptionTypes(List<TypeDescription.Generic> v);

            List<TypeDescription.Generic> $exceptionTypes();

            default S addExceptionType(TypeDescription.Generic v) {
                List<TypeDescription.Generic> vs = $exceptionTypes();
                if (vs == null) $exceptionTypes(vs = new ArrayList<>());
                vs.add(v);
                return $self();
            }

            default List<TypeDescription.Generic> exceptionTypes() {
                return $exceptionTypes();
            }

            default S exceptionTypes(List<TypeDescription.Generic> v) {
                $exceptionTypes(v);
                return $self();
            }

            @Override
            default void $validate() {
                if ($exceptionTypes() == null)
                    $exceptionTypes(emptyList());
            }

            default S exceptionType(Class<?> simple) {
                return addExceptionType(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(simple));
            }

            default S exceptionType(Class<?> raw, UnaryOperator<TypeDescription.Generic.Builder> build) {
                return addExceptionType(build.apply(TypeDescription.Generic.Builder.of(raw)).build());
            }

            abstract class Base<S extends Base<S>> implements Generic<S> {
                @Getter
                @Setter
                @Accessors(fluent = true, chain = false)
                protected List<TypeDescription.Generic> $exceptionTypes;
            }
        }
    }

    interface ReturnType<S extends ReturnType<S>> extends Make<S> {
        Generic $returnType();

        void $returnType(Generic v);

        default Generic returnType() {
            return $returnType();
        }

        default S returnType(Generic v) {
            $returnType(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($returnType() == null) $returnType(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(void.class));
        }

        default S returnType(Class<?> simple) {

            return returnType(Generic.OfNonGenericType.ForLoadedType.of(simple));
        }

        default S returnType(Class<?> raw, UnaryOperator<Generic.Builder> build) {

            return returnType(build.apply(Generic.Builder.of(raw)).build());
        }

        abstract class Base<S extends Base<S>> implements ReturnType<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected Generic $returnType;
        }
    }

    interface Type<S extends Type<S>> extends Make<S> {
        TypeDescription $type();

        void $type(TypeDescription v);

        default TypeDescription type() {
            return $type();
        }

        default S type(TypeDescription v) {
            $type(v);
            return $self();
        }

        default S type(Class<?> v) {
            return type(TypeDescription.ForLoadedType.of(v));
        }

        @Override
        default void $validate() {
            if ($type() == null) $type(TypeDescription.ForLoadedType.of(void.class));
        }

        abstract class Base<S extends Base<S>> implements Type<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected TypeDescription $type;
        }

        interface Generic<S extends Generic<S>> extends Make<S> {
            TypeDescription.Generic $type();

            void $type(TypeDescription.Generic v);

            default TypeDescription.Generic type() {
                return $type();
            }

            default S type(TypeDescription.Generic v) {
                $type(v);
                return $self();
            }

            @Override
            default void $validate() {
                if ($type() == null) $type(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(void.class));
            }

            default S type(Class<?> v) {
                return type(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(v));
            }

            default S type(Class<?> raw, UnaryOperator<TypeDescription.Generic.Builder> build) {

                return type(build.apply(TypeDescription.Generic.Builder.of(raw)).build());
            }

            abstract class Base<S extends Base<S>> implements Generic<S> {
                @Getter
                @Setter
                @Accessors(fluent = true, chain = false)
                protected TypeDescription.Generic $type;
            }
        }
    }

    interface SuperClass<S extends SuperClass<S>> extends Make<S> {
        TypeDescription $superClass();

        void $superClass(TypeDescription v);

        default TypeDescription superClass() {
            return $superClass();
        }

        default S superClass(TypeDescription v) {
            $superClass(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($superClass() == null) $superClass(TypeDescription.ForLoadedType.of(Object.class));
        }

        default S superClass(Class<?> v) {
            return superClass(TypeDescription.ForLoadedType.of(v));
        }

        abstract class Base<S extends Base<S>> implements Type<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected TypeDescription $superClass;
        }

        interface Generic<S extends Generic<S>> extends Make<S> {
            TypeDescription.Generic $superClass();

            void $superClass(TypeDescription.Generic v);

            default TypeDescription.Generic superClass() {
                return $superClass();
            }

            default S superClass(TypeDescription.Generic v) {
                $superClass(v);
                return $self();
            }

            @Override
            default void $validate() {
                if ($superClass() == null) $superClass(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(void.class));
            }

            default S superClass(Class<?> v) {
                return superClass(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(v));
            }

            default S superClass(Class<?> raw, UnaryOperator<TypeDescription.Generic.Builder> build) {

                return superClass(build.apply(TypeDescription.Generic.Builder.of(raw)).build());
            }


        }
    }

    interface Implements<S extends Implements<S>> extends Make<S> {
        void $implements(List<TypeDescription> v);

        List<TypeDescription> $implements();

        default S addImplement(TypeDescription v) {
            List<TypeDescription> vs = $implements();
            if (vs == null) $implements(vs = new ArrayList<>());
            vs.add(v);
            return $self();
        }

        default List<TypeDescription> interfaces() {
            return $implements();
        }

        default S interfaces(List<TypeDescription> v) {
            $implements(v);
            return $self();
        }

        default S implement(Class<?> simple) {
            assert simple.getTypeParameters().length == 0 : "type parameters should be zero";
            return addImplement(TypeDescription.ForLoadedType.of(simple));
        }

        default S implement(Class<?> raw, UnaryOperator<TypeDescription.Generic.Builder> build) {
            assert raw.getTypeParameters().length != 0 : "type parameters is empty";
            return addImplement(build.apply(TypeDescription.Generic.Builder.of(raw)).build().asErasure());
        }

        @Override
        default void $validate() {
            if ($implements() == null)
                $implements(emptyList());
        }

        default S implement(TypeDescription... implement) {
            List<TypeDescription> v = $implements();
            if (v == null) $implements(v = new ArrayList<>());
            v.addAll(Arrays.asList(implement));
            return $self();
        }

        default S implement(List<TypeDescription> implement) {
            List<TypeDescription> v = $implements();
            if (v == null) $implements(v = new ArrayList<>());
            v.addAll(implement);
            return $self();
        }

        abstract class Base<S extends Base<S>> implements Implements<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<TypeDescription> $implements;
        }

        interface Generic<S extends Generic<S>> extends Make<S> {
            void $implements(List<TypeDescription.Generic> v);

            List<TypeDescription.Generic> $implements();

            default S addImplement(TypeDescription.Generic v) {
                List<TypeDescription.Generic> vs = $implements();
                if (vs == null) $implements(vs = new ArrayList<>());
                vs.add(v);
                return $self();
            }

            default List<TypeDescription.Generic> interfaces() {
                return $implements();
            }

            default S interfaces(List<TypeDescription.Generic> v) {
                $implements(v);
                return $self();
            }

            default S implement(Class<?> simple) {
                assert simple.getTypeParameters().length == 0 : "type parameters should be zero";
                return addImplement(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(simple));
            }

            default S implement(Class<?> raw, UnaryOperator<TypeDescription.Generic.Builder> build) {
                assert raw.getTypeParameters().length != 0 : "type parameters is empty";
                return addImplement(build.apply(TypeDescription.Generic.Builder.of(raw)).build());
            }

            @Override
            default void $validate() {
                if ($implements() == null)
                    $implements(emptyList());
            }

            default S implement(TypeDescription.Generic... implement) {
                List<TypeDescription.Generic> v = $implements();
                if (v == null) $implements(v = new ArrayList<>());
                v.addAll(Arrays.asList(implement));
                return $self();
            }

            default S implement(List<TypeDescription.Generic> implement) {
                List<TypeDescription.Generic> v = $implements();
                if (v == null) $implements(v = new ArrayList<>());
                v.addAll(implement);
                return $self();
            }


        }
    }

    interface ParameterTypes<S extends ParameterTypes<S>> extends Make<S> {
        void $parameterTypes(List<TypeDescription> v);

        List<TypeDescription> $parameterTypes();

        default S addParameterType(TypeDescription v) {
            List<TypeDescription> vs = $parameterTypes();
            if (vs == null) $parameterTypes(vs = new ArrayList<>());
            vs.add(v);
            return $self();
        }

        default List<TypeDescription> parameterTypes() {
            return $parameterTypes();
        }

        default S parameterTypes(List<TypeDescription> v) {
            $parameterTypes(v);
            return $self();
        }

        @Override
        default void $validate() {
            if ($parameterTypes() == null)
                $parameterTypes(emptyList());
        }

        abstract class Base<S extends Base<S>> implements ParameterTypes<S> {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<TypeDescription> $parameterTypes;
        }
    }
    //endregion

    //region FieldDescription.Token
    interface FieldToken<S extends FieldToken<S>> extends
            Modifiers<S>
            , Annotations<S>
            , Type.Generic<S>
            , Name<S>
            , Make<S> {
        @Override
        default void $validate() {
            //Private
            Modifiers.super.$validate();
            Name.super.$validate();
            Type.Generic.super.$validate();
        }

        default FieldDescription.Token fieldToken() {
            return new FieldDescription.Token(name(), modifiers(), type(), annotations());
        }

    }

    interface FieldTokenMake extends FieldToken<FieldTokenMake> {
        default FieldDescription.Token make() {
            $validate();
            return fieldToken();
        }

        class Impl implements FieldTokenMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected String $name;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected int $modifiers;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<AnnotationDescription> $annotations;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected Generic $type;

            @Override
            public Impl $self() {
                return this;
            }
        }
    }

    static FieldTokenMake fieldToken() {
        return new FieldTokenMake.Impl();
    }

    static FieldTokenMake fieldToken(FieldDescription.Token v) {
        return new FieldTokenMake.Impl()
                .annotations(v.getAnnotations())
                .modifiers(v.getModifiers())
                .type(v.getType())
                .name(v.getName())
                ;
    }
    //endregion

    //region FieldDescription
    interface FieldMake extends FieldToken<FieldMake>, DeclaringClass<FieldMake> {
        @Override
        default void $validate() {
            FieldToken.super.$validate();
            DeclaringClass.super.$validate();
        }

        default FieldDescription make() {
            $validate();
            return new FieldDescription.Latent(declaringClass(), fieldToken());
        }

        class Impl implements FieldMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected String $name;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected int $modifiers;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<AnnotationDescription> $annotations;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected TypeDescription.Generic $type;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected TypeDescription $declaringClass;

            @Override
            public Impl $self() {
                return this;
            }
        }
    }

    static FieldMake field() {
        return new FieldMake.Impl();
    }

    static FieldMake field(FieldDescription desc) {
        return new FieldMake.Impl()
                .declaringClass(desc.getDeclaringType().asErasure())
                .annotations(desc.getDeclaredAnnotations())
                .modifiers(desc.getModifiers())
                .type(desc.getType())
                .name(desc.getName());
    }

    //endregion

    //region ParameterDescription.Token
    interface ParameterToken<S extends ParameterToken<S>> extends
            Modifiers<S>
            , Name<S>
            , Annotations<S>
            , Type.Generic<S>
            , Make<S> {
        @Override
        default void $validate() {
            Type.Generic.super.$validate();
            if (name() == null) $name("");
        }

        default ParameterDescription.Token parameterToken() {
            return new ParameterDescription.Token(type(), annotations(), name(), maybe());
        }

        interface Many<S extends Many<S>> extends Make<S> {
            List<ParameterDescription.Token> $parameters();

            void $parameters(List<ParameterDescription.Token> v);

            default S addParameter(ParameterDescription.Token v) {
                List<ParameterDescription.Token> vs = $parameters();
                if (vs == null) $parameters(vs = new ArrayList<>());
                vs.add(v);
                return $self();
            }

            default List<ParameterDescription.Token> parameters() {
                return $parameters();
            }

            default S parameters(List<ParameterDescription.Token> v) {
                $parameters(v);
                return $self();
            }

            default S parameter(ParameterDescription.Token v) {
                return addParameter(v);
            }

            default S parameter(UnaryOperator<ParameterTokenMake> v) {
                return addParameter(v.apply(Make.parameter()).make());
            }

            @Override
            default void $validate() {
                if ($parameters() == null) $parameters(emptyList());

            }

        }
    }

    interface ParameterTokenMake extends ParameterToken<ParameterTokenMake> {
        default ParameterDescription.Token make() {
            $validate();
            return parameterToken();
        }

        class Impl implements ParameterTokenMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected String $name;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected Generic $type;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<AnnotationDescription> $annotations;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected int $modifiers;

            @Override
            public ParameterTokenMake $self() {
                return this;
            }
        }
    }

    static ParameterTokenMake parameter() {
        return new ParameterTokenMake.Impl();
    }

    static ParameterTokenMake parameter(ParameterDescription.Token desc) {
        return new ParameterTokenMake.Impl()
                .modifiers(desc.getModifiers() == null ? 0 : desc.getModifiers())
                .name(desc.getName())
                .type(desc.getType())
                .annotations(desc.getAnnotations());
    }
    //endregion

    //region TypeVariableToken
    interface TypeVariable<S extends TypeVariable<S>> extends Make<S>
            , Name<S>
            , Bounds<S>
            , Annotations<S> {

        @Override
        default void $validate() {
            Name.super.$validate();
        }

        default TypeVariableToken typeVariable() {
            return new TypeVariableToken($name(), $bounds(), $annotations());
        }

        interface Many<S extends Many<S>> extends Make<S> {
            void $typeVariables(List<TypeVariableToken> val);

            List<TypeVariableToken> $typeVariables();

            @Override
            default void $validate() {
                if ($typeVariables() == null) $typeVariables(emptyList());
            }

            default S addTypeVariable(TypeVariableToken val) {
                List<TypeVariableToken> v = $typeVariables();
                if (v == null) $typeVariables(v = new ArrayList<>());
                v.add(val);
                return $self();
            }

            default List<TypeVariableToken> typeVariables() {
                return $typeVariables();
            }

            default S typeVariables(List<TypeVariableToken> v) {
                $typeVariables(v);
                return $self();
            }

            default S typeVariable(TypeVariableToken val) {
                return addTypeVariable(val);
            }

            default S typeVariable(UnaryOperator<TypeVariableMake> val) {
                return addTypeVariable(val.apply(Make.typeVariable()).make());
            }
        }

    }

    interface TypeVariableMake extends TypeVariable<TypeVariableMake> {
        default TypeVariableToken make() {
            $validate();
            return typeVariable();
        }

        class Impl implements TypeVariableMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<AnnotationDescription> $annotations;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected String $name;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<Generic> $bounds;

            @Override
            public TypeVariableMake $self() {
                return this;
            }
        }
    }

    static TypeVariableMake typeVariable() {
        return new TypeVariableMake.Impl();
    }

    static TypeVariableMake typeVariable(TypeVariableToken desc) {
        return new TypeVariableMake.Impl()
                .annotations(desc.getAnnotations())
                .bounds(desc.getBounds())
                .name(desc.getSymbol());
    }
    //endregion

    //region MethodDescription.Token
    interface MethodToken<S extends MethodToken<S>> extends Make<S>
            , Name<S>
            , Modifiers<S>
            , TypeVariable.Many<S>
            , ExceptionTypes.Generic<S>
            , Annotations<S>
            , ReturnType<S>
            , ParameterToken.Many<S> {
        ElementMatcher.Junction<TypeDescription> IS_THROWABLE = ElementMatchers.hasSuperType(ElementMatchers.is(Throwable.class));

        @Override
        default void $validate() {
            Modifiers.super.$validate();
            Name.super.$validate();
            Annotations.super.$validate();
            ReturnType.super.$validate();
            ParameterToken.Many.super.$validate();
            TypeVariable.Many.super.$validate();
            ExceptionTypes.Generic.super.$validate();
            List<Generic> exceptionTypes = $exceptionTypes();
            if (exceptionTypes != null && !exceptionTypes.stream().map(TypeDefinition::asErasure).allMatch(IS_THROWABLE::matches))
                throw new AssertionError("have invalid exception type in " + exceptionTypes);
            AnnotationValue<?, ?> defaultValue = defaultValue();
            if (defaultValue != null && AnnotationValue.Sort.of($returnType().asErasure()) != defaultValue.getSort())
                throw new AssertionError("invalid defaultValue with " + defaultValue);
            if (defaultValue != null && defaultValue.getSort() == AnnotationValue.Sort.NONE) defaultValue(null);
        }

        S defaultValue(AnnotationValue<?, ?> val);

        S receiverType(Generic val);

        AnnotationValue<?, ?> defaultValue();

        Generic receiverType();

        default MethodDescription.Token methodToken() {
            return new MethodDescription.Token(
                    name(),
                    modifiers(),
                    typeVariables(),
                    returnType(),
                    parameters(),
                    exceptionTypes(),
                    annotations(),
                    defaultValue(),
                    receiverType()
            );
        }

    }

    interface MethodTokenMake extends MethodToken<MethodTokenMake> {
        @Override
        MethodTokenMake receiverType(Generic val);

        @Override
        AnnotationValue<?, ?> defaultValue();

        default MethodDescription.Token make() {
            $validate();
            return methodToken();
        }

        class Impl implements MethodTokenMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private int $modifiers;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private String $name;

            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private Generic $returnType;
            @Getter
            @Accessors(fluent = true, chain = true)
            protected AnnotationValue<?, ?> defaultValue;
            @Getter
            @Accessors(fluent = true, chain = true)
            protected Generic receiverType;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<AnnotationDescription> $annotations;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<Generic> $exceptionTypes;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<TypeVariableToken> $typeVariables;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<ParameterDescription.Token> $parameters;

            @Override
            public MethodTokenMake $self() {
                return this;
            }

            @Override
            public MethodTokenMake defaultValue(AnnotationValue<?, ?> val) {
                defaultValue = val;
                return this;
            }

            @Override
            public MethodTokenMake receiverType(Generic val) {
                receiverType = val;
                return this;
            }
        }
    }

    static MethodTokenMake methodToken() {
        return new MethodTokenMake.Impl();
    }

    static MethodTokenMake methodToken(MethodDescription.Token desc) {
        return new MethodTokenMake.Impl()
                .modifiers(desc.getModifiers())
                .annotations(desc.getAnnotations())
                .returnType(desc.getReturnType())
                .name(desc.getName())
                .parameters(desc.getParameterTokens())
                .typeVariables(desc.getTypeVariableTokens())
                .exceptionTypes(desc.getExceptionTypes())
                .defaultValue(desc.getDefaultValue())
                .receiverType(desc.getReceiverType());
    }
    //endregion

    //region MethodDescription
    interface MethodMake extends Make<MethodMake>, MethodToken<MethodMake>, DeclaringClass<MethodMake> {
        @Override
        default void $validate() {
            DeclaringClass.super.$validate();
            MethodToken.super.$validate();
        }

        default MethodDescription make() {
            $validate();
            return new MethodDescription.Latent(
                    $declaringClass(), methodToken());
        }

        class Impl implements MethodMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private int $modifiers;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private String $name;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private TypeDescription.Generic $returnType;
            @Getter
            @Accessors(fluent = true, chain = true)
            protected AnnotationValue<?, ?> defaultValue;
            @Getter
            @Accessors(fluent = true, chain = true)
            protected TypeDescription.Generic receiverType;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<AnnotationDescription> $annotations;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<TypeDescription.Generic> $exceptionTypes;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<TypeVariableToken> $typeVariables;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private List<ParameterDescription.Token> $parameters;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            private TypeDescription $declaringClass;

            @Override
            public MethodMake $self() {
                return this;
            }

            @Override
            public MethodMake defaultValue(AnnotationValue<?, ?> val) {
                defaultValue = val;
                return this;
            }

            @Override
            public MethodMake receiverType(TypeDescription.Generic val) {
                receiverType = val;
                return this;
            }
        }
    }

    static MethodMake method() {
        return new MethodMake.Impl();
    }

    static MethodMake method(MethodDescription desc) {
        return new MethodMake.Impl()
                .declaringClass(desc.getDeclaringType().asErasure())
                .modifiers(desc.getModifiers())
                .annotations(desc.getDeclaredAnnotations())
                .returnType(desc.getReturnType())
                .name(desc.getName())
                .parameters(desc.getParameters().asTokenList(none()))
                .typeVariables(desc.getTypeVariables().asTokenList(none()))
                .exceptionTypes(desc.getExceptionTypes())
                .defaultValue(desc.getDefaultValue())
                .receiverType(desc.getReceiverType());
    }
    //endregion

    //region TypeDescription
    interface TypeMake extends Make<TypeMake>
            , Modifiers<TypeMake>
            , Identifier<TypeMake>
            , SuperClass.Generic<TypeMake>
            , Implements.Generic<TypeMake> {
        @Override
        default void $validate() {
            Modifiers.super.$validate();
            Identifier.super.$validate();
            Implements.Generic.super.$validate();
        }

        default TypeDescription make() {
            $validate();
            return new TypeDescription.Latent(identifier(), modifiers(), superClass(), interfaces());
        }

        class Impl implements TypeMake {
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected Generic $superClass;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected String $identifier;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected int $modifiers;
            @Getter
            @Setter
            @Accessors(fluent = true, chain = false)
            protected List<Generic> $implements;

            @Override
            public TypeMake $self() {
                return this;
            }
        }
    }

    static TypeMake type() {
        return new TypeMake.Impl();
    }

    static TypeMake type(TypeDescription desc) {
        return new TypeMake.Impl()
                .modifiers(desc.getModifiers())
                .identifier(desc.getName())
                .superClass(desc.getSuperClass())
                .implement(desc.getInterfaces());
    }
    //endregion

    //region TypeDescription.Generic

    static Generic.Builder generic(Generic desc) {
        return Generic.Builder.of(desc);
    }

    static Generic.Builder generic(java.lang.reflect.Type desc) {
        return Generic.Builder.of(desc);
    }

    static Generic.Builder generic(Class<?> rawType) {
        return Generic.Builder.rawType(rawType);
    }

    static Generic.Builder generic(TypeDescription type, Generic owner) {
        return Generic.Builder.rawType(type, owner);
    }

    static Generic.Builder generic(String symbol) {
        return Generic.Builder.typeVariable(symbol);
    }

    static Generic.Builder generic(Class<?> rawType, java.lang.reflect.Type... parameter) {
        return Generic.Builder.parameterizedType(rawType, parameter);
    }

    static Generic.Builder generic(TypeDescription rawType, TypeDefinition... parameter) {
        return Generic.Builder.parameterizedType(rawType, parameter);
    }

    static Generic.Builder generic(TypeDescription rawType, List<TypeDefinition> parameters) {
        return Generic.Builder.parameterizedType(rawType, parameters);
    }
    //endregion

    //region AnnotationDescription
    static AnnotationDescription.Builder annotation(Class<? extends Annotation> type) {
        return AnnotationDescription.Builder.ofType(type);
    }

    static AnnotationDescription.Builder annotation(TypeDescription type) {
        return AnnotationDescription.Builder.ofType(type);
    }
    //endregion
}