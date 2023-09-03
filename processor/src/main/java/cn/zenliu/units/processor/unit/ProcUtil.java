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

package cn.zenliu.units.processor.unit;

import cn.zenliu.units.processor.BaseUtil;
import cn.zenliu.units.processor.util.Projection;
import com.squareup.javapoet.*;

import org.jetbrains.annotations.Nullable;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
@SuppressWarnings("unused")
public interface ProcUtil extends BaseUtil {

    /**
     * @param root  the root Type
     * @param name  method name to check
     * @param param param type names to check (order important)
     */
    default boolean declaredMethod(TypeMirror root, String name, List<TypeName> param) {
        for (var e : allMembers(typeElementOf(root))) {
            if (e instanceof ExecutableElement) {
                var ex = (ExecutableElement) e;
                if (ex.getSimpleName().toString().equals(name) && (param != null && !param.isEmpty()) && (ex.getParameters().size() == param.size())) {
                    var i = 0;
                    var same = true;
                    for (var x : ex.getParameters()) {
                        if (!TypeName.get(x.asType()).equals(param.get(i))) {
                            same = false;
                            break;
                        }
                        i++;
                    }
                    if (same) return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    default boolean hasDeclared(String methodName, ExecutableElement e, TypeMirror declaring) {
        return declaredMethod(declaring, methodName, Collections.singletonList(TypeName.get(e.getReturnType())));
    }

    default TypeName[] orderedParameterType(Map<String, TypeMirror> parameters, TypeElement element, Function<TypeMirror, TypeName> conv) {
        return element.getTypeParameters().stream()
                .map(x -> {
                    var name = x.getSimpleName().toString();
                    var var = parameters.get(name);
                    if (var != null) {
                        var v = conv.apply(var);
                        if (v != null) return v;
                        return TypeName.get(var);
                    }
                    var v = conv.apply(x.asType());
                    if (v != null) return v;
                    return TypeName.get(x.asType());
                })
                .toArray(TypeName[]::new);
    }

    /**
     * @param v       the type variable
     * @param method  optional method
     * @param element the element
     * @return most possible typename of the variable
     */
    default TypeName resolveTypeArgument(TypeVariable v, @Nullable ExecutableElement method, TypeElement element) {
        var name = v.asElement().getSimpleName();
        if (method != null && method.getTypeParameters().stream().anyMatch(x -> x.getSimpleName().equals(name)))
            return TypeName.get(v);
        if (element.getTypeParameters().stream().anyMatch(x -> x.getSimpleName().equals(name))) return TypeName.get(v);
        for (var face : element.getInterfaces()) {
            if (face instanceof DeclaredType) {
                var d = (DeclaredType) face;
                var names = ((TypeElement) d.asElement()).getTypeParameters();
                for (int i = 0; i < names.size(); i++) {
                    var n = names.get(i).getSimpleName();
                    if (n.equals(name)) {
                        var types = d.getTypeArguments();
                        return TypeName.get(types.get(i));
                    }
                }
            }
        }
        return TypeName.get(v);
    }


    /**
     * @param t       the type
     * @param method  optional method
     * @param element element
     * @return most possible type name
     */
    default TypeName resolveTypeName(TypeMirror t, @Nullable ExecutableElement method, TypeElement element) {
        if (t.getKind() == TypeKind.TYPEVAR) {
            var v = ((TypeVariable) t);
            return resolveTypeArgument(v, method, element);
        } else if (t.getKind() == TypeKind.ERROR) {
            //should not happen.
            return TypeName.get(t);
        } else if (t.getKind() == TypeKind.DECLARED) {
            var de = (DeclaredType) t;
            if (de.getTypeArguments().size() == 0) return TypeName.get(t);
            else {
                var cn = ClassName.get((TypeElement) de.asElement());
                return ParameterizedTypeName.get(cn, de.getTypeArguments().stream()
                        .map(v -> {
                            if (v instanceof TypeVariable)
                                return resolveTypeArgument((TypeVariable) v, method, element);
                            return TypeName.get(v);
                        }).toArray(TypeName[]::new));
            }
        } else {
            return TypeName.get(t);
        }
    }

    /**
     * override a method, parameters are named as v0 ... v#.
     *
     * @param e method
     * @return builder
     */
    default MethodSpec.Builder overrides(ExecutableElement e) {
        return overrides(e, false);
    }

    default MethodSpec.Builder overrides(ExecutableElement e, boolean noTypeParameter) {
        var name = e.getSimpleName().toString();
        var typeVar = noTypeParameter ? Collections.<TypeVariableName>emptyList() : e.getTypeParameters().stream().map(TypeVariableName::get).collect(Collectors.toList());
        var cnt = new AtomicInteger(0);
        var parameters = e.getParameters().stream()
                .map(x -> ParameterSpec.builder(TypeName.get(x.asType()), "v" + cnt.getAndIncrement(), x.getModifiers().toArray(new Modifier[0]))
                        .build())
                .collect(Collectors.toList());
        var returns = TypeName.get(e.getReturnType());
        var modifiers = new HashSet<>(e.getModifiers());
        modifiers.remove(Modifier.ABSTRACT);
        modifiers.remove(Modifier.DEFAULT);

        return MethodSpec.methodBuilder(name)
                .addModifiers(modifiers)
                .addAnnotation(Override.class)
                .addParameters(parameters)
                .returns(returns)
                .addTypeVariables(typeVar);
    }


    default <T> @Nullable Projection<T> project(ExecutableElement sub, ExecutableElement obj,
                                                boolean allowChain,
                                                BiFunction<TypeMirror, TypeMirror, T> mappable) {
        if (!sub.getSimpleName().equals(obj.getSimpleName())) return null;
        var pSub = sub.getParameters();
        var pObj = obj.getParameters();
        if (pSub.size() != pObj.size()) return null;
        if (sub.getModifiers().contains(Modifier.STATIC) != obj.getModifiers().contains(Modifier.STATIC)) return null;
        var subjRet = sub.getReturnType();
        var objRet = obj.getReturnType();
        var subChained = isSameType(subjRet, sub.getEnclosingElement().asType());
        var retAssignable = isAssignableTo(objRet, subjRet);
        var retMapping = retAssignable ? null : mappable.apply(subjRet, objRet);
        if (!allowChain && !retAssignable && retMapping == null) return null;
        if (!retAssignable && !subChained && retMapping == null) return null;
        var projects = new ArrayList<T>(pSub.size());
        for (int i = 0; i < pSub.size(); i++) {
            var subjParam = pSub.get(i).asType();
            var objParam = pObj.get(i).asType();
            var assignable = isAssignableTo(subjParam, objParam);
            var mapping = mappable.apply(subjRet, objParam);
            if (!assignable && mapping == null) {
                return null;
            } else {
                projects.add(mapping);
            }
        }
        return Projection.of(obj, sub, allowChain && subChained, projects, retMapping);
    }


    default MethodSpec mixin(ExecutableElement method, boolean setDefault) {
        var su = ClassName.get(method.getEnclosingElement().asType());
        var name = method.getSimpleName().toString();
        var code = CodeBlock.builder();
        if (method.getReturnType().getKind() == TypeKind.VOID) {
            code.add("$T.super.$L(", su, name);
        } else {
            code.add("return $T.super.$L(", su, name);
        }
        var cnt = new AtomicInteger(0);
        method.getParameters().forEach(p -> {
            if (cnt.get() > 0) code.add(",");
            code.add("v$L", cnt.getAndIncrement());
        });
        code.add(");");

        return (setDefault ? overrides(method).addModifiers(Modifier.DEFAULT) : overrides(method))
                .addCode(code.build())
                .build();
    }
}
