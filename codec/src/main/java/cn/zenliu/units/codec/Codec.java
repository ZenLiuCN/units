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

package cn.zenliu.units.codec;

import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Binary codec: encode or decode values from binary.<br/>
 * There are no schema inside the binary, sender and receiver must already acknowledge the schema information .<br/>
 *
 * <pre>
 * Basic format:<br/>
 * <ol>
 *     <li>simple type: encode as little endian binary format without any header.</li>
 *     <li>nullable type: encode one byte (0 for null , 1 for nonnull) as header.</li>
 *     <li>repeated type: encode zigzag-var-int32 length (negative for null,0 for empty ) of elements as header.</li>
 *     <li>tuple type:  encode or decode values in tuple order.</li>
 *     <li>{@link Serializer} type:  encode or decode use Serializer method.</li>
 *     <li>{@link Reference} type: only encode or decode the {@link Reference#identifier()}{@link Serializer}.</li>
 * </ol>
 * For CodecBase implement have those out-of-box support:
 * <ol>
 *     <li>primitives and array (integers shorter than 32bit are not directly supported except byte)</li>
 *     <li>boxed type and array (integers shorter than 32bit are not directly supported except byte) )</li>
 *     <li>Map List Set Collection Object-Array type; Those type can override by TypeInfoFactory</li>
 *     <li>String, Instant, Timestamp , BigDecimal, BigInteger,Duration, Period; Those type can override by TypeInfoFactory</li>
 *     <li>Pojo with default public empty constructor; Can override by TypeInfoFactory</li>
 *     <li>Record with public constructor (must have components); Can override by TypeInfoFactory</li>
 * </ol>
 * </pre>
 *
 * @author Zen.Liu
 * @since 2023-08-22
 */
@SuppressWarnings("UnusedReturnValue")
public interface Codec {
    /**
     * call this before use this codec;<br/>
     * This will initialize any {@link TypeInfoFactory} that inherited {@link TypeInfoFactory.Initialize}.<br/>
     * This method may call multiple times with different value.<br/>
     */
    void initialize(@Nullable Object value);

    /**
     * Encode value into buffer.<br/>
     * <b>Note</b> this will write a zero byte if value is null.
     *
     * @param buf   output buffer
     * @param value encode value
     * @return output buffer
     */
    ByteBuf encode(ByteBuf buf, Object value);

    default <T> ByteBuf encode(ByteBuf buf, T value, Class<T> type) {
        return encode(buf, value, typeInfo(type));
    }

    default <T> ByteBuf encode(ByteBuf buf, T value, TypeRef<T> type) {
        return encode(buf, value, typeInfo(type));
    }

    /**
     * Encode value into buffer use specified TypeInfo.
     *
     * @param buf   output buffer
     * @param value encode value
     * @param info  specified TypeInfo
     * @param <T>   type
     * @return output buffer
     */
    <T> ByteBuf encode(ByteBuf buf, T value, TypeInfo<? super T> info);

    /**
     * Decode value from buffer
     * <b>Note:</b> buffer should release after read ( decrease reference count by one ).
     *
     * @param buf  input buffer
     * @param type typeinfo
     * @param <T>  type contains in buffer
     * @return read value
     */
    <T> T decode(ByteBuf buf, TypeInfo<T> type);

    default <T> T decode(ByteBuf buf, Class<T> type) {
        return decode(buf, typeInfo(type));
    }

    default <T> T decode(ByteBuf buf, TypeRef<T> type) {
        return decode(buf, typeInfo(type));
    }

    /**
     * Make a type-info from java type.
     *
     * @param type java type or {@link TypeRef<T>}
     * @param <T>  type present by the java type
     * @return type info
     */
    <T> @Nullable TypeInfo<T> typeInfo(Type type);

    default <T> Optional<TypeInfo<T>> resolve(Type type) {
        return Optional.ofNullable(typeInfo(type));
    }

    default ByteBuf encode(ByteBuf buf, boolean value) {
        return encodeBoolean(buf, value);
    }

    default ByteBuf encode(ByteBuf buf, int value) {
        return encodeInt32(buf, value);
    }

    default ByteBuf encode(ByteBuf buf, long value) {
        return encodeInt64(buf, value);
    }

    default ByteBuf encode(ByteBuf buf, double value) {
        return encodeFloat64(buf, value);
    }

    default ByteBuf encode(ByteBuf buf, float value) {
        return encodeFloat32(buf, value);
    }


    //region codec utilities

    /**
     * default encode for boolean
     */
    static ByteBuf encodeBoolean(ByteBuf buf, boolean value) {
        return buf.writeByte(value ? 1 : 0);
    }

    /**
     * default decode for boolean
     */
    static boolean decodeBoolean(ByteBuf buf) {
        return buf.readByte() > 0;
    }

    /**
     * default encode for int32 (use zig-zag-var-int codec)
     */
    static ByteBuf encodeInt32(ByteBuf buf, int value) {
        return zigZagVarInt32(buf, value);
    }

    /**
     * default decode for int32 (use zig-zag-var-int codec)
     */
    static int decodeInt32(ByteBuf buf) {
        return zigZagVarInt32(buf);
    }

    /**
     * default encode for int64 (use zig-zag-var-int codec)
     */
    static ByteBuf encodeInt64(ByteBuf buf, long value) {
        return zigZagVarInt64(buf, value);
    }

    /**
     * default decode for int64 (use zig-zag-var-int codec)
     */
    static long decodeInt64(ByteBuf buf) {
        return zigZagVarInt64(buf);
    }


    /**
     * default encode for float32
     */
    static ByteBuf encodeFloat32(ByteBuf buf, float value) {
        return buf.writeFloatLE(value);
    }

    /**
     * default decode for float32
     */
    static float decodeFloat32(ByteBuf buf) {
        return buf.readFloatLE();
    }


    /**
     * default encode for float64
     */
    static ByteBuf encodeFloat64(ByteBuf buf, double value) {
        return buf.writeDoubleLE(value);
    }

    /**
     * default decode for float32
     */
    static double decodeFloat64(ByteBuf buf) {
        return buf.readDoubleLE();
    }


    /**
     * default encode for bytes
     */
    static ByteBuf encodeByteArray(ByteBuf buf, byte[] value) {
        if (value == null) return encodeInt32(buf, -1);
        encodeInt32(buf, value.length);
        return buf.writeBytes(value);
    }

    /**
     * default decode for bytes
     */
    static byte[] decodeByteArray(ByteBuf buf) {
        var n = decodeInt32(buf);
        if (n < 0) return null;
        if (n == 0) return new byte[0];
        var bytes = new byte[n];
        buf.readBytes(bytes);
        return bytes;
    }

    static ByteBuf encodeString(ByteBuf buf, String value) {
        if (value == null) return Codec.zigZagVarInt32(buf, -1);
        else if (value.isEmpty()) return Codec.zigZagVarInt32(buf, 0);
        else {
            var b = value.getBytes(StandardCharsets.UTF_8);
            Codec.zigZagVarInt32(buf, b.length);
            return buf.writeBytes(b);
        }
    }

    static String decodeString(ByteBuf buf) {
        var n = Codec.zigZagVarInt32(buf);
        if (n < 0) return null;
        if (n == 0) return "";
        var b = new byte[n];
        buf.readBytes(b);
        return new String(b, StandardCharsets.UTF_8);
    }

    static ByteBuf encodeAnyArray(ByteBuf buf, Object value, BiConsumer<ByteBuf, Object> writer) {
        if (value == null) return encodeInt32(buf, -1);
        var n = Array.getLength(value);
        encodeInt32(buf, n);
        for (int i = 0; i < n; i++) {
            writer.accept(buf, Array.get(value, i));
        }
        return buf;
    }

    /**
     * default decode for Array
     */

    @SuppressWarnings("rawtypes")
    static Object decodeAnyArray(ByteBuf buf, Class elementType, Function<ByteBuf, Object> reader) {
        var n = decodeInt32(buf);
        if (n < 0) return null;
        if (n == 0) return Array.newInstance(elementType, 0);
        var values = Array.newInstance(elementType, n);
        for (int i = 0; i < n; i++) {
            Array.set(values, i, reader.apply(buf));
        }
        return values;
    }

    /**
     * default encode for Array
     */
    static <T> ByteBuf encodeAny(ByteBuf buf, T value, BiConsumer<ByteBuf, ? super T> writer) {
        if (value == null) return buf.writeByte(0);
        buf.writeByte(1);
        writer.accept(buf, value);
        return buf;
    }

    /**
     * default decode for Array
     */
    @SuppressWarnings("unchecked")
    static <T> T decodeAny(ByteBuf buf, Function<ByteBuf, ? super T> reader) {
        if (buf.readByte() <= 0) return null;
        return (T) reader.apply(buf);
    }


    /**
     * default encode for Tuple
     *
     * @param size negative encode as null length, zero encode as zero length, both will put nothing.
     */
    static ByteBuf encodeTuple(ByteBuf buf, int size, IntFunction<Object> tuple, IntFunction<BiConsumer<ByteBuf, Object>> writers) {
        if (size < 0) return zigZagVarInt32(buf, -1);
        if (size == 0) return zigZagVarInt32(buf, 0);
        zigZagVarInt32(buf, size);
        for (int i = 0; i < size; i++) {
            var o = tuple.apply(i);
            encodeAny(buf, o, writers.apply(i));
        }
        return buf;
    }

    /**
     * default decode for Tuple. for read length of negative or zero will do nothing.
     */

    static void decodeTuple(ByteBuf buf, IntFunction<Consumer<Object>> consumers, IntFunction<Function<ByteBuf, Object>> readers) {
        var size = zigZagVarInt32(buf);
        if (size <= 0) return;
        for (int i = 0; i < size; i++) {
            var o = readers.apply(i).apply(buf);
            consumers.apply(i).accept(o);
        }
    }

    //endregion


    //region Unities
    static long fnv1a64(String data) {
        var hash = 0xcbf29ce484222325L;
        for (int i = 0; i < data.length(); i++) {
            hash ^= data.charAt(i);
            hash *= 0x100000001b3L;
        }
        return hash;
    }

    static int fnv1a32(String data) {
        var hash = 0x811c9dc5;
        for (int i = 0; i < data.length(); i++) {
            hash ^= data.charAt(i);
            hash *= 16777619;
        }
        return hash;
    }

    static int varInt32(ByteBuf v) {
        int result = 0;
        int shift = 0;
        int b;
        do {
            if (shift >= 32)
                throw new IndexOutOfBoundsException("VarInt too long");
            b = v.readByte();
            result |= (b & 0x7F) << shift;
            shift += 7;
        } while ((b & 0x80) != 0);
        return result;
    }

    static long varInt64(ByteBuf v) {
        long result = 0;
        long shift = 0;
        long b;
        do {
            if (shift >= 64)
                throw new IndexOutOfBoundsException("VarInt too long");
            b = v.readByte();
            result |= (b & 0x7F) << shift;
            shift += 7;
        } while ((b & 0x80) != 0);
        return result;
    }

    static ByteBuf varInt32(ByteBuf buf, int v) {
        do {
            var bits = v & 0x7F;
            v >>>= 7;
            var b = (byte) (bits + ((v != 0) ? 0x80 : 0));
            buf.writeByte(b);
        } while (v != 0);
        return buf;
    }

    static ByteBuf varInt64(ByteBuf buf, long v) {
        do {
            var bits = v & 0x7F;
            v >>>= 7;
            var b = (byte) (bits + ((v != 0) ? 0x80 : 0));
            buf.writeByte(b);
        } while (v != 0);
        return buf;
    }

    static int toZigZag(int v) {
        return (v << 1) ^ (v >> 31);
    }

    static int fromZigZag(int v) {
        return (v >>> 1) ^ -(v & 1);
    }

    static long toZigZag(long v) {
        return (v << 1) ^ (v >> 31);
    }

    static long fromZigZag(long v) {
        return (v >>> 1) ^ -(v & 1);
    }

    static ByteBuf zigZagVarInt32(ByteBuf buf, int v) {
        return varInt32(buf, toZigZag(v));
    }

    static ByteBuf zigZagVarInt64(ByteBuf buf, long v) {
        return varInt64(buf, toZigZag(v));
    }

    static int zigZagVarInt32(ByteBuf buf) {
        return fromZigZag(varInt32(buf));
    }

    static long zigZagVarInt64(ByteBuf buf) {
        return fromZigZag(varInt64(buf));
    }
    //endregion

    /**
     * TypeRef for complex type
     * <pre>{@code Type SOME_TYPE=new TypeRef<Map<Integer,String>>(){}.getType();}</pre>
     *
     * @param <T> the complex type present by this TypeRef
     */
    abstract class TypeRef<T> implements Type, Comparable<TypeRef<T>> {
        private final Type _type;

        protected TypeRef() {
            var superClass = this.getClass().getGenericSuperclass();
            if (!(superClass instanceof ParameterizedType p))
                throw new IllegalArgumentException("Internal error: TypeRef constructed without type information");

            _type = p.getActualTypeArguments()[0];
        }

        @Override
        public String getTypeName() {
            return _type.getTypeName();
        }

        public Type getType() {
            return _type;
        }

        @Override
        public int compareTo(@NotNull Codec.TypeRef<T> o) {
            return 0;
        }
    }

    /**
     * Reference type only transport as a {@link Serializer}
     */
    interface Reference {
        /**
         * the reference type contract,which must an interface.
         */
        Serializer identifier();
    }

    /**
     * Object supply pure java type
     */
    interface Typed {
        Type type();
    }

    /**
     * An object that have custom serialize mode should implement this interface.<br/>
     * <b>Note:</b> The object class must have a public no argument constructor.
     */
    interface Serializer {
        void read(ByteBuf buf);

        void write(ByteBuf buf);
    }


    /**
     * Underlying codec with type information
     *
     * @param <T> type supported
     */
    interface TypeInfo<T> {
        T read(ByteBuf buf);

        void write(ByteBuf buf, T value);

        default ByteBuf writer(ByteBuf buf, T value) {
            write(buf, value);
            return buf;
        }
    }

    /**
     * SPI of type-info factory
     */
    @SuppressWarnings("rawtypes")
    interface TypeInfoFactory {
        @Nullable TypeInfo resolve(Type type);

        interface Initialize {
            /**
             * this may call multiple times, pick what type the implement wanna.
             */
            void initialize(@Nullable Object value);
        }
    }

    /**
     * internal cache holder.
     */
    final class $ {
        static final Object lock = new Object();
        static volatile Codec codec;
    }

    /**
     * Load codec implement via SPI. the instance will cache once loaded.
     *
     * @return codec
     * @throws NoSuchElementException if not found SPI implement.
     */
    static Codec load() {
        if ($.codec == null) {
            synchronized ($.lock) {
                if ($.codec == null) {
                    $.codec = ServiceLoader.load(Codec.class, Codec.class.getClassLoader())
                            .findFirst().orElseThrow(() -> new NoSuchElementException("missing Codec implement on class path"));
                }
            }
        }
        return $.codec;
    }
}
