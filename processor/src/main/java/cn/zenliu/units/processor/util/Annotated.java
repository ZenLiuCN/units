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

package cn.zenliu.units.processor.util;

import lombok.var;
import org.jetbrains.annotations.Nullable;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import java.util.*;
import java.util.function.Function;

@SuppressWarnings("unused")
public interface Annotated {
    AnnotationMirror mirror();

    default <T> @Nullable T read(String name, Function<AnnotationValue, @Nullable T> fn) {
        for (var entry : mirror().getElementValues().entrySet()) {
            var k = entry.getKey();
            var v = entry.getValue();
            if (k.getSimpleName().toString().equals(name)) {
                return Objects.requireNonNull(fn.apply(v), "Annotation value not match");
            }
        }
        return null;
    }

    default <T> List<T> readList(String name, Function<AnnotationValue, @Nullable T> fn) {
        var vals = new ArrayList<T>();
        for (var entry : mirror().getElementValues().entrySet()) {
            var k = entry.getKey();
            var v = entry.getValue();
            if (k.getSimpleName().toString().equals(name)) {
                var val = v.getValue();
                if (val instanceof List<?>) {
                    for (var vx : ((List<?>) val)) {
                        if (vx instanceof AnnotationValue) {
                            vals.add(Objects.requireNonNull(fn.apply(((AnnotationValue) vx)), "Annotation value not match"));
                        } else {
                            throw new IllegalStateException("Annotation value not inside list,should never happen:" + vx);
                        }
                    }
                } else {
                    return vals;
                }

            }
        }
        return vals;
    }

    static TypeMirror mayClass(AnnotationValue v) {
        return v.getValue() instanceof TypeMirror  ? ((TypeMirror) v.getValue()) : null;
    }

    default TypeMirror readClass(String name) {
        return read(name, Annotated::mayClass);
    }

    default List<TypeMirror> readClasses(String name) {
        return readList(name, Annotated::mayClass);
    }

    static TypeElement mayClassElement(AnnotationValue v) {
        var t = v.getValue();
        return t instanceof DeclaredType ? (TypeElement) ((DeclaredType) t).asElement() : null;
    }

    default TypeElement readClassElement(String name) {
        return read(name, Annotated::mayClassElement);
    }

    default List<TypeElement> readClassElements(String name) {
        return readList(name, Annotated::mayClassElement);
    }

    static String mayString(AnnotationValue v) {
        return v.getValue() instanceof String  ? ((String) v.getValue()) : null;
    }

    default String readString(String name) {
        return read(name, Annotated::mayString);
    }   

    default List<String> readStrings(String name) {
        return readList(name, Annotated::mayString);
    }

    static Integer mayInteger(AnnotationValue v) {
        return v.getValue() instanceof Integer  ? ((Integer) v.getValue()) : null;
    }

    default Integer readInteger(String name) {
        return read(name, Annotated::mayInteger);
    }

    default List<Integer> readIntegers(String name) {
        return readList(name, Annotated::mayInteger);
    }

    static Boolean mayBoolean(AnnotationValue v) {
        return v.getValue() instanceof Boolean ? (Boolean) v.getValue() : null;
    }

    default Boolean readBoolean(String name) {
        return read(name, Annotated::mayBoolean);
    }

    default List<Boolean> readBooleans(String name) {
        return readList(name, Annotated::mayBoolean);
    }

    static Short mayShort(AnnotationValue v) {
        return v.getValue() instanceof Short ? ((Short) v.getValue()) : null;
    }

    default Short readShort(String name) {
        return read(name, Annotated::mayShort);
    }

    default List<Short> readShorts(String name) {
        return readList(name, Annotated::mayShort);
    }

    static Byte mayByte(AnnotationValue v) {
        return v.getValue() instanceof Byte ? ((Byte) v.getValue()) : null;
    }

    default Byte readByte(String name) {
        return read(name, Annotated::mayByte);
    }

    default List<Byte> readBytes(String name) {
        return readList(name, Annotated::mayByte);
    }

    static Long mayLong(AnnotationValue v) {
        return v.getValue() instanceof Long ? ((Long) v.getValue()) : null;
    }

    default Long readLong(String name) {
        return read(name, Annotated::mayLong);
    }

    default List<Long> readLongs(String name) {
        return readList(name, Annotated::mayLong);
    }

    static VariableElement mayVariableElement(AnnotationValue v) {
        return v.getValue() instanceof VariableElement ? ((VariableElement) v.getValue()) : null;
    }

    default VariableElement readEnum(String name) {
        return read(name, Annotated::mayVariableElement);
    }

    default List<VariableElement> readEnums(String name) {
        return readList(name, Annotated::mayVariableElement);
    }

    static AnnotationMirror mayAnnotationMirror(AnnotationValue v) {
        return v.getValue() instanceof AnnotationMirror ? ((AnnotationMirror) v.getValue()) : null;
    }

    default AnnotationMirror readAnnotation(String name) {
        return read(name, Annotated::mayAnnotationMirror);
    }

    default List<AnnotationMirror> readAnnotations(String name) {
        return readList(name, Annotated::mayAnnotationMirror);
    }

    default <K, V> Map<K, V> readMap(String keyName, String valueName,
                                     Function<AnnotationValue, K> keyFn,
                                     Function<AnnotationValue, V> valueFn) {
        var m = new HashMap<K, V>();
        var keys = readList(keyName, keyFn);
        var values = readList(valueName, valueFn);
        if (keys.size() != values.size())
            throw new IllegalStateException(mirror().getAnnotationType().asElement().getSimpleName() + " requires " + keyName + " and " + valueName + " have same size");
        for (int i = 0; i < keys.size(); i++) {
            m.put(keys.get(i), values.get(i));
        }
        return m;
    }

}