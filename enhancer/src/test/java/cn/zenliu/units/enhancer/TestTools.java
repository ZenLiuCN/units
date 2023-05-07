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

import com.google.testing.compile.Compilation;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.BuildLogger;
import net.bytebuddy.build.EntryPoint;
import net.bytebuddy.build.Plugin;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;

import javax.tools.JavaFileObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.google.testing.compile.Compiler.javac;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
public interface TestTools {
    boolean print = System.getProperties().containsKey("sun.java.command");

    static Compilation compile(JavaFileObject... files) {
        return javac()
                .compile(files);
    }

    @SneakyThrows
    static void print(Compilation compilation) {
        if (!print) return;
        for (var f : compilation.generatedFiles()) {
            if (f.getKind() != JavaFileObject.Kind.SOURCE) continue;
            System.out.println(f);
            try (var r = f.openInputStream()) {
                var buf = new byte[1024];
                var n = 0;
                while ((n = r.read(buf)) > 0) {
                    System.out.write(buf, 0, n);
                }
            }
        }
    }

    @SneakyThrows
    static void save(Compilation compilation, Predicate<JavaFileObject> filter, Path out) {
        for (var f : compilation.generatedFiles()) {
            if (filter.test(f))
                try (var r = f.openInputStream()) {
                    try (var os = Files.newOutputStream(out, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE)) {
                        var buf = new byte[1024];
                        var n = 0;
                        while ((n = r.read(buf)) > 0) {
                            os.write(buf, 0, n);
                        }
                    }
                }
        }
    }

    @SneakyThrows
    static void config(String content) {
        Files.write(Paths.get("enhance.properties"), String.format(("debug=%s\n%s\n"), print, content).getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    static void delete() {
        Paths.get("enhance.properties").toFile().deleteOnExit();
    }

    @SneakyThrows
    static Result enhance(Compilation compilation) {
        var target = new Plugin.Engine.Target.InMemory();
        var sources = new HashMap<String, byte[]>();
        compilation.generatedFiles().forEach(CopyToMemory(sources));
        compilation.generatedSourceFiles().forEach(CopyToMemory(sources));
        compilation.sourceFiles().forEach(CopyToMemory(sources));
        var source = new Plugin.Engine.Source.InMemory(sources);
        final Path testClasses = Paths.get("target/test-classes");
        var factories = new Plugin.Factory.UsingReflection(ByteBuddyEnhancer.class)
                .with(Plugin.Factory.UsingReflection.ArgumentResolver.ForType.of(File.class, new File("")),
                        Plugin.Factory.UsingReflection.ArgumentResolver.ForType.of(BuildLogger.class, new TestLogger())
                );

        var summary = Plugin.Engine.Default.of(EntryPoint.Default.REBASE, ClassFileVersion.JAVA_V3, MethodNameTransformer.Suffixing.withRandomSuffix())
                .with(Plugin.Engine.PoolStrategy.Default.EXTENDED)
                .with(new ClassFileLocator.Compound(
                        ClassFileLocator.ForClassLoader.of(new MemoryClassLoader(sources, TestTools.class.getClassLoader())),
                        new ClassFileLocator.ForFolder(Paths.get("target/classes").toFile()),
                        new ClassFileLocator.ForFolder(testClasses.toFile())
                ))
                .with(Plugin.Engine.Dispatcher.ForSerialTransformation.Factory.INSTANCE)
                .withErrorHandlers(Plugin.Engine.ErrorHandler.Enforcing.ALL_TYPES_RESOLVED,
                        Plugin.Engine.ErrorHandler.Enforcing.NO_LIVE_INITIALIZERS,
                        Plugin.Engine.ErrorHandler.Failing.FAIL_LAST)
                .apply(source, target, Collections.singletonList(factories));
        return Result.of(summary, sources, target.getStorage());
    }

    @Value(staticConstructor = "of")
    @Accessors(fluent = true)
    class Result {
        Plugin.Engine.Summary summary;
        Map<String, byte[]> sources;
        Map<String, byte[]> output;
    }

    class MemoryClassLoader extends ClassLoader {
        final HashMap<String, byte[]> sources;

        MemoryClassLoader(HashMap<String, byte[]> sources, ClassLoader parent) {
            super(parent);
            this.sources = sources;
        }

        final
        @Override
        public Class<?> findClass(String name) throws ClassNotFoundException {
            byte[] b = sources.get(name);
            if (b == null) throw new ClassNotFoundException(name);
            return defineClass(name, b, 0, b.length);
        }

    }

    @Slf4j
    class TestLogger implements BuildLogger {

        @Override
        public boolean isDebugEnabled() {
            return log.isDebugEnabled();
        }

        @Override
        public void debug(String message) {
            log.debug(message);
        }

        @Override
        public void debug(String message, Throwable throwable) {
            log.debug(message, throwable);
        }

        @Override
        public boolean isInfoEnabled() {
            return log.isInfoEnabled();
        }

        @Override
        public void info(String message) {
            log.info(message);
        }

        @Override
        public void info(String message, Throwable throwable) {
            log.info(message, throwable);
        }

        @Override
        public boolean isWarnEnabled() {
            return log.isWarnEnabled();
        }

        @Override
        public void warn(String message) {
            log.warn(message);
        }

        @Override
        public void warn(String message, Throwable throwable) {
            log.warn(message, throwable);
        }

        @Override
        public boolean isErrorEnabled() {
            return log.isErrorEnabled();
        }

        @Override
        public void error(String message) {
            log.error(message);
        }

        @Override
        public void error(String message, Throwable throwable) {
            log.error(message, throwable);
        }

    }

    static Consumer<? super JavaFileObject> CopyToMemory(HashMap<String, byte[]> sources) {
        return s -> {
            switch (s.getKind()) {
                case SOURCE: {
                    try (var is = s.openInputStream()) {
                        var temp = new byte[4096];
                        var n = is.read(temp);
                        if (n == 4096) throw new IllegalStateException("file greater than 4kb");
                        var buf = Arrays.copyOf(temp, n);
                        var name = s.toUri().getRawPath();
                        sources.put(name, buf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case CLASS: {
                    try (var is = s.openInputStream()) {
                        var temp = new byte[4096];
                        var n = is.read(temp);
                        if (n == 4096) throw new IllegalStateException("file greater than 4kb");
                        var buf = Arrays.copyOf(temp, n);
                        var name = s.toUri().getRawPath()
                                .replace("/CLASS_OUTPUT/", "");
                        sources.put(name, buf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case HTML:
                case OTHER: {
                }
            }


        };
    }
}
