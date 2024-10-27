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
    static U2II tuple(int v1,int v2){
        return U2II.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2II  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }

       public static U2II of(int v1,int v2){
            return new U2II(v1,v2);
        }
        public U2II(int v1,int v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2II(Tuple2<Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2IB tuple(int v1,boolean v2){
        return U2IB.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2IB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }

       public static U2IB of(int v1,boolean v2){
            return new U2IB(v1,v2);
        }
        public U2IB(int v1,boolean v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2IB(Tuple2<Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2ID tuple(int v1,double v2){
        return U2ID.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2ID  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }

       public static U2ID of(int v1,double v2){
            return new U2ID(v1,v2);
        }
        public U2ID(int v1,double v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2ID(Tuple2<Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2IL tuple(int v1,long v2){
        return U2IL.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2IL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }

       public static U2IL of(int v1,long v2){
            return new U2IL(v1,v2);
        }
        public U2IL(int v1,long v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2IL(Tuple2<Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2BI tuple(boolean v1,int v2){
        return U2BI.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2BI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }

       public static U2BI of(boolean v1,int v2){
            return new U2BI(v1,v2);
        }
        public U2BI(boolean v1,int v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2BI(Tuple2<Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2BB tuple(boolean v1,boolean v2){
        return U2BB.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2BB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }

       public static U2BB of(boolean v1,boolean v2){
            return new U2BB(v1,v2);
        }
        public U2BB(boolean v1,boolean v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2BB(Tuple2<Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2BD tuple(boolean v1,double v2){
        return U2BD.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2BD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }

       public static U2BD of(boolean v1,double v2){
            return new U2BD(v1,v2);
        }
        public U2BD(boolean v1,double v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2BD(Tuple2<Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2BL tuple(boolean v1,long v2){
        return U2BL.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2BL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }

       public static U2BL of(boolean v1,long v2){
            return new U2BL(v1,v2);
        }
        public U2BL(boolean v1,long v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2BL(Tuple2<Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2DI tuple(double v1,int v2){
        return U2DI.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2DI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }

       public static U2DI of(double v1,int v2){
            return new U2DI(v1,v2);
        }
        public U2DI(double v1,int v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2DI(Tuple2<Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2DB tuple(double v1,boolean v2){
        return U2DB.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2DB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }

       public static U2DB of(double v1,boolean v2){
            return new U2DB(v1,v2);
        }
        public U2DB(double v1,boolean v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2DB(Tuple2<Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2DD tuple(double v1,double v2){
        return U2DD.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2DD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }

       public static U2DD of(double v1,double v2){
            return new U2DD(v1,v2);
        }
        public U2DD(double v1,double v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2DD(Tuple2<Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Double,Double> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2DL tuple(double v1,long v2){
        return U2DL.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2DL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }

       public static U2DL of(double v1,long v2){
            return new U2DL(v1,v2);
        }
        public U2DL(double v1,long v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2DL(Tuple2<Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Double,Long> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2LI tuple(long v1,int v2){
        return U2LI.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2LI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }

       public static U2LI of(long v1,int v2){
            return new U2LI(v1,v2);
        }
        public U2LI(long v1,int v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2LI(Tuple2<Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2LB tuple(long v1,boolean v2){
        return U2LB.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2LB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }

       public static U2LB of(long v1,boolean v2){
            return new U2LB(v1,v2);
        }
        public U2LB(long v1,boolean v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2LB(Tuple2<Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2LD tuple(long v1,double v2){
        return U2LD.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2LD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }

       public static U2LD of(long v1,double v2){
            return new U2LD(v1,v2);
        }
        public U2LD(long v1,double v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2LD(Tuple2<Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Long,Double> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U2LL tuple(long v1,long v2){
        return U2LL.of(v1,v2);
    }
    @EqualsAndHashCode
    class U2LL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }

       public static U2LL of(long v1,long v2){
            return new U2LL(v1,v2);
        }
        public U2LL(long v1,long v2){
            this.v1=v1;
            this.v2=v2;
        }
        public U2LL(Tuple2<Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2};
        }

        @Override
        public int degree() {
            return 2;
        }
        public Tuple2<Long,Long> toTuple(){
            return Tuple.tuple(v1,v2);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3III tuple(int v1,int v2,int v3){
        return U3III.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3III  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3III of(int v1,int v2,int v3){
            return new U3III(v1,v2,v3);
        }
        public U3III(int v1,int v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3III(Tuple3<Integer,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IIB tuple(int v1,int v2,boolean v3){
        return U3IIB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IIB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3IIB of(int v1,int v2,boolean v3){
            return new U3IIB(v1,v2,v3);
        }
        public U3IIB(int v1,int v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IIB(Tuple3<Integer,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IID tuple(int v1,int v2,double v3){
        return U3IID.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IID  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3IID of(int v1,int v2,double v3){
            return new U3IID(v1,v2,v3);
        }
        public U3IID(int v1,int v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IID(Tuple3<Integer,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IIL tuple(int v1,int v2,long v3){
        return U3IIL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IIL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3IIL of(int v1,int v2,long v3){
            return new U3IIL(v1,v2,v3);
        }
        public U3IIL(int v1,int v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IIL(Tuple3<Integer,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IBI tuple(int v1,boolean v2,int v3){
        return U3IBI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IBI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3IBI of(int v1,boolean v2,int v3){
            return new U3IBI(v1,v2,v3);
        }
        public U3IBI(int v1,boolean v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IBI(Tuple3<Integer,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IBB tuple(int v1,boolean v2,boolean v3){
        return U3IBB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IBB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3IBB of(int v1,boolean v2,boolean v3){
            return new U3IBB(v1,v2,v3);
        }
        public U3IBB(int v1,boolean v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IBB(Tuple3<Integer,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IBD tuple(int v1,boolean v2,double v3){
        return U3IBD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IBD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3IBD of(int v1,boolean v2,double v3){
            return new U3IBD(v1,v2,v3);
        }
        public U3IBD(int v1,boolean v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IBD(Tuple3<Integer,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IBL tuple(int v1,boolean v2,long v3){
        return U3IBL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IBL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3IBL of(int v1,boolean v2,long v3){
            return new U3IBL(v1,v2,v3);
        }
        public U3IBL(int v1,boolean v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IBL(Tuple3<Integer,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IDI tuple(int v1,double v2,int v3){
        return U3IDI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IDI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3IDI of(int v1,double v2,int v3){
            return new U3IDI(v1,v2,v3);
        }
        public U3IDI(int v1,double v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IDI(Tuple3<Integer,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IDB tuple(int v1,double v2,boolean v3){
        return U3IDB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IDB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3IDB of(int v1,double v2,boolean v3){
            return new U3IDB(v1,v2,v3);
        }
        public U3IDB(int v1,double v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IDB(Tuple3<Integer,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IDD tuple(int v1,double v2,double v3){
        return U3IDD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IDD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3IDD of(int v1,double v2,double v3){
            return new U3IDD(v1,v2,v3);
        }
        public U3IDD(int v1,double v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IDD(Tuple3<Integer,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3IDL tuple(int v1,double v2,long v3){
        return U3IDL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3IDL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3IDL of(int v1,double v2,long v3){
            return new U3IDL(v1,v2,v3);
        }
        public U3IDL(int v1,double v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3IDL(Tuple3<Integer,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3ILI tuple(int v1,long v2,int v3){
        return U3ILI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3ILI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3ILI of(int v1,long v2,int v3){
            return new U3ILI(v1,v2,v3);
        }
        public U3ILI(int v1,long v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3ILI(Tuple3<Integer,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3ILB tuple(int v1,long v2,boolean v3){
        return U3ILB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3ILB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3ILB of(int v1,long v2,boolean v3){
            return new U3ILB(v1,v2,v3);
        }
        public U3ILB(int v1,long v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3ILB(Tuple3<Integer,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3ILD tuple(int v1,long v2,double v3){
        return U3ILD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3ILD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3ILD of(int v1,long v2,double v3){
            return new U3ILD(v1,v2,v3);
        }
        public U3ILD(int v1,long v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3ILD(Tuple3<Integer,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3ILL tuple(int v1,long v2,long v3){
        return U3ILL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3ILL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3ILL of(int v1,long v2,long v3){
            return new U3ILL(v1,v2,v3);
        }
        public U3ILL(int v1,long v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3ILL(Tuple3<Integer,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Integer,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BII tuple(boolean v1,int v2,int v3){
        return U3BII.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BII  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3BII of(boolean v1,int v2,int v3){
            return new U3BII(v1,v2,v3);
        }
        public U3BII(boolean v1,int v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BII(Tuple3<Boolean,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BIB tuple(boolean v1,int v2,boolean v3){
        return U3BIB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BIB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3BIB of(boolean v1,int v2,boolean v3){
            return new U3BIB(v1,v2,v3);
        }
        public U3BIB(boolean v1,int v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BIB(Tuple3<Boolean,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BID tuple(boolean v1,int v2,double v3){
        return U3BID.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BID  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3BID of(boolean v1,int v2,double v3){
            return new U3BID(v1,v2,v3);
        }
        public U3BID(boolean v1,int v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BID(Tuple3<Boolean,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BIL tuple(boolean v1,int v2,long v3){
        return U3BIL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BIL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3BIL of(boolean v1,int v2,long v3){
            return new U3BIL(v1,v2,v3);
        }
        public U3BIL(boolean v1,int v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BIL(Tuple3<Boolean,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BBI tuple(boolean v1,boolean v2,int v3){
        return U3BBI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BBI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3BBI of(boolean v1,boolean v2,int v3){
            return new U3BBI(v1,v2,v3);
        }
        public U3BBI(boolean v1,boolean v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BBI(Tuple3<Boolean,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BBB tuple(boolean v1,boolean v2,boolean v3){
        return U3BBB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BBB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3BBB of(boolean v1,boolean v2,boolean v3){
            return new U3BBB(v1,v2,v3);
        }
        public U3BBB(boolean v1,boolean v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BBB(Tuple3<Boolean,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BBD tuple(boolean v1,boolean v2,double v3){
        return U3BBD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BBD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3BBD of(boolean v1,boolean v2,double v3){
            return new U3BBD(v1,v2,v3);
        }
        public U3BBD(boolean v1,boolean v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BBD(Tuple3<Boolean,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BBL tuple(boolean v1,boolean v2,long v3){
        return U3BBL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BBL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3BBL of(boolean v1,boolean v2,long v3){
            return new U3BBL(v1,v2,v3);
        }
        public U3BBL(boolean v1,boolean v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BBL(Tuple3<Boolean,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BDI tuple(boolean v1,double v2,int v3){
        return U3BDI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BDI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3BDI of(boolean v1,double v2,int v3){
            return new U3BDI(v1,v2,v3);
        }
        public U3BDI(boolean v1,double v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BDI(Tuple3<Boolean,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BDB tuple(boolean v1,double v2,boolean v3){
        return U3BDB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BDB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3BDB of(boolean v1,double v2,boolean v3){
            return new U3BDB(v1,v2,v3);
        }
        public U3BDB(boolean v1,double v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BDB(Tuple3<Boolean,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BDD tuple(boolean v1,double v2,double v3){
        return U3BDD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BDD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3BDD of(boolean v1,double v2,double v3){
            return new U3BDD(v1,v2,v3);
        }
        public U3BDD(boolean v1,double v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BDD(Tuple3<Boolean,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BDL tuple(boolean v1,double v2,long v3){
        return U3BDL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BDL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3BDL of(boolean v1,double v2,long v3){
            return new U3BDL(v1,v2,v3);
        }
        public U3BDL(boolean v1,double v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BDL(Tuple3<Boolean,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BLI tuple(boolean v1,long v2,int v3){
        return U3BLI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BLI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3BLI of(boolean v1,long v2,int v3){
            return new U3BLI(v1,v2,v3);
        }
        public U3BLI(boolean v1,long v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BLI(Tuple3<Boolean,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BLB tuple(boolean v1,long v2,boolean v3){
        return U3BLB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BLB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3BLB of(boolean v1,long v2,boolean v3){
            return new U3BLB(v1,v2,v3);
        }
        public U3BLB(boolean v1,long v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BLB(Tuple3<Boolean,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BLD tuple(boolean v1,long v2,double v3){
        return U3BLD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BLD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3BLD of(boolean v1,long v2,double v3){
            return new U3BLD(v1,v2,v3);
        }
        public U3BLD(boolean v1,long v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BLD(Tuple3<Boolean,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3BLL tuple(boolean v1,long v2,long v3){
        return U3BLL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3BLL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3BLL of(boolean v1,long v2,long v3){
            return new U3BLL(v1,v2,v3);
        }
        public U3BLL(boolean v1,long v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3BLL(Tuple3<Boolean,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Boolean,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DII tuple(double v1,int v2,int v3){
        return U3DII.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DII  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3DII of(double v1,int v2,int v3){
            return new U3DII(v1,v2,v3);
        }
        public U3DII(double v1,int v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DII(Tuple3<Double,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DIB tuple(double v1,int v2,boolean v3){
        return U3DIB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DIB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3DIB of(double v1,int v2,boolean v3){
            return new U3DIB(v1,v2,v3);
        }
        public U3DIB(double v1,int v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DIB(Tuple3<Double,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DID tuple(double v1,int v2,double v3){
        return U3DID.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DID  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3DID of(double v1,int v2,double v3){
            return new U3DID(v1,v2,v3);
        }
        public U3DID(double v1,int v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DID(Tuple3<Double,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DIL tuple(double v1,int v2,long v3){
        return U3DIL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DIL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3DIL of(double v1,int v2,long v3){
            return new U3DIL(v1,v2,v3);
        }
        public U3DIL(double v1,int v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DIL(Tuple3<Double,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DBI tuple(double v1,boolean v2,int v3){
        return U3DBI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DBI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3DBI of(double v1,boolean v2,int v3){
            return new U3DBI(v1,v2,v3);
        }
        public U3DBI(double v1,boolean v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DBI(Tuple3<Double,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DBB tuple(double v1,boolean v2,boolean v3){
        return U3DBB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DBB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3DBB of(double v1,boolean v2,boolean v3){
            return new U3DBB(v1,v2,v3);
        }
        public U3DBB(double v1,boolean v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DBB(Tuple3<Double,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DBD tuple(double v1,boolean v2,double v3){
        return U3DBD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DBD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3DBD of(double v1,boolean v2,double v3){
            return new U3DBD(v1,v2,v3);
        }
        public U3DBD(double v1,boolean v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DBD(Tuple3<Double,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DBL tuple(double v1,boolean v2,long v3){
        return U3DBL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DBL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3DBL of(double v1,boolean v2,long v3){
            return new U3DBL(v1,v2,v3);
        }
        public U3DBL(double v1,boolean v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DBL(Tuple3<Double,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DDI tuple(double v1,double v2,int v3){
        return U3DDI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DDI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3DDI of(double v1,double v2,int v3){
            return new U3DDI(v1,v2,v3);
        }
        public U3DDI(double v1,double v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DDI(Tuple3<Double,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DDB tuple(double v1,double v2,boolean v3){
        return U3DDB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DDB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3DDB of(double v1,double v2,boolean v3){
            return new U3DDB(v1,v2,v3);
        }
        public U3DDB(double v1,double v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DDB(Tuple3<Double,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DDD tuple(double v1,double v2,double v3){
        return U3DDD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DDD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3DDD of(double v1,double v2,double v3){
            return new U3DDD(v1,v2,v3);
        }
        public U3DDD(double v1,double v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DDD(Tuple3<Double,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DDL tuple(double v1,double v2,long v3){
        return U3DDL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DDL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3DDL of(double v1,double v2,long v3){
            return new U3DDL(v1,v2,v3);
        }
        public U3DDL(double v1,double v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DDL(Tuple3<Double,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DLI tuple(double v1,long v2,int v3){
        return U3DLI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DLI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3DLI of(double v1,long v2,int v3){
            return new U3DLI(v1,v2,v3);
        }
        public U3DLI(double v1,long v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DLI(Tuple3<Double,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DLB tuple(double v1,long v2,boolean v3){
        return U3DLB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DLB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3DLB of(double v1,long v2,boolean v3){
            return new U3DLB(v1,v2,v3);
        }
        public U3DLB(double v1,long v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DLB(Tuple3<Double,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DLD tuple(double v1,long v2,double v3){
        return U3DLD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DLD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3DLD of(double v1,long v2,double v3){
            return new U3DLD(v1,v2,v3);
        }
        public U3DLD(double v1,long v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DLD(Tuple3<Double,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3DLL tuple(double v1,long v2,long v3){
        return U3DLL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3DLL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3DLL of(double v1,long v2,long v3){
            return new U3DLL(v1,v2,v3);
        }
        public U3DLL(double v1,long v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3DLL(Tuple3<Double,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Double,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LII tuple(long v1,int v2,int v3){
        return U3LII.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LII  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3LII of(long v1,int v2,int v3){
            return new U3LII(v1,v2,v3);
        }
        public U3LII(long v1,int v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LII(Tuple3<Long,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LIB tuple(long v1,int v2,boolean v3){
        return U3LIB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LIB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3LIB of(long v1,int v2,boolean v3){
            return new U3LIB(v1,v2,v3);
        }
        public U3LIB(long v1,int v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LIB(Tuple3<Long,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LID tuple(long v1,int v2,double v3){
        return U3LID.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LID  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3LID of(long v1,int v2,double v3){
            return new U3LID(v1,v2,v3);
        }
        public U3LID(long v1,int v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LID(Tuple3<Long,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LIL tuple(long v1,int v2,long v3){
        return U3LIL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LIL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3LIL of(long v1,int v2,long v3){
            return new U3LIL(v1,v2,v3);
        }
        public U3LIL(long v1,int v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LIL(Tuple3<Long,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LBI tuple(long v1,boolean v2,int v3){
        return U3LBI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LBI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3LBI of(long v1,boolean v2,int v3){
            return new U3LBI(v1,v2,v3);
        }
        public U3LBI(long v1,boolean v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LBI(Tuple3<Long,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LBB tuple(long v1,boolean v2,boolean v3){
        return U3LBB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LBB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3LBB of(long v1,boolean v2,boolean v3){
            return new U3LBB(v1,v2,v3);
        }
        public U3LBB(long v1,boolean v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LBB(Tuple3<Long,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LBD tuple(long v1,boolean v2,double v3){
        return U3LBD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LBD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3LBD of(long v1,boolean v2,double v3){
            return new U3LBD(v1,v2,v3);
        }
        public U3LBD(long v1,boolean v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LBD(Tuple3<Long,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LBL tuple(long v1,boolean v2,long v3){
        return U3LBL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LBL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3LBL of(long v1,boolean v2,long v3){
            return new U3LBL(v1,v2,v3);
        }
        public U3LBL(long v1,boolean v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LBL(Tuple3<Long,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LDI tuple(long v1,double v2,int v3){
        return U3LDI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LDI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3LDI of(long v1,double v2,int v3){
            return new U3LDI(v1,v2,v3);
        }
        public U3LDI(long v1,double v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LDI(Tuple3<Long,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LDB tuple(long v1,double v2,boolean v3){
        return U3LDB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LDB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3LDB of(long v1,double v2,boolean v3){
            return new U3LDB(v1,v2,v3);
        }
        public U3LDB(long v1,double v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LDB(Tuple3<Long,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LDD tuple(long v1,double v2,double v3){
        return U3LDD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LDD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3LDD of(long v1,double v2,double v3){
            return new U3LDD(v1,v2,v3);
        }
        public U3LDD(long v1,double v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LDD(Tuple3<Long,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LDL tuple(long v1,double v2,long v3){
        return U3LDL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LDL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3LDL of(long v1,double v2,long v3){
            return new U3LDL(v1,v2,v3);
        }
        public U3LDL(long v1,double v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LDL(Tuple3<Long,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LLI tuple(long v1,long v2,int v3){
        return U3LLI.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LLI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }

       public static U3LLI of(long v1,long v2,int v3){
            return new U3LLI(v1,v2,v3);
        }
        public U3LLI(long v1,long v2,int v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LLI(Tuple3<Long,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LLB tuple(long v1,long v2,boolean v3){
        return U3LLB.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LLB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }

       public static U3LLB of(long v1,long v2,boolean v3){
            return new U3LLB(v1,v2,v3);
        }
        public U3LLB(long v1,long v2,boolean v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LLB(Tuple3<Long,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LLD tuple(long v1,long v2,double v3){
        return U3LLD.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LLD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }

       public static U3LLD of(long v1,long v2,double v3){
            return new U3LLD(v1,v2,v3);
        }
        public U3LLD(long v1,long v2,double v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LLD(Tuple3<Long,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U3LLL tuple(long v1,long v2,long v3){
        return U3LLL.of(v1,v2,v3);
    }
    @EqualsAndHashCode
    class U3LLL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }

       public static U3LLL of(long v1,long v2,long v3){
            return new U3LLL(v1,v2,v3);
        }
        public U3LLL(long v1,long v2,long v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }
        public U3LLL(Tuple3<Long,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3};
        }

        @Override
        public int degree() {
            return 3;
        }
        public Tuple3<Long,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIII tuple(int v1,int v2,int v3,int v4){
        return U4IIII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIII  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IIII of(int v1,int v2,int v3,int v4){
            return new U4IIII(v1,v2,v3,v4);
        }
        public U4IIII(int v1,int v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIII(Tuple4<Integer,Integer,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIIB tuple(int v1,int v2,int v3,boolean v4){
        return U4IIIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIIB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IIIB of(int v1,int v2,int v3,boolean v4){
            return new U4IIIB(v1,v2,v3,v4);
        }
        public U4IIIB(int v1,int v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIIB(Tuple4<Integer,Integer,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIID tuple(int v1,int v2,int v3,double v4){
        return U4IIID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIID  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IIID of(int v1,int v2,int v3,double v4){
            return new U4IIID(v1,v2,v3,v4);
        }
        public U4IIID(int v1,int v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIID(Tuple4<Integer,Integer,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIIL tuple(int v1,int v2,int v3,long v4){
        return U4IIIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIIL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IIIL of(int v1,int v2,int v3,long v4){
            return new U4IIIL(v1,v2,v3,v4);
        }
        public U4IIIL(int v1,int v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIIL(Tuple4<Integer,Integer,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIBI tuple(int v1,int v2,boolean v3,int v4){
        return U4IIBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIBI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IIBI of(int v1,int v2,boolean v3,int v4){
            return new U4IIBI(v1,v2,v3,v4);
        }
        public U4IIBI(int v1,int v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIBI(Tuple4<Integer,Integer,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIBB tuple(int v1,int v2,boolean v3,boolean v4){
        return U4IIBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIBB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IIBB of(int v1,int v2,boolean v3,boolean v4){
            return new U4IIBB(v1,v2,v3,v4);
        }
        public U4IIBB(int v1,int v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIBB(Tuple4<Integer,Integer,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIBD tuple(int v1,int v2,boolean v3,double v4){
        return U4IIBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIBD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IIBD of(int v1,int v2,boolean v3,double v4){
            return new U4IIBD(v1,v2,v3,v4);
        }
        public U4IIBD(int v1,int v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIBD(Tuple4<Integer,Integer,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIBL tuple(int v1,int v2,boolean v3,long v4){
        return U4IIBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIBL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IIBL of(int v1,int v2,boolean v3,long v4){
            return new U4IIBL(v1,v2,v3,v4);
        }
        public U4IIBL(int v1,int v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIBL(Tuple4<Integer,Integer,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIDI tuple(int v1,int v2,double v3,int v4){
        return U4IIDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIDI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IIDI of(int v1,int v2,double v3,int v4){
            return new U4IIDI(v1,v2,v3,v4);
        }
        public U4IIDI(int v1,int v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIDI(Tuple4<Integer,Integer,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIDB tuple(int v1,int v2,double v3,boolean v4){
        return U4IIDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIDB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IIDB of(int v1,int v2,double v3,boolean v4){
            return new U4IIDB(v1,v2,v3,v4);
        }
        public U4IIDB(int v1,int v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIDB(Tuple4<Integer,Integer,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIDD tuple(int v1,int v2,double v3,double v4){
        return U4IIDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIDD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IIDD of(int v1,int v2,double v3,double v4){
            return new U4IIDD(v1,v2,v3,v4);
        }
        public U4IIDD(int v1,int v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIDD(Tuple4<Integer,Integer,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IIDL tuple(int v1,int v2,double v3,long v4){
        return U4IIDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IIDL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IIDL of(int v1,int v2,double v3,long v4){
            return new U4IIDL(v1,v2,v3,v4);
        }
        public U4IIDL(int v1,int v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IIDL(Tuple4<Integer,Integer,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IILI tuple(int v1,int v2,long v3,int v4){
        return U4IILI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IILI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IILI of(int v1,int v2,long v3,int v4){
            return new U4IILI(v1,v2,v3,v4);
        }
        public U4IILI(int v1,int v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IILI(Tuple4<Integer,Integer,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IILB tuple(int v1,int v2,long v3,boolean v4){
        return U4IILB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IILB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IILB of(int v1,int v2,long v3,boolean v4){
            return new U4IILB(v1,v2,v3,v4);
        }
        public U4IILB(int v1,int v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IILB(Tuple4<Integer,Integer,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IILD tuple(int v1,int v2,long v3,double v4){
        return U4IILD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IILD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IILD of(int v1,int v2,long v3,double v4){
            return new U4IILD(v1,v2,v3,v4);
        }
        public U4IILD(int v1,int v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IILD(Tuple4<Integer,Integer,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IILL tuple(int v1,int v2,long v3,long v4){
        return U4IILL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IILL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IILL of(int v1,int v2,long v3,long v4){
            return new U4IILL(v1,v2,v3,v4);
        }
        public U4IILL(int v1,int v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IILL(Tuple4<Integer,Integer,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Integer,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBII tuple(int v1,boolean v2,int v3,int v4){
        return U4IBII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBII  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IBII of(int v1,boolean v2,int v3,int v4){
            return new U4IBII(v1,v2,v3,v4);
        }
        public U4IBII(int v1,boolean v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBII(Tuple4<Integer,Boolean,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBIB tuple(int v1,boolean v2,int v3,boolean v4){
        return U4IBIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBIB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IBIB of(int v1,boolean v2,int v3,boolean v4){
            return new U4IBIB(v1,v2,v3,v4);
        }
        public U4IBIB(int v1,boolean v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBIB(Tuple4<Integer,Boolean,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBID tuple(int v1,boolean v2,int v3,double v4){
        return U4IBID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBID  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IBID of(int v1,boolean v2,int v3,double v4){
            return new U4IBID(v1,v2,v3,v4);
        }
        public U4IBID(int v1,boolean v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBID(Tuple4<Integer,Boolean,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBIL tuple(int v1,boolean v2,int v3,long v4){
        return U4IBIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBIL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IBIL of(int v1,boolean v2,int v3,long v4){
            return new U4IBIL(v1,v2,v3,v4);
        }
        public U4IBIL(int v1,boolean v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBIL(Tuple4<Integer,Boolean,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBBI tuple(int v1,boolean v2,boolean v3,int v4){
        return U4IBBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBBI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IBBI of(int v1,boolean v2,boolean v3,int v4){
            return new U4IBBI(v1,v2,v3,v4);
        }
        public U4IBBI(int v1,boolean v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBBI(Tuple4<Integer,Boolean,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBBB tuple(int v1,boolean v2,boolean v3,boolean v4){
        return U4IBBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBBB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IBBB of(int v1,boolean v2,boolean v3,boolean v4){
            return new U4IBBB(v1,v2,v3,v4);
        }
        public U4IBBB(int v1,boolean v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBBB(Tuple4<Integer,Boolean,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBBD tuple(int v1,boolean v2,boolean v3,double v4){
        return U4IBBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBBD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IBBD of(int v1,boolean v2,boolean v3,double v4){
            return new U4IBBD(v1,v2,v3,v4);
        }
        public U4IBBD(int v1,boolean v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBBD(Tuple4<Integer,Boolean,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBBL tuple(int v1,boolean v2,boolean v3,long v4){
        return U4IBBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBBL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IBBL of(int v1,boolean v2,boolean v3,long v4){
            return new U4IBBL(v1,v2,v3,v4);
        }
        public U4IBBL(int v1,boolean v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBBL(Tuple4<Integer,Boolean,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBDI tuple(int v1,boolean v2,double v3,int v4){
        return U4IBDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBDI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IBDI of(int v1,boolean v2,double v3,int v4){
            return new U4IBDI(v1,v2,v3,v4);
        }
        public U4IBDI(int v1,boolean v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBDI(Tuple4<Integer,Boolean,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBDB tuple(int v1,boolean v2,double v3,boolean v4){
        return U4IBDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBDB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IBDB of(int v1,boolean v2,double v3,boolean v4){
            return new U4IBDB(v1,v2,v3,v4);
        }
        public U4IBDB(int v1,boolean v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBDB(Tuple4<Integer,Boolean,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBDD tuple(int v1,boolean v2,double v3,double v4){
        return U4IBDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBDD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IBDD of(int v1,boolean v2,double v3,double v4){
            return new U4IBDD(v1,v2,v3,v4);
        }
        public U4IBDD(int v1,boolean v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBDD(Tuple4<Integer,Boolean,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBDL tuple(int v1,boolean v2,double v3,long v4){
        return U4IBDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBDL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IBDL of(int v1,boolean v2,double v3,long v4){
            return new U4IBDL(v1,v2,v3,v4);
        }
        public U4IBDL(int v1,boolean v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBDL(Tuple4<Integer,Boolean,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBLI tuple(int v1,boolean v2,long v3,int v4){
        return U4IBLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBLI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IBLI of(int v1,boolean v2,long v3,int v4){
            return new U4IBLI(v1,v2,v3,v4);
        }
        public U4IBLI(int v1,boolean v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBLI(Tuple4<Integer,Boolean,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBLB tuple(int v1,boolean v2,long v3,boolean v4){
        return U4IBLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBLB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IBLB of(int v1,boolean v2,long v3,boolean v4){
            return new U4IBLB(v1,v2,v3,v4);
        }
        public U4IBLB(int v1,boolean v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBLB(Tuple4<Integer,Boolean,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBLD tuple(int v1,boolean v2,long v3,double v4){
        return U4IBLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBLD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IBLD of(int v1,boolean v2,long v3,double v4){
            return new U4IBLD(v1,v2,v3,v4);
        }
        public U4IBLD(int v1,boolean v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBLD(Tuple4<Integer,Boolean,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IBLL tuple(int v1,boolean v2,long v3,long v4){
        return U4IBLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IBLL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IBLL of(int v1,boolean v2,long v3,long v4){
            return new U4IBLL(v1,v2,v3,v4);
        }
        public U4IBLL(int v1,boolean v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IBLL(Tuple4<Integer,Boolean,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Boolean,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDII tuple(int v1,double v2,int v3,int v4){
        return U4IDII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDII  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IDII of(int v1,double v2,int v3,int v4){
            return new U4IDII(v1,v2,v3,v4);
        }
        public U4IDII(int v1,double v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDII(Tuple4<Integer,Double,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDIB tuple(int v1,double v2,int v3,boolean v4){
        return U4IDIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDIB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IDIB of(int v1,double v2,int v3,boolean v4){
            return new U4IDIB(v1,v2,v3,v4);
        }
        public U4IDIB(int v1,double v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDIB(Tuple4<Integer,Double,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDID tuple(int v1,double v2,int v3,double v4){
        return U4IDID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDID  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IDID of(int v1,double v2,int v3,double v4){
            return new U4IDID(v1,v2,v3,v4);
        }
        public U4IDID(int v1,double v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDID(Tuple4<Integer,Double,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDIL tuple(int v1,double v2,int v3,long v4){
        return U4IDIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDIL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IDIL of(int v1,double v2,int v3,long v4){
            return new U4IDIL(v1,v2,v3,v4);
        }
        public U4IDIL(int v1,double v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDIL(Tuple4<Integer,Double,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDBI tuple(int v1,double v2,boolean v3,int v4){
        return U4IDBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDBI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IDBI of(int v1,double v2,boolean v3,int v4){
            return new U4IDBI(v1,v2,v3,v4);
        }
        public U4IDBI(int v1,double v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDBI(Tuple4<Integer,Double,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDBB tuple(int v1,double v2,boolean v3,boolean v4){
        return U4IDBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDBB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IDBB of(int v1,double v2,boolean v3,boolean v4){
            return new U4IDBB(v1,v2,v3,v4);
        }
        public U4IDBB(int v1,double v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDBB(Tuple4<Integer,Double,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDBD tuple(int v1,double v2,boolean v3,double v4){
        return U4IDBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDBD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IDBD of(int v1,double v2,boolean v3,double v4){
            return new U4IDBD(v1,v2,v3,v4);
        }
        public U4IDBD(int v1,double v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDBD(Tuple4<Integer,Double,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDBL tuple(int v1,double v2,boolean v3,long v4){
        return U4IDBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDBL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IDBL of(int v1,double v2,boolean v3,long v4){
            return new U4IDBL(v1,v2,v3,v4);
        }
        public U4IDBL(int v1,double v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDBL(Tuple4<Integer,Double,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDDI tuple(int v1,double v2,double v3,int v4){
        return U4IDDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDDI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IDDI of(int v1,double v2,double v3,int v4){
            return new U4IDDI(v1,v2,v3,v4);
        }
        public U4IDDI(int v1,double v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDDI(Tuple4<Integer,Double,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDDB tuple(int v1,double v2,double v3,boolean v4){
        return U4IDDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDDB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IDDB of(int v1,double v2,double v3,boolean v4){
            return new U4IDDB(v1,v2,v3,v4);
        }
        public U4IDDB(int v1,double v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDDB(Tuple4<Integer,Double,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDDD tuple(int v1,double v2,double v3,double v4){
        return U4IDDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDDD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IDDD of(int v1,double v2,double v3,double v4){
            return new U4IDDD(v1,v2,v3,v4);
        }
        public U4IDDD(int v1,double v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDDD(Tuple4<Integer,Double,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDDL tuple(int v1,double v2,double v3,long v4){
        return U4IDDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDDL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IDDL of(int v1,double v2,double v3,long v4){
            return new U4IDDL(v1,v2,v3,v4);
        }
        public U4IDDL(int v1,double v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDDL(Tuple4<Integer,Double,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDLI tuple(int v1,double v2,long v3,int v4){
        return U4IDLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDLI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4IDLI of(int v1,double v2,long v3,int v4){
            return new U4IDLI(v1,v2,v3,v4);
        }
        public U4IDLI(int v1,double v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDLI(Tuple4<Integer,Double,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDLB tuple(int v1,double v2,long v3,boolean v4){
        return U4IDLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDLB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4IDLB of(int v1,double v2,long v3,boolean v4){
            return new U4IDLB(v1,v2,v3,v4);
        }
        public U4IDLB(int v1,double v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDLB(Tuple4<Integer,Double,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDLD tuple(int v1,double v2,long v3,double v4){
        return U4IDLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDLD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4IDLD of(int v1,double v2,long v3,double v4){
            return new U4IDLD(v1,v2,v3,v4);
        }
        public U4IDLD(int v1,double v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDLD(Tuple4<Integer,Double,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4IDLL tuple(int v1,double v2,long v3,long v4){
        return U4IDLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4IDLL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4IDLL of(int v1,double v2,long v3,long v4){
            return new U4IDLL(v1,v2,v3,v4);
        }
        public U4IDLL(int v1,double v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4IDLL(Tuple4<Integer,Double,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Double,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILII tuple(int v1,long v2,int v3,int v4){
        return U4ILII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILII  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4ILII of(int v1,long v2,int v3,int v4){
            return new U4ILII(v1,v2,v3,v4);
        }
        public U4ILII(int v1,long v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILII(Tuple4<Integer,Long,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILIB tuple(int v1,long v2,int v3,boolean v4){
        return U4ILIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILIB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4ILIB of(int v1,long v2,int v3,boolean v4){
            return new U4ILIB(v1,v2,v3,v4);
        }
        public U4ILIB(int v1,long v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILIB(Tuple4<Integer,Long,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILID tuple(int v1,long v2,int v3,double v4){
        return U4ILID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILID  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4ILID of(int v1,long v2,int v3,double v4){
            return new U4ILID(v1,v2,v3,v4);
        }
        public U4ILID(int v1,long v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILID(Tuple4<Integer,Long,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILIL tuple(int v1,long v2,int v3,long v4){
        return U4ILIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILIL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4ILIL of(int v1,long v2,int v3,long v4){
            return new U4ILIL(v1,v2,v3,v4);
        }
        public U4ILIL(int v1,long v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILIL(Tuple4<Integer,Long,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILBI tuple(int v1,long v2,boolean v3,int v4){
        return U4ILBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILBI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4ILBI of(int v1,long v2,boolean v3,int v4){
            return new U4ILBI(v1,v2,v3,v4);
        }
        public U4ILBI(int v1,long v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILBI(Tuple4<Integer,Long,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILBB tuple(int v1,long v2,boolean v3,boolean v4){
        return U4ILBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILBB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4ILBB of(int v1,long v2,boolean v3,boolean v4){
            return new U4ILBB(v1,v2,v3,v4);
        }
        public U4ILBB(int v1,long v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILBB(Tuple4<Integer,Long,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILBD tuple(int v1,long v2,boolean v3,double v4){
        return U4ILBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILBD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4ILBD of(int v1,long v2,boolean v3,double v4){
            return new U4ILBD(v1,v2,v3,v4);
        }
        public U4ILBD(int v1,long v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILBD(Tuple4<Integer,Long,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILBL tuple(int v1,long v2,boolean v3,long v4){
        return U4ILBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILBL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4ILBL of(int v1,long v2,boolean v3,long v4){
            return new U4ILBL(v1,v2,v3,v4);
        }
        public U4ILBL(int v1,long v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILBL(Tuple4<Integer,Long,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILDI tuple(int v1,long v2,double v3,int v4){
        return U4ILDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILDI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4ILDI of(int v1,long v2,double v3,int v4){
            return new U4ILDI(v1,v2,v3,v4);
        }
        public U4ILDI(int v1,long v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILDI(Tuple4<Integer,Long,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILDB tuple(int v1,long v2,double v3,boolean v4){
        return U4ILDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILDB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4ILDB of(int v1,long v2,double v3,boolean v4){
            return new U4ILDB(v1,v2,v3,v4);
        }
        public U4ILDB(int v1,long v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILDB(Tuple4<Integer,Long,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILDD tuple(int v1,long v2,double v3,double v4){
        return U4ILDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILDD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4ILDD of(int v1,long v2,double v3,double v4){
            return new U4ILDD(v1,v2,v3,v4);
        }
        public U4ILDD(int v1,long v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILDD(Tuple4<Integer,Long,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILDL tuple(int v1,long v2,double v3,long v4){
        return U4ILDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILDL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4ILDL of(int v1,long v2,double v3,long v4){
            return new U4ILDL(v1,v2,v3,v4);
        }
        public U4ILDL(int v1,long v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILDL(Tuple4<Integer,Long,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILLI tuple(int v1,long v2,long v3,int v4){
        return U4ILLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILLI  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4ILLI of(int v1,long v2,long v3,int v4){
            return new U4ILLI(v1,v2,v3,v4);
        }
        public U4ILLI(int v1,long v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILLI(Tuple4<Integer,Long,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILLB tuple(int v1,long v2,long v3,boolean v4){
        return U4ILLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILLB  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4ILLB of(int v1,long v2,long v3,boolean v4){
            return new U4ILLB(v1,v2,v3,v4);
        }
        public U4ILLB(int v1,long v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILLB(Tuple4<Integer,Long,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILLD tuple(int v1,long v2,long v3,double v4){
        return U4ILLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILLD  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4ILLD of(int v1,long v2,long v3,double v4){
            return new U4ILLD(v1,v2,v3,v4);
        }
        public U4ILLD(int v1,long v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILLD(Tuple4<Integer,Long,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4ILLL tuple(int v1,long v2,long v3,long v4){
        return U4ILLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4ILLL  implements PTuple {
        public final int v1;
    public final int v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4ILLL of(int v1,long v2,long v3,long v4){
            return new U4ILLL(v1,v2,v3,v4);
        }
        public U4ILLL(int v1,long v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4ILLL(Tuple4<Integer,Long,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Integer,Long,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIII tuple(boolean v1,int v2,int v3,int v4){
        return U4BIII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIII  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BIII of(boolean v1,int v2,int v3,int v4){
            return new U4BIII(v1,v2,v3,v4);
        }
        public U4BIII(boolean v1,int v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIII(Tuple4<Boolean,Integer,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIIB tuple(boolean v1,int v2,int v3,boolean v4){
        return U4BIIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIIB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BIIB of(boolean v1,int v2,int v3,boolean v4){
            return new U4BIIB(v1,v2,v3,v4);
        }
        public U4BIIB(boolean v1,int v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIIB(Tuple4<Boolean,Integer,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIID tuple(boolean v1,int v2,int v3,double v4){
        return U4BIID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIID  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BIID of(boolean v1,int v2,int v3,double v4){
            return new U4BIID(v1,v2,v3,v4);
        }
        public U4BIID(boolean v1,int v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIID(Tuple4<Boolean,Integer,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIIL tuple(boolean v1,int v2,int v3,long v4){
        return U4BIIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIIL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BIIL of(boolean v1,int v2,int v3,long v4){
            return new U4BIIL(v1,v2,v3,v4);
        }
        public U4BIIL(boolean v1,int v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIIL(Tuple4<Boolean,Integer,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIBI tuple(boolean v1,int v2,boolean v3,int v4){
        return U4BIBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIBI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BIBI of(boolean v1,int v2,boolean v3,int v4){
            return new U4BIBI(v1,v2,v3,v4);
        }
        public U4BIBI(boolean v1,int v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIBI(Tuple4<Boolean,Integer,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIBB tuple(boolean v1,int v2,boolean v3,boolean v4){
        return U4BIBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIBB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BIBB of(boolean v1,int v2,boolean v3,boolean v4){
            return new U4BIBB(v1,v2,v3,v4);
        }
        public U4BIBB(boolean v1,int v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIBB(Tuple4<Boolean,Integer,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIBD tuple(boolean v1,int v2,boolean v3,double v4){
        return U4BIBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIBD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BIBD of(boolean v1,int v2,boolean v3,double v4){
            return new U4BIBD(v1,v2,v3,v4);
        }
        public U4BIBD(boolean v1,int v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIBD(Tuple4<Boolean,Integer,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIBL tuple(boolean v1,int v2,boolean v3,long v4){
        return U4BIBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIBL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BIBL of(boolean v1,int v2,boolean v3,long v4){
            return new U4BIBL(v1,v2,v3,v4);
        }
        public U4BIBL(boolean v1,int v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIBL(Tuple4<Boolean,Integer,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIDI tuple(boolean v1,int v2,double v3,int v4){
        return U4BIDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIDI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BIDI of(boolean v1,int v2,double v3,int v4){
            return new U4BIDI(v1,v2,v3,v4);
        }
        public U4BIDI(boolean v1,int v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIDI(Tuple4<Boolean,Integer,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIDB tuple(boolean v1,int v2,double v3,boolean v4){
        return U4BIDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIDB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BIDB of(boolean v1,int v2,double v3,boolean v4){
            return new U4BIDB(v1,v2,v3,v4);
        }
        public U4BIDB(boolean v1,int v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIDB(Tuple4<Boolean,Integer,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIDD tuple(boolean v1,int v2,double v3,double v4){
        return U4BIDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIDD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BIDD of(boolean v1,int v2,double v3,double v4){
            return new U4BIDD(v1,v2,v3,v4);
        }
        public U4BIDD(boolean v1,int v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIDD(Tuple4<Boolean,Integer,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BIDL tuple(boolean v1,int v2,double v3,long v4){
        return U4BIDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BIDL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BIDL of(boolean v1,int v2,double v3,long v4){
            return new U4BIDL(v1,v2,v3,v4);
        }
        public U4BIDL(boolean v1,int v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BIDL(Tuple4<Boolean,Integer,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BILI tuple(boolean v1,int v2,long v3,int v4){
        return U4BILI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BILI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BILI of(boolean v1,int v2,long v3,int v4){
            return new U4BILI(v1,v2,v3,v4);
        }
        public U4BILI(boolean v1,int v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BILI(Tuple4<Boolean,Integer,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BILB tuple(boolean v1,int v2,long v3,boolean v4){
        return U4BILB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BILB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BILB of(boolean v1,int v2,long v3,boolean v4){
            return new U4BILB(v1,v2,v3,v4);
        }
        public U4BILB(boolean v1,int v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BILB(Tuple4<Boolean,Integer,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BILD tuple(boolean v1,int v2,long v3,double v4){
        return U4BILD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BILD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BILD of(boolean v1,int v2,long v3,double v4){
            return new U4BILD(v1,v2,v3,v4);
        }
        public U4BILD(boolean v1,int v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BILD(Tuple4<Boolean,Integer,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BILL tuple(boolean v1,int v2,long v3,long v4){
        return U4BILL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BILL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BILL of(boolean v1,int v2,long v3,long v4){
            return new U4BILL(v1,v2,v3,v4);
        }
        public U4BILL(boolean v1,int v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BILL(Tuple4<Boolean,Integer,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Integer,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBII tuple(boolean v1,boolean v2,int v3,int v4){
        return U4BBII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBII  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BBII of(boolean v1,boolean v2,int v3,int v4){
            return new U4BBII(v1,v2,v3,v4);
        }
        public U4BBII(boolean v1,boolean v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBII(Tuple4<Boolean,Boolean,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBIB tuple(boolean v1,boolean v2,int v3,boolean v4){
        return U4BBIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBIB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BBIB of(boolean v1,boolean v2,int v3,boolean v4){
            return new U4BBIB(v1,v2,v3,v4);
        }
        public U4BBIB(boolean v1,boolean v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBIB(Tuple4<Boolean,Boolean,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBID tuple(boolean v1,boolean v2,int v3,double v4){
        return U4BBID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBID  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BBID of(boolean v1,boolean v2,int v3,double v4){
            return new U4BBID(v1,v2,v3,v4);
        }
        public U4BBID(boolean v1,boolean v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBID(Tuple4<Boolean,Boolean,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBIL tuple(boolean v1,boolean v2,int v3,long v4){
        return U4BBIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBIL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BBIL of(boolean v1,boolean v2,int v3,long v4){
            return new U4BBIL(v1,v2,v3,v4);
        }
        public U4BBIL(boolean v1,boolean v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBIL(Tuple4<Boolean,Boolean,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBBI tuple(boolean v1,boolean v2,boolean v3,int v4){
        return U4BBBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBBI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BBBI of(boolean v1,boolean v2,boolean v3,int v4){
            return new U4BBBI(v1,v2,v3,v4);
        }
        public U4BBBI(boolean v1,boolean v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBBI(Tuple4<Boolean,Boolean,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBBB tuple(boolean v1,boolean v2,boolean v3,boolean v4){
        return U4BBBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBBB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BBBB of(boolean v1,boolean v2,boolean v3,boolean v4){
            return new U4BBBB(v1,v2,v3,v4);
        }
        public U4BBBB(boolean v1,boolean v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBBB(Tuple4<Boolean,Boolean,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBBD tuple(boolean v1,boolean v2,boolean v3,double v4){
        return U4BBBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBBD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BBBD of(boolean v1,boolean v2,boolean v3,double v4){
            return new U4BBBD(v1,v2,v3,v4);
        }
        public U4BBBD(boolean v1,boolean v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBBD(Tuple4<Boolean,Boolean,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBBL tuple(boolean v1,boolean v2,boolean v3,long v4){
        return U4BBBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBBL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BBBL of(boolean v1,boolean v2,boolean v3,long v4){
            return new U4BBBL(v1,v2,v3,v4);
        }
        public U4BBBL(boolean v1,boolean v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBBL(Tuple4<Boolean,Boolean,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBDI tuple(boolean v1,boolean v2,double v3,int v4){
        return U4BBDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBDI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BBDI of(boolean v1,boolean v2,double v3,int v4){
            return new U4BBDI(v1,v2,v3,v4);
        }
        public U4BBDI(boolean v1,boolean v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBDI(Tuple4<Boolean,Boolean,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBDB tuple(boolean v1,boolean v2,double v3,boolean v4){
        return U4BBDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBDB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BBDB of(boolean v1,boolean v2,double v3,boolean v4){
            return new U4BBDB(v1,v2,v3,v4);
        }
        public U4BBDB(boolean v1,boolean v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBDB(Tuple4<Boolean,Boolean,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBDD tuple(boolean v1,boolean v2,double v3,double v4){
        return U4BBDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBDD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BBDD of(boolean v1,boolean v2,double v3,double v4){
            return new U4BBDD(v1,v2,v3,v4);
        }
        public U4BBDD(boolean v1,boolean v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBDD(Tuple4<Boolean,Boolean,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBDL tuple(boolean v1,boolean v2,double v3,long v4){
        return U4BBDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBDL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BBDL of(boolean v1,boolean v2,double v3,long v4){
            return new U4BBDL(v1,v2,v3,v4);
        }
        public U4BBDL(boolean v1,boolean v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBDL(Tuple4<Boolean,Boolean,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBLI tuple(boolean v1,boolean v2,long v3,int v4){
        return U4BBLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBLI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BBLI of(boolean v1,boolean v2,long v3,int v4){
            return new U4BBLI(v1,v2,v3,v4);
        }
        public U4BBLI(boolean v1,boolean v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBLI(Tuple4<Boolean,Boolean,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBLB tuple(boolean v1,boolean v2,long v3,boolean v4){
        return U4BBLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBLB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BBLB of(boolean v1,boolean v2,long v3,boolean v4){
            return new U4BBLB(v1,v2,v3,v4);
        }
        public U4BBLB(boolean v1,boolean v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBLB(Tuple4<Boolean,Boolean,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBLD tuple(boolean v1,boolean v2,long v3,double v4){
        return U4BBLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBLD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BBLD of(boolean v1,boolean v2,long v3,double v4){
            return new U4BBLD(v1,v2,v3,v4);
        }
        public U4BBLD(boolean v1,boolean v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBLD(Tuple4<Boolean,Boolean,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BBLL tuple(boolean v1,boolean v2,long v3,long v4){
        return U4BBLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BBLL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BBLL of(boolean v1,boolean v2,long v3,long v4){
            return new U4BBLL(v1,v2,v3,v4);
        }
        public U4BBLL(boolean v1,boolean v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BBLL(Tuple4<Boolean,Boolean,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Boolean,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDII tuple(boolean v1,double v2,int v3,int v4){
        return U4BDII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDII  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BDII of(boolean v1,double v2,int v3,int v4){
            return new U4BDII(v1,v2,v3,v4);
        }
        public U4BDII(boolean v1,double v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDII(Tuple4<Boolean,Double,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDIB tuple(boolean v1,double v2,int v3,boolean v4){
        return U4BDIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDIB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BDIB of(boolean v1,double v2,int v3,boolean v4){
            return new U4BDIB(v1,v2,v3,v4);
        }
        public U4BDIB(boolean v1,double v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDIB(Tuple4<Boolean,Double,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDID tuple(boolean v1,double v2,int v3,double v4){
        return U4BDID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDID  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BDID of(boolean v1,double v2,int v3,double v4){
            return new U4BDID(v1,v2,v3,v4);
        }
        public U4BDID(boolean v1,double v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDID(Tuple4<Boolean,Double,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDIL tuple(boolean v1,double v2,int v3,long v4){
        return U4BDIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDIL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BDIL of(boolean v1,double v2,int v3,long v4){
            return new U4BDIL(v1,v2,v3,v4);
        }
        public U4BDIL(boolean v1,double v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDIL(Tuple4<Boolean,Double,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDBI tuple(boolean v1,double v2,boolean v3,int v4){
        return U4BDBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDBI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BDBI of(boolean v1,double v2,boolean v3,int v4){
            return new U4BDBI(v1,v2,v3,v4);
        }
        public U4BDBI(boolean v1,double v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDBI(Tuple4<Boolean,Double,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDBB tuple(boolean v1,double v2,boolean v3,boolean v4){
        return U4BDBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDBB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BDBB of(boolean v1,double v2,boolean v3,boolean v4){
            return new U4BDBB(v1,v2,v3,v4);
        }
        public U4BDBB(boolean v1,double v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDBB(Tuple4<Boolean,Double,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDBD tuple(boolean v1,double v2,boolean v3,double v4){
        return U4BDBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDBD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BDBD of(boolean v1,double v2,boolean v3,double v4){
            return new U4BDBD(v1,v2,v3,v4);
        }
        public U4BDBD(boolean v1,double v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDBD(Tuple4<Boolean,Double,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDBL tuple(boolean v1,double v2,boolean v3,long v4){
        return U4BDBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDBL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BDBL of(boolean v1,double v2,boolean v3,long v4){
            return new U4BDBL(v1,v2,v3,v4);
        }
        public U4BDBL(boolean v1,double v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDBL(Tuple4<Boolean,Double,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDDI tuple(boolean v1,double v2,double v3,int v4){
        return U4BDDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDDI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BDDI of(boolean v1,double v2,double v3,int v4){
            return new U4BDDI(v1,v2,v3,v4);
        }
        public U4BDDI(boolean v1,double v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDDI(Tuple4<Boolean,Double,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDDB tuple(boolean v1,double v2,double v3,boolean v4){
        return U4BDDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDDB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BDDB of(boolean v1,double v2,double v3,boolean v4){
            return new U4BDDB(v1,v2,v3,v4);
        }
        public U4BDDB(boolean v1,double v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDDB(Tuple4<Boolean,Double,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDDD tuple(boolean v1,double v2,double v3,double v4){
        return U4BDDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDDD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BDDD of(boolean v1,double v2,double v3,double v4){
            return new U4BDDD(v1,v2,v3,v4);
        }
        public U4BDDD(boolean v1,double v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDDD(Tuple4<Boolean,Double,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDDL tuple(boolean v1,double v2,double v3,long v4){
        return U4BDDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDDL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BDDL of(boolean v1,double v2,double v3,long v4){
            return new U4BDDL(v1,v2,v3,v4);
        }
        public U4BDDL(boolean v1,double v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDDL(Tuple4<Boolean,Double,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDLI tuple(boolean v1,double v2,long v3,int v4){
        return U4BDLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDLI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BDLI of(boolean v1,double v2,long v3,int v4){
            return new U4BDLI(v1,v2,v3,v4);
        }
        public U4BDLI(boolean v1,double v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDLI(Tuple4<Boolean,Double,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDLB tuple(boolean v1,double v2,long v3,boolean v4){
        return U4BDLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDLB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BDLB of(boolean v1,double v2,long v3,boolean v4){
            return new U4BDLB(v1,v2,v3,v4);
        }
        public U4BDLB(boolean v1,double v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDLB(Tuple4<Boolean,Double,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDLD tuple(boolean v1,double v2,long v3,double v4){
        return U4BDLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDLD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BDLD of(boolean v1,double v2,long v3,double v4){
            return new U4BDLD(v1,v2,v3,v4);
        }
        public U4BDLD(boolean v1,double v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDLD(Tuple4<Boolean,Double,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BDLL tuple(boolean v1,double v2,long v3,long v4){
        return U4BDLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BDLL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BDLL of(boolean v1,double v2,long v3,long v4){
            return new U4BDLL(v1,v2,v3,v4);
        }
        public U4BDLL(boolean v1,double v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BDLL(Tuple4<Boolean,Double,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Double,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLII tuple(boolean v1,long v2,int v3,int v4){
        return U4BLII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLII  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BLII of(boolean v1,long v2,int v3,int v4){
            return new U4BLII(v1,v2,v3,v4);
        }
        public U4BLII(boolean v1,long v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLII(Tuple4<Boolean,Long,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLIB tuple(boolean v1,long v2,int v3,boolean v4){
        return U4BLIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLIB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BLIB of(boolean v1,long v2,int v3,boolean v4){
            return new U4BLIB(v1,v2,v3,v4);
        }
        public U4BLIB(boolean v1,long v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLIB(Tuple4<Boolean,Long,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLID tuple(boolean v1,long v2,int v3,double v4){
        return U4BLID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLID  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BLID of(boolean v1,long v2,int v3,double v4){
            return new U4BLID(v1,v2,v3,v4);
        }
        public U4BLID(boolean v1,long v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLID(Tuple4<Boolean,Long,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLIL tuple(boolean v1,long v2,int v3,long v4){
        return U4BLIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLIL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BLIL of(boolean v1,long v2,int v3,long v4){
            return new U4BLIL(v1,v2,v3,v4);
        }
        public U4BLIL(boolean v1,long v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLIL(Tuple4<Boolean,Long,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLBI tuple(boolean v1,long v2,boolean v3,int v4){
        return U4BLBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLBI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BLBI of(boolean v1,long v2,boolean v3,int v4){
            return new U4BLBI(v1,v2,v3,v4);
        }
        public U4BLBI(boolean v1,long v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLBI(Tuple4<Boolean,Long,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLBB tuple(boolean v1,long v2,boolean v3,boolean v4){
        return U4BLBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLBB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BLBB of(boolean v1,long v2,boolean v3,boolean v4){
            return new U4BLBB(v1,v2,v3,v4);
        }
        public U4BLBB(boolean v1,long v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLBB(Tuple4<Boolean,Long,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLBD tuple(boolean v1,long v2,boolean v3,double v4){
        return U4BLBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLBD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BLBD of(boolean v1,long v2,boolean v3,double v4){
            return new U4BLBD(v1,v2,v3,v4);
        }
        public U4BLBD(boolean v1,long v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLBD(Tuple4<Boolean,Long,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLBL tuple(boolean v1,long v2,boolean v3,long v4){
        return U4BLBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLBL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BLBL of(boolean v1,long v2,boolean v3,long v4){
            return new U4BLBL(v1,v2,v3,v4);
        }
        public U4BLBL(boolean v1,long v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLBL(Tuple4<Boolean,Long,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLDI tuple(boolean v1,long v2,double v3,int v4){
        return U4BLDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLDI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BLDI of(boolean v1,long v2,double v3,int v4){
            return new U4BLDI(v1,v2,v3,v4);
        }
        public U4BLDI(boolean v1,long v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLDI(Tuple4<Boolean,Long,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLDB tuple(boolean v1,long v2,double v3,boolean v4){
        return U4BLDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLDB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BLDB of(boolean v1,long v2,double v3,boolean v4){
            return new U4BLDB(v1,v2,v3,v4);
        }
        public U4BLDB(boolean v1,long v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLDB(Tuple4<Boolean,Long,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLDD tuple(boolean v1,long v2,double v3,double v4){
        return U4BLDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLDD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BLDD of(boolean v1,long v2,double v3,double v4){
            return new U4BLDD(v1,v2,v3,v4);
        }
        public U4BLDD(boolean v1,long v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLDD(Tuple4<Boolean,Long,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLDL tuple(boolean v1,long v2,double v3,long v4){
        return U4BLDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLDL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BLDL of(boolean v1,long v2,double v3,long v4){
            return new U4BLDL(v1,v2,v3,v4);
        }
        public U4BLDL(boolean v1,long v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLDL(Tuple4<Boolean,Long,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLLI tuple(boolean v1,long v2,long v3,int v4){
        return U4BLLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLLI  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4BLLI of(boolean v1,long v2,long v3,int v4){
            return new U4BLLI(v1,v2,v3,v4);
        }
        public U4BLLI(boolean v1,long v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLLI(Tuple4<Boolean,Long,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLLB tuple(boolean v1,long v2,long v3,boolean v4){
        return U4BLLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLLB  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4BLLB of(boolean v1,long v2,long v3,boolean v4){
            return new U4BLLB(v1,v2,v3,v4);
        }
        public U4BLLB(boolean v1,long v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLLB(Tuple4<Boolean,Long,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLLD tuple(boolean v1,long v2,long v3,double v4){
        return U4BLLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLLD  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4BLLD of(boolean v1,long v2,long v3,double v4){
            return new U4BLLD(v1,v2,v3,v4);
        }
        public U4BLLD(boolean v1,long v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLLD(Tuple4<Boolean,Long,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4BLLL tuple(boolean v1,long v2,long v3,long v4){
        return U4BLLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4BLLL  implements PTuple {
        public final boolean v1;
    public final boolean v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4BLLL of(boolean v1,long v2,long v3,long v4){
            return new U4BLLL(v1,v2,v3,v4);
        }
        public U4BLLL(boolean v1,long v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4BLLL(Tuple4<Boolean,Long,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Boolean,Long,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIII tuple(double v1,int v2,int v3,int v4){
        return U4DIII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIII  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DIII of(double v1,int v2,int v3,int v4){
            return new U4DIII(v1,v2,v3,v4);
        }
        public U4DIII(double v1,int v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIII(Tuple4<Double,Integer,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIIB tuple(double v1,int v2,int v3,boolean v4){
        return U4DIIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIIB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DIIB of(double v1,int v2,int v3,boolean v4){
            return new U4DIIB(v1,v2,v3,v4);
        }
        public U4DIIB(double v1,int v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIIB(Tuple4<Double,Integer,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIID tuple(double v1,int v2,int v3,double v4){
        return U4DIID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIID  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DIID of(double v1,int v2,int v3,double v4){
            return new U4DIID(v1,v2,v3,v4);
        }
        public U4DIID(double v1,int v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIID(Tuple4<Double,Integer,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIIL tuple(double v1,int v2,int v3,long v4){
        return U4DIIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIIL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DIIL of(double v1,int v2,int v3,long v4){
            return new U4DIIL(v1,v2,v3,v4);
        }
        public U4DIIL(double v1,int v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIIL(Tuple4<Double,Integer,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIBI tuple(double v1,int v2,boolean v3,int v4){
        return U4DIBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIBI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DIBI of(double v1,int v2,boolean v3,int v4){
            return new U4DIBI(v1,v2,v3,v4);
        }
        public U4DIBI(double v1,int v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIBI(Tuple4<Double,Integer,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIBB tuple(double v1,int v2,boolean v3,boolean v4){
        return U4DIBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIBB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DIBB of(double v1,int v2,boolean v3,boolean v4){
            return new U4DIBB(v1,v2,v3,v4);
        }
        public U4DIBB(double v1,int v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIBB(Tuple4<Double,Integer,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIBD tuple(double v1,int v2,boolean v3,double v4){
        return U4DIBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIBD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DIBD of(double v1,int v2,boolean v3,double v4){
            return new U4DIBD(v1,v2,v3,v4);
        }
        public U4DIBD(double v1,int v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIBD(Tuple4<Double,Integer,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIBL tuple(double v1,int v2,boolean v3,long v4){
        return U4DIBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIBL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DIBL of(double v1,int v2,boolean v3,long v4){
            return new U4DIBL(v1,v2,v3,v4);
        }
        public U4DIBL(double v1,int v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIBL(Tuple4<Double,Integer,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIDI tuple(double v1,int v2,double v3,int v4){
        return U4DIDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIDI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DIDI of(double v1,int v2,double v3,int v4){
            return new U4DIDI(v1,v2,v3,v4);
        }
        public U4DIDI(double v1,int v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIDI(Tuple4<Double,Integer,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIDB tuple(double v1,int v2,double v3,boolean v4){
        return U4DIDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIDB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DIDB of(double v1,int v2,double v3,boolean v4){
            return new U4DIDB(v1,v2,v3,v4);
        }
        public U4DIDB(double v1,int v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIDB(Tuple4<Double,Integer,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIDD tuple(double v1,int v2,double v3,double v4){
        return U4DIDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIDD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DIDD of(double v1,int v2,double v3,double v4){
            return new U4DIDD(v1,v2,v3,v4);
        }
        public U4DIDD(double v1,int v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIDD(Tuple4<Double,Integer,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DIDL tuple(double v1,int v2,double v3,long v4){
        return U4DIDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DIDL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DIDL of(double v1,int v2,double v3,long v4){
            return new U4DIDL(v1,v2,v3,v4);
        }
        public U4DIDL(double v1,int v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DIDL(Tuple4<Double,Integer,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DILI tuple(double v1,int v2,long v3,int v4){
        return U4DILI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DILI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DILI of(double v1,int v2,long v3,int v4){
            return new U4DILI(v1,v2,v3,v4);
        }
        public U4DILI(double v1,int v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DILI(Tuple4<Double,Integer,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DILB tuple(double v1,int v2,long v3,boolean v4){
        return U4DILB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DILB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DILB of(double v1,int v2,long v3,boolean v4){
            return new U4DILB(v1,v2,v3,v4);
        }
        public U4DILB(double v1,int v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DILB(Tuple4<Double,Integer,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DILD tuple(double v1,int v2,long v3,double v4){
        return U4DILD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DILD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DILD of(double v1,int v2,long v3,double v4){
            return new U4DILD(v1,v2,v3,v4);
        }
        public U4DILD(double v1,int v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DILD(Tuple4<Double,Integer,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DILL tuple(double v1,int v2,long v3,long v4){
        return U4DILL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DILL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DILL of(double v1,int v2,long v3,long v4){
            return new U4DILL(v1,v2,v3,v4);
        }
        public U4DILL(double v1,int v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DILL(Tuple4<Double,Integer,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Integer,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBII tuple(double v1,boolean v2,int v3,int v4){
        return U4DBII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBII  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DBII of(double v1,boolean v2,int v3,int v4){
            return new U4DBII(v1,v2,v3,v4);
        }
        public U4DBII(double v1,boolean v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBII(Tuple4<Double,Boolean,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBIB tuple(double v1,boolean v2,int v3,boolean v4){
        return U4DBIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBIB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DBIB of(double v1,boolean v2,int v3,boolean v4){
            return new U4DBIB(v1,v2,v3,v4);
        }
        public U4DBIB(double v1,boolean v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBIB(Tuple4<Double,Boolean,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBID tuple(double v1,boolean v2,int v3,double v4){
        return U4DBID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBID  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DBID of(double v1,boolean v2,int v3,double v4){
            return new U4DBID(v1,v2,v3,v4);
        }
        public U4DBID(double v1,boolean v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBID(Tuple4<Double,Boolean,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBIL tuple(double v1,boolean v2,int v3,long v4){
        return U4DBIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBIL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DBIL of(double v1,boolean v2,int v3,long v4){
            return new U4DBIL(v1,v2,v3,v4);
        }
        public U4DBIL(double v1,boolean v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBIL(Tuple4<Double,Boolean,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBBI tuple(double v1,boolean v2,boolean v3,int v4){
        return U4DBBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBBI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DBBI of(double v1,boolean v2,boolean v3,int v4){
            return new U4DBBI(v1,v2,v3,v4);
        }
        public U4DBBI(double v1,boolean v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBBI(Tuple4<Double,Boolean,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBBB tuple(double v1,boolean v2,boolean v3,boolean v4){
        return U4DBBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBBB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DBBB of(double v1,boolean v2,boolean v3,boolean v4){
            return new U4DBBB(v1,v2,v3,v4);
        }
        public U4DBBB(double v1,boolean v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBBB(Tuple4<Double,Boolean,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBBD tuple(double v1,boolean v2,boolean v3,double v4){
        return U4DBBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBBD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DBBD of(double v1,boolean v2,boolean v3,double v4){
            return new U4DBBD(v1,v2,v3,v4);
        }
        public U4DBBD(double v1,boolean v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBBD(Tuple4<Double,Boolean,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBBL tuple(double v1,boolean v2,boolean v3,long v4){
        return U4DBBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBBL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DBBL of(double v1,boolean v2,boolean v3,long v4){
            return new U4DBBL(v1,v2,v3,v4);
        }
        public U4DBBL(double v1,boolean v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBBL(Tuple4<Double,Boolean,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBDI tuple(double v1,boolean v2,double v3,int v4){
        return U4DBDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBDI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DBDI of(double v1,boolean v2,double v3,int v4){
            return new U4DBDI(v1,v2,v3,v4);
        }
        public U4DBDI(double v1,boolean v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBDI(Tuple4<Double,Boolean,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBDB tuple(double v1,boolean v2,double v3,boolean v4){
        return U4DBDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBDB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DBDB of(double v1,boolean v2,double v3,boolean v4){
            return new U4DBDB(v1,v2,v3,v4);
        }
        public U4DBDB(double v1,boolean v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBDB(Tuple4<Double,Boolean,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBDD tuple(double v1,boolean v2,double v3,double v4){
        return U4DBDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBDD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DBDD of(double v1,boolean v2,double v3,double v4){
            return new U4DBDD(v1,v2,v3,v4);
        }
        public U4DBDD(double v1,boolean v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBDD(Tuple4<Double,Boolean,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBDL tuple(double v1,boolean v2,double v3,long v4){
        return U4DBDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBDL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DBDL of(double v1,boolean v2,double v3,long v4){
            return new U4DBDL(v1,v2,v3,v4);
        }
        public U4DBDL(double v1,boolean v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBDL(Tuple4<Double,Boolean,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBLI tuple(double v1,boolean v2,long v3,int v4){
        return U4DBLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBLI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DBLI of(double v1,boolean v2,long v3,int v4){
            return new U4DBLI(v1,v2,v3,v4);
        }
        public U4DBLI(double v1,boolean v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBLI(Tuple4<Double,Boolean,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBLB tuple(double v1,boolean v2,long v3,boolean v4){
        return U4DBLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBLB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DBLB of(double v1,boolean v2,long v3,boolean v4){
            return new U4DBLB(v1,v2,v3,v4);
        }
        public U4DBLB(double v1,boolean v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBLB(Tuple4<Double,Boolean,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBLD tuple(double v1,boolean v2,long v3,double v4){
        return U4DBLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBLD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DBLD of(double v1,boolean v2,long v3,double v4){
            return new U4DBLD(v1,v2,v3,v4);
        }
        public U4DBLD(double v1,boolean v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBLD(Tuple4<Double,Boolean,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DBLL tuple(double v1,boolean v2,long v3,long v4){
        return U4DBLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DBLL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DBLL of(double v1,boolean v2,long v3,long v4){
            return new U4DBLL(v1,v2,v3,v4);
        }
        public U4DBLL(double v1,boolean v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DBLL(Tuple4<Double,Boolean,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Boolean,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDII tuple(double v1,double v2,int v3,int v4){
        return U4DDII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDII  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DDII of(double v1,double v2,int v3,int v4){
            return new U4DDII(v1,v2,v3,v4);
        }
        public U4DDII(double v1,double v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDII(Tuple4<Double,Double,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDIB tuple(double v1,double v2,int v3,boolean v4){
        return U4DDIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDIB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DDIB of(double v1,double v2,int v3,boolean v4){
            return new U4DDIB(v1,v2,v3,v4);
        }
        public U4DDIB(double v1,double v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDIB(Tuple4<Double,Double,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDID tuple(double v1,double v2,int v3,double v4){
        return U4DDID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDID  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DDID of(double v1,double v2,int v3,double v4){
            return new U4DDID(v1,v2,v3,v4);
        }
        public U4DDID(double v1,double v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDID(Tuple4<Double,Double,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDIL tuple(double v1,double v2,int v3,long v4){
        return U4DDIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDIL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DDIL of(double v1,double v2,int v3,long v4){
            return new U4DDIL(v1,v2,v3,v4);
        }
        public U4DDIL(double v1,double v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDIL(Tuple4<Double,Double,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDBI tuple(double v1,double v2,boolean v3,int v4){
        return U4DDBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDBI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DDBI of(double v1,double v2,boolean v3,int v4){
            return new U4DDBI(v1,v2,v3,v4);
        }
        public U4DDBI(double v1,double v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDBI(Tuple4<Double,Double,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDBB tuple(double v1,double v2,boolean v3,boolean v4){
        return U4DDBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDBB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DDBB of(double v1,double v2,boolean v3,boolean v4){
            return new U4DDBB(v1,v2,v3,v4);
        }
        public U4DDBB(double v1,double v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDBB(Tuple4<Double,Double,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDBD tuple(double v1,double v2,boolean v3,double v4){
        return U4DDBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDBD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DDBD of(double v1,double v2,boolean v3,double v4){
            return new U4DDBD(v1,v2,v3,v4);
        }
        public U4DDBD(double v1,double v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDBD(Tuple4<Double,Double,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDBL tuple(double v1,double v2,boolean v3,long v4){
        return U4DDBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDBL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DDBL of(double v1,double v2,boolean v3,long v4){
            return new U4DDBL(v1,v2,v3,v4);
        }
        public U4DDBL(double v1,double v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDBL(Tuple4<Double,Double,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDDI tuple(double v1,double v2,double v3,int v4){
        return U4DDDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDDI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DDDI of(double v1,double v2,double v3,int v4){
            return new U4DDDI(v1,v2,v3,v4);
        }
        public U4DDDI(double v1,double v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDDI(Tuple4<Double,Double,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDDB tuple(double v1,double v2,double v3,boolean v4){
        return U4DDDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDDB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DDDB of(double v1,double v2,double v3,boolean v4){
            return new U4DDDB(v1,v2,v3,v4);
        }
        public U4DDDB(double v1,double v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDDB(Tuple4<Double,Double,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDDD tuple(double v1,double v2,double v3,double v4){
        return U4DDDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDDD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DDDD of(double v1,double v2,double v3,double v4){
            return new U4DDDD(v1,v2,v3,v4);
        }
        public U4DDDD(double v1,double v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDDD(Tuple4<Double,Double,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDDL tuple(double v1,double v2,double v3,long v4){
        return U4DDDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDDL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DDDL of(double v1,double v2,double v3,long v4){
            return new U4DDDL(v1,v2,v3,v4);
        }
        public U4DDDL(double v1,double v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDDL(Tuple4<Double,Double,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDLI tuple(double v1,double v2,long v3,int v4){
        return U4DDLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDLI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DDLI of(double v1,double v2,long v3,int v4){
            return new U4DDLI(v1,v2,v3,v4);
        }
        public U4DDLI(double v1,double v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDLI(Tuple4<Double,Double,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDLB tuple(double v1,double v2,long v3,boolean v4){
        return U4DDLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDLB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DDLB of(double v1,double v2,long v3,boolean v4){
            return new U4DDLB(v1,v2,v3,v4);
        }
        public U4DDLB(double v1,double v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDLB(Tuple4<Double,Double,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDLD tuple(double v1,double v2,long v3,double v4){
        return U4DDLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDLD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DDLD of(double v1,double v2,long v3,double v4){
            return new U4DDLD(v1,v2,v3,v4);
        }
        public U4DDLD(double v1,double v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDLD(Tuple4<Double,Double,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DDLL tuple(double v1,double v2,long v3,long v4){
        return U4DDLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DDLL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DDLL of(double v1,double v2,long v3,long v4){
            return new U4DDLL(v1,v2,v3,v4);
        }
        public U4DDLL(double v1,double v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DDLL(Tuple4<Double,Double,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Double,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLII tuple(double v1,long v2,int v3,int v4){
        return U4DLII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLII  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DLII of(double v1,long v2,int v3,int v4){
            return new U4DLII(v1,v2,v3,v4);
        }
        public U4DLII(double v1,long v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLII(Tuple4<Double,Long,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLIB tuple(double v1,long v2,int v3,boolean v4){
        return U4DLIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLIB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DLIB of(double v1,long v2,int v3,boolean v4){
            return new U4DLIB(v1,v2,v3,v4);
        }
        public U4DLIB(double v1,long v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLIB(Tuple4<Double,Long,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLID tuple(double v1,long v2,int v3,double v4){
        return U4DLID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLID  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DLID of(double v1,long v2,int v3,double v4){
            return new U4DLID(v1,v2,v3,v4);
        }
        public U4DLID(double v1,long v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLID(Tuple4<Double,Long,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLIL tuple(double v1,long v2,int v3,long v4){
        return U4DLIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLIL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DLIL of(double v1,long v2,int v3,long v4){
            return new U4DLIL(v1,v2,v3,v4);
        }
        public U4DLIL(double v1,long v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLIL(Tuple4<Double,Long,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLBI tuple(double v1,long v2,boolean v3,int v4){
        return U4DLBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLBI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DLBI of(double v1,long v2,boolean v3,int v4){
            return new U4DLBI(v1,v2,v3,v4);
        }
        public U4DLBI(double v1,long v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLBI(Tuple4<Double,Long,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLBB tuple(double v1,long v2,boolean v3,boolean v4){
        return U4DLBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLBB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DLBB of(double v1,long v2,boolean v3,boolean v4){
            return new U4DLBB(v1,v2,v3,v4);
        }
        public U4DLBB(double v1,long v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLBB(Tuple4<Double,Long,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLBD tuple(double v1,long v2,boolean v3,double v4){
        return U4DLBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLBD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DLBD of(double v1,long v2,boolean v3,double v4){
            return new U4DLBD(v1,v2,v3,v4);
        }
        public U4DLBD(double v1,long v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLBD(Tuple4<Double,Long,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLBL tuple(double v1,long v2,boolean v3,long v4){
        return U4DLBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLBL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DLBL of(double v1,long v2,boolean v3,long v4){
            return new U4DLBL(v1,v2,v3,v4);
        }
        public U4DLBL(double v1,long v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLBL(Tuple4<Double,Long,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLDI tuple(double v1,long v2,double v3,int v4){
        return U4DLDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLDI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DLDI of(double v1,long v2,double v3,int v4){
            return new U4DLDI(v1,v2,v3,v4);
        }
        public U4DLDI(double v1,long v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLDI(Tuple4<Double,Long,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLDB tuple(double v1,long v2,double v3,boolean v4){
        return U4DLDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLDB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DLDB of(double v1,long v2,double v3,boolean v4){
            return new U4DLDB(v1,v2,v3,v4);
        }
        public U4DLDB(double v1,long v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLDB(Tuple4<Double,Long,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLDD tuple(double v1,long v2,double v3,double v4){
        return U4DLDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLDD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DLDD of(double v1,long v2,double v3,double v4){
            return new U4DLDD(v1,v2,v3,v4);
        }
        public U4DLDD(double v1,long v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLDD(Tuple4<Double,Long,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLDL tuple(double v1,long v2,double v3,long v4){
        return U4DLDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLDL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DLDL of(double v1,long v2,double v3,long v4){
            return new U4DLDL(v1,v2,v3,v4);
        }
        public U4DLDL(double v1,long v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLDL(Tuple4<Double,Long,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLLI tuple(double v1,long v2,long v3,int v4){
        return U4DLLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLLI  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4DLLI of(double v1,long v2,long v3,int v4){
            return new U4DLLI(v1,v2,v3,v4);
        }
        public U4DLLI(double v1,long v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLLI(Tuple4<Double,Long,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLLB tuple(double v1,long v2,long v3,boolean v4){
        return U4DLLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLLB  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4DLLB of(double v1,long v2,long v3,boolean v4){
            return new U4DLLB(v1,v2,v3,v4);
        }
        public U4DLLB(double v1,long v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLLB(Tuple4<Double,Long,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLLD tuple(double v1,long v2,long v3,double v4){
        return U4DLLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLLD  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4DLLD of(double v1,long v2,long v3,double v4){
            return new U4DLLD(v1,v2,v3,v4);
        }
        public U4DLLD(double v1,long v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLLD(Tuple4<Double,Long,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4DLLL tuple(double v1,long v2,long v3,long v4){
        return U4DLLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4DLLL  implements PTuple {
        public final double v1;
    public final double v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4DLLL of(double v1,long v2,long v3,long v4){
            return new U4DLLL(v1,v2,v3,v4);
        }
        public U4DLLL(double v1,long v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4DLLL(Tuple4<Double,Long,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Double,Long,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIII tuple(long v1,int v2,int v3,int v4){
        return U4LIII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIII  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LIII of(long v1,int v2,int v3,int v4){
            return new U4LIII(v1,v2,v3,v4);
        }
        public U4LIII(long v1,int v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIII(Tuple4<Long,Integer,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIIB tuple(long v1,int v2,int v3,boolean v4){
        return U4LIIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIIB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LIIB of(long v1,int v2,int v3,boolean v4){
            return new U4LIIB(v1,v2,v3,v4);
        }
        public U4LIIB(long v1,int v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIIB(Tuple4<Long,Integer,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIID tuple(long v1,int v2,int v3,double v4){
        return U4LIID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIID  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LIID of(long v1,int v2,int v3,double v4){
            return new U4LIID(v1,v2,v3,v4);
        }
        public U4LIID(long v1,int v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIID(Tuple4<Long,Integer,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIIL tuple(long v1,int v2,int v3,long v4){
        return U4LIIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIIL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LIIL of(long v1,int v2,int v3,long v4){
            return new U4LIIL(v1,v2,v3,v4);
        }
        public U4LIIL(long v1,int v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIIL(Tuple4<Long,Integer,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIBI tuple(long v1,int v2,boolean v3,int v4){
        return U4LIBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIBI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LIBI of(long v1,int v2,boolean v3,int v4){
            return new U4LIBI(v1,v2,v3,v4);
        }
        public U4LIBI(long v1,int v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIBI(Tuple4<Long,Integer,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIBB tuple(long v1,int v2,boolean v3,boolean v4){
        return U4LIBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIBB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LIBB of(long v1,int v2,boolean v3,boolean v4){
            return new U4LIBB(v1,v2,v3,v4);
        }
        public U4LIBB(long v1,int v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIBB(Tuple4<Long,Integer,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIBD tuple(long v1,int v2,boolean v3,double v4){
        return U4LIBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIBD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LIBD of(long v1,int v2,boolean v3,double v4){
            return new U4LIBD(v1,v2,v3,v4);
        }
        public U4LIBD(long v1,int v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIBD(Tuple4<Long,Integer,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIBL tuple(long v1,int v2,boolean v3,long v4){
        return U4LIBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIBL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LIBL of(long v1,int v2,boolean v3,long v4){
            return new U4LIBL(v1,v2,v3,v4);
        }
        public U4LIBL(long v1,int v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIBL(Tuple4<Long,Integer,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIDI tuple(long v1,int v2,double v3,int v4){
        return U4LIDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIDI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LIDI of(long v1,int v2,double v3,int v4){
            return new U4LIDI(v1,v2,v3,v4);
        }
        public U4LIDI(long v1,int v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIDI(Tuple4<Long,Integer,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIDB tuple(long v1,int v2,double v3,boolean v4){
        return U4LIDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIDB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LIDB of(long v1,int v2,double v3,boolean v4){
            return new U4LIDB(v1,v2,v3,v4);
        }
        public U4LIDB(long v1,int v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIDB(Tuple4<Long,Integer,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIDD tuple(long v1,int v2,double v3,double v4){
        return U4LIDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIDD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LIDD of(long v1,int v2,double v3,double v4){
            return new U4LIDD(v1,v2,v3,v4);
        }
        public U4LIDD(long v1,int v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIDD(Tuple4<Long,Integer,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LIDL tuple(long v1,int v2,double v3,long v4){
        return U4LIDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LIDL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LIDL of(long v1,int v2,double v3,long v4){
            return new U4LIDL(v1,v2,v3,v4);
        }
        public U4LIDL(long v1,int v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LIDL(Tuple4<Long,Integer,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LILI tuple(long v1,int v2,long v3,int v4){
        return U4LILI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LILI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LILI of(long v1,int v2,long v3,int v4){
            return new U4LILI(v1,v2,v3,v4);
        }
        public U4LILI(long v1,int v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LILI(Tuple4<Long,Integer,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LILB tuple(long v1,int v2,long v3,boolean v4){
        return U4LILB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LILB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LILB of(long v1,int v2,long v3,boolean v4){
            return new U4LILB(v1,v2,v3,v4);
        }
        public U4LILB(long v1,int v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LILB(Tuple4<Long,Integer,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LILD tuple(long v1,int v2,long v3,double v4){
        return U4LILD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LILD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LILD of(long v1,int v2,long v3,double v4){
            return new U4LILD(v1,v2,v3,v4);
        }
        public U4LILD(long v1,int v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LILD(Tuple4<Long,Integer,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LILL tuple(long v1,int v2,long v3,long v4){
        return U4LILL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LILL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final int v2;
    public final int v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LILL of(long v1,int v2,long v3,long v4){
            return new U4LILL(v1,v2,v3,v4);
        }
        public U4LILL(long v1,int v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LILL(Tuple4<Long,Integer,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Integer,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBII tuple(long v1,boolean v2,int v3,int v4){
        return U4LBII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBII  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LBII of(long v1,boolean v2,int v3,int v4){
            return new U4LBII(v1,v2,v3,v4);
        }
        public U4LBII(long v1,boolean v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBII(Tuple4<Long,Boolean,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBIB tuple(long v1,boolean v2,int v3,boolean v4){
        return U4LBIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBIB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LBIB of(long v1,boolean v2,int v3,boolean v4){
            return new U4LBIB(v1,v2,v3,v4);
        }
        public U4LBIB(long v1,boolean v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBIB(Tuple4<Long,Boolean,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBID tuple(long v1,boolean v2,int v3,double v4){
        return U4LBID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBID  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LBID of(long v1,boolean v2,int v3,double v4){
            return new U4LBID(v1,v2,v3,v4);
        }
        public U4LBID(long v1,boolean v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBID(Tuple4<Long,Boolean,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBIL tuple(long v1,boolean v2,int v3,long v4){
        return U4LBIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBIL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LBIL of(long v1,boolean v2,int v3,long v4){
            return new U4LBIL(v1,v2,v3,v4);
        }
        public U4LBIL(long v1,boolean v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBIL(Tuple4<Long,Boolean,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBBI tuple(long v1,boolean v2,boolean v3,int v4){
        return U4LBBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBBI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LBBI of(long v1,boolean v2,boolean v3,int v4){
            return new U4LBBI(v1,v2,v3,v4);
        }
        public U4LBBI(long v1,boolean v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBBI(Tuple4<Long,Boolean,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBBB tuple(long v1,boolean v2,boolean v3,boolean v4){
        return U4LBBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBBB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LBBB of(long v1,boolean v2,boolean v3,boolean v4){
            return new U4LBBB(v1,v2,v3,v4);
        }
        public U4LBBB(long v1,boolean v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBBB(Tuple4<Long,Boolean,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBBD tuple(long v1,boolean v2,boolean v3,double v4){
        return U4LBBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBBD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LBBD of(long v1,boolean v2,boolean v3,double v4){
            return new U4LBBD(v1,v2,v3,v4);
        }
        public U4LBBD(long v1,boolean v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBBD(Tuple4<Long,Boolean,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBBL tuple(long v1,boolean v2,boolean v3,long v4){
        return U4LBBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBBL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LBBL of(long v1,boolean v2,boolean v3,long v4){
            return new U4LBBL(v1,v2,v3,v4);
        }
        public U4LBBL(long v1,boolean v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBBL(Tuple4<Long,Boolean,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBDI tuple(long v1,boolean v2,double v3,int v4){
        return U4LBDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBDI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LBDI of(long v1,boolean v2,double v3,int v4){
            return new U4LBDI(v1,v2,v3,v4);
        }
        public U4LBDI(long v1,boolean v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBDI(Tuple4<Long,Boolean,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBDB tuple(long v1,boolean v2,double v3,boolean v4){
        return U4LBDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBDB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LBDB of(long v1,boolean v2,double v3,boolean v4){
            return new U4LBDB(v1,v2,v3,v4);
        }
        public U4LBDB(long v1,boolean v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBDB(Tuple4<Long,Boolean,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBDD tuple(long v1,boolean v2,double v3,double v4){
        return U4LBDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBDD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LBDD of(long v1,boolean v2,double v3,double v4){
            return new U4LBDD(v1,v2,v3,v4);
        }
        public U4LBDD(long v1,boolean v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBDD(Tuple4<Long,Boolean,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBDL tuple(long v1,boolean v2,double v3,long v4){
        return U4LBDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBDL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LBDL of(long v1,boolean v2,double v3,long v4){
            return new U4LBDL(v1,v2,v3,v4);
        }
        public U4LBDL(long v1,boolean v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBDL(Tuple4<Long,Boolean,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBLI tuple(long v1,boolean v2,long v3,int v4){
        return U4LBLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBLI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LBLI of(long v1,boolean v2,long v3,int v4){
            return new U4LBLI(v1,v2,v3,v4);
        }
        public U4LBLI(long v1,boolean v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBLI(Tuple4<Long,Boolean,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBLB tuple(long v1,boolean v2,long v3,boolean v4){
        return U4LBLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBLB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LBLB of(long v1,boolean v2,long v3,boolean v4){
            return new U4LBLB(v1,v2,v3,v4);
        }
        public U4LBLB(long v1,boolean v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBLB(Tuple4<Long,Boolean,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBLD tuple(long v1,boolean v2,long v3,double v4){
        return U4LBLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBLD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LBLD of(long v1,boolean v2,long v3,double v4){
            return new U4LBLD(v1,v2,v3,v4);
        }
        public U4LBLD(long v1,boolean v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBLD(Tuple4<Long,Boolean,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LBLL tuple(long v1,boolean v2,long v3,long v4){
        return U4LBLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LBLL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final boolean v2;
    public final boolean v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LBLL of(long v1,boolean v2,long v3,long v4){
            return new U4LBLL(v1,v2,v3,v4);
        }
        public U4LBLL(long v1,boolean v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LBLL(Tuple4<Long,Boolean,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Boolean,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDII tuple(long v1,double v2,int v3,int v4){
        return U4LDII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDII  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LDII of(long v1,double v2,int v3,int v4){
            return new U4LDII(v1,v2,v3,v4);
        }
        public U4LDII(long v1,double v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDII(Tuple4<Long,Double,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDIB tuple(long v1,double v2,int v3,boolean v4){
        return U4LDIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDIB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LDIB of(long v1,double v2,int v3,boolean v4){
            return new U4LDIB(v1,v2,v3,v4);
        }
        public U4LDIB(long v1,double v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDIB(Tuple4<Long,Double,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDID tuple(long v1,double v2,int v3,double v4){
        return U4LDID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDID  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LDID of(long v1,double v2,int v3,double v4){
            return new U4LDID(v1,v2,v3,v4);
        }
        public U4LDID(long v1,double v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDID(Tuple4<Long,Double,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDIL tuple(long v1,double v2,int v3,long v4){
        return U4LDIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDIL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LDIL of(long v1,double v2,int v3,long v4){
            return new U4LDIL(v1,v2,v3,v4);
        }
        public U4LDIL(long v1,double v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDIL(Tuple4<Long,Double,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDBI tuple(long v1,double v2,boolean v3,int v4){
        return U4LDBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDBI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LDBI of(long v1,double v2,boolean v3,int v4){
            return new U4LDBI(v1,v2,v3,v4);
        }
        public U4LDBI(long v1,double v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDBI(Tuple4<Long,Double,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDBB tuple(long v1,double v2,boolean v3,boolean v4){
        return U4LDBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDBB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LDBB of(long v1,double v2,boolean v3,boolean v4){
            return new U4LDBB(v1,v2,v3,v4);
        }
        public U4LDBB(long v1,double v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDBB(Tuple4<Long,Double,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDBD tuple(long v1,double v2,boolean v3,double v4){
        return U4LDBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDBD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LDBD of(long v1,double v2,boolean v3,double v4){
            return new U4LDBD(v1,v2,v3,v4);
        }
        public U4LDBD(long v1,double v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDBD(Tuple4<Long,Double,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDBL tuple(long v1,double v2,boolean v3,long v4){
        return U4LDBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDBL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LDBL of(long v1,double v2,boolean v3,long v4){
            return new U4LDBL(v1,v2,v3,v4);
        }
        public U4LDBL(long v1,double v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDBL(Tuple4<Long,Double,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDDI tuple(long v1,double v2,double v3,int v4){
        return U4LDDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDDI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LDDI of(long v1,double v2,double v3,int v4){
            return new U4LDDI(v1,v2,v3,v4);
        }
        public U4LDDI(long v1,double v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDDI(Tuple4<Long,Double,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDDB tuple(long v1,double v2,double v3,boolean v4){
        return U4LDDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDDB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LDDB of(long v1,double v2,double v3,boolean v4){
            return new U4LDDB(v1,v2,v3,v4);
        }
        public U4LDDB(long v1,double v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDDB(Tuple4<Long,Double,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDDD tuple(long v1,double v2,double v3,double v4){
        return U4LDDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDDD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LDDD of(long v1,double v2,double v3,double v4){
            return new U4LDDD(v1,v2,v3,v4);
        }
        public U4LDDD(long v1,double v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDDD(Tuple4<Long,Double,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDDL tuple(long v1,double v2,double v3,long v4){
        return U4LDDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDDL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LDDL of(long v1,double v2,double v3,long v4){
            return new U4LDDL(v1,v2,v3,v4);
        }
        public U4LDDL(long v1,double v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDDL(Tuple4<Long,Double,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDLI tuple(long v1,double v2,long v3,int v4){
        return U4LDLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDLI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LDLI of(long v1,double v2,long v3,int v4){
            return new U4LDLI(v1,v2,v3,v4);
        }
        public U4LDLI(long v1,double v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDLI(Tuple4<Long,Double,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDLB tuple(long v1,double v2,long v3,boolean v4){
        return U4LDLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDLB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LDLB of(long v1,double v2,long v3,boolean v4){
            return new U4LDLB(v1,v2,v3,v4);
        }
        public U4LDLB(long v1,double v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDLB(Tuple4<Long,Double,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDLD tuple(long v1,double v2,long v3,double v4){
        return U4LDLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDLD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LDLD of(long v1,double v2,long v3,double v4){
            return new U4LDLD(v1,v2,v3,v4);
        }
        public U4LDLD(long v1,double v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDLD(Tuple4<Long,Double,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LDLL tuple(long v1,double v2,long v3,long v4){
        return U4LDLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LDLL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final double v2;
    public final double v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LDLL of(long v1,double v2,long v3,long v4){
            return new U4LDLL(v1,v2,v3,v4);
        }
        public U4LDLL(long v1,double v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LDLL(Tuple4<Long,Double,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Double,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLII tuple(long v1,long v2,int v3,int v4){
        return U4LLII.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLII  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LLII of(long v1,long v2,int v3,int v4){
            return new U4LLII(v1,v2,v3,v4);
        }
        public U4LLII(long v1,long v2,int v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLII(Tuple4<Long,Long,Integer,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Integer,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLIB tuple(long v1,long v2,int v3,boolean v4){
        return U4LLIB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLIB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LLIB of(long v1,long v2,int v3,boolean v4){
            return new U4LLIB(v1,v2,v3,v4);
        }
        public U4LLIB(long v1,long v2,int v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLIB(Tuple4<Long,Long,Integer,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Integer,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLID tuple(long v1,long v2,int v3,double v4){
        return U4LLID.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLID  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LLID of(long v1,long v2,int v3,double v4){
            return new U4LLID(v1,v2,v3,v4);
        }
        public U4LLID(long v1,long v2,int v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLID(Tuple4<Long,Long,Integer,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Integer,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLIL tuple(long v1,long v2,int v3,long v4){
        return U4LLIL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLIL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final int v3;
    public final int v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LLIL of(long v1,long v2,int v3,long v4){
            return new U4LLIL(v1,v2,v3,v4);
        }
        public U4LLIL(long v1,long v2,int v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLIL(Tuple4<Long,Long,Integer,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Integer,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLBI tuple(long v1,long v2,boolean v3,int v4){
        return U4LLBI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLBI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LLBI of(long v1,long v2,boolean v3,int v4){
            return new U4LLBI(v1,v2,v3,v4);
        }
        public U4LLBI(long v1,long v2,boolean v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLBI(Tuple4<Long,Long,Boolean,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Boolean,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLBB tuple(long v1,long v2,boolean v3,boolean v4){
        return U4LLBB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLBB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LLBB of(long v1,long v2,boolean v3,boolean v4){
            return new U4LLBB(v1,v2,v3,v4);
        }
        public U4LLBB(long v1,long v2,boolean v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLBB(Tuple4<Long,Long,Boolean,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Boolean,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLBD tuple(long v1,long v2,boolean v3,double v4){
        return U4LLBD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLBD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LLBD of(long v1,long v2,boolean v3,double v4){
            return new U4LLBD(v1,v2,v3,v4);
        }
        public U4LLBD(long v1,long v2,boolean v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLBD(Tuple4<Long,Long,Boolean,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Boolean,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLBL tuple(long v1,long v2,boolean v3,long v4){
        return U4LLBL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLBL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final boolean v3;
    public final boolean v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LLBL of(long v1,long v2,boolean v3,long v4){
            return new U4LLBL(v1,v2,v3,v4);
        }
        public U4LLBL(long v1,long v2,boolean v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLBL(Tuple4<Long,Long,Boolean,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Boolean,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLDI tuple(long v1,long v2,double v3,int v4){
        return U4LLDI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLDI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LLDI of(long v1,long v2,double v3,int v4){
            return new U4LLDI(v1,v2,v3,v4);
        }
        public U4LLDI(long v1,long v2,double v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLDI(Tuple4<Long,Long,Double,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Double,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLDB tuple(long v1,long v2,double v3,boolean v4){
        return U4LLDB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLDB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LLDB of(long v1,long v2,double v3,boolean v4){
            return new U4LLDB(v1,v2,v3,v4);
        }
        public U4LLDB(long v1,long v2,double v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLDB(Tuple4<Long,Long,Double,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Double,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLDD tuple(long v1,long v2,double v3,double v4){
        return U4LLDD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLDD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LLDD of(long v1,long v2,double v3,double v4){
            return new U4LLDD(v1,v2,v3,v4);
        }
        public U4LLDD(long v1,long v2,double v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLDD(Tuple4<Long,Long,Double,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Double,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLDL tuple(long v1,long v2,double v3,long v4){
        return U4LLDL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLDL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final double v3;
    public final double v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LLDL of(long v1,long v2,double v3,long v4){
            return new U4LLDL(v1,v2,v3,v4);
        }
        public U4LLDL(long v1,long v2,double v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLDL(Tuple4<Long,Long,Double,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Double,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLLI tuple(long v1,long v2,long v3,int v4){
        return U4LLLI.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLLI  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final int v4;
    public final int v4(){
        return v4;
    }

       public static U4LLLI of(long v1,long v2,long v3,int v4){
            return new U4LLLI(v1,v2,v3,v4);
        }
        public U4LLLI(long v1,long v2,long v3,int v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLLI(Tuple4<Long,Long,Long,Integer> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Long,Integer> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLLB tuple(long v1,long v2,long v3,boolean v4){
        return U4LLLB.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLLB  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final boolean v4;
    public final boolean v4(){
        return v4;
    }

       public static U4LLLB of(long v1,long v2,long v3,boolean v4){
            return new U4LLLB(v1,v2,v3,v4);
        }
        public U4LLLB(long v1,long v2,long v3,boolean v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLLB(Tuple4<Long,Long,Long,Boolean> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Long,Boolean> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLLD tuple(long v1,long v2,long v3,double v4){
        return U4LLLD.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLLD  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final double v4;
    public final double v4(){
        return v4;
    }

       public static U4LLLD of(long v1,long v2,long v3,double v4){
            return new U4LLLD(v1,v2,v3,v4);
        }
        public U4LLLD(long v1,long v2,long v3,double v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLLD(Tuple4<Long,Long,Long,Double> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Long,Double> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }
    static U4LLLL tuple(long v1,long v2,long v3,long v4){
        return U4LLLL.of(v1,v2,v3,v4);
    }
    @EqualsAndHashCode
    class U4LLLL  implements PTuple {
        public final long v1;
    public final long v1(){
        return v1;
    }
    public final long v2;
    public final long v2(){
        return v2;
    }
    public final long v3;
    public final long v3(){
        return v3;
    }
    public final long v4;
    public final long v4(){
        return v4;
    }

       public static U4LLLL of(long v1,long v2,long v3,long v4){
            return new U4LLLL(v1,v2,v3,v4);
        }
        public U4LLLL(long v1,long v2,long v3,long v4){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
            this.v4=v4;
        }
        public U4LLLL(Tuple4<Long,Long,Long,Long> u){
            this.v1=requireNonNull(u.v1);
            this.v2=requireNonNull(u.v2);
            this.v3=requireNonNull(u.v3);
            this.v4=requireNonNull(u.v4);
        }
        @Override
        public Object[] toArray() {
            return new Object[]{v1,v2,v3,v4};
        }

        @Override
        public int degree() {
            return 4;
        }
        public Tuple4<Long,Long,Long,Long> toTuple(){
            return Tuple.tuple(v1,v2,v3,v4);
        }
        @Override
        public String toString(){
            return Arrays.toString(toArray());
        }
    }

}
