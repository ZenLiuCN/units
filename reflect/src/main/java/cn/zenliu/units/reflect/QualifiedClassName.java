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

package cn.zenliu.units.reflect;

import lombok.Getter;
import lombok.SneakyThrows;
import lombok.experimental.Accessors;
import lombok.var;

import java.lang.reflect.Array;
import java.util.HashSet;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
@Getter
@Accessors(fluent = true)
public final class QualifiedClassName extends QualifiedName<Class<?>> {
    final String name;
    final int dim;


    QualifiedClassName(String fqn) {
        super(fqn);
        var dim = 0;
        var idx = fqn.indexOf('[');
        var com = fqn;
        if (idx > 0) {
            dim = (fqn.length() - idx) / 2;
            com = fqn.substring(0, idx);
        }
        this.name = com;
        this.dim = dim;
    }

    @SuppressWarnings("removal")
    private Class<?> findInStack() {
        Class<?>[] stackTraceClasses = null;
        try {
            stackTraceClasses = new SecurityManager() {

                public Class<?>[] classContext() {
                    return super.getClassContext();
                }
            }.classContext();
        } catch (Error ignore) {
        }
        if (stackTraceClasses == null)
            return null;
        var history = new HashSet<ClassLoader>();
        history.add(QualifiedClassName.class.getClassLoader());
        history.add(Thread.currentThread().getContextClassLoader());
        for (var cls : stackTraceClasses) {
            var cl = cls.getClassLoader();
            if (history.contains(cl)) {
                continue;
            }
            history.add(cl);
            var out = find(cl, false);
            if (out != null) return out;
        }
        return null;
    }

    public Class<?> find(ClassLoader cl, boolean inStack) {
        var p = Ref.Type.primitive(name);
        var cached = false;
        if (p == null) p = $.classes.getIfPresent(name);
        if (p != null) cached = true;
        if (p == null) {
            try {
                p = Class.forName(name);
            } catch (ClassNotFoundException ignore) {
                var tcl = Thread.currentThread().getContextClassLoader();
                if (cl != tcl && tcl != null) return find(tcl, inStack);
                p = inStack ? findInStack() : null;
            }
        }
        if (p != null && !cached) $.classes.put(name, p);
        if (p != null && dim > 0) p = Array.newInstance(p, new int[dim]).getClass();
        return p;
    }

    @SneakyThrows
    public Class<?> mustFind(ClassLoader cl, boolean inStack) {
        var cls = find(cl, inStack);
        if (cls == null) throw new ClassNotFoundException(qualifiedName);
        return cls;
    }

    public static QualifiedClassName of(String fqn) {
        return new QualifiedClassName(fqn);
    }
}
