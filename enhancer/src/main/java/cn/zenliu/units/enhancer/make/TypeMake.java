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


import lombok.SneakyThrows;
import lombok.Synchronized;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * TypeMaker use to Wrap {@link DynamicType.Builder}
 *
 * @author Zen.Liu
 * @since 2022-10-29
 */

public class TypeMake {
    public static TypeMake of(DynamicType.Builder<?> builder) {
        return new TypeMake(builder);
    }

    public TypeMake(DynamicType.Builder<?> builder) {
        this.builder = builder;
    }

    private DynamicType.Builder<?> builder;

    public DynamicType.Builder<?> builder() {
        return builder;
    }

    public DynamicType.Unloaded<?> make() {
        return builder.make();
    }

    @SneakyThrows
    public Map<TypeDescription, File> save(Path dir) {
        return builder.make().saveIn(dir.toFile());
    }

    @SneakyThrows
    public File save(File jarFile) {
        return builder.make().inject(jarFile);
    }

    @SneakyThrows
    public File toJar(File file) {
        return builder.make().toJar(file);
    }

    public DynamicType.Loaded<?> load(@Nullable ClassLoader loader) {
        return make().load(loader);
    }

    public <S extends ClassLoader> DynamicType.Loaded<?> load(@Nullable S loader, ClassLoadingStrategy<? super S> strategy) {
        return make().load(loader, strategy);
    }

    @Synchronized
    public TypeMake sync(UnaryOperator<DynamicType.Builder<?>> act) {
        builder = act.apply(builder);
        return this;
    }

    public TypeMake field(FieldDescription f) {
        return sync(b -> b.define(f));
    }

    public TypeMake field(FieldDescription f, ByteCodeAppender init) {
        return sync(b -> b.define(f).initializer(init));
    }

    public TypeMake fieldManual(FieldDescription f, UnaryOperator<Manual> init) {
        return sync(b -> b.define(f).initializer(init.apply(Manual.create())));
    }

    public TypeMake fieldCompute(FieldDescription f, UnaryOperator<Compute> init) {
        return sync(b -> b.define(f).initializer(init.apply(Compute.create(b.toTypeDescription(), null))));
    }

    public TypeMake method(MethodDescription m) {
        return sync(b -> b.define(m).withoutCode());
    }

    public TypeMake method(MethodDescription m, Implementation impl) {
        return sync(b -> b.define(m).intercept(impl));
    }

    public TypeMake methodManual(MethodDescription m, UnaryOperator<Manual> impl) {
        return sync(b -> b.define(m).intercept(impl.apply(Manual.create()).implementation()));
    }

    public TypeMake methodCompute(MethodDescription m, UnaryOperator<Compute> impl) {
        return sync(b -> b.define(m).intercept(impl.apply(Compute.create(b.toTypeDescription(), m)).implementation()));
    }

}
