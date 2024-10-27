/*
 * Source of units
 * Copyright (C) 2024.  Zen.Liu
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

package cn.zenliu.units.func;

import org.jooq.lambda.Seq;
import org.jooq.lambda.function.Function1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Zen.Liu
 * @since 2024-10-27
 */
public interface Fn {
    static <C extends List<T>, T, R> Function1<C, ? extends List<R>> map(Function1<T, R> mapping) {
        return c -> c == null || c.isEmpty() ? List.of() : c.stream().map(mapping).toList();
    }

    static <C extends Set<T>, T, R> Function1<C, ? extends Set<R>> mapSet(Function1<T, R> mapping) {
        return c -> c == null || c.isEmpty() ? Set.of() : c.stream().map(mapping).collect(Collectors.toSet());
    }

    static <C extends Collection<T>, T, R> Function1<C, ? extends Collection<R>> mapCollection(Function1<T, R> mapping) {
        return c -> c == null || c.isEmpty() ? List.of() : Seq.seq(c).map(mapping).toList();
    }

    static <C extends Map<K, V>, K, R, V> Function1<C, ? extends Map<R, V>> mapKey(Function1<K, R> mapping) {
        return c -> c == null || c.isEmpty() ? Map.of() :
                c.entrySet().stream()
                        .map(e -> Map.entry(mapping.apply(e.getKey()), e.getValue()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    static <C extends Map<K, V>, K, R, V> Function1<C, ? extends Map<K, R>> mapValue(Function1<V, R> mapping) {
        return c -> c == null || c.isEmpty() ? Map.of() :
                c.entrySet().stream()
                        .map(e -> Map.entry(e.getKey(), mapping.apply(e.getValue())))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    static boolean negative(int v) {
        return v < 0;
    }

    static boolean positive(int v) {
        return v > 0;
    }

    static boolean zero(int v) {
        return v == 0;
    }

    static boolean natural(int v) {
        return v >= 0;
    }

    static IntPredicate range(int mi, int mx) {
        return v -> v >= mi && v <= mx;
    }

    static IntPredicate rangeR(int mi, int mx) {
        return v -> v >= mi && v < mx;
    }

    static IntPredicate rangeL(int mi, int mx) {
        return v -> v > mi && v <= mx;
    }

    static IntPredicate rangeLR(int mi, int mx) {
        return v -> v > mi && v < mx;
    }

    static boolean oNegative(Number v) {
        return v != null && v.intValue() < 0;
    }

    static boolean oPositive(Number v) {
        return v != null && v.intValue() > 0;
    }

    static boolean oZero(Number v) {
        return v != null && v.intValue() == 0;
    }

    static boolean oNatural(Number v) {
        return v != null && v.intValue() >= 0;
    }

    static Predicate<? extends Number> oRange(int mi, int mx) {
        var r = range(mi, mx);
        return v -> v != null && r.test(v.intValue());
    }

    static Predicate<? extends Number> oRangeR(int mi, int mx) {
        var r = rangeR(mi, mx);
        return v -> v != null && r.test(v.intValue());
    }

    static Predicate<? extends Number> oRangeL(int mi, int mx) {
        var r = rangeL(mi, mx);
        return v -> v != null && r.test(v.intValue());
    }

    static Predicate<? extends Number> oRangeLR(int mi, int mx) {
        var r = rangeLR(mi, mx);
        return v -> v != null && r.test(v.intValue());
    }

    static <T extends Collection<?>> boolean nullOrEmpty(T v) {
        return v == null || v.isEmpty();
    }

    static <T extends CharSequence> boolean nullOrEmpty(T v) {
        return v == null || v.isEmpty();
    }

    static <T extends Map<?, ?>> boolean nullOrEmpty(T v) {
        return v == null || v.isEmpty();
    }

    static boolean nullOrBlank(String v) {
        return v == null || v.isBlank();
    }
}
