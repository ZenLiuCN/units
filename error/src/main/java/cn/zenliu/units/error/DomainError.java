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
import org.jetbrains.annotations.Nullable;
import org.slf4j.helpers.MessageFormatter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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



    public record Tuple2<V1, V2>(V1 v1, V2 v2) {
    }

    public record Tuple3<V1, V2, V3>(V1 v1, V2 v2, V3 v3) {
    }

    public static final AtomicInteger STACK_TRACE_SIZE = new AtomicInteger(1024);
    public static final AtomicInteger STACK_TRACE_LINES = new AtomicInteger(50);

    public final int code;

    public int code() {
        return code;
    }

    public final String user;
    public final String system;
    protected transient List<String> stacktrace;

    protected void setStacktrace(List<String> trace) {
        this.stacktrace = trace;
    }

    static public Tuple2<String, Throwable> format(String pattern, Object... args) {
        var o = MessageFormatter.arrayFormat(pattern, args);
        return new Tuple2<>(o.getMessage(), o.getThrowable());
    }

    static public Tuple3<String, String, Throwable> formatAll(@Nullable String userPattern, @Nullable String systemPattern, Object... args) {
        if ((userPattern == null || userPattern.isBlank()) && (systemPattern == null || systemPattern.isBlank())) {
            return new Tuple3<>(null, null, null);
        }
        var u = userPattern == null || userPattern.isBlank() ? null : MessageFormatter.arrayFormat(userPattern, args);
        var s = systemPattern == null || systemPattern.isBlank() ? null : MessageFormatter.arrayFormat(systemPattern, args);
        return new Tuple3<>(
                u == null ? null : u.getMessage(),
                s == null ? null : s.getMessage(),
                u == null ? s == null ? null : s.getThrowable() : u.getThrowable());
    }

    static public List<String> dumpStack(Throwable ex, int lines) {
        List<String> out = new ArrayList<>();
        try (var sb = new ByteArrayOutputStream(STACK_TRACE_SIZE.get())) {
            ex.printStackTrace(new PrintWriter(sb, true, StandardCharsets.UTF_8));
            var s = sb.toString();
            if (s != null && !s.isBlank()) {
                for (var line : s.split("\n")) {
                    out.add(line.replaceAll("\t", "    ").replaceAll("\r", ""));
                    if (lines > 0 && out.size() > lines) {
                        break;
                    }
                }
            } else {
                if (s != null) out.add(s);
            }
        } catch (IOException ignored) {

        }
        return out;
    }
    static public List<String> dumpStack(Throwable ex) {
        return dumpStack(ex,STACK_TRACE_LINES.get());
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

    //region no format
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
    //endregion

    //region Tuple
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
    //endregion

    //region Format
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
    //endregion


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

    //region Builder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder code(int code) {
        return new Builder().code(code);
    }

    public static Builder badRequest() {
        return builder().badRequest();
    }

    public static Builder unauthorized() {
        return builder().unauthorized();
    }

    public static Builder paymentRequired() {
        return builder().paymentRequired();
    }

    public static Builder forbidden() {
        return builder().forbidden();
    }

    public static Builder notFound() {
        return builder().notFound();
    }

    public static Builder methodNotAllowed() {
        return builder().methodNotAllowed();
    }

    public static Builder notAcceptable() {
        return builder().notAcceptable();
    }

    public static Builder requestTimeout() {
        return builder().requestTimeout();
    }

    public static Builder conflict() {
        return builder().conflict();
    }

    public static Builder gone() {
        return builder().gone();
    }

    public static Builder preconditionFailed() {
        return builder().preconditionFailed();
    }

    public static Builder unsupportedMediaType() {
        return builder().unsupportedMediaType();
    }

    public static Builder unsupportedType() {
        return builder().unsupportedType();
    }

    public static Builder tooManyRequests() {
        return builder().tooManyRequests();
    }

    public static Builder unavailableForLegalReasons() {
        return builder().unavailableForLegalReasons();
    }

    public static Builder internalServerError() {
        return builder().internalServerError();
    }

    public static Builder notImplemented() {
        return builder().notImplemented();
    }

    public static Builder badGateway() {
        return builder().badGateway();
    }

    public static Builder serviceUnavailable() {
        return builder().serviceUnavailable();
    }

    public static Builder gatewayTimeout() {
        return builder().gatewayTimeout();
    }

    public static Builder networkAuthenticationRequired() {
        return builder().networkAuthenticationRequired();
    }


    public static class Builder {
        int code = 500;
        String u;
        String s;

        /**
         * build without any message
         */
        public DomainError make() {
            return error(code, null, null, new Object[0]);
        }

        /**
         * build with system message only
         *
         * @param pattern the pattern
         * @param args    args
         */

        public DomainError system(String pattern, Object... args) {
            return error(code, null, pattern, args);
        }

        /**
         * build with user message only
         *
         * @param pattern the pattern
         * @param args    args
         */

        public DomainError user(String pattern, Object... args) {
            return error(code, pattern, null, args);
        }

        /**
         * build with user and system use same message
         *
         * @param pattern the pattern
         * @param args    args
         */
        public DomainError all(String pattern, Object... args) {
            return error(code, pattern, pattern, args);
        }

        /**
         * build with user and system use different message
         *
         * @param user   the pattern for user
         * @param system the pattern for system
         * @param args   args
         */
        public DomainError both(String user, String system, Object... args) {
            return error(code, user, system, args);
        }

        /**
         * @param args the args for patterns
         * @return DomainError with pre-stage set values.
         */
        public DomainError make(Object... args) {
            return error(code, u, s, args);
        }

        public Builder forUser(String pattern) {
            this.u = pattern;
            return this;
        }

        public Builder forSystem(String pattern) {
            this.s = pattern;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        public Builder badRequest() {
            code = CODE_BAD_REQUEST;
            return this;
        }

        public Builder c400() {
            code = CODE_BAD_REQUEST;
            return this;
        }

        public Builder unauthorized() {
            code = CODE_UNAUTHORIZED;
            return this;
        }

        public Builder c401() {
            code = CODE_UNAUTHORIZED;
            return this;
        }

        public Builder paymentRequired() {
            code = CODE_PAYMENT_REQUIRED;
            return this;
        }

        public Builder c402() {
            code = CODE_PAYMENT_REQUIRED;
            return this;
        }

        public Builder forbidden() {
            code = CODE_FORBIDDEN;
            return this;
        }

        public Builder c403() {
            code = CODE_FORBIDDEN;
            return this;
        }

        public Builder notFound() {
            code = CODE_NOT_FOUND;
            return this;
        }

        public Builder c404() {
            code = CODE_NOT_FOUND;
            return this;
        }

        public Builder methodNotAllowed() {
            code = CODE_METHOD_NOT_ALLOWED;
            return this;
        }

        public Builder c405() {
            code = CODE_METHOD_NOT_ALLOWED;
            return this;
        }

        public Builder notAcceptable() {
            code = CODE_NOT_ACCEPTABLE;
            return this;
        }

        public Builder c406() {
            code = CODE_NOT_ACCEPTABLE;
            return this;
        }

        public Builder requestTimeout() {
            code = CODE_REQUEST_TIMEOUT;
            return this;
        }

        public Builder c408() {
            code = CODE_REQUEST_TIMEOUT;
            return this;
        }

        public Builder conflict() {
            code = CODE_CONFLICT;
            return this;
        }

        public Builder c409() {
            code = CODE_CONFLICT;
            return this;
        }

        public Builder gone() {
            code = CODE_GONE;
            return this;
        }

        public Builder c410() {
            code = CODE_GONE;
            return this;
        }

        public Builder preconditionFailed() {
            code = CODE_PRECONDITION_FAILED;
            return this;
        }

        public Builder c412() {
            code = CODE_PRECONDITION_FAILED;
            return this;
        }

        public Builder unsupportedMediaType() {
            code = CODE_UNSUPPORTED_MEDIA_TYPE;
            return this;
        }

        public Builder c415() {
            code = CODE_UNSUPPORTED_MEDIA_TYPE;
            return this;
        }

        public Builder unsupportedType() {
            code = CODE_UNSUPPORTED_TYPE;
            return this;
        }

        public Builder c416() {
            code = CODE_UNSUPPORTED_TYPE;
            return this;
        }

        public Builder tooManyRequests() {
            code = CODE_TOO_MANY_REQUESTS;
            return this;
        }

        public Builder c429() {
            code = CODE_TOO_MANY_REQUESTS;
            return this;
        }

        public Builder unavailableForLegalReasons() {
            code = CODE_UNAVAILABLE_FOR_LEGAL_REASONS;
            return this;
        }

        public Builder c451() {
            code = CODE_UNAVAILABLE_FOR_LEGAL_REASONS;
            return this;
        }

        public Builder internalServerError() {
            code = CODE_INTERNAL_SERVER_ERROR;
            return this;
        }

        public Builder c500() {
            code = CODE_INTERNAL_SERVER_ERROR;
            return this;
        }

        public Builder notImplemented() {
            code = CODE_NOT_IMPLEMENTED;
            return this;
        }

        public Builder c501() {
            code = CODE_NOT_IMPLEMENTED;
            return this;
        }

        public Builder badGateway() {
            code = CODE_BAD_GATEWAY;
            return this;
        }

        public Builder c502() {
            code = CODE_BAD_GATEWAY;
            return this;
        }

        public Builder serviceUnavailable() {
            code = CODE_SERVICE_UNAVAILABLE;
            return this;
        }

        public Builder c503() {
            code = CODE_SERVICE_UNAVAILABLE;
            return this;
        }

        public Builder gatewayTimeout() {
            code = CODE_GATEWAY_TIMEOUT;
            return this;
        }

        public Builder c504() {
            code = CODE_GATEWAY_TIMEOUT;
            return this;
        }

        public Builder networkAuthenticationRequired() {
            code = CODE_NETWORK_AUTHENTICATION_REQUIRED;
            return this;
        }

        public Builder c505() {
            code = CODE_NETWORK_AUTHENTICATION_REQUIRED;
            return this;
        }
    }
    //endregion

    //region code constructors

    public static DomainError c400(String user, String system, Object... args) {
        return badRequest(user, system, args);
    }

    public static DomainError u400(String user, Object... args) {
        return badRequest(user, null, args);
    }

    public static DomainError s400(String system, Object... args) {
        return badRequest(null, system, args);
    }

    public static DomainError c401(String user, String system, Object... args) {
        return unauthorized(user, system, args);
    }

    public static DomainError u401(String user, Object... args) {
        return unauthorized(user, null, args);
    }

    public static DomainError s401(String system, Object... args) {
        return unauthorized(null, system, args);
    }

    public static DomainError c402(String user, String system, Object... args) {
        return paymentRequired(user, system, args);
    }

    public static DomainError u402(String user, Object... args) {
        return paymentRequired(user, null, args);
    }

    public static DomainError s402(String system, Object... args) {
        return paymentRequired(null, system, args);
    }

    public static DomainError c403(String user, String system, Object... args) {
        return forbidden(user, system, args);
    }

    public static DomainError u403(String user, Object... args) {
        return forbidden(user, null, args);
    }

    public static DomainError s403(String system, Object... args) {
        return forbidden(null, system, args);
    }

    public static DomainError c404(String user, String system, Object... args) {
        return notFound(user, system, args);
    }

    public static DomainError u404(String user, Object... args) {
        return notFound(user, null, args);
    }

    public static DomainError s404(String system, Object... args) {
        return notFound(null, system, args);
    }

    public static DomainError c405(String user, String system, Object... args) {
        return methodNotAllowed(user, system, args);
    }

    public static DomainError u405(String user, Object... args) {
        return methodNotAllowed(user, null, args);
    }

    public static DomainError s405(String system, Object... args) {
        return methodNotAllowed(null, system, args);
    }

    public static DomainError c406(String user, String system, Object... args) {
        return notAcceptable(user, system, args);
    }

    public static DomainError u406(String user, Object... args) {
        return notAcceptable(user, null, args);
    }

    public static DomainError s406(String system, Object... args) {
        return notAcceptable(null, system, args);
    }

    public static DomainError c408(String user, String system, Object... args) {
        return requestTimeout(user, system, args);
    }

    public static DomainError u408(String user, Object... args) {
        return requestTimeout(user, null, args);
    }

    public static DomainError s408(String system, Object... args) {
        return requestTimeout(null, system, args);
    }

    public static DomainError c409(String user, String system, Object... args) {
        return conflict(user, system, args);
    }

    public static DomainError u409(String user, Object... args) {
        return conflict(user, null, args);
    }

    public static DomainError s409(String system, Object... args) {
        return conflict(null, system, args);
    }

    public static DomainError c410(String user, String system, Object... args) {
        return gone(user, system, args);
    }

    public static DomainError u410(String user, Object... args) {
        return gone(user, null, args);
    }

    public static DomainError s410(String system, Object... args) {
        return gone(null, system, args);
    }

    public static DomainError c412(String user, String system, Object... args) {
        return preconditionFailed(user, system, args);
    }

    public static DomainError u412(String user, Object... args) {
        return preconditionFailed(user, null, args);
    }

    public static DomainError s412(String system, Object... args) {
        return preconditionFailed(null, system, args);
    }

    public static DomainError c415(String user, String system, Object... args) {
        return unsupportedMediaType(user, system, args);
    }

    public static DomainError u415(String user, Object... args) {
        return unsupportedMediaType(user, null, args);
    }

    public static DomainError s415(String system, Object... args) {
        return unsupportedMediaType(null, system, args);
    }

    public static DomainError c416(String user, String system, Object... args) {
        return unsupportedType(user, system, args);
    }

    public static DomainError u416(String user, Object... args) {
        return unsupportedType(user, null, args);
    }

    public static DomainError s416(String system, Object... args) {
        return unsupportedType(null, system, args);
    }

    public static DomainError c429(String user, String system, Object... args) {
        return tooManyRequests(user, system, args);
    }

    public static DomainError u429(String user, Object... args) {
        return tooManyRequests(user, null, args);
    }

    public static DomainError s429(String system, Object... args) {
        return tooManyRequests(null, system, args);
    }

    public static DomainError c451(String user, String system, Object... args) {
        return unavailableForLegalReasons(user, system, args);
    }

    public static DomainError u451(String user, Object... args) {
        return unavailableForLegalReasons(user, null, args);
    }

    public static DomainError s451(String system, Object... args) {
        return unavailableForLegalReasons(null, system, args);
    }

    public static DomainError c500(String user, String system, Object... args) {
        return internalServerError(user, system, args);
    }

    public static DomainError u500(String user, Object... args) {
        return internalServerError(user, null, args);
    }

    public static DomainError s500(String system, Object... args) {
        return internalServerError(null, system, args);
    }

    public static DomainError c501(String user, String system, Object... args) {
        return notImplemented(user, system, args);
    }

    public static DomainError u501(String user, Object... args) {
        return notImplemented(user, null, args);
    }

    public static DomainError s501(String system, Object... args) {
        return notImplemented(null, system, args);
    }

    public static DomainError c502(String user, String system, Object... args) {
        return badGateway(user, system, args);
    }

    public static DomainError u502(String user, Object... args) {
        return badGateway(user, null, args);
    }

    public static DomainError s502(String system, Object... args) {
        return badGateway(null, system, args);
    }

    public static DomainError c503(String user, String system, Object... args) {
        return serviceUnavailable(user, system, args);
    }

    public static DomainError u503(String user, Object... args) {
        return serviceUnavailable(user, null, args);
    }

    public static DomainError s503(String system, Object... args) {
        return serviceUnavailable(null, system, args);
    }

    public static DomainError c504(String user, String system, Object... args) {
        return gatewayTimeout(user, system, args);
    }

    public static DomainError u504(String user, Object... args) {
        return gatewayTimeout(user, null, args);
    }

    public static DomainError s504(String system, Object... args) {
        return gatewayTimeout(null, system, args);
    }

    public static DomainError c505(String user, String system, Object... args) {
        return networkAuthenticationRequired(user, system, args);
    }

    public static DomainError u505(String user, Object... args) {
        return networkAuthenticationRequired(user, null, args);
    }

    public static DomainError s505(String system, Object... args) {
        return networkAuthenticationRequired(null, system, args);
    }
    //endregion

}


