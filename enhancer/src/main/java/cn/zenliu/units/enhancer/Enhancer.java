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


import cn.zenliu.units.codegen.Configure;
import lombok.var;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.matcher.ElementMatcher;
import org.jetbrains.annotations.NotNull;

/**
 * @author Zen.Liu
 * @since 2023-05-06
 */
public abstract class Enhancer implements Comparable<Enhancer> ,AutoCloseable{

    public abstract ElementMatcher.Junction<TypeDescription> matches(EnhanceUtil util);

    public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, Context ctx, EnhanceUtil util) {
        var c = util.configurer().resolve(ctx, util);
        return process(builder, ctx, c, util);
    }

    /**
     * @param builder current type builder
     * @param ctx     current context
     * @param conf    config relative to element
     * @param util    util
     * @return none null builder
     */
    protected abstract DynamicType.Builder<?> process(DynamicType.Builder<?> builder, Context ctx, Configure.Config conf, EnhanceUtil util);

    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int compareTo(@NotNull Enhancer o) {
        return 0;
    }

    @Override
    public void close() {

    }
}
