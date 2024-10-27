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

package gen;

import lombok.SneakyThrows;
import org.jooq.lambda.Seq;
import org.jooq.lambda.tuple.Tuple2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.function.UnaryOperator;


/**
 * @author Zen.Liu
 * @since 2024-10-26
 */
@SuppressWarnings("unused")
public class Fn {
    @SneakyThrows
    static void write(Path p, byte[] data) {
        Files.write(p, data);
    }

    static void genFuncs() {

        var cap = (UnaryOperator<String>) s -> s.substring(0, 1).toUpperCase();
        var Named = (UnaryOperator<String>) s -> s.substring(s.lastIndexOf('.') + 1);
        var set = new HashSet<Object>();
        var l2 = Map.of(
                void.class, void.class,
                int.class, Integer.class,
                long.class, Long.class,
                double.class, Double.class,
                boolean.class, Boolean.class
        );
        var none = Seq.seq(l2.keySet()).filter(x -> x != void.class).toSet();
        var consumers = new StringBuilder();
        var functions = new StringBuilder();
        var predicates = new StringBuilder();
        Seq.range(1, 5).forEach(n -> {
            var q = Seq.seq(none);
            @SuppressWarnings({"unchecked", "rawtypes"})
            Seq<Tuple2<?, ?>> r = (Seq<Tuple2<?, ?>>) (Seq) q.crossJoin(none);
            for (int i = 1; i < n; i++) {
                //noinspection unchecked rawtypes
                r = (Seq<Tuple2<?, ?>>) (Seq) r.crossJoin(none);
            }
            r.map(v -> {
                        var x = new ArrayList<Class<?>>();
                        while (!(v.v1 instanceof Class<?> c)) {
                            x.add((Class<?>) v.v2);
                            v = (Tuple2<?, ?>) v.v1;
                        }
                        x.add((Class<?>) v.v2);
                        x.add((Class<?>) v.v1);
                        return Seq.seq(x).reverse().toList();
                    })
                    .filter(set::add)
                    .forEach(s -> {
                        var size = s.size();
                        var max = size - 1;
                        var name = Seq.seq(s).map(Class::getName).map(cap).toString("");
                        consumers.append("""
                                interface Cu%2$s extends Consumer%1$d<%3$s>,PConsumer {
                                      void consume(%4$s);
                                      @Override
                                      default void accept(%5$s) {
                                          consume(%6$s);
                                       }
                                }
                                """.formatted(
                                size,
                                name,
                                Seq.seq(s).map(l2::get).map(Class::getName).map(Named).toString(","),
                                Seq.seq(s).map(Class::getName).zipWithIndex().map(u -> "%s v%d".formatted(u.v1, u.v2)).toString(","),
                                Seq.seq(s).map(l2::get).map(Class::getName).map(Named).zipWithIndex().map(u -> "%s v%d".formatted(u.v1, u.v2)).toString(","),
                                Seq.seq(s).map(Class::getName).zipWithIndex().map(u -> "(%s)requireNonNull(v%d)".formatted(u.v1, u.v2)).toString(",")
                        ));
                        functions.append("""
                                interface Fn%2$s extends Function%1$d<%3$s>,PFunction{
                                      %7$s accept(%4$s);
                                      @Override
                                      default %8$s apply(%5$s) {
                                          return accept(%6$s);
                                       }
                                }
                                """.formatted(
                                max,
                                name,
                                Seq.seq(s).map(l2::get).map(Class::getName).map(Named).toString(","),
                                Seq.seq(s).limit(max).map(Class::getName).zipWithIndex().map(u -> "%s v%d".formatted(u.v1, u.v2)).toString(","),
                                Seq.seq(s).limit(max).map(l2::get).map(Class::getName).map(Named).zipWithIndex().map(u -> "%s v%d".formatted(u.v1, u.v2)).toString(","),
                                Seq.seq(s).limit(max).map(Class::getName).zipWithIndex().map(u -> "(%s)requireNonNull(v%d)".formatted(u.v1, u.v2)).toString(","),
                                s.get(max).getName(),
                                Named.apply(l2.get(s.get(max)).getName())
                        ));
                        predicates.append("""
                                interface Pred%2$s extends Function%1$d<%3$s,Boolean>,PPredicate {
                                      boolean test(%4$s);
                                      @Override
                                      default Boolean apply(%5$s) {
                                          return test(%6$s);
                                       }
                                }
                                """.formatted(
                                size,
                                name,
                                Seq.seq(s).map(l2::get).map(Class::getName).map(Named).toString(","),
                                Seq.seq(s).map(Class::getName).zipWithIndex().map(u -> "%s v%d".formatted(u.v1, u.v2)).toString(","),
                                Seq.seq(s).map(l2::get).map(Class::getName).map(Named).zipWithIndex().map(u -> "%s v%d".formatted(u.v1, u.v2)).toString(","),
                                Seq.seq(s).map(Class::getName).zipWithIndex().map(u -> "(%s)requireNonNull(v%d)".formatted(u.v1, u.v2)).toString(",")
                        ));
                    });

        });
        write(Paths.get("func/src/main/java/cn/zenliu/units/func/PConsumer.java"),
                """
                        package cn.zenliu.units.func;
                        import cn.zenliu.units.func.Fn;
                        import org.jooq.lambda.function.*;
                        import static java.util.Objects.requireNonNull;
                        public  interface PConsumer extends Fn {
                              %s
                        }
                        """.formatted(
                        consumers
                ).getBytes(StandardCharsets.UTF_8));
        write(Paths.get("func/src/main/java/cn/zenliu/units/func/PFunction.java"),
                """
                        package cn.zenliu.units.func;
                        import org.jooq.lambda.function.*;
                        import static java.util.Objects.requireNonNull;
                        public  interface PFunction extends Fn {
                              %s
                        }
                        """.formatted(
                        functions
                ).getBytes(StandardCharsets.UTF_8));
        write(Paths.get("func/src/main/java/cn/zenliu/units/func/PPredicate.java"),
                """
                        package cn.zenliu.units.func;
                        import org.jooq.lambda.function.*;
                        import static java.util.Objects.requireNonNull;
                        public  interface PPredicate extends Fn {
                              %s
                        }
                        """.formatted(
                        predicates
                ).getBytes(StandardCharsets.UTF_8));

    }

    static void genTuple() {

        var cap = (UnaryOperator<String>) s -> s.substring(0, 1).toUpperCase();
        var Named = (UnaryOperator<String>) s -> s.substring(s.lastIndexOf('.') + 1);
        var set = new HashSet<Object>();
        var l2 = Map.of(
                void.class, void.class,
                int.class, Integer.class,
                long.class, Long.class,
                double.class, Double.class,
                boolean.class, Boolean.class
        );
        var none = Seq.seq(l2.keySet()).filter(x -> x != void.class).toSet();
        var tuple = new StringBuilder();
        Seq.range(1, 4)
                .forEach(n -> {
                    var q = Seq.seq(none);
                    @SuppressWarnings({"unchecked", "rawtypes"})
                    Seq<Tuple2<?, ?>> r = (Seq<Tuple2<?, ?>>) (Seq) q.crossJoin(none);
                    for (int i = 1; i < n; i++) {
                        //noinspection unchecked rawtypes
                        r = (Seq<Tuple2<?, ?>>) (Seq) r.crossJoin(none);
                    }
                    r.map(v -> {
                                var x = new ArrayList<Class<?>>();
                                while (!(v.v1 instanceof Class<?> c)) {
                                    x.add((Class<?>) v.v2);
                                    v = (Tuple2<?, ?>) v.v1;
                                }
                                x.add((Class<?>) v.v2);
                                x.add((Class<?>) v.v1);
                                return Seq.seq(x).reverse().toList();
                            })
                            .filter(set::add)
                            .forEach(s -> {
                                var size = s.size();
                                var max = size - 1;
                                var name = Seq.seq(s).map(Class::getName).map(cap).toString("");
                                tuple.append("""
                                            static U%1$d%2$s tuple(%5$s){
                                                return U%1$d%2$s.of(%4$s);
                                            }
                                            @EqualsAndHashCode
                                            class U%1$d%2$s  implements PTuple {
                                            %3$s
                                               public static U%1$d%2$s of(%5$s){
                                                    return new U%1$d%2$s(%4$s);
                                                }
                                                public U%1$d%2$s(%5$s){
                                                    %8$s;
                                                }
                                                public U%1$d%2$s(Tuple%1$d<%6$s> u){
                                                    %7$s;
                                                }
                                                @Override
                                                public Object[] toArray() {
                                                    return new Object[]{%4$s};
                                                }
                                            
                                                @Override
                                                public int degree() {
                                                    return %1$d;
                                                }
                                                public Tuple%1$d<%6$s> toTuple(){
                                                    return Tuple.tuple(%4$s);
                                                }
                                                @Override
                                                public String toString(){
                                                    return Arrays.toString(toArray());
                                                }
                                            }
                                        """.formatted(
                                        size,
                                        name,
                                        Seq.seq(s).map(Class::getName).zipWithIndex().map(u -> """
                                                    public final %1$s v%2$d;
                                                    public final %1$s v%2$d(){
                                                        return v%2$d;
                                                    }
                                                """.formatted(u.v1, u.v2+1)).toString("")
                                        ,Seq.seq(s).map(Class::getName).zipWithIndex().map(Tuple2::v2).map(v->v+1).map("v%d"::formatted).toString(",")
                                        ,Seq.seq(s).map(Class::getName).zipWithIndex().map(u -> "%1$s v%2$d".formatted(u.v1, u.v2+1)).toString(",")
                                        ,Seq.seq(s).map(l2::get).map(Class::getName).map(Named).toString(",")
                                        ,Seq.seq(s).zipWithIndex().map(v->"this.v%1$d=requireNonNull(u.v%1d)".formatted(v.v2+1)).toString(";\n            ")
                                        ,Seq.seq(s).zipWithIndex().map(v->"this.v%1$d=v%1$d".formatted(v.v2+1)).toString(";\n            ")
                                ));
                            });
                });
        write(Paths.get("func/src/main/java/cn/zenliu/units/func/PTuple.java"),
                """
                        package cn.zenliu.units.func;
                                                
                        import lombok.EqualsAndHashCode;
                        import org.jetbrains.annotations.NotNull;
                        import org.jooq.lambda.Seq;
                        import org.jooq.lambda.tuple.Tuple;
                        import org.jooq.lambda.tuple.*;
                        import java.util.Arrays;
                        import java.util.Iterator;
                        import java.util.List;
                        import java.util.Map;
                        import java.util.function.Function;
                        import static java.util.Objects.requireNonNull;
                        @SuppressWarnings({"SpellCheckingInspection","unused"})
                        public  interface PTuple extends Tuple{
                            @Override
                            default Object[] array() {
                                return toArray();
                            }
                                                
                            @Override
                            default List<?> list() {
                                return toList();
                            }
                                                
                            @Override
                            default List<?> toList() {
                                return List.of(toArray());
                            }
                                                
                            @Override
                            default Map<String, ?> toMap() {
                                return toSeq().zipWithIndex().map(Tuple2::swap)
                                        .toMap(v -> "v" + v.v1, Tuple2::v2);
                            }
                                                
                            @Override
                            default <K> Map<K, ?> toMap(Function<? super Integer, ? extends K> function) {
                                return toSeq().zipWithIndex()
                                        .map(Tuple2::swap)
                                        .map(v -> v.map1(Long::intValue).map1(function))
                                        .toMap(Tuple2::v1, Tuple2::v2);
                            }
                                                
                            @Override
                            default Seq<?> toSeq() {
                                return Seq.seq(toList());
                            }
                                                
                            @NotNull
                            @Override
                            default Iterator<Object> iterator() {
                                return toSeq().cast(Object.class).iterator();
                            }
                        %s
                        }
                        """.formatted(
                        tuple
                ).getBytes(StandardCharsets.UTF_8));

    }

    public static void main(String[] args) {
        genFuncs();
        genTuple();
    }

    static void genTuples() {
        write(Paths.get("func/src/main/java/cn/zenliu/units/func/Tuples.java"),
                ("""
                         package cn.zenliu.units.func;
                         import org.jooq.lambda.function.*;
                         import org.jooq.lambda.tuple.*;
                         @SuppressWarnings("unused")
                         public interface Tuples {
                              static <V,R> Function1<Tuple1<V>,Tuple1<R>> map1$1(Function1<V,R> m){
                                  return u->u.map1(m);
                              }
                         """ +
                 Seq.range(2, 17)
                         .map(n -> Seq.range(1, n + 1)
                                 .map(m -> """
                                             static <%3$s> Function1<Tuple%2$d<%4$s>,Tuple%2$d<%5$s>> map%2$d$%1$d(Function1<V,R> m){
                                                 return u->u.map%1$d(m);
                                             }
                                         """
                                         .formatted(
                                                 m
                                                 , n
                                                 , Seq.range(1, n + 1)
                                                         .map(v -> v == m ? "V" : "T%d".formatted(v))
                                                         .concat("R")
                                                         .toString(",")
                                                 , Seq.range(1, n + 1)
                                                         .map(v -> v == m ? "V" : "T%d".formatted(v))
                                                         .toString(",")
                                                 , Seq.range(1, n + 1)
                                                         .map(v -> v == m ? "R" : "T%d".formatted(v))
                                                         .toString(",")
                                         )
                                 ).toString("\n")
                         ).toString("\n")
                 + "}").getBytes(StandardCharsets.UTF_8)
        );
    }
}

