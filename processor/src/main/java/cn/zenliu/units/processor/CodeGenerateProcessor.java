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

import cn.zenliu.classes.Classes;
import cn.zenliu.units.codegen.Locator;
import cn.zenliu.units.processor.unit.CodeGenerator;
import cn.zenliu.units.processor.unit.UtilWrapper;
import cn.zenliu.units.processor.util.Pair;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.experimental.Accessors;


import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import javax.tools.StandardLocation;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
@com.google.auto.service.AutoService(Processor.class)
public class CodeGenerateProcessor implements Processor, BaseUtil {
    private Map<Pattern, Set<CodeGenerator>> generators;
    private Set<String> supportedTypes;
    @Getter
    @Accessors(fluent = true)
    private final Configurer configure;

    public CodeGenerateProcessor() {
        if (!Classes.classExists("com.squareup.javapoet.TypeSpec", this.getClass().getClassLoader())) {
            System.err.println("[ CodeGenerator ] missing dependency com.squareup:javapoet:1.13.0+ , process will disabled");
            this.supportedTypes = Collections.emptySet();
            this.generators = Collections.emptyMap();
            this.configure = null;
        } else
            try {
                configure = Configurer.load();
            } catch (Exception e) {
                System.err.println("[ CodeGenerator ] fail to load Configure instance");
                throw new RuntimeException(e);
            }
        if (configure == null) {
            System.err.println("[ CodeGenerator ] fail to load Configure instance");
            throw new IllegalStateException("require a Configure service provided");
        }
        if (!configure.init()) {
            configure.debug("user.dir {}", Locator.USER_DIR());
            configure.error("missing or invalid configure file, processor may disabled ,unless found a module config file");
            this.supportedTypes = Collections.emptySet();
            this.generators = Collections.emptyMap();
        }
    }

    @Override
    public Set<String> getSupportedOptions() {
        return Collections.emptySet();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return supportedTypes;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Getter
    @Accessors(fluent = true)
    private ProcessingEnvironment env;
    @Getter
    @Accessors(fluent = true)
    private Elements elements;
    @Getter
    @Accessors(fluent = true)
    private Types types;

    @Getter
    @Accessors(fluent = true)
    private Filer filer;
    private boolean initialized = false;
    @Getter
    @Accessors(fluent = true)
    private boolean debug = false;

    protected Path fetchClassesRoot(ProcessingEnvironment env) {
        try {
            var resource = filer.createResource(StandardLocation.CLASS_OUTPUT, "", "tmp", (Element[]) null);
            Path projectPath = null;//skip the name 'tmp'
            try {
                configure.debug("Found temp file URI: {} ", resource.toUri().toASCIIString());
                projectPath = Paths.get(resource.toUri()).getParent();
            } finally {
                resource.delete();
            }
            return projectPath;
        } catch (Exception e) {
            env.getMessager().printMessage(Diagnostic.Kind.NOTE, "fail to fetch project module root:" + e.getMessage());
            return null;
        }
    }

    @SneakyThrows
    @Override
    public void init(ProcessingEnvironment processingEnv) {
        if (initialized) throw new IllegalStateException("Cannot call init more than once.");
        Objects.requireNonNull(processingEnv, "Tool provided null ProcessingEnvironment");
        this.env = processingEnv;
        this.elements = processingEnv.getElementUtils();
        this.types = processingEnv.getTypeUtils();
        this.filer = processingEnv.getFiler();
        initialized = true;
        var root = fetchClassesRoot(processingEnv);
        if (root != null) {
            if (!configure.resolve(root)) {
                this.supportedTypes = Collections.emptySet();
                this.generators = Collections.emptyMap();
                configure.error("Processor disabled for not found config file at module root or project root");
                return;
            }
        }
        var conf = configure.parseRoot();
        if (conf == null) {
            this.supportedTypes = Collections.emptySet();
            this.generators = Collections.emptyMap();
            configure.error("Processor disabled for not found config  at module root or project root: {}", configure.locator().root());
            return;
        }
        if (!conf.isEnabled()) {
            this.supportedTypes = Collections.emptySet();
            this.generators = Collections.emptyMap();
            configure.error("Process disabled by {}", configure.locator().root());
            return;
        }
        debug = conf.isDebug();
        var processors = configure.generators();
        if (processors.isEmpty()) {
            this.generators = Collections.emptyMap();
            this.supportedTypes = Collections.emptySet();
            configure.error("Empty {} found, Process will disabled", configure.locator().root());
            return;
        }
        this.supportedTypes = processors.keySet();
        if (debug)
            debug("CodeGenerator", "Supported annotations: {}", this.supportedTypes);
        this.generators = processors.entrySet().stream()
                .map(x -> Pair.of(PattenCompile.importStringToPattern(x.getKey()), x.getValue()))
                .collect(Collectors.toMap(Pair::v0, Pair::v1, (s0, s1) -> {
                    s0.addAll(s1);
                    return s0;
                }));
        if (debug)
            debug("CodeGenerator", "Enabled patterns: {}", this.generators);

        wrapper = new UtilWrapper(this);
    }

    private UtilWrapper wrapper;

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (generators.isEmpty()) return false;
        for (var entry : generators.entrySet()) {
            var p = entry.getKey();
            for (var proc : entry.getValue()) {
                if (annotations.isEmpty() && Objects.equals(p.pattern(), "*")) {
                    if (proc.process(null, annotations, roundEnv, wrapper)) return true;
                } else {
                    var pred = p.asPredicate();
                    for (var annotation : annotations) {
                        if (!pred.test(annotation.asType().toString())) continue;
                        for (var element : roundEnv.getElementsAnnotatedWith(annotation)) {
                            if (proc.process(element, annotations, roundEnv, wrapper)) return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        return Collections.emptyList(); //TODO
    }
}
