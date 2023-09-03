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

package cn.zenliu.classes;

import com.google.common.collect.ObjectArrays;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * A HashSet delegate a collection actions as a set with elements transformed<br/>
 * <ol>
 * <li>it may change the source to remove already exists duplicated elements.</li>
 * <li>all final result will affect on underlying collection.</li>
 * <li>source type and element type should share same hashcode algorithm.</li>
 * </ol>
 *
 * @author Zen.Liu
 * @since 2023-04-30
 */

public interface DelegateTransformerSet<E, O, C extends Collection<O>> extends Set<E> {
    C unwrap();

    E to(O o);

    O from(E e);

    @Override
    default int size() {
        return unwrap().size();
    }

    @Override
    default boolean isEmpty() {
        return unwrap().isEmpty();
    }

    @Override
    default boolean contains(Object o) {
        return unwrap().contains(o);
    }

    @NotNull
    @Override
    default Iterator<E> iterator() {
        var it = unwrap().iterator();
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public E next() {
                return to(it.next());
            }
        };
    }

    @NotNull
    @Override
    default Object @NotNull [] toArray() {
        return unwrap().stream().map(this::to).toArray();
    }

    @SuppressWarnings("unchecked")
    @NotNull
    @Override
    default <T> T @NotNull [] toArray(@NotNull T @NotNull [] other) {
        int size = this.size();
        var unwrap = unwrap().toArray();
        if (other.length < size) {
            other = ObjectArrays.newArray(other, size);
        } else if (other.length > size) {
            other[size] = null;
        }
        for (int i = 0; i < unwrap.length; i++) {
            other[i] = (T) to((O) unwrap[i]);
        }

        return other;

    }

    @Override
    default boolean add(E e) {
        return !contains(e) && unwrap().add(from(e));
    }

    @SuppressWarnings("unchecked")
    @Override
    default boolean remove(Object o) {
        return unwrap().remove(from((E) o));
    }

    @SuppressWarnings("unchecked")
    @Override
    default boolean containsAll(@NotNull Collection<?> c) {
        return unwrap().containsAll(c.stream().map(x -> this.from((E) c)).collect(Collectors.toSet()));
    }

    @Override
    default boolean addAll(@NotNull Collection<? extends E> c) {
        for (E e : c) {
            var ex = from(e);
            if (unwrap().contains(ex)) return false;
            unwrap().add(ex);
        }
        return true;
    }

    @Override
    default boolean retainAll(@NotNull Collection<?> c) {
        return unwrap().retainAll(c);
    }

    @Override
    default boolean removeAll(@NotNull Collection<?> c) {
        return unwrap().removeAll(c);
    }

    @Override
    default void clear() {
        unwrap().clear();
    }


    /**
     * a implement with extra hash set check.
     *
     * @param <E> element type
     * @param <O> source element type
     * @param <C> collection type
     */
    final class Impl<E, O, C extends Collection<O>> implements DelegateTransformerSet<E, O, C> {
        final Set<Integer> hash;
        final C unwrap;
        final boolean eager;
        final Function<E, O> from;
        final Function<O, E> to;

        public Impl(@NonNull C o, boolean eager, @NonNull Function<E, O> from, @NonNull Function<O, E> to) {
            this.unwrap = o;
            this.hash = ConcurrentHashMap.newKeySet(o.size() == 0 ? 16 : o.size());
            this.eager = eager;
            this.from = from;
            this.to = to;
            if (eager) {
                unwrap.removeIf(e -> !hash.add(e.hashCode()));
            }
        }

        private void initHash() {
            if (!eager && hash.isEmpty()) {
                synchronized (hash) {
                    if (hash.isEmpty()) {
                        unwrap.removeIf(e -> !hash.add(e.hashCode()));
                    }
                }
            }
        }

        @Override
        public E to(O o) {
            return to.apply(o);
        }

        @Override
        public O from(E e) {
            return from.apply(e);
        }

        @Override
        public C unwrap() {
            return unwrap;
        }

        @Override
        public boolean add(E e) {
            initHash();
            if (hash.add(e.hashCode()))
                unwrap.add(from(e));
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends E> c) {
            initHash();
            if (c.isEmpty()) return false;
            var temp = new ArrayList<O>();
            for (var v : c) {
                if (hash.add(v.hashCode())) {
                    temp.add(from(v));
                }
            }
            if (temp.isEmpty()) return false;
            return unwrap.addAll(temp);
        }

        @Override
        public boolean contains(Object o) {
            if (o == null) return false;
            initHash();
            return hash.contains(o.hashCode());
        }

        @Override
        public boolean remove(Object o) {
            if (o == null) return false;
            initHash();
            if (!hash.contains(o.hashCode())) return false;
            return unwrap.remove(o);
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            initHash();
            for (var o : c) {
                if (o == null || !hash.contains(o.hashCode())) return false;

            }
            return true;
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            initHash();
            var modified = false;
            var it = unwrap.iterator();
            while (it.hasNext()) {
                var e = it.next();
                if (!c.contains(to(e))) {
                    hash.remove(e.hashCode());
                    it.remove();
                    modified = true;
                }
            }
            return modified;
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            initHash();
            var modified = false;
            var it = unwrap.iterator();
            while (it.hasNext()) {
                var e = it.next();
                if (c.contains(e)) {
                    hash.remove(e.hashCode());
                    it.remove();
                    modified = true;
                }
            }
            return modified;
        }

        @Override
        public boolean removeIf(Predicate<? super E> filter) {
            Objects.requireNonNull(filter);
            var removed = false;
            var each = unwrap.iterator();
            while (each.hasNext()) {
                var e = each.next();
                if (filter.test(to(e))) {
                    hash.remove(e.hashCode());
                    each.remove();
                    removed = true;
                }
            }
            return removed;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof DelegateTransformerSet<?, ?, ?>) {
                return Objects.equals(((DelegateTransformerSet<?, ?, ?>) o).unwrap(), unwrap());
            }
            return unwrap().equals(o);
        }

        @Override
        public int hashCode() {
            return unwrap().hashCode();
        }
    }

    static <E, O, C extends Collection<O>> Impl<E, O, C> of(C collection, Function<E, O> from, Function<O, E> to, boolean eager) {
        return new Impl<>(collection, eager, from, to);
    }
}
