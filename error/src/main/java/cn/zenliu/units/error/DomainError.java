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

package cn.zenliu.units.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.slf4j.helpers.MessageFormatter;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/**
 * Domain Error is a RuntimeException with StatusCode and Optional UserMessage.
 *
 * @author Zen.Liu
 * @since 2023-05-04
 */
@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DomainError extends RuntimeException {
    /**
     * Holder of translator use AtomicReference
     */
    @UtilityClass
    public static class TranslatorHolder {
        private static final AtomicReference<Function<String, String>> local = new AtomicReference<>();

        public static @Nullable Function<String, String> get() {
            return local.get();
        }

        public static void set(@Nullable Function<String, String> translator) {
            local.set(translator);
        }
    }

    static String translate(@Nullable Function<String, String> translator, @Nullable String key) {
        try {
            if (key == null) return null;
            if (translator == null) return key;
            var v = translator.apply(key);
            if (v == null) return key;
            return v;
        } catch (Exception ex) {
            System.err.println("translate error " + key);
            ex.printStackTrace();
            return key;
        }
    }

    /**
     * use detailed message control.
     *
     * @param code       the error code
     * @param translator optional i18n translator ,with translator will treat patter as a key
     * @param system     system message pattern, null for not use.
     * @param user       user message pattern, null for not use.
     * @param from       start of argument index for user message:<br/>
     *                   -2 for no user pattern arguments;<br/>
     *                   -1 for both use full-length of arguments;<br/>
     *                   0 for no system pattern arguments;<br/>
     *                   >0 for the cut point for user pattern arguments,system pattern use full-length arguments; <br/>
     * @param args       all args
     * @return DomainError
     */
    public static DomainError error(int code, Function<String, String> translator, String system, String user, int from, Object... args) {
        if (args.length == 0) return new DomainError(code, translate(translator, user), translate(translator, system));
        assert from < args.length : "user message argument start point longer than arguments";
        switch (from) {
            case -2 -> {
                var sm = MessageFormatter.arrayFormat(translate(translator, system), args);
                return new DomainError(code, translate(translator, user), sm.getMessage(), sm.getThrowable());
            }
            case -1 -> {
                var sm = MessageFormatter.arrayFormat(translate(translator, system), args);
                var um = MessageFormatter.arrayFormat(translate(translator, user), args);
                return new DomainError(code, um.getMessage(), sm.getMessage(), sm.getThrowable());
            }
            case 0 -> {
                var um = MessageFormatter.arrayFormat(translate(translator, user), args);
                return new DomainError(code, um.getMessage(), system == null ? um.getMessage() : translate(translator, system), um.getThrowable());
            }
            default -> {
                if (from < 0 || from > args.length)
                    throw new IndexOutOfBoundsException("from " + from + " invalid in length of " + args.length);
                var sm = system == null ? null : MessageFormatter.arrayFormat(translate(translator, system), args);
                var um = user == null ? null : MessageFormatter.arrayFormat(translate(translator, user),
                        Arrays.copyOfRange(args, from, args.length - from));
                return new DomainError(code,
                        user == null && system == null ? null : user != null ? um.getMessage() : sm.getMessage(),
                        user == null && system == null ? null : system != null ? sm.getMessage() : um.getMessage(),
                        system != null ? sm.getThrowable() : user != null ? um.getThrowable() : null);
            }
        }

    }


    /**
     * use same message as user message and system message (which inside {@link Exception#getMessage()})
     *
     * @param code    the error code
     * @param pattern the message pattern in a SLF4j style.
     * @param args    the arguments
     * @return throwable
     */
    public static DomainError error(int code, String pattern, Object... args) {
        return error(code, TranslatorHolder.get(), null, pattern, 0, args);
    }

    /**
     * use detailed message control.
     *
     * @param code   the error code
     * @param system system message pattern, null for not use.
     * @param user   user message pattern, null for not use.
     * @param from   start of argument index for user message:<br/>
     *               -2 for no user pattern arguments;<br/>
     *               -1 for both use full-length of arguments;<br/>
     *               0 for no system pattern arguments;<br/>
     *               >0 for the cut point for user pattern arguments,system pattern use full-length arguments; <br/>
     * @param args   all args
     * @return DomainError
     */
    public static DomainError error(int code, String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(code, TranslatorHolder.get(), system, user, from, args);

    }

    public static final int CODE_BAD_REQUEST = 400;
    public static final int CODE_UNAUTHORIZED = 401;
    public static final int CODE_FORBIDDEN = 403;
    public static final int CODE_NOT_FOUND = 404;
    public static final int CODE_TIMEOUT = 408;
    public static final int CODE_CONFLICT = 409;
    public static final int CODE_GONE = 510;
    public static final int CODE_INTERNAL = 500;
    public static final int CODE_UNAVAILABLE = 503;

    public static DomainError badRequest(String pattern, Object... args) {
        return error(CODE_BAD_REQUEST, pattern, args);
    }


    public static DomainError badRequest(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_BAD_REQUEST, system, user, from, args);
    }

    public static DomainError unauthorized(String pattern, Object... args) {
        return error(CODE_UNAUTHORIZED, pattern, args);
    }


    public static DomainError unauthorized(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_UNAUTHORIZED, system, user, from, args);
    }

    public static DomainError forbidden(String pattern, Object... args) {
        return error(CODE_FORBIDDEN, pattern, args);
    }


    public static DomainError forbidden(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_FORBIDDEN, system, user, from, args);
    }

    public static DomainError notFound(String pattern, Object... args) {
        return error(CODE_NOT_FOUND, pattern, args);
    }


    public static DomainError notFound(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_NOT_FOUND, system, user, from, args);
    }

    public static DomainError timeout(String pattern, Object... args) {
        return error(CODE_TIMEOUT, pattern, args);
    }


    public static DomainError timeout(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_TIMEOUT, system, user, from, args);
    }

    public static DomainError conflict(String pattern, Object... args) {
        return error(CODE_CONFLICT, pattern, args);
    }


    public static DomainError conflict(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_CONFLICT, system, user, from, args);
    }

    public static DomainError gone(String pattern, Object... args) {
        return error(CODE_GONE, pattern, args);
    }


    public static DomainError gone(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_GONE, system, user, from, args);
    }

    public static DomainError internal(String pattern, Object... args) {
        return error(CODE_INTERNAL, pattern, args);
    }


    public static DomainError internal(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_INTERNAL, system, user, from, args);
    }

    public static DomainError unavailable(String pattern, Object... args) {
        return error(CODE_UNAVAILABLE, pattern, args);
    }


    public static DomainError unavailable(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_UNAVAILABLE, system, user, from, args);
    }

    @JsonProperty
    public int code() {
        return code;
    }

    @JsonProperty
    public String message() {
        return message;
    }

    final int code;
    final String message;


    protected DomainError() {
        this(500, null, null);
    }

    public DomainError(int code, @Nullable String message, @Nullable String systemMessage) {
        super(systemMessage == null ? message : systemMessage);
        this.message = message;
        this.code = code;
    }

    protected DomainError(int code, String message, String systemMessage, Throwable cause) {
        super(systemMessage == null ? message : systemMessage, cause);
        this.message = message;
        this.code = code;
    }

    protected DomainError(Throwable cause) {
        super(cause);
        this.message = null;
        this.code = 500;
    }

    protected DomainError(String systemMessage, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(systemMessage == null ? message : systemMessage, cause, enableSuppression, writableStackTrace);
        this.message = message;
        this.code = 500;
    }
}
