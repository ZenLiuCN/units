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

package cn.zenliu.units.enhancer;

import cn.zenliu.units.enhancer.make.Make;
import lombok.Value;
import lombok.experimental.Accessors;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.matcher.ElementMatcher;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static net.bytebuddy.matcher.ElementMatchers.*;

/**
 * An enhance context for each type processing.
 *
 * @author Zen.Liu
 * @since 2023-05-06
 */
@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Context {
    TypeDescription type;
    List<DynamicType.Builder<?>> gen;
    ClassFileLocator locator;

    public Stream<FieldDescription.InDefinedShape> fields() {
        return type.getDeclaredFields().stream();
    }

    public Stream<FieldDescription.InDefinedShape> fields(ElementMatcher.Junction<FieldDescription> filter) {
        return type.getDeclaredFields().filter(filter).stream();
    }

    public Stream<FieldDescription.InDefinedShape> instanceFields() {
        return type.getDeclaredFields().filter(not(isStatic())).stream();
    }

    public Stream<MethodDescription.InDefinedShape> methods() {
        return type.getDeclaredMethods().stream();
    }

    public Stream<MethodDescription.InDefinedShape> instanceMethods() {
        return type.getDeclaredMethods().filter(not(isStatic())).stream();
    }

    public Stream<MethodDescription.InDefinedShape> methods(ElementMatcher.Junction<MethodDescription> filter) {
        return type.getDeclaredMethods().filter(filter).stream();
    }

    public Stream<AnnotationDescription> annotations() {
        return Stream.concat(type().getDeclaredAnnotations().stream(), type.getInheritedAnnotations().stream());
    }

    public Stream<AnnotationDescription> annotations(Class<? extends Annotation> type) {
        return Stream.concat(
                type().getDeclaredAnnotations().filter(annotationType(type)).stream(),
                type().getInheritedAnnotations().filter(annotationType(type)).stream());
    }

    public Make.MethodMake declareMethod(String name) {
        return Make.method().declaringClass(type).name(Objects.requireNonNull(name));
    }
    public Make.MethodMake declareConstructor() {
        return Make.method().declaringClass(type).name(MethodDescription.CONSTRUCTOR_INTERNAL_NAME);
    }

    public Make.FieldMake declareField() {
        return Make.field().declaringClass(type);
    }

}
