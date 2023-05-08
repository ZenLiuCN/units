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
import cn.zenliu.units.codegen.Configure;
import cn.zenliu.units.processor.unit.CodeGenerator;
import lombok.var;

import javax.lang.model.element.Element;
import java.net.URI;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
public interface Configurer extends Configure {
    /**
     * Parse the global (module or project level) configuration of CodeGenerators.
     * Only called when a Root Config has been set.
     *
     * @return Key: accept annotation patterns, value set of CodeGenerators.
     */
    Map<String, Set<CodeGenerator>> generators();


    default boolean init() {
        return Configure.super.init("[ Processor ]", "process.debug");
    }

    default Configure.Config resolve(BaseUtil u, Element element) {
        URI uri = com.sun.source.util.Trees.instance(u.env()).getPath(element).getCompilationUnit().getSourceFile().toUri();
        if (uri.getScheme() == null) {
            debug("Can't found element {} path from URI {}", element, uri.toASCIIString());
            return rootConfig();
        }
        //the source parent
        var path = Paths.get(uri).toAbsolutePath();
        var configs = locator().resolve(path);
        return build(configs);
    }

    static Configurer load() {
        var loader = ServiceLoader.load(Configurer.class, Configurer.class.getClassLoader()).iterator();
        if (loader.hasNext()) {
            return loader.next();
        }
        return new DefaultImpl();
    }

    class DefaultImpl extends Configure.DefaultConfigure implements Configurer {

        public DefaultImpl() {
            super("process.properties");
        }

        @Override
        public Map<String, Set<CodeGenerator>> generators() {
            assert root != null;
            if (!root.isEnabled()) return Collections.emptyMap();
            var classes = root.readString("generators").orElse(null);
            if (classes == null) {
                error("Missing properties key 'generators', none of CodeGenerator will be used");
                return Collections.emptyMap();
            }
            var map = new HashMap<String, Set<CodeGenerator>>();
            for (String name : classes.split(",")) {
                var gen = Classes.loadClass(CodeGenerator.class, name.trim());
                for (String type : gen.acceptTypes()) {
                    var set = map.computeIfAbsent(type.trim(), $ -> new HashSet<>());
                    set.add(gen);
                }
            }
            return map;
        }
    }
}
