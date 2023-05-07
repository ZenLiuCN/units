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

package cn.zenliu.units.codegen;

import lombok.SneakyThrows;
import lombok.var;
import org.jetbrains.annotations.Nullable;
import org.slf4j.helpers.MessageFormatter;

/**
 * Simple Console logger based on SLf4j formatter
 *
 * @author Zen.Liu
 * @since 2023-05-07
 */
public interface Logger {
    int FLAG_DEBUG = 3;
    int FLAG_WARN = 2;
    int FLAG_ERROR = 1;

    int flag();

    String prefix();

    default boolean isDebugEnabled() {
        return flag() >= FLAG_DEBUG;
    }

    default boolean isWarnEnabled() {
        return flag() >= FLAG_WARN;
    }

    default boolean isErrorEnabled() {
        return flag() >= FLAG_ERROR;
    }

    /**
     * Print message to {@link System#out}.
     */
    default void debug(String message) {
        if (isDebugEnabled()) {
            System.out.println(prefix() + "<DEBUG> \t" + message);
        }
    }

    /**
     * The same as {@link #debug(String)}.
     */
    default void warn(String message) {
        if (isWarnEnabled()) {
            System.out.println(prefix() + "<WARN> \t" + message);
        }
    }

    /**
     * The same as {@link #debug(String)} but output to {@link  System#err}.
     */
    default void error(String message) {
        if (isErrorEnabled()) {
            System.err.println(prefix() + "<ERROR> \t" + message);
        }
    }

    /**
     * The same as {@link #error(String)} but will throw exception.
     */
    default void fatal(String message) {
        System.err.println(prefix() + "<FATAL> \t" + message);
        throw new RuntimeException(message);
    }

    /**
     * Print message to {@link System#out} with {@link MessageFormatter}.
     */
    default void debug(String format, Object... args) {
        if (isDebugEnabled()) {
            if (args == null || args.length == 0) {
                debug(format);
                return;
            }
            var m = MessageFormatter.arrayFormat(prefix() + "<DEBUG> \t" + format, args);
            System.out.println(m.getMessage());
            if (m.getThrowable() != null) m.getThrowable().printStackTrace(System.out);
        }
    }

    /**
     * The same as {@link #debug(String, Object...)}.
     */
    default void warn(String format, Object... args) {
        if (isWarnEnabled()) {
            if (args == null || args.length == 0) {
                warn(format);
                return;
            }
            var m = MessageFormatter.arrayFormat(prefix() + "<WARN> \t" + format, args);
            System.out.println(m.getMessage());
            if (m.getThrowable() != null) m.getThrowable().printStackTrace(System.out);
        }
    }

    /**
     * The same as {@link #debug(String, Object...)}, but output to {@link System#err}.
     */
    default void error(String format, Object... args) {
        if (isErrorEnabled()) {
            if (args == null || args.length == 0) {
                error(format);
                return;
            }
            var m = MessageFormatter.arrayFormat(prefix() + "<ERROR> \t" + format, args);
            System.err.println(m.getMessage());
            if (m.getThrowable() != null) m.getThrowable().printStackTrace(System.err);
        }
    }

    /**
     * The same as {@link #error(String, Object...)}, but always throw an exception.
     */
    @SneakyThrows
    default void fatal(String format, Object... args) {
        if (args == null || args.length == 0) {
            fatal(format);
            return;
        }
        var m = MessageFormatter.arrayFormat(prefix() + "<ERROR> \t" + format, args);
        System.err.println(m.getMessage());
        if (m.getThrowable() != null) {
            m.getThrowable().printStackTrace(System.err);
            throw m.getThrowable();
        } else {
            throw new RuntimeException(m.getMessage());
        }
    }

    class Simple implements Logger {
        @Override
        public int flag() {
            return flag;
        }

        final int flag;

        @Override
        public String prefix() {
            return prefix;
        }

        final String prefix;

        Simple(int flag, String prefix) {
            this.flag = flag;
            this.prefix = prefix;
        }
    }

    static Logger simple(int flag, @Nullable String prefix) {
        return new Simple(flag, prefix);
    }

    static State state(int flag, @Nullable String prefix) {
        return new State(flag, prefix);
    }

    static Stated stateLogger(int flag, @Nullable String prefix) {
        var s = new State(flag, prefix);
        return () -> s;
    }

    class State {

        public int flag() {
            return flag;
        }

        final int flag;


        public String prefix() {
            return prefix;
        }

        final String prefix;

        State(int flag, String prefix) {
            this.flag = flag;
            this.prefix = prefix;
        }
    }

    interface Stated extends Logger {
        State state();

        @Override
        default int flag() {
            return state().flag;
        }

        @Override
        default String prefix() {
            return state().prefix;
        }
    }
}
