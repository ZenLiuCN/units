package cn.zenliu.units.func;
import org.jooq.lambda.function.*;
import org.jooq.lambda.tuple.*;
@SuppressWarnings("unused")
public interface Tuples {
     static <V,R> Function1<Tuple1<V>,Tuple1<R>> map1$1(Function1<V,R> m){
         return u->u.map1(m);
     }
    static <V,T2,R> Function1<Tuple2<V,T2>,Tuple2<R,T2>> map2$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,R> Function1<Tuple2<T1,V>,Tuple2<T1,R>> map2$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <V,T2,T3,R> Function1<Tuple3<V,T2,T3>,Tuple3<R,T2,T3>> map3$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,R> Function1<Tuple3<T1,V,T3>,Tuple3<T1,R,T3>> map3$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,R> Function1<Tuple3<T1,T2,V>,Tuple3<T1,T2,R>> map3$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <V,T2,T3,T4,R> Function1<Tuple4<V,T2,T3,T4>,Tuple4<R,T2,T3,T4>> map4$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,R> Function1<Tuple4<T1,V,T3,T4>,Tuple4<T1,R,T3,T4>> map4$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,R> Function1<Tuple4<T1,T2,V,T4>,Tuple4<T1,T2,R,T4>> map4$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,R> Function1<Tuple4<T1,T2,T3,V>,Tuple4<T1,T2,T3,R>> map4$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <V,T2,T3,T4,T5,R> Function1<Tuple5<V,T2,T3,T4,T5>,Tuple5<R,T2,T3,T4,T5>> map5$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,R> Function1<Tuple5<T1,V,T3,T4,T5>,Tuple5<T1,R,T3,T4,T5>> map5$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,R> Function1<Tuple5<T1,T2,V,T4,T5>,Tuple5<T1,T2,R,T4,T5>> map5$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,R> Function1<Tuple5<T1,T2,T3,V,T5>,Tuple5<T1,T2,T3,R,T5>> map5$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,R> Function1<Tuple5<T1,T2,T3,T4,V>,Tuple5<T1,T2,T3,T4,R>> map5$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <V,T2,T3,T4,T5,T6,R> Function1<Tuple6<V,T2,T3,T4,T5,T6>,Tuple6<R,T2,T3,T4,T5,T6>> map6$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,R> Function1<Tuple6<T1,V,T3,T4,T5,T6>,Tuple6<T1,R,T3,T4,T5,T6>> map6$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,R> Function1<Tuple6<T1,T2,V,T4,T5,T6>,Tuple6<T1,T2,R,T4,T5,T6>> map6$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,R> Function1<Tuple6<T1,T2,T3,V,T5,T6>,Tuple6<T1,T2,T3,R,T5,T6>> map6$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,R> Function1<Tuple6<T1,T2,T3,T4,V,T6>,Tuple6<T1,T2,T3,T4,R,T6>> map6$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,R> Function1<Tuple6<T1,T2,T3,T4,T5,V>,Tuple6<T1,T2,T3,T4,T5,R>> map6$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,R> Function1<Tuple7<V,T2,T3,T4,T5,T6,T7>,Tuple7<R,T2,T3,T4,T5,T6,T7>> map7$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,R> Function1<Tuple7<T1,V,T3,T4,T5,T6,T7>,Tuple7<T1,R,T3,T4,T5,T6,T7>> map7$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,R> Function1<Tuple7<T1,T2,V,T4,T5,T6,T7>,Tuple7<T1,T2,R,T4,T5,T6,T7>> map7$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,R> Function1<Tuple7<T1,T2,T3,V,T5,T6,T7>,Tuple7<T1,T2,T3,R,T5,T6,T7>> map7$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,R> Function1<Tuple7<T1,T2,T3,T4,V,T6,T7>,Tuple7<T1,T2,T3,T4,R,T6,T7>> map7$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,R> Function1<Tuple7<T1,T2,T3,T4,T5,V,T7>,Tuple7<T1,T2,T3,T4,T5,R,T7>> map7$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,R> Function1<Tuple7<T1,T2,T3,T4,T5,T6,V>,Tuple7<T1,T2,T3,T4,T5,T6,R>> map7$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,R> Function1<Tuple8<V,T2,T3,T4,T5,T6,T7,T8>,Tuple8<R,T2,T3,T4,T5,T6,T7,T8>> map8$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,R> Function1<Tuple8<T1,V,T3,T4,T5,T6,T7,T8>,Tuple8<T1,R,T3,T4,T5,T6,T7,T8>> map8$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,R> Function1<Tuple8<T1,T2,V,T4,T5,T6,T7,T8>,Tuple8<T1,T2,R,T4,T5,T6,T7,T8>> map8$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,R> Function1<Tuple8<T1,T2,T3,V,T5,T6,T7,T8>,Tuple8<T1,T2,T3,R,T5,T6,T7,T8>> map8$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,R> Function1<Tuple8<T1,T2,T3,T4,V,T6,T7,T8>,Tuple8<T1,T2,T3,T4,R,T6,T7,T8>> map8$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,R> Function1<Tuple8<T1,T2,T3,T4,T5,V,T7,T8>,Tuple8<T1,T2,T3,T4,T5,R,T7,T8>> map8$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,R> Function1<Tuple8<T1,T2,T3,T4,T5,T6,V,T8>,Tuple8<T1,T2,T3,T4,T5,T6,R,T8>> map8$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,R> Function1<Tuple8<T1,T2,T3,T4,T5,T6,T7,V>,Tuple8<T1,T2,T3,T4,T5,T6,T7,R>> map8$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,R> Function1<Tuple9<V,T2,T3,T4,T5,T6,T7,T8,T9>,Tuple9<R,T2,T3,T4,T5,T6,T7,T8,T9>> map9$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,R> Function1<Tuple9<T1,V,T3,T4,T5,T6,T7,T8,T9>,Tuple9<T1,R,T3,T4,T5,T6,T7,T8,T9>> map9$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,R> Function1<Tuple9<T1,T2,V,T4,T5,T6,T7,T8,T9>,Tuple9<T1,T2,R,T4,T5,T6,T7,T8,T9>> map9$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,R> Function1<Tuple9<T1,T2,T3,V,T5,T6,T7,T8,T9>,Tuple9<T1,T2,T3,R,T5,T6,T7,T8,T9>> map9$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,R> Function1<Tuple9<T1,T2,T3,T4,V,T6,T7,T8,T9>,Tuple9<T1,T2,T3,T4,R,T6,T7,T8,T9>> map9$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,R> Function1<Tuple9<T1,T2,T3,T4,T5,V,T7,T8,T9>,Tuple9<T1,T2,T3,T4,T5,R,T7,T8,T9>> map9$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,R> Function1<Tuple9<T1,T2,T3,T4,T5,T6,V,T8,T9>,Tuple9<T1,T2,T3,T4,T5,T6,R,T8,T9>> map9$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,R> Function1<Tuple9<T1,T2,T3,T4,T5,T6,T7,V,T9>,Tuple9<T1,T2,T3,T4,T5,T6,T7,R,T9>> map9$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,R> Function1<Tuple9<T1,T2,T3,T4,T5,T6,T7,T8,V>,Tuple9<T1,T2,T3,T4,T5,T6,T7,T8,R>> map9$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,R> Function1<Tuple10<V,T2,T3,T4,T5,T6,T7,T8,T9,T10>,Tuple10<R,T2,T3,T4,T5,T6,T7,T8,T9,T10>> map10$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,R> Function1<Tuple10<T1,V,T3,T4,T5,T6,T7,T8,T9,T10>,Tuple10<T1,R,T3,T4,T5,T6,T7,T8,T9,T10>> map10$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,R> Function1<Tuple10<T1,T2,V,T4,T5,T6,T7,T8,T9,T10>,Tuple10<T1,T2,R,T4,T5,T6,T7,T8,T9,T10>> map10$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,R> Function1<Tuple10<T1,T2,T3,V,T5,T6,T7,T8,T9,T10>,Tuple10<T1,T2,T3,R,T5,T6,T7,T8,T9,T10>> map10$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,R> Function1<Tuple10<T1,T2,T3,T4,V,T6,T7,T8,T9,T10>,Tuple10<T1,T2,T3,T4,R,T6,T7,T8,T9,T10>> map10$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,R> Function1<Tuple10<T1,T2,T3,T4,T5,V,T7,T8,T9,T10>,Tuple10<T1,T2,T3,T4,T5,R,T7,T8,T9,T10>> map10$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,R> Function1<Tuple10<T1,T2,T3,T4,T5,T6,V,T8,T9,T10>,Tuple10<T1,T2,T3,T4,T5,T6,R,T8,T9,T10>> map10$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,R> Function1<Tuple10<T1,T2,T3,T4,T5,T6,T7,V,T9,T10>,Tuple10<T1,T2,T3,T4,T5,T6,T7,R,T9,T10>> map10$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,R> Function1<Tuple10<T1,T2,T3,T4,T5,T6,T7,T8,V,T10>,Tuple10<T1,T2,T3,T4,T5,T6,T7,T8,R,T10>> map10$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,R> Function1<Tuple10<T1,T2,T3,T4,T5,T6,T7,T8,T9,V>,Tuple10<T1,T2,T3,T4,T5,T6,T7,T8,T9,R>> map10$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R> Function1<Tuple11<V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11>,Tuple11<R,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11>> map11$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,R> Function1<Tuple11<T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11>,Tuple11<T1,R,T3,T4,T5,T6,T7,T8,T9,T10,T11>> map11$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,R> Function1<Tuple11<T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11>,Tuple11<T1,T2,R,T4,T5,T6,T7,T8,T9,T10,T11>> map11$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,R> Function1<Tuple11<T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11>,Tuple11<T1,T2,T3,R,T5,T6,T7,T8,T9,T10,T11>> map11$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,R> Function1<Tuple11<T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11>,Tuple11<T1,T2,T3,T4,R,T6,T7,T8,T9,T10,T11>> map11$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,R> Function1<Tuple11<T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11>,Tuple11<T1,T2,T3,T4,T5,R,T7,T8,T9,T10,T11>> map11$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,R> Function1<Tuple11<T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11>,Tuple11<T1,T2,T3,T4,T5,T6,R,T8,T9,T10,T11>> map11$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,R> Function1<Tuple11<T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11>,Tuple11<T1,T2,T3,T4,T5,T6,T7,R,T9,T10,T11>> map11$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,R> Function1<Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11>,Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,R,T10,T11>> map11$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,R> Function1<Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11>,Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,T9,R,T11>> map11$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,R> Function1<Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V>,Tuple11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R>> map11$11(Function1<V,R> m){
        return u->u.map11(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R> Function1<Tuple12<V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12>,Tuple12<R,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12>> map12$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R> Function1<Tuple12<T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12>,Tuple12<T1,R,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12>> map12$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,R> Function1<Tuple12<T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12>,Tuple12<T1,T2,R,T4,T5,T6,T7,T8,T9,T10,T11,T12>> map12$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,R> Function1<Tuple12<T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12>,Tuple12<T1,T2,T3,R,T5,T6,T7,T8,T9,T10,T11,T12>> map12$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,R> Function1<Tuple12<T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12>,Tuple12<T1,T2,T3,T4,R,T6,T7,T8,T9,T10,T11,T12>> map12$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,R> Function1<Tuple12<T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12>,Tuple12<T1,T2,T3,T4,T5,R,T7,T8,T9,T10,T11,T12>> map12$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,R> Function1<Tuple12<T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12>,Tuple12<T1,T2,T3,T4,T5,T6,R,T8,T9,T10,T11,T12>> map12$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,R> Function1<Tuple12<T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12>,Tuple12<T1,T2,T3,T4,T5,T6,T7,R,T9,T10,T11,T12>> map12$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,R> Function1<Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12>,Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,R,T10,T11,T12>> map12$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,R> Function1<Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12>,Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,R,T11,T12>> map12$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,R> Function1<Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12>,Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R,T12>> map12$11(Function1<V,R> m){
        return u->u.map11(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,R> Function1<Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V>,Tuple12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R>> map12$12(Function1<V,R> m){
        return u->u.map12(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13>,Tuple13<R,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13>> map13$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13>,Tuple13<T1,R,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13>> map13$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13>,Tuple13<T1,T2,R,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13>> map13$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13>,Tuple13<T1,T2,T3,R,T5,T6,T7,T8,T9,T10,T11,T12,T13>> map13$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13>,Tuple13<T1,T2,T3,T4,R,T6,T7,T8,T9,T10,T11,T12,T13>> map13$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13>,Tuple13<T1,T2,T3,T4,T5,R,T7,T8,T9,T10,T11,T12,T13>> map13$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13>,Tuple13<T1,T2,T3,T4,T5,T6,R,T8,T9,T10,T11,T12,T13>> map13$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13>,Tuple13<T1,T2,T3,T4,T5,T6,T7,R,T9,T10,T11,T12,T13>> map13$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13>,Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,R,T10,T11,T12,T13>> map13$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13>,Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,R,T11,T12,T13>> map13$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13>,Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R,T12,T13>> map13$11(Function1<V,R> m){
        return u->u.map11(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13>,Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R,T13>> map13$12(Function1<V,R> m){
        return u->u.map12(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,R> Function1<Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V>,Tuple13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R>> map13$13(Function1<V,R> m){
        return u->u.map13(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>,Tuple14<R,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>> map14$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>,Tuple14<T1,R,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>> map14$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>,Tuple14<T1,T2,R,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>> map14$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>,Tuple14<T1,T2,T3,R,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14>> map14$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,T14>,Tuple14<T1,T2,T3,T4,R,T6,T7,T8,T9,T10,T11,T12,T13,T14>> map14$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,T14>,Tuple14<T1,T2,T3,T4,T5,R,T7,T8,T9,T10,T11,T12,T13,T14>> map14$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,T14>,Tuple14<T1,T2,T3,T4,T5,T6,R,T8,T9,T10,T11,T12,T13,T14>> map14$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,T14>,Tuple14<T1,T2,T3,T4,T5,T6,T7,R,T9,T10,T11,T12,T13,T14>> map14$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,T14>,Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,R,T10,T11,T12,T13,T14>> map14$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,T14>,Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,R,T11,T12,T13,T14>> map14$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,T14>,Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R,T12,T13,T14>> map14$11(Function1<V,R> m){
        return u->u.map11(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,T14>,Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R,T13,T14>> map14$12(Function1<V,R> m){
        return u->u.map12(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,T14,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,T14>,Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R,T14>> map14$13(Function1<V,R> m){
        return u->u.map13(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,V,R> Function1<Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,V>,Tuple14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R>> map14$14(Function1<V,R> m){
        return u->u.map14(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<R,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>> map15$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,R,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>> map15$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,R,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>> map15$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,R,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>> map15$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,R,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15>> map15$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,R,T7,T8,T9,T10,T11,T12,T13,T14,T15>> map15$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,R,T8,T9,T10,T11,T12,T13,T14,T15>> map15$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,R,T9,T10,T11,T12,T13,T14,T15>> map15$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,R,T10,T11,T12,T13,T14,T15>> map15$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,R,T11,T12,T13,T14,T15>> map15$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R,T12,T13,T14,T15>> map15$11(Function1<V,R> m){
        return u->u.map11(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R,T13,T14,T15>> map15$12(Function1<V,R> m){
        return u->u.map12(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,T14,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,T14,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R,T14,T15>> map15$13(Function1<V,R> m){
        return u->u.map13(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,V,T15,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,V,T15>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R,T15>> map15$14(Function1<V,R> m){
        return u->u.map14(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,V,R> Function1<Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,V>,Tuple15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R>> map15$15(Function1<V,R> m){
        return u->u.map15(m);
    }

    static <V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<V,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<R,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$1(Function1<V,R> m){
        return u->u.map1(m);
    }

    static <T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,V,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,R,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$2(Function1<V,R> m){
        return u->u.map2(m);
    }

    static <T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,V,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,R,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$3(Function1<V,R> m){
        return u->u.map3(m);
    }

    static <T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,V,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,R,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$4(Function1<V,R> m){
        return u->u.map4(m);
    }

    static <T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,V,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,R,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$5(Function1<V,R> m){
        return u->u.map5(m);
    }

    static <T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,V,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,R,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$6(Function1<V,R> m){
        return u->u.map6(m);
    }

    static <T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,V,T8,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,R,T8,T9,T10,T11,T12,T13,T14,T15,T16>> map16$7(Function1<V,R> m){
        return u->u.map7(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,V,T9,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,R,T9,T10,T11,T12,T13,T14,T15,T16>> map16$8(Function1<V,R> m){
        return u->u.map8(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,V,T10,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,R,T10,T11,T12,T13,T14,T15,T16>> map16$9(Function1<V,R> m){
        return u->u.map9(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,V,T11,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,R,T11,T12,T13,T14,T15,T16>> map16$10(Function1<V,R> m){
        return u->u.map10(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,V,T12,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R,T12,T13,T14,T15,T16>> map16$11(Function1<V,R> m){
        return u->u.map11(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,V,T13,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R,T13,T14,T15,T16>> map16$12(Function1<V,R> m){
        return u->u.map12(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,T14,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,V,T14,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R,T14,T15,T16>> map16$13(Function1<V,R> m){
        return u->u.map13(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,V,T15,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,V,T15,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R,T15,T16>> map16$14(Function1<V,R> m){
        return u->u.map14(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,V,T16,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,V,T16>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R,T16>> map16$15(Function1<V,R> m){
        return u->u.map15(m);
    }

    static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,V,R> Function1<Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,V>,Tuple16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R>> map16$16(Function1<V,R> m){
        return u->u.map16(m);
    }
}