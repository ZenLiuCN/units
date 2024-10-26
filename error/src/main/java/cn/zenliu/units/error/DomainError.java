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
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.slf4j.helpers.MessageFormatter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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

    public static final int CODE_BAD_REQUEST = 400;
    public static final int CODE_UNAUTHORIZED = 401;
    public static final int CODE_PAYMENT_REQUIRED = 402;
    public static final int CODE_FORBIDDEN = 403;
    public static final int CODE_NOT_FOUND = 404;
    public static final int CODE_METHOD_NOT_ALLOWED = 405;
    public static final int CODE_NOT_ACCEPTABLE = 406;
    public static final int CODE_REQUEST_TIMEOUT = 408;

    public static final int CODE_CONFLICT = 409;
    public static final int CODE_GONE = 410;
    public static final int CODE_PRECONDITION_FAILED = 412;
    public static final int CODE_UNSUPPORTED_MEDIA_TYPE = 415;
    public static final int CODE_UNSUPPORTED_TYPE = 416;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final int CODE_UNAVAILABLE_FOR_LEGAL_REASONS = 451;
    public static final int CODE_INTERNAL_SERVER_ERROR = 500;
    public static final int CODE_NOT_IMPLEMENTED = 501;
    public static final int CODE_BAD_GATEWAY = 502;
    public static final int CODE_SERVICE_UNAVAILABLE = 503;
    public static final int CODE_GATEWAY_TIMEOUT = 504;
    public static final int CODE_NETWORK_AUTHENTICATION_REQUIRED = 505;
    @Deprecated
    public static final int CODE_INTERNAL = CODE_INTERNAL_SERVER_ERROR;
    @Deprecated
    public static final int CODE_TIMEOUT = CODE_REQUEST_TIMEOUT;
    @Deprecated
    public static final int CODE_UNAVAILABLE = CODE_SERVICE_UNAVAILABLE;

    //region Deprecated functions

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
     * @deprecated will be removed soon
     */
    @Deprecated
    public static DomainError error(int code, Function<String, String> translator, String system, String user, int from, Object... args) {
        if (args.length == 0)
            return new DomainError(code, translate(translator, user), translate(translator, system), null);
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

    @Deprecated

    public static DomainError badRequest(String pattern, Object... args) {
        return error(CODE_BAD_REQUEST, pattern, args);
    }

    @Deprecated
    public static DomainError badRequestSys(String pattern, Object... args) {
        return errorSys(CODE_BAD_REQUEST, pattern, args);
    }

    @Deprecated

    public static DomainError badRequest(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_BAD_REQUEST, system, user, from, args);
    }

    @Deprecated
    public static DomainError unauthorized(String pattern, Object... args) {
        return error(CODE_UNAUTHORIZED, pattern, args);
    }

    public static DomainError unauthorizedSys(String pattern, Object... args) {
        return errorSys(CODE_UNAUTHORIZED, pattern, args);
    }

    @Deprecated

    public static DomainError unauthorized(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_UNAUTHORIZED, system, user, from, args);
    }

    @Deprecated
    public static DomainError forbidden(String pattern, Object... args) {
        return error(CODE_FORBIDDEN, pattern, args);
    }

    @Deprecated
    public static DomainError forbiddenSys(String pattern, Object... args) {
        return errorSys(CODE_FORBIDDEN, pattern, args);
    }

    @Deprecated

    public static DomainError forbidden(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_FORBIDDEN, system, user, from, args);
    }

    @Deprecated
    public static DomainError notFound(String pattern, Object... args) {
        return error(CODE_NOT_FOUND, pattern, args);
    }

    @Deprecated
    public static DomainError notFoundSys(String pattern, Object... args) {
        return errorSys(CODE_NOT_FOUND, pattern, args);
    }

    @Deprecated

    public static DomainError notFound(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_NOT_FOUND, system, user, from, args);
    }

    @Deprecated
    public static DomainError timeout(String pattern, Object... args) {
        return error(CODE_TIMEOUT, pattern, args);
    }

    @Deprecated
    public static DomainError timeoutSys(String pattern, Object... args) {
        return errorSys(CODE_TIMEOUT, pattern, args);
    }

    @Deprecated
    public static DomainError timeout(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_TIMEOUT, system, user, from, args);
    }

    @Deprecated
    public static DomainError conflict(String pattern, Object... args) {
        return error(CODE_CONFLICT, pattern, args);
    }

    @Deprecated
    public static DomainError conflictSys(String pattern, Object... args) {
        return errorSys(CODE_CONFLICT, pattern, args);
    }

    @Deprecated

    public static DomainError conflict(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_CONFLICT, system, user, from, args);
    }

    @Deprecated
    public static DomainError gone(String pattern, Object... args) {
        return error(CODE_GONE, pattern, args);
    }

    @Deprecated
    public static DomainError goneSys(String pattern, Object... args) {
        return errorSys(CODE_GONE, pattern, args);
    }

    @Deprecated
    public static DomainError gone(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_GONE, system, user, from, args);
    }

    @Deprecated
    public static DomainError internal(String pattern, Object... args) {
        return error(CODE_INTERNAL, pattern, args);
    }

    @Deprecated
    public static DomainError internalSys(String pattern, Object... args) {
        return errorSys(CODE_INTERNAL, pattern, args);
    }

    @Deprecated
    public static DomainError internal(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_INTERNAL, system, user, from, args);
    }

    @Deprecated
    public static DomainError unavailable(String pattern, Object... args) {
        return error(CODE_UNAVAILABLE, pattern, args);
    }

    @Deprecated
    public static DomainError unavailableSys(String pattern, Object... args) {
        return errorSys(CODE_UNAVAILABLE, pattern, args);
    }

    @Deprecated

    public static DomainError unavailable(String system, String user, @Range(from = -2, to = Integer.MAX_VALUE) int from, Object... args) {
        return error(CODE_UNAVAILABLE, system, user, from, args);
    }

    @Deprecated
    public static DomainError error(int code, String userPattern, Object... args) {
        return new DomainError(code, formatAll(userPattern, null, args));
    }

    @Deprecated
    public static DomainError errorSys(int code, String systemPattern, Object... args) {
        return new DomainError(code, formatAll(null, systemPattern, args));
    }

    @JsonProperty
    public int code() {
        return code;
    }


    @JsonProperty
    public String message() {
        return user == null ? system : user;
    }
    //endregion

    public record Tuple2<V1, V2>(V1 v1, V2 v2) {
    }

    public record Tuple3<V1, V2, V3>(V1 v1, V2 v2, V3 v3) {
    }

    public static final AtomicInteger STACK_TRACE_SIZE = new AtomicInteger(1024);


    public final int code;
    public final String user;
    public final String system;
    protected transient List<String> stacktrace;

    protected void setStacktrace(List<String> trace) {
        this.stacktrace = trace;
    }

    static public Tuple2<String, Throwable> format(String pattern, Object... args) {
        var o = MessageFormatter.format(pattern, args);
        return new Tuple2<>(o.getMessage(), o.getThrowable());
    }

    static public Tuple3<String, String, Throwable> formatAll(@Nullable String userPattern, @Nullable String systemPattern, Object... args) {
        if ((userPattern == null || userPattern.isBlank()) && (systemPattern == null || systemPattern.isBlank())) {
            return new Tuple3<>(null, null, null);
        }

        var u = userPattern == null || userPattern.isBlank() ? null : MessageFormatter.format(userPattern, args);
        var s = systemPattern == null || systemPattern.isBlank() ? null : MessageFormatter.format(systemPattern, args);
        return new Tuple3<>(u == null ? null : u.getMessage(), s == null ? null : s.getMessage(), (u == null ? s : u).getThrowable());
    }

    static public List<String> dumpStack(Throwable ex) {
        List<String> out = List.of();
        try (var sb = new ByteArrayOutputStream(STACK_TRACE_SIZE.get())) {
            ex.printStackTrace(new PrintWriter(sb, true, StandardCharsets.UTF_8));
            var s = sb.toString();
            if (s != null && !s.isBlank()) {
                out = new ArrayList<>();
                for (var line : s.split("\n")) {
                    out.add(line.replaceAll("\t", "    "));
                }
            } else {
                out = s == null ? List.of() : List.of(s);
            }
        } catch (IOException ignored) {

        }
        return out;
    }

    public List<String> stacktrace() {
        if (stacktrace == null) {
            stacktrace = dumpStack(this);
        }
        return stacktrace;
    }

    protected DomainError(int code, Tuple3<String, String, Throwable> u) {
        super(u.v2 == null || u.v2.isBlank() ? u.v1 : u.v2, u.v3);
        this.code = code;
        this.user = u.v1;
        this.system = u.v2;
    }

    protected DomainError(int code, String user, String system, Throwable cause) {
        super(system == null || system.isBlank() ? user : system, cause);
        this.code = code;
        this.user = user;
        this.system = system;
    }

    protected DomainError(int code, String user, String system, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(system == null || system.isBlank() ? user : system, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.user = user;
        this.system = system;
    }

    public static DomainError error(int code, @Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(code, user, system, cause);
    }

    public static DomainError error(int code, String user, String system, Object... args) {
        return new DomainError(code, formatAll(user, system, args));
    }

    public static DomainError badRequest(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_BAD_REQUEST, user, system, cause);
    }

    public static DomainError unauthorized(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_UNAUTHORIZED, user, system, cause);
    }

    public static DomainError paymentRequired(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_PAYMENT_REQUIRED, user, system, cause);
    }

    public static DomainError forbidden(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_FORBIDDEN, user, system, cause);
    }

    public static DomainError notFound(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_NOT_FOUND, user, system, cause);
    }

    public static DomainError methodNotAllowed(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_METHOD_NOT_ALLOWED, user, system, cause);
    }

    public static DomainError notAcceptable(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_NOT_ACCEPTABLE, user, system, cause);
    }


    public static DomainError requestTimeout(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_REQUEST_TIMEOUT, user, system, cause);
    }

    public static DomainError conflict(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_CONFLICT, user, system, cause);
    }

    public static DomainError gone(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_GONE, user, system, cause);
    }


    public static DomainError preconditionFailed(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_PRECONDITION_FAILED, user, system, cause);
    }

    public static DomainError unsupportedMediaType(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_UNSUPPORTED_MEDIA_TYPE, user, system, cause);
    }

    public static DomainError unsupportedType(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_UNSUPPORTED_TYPE, user, system, cause);
    }

    public static DomainError tooManyRequests(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_TOO_MANY_REQUESTS, user, system, cause);
    }

    public static DomainError unavailableForLegalReasons(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_UNAVAILABLE_FOR_LEGAL_REASONS, user, system, cause);
    }

    public static DomainError internalServerError(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_INTERNAL_SERVER_ERROR, user, system, cause);
    }

    public static DomainError notImplemented(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_NOT_IMPLEMENTED, user, system, cause);
    }

    public static DomainError badGateway(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_BAD_GATEWAY, user, system, cause);
    }

    public static DomainError serviceUnavailable(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_SERVICE_UNAVAILABLE, user, system, cause);
    }

    public static DomainError gatewayTimeout(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_GATEWAY_TIMEOUT, user, system, cause);
    }

    public static DomainError networkAuthenticationRequired(@Nullable String user, @Nullable String system, @Nullable Throwable cause) {
        return new DomainError(CODE_NETWORK_AUTHENTICATION_REQUIRED, user, system, cause);
    }

    public static DomainError badRequest(Tuple3<String, String, Throwable> u) {
        return badRequest(u.v1, u.v2, u.v3);
    }

    public static DomainError unauthorized(Tuple3<String, String, Throwable> u) {
        return unauthorized(u.v1, u.v2, u.v3);
    }

    public static DomainError paymentRequired(Tuple3<String, String, Throwable> u) {
        return paymentRequired(u.v1, u.v2, u.v3);
    }

    public static DomainError forbidden(Tuple3<String, String, Throwable> u) {
        return forbidden(u.v1, u.v2, u.v3);
    }

    public static DomainError notFound(Tuple3<String, String, Throwable> u) {
        return notFound(u.v1, u.v2, u.v3);
    }

    public static DomainError methodNotAllowed(Tuple3<String, String, Throwable> u) {
        return methodNotAllowed(u.v1, u.v2, u.v3);
    }

    public static DomainError notAcceptable(Tuple3<String, String, Throwable> u) {
        return notAcceptable(u.v1, u.v2, u.v3);
    }

    public static DomainError proxyAuthenticationRequired(Tuple3<String, String, Throwable> u) {
        return proxyAuthenticationRequired(u.v1, u.v2, u.v3);
    }

    public static DomainError requestTimeout(Tuple3<String, String, Throwable> u) {
        return requestTimeout(u.v1, u.v2, u.v3);
    }

    public static DomainError conflict(Tuple3<String, String, Throwable> u) {
        return conflict(u.v1, u.v2, u.v3);
    }

    public static DomainError gone(Tuple3<String, String, Throwable> u) {
        return gone(u.v1, u.v2, u.v3);
    }

    public static DomainError lengthRequired(Tuple3<String, String, Throwable> u) {
        return lengthRequired(u.v1, u.v2, u.v3);
    }

    public static DomainError preconditionFailed(Tuple3<String, String, Throwable> u) {
        return preconditionFailed(u.v1, u.v2, u.v3);
    }

    public static DomainError unsupportedMediaType(Tuple3<String, String, Throwable> u) {
        return unsupportedMediaType(u.v1, u.v2, u.v3);
    }

    public static DomainError unsupportedType(Tuple3<String, String, Throwable> u) {
        return unsupportedType(u.v1, u.v2, u.v3);
    }

    public static DomainError tooManyRequests(Tuple3<String, String, Throwable> u) {
        return tooManyRequests(u.v1, u.v2, u.v3);
    }

    public static DomainError unavailableForLegalReasons(Tuple3<String, String, Throwable> u) {
        return unavailableForLegalReasons(u.v1, u.v2, u.v3);
    }

    public static DomainError internalServerError(Tuple3<String, String, Throwable> u) {
        return internalServerError(u.v1, u.v2, u.v3);
    }

    public static DomainError notImplemented(Tuple3<String, String, Throwable> u) {
        return notImplemented(u.v1, u.v2, u.v3);
    }

    public static DomainError badGateway(Tuple3<String, String, Throwable> u) {
        return badGateway(u.v1, u.v2, u.v3);
    }

    public static DomainError serviceUnavailable(Tuple3<String, String, Throwable> u) {
        return serviceUnavailable(u.v1, u.v2, u.v3);
    }

    public static DomainError gatewayTimeout(Tuple3<String, String, Throwable> u) {
        return gatewayTimeout(u.v1, u.v2, u.v3);
    }

    public static DomainError networkAuthenticationRequired(Tuple3<String, String, Throwable> u) {
        return networkAuthenticationRequired(u.v1, u.v2, u.v3);
    }

    public static DomainError badRequest(String userPattern, String systemPattern, Object... args) {
        return badRequest(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError unauthorized(String userPattern, String systemPattern, Object... args) {
        return unauthorized(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError paymentRequired(String userPattern, String systemPattern, Object... args) {
        return paymentRequired(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError forbidden(String userPattern, String systemPattern, Object... args) {
        return forbidden(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError notFound(String userPattern, String systemPattern, Object... args) {
        return notFound(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError methodNotAllowed(String userPattern, String systemPattern, Object... args) {
        return methodNotAllowed(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError notAcceptable(String userPattern, String systemPattern, Object... args) {
        return notAcceptable(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError proxyAuthenticationRequired(String userPattern, String systemPattern, Object... args) {
        return proxyAuthenticationRequired(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError requestTimeout(String userPattern, String systemPattern, Object... args) {
        return requestTimeout(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError conflict(String userPattern, String systemPattern, Object... args) {
        return conflict(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError gone(String userPattern, String systemPattern, Object... args) {
        return gone(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError lengthRequired(String userPattern, String systemPattern, Object... args) {
        return lengthRequired(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError preconditionFailed(String userPattern, String systemPattern, Object... args) {
        return preconditionFailed(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError unsupportedMediaType(String userPattern, String systemPattern, Object... args) {
        return unsupportedMediaType(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError unsupportedType(String userPattern, String systemPattern, Object... args) {
        return unsupportedType(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError tooManyRequests(String userPattern, String systemPattern, Object... args) {
        return tooManyRequests(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError unavailableForLegalReasons(String userPattern, String systemPattern, Object... args) {
        return unavailableForLegalReasons(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError internalServerError(String userPattern, String systemPattern, Object... args) {
        return internalServerError(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError notImplemented(String userPattern, String systemPattern, Object... args) {
        return notImplemented(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError badGateway(String userPattern, String systemPattern, Object... args) {
        return badGateway(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError serviceUnavailable(String userPattern, String systemPattern, Object... args) {
        return serviceUnavailable(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError gatewayTimeout(String userPattern, String systemPattern, Object... args) {
        return gatewayTimeout(formatAll(userPattern, systemPattern, args));
    }

    public static DomainError networkAuthenticationRequired(String userPattern, String systemPattern, Object... args) {
        return networkAuthenticationRequired(formatAll(userPattern, systemPattern, args));
    }

    interface Maker {
        DomainError with(Object... args);
    }

    /**
     * @param code the error code
     * @param userPattern user message pattern
     * @param systemPattern system message pattern
     * @param preArgs predefined arguments
     * @return maker of Domain error
     */
    public static Maker errorMaker(int code, @Nullable String userPattern, @Nullable String systemPattern, Object... preArgs) {
        return (as) -> error(code, userPattern, systemPattern, append(preArgs, as));
    }

    static final Object[] Empty = new Object[0];

    public static Object[] append(Object[] a, Object[] b) {
        if (a.length == 0 && b.length == 0) return Empty;
        if (a.length == 0) return b;
        if (b.length == 0) return a;
        int an = a.length;
        a = Arrays.copyOf(a, an + b.length);
        System.arraycopy(a, an, b, 0, b.length);
        return a;
    }


    public static Maker makeBadRequest(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_BAD_REQUEST,user,system,preArgs);}
    public static Maker makeUnauthorized(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_UNAUTHORIZED,user,system,preArgs);}
    public static Maker makePaymentRequired(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_PAYMENT_REQUIRED,user,system,preArgs);}
    public static Maker makeForbidden(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_FORBIDDEN,user,system,preArgs);}
    public static Maker makeNotFound(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_NOT_FOUND,user,system,preArgs);}
    public static Maker makeMethodNotAllowed(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_METHOD_NOT_ALLOWED,user,system,preArgs);}
    public static Maker makeNotAcceptable(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_NOT_ACCEPTABLE,user,system,preArgs);}
    public static Maker makeRequestTimeout(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_REQUEST_TIMEOUT,user,system,preArgs);}
    public static Maker makeConflict(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_CONFLICT,user,system,preArgs);}
    public static Maker makeGone(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_GONE,user,system,preArgs);}
    public static Maker makePreconditionFailed(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_PRECONDITION_FAILED,user,system,preArgs);}
    public static Maker makeUnsupportedMediaType(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_UNSUPPORTED_MEDIA_TYPE,user,system,preArgs);}
    public static Maker makeUnsupportedType(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_UNSUPPORTED_TYPE,user,system,preArgs);}
    public static Maker makeTooManyRequests(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_TOO_MANY_REQUESTS,user,system,preArgs);}
    public static Maker makeUnavailableForLegalReasons(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_UNAVAILABLE_FOR_LEGAL_REASONS,user,system,preArgs);}
    public static Maker makeInternalServerError(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_INTERNAL_SERVER_ERROR,user,system,preArgs);}
    public static Maker makeNotImplemented(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_NOT_IMPLEMENTED,user,system,preArgs);}
    public static Maker makeBadGateway(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_BAD_GATEWAY,user,system,preArgs);}
    public static Maker makeServiceUnavailable(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_SERVICE_UNAVAILABLE,user,system,preArgs);}
    public static Maker makeGatewayTimeout(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_GATEWAY_TIMEOUT,user,system,preArgs);}
    public static Maker makeNetworkAuthenticationRequired(@Nullable String user,String system,Object ... preArgs){return errorMaker(CODE_NETWORK_AUTHENTICATION_REQUIRED,user,system,preArgs);}
}


