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

import cn.zenliu.units.codegen.Locator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.var;
import net.bytebuddy.build.BuildLogger;
import net.bytebuddy.build.Plugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.matcher.ElementMatchers;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.SortedSet;


/**
 * The root entrance
 *
 * @author Zen.Liu
 * @since 2023-05-06
 */
@Getter
@EqualsAndHashCode
@Accessors(fluent = true)
public class ByteBuddyEnhancer implements Plugin, EnhanceUtil {
    final Path classRoot;
    final BuildLogger logger;
    final Junction<TypeDescription> matcher;
    final Map<Junction<TypeDescription>, SortedSet<Enhancer>> enhancers;
    final Configurer configurer;

    public ByteBuddyEnhancer(File classRoot, BuildLogger logger) {
        this.classRoot = classRoot.toPath();
        this.logger = logger;
        this.configurer = Configurer.load();
        if (configurer.init()) {
            configurer.debug("user.dir: {}", Locator.USER_DIR());
            configurer.error("missing or invalid configure file , Enhancer disabled");
            matcher = ElementMatchers.none();
            enhancers = Collections.emptyMap();
        } else {
            var p = configurer.resolve(classRoot.toPath());
            if (p) {
                configurer.error("missing or invalid configure file ,Enhancers may disabled ");
                matcher = ElementMatchers.none();
                enhancers = Collections.emptyMap();
                return;
            }
            var root = configurer.parseRoot();
            if (!root.isEnabled()) {
                configurer.error("Enhancers disabled by config file");
                matcher = ElementMatchers.none();
                enhancers = Collections.emptyMap();
                return;
            }
            enhancers = configurer.enhancers(this);
            var junction = (Junction<TypeDescription>) null;
            for (var jun : enhancers.keySet()) {
                junction = junction == null ? jun : junction.or(jun);
            }
            if (junction == null) {
                configurer.error("Empty {} ,Enhancer will disabled ", configurer.locator().root());
                matcher = ElementMatchers.none();
            } else {
                matcher = junction;
            }
        }
    }

    @Override
    public DynamicType.@NotNull Builder<?> apply(DynamicType.@NotNull Builder<?> builder, @NotNull TypeDescription type, @NotNull ClassFileLocator locator) {
        for (var jun : enhancers.keySet()) {
            var ctx = Context.of(type, new ArrayList<>(), locator);
            if (jun.matches(type)) {
                for (var enc : enhancers.get(jun)) {
                    builder = enc.apply(builder, ctx, this);
                }
            }
        }
        return builder;
    }

    @Override
    public void close() {
        if (!enhancers.isEmpty()) enhancers.values().forEach(v -> v.forEach(Enhancer::close));
    }

    @Override
    public boolean matches(TypeDescription type) {
        return matcher.matches(type);
    }
}
