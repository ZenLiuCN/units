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

import com.google.testing.compile.Compilation;
import lombok.SneakyThrows;
import lombok.var;

import javax.tools.JavaFileObject;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
                .withProcessors(new CodeGenerateProcessor())
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
        Files.write(Paths.get("codegen.properties"), String.format(("debug=%s\n%s\n"), print, content).getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    static void delete() {
        Paths.get("codegen.properties").toFile().deleteOnExit();
    }
}
