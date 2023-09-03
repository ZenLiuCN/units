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

package cn.zenliu.units.conf;

import com.typesafe.config.*;
import com.typesafe.config.impl.ConfigImplUtil;
import lombok.SneakyThrows;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Optional;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Extended Config with extra methods and special grammar.<br/>
 * <pre>
 *     simple-values:
 *      1. primitive types with their boxed type.
 *      2. Period Duration as original Config supported.
 *      3. Date Timestamp Instant from integers or parsed from ISO formatter.
 *      4. BigDecimal, BigInteger from string.
 *      5. byte[] and ByteBuffer from Base64.UrlEncoder encoded string, or list of integers.
 *      6. UUID from string.
 *     object-values: supported by object-schema.
 *
 * <code>
 *        # object schema to instance an specified class
 *        object:{
 *          %class: className # the class name in string
 *          %null: true # define an null class value
 *          %value: any # the supported simple value class
 *          %ctor:[{}] # invoke constructor to instance the object, must a list of object-schema.Without this field, will try instance with noarg-constructor.
 *          setterProperty:any # invoke setter method which only accept a single value, the key must a trim 'set' prefix lower-camel-case style
 *          %methodName:any
 *          # invoke method which accept any parameters, empty object for no args required.
 *          # list of object-schema to define full signature of the method if there is other methods with same name.
 *          # list mixed with object-schema and simple value to locate method without duplicated name.each argument will convert to the type method required.
 *         }
 * </code>
 * </pre>
 *
 * @author Zen.Liu
 * @since 2023-07-25
 */
@SuppressWarnings("unused")
public interface Conf extends Config {

    @FunctionalInterface
    interface Injector {
        Object apply(ConfigValue value, String name, Type type);
    }

    interface Value extends ConfigValue {

        static Value of(ConfigValue value) {
            return new Core(value);
        }

        class Core implements Value {

            @Override
            public ConfigOrigin origin() {
                return value.origin();
            }

            @Override
            public ConfigValueType valueType() {
                return value.valueType();
            }

            @Override
            public Object unwrapped() {
                return value.unwrapped();
            }

            @Override
            public String render() {
                return value.render();
            }

            @Override
            public String render(ConfigRenderOptions options) {
                return value.render(options);
            }

            @Override
            public ConfigValue withFallback(ConfigMergeable other) {
                return value.withFallback(other);
            }

            @Override
            public Config atPath(String path) {
                return value.atPath(path);
            }

            @Override
            public Config atKey(String key) {
                return value.atKey(key);
            }

            @Override
            public ConfigValue withOrigin(ConfigOrigin origin) {
                return value.withOrigin(origin);
            }

            public final ConfigValue value;

            Core(ConfigValue value) {
                this.value = value;
            }

            @Override
            public String toString() {
                return value.toString();
            }

            @Override
            public ConfigValue value() {
                return value;
            }
        }

        ConfigValue value();

        default Optional<ConfigObject> asObject() {
            return valueType() == ConfigValueType.OBJECT ? Optional.of((ConfigObject) this.value()) : Optional.empty();
        }

        default Optional<ConfigList> asList() {
            return valueType() == ConfigValueType.LIST ? Optional.of((ConfigList) this.value()) : Optional.empty();
        }

        default Optional<Number> asNumber() {
            return valueType() == ConfigValueType.NUMBER ? Optional.of((Number) this.unwrapped()) : Optional.empty();
        }

        default Optional<String> asString() {
            return valueType() == ConfigValueType.STRING ? Optional.of((String) this.unwrapped()) : Optional.empty();
        }

        default Optional<Boolean> asBoolean() {
            return valueType() == ConfigValueType.BOOLEAN ? Optional.of((Boolean) this.unwrapped()) : Optional.empty();
        }

        default boolean isNull() {
            return valueType() == ConfigValueType.NULL;
        }

        List<String> BEAN_KEYS = Arrays.asList("%class", "%null", "%value", "%ctor");

        static Duration duration(String input, ConfigOrigin origin, String name) {
            var s = ConfigImplUtil.unicodeTrim(input);
            var ou = units(s);
            var u = ou;
            var num = ConfigImplUtil.unicodeTrim(s.substring(0, s.length() - u.length()));
            TimeUnit units;
            if (num.length() == 0) throw new ConfigException.BadValue(origin, name, "invalid duration value");
            if (u.length() > 2 && !u.endsWith("s")) u = u + "s";
            units = switch (u) {
                case "", "ms", "millis", "milliseconds" -> TimeUnit.MILLISECONDS;
                case "us", "micros", "microseconds" -> TimeUnit.MICROSECONDS;
                case "ns", "nanos", "nanoseconds" -> TimeUnit.NANOSECONDS;
                case "d", "days" -> TimeUnit.DAYS;
                case "h", "hours" -> TimeUnit.HOURS;
                case "s", "seconds" -> TimeUnit.SECONDS;
                case "m", "minutes" -> TimeUnit.MINUTES;
                default -> throw new ConfigException.BadValue(origin,
                        name, "invalid duration unit '"
                              + ou
                              + "' (only ns, us, ms, s, m, h, d)");
            };
            try {
                if (num.matches("[+-]?[0-9]+")) {
                    return Duration.ofNanos(units.toNanos(Long.parseLong(num)));
                } else {
                    return Duration.ofNanos((long) (Double.parseDouble(num) * units.toNanos(1)));
                }
            } catch (NumberFormatException e) {
                throw new ConfigException.BadValue(origin,
                        name, "invalid duration number '"
                              + num + "'");
            }
        }

        static Period period(String input, ConfigOrigin origin, String name) {
            var s = ConfigImplUtil.unicodeTrim(input);
            var ou = units(s);
            var u = ou;
            var num = ConfigImplUtil.unicodeTrim(s.substring(0, s.length() - u.length()));
            ChronoUnit units;
            if (num.length() == 0) throw new ConfigException.BadValue(origin, name, "invalid duration value");
            if (u.length() > 2 && !u.endsWith("s")) u = u + "s";
            units = switch (u) {
                case "", "d", "days" -> ChronoUnit.DAYS;
                case "w", "weeks" -> ChronoUnit.WEEKS;
                case "m", "mo", "month" -> ChronoUnit.MONTHS;
                case "y", "years" -> ChronoUnit.YEARS;

                default -> throw new ConfigException.BadValue(origin,
                        name, "invalid time unit '"
                              + ou
                              + "' (only d, w, mo, y)");
            };
            try {
                return switch (units) {
                    case DAYS -> Period.ofDays(Integer.parseInt(num));
                    case WEEKS -> Period.ofWeeks(Integer.parseInt(num));
                    case MONTHS -> Period.ofMonths(Integer.parseInt(num));
                    case YEARS -> Period.ofYears(Integer.parseInt(num));
                    default -> throw new ConfigException.BadValue(origin,
                            name, "invalid period unit '"
                                  + ou
                                  + "' (only d, w, mo, y)");
                };
            } catch (NumberFormatException e) {
                throw new ConfigException.BadValue(origin,
                        name, "invalid period number '"
                              + num + "'");
            }
        }

        static String units(String s) {
            var i = s.length() - 1;
            while (i >= 0) {
                var c = s.charAt(i);
                if (!Character.isLetter(c)) break;
                i -= 1;
            }
            return s.substring(i + 1);
        }

        @SneakyThrows
        static Object type(ConfigValue value, String name, Type type, @Nullable Injector injector) {
            return switch (value.valueType()) {
                case OBJECT -> {
                    var val = (ConfigObject) value;
                    if (type == Object.class) yield value.unwrapped();
                    if (type instanceof Class<?> cls) {
                        var vv = val.containsKey("%class") ? val : val.withValue("%class", ConfigValueFactory.fromAnyRef(cls.getName()));
                        var n = object(vv, name, injector);
                        yield n == null ? null : n.getValue();
                    } else if (type instanceof ParameterizedType pType) {
                        var raw = pType.getRawType();
                        //map
                        if (raw instanceof Class<?> cls && Map.class.isAssignableFrom(cls)) {
                            var tArgs = pType.getActualTypeArguments();
                            if (tArgs.length != 2)
                                throw new IllegalStateException("type argument not match type of map");
                            var tKey = tArgs[0];
                            if (!(tKey instanceof Class<?> kCls) || !(kCls == String.class))
                                throw new IllegalStateException("only support string key type of map");
                            var tValue = tArgs[1];
                            var m = new ConcurrentHashMap<String, Object>();
                            val.forEach((k, v) -> m.put(k, type(v, name + "." + k, tValue, injector)));
                            yield m;
                        }
                        yield type(val, name, raw, injector);//TODO
                    }
                    throw new IllegalStateException(String.format("found unsupported config %s for %s %s", value, name, type));
                }
                case LIST -> {
                    var val = (ConfigList) value;
                    if (type == Object.class) yield value.unwrapped();
                    if (type instanceof Class<?> cls) {
                        if (cls.isArray()) {
                            var raw = cls.getComponentType();
                            if (raw.isPrimitive()) {
                                if (Boolean.TYPE.isAssignableFrom(raw)) {
                                    var arr = new boolean[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.BOOLEAN)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires boolean value");
                                        var v = (Boolean) val.get(i).unwrapped();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Byte.TYPE.isAssignableFrom(raw)) {
                                    var arr = new byte[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = (byte) ((Number) val.get(i).unwrapped()).intValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Short.TYPE.isAssignableFrom(raw)) {
                                    var arr = new short[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = (short) ((Number) val.get(i).unwrapped()).intValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Character.TYPE.isAssignableFrom(raw)) {
                                    var arr = new char[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = (char) ((Number) val.get(i).unwrapped()).intValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Integer.TYPE.isAssignableFrom(raw)) {
                                    var arr = new int[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = ((Number) val.get(i).unwrapped()).intValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Long.TYPE.isAssignableFrom(raw)) {
                                    var arr = new long[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = ((Number) val.get(i).unwrapped()).longValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Float.TYPE.isAssignableFrom(raw)) {
                                    var arr = new float[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = ((Number) val.get(i).unwrapped()).floatValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }
                                if (Double.TYPE.isAssignableFrom(raw)) {
                                    var arr = new double[val.size()];
                                    for (int i = 0; i < val.size(); i++) {
                                        if (val.get(i).valueType() != ConfigValueType.NUMBER)
                                            throw new ConfigException.BadValue(val.origin(), name, "requires number value");
                                        var v = ((Number) val.get(i).unwrapped()).doubleValue();
                                        arr[i] = v;
                                    }
                                    yield arr;
                                }

                                throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                            }
                            var arr = Array.newInstance(raw, val.size());
                            for (int i = 0; i < val.size(); i++) {
                                Array.set(arr, i, type(val.get(i), name, raw, injector));
                            }
                            yield arr;
                        }
                        if (List.class.isAssignableFrom(cls)) {
                            var arr = new CopyOnWriteArrayList<>();
                            for (var v : val) {
                                arr.add(type(v, name, Object.class, injector));
                            }
                            yield arr;
                        }
                        if (Set.class.isAssignableFrom(cls)) {
                            var arr = new CopyOnWriteArraySet<>();
                            for (var v : val) {
                                arr.add(type(v, name, Object.class, injector));
                            }
                            yield arr;
                        }
                        throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));
                    } else if (type instanceof ParameterizedType pType) {
                        var raw = pType.getRawType();
                        if (raw instanceof Class<?> cls) {
                            if (List.class.isAssignableFrom(cls)) {
                                var arr = new CopyOnWriteArrayList<>();
                                var typ = pType.getActualTypeArguments()[0];
                                for (var v : val) {
                                    arr.add(type(v, name, typ, injector));
                                }
                                yield arr;
                            } else if (Set.class.isAssignableFrom(cls)) {
                                var arr = new CopyOnWriteArraySet<>();
                                var typ = pType.getActualTypeArguments()[0];
                                for (var v : val) {
                                    arr.add(type(v, name, typ, injector));
                                }
                                yield arr;
                            }
                        }
                        throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));
                    }
                    throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));
                }
                case NUMBER -> {
                    if (type instanceof Class<?> cls) {
                        var val = (Number) value.unwrapped();
                        if (cls == Byte.class || cls == Byte.TYPE) yield (byte) val.intValue();
                        if (cls == Short.class || cls == Short.TYPE) yield (short) val.intValue();
                        if (cls == Character.class || cls == Character.TYPE) yield (char) val.intValue();
                        if (cls == Integer.class || cls == Integer.TYPE) yield val.intValue();
                        if (cls == Long.class || cls == Long.TYPE) yield val.longValue();
                        if (cls == Float.class || cls == Float.TYPE) yield val.floatValue();
                        if (cls == Double.class || cls == Double.TYPE) yield val.doubleValue();

                        if (cls == Instant.class) yield Instant.ofEpochMilli(val.longValue());
                        if (cls == Duration.class) yield Duration.ofMillis(val.longValue());
                        if (cls == Period.class) yield Period.ofDays(val.intValue());
                        if (cls == Date.class) yield Date.from(Instant.ofEpochMilli(val.longValue()));
                        if (cls == Timestamp.class) yield Timestamp.from(Instant.ofEpochMilli(val.longValue()));

                        if (cls == BigDecimal.class)
                            yield val instanceof BigDecimal ? val : BigDecimal.valueOf(val.doubleValue());
                        if (cls == BigInteger.class)
                            yield val instanceof BigInteger ? val : BigInteger.valueOf(val.longValue());

                        if (type == Object.class || type == Number.class) yield value.unwrapped();
                        throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                    }
                    throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                }
                case BOOLEAN -> {
                    if (type instanceof Class<?> cls && (cls == Boolean.class || cls == Boolean.TYPE || cls == Object.class))
                        yield (Boolean) value.unwrapped();
                    throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                }
                case NULL -> {
                    throw new IllegalStateException("found null  for %s %s".formatted(name, type));

                }
                case STRING -> {
                    if (type instanceof Class<?> cls) {
                        var val = (String) value.unwrapped();

                        if (Instant.class.isAssignableFrom(cls)) yield Instant.parse(val);
                        if (Date.class.isAssignableFrom(cls)) yield DateTimeFormatter.ISO_DATE_TIME.parse(val);
                        if (Timestamp.class.isAssignableFrom(cls)) yield Timestamp.valueOf(val);

                        if (Duration.class.isAssignableFrom(cls)) yield duration(val, value.origin(), name);
                        if (Period.class.isAssignableFrom(cls)) yield period(val, value.origin(), name);

                        if (BigDecimal.class.isAssignableFrom(cls)) yield new BigDecimal(val);
                        if (BigInteger.class.isAssignableFrom(cls)) yield new BigInteger(val);

                        if (String.class.isAssignableFrom(cls) || CharSequence.class.isAssignableFrom(cls) || cls == Object.class)
                            yield val;

                        if (UUID.class.isAssignableFrom(cls)) yield UUID.fromString(val);

                        if (Class.class.isAssignableFrom(cls)) yield Class.forName(val);

                        if (byte[].class.isAssignableFrom(cls)) yield Base64.getUrlDecoder().decode(val);

                        if (ByteBuffer.class.isAssignableFrom(cls))
                            yield ByteBuffer.wrap(Base64.getUrlDecoder().decode(val));

                        throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                    }
                    throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                }
                //noinspection UnnecessaryDefault
                default -> {
                    throw new IllegalStateException("found unsupported config %s for %s %s".formatted(value, name, type));

                }
            };
        }


        static Optional<Constructor<?>> creator(Class<?> cls, Class<?>... args) {
            try {
                var ctor = cls.getConstructor(args);
                return Optional.of(ctor);
            } catch (NoSuchMethodException e) {
                return Optional.empty();
            }
        }

        static Stream<Method> funcs(Class<?> cls) {
            return Stream.of(cls.getMethods());
        }

        /**
         * @param value    config object value
         * @param name     identify name
         * @param injector support for extra schemas
         * @return null maybe
         */
        @SneakyThrows
        static Map.Entry<Class<?>, Object> object(ConfigObject value, String name, @Nullable Injector injector) {
            if (value.containsKey("%class")) {
                var cls = Class.forName(value.toConfig().getString("%class"));
                if (value.containsKey("%value")) {
                    return new AbstractMap.SimpleEntry<>(cls,
                            injector != null ? injector.apply(value.get("%value"), name, cls) : type(value.get("%value"), name + ".%value", cls, null));
                }
                if (value.containsKey("%null") && value.toConfig().getBoolean("%null")) {
                    return new AbstractMap.SimpleEntry<>(cls, null);
                }
                final Object instance;
                if (value.containsKey("%ctor")) {
                    var cv = value.toConfig().getConfigList("%ctor");
                    var argTypes = new Class[cv.size()];
                    var args = new Object[cv.size()];
                    for (int i = 0; i < cv.size(); i++) {
                        var cx = cv.get(i);
                        var b = Objects.requireNonNull(object(cx.root(), name + ".%ctor.index_" + i, injector), "missing argument");
                        argTypes[i] = b.getKey();
                        args[i] = b.getValue();
                    }
                    var ctor = creator(cls, argTypes)
                            .orElseThrow(() -> new ConfigException.BadValue(value.origin(), name + ".%ctor", "not found suitable constructor"));
                    instance = ctor.newInstance(args);
                } else {
                    var ctor = creator(cls).orElseThrow(() -> new ConfigException.BadValue(value.origin(), name, "not found none arguments constructor"));
                    instance = ctor.newInstance();
                }

                return new AbstractMap.SimpleEntry<>(cls, invokes(value, instance, cls, injector));
            } else if (value.containsKey("%null") && value.toConfig().getBoolean("%null")) {
                return new AbstractMap.SimpleEntry<>(null, null);
            } else return null;
        }

        /**
         * @param value    the config object value
         * @param instance the object instance
         * @param type     the object class
         * @param injector inject provider, use the injector value if present
         * @return null maybe
         */
        @SneakyThrows
        static Object invokes(ConfigObject value, Object instance, Class<?> type, @Nullable Injector injector) {
            var funcs = funcs(type).filter(fn -> !Modifier.isStatic(fn.getModifiers()) && Modifier.isPublic(fn.getModifiers())).toList();
            var funcMap = funcs.stream().collect(Collectors.toMap(Method::getName, List::of, (l0, l1) -> {
                var arr = new ArrayList<Method>();
                arr.addAll(l0);
                arr.addAll(l1);
                return arr;
            }));
            var atomicInstance = new AtomicReference<>(instance);
            //setters
            for (Method func : funcs) {
                if (func.getParameterCount() != 1) continue;
                var prop = func.getName();
                if (prop.startsWith("set")) prop = prop.substring(3);
                prop = prop.substring(0, 1).toLowerCase() + prop.substring(1);
                if (value.containsKey(prop)) {
                    if (func.getReturnType() == type) {
                        atomicInstance.set(func.invoke(atomicInstance.get(), type(value.get(prop), prop, func.getGenericParameterTypes()[0], injector)));
                    } else {
                        func.invoke(atomicInstance.get(), type(value.get(prop), prop, func.getGenericParameterTypes()[0], injector));
                    }
                }
            }
            //invokes
            for (var key : value.keySet()) {
                if (key.startsWith("%") && !BEAN_KEYS.contains(key)) {
                    var name = key.substring(1);
                    if (!funcMap.containsKey(name))
                        throw new IllegalStateException("missing method with " + name + " in " + type);
                    var fun = funcMap.get(name);
                    var val = value.get(key);
                    switch (val.valueType()) {
                        case OBJECT -> {
                            var vo = (ConfigObject) val;
                            if (vo.isEmpty()) {
                                var fn = fun.stream().filter(x -> x.getParameterCount() == 0).findFirst().orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));
                                if (fn.getReturnType() == type) {
                                    atomicInstance.set(fn.invoke(atomicInstance.get()));
                                } else
                                    fn.invoke(atomicInstance.get());
                                continue;
                            }
                            if (vo.containsKey("%class")) {
                                var cls = Class.forName(vo.toConfig().getString("%class"));
                                var fn = fun.stream().filter(x -> x.getParameterCount() == 1 && x.getParameterTypes()[0] == cls)
                                        .findFirst()
                                        .orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));
                                if (fn.getReturnType() == type) {
                                    atomicInstance.set(fn.invoke(atomicInstance.get(), type(vo, "param", cls, injector)));
                                } else
                                    fn.invoke(atomicInstance.get(), type(vo, "param", cls, injector));
                            }

                        }
                        case LIST -> {
                            var vo = (ConfigList) val;
                            var types = new Class<?>[vo.size()];
                            var values = new Object[vo.size()];
                            for (int i = 0; i < vo.size(); i++) {
                                var v = vo.get(i);
                                if (v.valueType() != ConfigValueType.OBJECT)
                                    throw new IllegalStateException("invoke parameters must config objects");
                                var b = Objects.requireNonNull(object((ConfigObject) v, "param" + i, injector), "can't fetch parameter info ");
                                types[i] = b.getKey();
                                values[i] = b.getValue();
                            }
                            var typeList = Arrays.asList(types);
                            var fn = fun.stream().filter(x -> x.getParameterCount() == vo.size() && List.of(x.getParameterTypes()).equals(typeList))
                                    .findFirst()
                                    .orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));

                            if (fn.getReturnType() == type) {
                                atomicInstance.set(fn.invoke(atomicInstance.get(), values));
                            } else
                                fn.invoke(atomicInstance.get(), values);
                        }
                        case NUMBER -> {
                            var fn = fun.stream().filter(x -> x.getParameterCount() == 1 && Number.class.isAssignableFrom(x.getParameterTypes()[0]))
                                    .findFirst()
                                    .orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));
                            var cls = fn.getParameterTypes()[0];
                            if (fn.getReturnType() == type) {
                                atomicInstance.set(fn.invoke(atomicInstance.get(), type(value, "param", cls, injector)));
                            } else
                                fn.invoke(atomicInstance.get(), type(value, "param", cls, injector));
                        }
                        case BOOLEAN -> {
                            var fn = fun.stream().filter(x -> x.getParameterCount() == 1 && (x.getParameterTypes()[0] == Boolean.class || x.getParameterTypes()[0] == Boolean.TYPE))
                                    .findFirst()
                                    .orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));
                            if (fn.getReturnType() == type) {
                                atomicInstance.set(fn.invoke(atomicInstance.get(), val.unwrapped()));
                            } else
                                fn.invoke(atomicInstance.get(), val.unwrapped());
                        }
                        case NULL -> {
                            var fn = fun.stream().filter(x -> x.getParameterCount() == 1)
                                    .findFirst()
                                    .orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));
                            if (fn.getReturnType() == type) {
                                atomicInstance.set(fn.invoke(atomicInstance.get(), (Object) null));
                            } else
                                fn.invoke(atomicInstance.get(), (Object) null);
                        }
                        case STRING -> {
                            var fn = fun.stream().filter(x -> x.getParameterCount() == 1 && x.getParameterTypes()[0] == String.class)
                                    .findFirst()
                                    .orElseThrow(() -> new NoSuchElementException("missing method with " + name + " in " + type));
                            if (fn.getReturnType() == type) {
                                atomicInstance.set(fn.invoke(atomicInstance.get(), val.unwrapped()));
                            } else
                                fn.invoke(atomicInstance.get(), val.unwrapped());
                        }
                    }

                }
            }
            return atomicInstance.get();
        }
    }

    static Conf of(Config config) {
        return new Core(config);
    }

    static Conf of(ConfigObject config) {
        return new Core(config.toConfig());
    }

    Config config();

    /**
     * @param path   the path to find
     * @param mapper value converter
     * @param <T>    type
     * @return empty when path not exists or type not match
     */
    default <T> Optional<T> value(String path, BiFunction<Config, String, T> mapper) {
        try {
            if (hasPath(path)) return Optional.ofNullable(mapper.apply(this, path));
            return Optional.empty();
        } catch (ConfigException.Missing | ConfigException.WrongType e) {
            return Optional.empty();
        }
    }

    default <T> Optional<List<T>> valueList(String path, BiFunction<Config, String, List<T>> mapper) {
        try {
            if (hasPath(path)) return Optional.ofNullable(mapper.apply(this, path));
            return Optional.empty();
        } catch (ConfigException.Missing | ConfigException.WrongType e) {
            return Optional.empty();
        }
    }

    default Optional<Conf> config(String path) {
        return value(path, Config::getConfig).map(Conf::of);
    }

    default Optional<List<Conf>> configList(String path) {
        return valueList(path, Config::getConfigList).map(l -> l.stream().map(Conf::of).toList());
    }

    default Optional<Map<String, Value>> objectValues(String path) {
        return value(path, Config::getConfig)
                .map(l -> l.entrySet()
                        .stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, e -> Value.of(e.getValue()))));
    }

    default Map<String, Value> objectValues() {
        return root()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> Value.of(e.getValue())));
    }

    default Optional<List<Value>> listValues(String path) {
        return value(path, Config::getList)
                .map(l -> l
                        .stream()
                        .map(Value::of)
                        .toList());
    }

    default boolean each(BiPredicate<String, Value> proc) {
        for (var entry : root().entrySet()) {
            if (!proc.test(entry.getKey(), Value.of(entry.getValue()))) return false;
        }
        return true;
    }

    default boolean each(String path, BiPredicate<String, Value> proc) {
        var v = objectValues(path);
        if (v.isEmpty()) return false;
        for (var entry : v.get().entrySet()) {
            if (!proc.test(entry.getKey(), Value.of(entry.getValue()))) return false;
        }
        return true;
    }

    default boolean each(String path, Predicate<Value> proc) {
        var v = listValues(path);
        if (v.isEmpty()) return false;
        for (var entry : v.get()) {
            if (!proc.test(entry)) return false;
        }
        return true;
    }

    default <T> Optional<List<T>> map(String path, IntFunction<List<T>> container, Function<Value, T> proc) {
        var v = listValues(path);
        if (v.isEmpty()) return Optional.empty();
        var c = container.apply(v.get().size());
        for (var entry : v.get()) {
            c.add(proc.apply(Value.of(entry)));
        }
        return Optional.of(c);
    }

    default <T> Optional<Map<String, T>> map(String path, IntFunction<Map<String, T>> container, BiFunction<String, Value, T> proc) {
        var v = objectValues(path);
        if (v.isEmpty()) return Optional.empty();
        var c = container.apply(v.get().size());
        for (var entry : v.get().entrySet()) {
            c.put(entry.getKey(), proc.apply(entry.getKey(), Value.of(entry.getValue())));
        }
        return Optional.of(c);
    }

    default <T> Map<String, T> map(IntFunction<Map<String, T>> container, BiFunction<String, Value, T> proc) {
        var root = root();
        var c = container.apply(root.size());
        for (var entry : root.entrySet()) {
            c.put(entry.getKey(), proc.apply(entry.getKey(), Value.of(entry.getValue())));
        }
        return c;
    }

    default <E extends Enum<E>> Optional<E> enumerate(String path, Class<E> type) {
        return value(path, (c, s) -> c.getEnum(type, s));
    }

    default <E extends Enum<E>> Optional<List<E>> enumerates(String path, Class<E> type) {
        return value(path, (c, s) -> c.getEnumList(type, s));
    }

    default Optional<Boolean> bool(String path) {
        return value(path, Config::getBoolean);
    }

    default Optional<Long> bytes(String path) {
        return value(path, Config::getBytes);
    }

    default long bytes(String path, long def) {
        return value(path, Config::getBytes).orElse(def);
    }

    default Optional<List<Long>> bytesList(String path) {
        return valueList(path, Config::getBytesList);
    }

    default Optional<ConfigMemorySize> memorySize(String path) {
        return value(path, Config::getMemorySize);
    }

    default ConfigMemorySize memorySize(String path, ConfigMemorySize def) {
        return value(path, Config::getMemorySize).orElse(def);
    }

    default Optional<List<ConfigMemorySize>> memorySizeList(String path) {
        return valueList(path, Config::getMemorySizeList);
    }

    default boolean bool(String path, boolean def) {
        return value(path, Config::getBoolean).orElse(def);
    }

    default Optional<List<Boolean>> boolList(String path) {
        return valueList(path, Config::getBooleanList);
    }

    default Optional<Integer> int32(String path) {
        return value(path, Config::getInt);
    }

    default int int32(String path, int def) {
        return value(path, Config::getInt).orElse(def);
    }

    default Optional<List<Integer>> int32List(String path) {
        return valueList(path, Config::getIntList);
    }

    default Optional<Long> int64(String path) {
        return value(path, Config::getLong);
    }

    default long int64(String path, long def) {
        return value(path, Config::getLong).orElse(def);
    }

    default Optional<List<Long>> int64List(String path) {
        return valueList(path, Config::getLongList);
    }

    default Optional<Float> float32(String path) {
        return value(path, Config::getDouble).map(x -> (float) (double) x);
    }

    default float float32(String path, float def) {
        return value(path, Config::getDouble).map(x -> (float) (double) x).orElse(def);
    }

    default Optional<List<Float>> float32List(String path) {
        return valueList(path, Config::getDoubleList).map(ls -> ls.stream().map(x -> (float) (double) x).toList());
    }

    default Optional<Double> float64(String path) {
        return value(path, Config::getDouble);
    }

    default double float64(String path, double def) {
        return value(path, Config::getDouble).orElse(def);
    }

    default Optional<List<Double>> float64List(String path) {
        return valueList(path, Config::getDoubleList);
    }

    default Optional<String> string(String path) {
        return value(path, Config::getString);
    }

    default String string(String path, String def) {
        return value(path, Config::getString).orElse(def);
    }

    default Optional<List<String>> stringList(String path) {
        return valueList(path, Config::getStringList);
    }

    default Optional<Duration> duration(String path) {
        return value(path, Config::getDuration);
    }

    default Duration duration(String path, Duration def) {
        return value(path, Config::getDuration).orElse(def);
    }

    default Optional<List<Duration>> durationList(String path) {
        return valueList(path, Config::getDurationList);
    }

    default Optional<Period> period(String path) {
        return value(path, Config::getPeriod);
    }

    default Period period(String path, Period def) {
        return value(path, Config::getPeriod).orElse(def);
    }

    default Optional<BigDecimal> decimal(String path) {
        return value(path, Config::getString).map(BigDecimal::new);
    }

    default Optional<List<BigDecimal>> decimalList(String path) {
        return valueList(path, Config::getStringList)
                .map(ls -> ls.stream().map(BigDecimal::new).toList());
    }


    default Optional<Properties> properties(String path) {
        if (!hasPath(path)) {
            return Optional.empty();
        }
        var f = getValue(path);
        if (f.valueType() != ConfigValueType.OBJECT) {
            return Optional.empty();
        }
        var prop = new Properties();
        Core.toProperties(prop, new StringBuilder(path), f);
        return Optional.of(prop);

    }

    /**
     * create bean by ConfigBeanFactory
     *
     * @param type the type of object
     * @see ConfigBeanFactory
     */
    default <T> T bean(Class<T> type) {
        return ConfigBeanFactory.create(this, type);
    }

    /**
     * create bean by ConfigBeanFactory
     *
     * @param path the path point to a ConfigObject
     * @param type the type of object
     * @see ConfigBeanFactory
     */
    default <T> Optional<T> bean(String path, Class<T> type) {
        return config(path).map(b -> ConfigBeanFactory.create(b.config(), type));
    }

    /**
     * create Object by Configure schema
     */
    @SuppressWarnings("unchecked")
    default <T> T object() {
        return (T) Value.object(root(), "root", null);
    }

    /**
     * create Object by Configure schema
     */
    @SuppressWarnings("unchecked")
    default <T> T object(Class<T> type) {
        return (T) Value.type(root(), "root", type, null);
    }

    /**
     * create Object by Configure schema
     */
    @SuppressWarnings("unchecked")
    default <T> Optional<T> object(String path) {
        return config(path).map(o -> (T) Value.object(o.root(), path, null));
    }

    /**
     * create Object by Configure schema
     *
     * @param path the path point to a ConfigObject
     * @param type the type of object
     */
    @SuppressWarnings("unchecked")
    default <T> Optional<T> object(String path, Class<T> type) {
        return config(path).map(c -> (T) Value.type(c.root(), path, type, null));
    }

    /**
     * create Objects by Configure schema
     *
     * @param path the path point to a ConfigList
     * @param type the type of object
     */
    @SuppressWarnings("unchecked")
    default <T> Optional<List<T>> objects(String path, Class<T> type) {
        return valueList(path, Config::getList).map(c -> c.stream().map(v -> (T) Value.type(v, path, type, null)).toList());
    }

    /**
     * config object by configure
     *
     * @param instance instance
     * @param type     the type of object
     */
    @SuppressWarnings("unchecked")
    default <T> T objectConfig(T instance, Class<T> type) {
        return (T) Value.invokes(root(), instance, type, null);
    }

    /**
     * config object by configure
     *
     * @param instance instance
     * @param type     the type of object
     */
    @SuppressWarnings("unchecked")
    default <T> T objectConfig(String path, T instance, Class<T> type) {
        return config(path).map(o -> (T) Value.invokes(o.root(), instance, type, null)).orElse(instance);
    }

    class Core implements Conf {
        protected static void toProperties(Properties prop, StringBuilder prefix, ConfigValue value) {
            if (value == null) return;
            if (prefix == null) prefix = new StringBuilder();
            switch (value.valueType()) {
                case OBJECT -> {
                    var co = ((ConfigObject) value);
                    for (var entry : co.entrySet()) {
                        prefix.append('.').append(entry.getKey());
                        toProperties(prop, prefix, entry.getValue());
                        var idx = prefix.lastIndexOf(".");
                        prefix.setLength(idx);
                    }
                }
                case LIST -> {
                    var cl = (ConfigList) value;
                    for (int i = 0; i < cl.size(); i++) {
                        prefix.append('.').append('[').append(i).append(']');
                        toProperties(prop, prefix, cl.get(i));
                        var idx = prefix.lastIndexOf(".");
                        prefix.setLength(idx);
                    }
                }
                case NUMBER -> prop.put(prefix.toString(), (value.unwrapped()).toString());
                case BOOLEAN -> prop.put(prefix.toString(), Boolean.toString((Boolean) value.unwrapped()));
                case STRING -> {
                    var v = value.unwrapped();
                    if (v == null) return;
                    prop.put(prefix.toString(), v.toString());
                }
                case NULL -> {

                }
            }
        }

        @Override
        public ConfigObject root() {
            return value.root();
        }

        @Override
        public ConfigOrigin origin() {
            return value.origin();
        }

        @Override
        public Config withFallback(ConfigMergeable other) {
            return value.withFallback(other);
        }

        @Override
        public Config resolve() {
            return value.resolve();
        }

        @Override
        public Config resolve(ConfigResolveOptions options) {
            return value.resolve(options);
        }

        @Override
        public boolean isResolved() {
            return value.isResolved();
        }

        @Override
        public Config resolveWith(Config source) {
            return value.resolveWith(source);
        }

        @Override
        public Config resolveWith(Config source, ConfigResolveOptions options) {
            return value.resolveWith(source, options);
        }

        @Override
        public void checkValid(Config reference, String... restrictToPaths) {
            value.checkValid(reference, restrictToPaths);
        }

        @Override
        public boolean hasPath(String path) {
            return value.hasPath(path);
        }

        @Override
        public boolean hasPathOrNull(String path) {
            return value.hasPathOrNull(path);
        }

        @Override
        public boolean isEmpty() {
            return value.isEmpty();
        }

        @Override
        public Set<Map.Entry<String, ConfigValue>> entrySet() {
            return value.entrySet();
        }

        @Override
        public boolean getIsNull(String path) {
            return value.getIsNull(path);
        }

        @Override
        public boolean getBoolean(String path) {
            return value.getBoolean(path);
        }

        @Override
        public Number getNumber(String path) {
            return value.getNumber(path);
        }

        @Override
        public int getInt(String path) {
            return value.getInt(path);
        }

        @Override
        public long getLong(String path) {
            return value.getLong(path);
        }

        @Override
        public double getDouble(String path) {
            return value.getDouble(path);
        }

        @Override
        public String getString(String path) {
            return value.getString(path);
        }

        @Override
        public <T extends Enum<T>> T getEnum(Class<T> enumClass, String path) {
            return value.getEnum(enumClass, path);
        }

        @Override
        public ConfigObject getObject(String path) {
            return value.getObject(path);
        }

        @Override
        public Config getConfig(String path) {
            return value.getConfig(path);
        }

        @Override
        public Object getAnyRef(String path) {
            return value.getAnyRef(path);
        }

        @Override
        public ConfigValue getValue(String path) {
            return value.getValue(path);
        }

        @Override
        public Long getBytes(String path) {
            return value.getBytes(path);
        }

        @Override
        public ConfigMemorySize getMemorySize(String path) {
            return value.getMemorySize(path);
        }

        @Override
        @Deprecated
        public Long getMilliseconds(String path) {
            return value.getMilliseconds(path);
        }

        @Override
        @Deprecated
        public Long getNanoseconds(String path) {
            return value.getNanoseconds(path);
        }

        @Override
        public long getDuration(String path, TimeUnit unit) {
            return value.getDuration(path, unit);
        }

        @Override
        public Duration getDuration(String path) {
            return value.getDuration(path);
        }

        @Override
        public Period getPeriod(String path) {
            return value.getPeriod(path);
        }

        @Override
        public TemporalAmount getTemporal(String path) {
            return value.getTemporal(path);
        }

        @Override
        public ConfigList getList(String path) {
            return value.getList(path);
        }

        @Override
        public List<Boolean> getBooleanList(String path) {
            return value.getBooleanList(path);
        }

        @Override
        public List<Number> getNumberList(String path) {
            return value.getNumberList(path);
        }

        @Override
        public List<Integer> getIntList(String path) {
            return value.getIntList(path);
        }

        @Override
        public List<Long> getLongList(String path) {
            return value.getLongList(path);
        }

        @Override
        public List<Double> getDoubleList(String path) {
            return value.getDoubleList(path);
        }

        @Override
        public List<String> getStringList(String path) {
            return value.getStringList(path);
        }

        @Override
        public <T extends Enum<T>> List<T> getEnumList(Class<T> enumClass, String path) {
            return value.getEnumList(enumClass, path);
        }

        @Override
        public List<? extends ConfigObject> getObjectList(String path) {
            return value.getObjectList(path);
        }

        @Override
        public List<? extends Config> getConfigList(String path) {
            return value.getConfigList(path);
        }

        @Override
        public List<?> getAnyRefList(String path) {
            return value.getAnyRefList(path);
        }

        @Override
        public List<Long> getBytesList(String path) {
            return value.getBytesList(path);
        }

        @Override
        public List<ConfigMemorySize> getMemorySizeList(String path) {
            return value.getMemorySizeList(path);
        }

        @Override
        @Deprecated
        public List<Long> getMillisecondsList(String path) {
            return value.getMillisecondsList(path);
        }

        @Override
        @Deprecated
        public List<Long> getNanosecondsList(String path) {
            return value.getNanosecondsList(path);
        }

        @Override
        public List<Long> getDurationList(String path, TimeUnit unit) {
            return value.getDurationList(path, unit);
        }

        @Override
        public List<Duration> getDurationList(String path) {
            return value.getDurationList(path);
        }

        @Override
        public Config withOnlyPath(String path) {
            return value.withOnlyPath(path);
        }

        @Override
        public Config withoutPath(String path) {
            return value.withoutPath(path);
        }

        @Override
        public Config atPath(String path) {
            return value.atPath(path);
        }

        @Override
        public Config atKey(String key) {
            return value.atKey(key);
        }

        @Override
        public Config withValue(String path, ConfigValue value) {
            return this.value.withValue(path, value);
        }

        public final Config value;

        @Override
        public Config config() {
            return value;
        }

        protected Core(Config config) {
            this.value = config;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    Conf EMPTY = of(ConfigFactory.parseString("{}"));
}
