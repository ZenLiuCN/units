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

package cn.zenliu.units.processor;


import cn.zenliu.units.codegen.Configure;
import cn.zenliu.units.codegen.Generated;
import cn.zenliu.units.processor.unit.CodeGenerator;
import cn.zenliu.units.processor.util.Annotated;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.experimental.Accessors;
import lombok.var;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.slf4j.helpers.MessageFormatter;

import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.*;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.regex.Pattern;

/**
 * @author Zen.Liu
 * @since 2023-05-01
 */
@SuppressWarnings("unused")
public interface BaseUtil {
    boolean debug();

    ProcessingEnvironment env();

    Elements elements();

    Types types();

    Filer filer();

    Configurer configure();

    /**
     * Resolve config relative to element.
     *
     * @param element element
     * @return Config
     */
    default Configure.Config resolve(Element element) {
        return configure().resolve(this, element);
    }

    //region Logger
    default void log(Diagnostic.Kind kind, String msg, Element element, AnnotationMirror a, AnnotationValue v) {
        var m = env().getMessager();
        if (element != null)
            if (a != null)
                if (v != null)
                    m.printMessage(kind, msg, element, a, v);
                else
                    m.printMessage(kind, msg, element, a);
            else
                m.printMessage(kind, msg);
    }

    default void log(Diagnostic.Kind kind, String msg) {
        log(kind, msg, null, null, null);
    }

    default void log(Diagnostic.Kind kind, MessageInfo msg) {
        log(kind, msg.message(), msg.element(), msg.annotation(), msg.value());
    }

    default void log(Diagnostic.Kind kind, String pattern, Object... args) {
        log(kind, formatter(pattern, args));
    }

    default void other(String msg) {
        log(Diagnostic.Kind.OTHER, msg);
    }

    default void other(MessageInfo msg) {
        log(Diagnostic.Kind.OTHER, msg);
    }

    default void other(String pattern, Object... args) {
        other(formatter(pattern, args));
    }

    default void other(CodeGenerator proc, String pattern, Object... args) {
        other(formatter("[\t" + proc.name() + "\t] [OTHER] " + pattern, args));
    }

    default void note(String msg) {
        log(Diagnostic.Kind.NOTE, msg);
    }

    default void note(MessageInfo msg) {
        log(Diagnostic.Kind.NOTE, msg);
    }

    default void note(String pattern, Object... args) {
        note(formatter(pattern, args));
    }

    default void note(CodeGenerator proc, String pattern, Object... args) {
        note(formatter("[\t" + proc.name() + "\t] [NOTE] " + pattern, args));
    }

    default void warn(String msg) {
        log(Diagnostic.Kind.WARNING, msg);
    }

    default void warn(MessageInfo msg) {
        log(Diagnostic.Kind.WARNING, msg);
    }

    default void warn(String pattern, Object... args) {
        warn(formatter(pattern, args));
    }

    default void warn(CodeGenerator proc, String pattern, Object... args) {
        warn(formatter("[\t" + proc.name() + "\t] [WARN] " + pattern, args));
    }

    default void mandatoryWarn(String msg) {
        log(Diagnostic.Kind.MANDATORY_WARNING, msg);
    }

    default void mandatoryWarn(MessageInfo msg) {
        log(Diagnostic.Kind.MANDATORY_WARNING, msg);
    }

    default void mandatoryWarn(String pattern, Object... args) {
        mandatoryWarn(formatter(pattern, args));
    }

    default void mandatoryWarn(CodeGenerator proc, String pattern, Object... args) {
        mandatoryWarn(formatter("[\t" + proc.name() + "\t] [WARN] " + pattern, args));
    }

    default void error(String msg) {
        log(Diagnostic.Kind.ERROR, msg);
    }

    default void error(MessageInfo msg) {
        log(Diagnostic.Kind.ERROR, msg);
    }

    default void error(String pattern, Object... args) {
        error(formatter(pattern, args));
    }

    default void error(CodeGenerator proc, String pattern, Object... args) {
        error(formatter("[\t" + proc.name() + "\t] [ERROR] " + pattern, args));
    }

    /**
     * @return IllegalStateException
     */
    default RuntimeException fatal(String msg) {
        log(Diagnostic.Kind.ERROR, msg);
        return new IllegalStateException(msg);
    }

    default String fatal(MessageInfo msg) {
        log(Diagnostic.Kind.ERROR, msg);
        return msg.message();
    }

    /**
     * @return IllegalStateException
     */
    default String fatal(String pattern, Object... args) {
        return fatal(formatter(pattern, args));

    }

    default String fatal(CodeGenerator proc, String pattern, Object... args) {
        return fatal(formatter("[\t" + proc.name() + "\t] [FATAL] " + pattern, args));

    }

    default MessageInfo formatter(String pattern, Object... args) {
        return MessageInfo.format(pattern, args);
    }


    /**
     * print info to {@link System#out}, nothrow.<br/>
     * <b>Note:</b> use {@link BaseUtil#note(String)} when processing.
     *
     * @param pattern SLF4J pattern
     * @param args    values
     */
    default void debug(CodeGenerator processor, String pattern, Object... args) {
        System.out.println(MessageFormatter.arrayFormat("[\t" + processor.name() + "\t] [DEBUG] " + pattern, args).getMessage());
    }

    default void debug(String name, String pattern, Object... args) {
        System.out.println(MessageFormatter.arrayFormat("[\t" + name + "\t] [DEBUG] " + pattern, args).getMessage());
    }

    /**
     * print into {@link System#err} ,if args have throwable,the throw error.<br/>
     * <b>Note:</b> use {@link BaseUtil#fatal(String)} when processing.
     *
     * @param pattern SLF4J pattern
     * @param args    values
     */
    @SneakyThrows
    default void errorf(CodeGenerator processor, String pattern, Object... args) {
        var m = MessageFormatter.arrayFormat("[\t" + processor.name() + "\t] [ERROR] " + pattern, args);
        System.err.println(m.getMessage());
        if (m.getThrowable() != null) {
            m.getThrowable().printStackTrace(System.err);
            throw m.getThrowable();
        }
    }

    @Getter
    @Accessors(fluent = true)
    final class MessageInfo {
        private final String message;
        private final Throwable throwable;
        private final Element element;
        private final AnnotationMirror annotation;
        private final AnnotationValue value;

        public MessageInfo(String pattern, Object... args) {
            var t = MessageFormatter.arrayFormat(pattern, args);
            message = t.getMessage();
            throwable = t.getThrowable();
            Element ele = null;
            AnnotationMirror a = null;
            AnnotationValue av = null;
            var ar = t.getArgArray();
            for (Object arg : ar) {
                if (arg instanceof Element) ele = (Element) arg;
                else if (arg instanceof AnnotationMirror) a = (AnnotationMirror) arg;
                else if (arg instanceof AnnotationValue) av = (AnnotationValue) arg;
            }
            this.element = ele;
            this.annotation = a;
            this.value = av;
        }

        public MessageInfo(String pattern, Object arg) {
            var t = MessageFormatter.format(pattern, arg, arg);
            message = t.getMessage();
            throwable = t.getThrowable();
            Element ele = null;
            AnnotationMirror a = null;
            AnnotationValue av = null;
            if (throwable != null) {
                this.element = null;
                this.annotation = null;
                this.value = null;
                return;
            }
            if (arg instanceof Element) ele = (Element) arg;
            else if (arg instanceof AnnotationMirror) a = (AnnotationMirror) arg;
            else if (arg instanceof AnnotationValue) av = (AnnotationValue) arg;

            this.element = ele;
            this.annotation = a;
            this.value = av;
        }

        public MessageInfo(String pattern, Object arg1, Object arg2) {
            var t = MessageFormatter.format(pattern, arg1, arg2);
            message = t.getMessage();
            throwable = t.getThrowable();
            Element ele = null;
            AnnotationMirror a = null;
            AnnotationValue av = null;
            if (arg1 instanceof Element) ele = (Element) arg1;
            else if (arg1 instanceof AnnotationMirror) a = (AnnotationMirror) arg1;
            else if (arg1 instanceof AnnotationValue) av = (AnnotationValue) arg1;
            if (arg2 instanceof Element) ele = (Element) arg2;
            else if (arg2 instanceof AnnotationMirror) a = (AnnotationMirror) arg2;
            else if (arg2 instanceof AnnotationValue) av = (AnnotationValue) arg2;
            this.element = ele;
            this.annotation = a;
            this.value = av;
        }

        public static MessageInfo format(String pattern, Object arg1) {
            return new MessageInfo(pattern, arg1);
        }

        public static MessageInfo format(String pattern, Object arg1, Object arg2) {
            return new MessageInfo(pattern, arg1, arg2);
        }

        public static MessageInfo format(String pattern, Object... args) {
            return new MessageInfo(pattern, args);
        }
    }

    //endregion


    //region Types

    default TypeMirror typeOf(String fqn) {
        return elements().getTypeElement(fqn).asType();
    }

    default TypeMirror typeOf(Class<?> type) {
        return elements().getTypeElement(type.getCanonicalName()).asType();
    }

    default TypeElement typeElementOf(TypeMirror type) {
        return ((TypeElement) types().asElement(type));
    }

    default TypeElement typeElementOf(String qualifiedName) {
        return typeElementOf(typeOf(qualifiedName));
    }

    default boolean isAssignableTo(TypeMirror type1, TypeMirror type2) {
        if (type1.getKind() == TypeKind.ERROR || type2.getKind() == TypeKind.ERROR) {
            env().getMessager().printMessage(Diagnostic.Kind.OTHER, "one of " + type1 + " and " + type2 + " not resolved");
            var t1 = typeElementOf(type1);
            var t2 = typeElementOf(type2);
            if (t1 == null || t2 == null) return false;
            return t1.getQualifiedName().equals(t2.getQualifiedName());
        }
        return types().isAssignable(type1, type2);
    }

    default boolean isAssignableTo(TypeMirror type1, Class<?> type2) {
        if (type1.getKind() == TypeKind.ERROR) {
            env().getMessager().printMessage(Diagnostic.Kind.OTHER, "one of " + type1 + " and " + type2 + " not resolved");
            var t1 = typeElementOf(type1);
            if (t1 == null) return false;
            return t1.getQualifiedName().toString().equals(type2.getCanonicalName());
        }
        return types().isAssignable(type1, typeOf(type2));
    }

    default boolean isSameType(TypeMirror type1, Class<?> type2) {
        return types().isSameType(type1, typeOf(type2));
    }

    default boolean isSameType(TypeMirror type1, TypeMirror type2) {
        return types().isSameType(type1, type2);
    }

    default boolean isSubTypeOf(TypeMirror type1, TypeMirror type2) {
        return types().isSubtype(type1, type2);
    }

    default boolean isContains(TypeMirror type1, TypeMirror type2) {
        return types().contains(type1, type2);
    }


    default boolean isSubSignatureOf(ExecutableType type1, ExecutableType type2) {
        return types().isSubsignature(type1, type2);
    }

    default List<? extends TypeMirror> directSupertypes(TypeMirror type) {
        return types().directSupertypes(type);
    }

    default TypeMirror erasure(TypeMirror type) {
        return types().erasure(type);
    }

    default TypeElement boxedClass(PrimitiveType type) {
        return types().boxedClass(type);
    }

    default PrimitiveType unboxedType(TypeMirror type) {
        return types().unboxedType(type);
    }

    default TypeMirror capture(TypeMirror type) {
        return types().capture(type);
    }

    default PrimitiveType primitiveType(TypeKind kind) {
        return types().getPrimitiveType(kind);
    }

    default NullType nullType() {
        return types().getNullType();
    }

    default NoType noType(TypeKind kind) {
        return types().getNoType(kind);
    }

    default ArrayType arrayType(TypeMirror component) {
        return types().getArrayType(component);
    }

    default WildcardType wildcardType(TypeMirror extendsBound, TypeMirror superBound) {
        return types().getWildcardType(extendsBound, superBound);
    }

    default WildcardType wildcardExtendsOf(TypeMirror extendsBound) {
        return types().getWildcardType(extendsBound, null);
    }

    default WildcardType wildcardSuperOf(TypeMirror superBound) {
        return types().getWildcardType(null, superBound);
    }

    default DeclaredType declaredTypeOf(TypeElement typeElem, TypeMirror... typeArgs) {
        return types().getDeclaredType(typeElem, typeArgs);
    }

    default DeclaredType declaredTypeOf(DeclaredType containing, TypeElement typeElem, TypeMirror... typeArgs) {
        return types().getDeclaredType(containing, typeElem, typeArgs);
    }

    default TypeMirror asMemberOf(DeclaredType containing, Element element) {
        return types().asMemberOf(containing, element);
    }

    default boolean isRawAssignableTo(TypeMirror from, TypeMirror to) {
        return isAssignableTo(erasure(from), erasure(to));
    }

    default boolean isRawAssignableTo(TypeMirror from, Class<?> to) {
        return isAssignableTo(erasure(from), erasure(typeOf(to)));
    }
    //endregion

    //region Elements
    default PackageElement packageOf(Element e) {
        return elements().getPackageOf(e);
    }

    default boolean isDeprecated(Element e) {
        return elements().isDeprecated(e);
    }

    default Name binaryName(TypeElement e) {
        return elements().getBinaryName(e);
    }

    default List<? extends Element> allMembers(TypeElement e) {
        return elements().getAllMembers(e);
    }

    default List<? extends AnnotationMirror> allAnnotationMirrors(TypeElement e) {
        return elements().getAllAnnotationMirrors(e);
    }

    default boolean isHides(Element hider, Element hidden) {
        return elements().hides(hider, hidden);
    }

    default boolean isOverrides(ExecutableElement overrider, ExecutableElement overridden,
                                TypeElement type) {
        return elements().overrides(overrider, overridden, type);
    }

    default Name name(CharSequence name) {
        return elements().getName(name);
    }

    default boolean isFunctionalInterface(TypeElement type) {
        return elements().isFunctionalInterface(type);
    }

    default void print(Writer w, Element... elements) {
        elements().printElements(w, elements);
    }

    default Map<? extends ExecutableElement, ? extends AnnotationValue> valuesWithDefaults(AnnotationMirror e) {
        return elements().getElementValuesWithDefaults(e);
    }
    //endregion

    //region Other
    @SuppressWarnings("RedundantLengthCheck")
    default boolean isGeneratedBy(Element element, String name) {
        var generates = element.getAnnotationsByType(Generated.class);
        if (generates.length == 0) return false;
        for (var g : generates) {
            if (g.processor().equals(name)) {
                return true;
            }
        }
        return false;
    }

    default boolean isDirectlyInherit(TypeElement element, Class<?> type) {
        for (var face : element.getInterfaces()) {
            if (isSameType(face, type)) {
                return true;
            }
        }
        return false;
    }

    default boolean isStatic(Element e) {
        return e.getModifiers().contains(Modifier.STATIC);
    }

    default boolean isDefault(Element e) {
        return e.getModifiers().contains(Modifier.DEFAULT);
    }

    default boolean isGetter(ExecutableElement e, boolean onlyBeanStyle) {
        return (e.getParameters().size() == 0 && e.getReturnType().getKind() != TypeKind.VOID)
                && (!onlyBeanStyle
                || e.getSimpleName().toString().startsWith("get")
                || e.getSimpleName().toString().startsWith("is"));
    }


    default boolean isDeclaredBy(Element e, Class<?> cls) {
        return isSameType(e.getEnclosingElement().asType(), cls);
    }

    default boolean isDeclaredBy(Element e, TypeMirror type) {
        return isSameType(e.getEnclosingElement().asType(), type);
    }

    default Map<String, TypeMirror> resolveTypeParameters(TypeElement type) {
        var m = new HashMap<String, TypeMirror>();
        for (var t : type.getTypeParameters()) {
            m.put(t.getSimpleName().toString(), t.asType());
        }
        return m;
    }

    @Contract(mutates = "param1")
    default void mergeTypeVariables(Map<String, TypeMirror> modelVariables,
                                    Map<String, TypeMirror> variables,
                                    Map<String, TypeMirror> parameters) {
        modelVariables.forEach((k, v) -> {
            var var = variables.get(k);
            if (var != null) {
                modelVariables.put(k, var);
                return;
            }
            var = parameters.get(k);
            if (var != null) modelVariables.put(k, var);
        });

    }


    /**
     * compare two method, check if subj can project from obj, means that obj method can be an implement of subj.<br/>
     * <b>note:</b> parameter must have some ordered.
     *
     * @param sub        subject
     * @param obj        project
     * @param allowChain allow subject have a chained method that return self, not care obj returns
     * @param mappable   can two type be mapping from first to second.
     * @return same or not
     */
    default boolean isProjectMethod(ExecutableElement sub, ExecutableElement obj, boolean allowChain, BiPredicate<TypeMirror, TypeMirror> mappable) {
        if (!sub.getSimpleName().equals(obj.getSimpleName())) return false;
        if (sub.getParameters().size() != obj.getParameters().size()) return false;
        if (sub.getModifiers().contains(Modifier.STATIC) != obj.getModifiers().contains(Modifier.STATIC)) return false;
        var subjRet = sub.getReturnType();
        var objRet = obj.getReturnType();
        var subChained = isSameType(subjRet, sub.getEnclosingElement().asType());
        var retMappable = isAssignableTo(objRet, subjRet) || mappable.test(subjRet, objRet);
        if (!allowChain && !retMappable) return false;
        if (!retMappable && !subChained) return false;
        for (int i = 0; i < sub.getParameters().size(); i++) {
            var subjParam = sub.getParameters().get(i).asType();
            var objParam = obj.getParameters().get(i).asType();
            if (!isAssignableTo(subjParam, objParam) && !mappable.test(subjRet, objParam)) {
                return false;
            }
        }
        return true;

    }

    //endregion

    //region Annotation

    default <T extends Annotation> @Nullable Annotated annotationByType(Element e, Class<T> annoType) {
        for (var mirror : e.getAnnotationMirrors()) {
            if (isSameType(mirror.getAnnotationType(), annoType)) {
                return () -> mirror;
            }
        }
        return null;
    }

    default <T extends Annotation> List<Annotated> findAll(Element e, Class<T> annoType) {
        var l = new ArrayList<Annotated>();
        for (var mirror : e.getAnnotationMirrors()) {
            if (isSameType(mirror.getAnnotationType(), annoType)) {
                l.add(() -> mirror);
            }
        }
        return l;
    }

    interface PattenCompile {
        Pattern noMatches = Pattern.compile("(\\P{all})+");
        String allMatchesString = ".*";
        Pattern allMatches = Pattern.compile(allMatchesString);


        static String validImportStringToPatternString(String s) {
            if (s.equals("*")) {
                return allMatchesString;
            } else {
                var prime = s.replace(".", "\\.");
                if (prime.endsWith("*")) {
                    prime = prime.substring(0, prime.length() - 1) + ".+";
                }
                return prime;
            }
        }

        static boolean isValidImportString(String s) {
            if (s.equals("*"))
                return true;
            var valid = true;
            var t = s;
            var index = t.indexOf('*');
            if (index != -1) {
                if (index == t.length() - 1) {
                    if (index - 1 >= 0) {
                        valid = t.charAt(index - 1) == '.';
                        t = t.substring(0, t.length() - 2);
                    }
                } else
                    return false;
            }
            if (valid)
                for (String javaId : t.split("\\.", t.length() + 2))
                    valid &= SourceVersion.isIdentifier(javaId);

            return valid;
        }

        static Pattern validImportStringToPattern(String s) {
            var pattern = validImportStringToPatternString(s);
            if (Objects.equals(pattern, allMatchesString)) {
                return allMatches;
            } else {
                return Pattern.compile(pattern);
            }
        }

        static Pattern importStringToPattern(String pattern) {
            String module;
            String pkg;
            var slash = pattern.indexOf('/');
            if (slash == (-1)) {
                if (pattern.equals("*")) {
                    return validImportStringToPattern(pattern);
                }
                module = "";
                pkg = pattern;
            } else {
                var moduleName = pattern.substring(0, slash);
                if (!SourceVersion.isName(moduleName)) {
                    System.err.println("[ CodeGenerateProcessor ] invalid annotation type pattern:" + pattern);
                    return noMatches;
                }
                module = Pattern.quote(moduleName + "/");
                pkg = pattern.substring(slash + 1);
            }
            if (isValidImportString(pkg)) {
                return Pattern.compile(module + validImportStringToPatternString(pkg));
            } else {
                System.err.println("[ CodeGenerateProcessor ] invalid annotation type pattern:" + pattern);
                return noMatches;
            }
        }


    }
}
