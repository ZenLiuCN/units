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

import lombok.var;
import net.bytebuddy.build.BuildLogger;
import org.slf4j.helpers.MessageFormatter;

import java.nio.file.Path;

/**
 * @author Zen.Liu
 * @since 2023-05-06
 */
public interface EnhanceUtil {
    Configurer configurer();
    Path classRoot();

    BuildLogger logger();

    default void info(String pattern, Object... args) {
        var l = logger();
        if (l.isInfoEnabled()) {
            if (args == null || args.length == 0) l.info(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.info(m.getMessage(), t);
            else l.info(m.getMessage());
        }
    }

    default void debug(String pattern, Object... args) {
        var l = logger();
        if (l.isDebugEnabled()) {
            if (args == null || args.length == 0) l.debug(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.debug(m.getMessage(), t);
            else l.debug(m.getMessage());
        }
    }

    default void warn(String pattern, Object... args) {
        var l = logger();
        if (l.isWarnEnabled()) {
            if (args == null || args.length == 0) l.warn(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.warn(m.getMessage(), t);
            else l.warn(m.getMessage());
        }
    }

    default void error(String pattern, Object... args) {
        var l = logger();
        if (l.isErrorEnabled()) {
            if (args == null || args.length == 0) l.error(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.error(m.getMessage(), t);
            else l.error(m.getMessage());
        }
    }

    default void info(Enhancer enhancer, String pattern, Object... args) {
        var l = logger();
        if (l.isInfoEnabled()) {
            pattern = "[" + enhancer.name() + "\t] " + pattern;
            if (args == null || args.length == 0) l.info(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.info(m.getMessage(), t);
            else l.info(m.getMessage());
        }
    }

    default void debug(Enhancer enhancer, String pattern, Object... args) {
        var l = logger();
        if (l.isDebugEnabled()) {
            pattern = "[" + enhancer.name() + "\t] " + pattern;
            if (args == null || args.length == 0) l.debug(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.debug(m.getMessage(), t);
            else l.debug(m.getMessage());
        }
    }

    default void warn(Enhancer enhancer, String pattern, Object... args) {
        var l = logger();
        if (l.isWarnEnabled()) {
            pattern = "[" + enhancer.name() + "\t] " + pattern;
            if (args == null || args.length == 0) l.warn(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.warn(m.getMessage(), t);
            else l.warn(m.getMessage());
        }
    }

    default void error(Enhancer enhancer, String pattern, Object... args) {
        var l = logger();
        if (l.isErrorEnabled()) {
            pattern = "[" + enhancer.name() + "\t] " + pattern;
            if (args == null || args.length == 0) l.error(pattern);
            var m = MessageFormatter.arrayFormat(pattern, args);
            var t = m.getThrowable();
            if (t != null) l.error(m.getMessage(), t);
            else l.error(m.getMessage());
        }
    }


}
