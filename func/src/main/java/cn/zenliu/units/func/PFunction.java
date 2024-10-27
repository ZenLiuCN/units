package cn.zenliu.units.func;
import org.jooq.lambda.function.*;
import static java.util.Objects.requireNonNull;
public  interface PFunction extends Fn {
      interface FnII extends Function1<Integer,Integer>,PFunction{
      int accept(int v0);
      @Override
      default Integer apply(Integer v0) {
          return accept((int)requireNonNull(v0));
       }
}
interface FnIB extends Function1<Integer,Boolean>,PFunction{
      boolean accept(int v0);
      @Override
      default Boolean apply(Integer v0) {
          return accept((int)requireNonNull(v0));
       }
}
interface FnID extends Function1<Integer,Double>,PFunction{
      double accept(int v0);
      @Override
      default Double apply(Integer v0) {
          return accept((int)requireNonNull(v0));
       }
}
interface FnIL extends Function1<Integer,Long>,PFunction{
      long accept(int v0);
      @Override
      default Long apply(Integer v0) {
          return accept((int)requireNonNull(v0));
       }
}
interface FnBI extends Function1<Boolean,Integer>,PFunction{
      int accept(boolean v0);
      @Override
      default Integer apply(Boolean v0) {
          return accept((boolean)requireNonNull(v0));
       }
}
interface FnBB extends Function1<Boolean,Boolean>,PFunction{
      boolean accept(boolean v0);
      @Override
      default Boolean apply(Boolean v0) {
          return accept((boolean)requireNonNull(v0));
       }
}
interface FnBD extends Function1<Boolean,Double>,PFunction{
      double accept(boolean v0);
      @Override
      default Double apply(Boolean v0) {
          return accept((boolean)requireNonNull(v0));
       }
}
interface FnBL extends Function1<Boolean,Long>,PFunction{
      long accept(boolean v0);
      @Override
      default Long apply(Boolean v0) {
          return accept((boolean)requireNonNull(v0));
       }
}
interface FnDI extends Function1<Double,Integer>,PFunction{
      int accept(double v0);
      @Override
      default Integer apply(Double v0) {
          return accept((double)requireNonNull(v0));
       }
}
interface FnDB extends Function1<Double,Boolean>,PFunction{
      boolean accept(double v0);
      @Override
      default Boolean apply(Double v0) {
          return accept((double)requireNonNull(v0));
       }
}
interface FnDD extends Function1<Double,Double>,PFunction{
      double accept(double v0);
      @Override
      default Double apply(Double v0) {
          return accept((double)requireNonNull(v0));
       }
}
interface FnDL extends Function1<Double,Long>,PFunction{
      long accept(double v0);
      @Override
      default Long apply(Double v0) {
          return accept((double)requireNonNull(v0));
       }
}
interface FnLI extends Function1<Long,Integer>,PFunction{
      int accept(long v0);
      @Override
      default Integer apply(Long v0) {
          return accept((long)requireNonNull(v0));
       }
}
interface FnLB extends Function1<Long,Boolean>,PFunction{
      boolean accept(long v0);
      @Override
      default Boolean apply(Long v0) {
          return accept((long)requireNonNull(v0));
       }
}
interface FnLD extends Function1<Long,Double>,PFunction{
      double accept(long v0);
      @Override
      default Double apply(Long v0) {
          return accept((long)requireNonNull(v0));
       }
}
interface FnLL extends Function1<Long,Long>,PFunction{
      long accept(long v0);
      @Override
      default Long apply(Long v0) {
          return accept((long)requireNonNull(v0));
       }
}
interface FnIII extends Function2<Integer,Integer,Integer>,PFunction{
      int accept(int v0,int v1);
      @Override
      default Integer apply(Integer v0,Integer v1) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnIIB extends Function2<Integer,Integer,Boolean>,PFunction{
      boolean accept(int v0,int v1);
      @Override
      default Boolean apply(Integer v0,Integer v1) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnIID extends Function2<Integer,Integer,Double>,PFunction{
      double accept(int v0,int v1);
      @Override
      default Double apply(Integer v0,Integer v1) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnIIL extends Function2<Integer,Integer,Long>,PFunction{
      long accept(int v0,int v1);
      @Override
      default Long apply(Integer v0,Integer v1) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnIBI extends Function2<Integer,Boolean,Integer>,PFunction{
      int accept(int v0,boolean v1);
      @Override
      default Integer apply(Integer v0,Boolean v1) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnIBB extends Function2<Integer,Boolean,Boolean>,PFunction{
      boolean accept(int v0,boolean v1);
      @Override
      default Boolean apply(Integer v0,Boolean v1) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnIBD extends Function2<Integer,Boolean,Double>,PFunction{
      double accept(int v0,boolean v1);
      @Override
      default Double apply(Integer v0,Boolean v1) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnIBL extends Function2<Integer,Boolean,Long>,PFunction{
      long accept(int v0,boolean v1);
      @Override
      default Long apply(Integer v0,Boolean v1) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnIDI extends Function2<Integer,Double,Integer>,PFunction{
      int accept(int v0,double v1);
      @Override
      default Integer apply(Integer v0,Double v1) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnIDB extends Function2<Integer,Double,Boolean>,PFunction{
      boolean accept(int v0,double v1);
      @Override
      default Boolean apply(Integer v0,Double v1) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnIDD extends Function2<Integer,Double,Double>,PFunction{
      double accept(int v0,double v1);
      @Override
      default Double apply(Integer v0,Double v1) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnIDL extends Function2<Integer,Double,Long>,PFunction{
      long accept(int v0,double v1);
      @Override
      default Long apply(Integer v0,Double v1) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnILI extends Function2<Integer,Long,Integer>,PFunction{
      int accept(int v0,long v1);
      @Override
      default Integer apply(Integer v0,Long v1) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnILB extends Function2<Integer,Long,Boolean>,PFunction{
      boolean accept(int v0,long v1);
      @Override
      default Boolean apply(Integer v0,Long v1) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnILD extends Function2<Integer,Long,Double>,PFunction{
      double accept(int v0,long v1);
      @Override
      default Double apply(Integer v0,Long v1) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnILL extends Function2<Integer,Long,Long>,PFunction{
      long accept(int v0,long v1);
      @Override
      default Long apply(Integer v0,Long v1) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnBII extends Function2<Boolean,Integer,Integer>,PFunction{
      int accept(boolean v0,int v1);
      @Override
      default Integer apply(Boolean v0,Integer v1) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnBIB extends Function2<Boolean,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,int v1);
      @Override
      default Boolean apply(Boolean v0,Integer v1) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnBID extends Function2<Boolean,Integer,Double>,PFunction{
      double accept(boolean v0,int v1);
      @Override
      default Double apply(Boolean v0,Integer v1) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnBIL extends Function2<Boolean,Integer,Long>,PFunction{
      long accept(boolean v0,int v1);
      @Override
      default Long apply(Boolean v0,Integer v1) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnBBI extends Function2<Boolean,Boolean,Integer>,PFunction{
      int accept(boolean v0,boolean v1);
      @Override
      default Integer apply(Boolean v0,Boolean v1) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnBBB extends Function2<Boolean,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1);
      @Override
      default Boolean apply(Boolean v0,Boolean v1) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnBBD extends Function2<Boolean,Boolean,Double>,PFunction{
      double accept(boolean v0,boolean v1);
      @Override
      default Double apply(Boolean v0,Boolean v1) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnBBL extends Function2<Boolean,Boolean,Long>,PFunction{
      long accept(boolean v0,boolean v1);
      @Override
      default Long apply(Boolean v0,Boolean v1) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnBDI extends Function2<Boolean,Double,Integer>,PFunction{
      int accept(boolean v0,double v1);
      @Override
      default Integer apply(Boolean v0,Double v1) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnBDB extends Function2<Boolean,Double,Boolean>,PFunction{
      boolean accept(boolean v0,double v1);
      @Override
      default Boolean apply(Boolean v0,Double v1) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnBDD extends Function2<Boolean,Double,Double>,PFunction{
      double accept(boolean v0,double v1);
      @Override
      default Double apply(Boolean v0,Double v1) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnBDL extends Function2<Boolean,Double,Long>,PFunction{
      long accept(boolean v0,double v1);
      @Override
      default Long apply(Boolean v0,Double v1) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnBLI extends Function2<Boolean,Long,Integer>,PFunction{
      int accept(boolean v0,long v1);
      @Override
      default Integer apply(Boolean v0,Long v1) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnBLB extends Function2<Boolean,Long,Boolean>,PFunction{
      boolean accept(boolean v0,long v1);
      @Override
      default Boolean apply(Boolean v0,Long v1) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnBLD extends Function2<Boolean,Long,Double>,PFunction{
      double accept(boolean v0,long v1);
      @Override
      default Double apply(Boolean v0,Long v1) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnBLL extends Function2<Boolean,Long,Long>,PFunction{
      long accept(boolean v0,long v1);
      @Override
      default Long apply(Boolean v0,Long v1) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnDII extends Function2<Double,Integer,Integer>,PFunction{
      int accept(double v0,int v1);
      @Override
      default Integer apply(Double v0,Integer v1) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnDIB extends Function2<Double,Integer,Boolean>,PFunction{
      boolean accept(double v0,int v1);
      @Override
      default Boolean apply(Double v0,Integer v1) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnDID extends Function2<Double,Integer,Double>,PFunction{
      double accept(double v0,int v1);
      @Override
      default Double apply(Double v0,Integer v1) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnDIL extends Function2<Double,Integer,Long>,PFunction{
      long accept(double v0,int v1);
      @Override
      default Long apply(Double v0,Integer v1) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnDBI extends Function2<Double,Boolean,Integer>,PFunction{
      int accept(double v0,boolean v1);
      @Override
      default Integer apply(Double v0,Boolean v1) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnDBB extends Function2<Double,Boolean,Boolean>,PFunction{
      boolean accept(double v0,boolean v1);
      @Override
      default Boolean apply(Double v0,Boolean v1) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnDBD extends Function2<Double,Boolean,Double>,PFunction{
      double accept(double v0,boolean v1);
      @Override
      default Double apply(Double v0,Boolean v1) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnDBL extends Function2<Double,Boolean,Long>,PFunction{
      long accept(double v0,boolean v1);
      @Override
      default Long apply(Double v0,Boolean v1) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnDDI extends Function2<Double,Double,Integer>,PFunction{
      int accept(double v0,double v1);
      @Override
      default Integer apply(Double v0,Double v1) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnDDB extends Function2<Double,Double,Boolean>,PFunction{
      boolean accept(double v0,double v1);
      @Override
      default Boolean apply(Double v0,Double v1) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnDDD extends Function2<Double,Double,Double>,PFunction{
      double accept(double v0,double v1);
      @Override
      default Double apply(Double v0,Double v1) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnDDL extends Function2<Double,Double,Long>,PFunction{
      long accept(double v0,double v1);
      @Override
      default Long apply(Double v0,Double v1) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnDLI extends Function2<Double,Long,Integer>,PFunction{
      int accept(double v0,long v1);
      @Override
      default Integer apply(Double v0,Long v1) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnDLB extends Function2<Double,Long,Boolean>,PFunction{
      boolean accept(double v0,long v1);
      @Override
      default Boolean apply(Double v0,Long v1) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnDLD extends Function2<Double,Long,Double>,PFunction{
      double accept(double v0,long v1);
      @Override
      default Double apply(Double v0,Long v1) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnDLL extends Function2<Double,Long,Long>,PFunction{
      long accept(double v0,long v1);
      @Override
      default Long apply(Double v0,Long v1) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnLII extends Function2<Long,Integer,Integer>,PFunction{
      int accept(long v0,int v1);
      @Override
      default Integer apply(Long v0,Integer v1) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnLIB extends Function2<Long,Integer,Boolean>,PFunction{
      boolean accept(long v0,int v1);
      @Override
      default Boolean apply(Long v0,Integer v1) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnLID extends Function2<Long,Integer,Double>,PFunction{
      double accept(long v0,int v1);
      @Override
      default Double apply(Long v0,Integer v1) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnLIL extends Function2<Long,Integer,Long>,PFunction{
      long accept(long v0,int v1);
      @Override
      default Long apply(Long v0,Integer v1) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface FnLBI extends Function2<Long,Boolean,Integer>,PFunction{
      int accept(long v0,boolean v1);
      @Override
      default Integer apply(Long v0,Boolean v1) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnLBB extends Function2<Long,Boolean,Boolean>,PFunction{
      boolean accept(long v0,boolean v1);
      @Override
      default Boolean apply(Long v0,Boolean v1) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnLBD extends Function2<Long,Boolean,Double>,PFunction{
      double accept(long v0,boolean v1);
      @Override
      default Double apply(Long v0,Boolean v1) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnLBL extends Function2<Long,Boolean,Long>,PFunction{
      long accept(long v0,boolean v1);
      @Override
      default Long apply(Long v0,Boolean v1) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface FnLDI extends Function2<Long,Double,Integer>,PFunction{
      int accept(long v0,double v1);
      @Override
      default Integer apply(Long v0,Double v1) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnLDB extends Function2<Long,Double,Boolean>,PFunction{
      boolean accept(long v0,double v1);
      @Override
      default Boolean apply(Long v0,Double v1) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnLDD extends Function2<Long,Double,Double>,PFunction{
      double accept(long v0,double v1);
      @Override
      default Double apply(Long v0,Double v1) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnLDL extends Function2<Long,Double,Long>,PFunction{
      long accept(long v0,double v1);
      @Override
      default Long apply(Long v0,Double v1) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface FnLLI extends Function2<Long,Long,Integer>,PFunction{
      int accept(long v0,long v1);
      @Override
      default Integer apply(Long v0,Long v1) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnLLB extends Function2<Long,Long,Boolean>,PFunction{
      boolean accept(long v0,long v1);
      @Override
      default Boolean apply(Long v0,Long v1) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnLLD extends Function2<Long,Long,Double>,PFunction{
      double accept(long v0,long v1);
      @Override
      default Double apply(Long v0,Long v1) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnLLL extends Function2<Long,Long,Long>,PFunction{
      long accept(long v0,long v1);
      @Override
      default Long apply(Long v0,Long v1) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface FnIIII extends Function3<Integer,Integer,Integer,Integer>,PFunction{
      int accept(int v0,int v1,int v2);
      @Override
      default Integer apply(Integer v0,Integer v1,Integer v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIIIB extends Function3<Integer,Integer,Integer,Boolean>,PFunction{
      boolean accept(int v0,int v1,int v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIIID extends Function3<Integer,Integer,Integer,Double>,PFunction{
      double accept(int v0,int v1,int v2);
      @Override
      default Double apply(Integer v0,Integer v1,Integer v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIIIL extends Function3<Integer,Integer,Integer,Long>,PFunction{
      long accept(int v0,int v1,int v2);
      @Override
      default Long apply(Integer v0,Integer v1,Integer v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIIBI extends Function3<Integer,Integer,Boolean,Integer>,PFunction{
      int accept(int v0,int v1,boolean v2);
      @Override
      default Integer apply(Integer v0,Integer v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIIBB extends Function3<Integer,Integer,Boolean,Boolean>,PFunction{
      boolean accept(int v0,int v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIIBD extends Function3<Integer,Integer,Boolean,Double>,PFunction{
      double accept(int v0,int v1,boolean v2);
      @Override
      default Double apply(Integer v0,Integer v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIIBL extends Function3<Integer,Integer,Boolean,Long>,PFunction{
      long accept(int v0,int v1,boolean v2);
      @Override
      default Long apply(Integer v0,Integer v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIIDI extends Function3<Integer,Integer,Double,Integer>,PFunction{
      int accept(int v0,int v1,double v2);
      @Override
      default Integer apply(Integer v0,Integer v1,Double v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIIDB extends Function3<Integer,Integer,Double,Boolean>,PFunction{
      boolean accept(int v0,int v1,double v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIIDD extends Function3<Integer,Integer,Double,Double>,PFunction{
      double accept(int v0,int v1,double v2);
      @Override
      default Double apply(Integer v0,Integer v1,Double v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIIDL extends Function3<Integer,Integer,Double,Long>,PFunction{
      long accept(int v0,int v1,double v2);
      @Override
      default Long apply(Integer v0,Integer v1,Double v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIILI extends Function3<Integer,Integer,Long,Integer>,PFunction{
      int accept(int v0,int v1,long v2);
      @Override
      default Integer apply(Integer v0,Integer v1,Long v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIILB extends Function3<Integer,Integer,Long,Boolean>,PFunction{
      boolean accept(int v0,int v1,long v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIILD extends Function3<Integer,Integer,Long,Double>,PFunction{
      double accept(int v0,int v1,long v2);
      @Override
      default Double apply(Integer v0,Integer v1,Long v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIILL extends Function3<Integer,Integer,Long,Long>,PFunction{
      long accept(int v0,int v1,long v2);
      @Override
      default Long apply(Integer v0,Integer v1,Long v2) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIBII extends Function3<Integer,Boolean,Integer,Integer>,PFunction{
      int accept(int v0,boolean v1,int v2);
      @Override
      default Integer apply(Integer v0,Boolean v1,Integer v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIBIB extends Function3<Integer,Boolean,Integer,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,int v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIBID extends Function3<Integer,Boolean,Integer,Double>,PFunction{
      double accept(int v0,boolean v1,int v2);
      @Override
      default Double apply(Integer v0,Boolean v1,Integer v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIBIL extends Function3<Integer,Boolean,Integer,Long>,PFunction{
      long accept(int v0,boolean v1,int v2);
      @Override
      default Long apply(Integer v0,Boolean v1,Integer v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIBBI extends Function3<Integer,Boolean,Boolean,Integer>,PFunction{
      int accept(int v0,boolean v1,boolean v2);
      @Override
      default Integer apply(Integer v0,Boolean v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIBBB extends Function3<Integer,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIBBD extends Function3<Integer,Boolean,Boolean,Double>,PFunction{
      double accept(int v0,boolean v1,boolean v2);
      @Override
      default Double apply(Integer v0,Boolean v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIBBL extends Function3<Integer,Boolean,Boolean,Long>,PFunction{
      long accept(int v0,boolean v1,boolean v2);
      @Override
      default Long apply(Integer v0,Boolean v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIBDI extends Function3<Integer,Boolean,Double,Integer>,PFunction{
      int accept(int v0,boolean v1,double v2);
      @Override
      default Integer apply(Integer v0,Boolean v1,Double v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIBDB extends Function3<Integer,Boolean,Double,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,double v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIBDD extends Function3<Integer,Boolean,Double,Double>,PFunction{
      double accept(int v0,boolean v1,double v2);
      @Override
      default Double apply(Integer v0,Boolean v1,Double v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIBDL extends Function3<Integer,Boolean,Double,Long>,PFunction{
      long accept(int v0,boolean v1,double v2);
      @Override
      default Long apply(Integer v0,Boolean v1,Double v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIBLI extends Function3<Integer,Boolean,Long,Integer>,PFunction{
      int accept(int v0,boolean v1,long v2);
      @Override
      default Integer apply(Integer v0,Boolean v1,Long v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIBLB extends Function3<Integer,Boolean,Long,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,long v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIBLD extends Function3<Integer,Boolean,Long,Double>,PFunction{
      double accept(int v0,boolean v1,long v2);
      @Override
      default Double apply(Integer v0,Boolean v1,Long v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIBLL extends Function3<Integer,Boolean,Long,Long>,PFunction{
      long accept(int v0,boolean v1,long v2);
      @Override
      default Long apply(Integer v0,Boolean v1,Long v2) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIDII extends Function3<Integer,Double,Integer,Integer>,PFunction{
      int accept(int v0,double v1,int v2);
      @Override
      default Integer apply(Integer v0,Double v1,Integer v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIDIB extends Function3<Integer,Double,Integer,Boolean>,PFunction{
      boolean accept(int v0,double v1,int v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIDID extends Function3<Integer,Double,Integer,Double>,PFunction{
      double accept(int v0,double v1,int v2);
      @Override
      default Double apply(Integer v0,Double v1,Integer v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIDIL extends Function3<Integer,Double,Integer,Long>,PFunction{
      long accept(int v0,double v1,int v2);
      @Override
      default Long apply(Integer v0,Double v1,Integer v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnIDBI extends Function3<Integer,Double,Boolean,Integer>,PFunction{
      int accept(int v0,double v1,boolean v2);
      @Override
      default Integer apply(Integer v0,Double v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIDBB extends Function3<Integer,Double,Boolean,Boolean>,PFunction{
      boolean accept(int v0,double v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIDBD extends Function3<Integer,Double,Boolean,Double>,PFunction{
      double accept(int v0,double v1,boolean v2);
      @Override
      default Double apply(Integer v0,Double v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIDBL extends Function3<Integer,Double,Boolean,Long>,PFunction{
      long accept(int v0,double v1,boolean v2);
      @Override
      default Long apply(Integer v0,Double v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnIDDI extends Function3<Integer,Double,Double,Integer>,PFunction{
      int accept(int v0,double v1,double v2);
      @Override
      default Integer apply(Integer v0,Double v1,Double v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIDDB extends Function3<Integer,Double,Double,Boolean>,PFunction{
      boolean accept(int v0,double v1,double v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIDDD extends Function3<Integer,Double,Double,Double>,PFunction{
      double accept(int v0,double v1,double v2);
      @Override
      default Double apply(Integer v0,Double v1,Double v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIDDL extends Function3<Integer,Double,Double,Long>,PFunction{
      long accept(int v0,double v1,double v2);
      @Override
      default Long apply(Integer v0,Double v1,Double v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnIDLI extends Function3<Integer,Double,Long,Integer>,PFunction{
      int accept(int v0,double v1,long v2);
      @Override
      default Integer apply(Integer v0,Double v1,Long v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIDLB extends Function3<Integer,Double,Long,Boolean>,PFunction{
      boolean accept(int v0,double v1,long v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIDLD extends Function3<Integer,Double,Long,Double>,PFunction{
      double accept(int v0,double v1,long v2);
      @Override
      default Double apply(Integer v0,Double v1,Long v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIDLL extends Function3<Integer,Double,Long,Long>,PFunction{
      long accept(int v0,double v1,long v2);
      @Override
      default Long apply(Integer v0,Double v1,Long v2) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnILII extends Function3<Integer,Long,Integer,Integer>,PFunction{
      int accept(int v0,long v1,int v2);
      @Override
      default Integer apply(Integer v0,Long v1,Integer v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnILIB extends Function3<Integer,Long,Integer,Boolean>,PFunction{
      boolean accept(int v0,long v1,int v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnILID extends Function3<Integer,Long,Integer,Double>,PFunction{
      double accept(int v0,long v1,int v2);
      @Override
      default Double apply(Integer v0,Long v1,Integer v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnILIL extends Function3<Integer,Long,Integer,Long>,PFunction{
      long accept(int v0,long v1,int v2);
      @Override
      default Long apply(Integer v0,Long v1,Integer v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnILBI extends Function3<Integer,Long,Boolean,Integer>,PFunction{
      int accept(int v0,long v1,boolean v2);
      @Override
      default Integer apply(Integer v0,Long v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnILBB extends Function3<Integer,Long,Boolean,Boolean>,PFunction{
      boolean accept(int v0,long v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnILBD extends Function3<Integer,Long,Boolean,Double>,PFunction{
      double accept(int v0,long v1,boolean v2);
      @Override
      default Double apply(Integer v0,Long v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnILBL extends Function3<Integer,Long,Boolean,Long>,PFunction{
      long accept(int v0,long v1,boolean v2);
      @Override
      default Long apply(Integer v0,Long v1,Boolean v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnILDI extends Function3<Integer,Long,Double,Integer>,PFunction{
      int accept(int v0,long v1,double v2);
      @Override
      default Integer apply(Integer v0,Long v1,Double v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnILDB extends Function3<Integer,Long,Double,Boolean>,PFunction{
      boolean accept(int v0,long v1,double v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnILDD extends Function3<Integer,Long,Double,Double>,PFunction{
      double accept(int v0,long v1,double v2);
      @Override
      default Double apply(Integer v0,Long v1,Double v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnILDL extends Function3<Integer,Long,Double,Long>,PFunction{
      long accept(int v0,long v1,double v2);
      @Override
      default Long apply(Integer v0,Long v1,Double v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnILLI extends Function3<Integer,Long,Long,Integer>,PFunction{
      int accept(int v0,long v1,long v2);
      @Override
      default Integer apply(Integer v0,Long v1,Long v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnILLB extends Function3<Integer,Long,Long,Boolean>,PFunction{
      boolean accept(int v0,long v1,long v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnILLD extends Function3<Integer,Long,Long,Double>,PFunction{
      double accept(int v0,long v1,long v2);
      @Override
      default Double apply(Integer v0,Long v1,Long v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnILLL extends Function3<Integer,Long,Long,Long>,PFunction{
      long accept(int v0,long v1,long v2);
      @Override
      default Long apply(Integer v0,Long v1,Long v2) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBIII extends Function3<Boolean,Integer,Integer,Integer>,PFunction{
      int accept(boolean v0,int v1,int v2);
      @Override
      default Integer apply(Boolean v0,Integer v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBIIB extends Function3<Boolean,Integer,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBIID extends Function3<Boolean,Integer,Integer,Double>,PFunction{
      double accept(boolean v0,int v1,int v2);
      @Override
      default Double apply(Boolean v0,Integer v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBIIL extends Function3<Boolean,Integer,Integer,Long>,PFunction{
      long accept(boolean v0,int v1,int v2);
      @Override
      default Long apply(Boolean v0,Integer v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBIBI extends Function3<Boolean,Integer,Boolean,Integer>,PFunction{
      int accept(boolean v0,int v1,boolean v2);
      @Override
      default Integer apply(Boolean v0,Integer v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBIBB extends Function3<Boolean,Integer,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBIBD extends Function3<Boolean,Integer,Boolean,Double>,PFunction{
      double accept(boolean v0,int v1,boolean v2);
      @Override
      default Double apply(Boolean v0,Integer v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBIBL extends Function3<Boolean,Integer,Boolean,Long>,PFunction{
      long accept(boolean v0,int v1,boolean v2);
      @Override
      default Long apply(Boolean v0,Integer v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBIDI extends Function3<Boolean,Integer,Double,Integer>,PFunction{
      int accept(boolean v0,int v1,double v2);
      @Override
      default Integer apply(Boolean v0,Integer v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBIDB extends Function3<Boolean,Integer,Double,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBIDD extends Function3<Boolean,Integer,Double,Double>,PFunction{
      double accept(boolean v0,int v1,double v2);
      @Override
      default Double apply(Boolean v0,Integer v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBIDL extends Function3<Boolean,Integer,Double,Long>,PFunction{
      long accept(boolean v0,int v1,double v2);
      @Override
      default Long apply(Boolean v0,Integer v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBILI extends Function3<Boolean,Integer,Long,Integer>,PFunction{
      int accept(boolean v0,int v1,long v2);
      @Override
      default Integer apply(Boolean v0,Integer v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBILB extends Function3<Boolean,Integer,Long,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBILD extends Function3<Boolean,Integer,Long,Double>,PFunction{
      double accept(boolean v0,int v1,long v2);
      @Override
      default Double apply(Boolean v0,Integer v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBILL extends Function3<Boolean,Integer,Long,Long>,PFunction{
      long accept(boolean v0,int v1,long v2);
      @Override
      default Long apply(Boolean v0,Integer v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBBII extends Function3<Boolean,Boolean,Integer,Integer>,PFunction{
      int accept(boolean v0,boolean v1,int v2);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBBIB extends Function3<Boolean,Boolean,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBBID extends Function3<Boolean,Boolean,Integer,Double>,PFunction{
      double accept(boolean v0,boolean v1,int v2);
      @Override
      default Double apply(Boolean v0,Boolean v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBBIL extends Function3<Boolean,Boolean,Integer,Long>,PFunction{
      long accept(boolean v0,boolean v1,int v2);
      @Override
      default Long apply(Boolean v0,Boolean v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBBBI extends Function3<Boolean,Boolean,Boolean,Integer>,PFunction{
      int accept(boolean v0,boolean v1,boolean v2);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBBBB extends Function3<Boolean,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBBBD extends Function3<Boolean,Boolean,Boolean,Double>,PFunction{
      double accept(boolean v0,boolean v1,boolean v2);
      @Override
      default Double apply(Boolean v0,Boolean v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBBBL extends Function3<Boolean,Boolean,Boolean,Long>,PFunction{
      long accept(boolean v0,boolean v1,boolean v2);
      @Override
      default Long apply(Boolean v0,Boolean v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBBDI extends Function3<Boolean,Boolean,Double,Integer>,PFunction{
      int accept(boolean v0,boolean v1,double v2);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBBDB extends Function3<Boolean,Boolean,Double,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBBDD extends Function3<Boolean,Boolean,Double,Double>,PFunction{
      double accept(boolean v0,boolean v1,double v2);
      @Override
      default Double apply(Boolean v0,Boolean v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBBDL extends Function3<Boolean,Boolean,Double,Long>,PFunction{
      long accept(boolean v0,boolean v1,double v2);
      @Override
      default Long apply(Boolean v0,Boolean v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBBLI extends Function3<Boolean,Boolean,Long,Integer>,PFunction{
      int accept(boolean v0,boolean v1,long v2);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBBLB extends Function3<Boolean,Boolean,Long,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBBLD extends Function3<Boolean,Boolean,Long,Double>,PFunction{
      double accept(boolean v0,boolean v1,long v2);
      @Override
      default Double apply(Boolean v0,Boolean v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBBLL extends Function3<Boolean,Boolean,Long,Long>,PFunction{
      long accept(boolean v0,boolean v1,long v2);
      @Override
      default Long apply(Boolean v0,Boolean v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBDII extends Function3<Boolean,Double,Integer,Integer>,PFunction{
      int accept(boolean v0,double v1,int v2);
      @Override
      default Integer apply(Boolean v0,Double v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBDIB extends Function3<Boolean,Double,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBDID extends Function3<Boolean,Double,Integer,Double>,PFunction{
      double accept(boolean v0,double v1,int v2);
      @Override
      default Double apply(Boolean v0,Double v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBDIL extends Function3<Boolean,Double,Integer,Long>,PFunction{
      long accept(boolean v0,double v1,int v2);
      @Override
      default Long apply(Boolean v0,Double v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBDBI extends Function3<Boolean,Double,Boolean,Integer>,PFunction{
      int accept(boolean v0,double v1,boolean v2);
      @Override
      default Integer apply(Boolean v0,Double v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBDBB extends Function3<Boolean,Double,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBDBD extends Function3<Boolean,Double,Boolean,Double>,PFunction{
      double accept(boolean v0,double v1,boolean v2);
      @Override
      default Double apply(Boolean v0,Double v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBDBL extends Function3<Boolean,Double,Boolean,Long>,PFunction{
      long accept(boolean v0,double v1,boolean v2);
      @Override
      default Long apply(Boolean v0,Double v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBDDI extends Function3<Boolean,Double,Double,Integer>,PFunction{
      int accept(boolean v0,double v1,double v2);
      @Override
      default Integer apply(Boolean v0,Double v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBDDB extends Function3<Boolean,Double,Double,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBDDD extends Function3<Boolean,Double,Double,Double>,PFunction{
      double accept(boolean v0,double v1,double v2);
      @Override
      default Double apply(Boolean v0,Double v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBDDL extends Function3<Boolean,Double,Double,Long>,PFunction{
      long accept(boolean v0,double v1,double v2);
      @Override
      default Long apply(Boolean v0,Double v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBDLI extends Function3<Boolean,Double,Long,Integer>,PFunction{
      int accept(boolean v0,double v1,long v2);
      @Override
      default Integer apply(Boolean v0,Double v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBDLB extends Function3<Boolean,Double,Long,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBDLD extends Function3<Boolean,Double,Long,Double>,PFunction{
      double accept(boolean v0,double v1,long v2);
      @Override
      default Double apply(Boolean v0,Double v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBDLL extends Function3<Boolean,Double,Long,Long>,PFunction{
      long accept(boolean v0,double v1,long v2);
      @Override
      default Long apply(Boolean v0,Double v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBLII extends Function3<Boolean,Long,Integer,Integer>,PFunction{
      int accept(boolean v0,long v1,int v2);
      @Override
      default Integer apply(Boolean v0,Long v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBLIB extends Function3<Boolean,Long,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBLID extends Function3<Boolean,Long,Integer,Double>,PFunction{
      double accept(boolean v0,long v1,int v2);
      @Override
      default Double apply(Boolean v0,Long v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBLIL extends Function3<Boolean,Long,Integer,Long>,PFunction{
      long accept(boolean v0,long v1,int v2);
      @Override
      default Long apply(Boolean v0,Long v1,Integer v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnBLBI extends Function3<Boolean,Long,Boolean,Integer>,PFunction{
      int accept(boolean v0,long v1,boolean v2);
      @Override
      default Integer apply(Boolean v0,Long v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBLBB extends Function3<Boolean,Long,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBLBD extends Function3<Boolean,Long,Boolean,Double>,PFunction{
      double accept(boolean v0,long v1,boolean v2);
      @Override
      default Double apply(Boolean v0,Long v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBLBL extends Function3<Boolean,Long,Boolean,Long>,PFunction{
      long accept(boolean v0,long v1,boolean v2);
      @Override
      default Long apply(Boolean v0,Long v1,Boolean v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnBLDI extends Function3<Boolean,Long,Double,Integer>,PFunction{
      int accept(boolean v0,long v1,double v2);
      @Override
      default Integer apply(Boolean v0,Long v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBLDB extends Function3<Boolean,Long,Double,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBLDD extends Function3<Boolean,Long,Double,Double>,PFunction{
      double accept(boolean v0,long v1,double v2);
      @Override
      default Double apply(Boolean v0,Long v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBLDL extends Function3<Boolean,Long,Double,Long>,PFunction{
      long accept(boolean v0,long v1,double v2);
      @Override
      default Long apply(Boolean v0,Long v1,Double v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnBLLI extends Function3<Boolean,Long,Long,Integer>,PFunction{
      int accept(boolean v0,long v1,long v2);
      @Override
      default Integer apply(Boolean v0,Long v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBLLB extends Function3<Boolean,Long,Long,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBLLD extends Function3<Boolean,Long,Long,Double>,PFunction{
      double accept(boolean v0,long v1,long v2);
      @Override
      default Double apply(Boolean v0,Long v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnBLLL extends Function3<Boolean,Long,Long,Long>,PFunction{
      long accept(boolean v0,long v1,long v2);
      @Override
      default Long apply(Boolean v0,Long v1,Long v2) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDIII extends Function3<Double,Integer,Integer,Integer>,PFunction{
      int accept(double v0,int v1,int v2);
      @Override
      default Integer apply(Double v0,Integer v1,Integer v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDIIB extends Function3<Double,Integer,Integer,Boolean>,PFunction{
      boolean accept(double v0,int v1,int v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDIID extends Function3<Double,Integer,Integer,Double>,PFunction{
      double accept(double v0,int v1,int v2);
      @Override
      default Double apply(Double v0,Integer v1,Integer v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDIIL extends Function3<Double,Integer,Integer,Long>,PFunction{
      long accept(double v0,int v1,int v2);
      @Override
      default Long apply(Double v0,Integer v1,Integer v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDIBI extends Function3<Double,Integer,Boolean,Integer>,PFunction{
      int accept(double v0,int v1,boolean v2);
      @Override
      default Integer apply(Double v0,Integer v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDIBB extends Function3<Double,Integer,Boolean,Boolean>,PFunction{
      boolean accept(double v0,int v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDIBD extends Function3<Double,Integer,Boolean,Double>,PFunction{
      double accept(double v0,int v1,boolean v2);
      @Override
      default Double apply(Double v0,Integer v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDIBL extends Function3<Double,Integer,Boolean,Long>,PFunction{
      long accept(double v0,int v1,boolean v2);
      @Override
      default Long apply(Double v0,Integer v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDIDI extends Function3<Double,Integer,Double,Integer>,PFunction{
      int accept(double v0,int v1,double v2);
      @Override
      default Integer apply(Double v0,Integer v1,Double v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDIDB extends Function3<Double,Integer,Double,Boolean>,PFunction{
      boolean accept(double v0,int v1,double v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDIDD extends Function3<Double,Integer,Double,Double>,PFunction{
      double accept(double v0,int v1,double v2);
      @Override
      default Double apply(Double v0,Integer v1,Double v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDIDL extends Function3<Double,Integer,Double,Long>,PFunction{
      long accept(double v0,int v1,double v2);
      @Override
      default Long apply(Double v0,Integer v1,Double v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDILI extends Function3<Double,Integer,Long,Integer>,PFunction{
      int accept(double v0,int v1,long v2);
      @Override
      default Integer apply(Double v0,Integer v1,Long v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDILB extends Function3<Double,Integer,Long,Boolean>,PFunction{
      boolean accept(double v0,int v1,long v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDILD extends Function3<Double,Integer,Long,Double>,PFunction{
      double accept(double v0,int v1,long v2);
      @Override
      default Double apply(Double v0,Integer v1,Long v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDILL extends Function3<Double,Integer,Long,Long>,PFunction{
      long accept(double v0,int v1,long v2);
      @Override
      default Long apply(Double v0,Integer v1,Long v2) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDBII extends Function3<Double,Boolean,Integer,Integer>,PFunction{
      int accept(double v0,boolean v1,int v2);
      @Override
      default Integer apply(Double v0,Boolean v1,Integer v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDBIB extends Function3<Double,Boolean,Integer,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,int v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDBID extends Function3<Double,Boolean,Integer,Double>,PFunction{
      double accept(double v0,boolean v1,int v2);
      @Override
      default Double apply(Double v0,Boolean v1,Integer v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDBIL extends Function3<Double,Boolean,Integer,Long>,PFunction{
      long accept(double v0,boolean v1,int v2);
      @Override
      default Long apply(Double v0,Boolean v1,Integer v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDBBI extends Function3<Double,Boolean,Boolean,Integer>,PFunction{
      int accept(double v0,boolean v1,boolean v2);
      @Override
      default Integer apply(Double v0,Boolean v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDBBB extends Function3<Double,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDBBD extends Function3<Double,Boolean,Boolean,Double>,PFunction{
      double accept(double v0,boolean v1,boolean v2);
      @Override
      default Double apply(Double v0,Boolean v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDBBL extends Function3<Double,Boolean,Boolean,Long>,PFunction{
      long accept(double v0,boolean v1,boolean v2);
      @Override
      default Long apply(Double v0,Boolean v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDBDI extends Function3<Double,Boolean,Double,Integer>,PFunction{
      int accept(double v0,boolean v1,double v2);
      @Override
      default Integer apply(Double v0,Boolean v1,Double v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDBDB extends Function3<Double,Boolean,Double,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,double v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDBDD extends Function3<Double,Boolean,Double,Double>,PFunction{
      double accept(double v0,boolean v1,double v2);
      @Override
      default Double apply(Double v0,Boolean v1,Double v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDBDL extends Function3<Double,Boolean,Double,Long>,PFunction{
      long accept(double v0,boolean v1,double v2);
      @Override
      default Long apply(Double v0,Boolean v1,Double v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDBLI extends Function3<Double,Boolean,Long,Integer>,PFunction{
      int accept(double v0,boolean v1,long v2);
      @Override
      default Integer apply(Double v0,Boolean v1,Long v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDBLB extends Function3<Double,Boolean,Long,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,long v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDBLD extends Function3<Double,Boolean,Long,Double>,PFunction{
      double accept(double v0,boolean v1,long v2);
      @Override
      default Double apply(Double v0,Boolean v1,Long v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDBLL extends Function3<Double,Boolean,Long,Long>,PFunction{
      long accept(double v0,boolean v1,long v2);
      @Override
      default Long apply(Double v0,Boolean v1,Long v2) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDDII extends Function3<Double,Double,Integer,Integer>,PFunction{
      int accept(double v0,double v1,int v2);
      @Override
      default Integer apply(Double v0,Double v1,Integer v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDDIB extends Function3<Double,Double,Integer,Boolean>,PFunction{
      boolean accept(double v0,double v1,int v2);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDDID extends Function3<Double,Double,Integer,Double>,PFunction{
      double accept(double v0,double v1,int v2);
      @Override
      default Double apply(Double v0,Double v1,Integer v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDDIL extends Function3<Double,Double,Integer,Long>,PFunction{
      long accept(double v0,double v1,int v2);
      @Override
      default Long apply(Double v0,Double v1,Integer v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDDBI extends Function3<Double,Double,Boolean,Integer>,PFunction{
      int accept(double v0,double v1,boolean v2);
      @Override
      default Integer apply(Double v0,Double v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDDBB extends Function3<Double,Double,Boolean,Boolean>,PFunction{
      boolean accept(double v0,double v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDDBD extends Function3<Double,Double,Boolean,Double>,PFunction{
      double accept(double v0,double v1,boolean v2);
      @Override
      default Double apply(Double v0,Double v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDDBL extends Function3<Double,Double,Boolean,Long>,PFunction{
      long accept(double v0,double v1,boolean v2);
      @Override
      default Long apply(Double v0,Double v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDDDI extends Function3<Double,Double,Double,Integer>,PFunction{
      int accept(double v0,double v1,double v2);
      @Override
      default Integer apply(Double v0,Double v1,Double v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDDDB extends Function3<Double,Double,Double,Boolean>,PFunction{
      boolean accept(double v0,double v1,double v2);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDDDD extends Function3<Double,Double,Double,Double>,PFunction{
      double accept(double v0,double v1,double v2);
      @Override
      default Double apply(Double v0,Double v1,Double v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDDDL extends Function3<Double,Double,Double,Long>,PFunction{
      long accept(double v0,double v1,double v2);
      @Override
      default Long apply(Double v0,Double v1,Double v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDDLI extends Function3<Double,Double,Long,Integer>,PFunction{
      int accept(double v0,double v1,long v2);
      @Override
      default Integer apply(Double v0,Double v1,Long v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDDLB extends Function3<Double,Double,Long,Boolean>,PFunction{
      boolean accept(double v0,double v1,long v2);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDDLD extends Function3<Double,Double,Long,Double>,PFunction{
      double accept(double v0,double v1,long v2);
      @Override
      default Double apply(Double v0,Double v1,Long v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDDLL extends Function3<Double,Double,Long,Long>,PFunction{
      long accept(double v0,double v1,long v2);
      @Override
      default Long apply(Double v0,Double v1,Long v2) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDLII extends Function3<Double,Long,Integer,Integer>,PFunction{
      int accept(double v0,long v1,int v2);
      @Override
      default Integer apply(Double v0,Long v1,Integer v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDLIB extends Function3<Double,Long,Integer,Boolean>,PFunction{
      boolean accept(double v0,long v1,int v2);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDLID extends Function3<Double,Long,Integer,Double>,PFunction{
      double accept(double v0,long v1,int v2);
      @Override
      default Double apply(Double v0,Long v1,Integer v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDLIL extends Function3<Double,Long,Integer,Long>,PFunction{
      long accept(double v0,long v1,int v2);
      @Override
      default Long apply(Double v0,Long v1,Integer v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnDLBI extends Function3<Double,Long,Boolean,Integer>,PFunction{
      int accept(double v0,long v1,boolean v2);
      @Override
      default Integer apply(Double v0,Long v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDLBB extends Function3<Double,Long,Boolean,Boolean>,PFunction{
      boolean accept(double v0,long v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDLBD extends Function3<Double,Long,Boolean,Double>,PFunction{
      double accept(double v0,long v1,boolean v2);
      @Override
      default Double apply(Double v0,Long v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDLBL extends Function3<Double,Long,Boolean,Long>,PFunction{
      long accept(double v0,long v1,boolean v2);
      @Override
      default Long apply(Double v0,Long v1,Boolean v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnDLDI extends Function3<Double,Long,Double,Integer>,PFunction{
      int accept(double v0,long v1,double v2);
      @Override
      default Integer apply(Double v0,Long v1,Double v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDLDB extends Function3<Double,Long,Double,Boolean>,PFunction{
      boolean accept(double v0,long v1,double v2);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDLDD extends Function3<Double,Long,Double,Double>,PFunction{
      double accept(double v0,long v1,double v2);
      @Override
      default Double apply(Double v0,Long v1,Double v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDLDL extends Function3<Double,Long,Double,Long>,PFunction{
      long accept(double v0,long v1,double v2);
      @Override
      default Long apply(Double v0,Long v1,Double v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnDLLI extends Function3<Double,Long,Long,Integer>,PFunction{
      int accept(double v0,long v1,long v2);
      @Override
      default Integer apply(Double v0,Long v1,Long v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDLLB extends Function3<Double,Long,Long,Boolean>,PFunction{
      boolean accept(double v0,long v1,long v2);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDLLD extends Function3<Double,Long,Long,Double>,PFunction{
      double accept(double v0,long v1,long v2);
      @Override
      default Double apply(Double v0,Long v1,Long v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnDLLL extends Function3<Double,Long,Long,Long>,PFunction{
      long accept(double v0,long v1,long v2);
      @Override
      default Long apply(Double v0,Long v1,Long v2) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLIII extends Function3<Long,Integer,Integer,Integer>,PFunction{
      int accept(long v0,int v1,int v2);
      @Override
      default Integer apply(Long v0,Integer v1,Integer v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLIIB extends Function3<Long,Integer,Integer,Boolean>,PFunction{
      boolean accept(long v0,int v1,int v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLIID extends Function3<Long,Integer,Integer,Double>,PFunction{
      double accept(long v0,int v1,int v2);
      @Override
      default Double apply(Long v0,Integer v1,Integer v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLIIL extends Function3<Long,Integer,Integer,Long>,PFunction{
      long accept(long v0,int v1,int v2);
      @Override
      default Long apply(Long v0,Integer v1,Integer v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLIBI extends Function3<Long,Integer,Boolean,Integer>,PFunction{
      int accept(long v0,int v1,boolean v2);
      @Override
      default Integer apply(Long v0,Integer v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLIBB extends Function3<Long,Integer,Boolean,Boolean>,PFunction{
      boolean accept(long v0,int v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLIBD extends Function3<Long,Integer,Boolean,Double>,PFunction{
      double accept(long v0,int v1,boolean v2);
      @Override
      default Double apply(Long v0,Integer v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLIBL extends Function3<Long,Integer,Boolean,Long>,PFunction{
      long accept(long v0,int v1,boolean v2);
      @Override
      default Long apply(Long v0,Integer v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLIDI extends Function3<Long,Integer,Double,Integer>,PFunction{
      int accept(long v0,int v1,double v2);
      @Override
      default Integer apply(Long v0,Integer v1,Double v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLIDB extends Function3<Long,Integer,Double,Boolean>,PFunction{
      boolean accept(long v0,int v1,double v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLIDD extends Function3<Long,Integer,Double,Double>,PFunction{
      double accept(long v0,int v1,double v2);
      @Override
      default Double apply(Long v0,Integer v1,Double v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLIDL extends Function3<Long,Integer,Double,Long>,PFunction{
      long accept(long v0,int v1,double v2);
      @Override
      default Long apply(Long v0,Integer v1,Double v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLILI extends Function3<Long,Integer,Long,Integer>,PFunction{
      int accept(long v0,int v1,long v2);
      @Override
      default Integer apply(Long v0,Integer v1,Long v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLILB extends Function3<Long,Integer,Long,Boolean>,PFunction{
      boolean accept(long v0,int v1,long v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLILD extends Function3<Long,Integer,Long,Double>,PFunction{
      double accept(long v0,int v1,long v2);
      @Override
      default Double apply(Long v0,Integer v1,Long v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLILL extends Function3<Long,Integer,Long,Long>,PFunction{
      long accept(long v0,int v1,long v2);
      @Override
      default Long apply(Long v0,Integer v1,Long v2) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLBII extends Function3<Long,Boolean,Integer,Integer>,PFunction{
      int accept(long v0,boolean v1,int v2);
      @Override
      default Integer apply(Long v0,Boolean v1,Integer v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLBIB extends Function3<Long,Boolean,Integer,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,int v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLBID extends Function3<Long,Boolean,Integer,Double>,PFunction{
      double accept(long v0,boolean v1,int v2);
      @Override
      default Double apply(Long v0,Boolean v1,Integer v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLBIL extends Function3<Long,Boolean,Integer,Long>,PFunction{
      long accept(long v0,boolean v1,int v2);
      @Override
      default Long apply(Long v0,Boolean v1,Integer v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLBBI extends Function3<Long,Boolean,Boolean,Integer>,PFunction{
      int accept(long v0,boolean v1,boolean v2);
      @Override
      default Integer apply(Long v0,Boolean v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLBBB extends Function3<Long,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLBBD extends Function3<Long,Boolean,Boolean,Double>,PFunction{
      double accept(long v0,boolean v1,boolean v2);
      @Override
      default Double apply(Long v0,Boolean v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLBBL extends Function3<Long,Boolean,Boolean,Long>,PFunction{
      long accept(long v0,boolean v1,boolean v2);
      @Override
      default Long apply(Long v0,Boolean v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLBDI extends Function3<Long,Boolean,Double,Integer>,PFunction{
      int accept(long v0,boolean v1,double v2);
      @Override
      default Integer apply(Long v0,Boolean v1,Double v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLBDB extends Function3<Long,Boolean,Double,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,double v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLBDD extends Function3<Long,Boolean,Double,Double>,PFunction{
      double accept(long v0,boolean v1,double v2);
      @Override
      default Double apply(Long v0,Boolean v1,Double v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLBDL extends Function3<Long,Boolean,Double,Long>,PFunction{
      long accept(long v0,boolean v1,double v2);
      @Override
      default Long apply(Long v0,Boolean v1,Double v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLBLI extends Function3<Long,Boolean,Long,Integer>,PFunction{
      int accept(long v0,boolean v1,long v2);
      @Override
      default Integer apply(Long v0,Boolean v1,Long v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLBLB extends Function3<Long,Boolean,Long,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,long v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLBLD extends Function3<Long,Boolean,Long,Double>,PFunction{
      double accept(long v0,boolean v1,long v2);
      @Override
      default Double apply(Long v0,Boolean v1,Long v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLBLL extends Function3<Long,Boolean,Long,Long>,PFunction{
      long accept(long v0,boolean v1,long v2);
      @Override
      default Long apply(Long v0,Boolean v1,Long v2) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLDII extends Function3<Long,Double,Integer,Integer>,PFunction{
      int accept(long v0,double v1,int v2);
      @Override
      default Integer apply(Long v0,Double v1,Integer v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLDIB extends Function3<Long,Double,Integer,Boolean>,PFunction{
      boolean accept(long v0,double v1,int v2);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLDID extends Function3<Long,Double,Integer,Double>,PFunction{
      double accept(long v0,double v1,int v2);
      @Override
      default Double apply(Long v0,Double v1,Integer v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLDIL extends Function3<Long,Double,Integer,Long>,PFunction{
      long accept(long v0,double v1,int v2);
      @Override
      default Long apply(Long v0,Double v1,Integer v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLDBI extends Function3<Long,Double,Boolean,Integer>,PFunction{
      int accept(long v0,double v1,boolean v2);
      @Override
      default Integer apply(Long v0,Double v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLDBB extends Function3<Long,Double,Boolean,Boolean>,PFunction{
      boolean accept(long v0,double v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLDBD extends Function3<Long,Double,Boolean,Double>,PFunction{
      double accept(long v0,double v1,boolean v2);
      @Override
      default Double apply(Long v0,Double v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLDBL extends Function3<Long,Double,Boolean,Long>,PFunction{
      long accept(long v0,double v1,boolean v2);
      @Override
      default Long apply(Long v0,Double v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLDDI extends Function3<Long,Double,Double,Integer>,PFunction{
      int accept(long v0,double v1,double v2);
      @Override
      default Integer apply(Long v0,Double v1,Double v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLDDB extends Function3<Long,Double,Double,Boolean>,PFunction{
      boolean accept(long v0,double v1,double v2);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLDDD extends Function3<Long,Double,Double,Double>,PFunction{
      double accept(long v0,double v1,double v2);
      @Override
      default Double apply(Long v0,Double v1,Double v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLDDL extends Function3<Long,Double,Double,Long>,PFunction{
      long accept(long v0,double v1,double v2);
      @Override
      default Long apply(Long v0,Double v1,Double v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLDLI extends Function3<Long,Double,Long,Integer>,PFunction{
      int accept(long v0,double v1,long v2);
      @Override
      default Integer apply(Long v0,Double v1,Long v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLDLB extends Function3<Long,Double,Long,Boolean>,PFunction{
      boolean accept(long v0,double v1,long v2);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLDLD extends Function3<Long,Double,Long,Double>,PFunction{
      double accept(long v0,double v1,long v2);
      @Override
      default Double apply(Long v0,Double v1,Long v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLDLL extends Function3<Long,Double,Long,Long>,PFunction{
      long accept(long v0,double v1,long v2);
      @Override
      default Long apply(Long v0,Double v1,Long v2) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLLII extends Function3<Long,Long,Integer,Integer>,PFunction{
      int accept(long v0,long v1,int v2);
      @Override
      default Integer apply(Long v0,Long v1,Integer v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLLIB extends Function3<Long,Long,Integer,Boolean>,PFunction{
      boolean accept(long v0,long v1,int v2);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLLID extends Function3<Long,Long,Integer,Double>,PFunction{
      double accept(long v0,long v1,int v2);
      @Override
      default Double apply(Long v0,Long v1,Integer v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLLIL extends Function3<Long,Long,Integer,Long>,PFunction{
      long accept(long v0,long v1,int v2);
      @Override
      default Long apply(Long v0,Long v1,Integer v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface FnLLBI extends Function3<Long,Long,Boolean,Integer>,PFunction{
      int accept(long v0,long v1,boolean v2);
      @Override
      default Integer apply(Long v0,Long v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLLBB extends Function3<Long,Long,Boolean,Boolean>,PFunction{
      boolean accept(long v0,long v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLLBD extends Function3<Long,Long,Boolean,Double>,PFunction{
      double accept(long v0,long v1,boolean v2);
      @Override
      default Double apply(Long v0,Long v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLLBL extends Function3<Long,Long,Boolean,Long>,PFunction{
      long accept(long v0,long v1,boolean v2);
      @Override
      default Long apply(Long v0,Long v1,Boolean v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface FnLLDI extends Function3<Long,Long,Double,Integer>,PFunction{
      int accept(long v0,long v1,double v2);
      @Override
      default Integer apply(Long v0,Long v1,Double v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLLDB extends Function3<Long,Long,Double,Boolean>,PFunction{
      boolean accept(long v0,long v1,double v2);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLLDD extends Function3<Long,Long,Double,Double>,PFunction{
      double accept(long v0,long v1,double v2);
      @Override
      default Double apply(Long v0,Long v1,Double v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLLDL extends Function3<Long,Long,Double,Long>,PFunction{
      long accept(long v0,long v1,double v2);
      @Override
      default Long apply(Long v0,Long v1,Double v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface FnLLLI extends Function3<Long,Long,Long,Integer>,PFunction{
      int accept(long v0,long v1,long v2);
      @Override
      default Integer apply(Long v0,Long v1,Long v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLLLB extends Function3<Long,Long,Long,Boolean>,PFunction{
      boolean accept(long v0,long v1,long v2);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLLLD extends Function3<Long,Long,Long,Double>,PFunction{
      double accept(long v0,long v1,long v2);
      @Override
      default Double apply(Long v0,Long v1,Long v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnLLLL extends Function3<Long,Long,Long,Long>,PFunction{
      long accept(long v0,long v1,long v2);
      @Override
      default Long apply(Long v0,Long v1,Long v2) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface FnIIIII extends Function4<Integer,Integer,Integer,Integer,Integer>,PFunction{
      int accept(int v0,int v1,int v2,int v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIIIB extends Function4<Integer,Integer,Integer,Integer,Boolean>,PFunction{
      boolean accept(int v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIIID extends Function4<Integer,Integer,Integer,Integer,Double>,PFunction{
      double accept(int v0,int v1,int v2,int v3);
      @Override
      default Double apply(Integer v0,Integer v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIIIL extends Function4<Integer,Integer,Integer,Integer,Long>,PFunction{
      long accept(int v0,int v1,int v2,int v3);
      @Override
      default Long apply(Integer v0,Integer v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIIBI extends Function4<Integer,Integer,Integer,Boolean,Integer>,PFunction{
      int accept(int v0,int v1,int v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIIBB extends Function4<Integer,Integer,Integer,Boolean,Boolean>,PFunction{
      boolean accept(int v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIIBD extends Function4<Integer,Integer,Integer,Boolean,Double>,PFunction{
      double accept(int v0,int v1,int v2,boolean v3);
      @Override
      default Double apply(Integer v0,Integer v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIIBL extends Function4<Integer,Integer,Integer,Boolean,Long>,PFunction{
      long accept(int v0,int v1,int v2,boolean v3);
      @Override
      default Long apply(Integer v0,Integer v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIIDI extends Function4<Integer,Integer,Integer,Double,Integer>,PFunction{
      int accept(int v0,int v1,int v2,double v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIIDB extends Function4<Integer,Integer,Integer,Double,Boolean>,PFunction{
      boolean accept(int v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIIDD extends Function4<Integer,Integer,Integer,Double,Double>,PFunction{
      double accept(int v0,int v1,int v2,double v3);
      @Override
      default Double apply(Integer v0,Integer v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIIDL extends Function4<Integer,Integer,Integer,Double,Long>,PFunction{
      long accept(int v0,int v1,int v2,double v3);
      @Override
      default Long apply(Integer v0,Integer v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIILI extends Function4<Integer,Integer,Integer,Long,Integer>,PFunction{
      int accept(int v0,int v1,int v2,long v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIILB extends Function4<Integer,Integer,Integer,Long,Boolean>,PFunction{
      boolean accept(int v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIILD extends Function4<Integer,Integer,Integer,Long,Double>,PFunction{
      double accept(int v0,int v1,int v2,long v3);
      @Override
      default Double apply(Integer v0,Integer v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIILL extends Function4<Integer,Integer,Integer,Long,Long>,PFunction{
      long accept(int v0,int v1,int v2,long v3);
      @Override
      default Long apply(Integer v0,Integer v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIBII extends Function4<Integer,Integer,Boolean,Integer,Integer>,PFunction{
      int accept(int v0,int v1,boolean v2,int v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIBIB extends Function4<Integer,Integer,Boolean,Integer,Boolean>,PFunction{
      boolean accept(int v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIBID extends Function4<Integer,Integer,Boolean,Integer,Double>,PFunction{
      double accept(int v0,int v1,boolean v2,int v3);
      @Override
      default Double apply(Integer v0,Integer v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIBIL extends Function4<Integer,Integer,Boolean,Integer,Long>,PFunction{
      long accept(int v0,int v1,boolean v2,int v3);
      @Override
      default Long apply(Integer v0,Integer v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIBBI extends Function4<Integer,Integer,Boolean,Boolean,Integer>,PFunction{
      int accept(int v0,int v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIBBB extends Function4<Integer,Integer,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(int v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIBBD extends Function4<Integer,Integer,Boolean,Boolean,Double>,PFunction{
      double accept(int v0,int v1,boolean v2,boolean v3);
      @Override
      default Double apply(Integer v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIBBL extends Function4<Integer,Integer,Boolean,Boolean,Long>,PFunction{
      long accept(int v0,int v1,boolean v2,boolean v3);
      @Override
      default Long apply(Integer v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIBDI extends Function4<Integer,Integer,Boolean,Double,Integer>,PFunction{
      int accept(int v0,int v1,boolean v2,double v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIBDB extends Function4<Integer,Integer,Boolean,Double,Boolean>,PFunction{
      boolean accept(int v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIBDD extends Function4<Integer,Integer,Boolean,Double,Double>,PFunction{
      double accept(int v0,int v1,boolean v2,double v3);
      @Override
      default Double apply(Integer v0,Integer v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIBDL extends Function4<Integer,Integer,Boolean,Double,Long>,PFunction{
      long accept(int v0,int v1,boolean v2,double v3);
      @Override
      default Long apply(Integer v0,Integer v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIBLI extends Function4<Integer,Integer,Boolean,Long,Integer>,PFunction{
      int accept(int v0,int v1,boolean v2,long v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIBLB extends Function4<Integer,Integer,Boolean,Long,Boolean>,PFunction{
      boolean accept(int v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIBLD extends Function4<Integer,Integer,Boolean,Long,Double>,PFunction{
      double accept(int v0,int v1,boolean v2,long v3);
      @Override
      default Double apply(Integer v0,Integer v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIBLL extends Function4<Integer,Integer,Boolean,Long,Long>,PFunction{
      long accept(int v0,int v1,boolean v2,long v3);
      @Override
      default Long apply(Integer v0,Integer v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIDII extends Function4<Integer,Integer,Double,Integer,Integer>,PFunction{
      int accept(int v0,int v1,double v2,int v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIDIB extends Function4<Integer,Integer,Double,Integer,Boolean>,PFunction{
      boolean accept(int v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIDID extends Function4<Integer,Integer,Double,Integer,Double>,PFunction{
      double accept(int v0,int v1,double v2,int v3);
      @Override
      default Double apply(Integer v0,Integer v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIDIL extends Function4<Integer,Integer,Double,Integer,Long>,PFunction{
      long accept(int v0,int v1,double v2,int v3);
      @Override
      default Long apply(Integer v0,Integer v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIIDBI extends Function4<Integer,Integer,Double,Boolean,Integer>,PFunction{
      int accept(int v0,int v1,double v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIDBB extends Function4<Integer,Integer,Double,Boolean,Boolean>,PFunction{
      boolean accept(int v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIDBD extends Function4<Integer,Integer,Double,Boolean,Double>,PFunction{
      double accept(int v0,int v1,double v2,boolean v3);
      @Override
      default Double apply(Integer v0,Integer v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIDBL extends Function4<Integer,Integer,Double,Boolean,Long>,PFunction{
      long accept(int v0,int v1,double v2,boolean v3);
      @Override
      default Long apply(Integer v0,Integer v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIIDDI extends Function4<Integer,Integer,Double,Double,Integer>,PFunction{
      int accept(int v0,int v1,double v2,double v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIDDB extends Function4<Integer,Integer,Double,Double,Boolean>,PFunction{
      boolean accept(int v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIDDD extends Function4<Integer,Integer,Double,Double,Double>,PFunction{
      double accept(int v0,int v1,double v2,double v3);
      @Override
      default Double apply(Integer v0,Integer v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIDDL extends Function4<Integer,Integer,Double,Double,Long>,PFunction{
      long accept(int v0,int v1,double v2,double v3);
      @Override
      default Long apply(Integer v0,Integer v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIIDLI extends Function4<Integer,Integer,Double,Long,Integer>,PFunction{
      int accept(int v0,int v1,double v2,long v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIDLB extends Function4<Integer,Integer,Double,Long,Boolean>,PFunction{
      boolean accept(int v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIDLD extends Function4<Integer,Integer,Double,Long,Double>,PFunction{
      double accept(int v0,int v1,double v2,long v3);
      @Override
      default Double apply(Integer v0,Integer v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIIDLL extends Function4<Integer,Integer,Double,Long,Long>,PFunction{
      long accept(int v0,int v1,double v2,long v3);
      @Override
      default Long apply(Integer v0,Integer v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIILII extends Function4<Integer,Integer,Long,Integer,Integer>,PFunction{
      int accept(int v0,int v1,long v2,int v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIILIB extends Function4<Integer,Integer,Long,Integer,Boolean>,PFunction{
      boolean accept(int v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIILID extends Function4<Integer,Integer,Long,Integer,Double>,PFunction{
      double accept(int v0,int v1,long v2,int v3);
      @Override
      default Double apply(Integer v0,Integer v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIILIL extends Function4<Integer,Integer,Long,Integer,Long>,PFunction{
      long accept(int v0,int v1,long v2,int v3);
      @Override
      default Long apply(Integer v0,Integer v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIILBI extends Function4<Integer,Integer,Long,Boolean,Integer>,PFunction{
      int accept(int v0,int v1,long v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIILBB extends Function4<Integer,Integer,Long,Boolean,Boolean>,PFunction{
      boolean accept(int v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIILBD extends Function4<Integer,Integer,Long,Boolean,Double>,PFunction{
      double accept(int v0,int v1,long v2,boolean v3);
      @Override
      default Double apply(Integer v0,Integer v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIILBL extends Function4<Integer,Integer,Long,Boolean,Long>,PFunction{
      long accept(int v0,int v1,long v2,boolean v3);
      @Override
      default Long apply(Integer v0,Integer v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIILDI extends Function4<Integer,Integer,Long,Double,Integer>,PFunction{
      int accept(int v0,int v1,long v2,double v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIILDB extends Function4<Integer,Integer,Long,Double,Boolean>,PFunction{
      boolean accept(int v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIILDD extends Function4<Integer,Integer,Long,Double,Double>,PFunction{
      double accept(int v0,int v1,long v2,double v3);
      @Override
      default Double apply(Integer v0,Integer v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIILDL extends Function4<Integer,Integer,Long,Double,Long>,PFunction{
      long accept(int v0,int v1,long v2,double v3);
      @Override
      default Long apply(Integer v0,Integer v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIILLI extends Function4<Integer,Integer,Long,Long,Integer>,PFunction{
      int accept(int v0,int v1,long v2,long v3);
      @Override
      default Integer apply(Integer v0,Integer v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIILLB extends Function4<Integer,Integer,Long,Long,Boolean>,PFunction{
      boolean accept(int v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIILLD extends Function4<Integer,Integer,Long,Long,Double>,PFunction{
      double accept(int v0,int v1,long v2,long v3);
      @Override
      default Double apply(Integer v0,Integer v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIILLL extends Function4<Integer,Integer,Long,Long,Long>,PFunction{
      long accept(int v0,int v1,long v2,long v3);
      @Override
      default Long apply(Integer v0,Integer v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBIII extends Function4<Integer,Boolean,Integer,Integer,Integer>,PFunction{
      int accept(int v0,boolean v1,int v2,int v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBIIB extends Function4<Integer,Boolean,Integer,Integer,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBIID extends Function4<Integer,Boolean,Integer,Integer,Double>,PFunction{
      double accept(int v0,boolean v1,int v2,int v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBIIL extends Function4<Integer,Boolean,Integer,Integer,Long>,PFunction{
      long accept(int v0,boolean v1,int v2,int v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBIBI extends Function4<Integer,Boolean,Integer,Boolean,Integer>,PFunction{
      int accept(int v0,boolean v1,int v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBIBB extends Function4<Integer,Boolean,Integer,Boolean,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBIBD extends Function4<Integer,Boolean,Integer,Boolean,Double>,PFunction{
      double accept(int v0,boolean v1,int v2,boolean v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBIBL extends Function4<Integer,Boolean,Integer,Boolean,Long>,PFunction{
      long accept(int v0,boolean v1,int v2,boolean v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBIDI extends Function4<Integer,Boolean,Integer,Double,Integer>,PFunction{
      int accept(int v0,boolean v1,int v2,double v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBIDB extends Function4<Integer,Boolean,Integer,Double,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBIDD extends Function4<Integer,Boolean,Integer,Double,Double>,PFunction{
      double accept(int v0,boolean v1,int v2,double v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBIDL extends Function4<Integer,Boolean,Integer,Double,Long>,PFunction{
      long accept(int v0,boolean v1,int v2,double v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBILI extends Function4<Integer,Boolean,Integer,Long,Integer>,PFunction{
      int accept(int v0,boolean v1,int v2,long v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBILB extends Function4<Integer,Boolean,Integer,Long,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBILD extends Function4<Integer,Boolean,Integer,Long,Double>,PFunction{
      double accept(int v0,boolean v1,int v2,long v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBILL extends Function4<Integer,Boolean,Integer,Long,Long>,PFunction{
      long accept(int v0,boolean v1,int v2,long v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBBII extends Function4<Integer,Boolean,Boolean,Integer,Integer>,PFunction{
      int accept(int v0,boolean v1,boolean v2,int v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBBIB extends Function4<Integer,Boolean,Boolean,Integer,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBBID extends Function4<Integer,Boolean,Boolean,Integer,Double>,PFunction{
      double accept(int v0,boolean v1,boolean v2,int v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBBIL extends Function4<Integer,Boolean,Boolean,Integer,Long>,PFunction{
      long accept(int v0,boolean v1,boolean v2,int v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBBBI extends Function4<Integer,Boolean,Boolean,Boolean,Integer>,PFunction{
      int accept(int v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBBBB extends Function4<Integer,Boolean,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBBBD extends Function4<Integer,Boolean,Boolean,Boolean,Double>,PFunction{
      double accept(int v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBBBL extends Function4<Integer,Boolean,Boolean,Boolean,Long>,PFunction{
      long accept(int v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBBDI extends Function4<Integer,Boolean,Boolean,Double,Integer>,PFunction{
      int accept(int v0,boolean v1,boolean v2,double v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBBDB extends Function4<Integer,Boolean,Boolean,Double,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBBDD extends Function4<Integer,Boolean,Boolean,Double,Double>,PFunction{
      double accept(int v0,boolean v1,boolean v2,double v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBBDL extends Function4<Integer,Boolean,Boolean,Double,Long>,PFunction{
      long accept(int v0,boolean v1,boolean v2,double v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBBLI extends Function4<Integer,Boolean,Boolean,Long,Integer>,PFunction{
      int accept(int v0,boolean v1,boolean v2,long v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBBLB extends Function4<Integer,Boolean,Boolean,Long,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBBLD extends Function4<Integer,Boolean,Boolean,Long,Double>,PFunction{
      double accept(int v0,boolean v1,boolean v2,long v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBBLL extends Function4<Integer,Boolean,Boolean,Long,Long>,PFunction{
      long accept(int v0,boolean v1,boolean v2,long v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBDII extends Function4<Integer,Boolean,Double,Integer,Integer>,PFunction{
      int accept(int v0,boolean v1,double v2,int v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBDIB extends Function4<Integer,Boolean,Double,Integer,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBDID extends Function4<Integer,Boolean,Double,Integer,Double>,PFunction{
      double accept(int v0,boolean v1,double v2,int v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBDIL extends Function4<Integer,Boolean,Double,Integer,Long>,PFunction{
      long accept(int v0,boolean v1,double v2,int v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBDBI extends Function4<Integer,Boolean,Double,Boolean,Integer>,PFunction{
      int accept(int v0,boolean v1,double v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBDBB extends Function4<Integer,Boolean,Double,Boolean,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBDBD extends Function4<Integer,Boolean,Double,Boolean,Double>,PFunction{
      double accept(int v0,boolean v1,double v2,boolean v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBDBL extends Function4<Integer,Boolean,Double,Boolean,Long>,PFunction{
      long accept(int v0,boolean v1,double v2,boolean v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBDDI extends Function4<Integer,Boolean,Double,Double,Integer>,PFunction{
      int accept(int v0,boolean v1,double v2,double v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBDDB extends Function4<Integer,Boolean,Double,Double,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBDDD extends Function4<Integer,Boolean,Double,Double,Double>,PFunction{
      double accept(int v0,boolean v1,double v2,double v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBDDL extends Function4<Integer,Boolean,Double,Double,Long>,PFunction{
      long accept(int v0,boolean v1,double v2,double v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBDLI extends Function4<Integer,Boolean,Double,Long,Integer>,PFunction{
      int accept(int v0,boolean v1,double v2,long v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBDLB extends Function4<Integer,Boolean,Double,Long,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBDLD extends Function4<Integer,Boolean,Double,Long,Double>,PFunction{
      double accept(int v0,boolean v1,double v2,long v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBDLL extends Function4<Integer,Boolean,Double,Long,Long>,PFunction{
      long accept(int v0,boolean v1,double v2,long v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBLII extends Function4<Integer,Boolean,Long,Integer,Integer>,PFunction{
      int accept(int v0,boolean v1,long v2,int v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBLIB extends Function4<Integer,Boolean,Long,Integer,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBLID extends Function4<Integer,Boolean,Long,Integer,Double>,PFunction{
      double accept(int v0,boolean v1,long v2,int v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBLIL extends Function4<Integer,Boolean,Long,Integer,Long>,PFunction{
      long accept(int v0,boolean v1,long v2,int v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIBLBI extends Function4<Integer,Boolean,Long,Boolean,Integer>,PFunction{
      int accept(int v0,boolean v1,long v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBLBB extends Function4<Integer,Boolean,Long,Boolean,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBLBD extends Function4<Integer,Boolean,Long,Boolean,Double>,PFunction{
      double accept(int v0,boolean v1,long v2,boolean v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBLBL extends Function4<Integer,Boolean,Long,Boolean,Long>,PFunction{
      long accept(int v0,boolean v1,long v2,boolean v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIBLDI extends Function4<Integer,Boolean,Long,Double,Integer>,PFunction{
      int accept(int v0,boolean v1,long v2,double v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBLDB extends Function4<Integer,Boolean,Long,Double,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBLDD extends Function4<Integer,Boolean,Long,Double,Double>,PFunction{
      double accept(int v0,boolean v1,long v2,double v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBLDL extends Function4<Integer,Boolean,Long,Double,Long>,PFunction{
      long accept(int v0,boolean v1,long v2,double v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIBLLI extends Function4<Integer,Boolean,Long,Long,Integer>,PFunction{
      int accept(int v0,boolean v1,long v2,long v3);
      @Override
      default Integer apply(Integer v0,Boolean v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBLLB extends Function4<Integer,Boolean,Long,Long,Boolean>,PFunction{
      boolean accept(int v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBLLD extends Function4<Integer,Boolean,Long,Long,Double>,PFunction{
      double accept(int v0,boolean v1,long v2,long v3);
      @Override
      default Double apply(Integer v0,Boolean v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIBLLL extends Function4<Integer,Boolean,Long,Long,Long>,PFunction{
      long accept(int v0,boolean v1,long v2,long v3);
      @Override
      default Long apply(Integer v0,Boolean v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDIII extends Function4<Integer,Double,Integer,Integer,Integer>,PFunction{
      int accept(int v0,double v1,int v2,int v3);
      @Override
      default Integer apply(Integer v0,Double v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDIIB extends Function4<Integer,Double,Integer,Integer,Boolean>,PFunction{
      boolean accept(int v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDIID extends Function4<Integer,Double,Integer,Integer,Double>,PFunction{
      double accept(int v0,double v1,int v2,int v3);
      @Override
      default Double apply(Integer v0,Double v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDIIL extends Function4<Integer,Double,Integer,Integer,Long>,PFunction{
      long accept(int v0,double v1,int v2,int v3);
      @Override
      default Long apply(Integer v0,Double v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDIBI extends Function4<Integer,Double,Integer,Boolean,Integer>,PFunction{
      int accept(int v0,double v1,int v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Double v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDIBB extends Function4<Integer,Double,Integer,Boolean,Boolean>,PFunction{
      boolean accept(int v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDIBD extends Function4<Integer,Double,Integer,Boolean,Double>,PFunction{
      double accept(int v0,double v1,int v2,boolean v3);
      @Override
      default Double apply(Integer v0,Double v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDIBL extends Function4<Integer,Double,Integer,Boolean,Long>,PFunction{
      long accept(int v0,double v1,int v2,boolean v3);
      @Override
      default Long apply(Integer v0,Double v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDIDI extends Function4<Integer,Double,Integer,Double,Integer>,PFunction{
      int accept(int v0,double v1,int v2,double v3);
      @Override
      default Integer apply(Integer v0,Double v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDIDB extends Function4<Integer,Double,Integer,Double,Boolean>,PFunction{
      boolean accept(int v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDIDD extends Function4<Integer,Double,Integer,Double,Double>,PFunction{
      double accept(int v0,double v1,int v2,double v3);
      @Override
      default Double apply(Integer v0,Double v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDIDL extends Function4<Integer,Double,Integer,Double,Long>,PFunction{
      long accept(int v0,double v1,int v2,double v3);
      @Override
      default Long apply(Integer v0,Double v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDILI extends Function4<Integer,Double,Integer,Long,Integer>,PFunction{
      int accept(int v0,double v1,int v2,long v3);
      @Override
      default Integer apply(Integer v0,Double v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDILB extends Function4<Integer,Double,Integer,Long,Boolean>,PFunction{
      boolean accept(int v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDILD extends Function4<Integer,Double,Integer,Long,Double>,PFunction{
      double accept(int v0,double v1,int v2,long v3);
      @Override
      default Double apply(Integer v0,Double v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDILL extends Function4<Integer,Double,Integer,Long,Long>,PFunction{
      long accept(int v0,double v1,int v2,long v3);
      @Override
      default Long apply(Integer v0,Double v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDBII extends Function4<Integer,Double,Boolean,Integer,Integer>,PFunction{
      int accept(int v0,double v1,boolean v2,int v3);
      @Override
      default Integer apply(Integer v0,Double v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDBIB extends Function4<Integer,Double,Boolean,Integer,Boolean>,PFunction{
      boolean accept(int v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDBID extends Function4<Integer,Double,Boolean,Integer,Double>,PFunction{
      double accept(int v0,double v1,boolean v2,int v3);
      @Override
      default Double apply(Integer v0,Double v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDBIL extends Function4<Integer,Double,Boolean,Integer,Long>,PFunction{
      long accept(int v0,double v1,boolean v2,int v3);
      @Override
      default Long apply(Integer v0,Double v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDBBI extends Function4<Integer,Double,Boolean,Boolean,Integer>,PFunction{
      int accept(int v0,double v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Double v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDBBB extends Function4<Integer,Double,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(int v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDBBD extends Function4<Integer,Double,Boolean,Boolean,Double>,PFunction{
      double accept(int v0,double v1,boolean v2,boolean v3);
      @Override
      default Double apply(Integer v0,Double v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDBBL extends Function4<Integer,Double,Boolean,Boolean,Long>,PFunction{
      long accept(int v0,double v1,boolean v2,boolean v3);
      @Override
      default Long apply(Integer v0,Double v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDBDI extends Function4<Integer,Double,Boolean,Double,Integer>,PFunction{
      int accept(int v0,double v1,boolean v2,double v3);
      @Override
      default Integer apply(Integer v0,Double v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDBDB extends Function4<Integer,Double,Boolean,Double,Boolean>,PFunction{
      boolean accept(int v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDBDD extends Function4<Integer,Double,Boolean,Double,Double>,PFunction{
      double accept(int v0,double v1,boolean v2,double v3);
      @Override
      default Double apply(Integer v0,Double v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDBDL extends Function4<Integer,Double,Boolean,Double,Long>,PFunction{
      long accept(int v0,double v1,boolean v2,double v3);
      @Override
      default Long apply(Integer v0,Double v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDBLI extends Function4<Integer,Double,Boolean,Long,Integer>,PFunction{
      int accept(int v0,double v1,boolean v2,long v3);
      @Override
      default Integer apply(Integer v0,Double v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDBLB extends Function4<Integer,Double,Boolean,Long,Boolean>,PFunction{
      boolean accept(int v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDBLD extends Function4<Integer,Double,Boolean,Long,Double>,PFunction{
      double accept(int v0,double v1,boolean v2,long v3);
      @Override
      default Double apply(Integer v0,Double v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDBLL extends Function4<Integer,Double,Boolean,Long,Long>,PFunction{
      long accept(int v0,double v1,boolean v2,long v3);
      @Override
      default Long apply(Integer v0,Double v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDDII extends Function4<Integer,Double,Double,Integer,Integer>,PFunction{
      int accept(int v0,double v1,double v2,int v3);
      @Override
      default Integer apply(Integer v0,Double v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDDIB extends Function4<Integer,Double,Double,Integer,Boolean>,PFunction{
      boolean accept(int v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDDID extends Function4<Integer,Double,Double,Integer,Double>,PFunction{
      double accept(int v0,double v1,double v2,int v3);
      @Override
      default Double apply(Integer v0,Double v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDDIL extends Function4<Integer,Double,Double,Integer,Long>,PFunction{
      long accept(int v0,double v1,double v2,int v3);
      @Override
      default Long apply(Integer v0,Double v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDDBI extends Function4<Integer,Double,Double,Boolean,Integer>,PFunction{
      int accept(int v0,double v1,double v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Double v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDDBB extends Function4<Integer,Double,Double,Boolean,Boolean>,PFunction{
      boolean accept(int v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDDBD extends Function4<Integer,Double,Double,Boolean,Double>,PFunction{
      double accept(int v0,double v1,double v2,boolean v3);
      @Override
      default Double apply(Integer v0,Double v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDDBL extends Function4<Integer,Double,Double,Boolean,Long>,PFunction{
      long accept(int v0,double v1,double v2,boolean v3);
      @Override
      default Long apply(Integer v0,Double v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDDDI extends Function4<Integer,Double,Double,Double,Integer>,PFunction{
      int accept(int v0,double v1,double v2,double v3);
      @Override
      default Integer apply(Integer v0,Double v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDDDB extends Function4<Integer,Double,Double,Double,Boolean>,PFunction{
      boolean accept(int v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDDDD extends Function4<Integer,Double,Double,Double,Double>,PFunction{
      double accept(int v0,double v1,double v2,double v3);
      @Override
      default Double apply(Integer v0,Double v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDDDL extends Function4<Integer,Double,Double,Double,Long>,PFunction{
      long accept(int v0,double v1,double v2,double v3);
      @Override
      default Long apply(Integer v0,Double v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDDLI extends Function4<Integer,Double,Double,Long,Integer>,PFunction{
      int accept(int v0,double v1,double v2,long v3);
      @Override
      default Integer apply(Integer v0,Double v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDDLB extends Function4<Integer,Double,Double,Long,Boolean>,PFunction{
      boolean accept(int v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDDLD extends Function4<Integer,Double,Double,Long,Double>,PFunction{
      double accept(int v0,double v1,double v2,long v3);
      @Override
      default Double apply(Integer v0,Double v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDDLL extends Function4<Integer,Double,Double,Long,Long>,PFunction{
      long accept(int v0,double v1,double v2,long v3);
      @Override
      default Long apply(Integer v0,Double v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDLII extends Function4<Integer,Double,Long,Integer,Integer>,PFunction{
      int accept(int v0,double v1,long v2,int v3);
      @Override
      default Integer apply(Integer v0,Double v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDLIB extends Function4<Integer,Double,Long,Integer,Boolean>,PFunction{
      boolean accept(int v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDLID extends Function4<Integer,Double,Long,Integer,Double>,PFunction{
      double accept(int v0,double v1,long v2,int v3);
      @Override
      default Double apply(Integer v0,Double v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDLIL extends Function4<Integer,Double,Long,Integer,Long>,PFunction{
      long accept(int v0,double v1,long v2,int v3);
      @Override
      default Long apply(Integer v0,Double v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnIDLBI extends Function4<Integer,Double,Long,Boolean,Integer>,PFunction{
      int accept(int v0,double v1,long v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Double v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDLBB extends Function4<Integer,Double,Long,Boolean,Boolean>,PFunction{
      boolean accept(int v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDLBD extends Function4<Integer,Double,Long,Boolean,Double>,PFunction{
      double accept(int v0,double v1,long v2,boolean v3);
      @Override
      default Double apply(Integer v0,Double v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDLBL extends Function4<Integer,Double,Long,Boolean,Long>,PFunction{
      long accept(int v0,double v1,long v2,boolean v3);
      @Override
      default Long apply(Integer v0,Double v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnIDLDI extends Function4<Integer,Double,Long,Double,Integer>,PFunction{
      int accept(int v0,double v1,long v2,double v3);
      @Override
      default Integer apply(Integer v0,Double v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDLDB extends Function4<Integer,Double,Long,Double,Boolean>,PFunction{
      boolean accept(int v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDLDD extends Function4<Integer,Double,Long,Double,Double>,PFunction{
      double accept(int v0,double v1,long v2,double v3);
      @Override
      default Double apply(Integer v0,Double v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDLDL extends Function4<Integer,Double,Long,Double,Long>,PFunction{
      long accept(int v0,double v1,long v2,double v3);
      @Override
      default Long apply(Integer v0,Double v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnIDLLI extends Function4<Integer,Double,Long,Long,Integer>,PFunction{
      int accept(int v0,double v1,long v2,long v3);
      @Override
      default Integer apply(Integer v0,Double v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDLLB extends Function4<Integer,Double,Long,Long,Boolean>,PFunction{
      boolean accept(int v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDLLD extends Function4<Integer,Double,Long,Long,Double>,PFunction{
      double accept(int v0,double v1,long v2,long v3);
      @Override
      default Double apply(Integer v0,Double v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnIDLLL extends Function4<Integer,Double,Long,Long,Long>,PFunction{
      long accept(int v0,double v1,long v2,long v3);
      @Override
      default Long apply(Integer v0,Double v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILIII extends Function4<Integer,Long,Integer,Integer,Integer>,PFunction{
      int accept(int v0,long v1,int v2,int v3);
      @Override
      default Integer apply(Integer v0,Long v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILIIB extends Function4<Integer,Long,Integer,Integer,Boolean>,PFunction{
      boolean accept(int v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILIID extends Function4<Integer,Long,Integer,Integer,Double>,PFunction{
      double accept(int v0,long v1,int v2,int v3);
      @Override
      default Double apply(Integer v0,Long v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILIIL extends Function4<Integer,Long,Integer,Integer,Long>,PFunction{
      long accept(int v0,long v1,int v2,int v3);
      @Override
      default Long apply(Integer v0,Long v1,Integer v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILIBI extends Function4<Integer,Long,Integer,Boolean,Integer>,PFunction{
      int accept(int v0,long v1,int v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Long v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILIBB extends Function4<Integer,Long,Integer,Boolean,Boolean>,PFunction{
      boolean accept(int v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILIBD extends Function4<Integer,Long,Integer,Boolean,Double>,PFunction{
      double accept(int v0,long v1,int v2,boolean v3);
      @Override
      default Double apply(Integer v0,Long v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILIBL extends Function4<Integer,Long,Integer,Boolean,Long>,PFunction{
      long accept(int v0,long v1,int v2,boolean v3);
      @Override
      default Long apply(Integer v0,Long v1,Integer v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILIDI extends Function4<Integer,Long,Integer,Double,Integer>,PFunction{
      int accept(int v0,long v1,int v2,double v3);
      @Override
      default Integer apply(Integer v0,Long v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILIDB extends Function4<Integer,Long,Integer,Double,Boolean>,PFunction{
      boolean accept(int v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILIDD extends Function4<Integer,Long,Integer,Double,Double>,PFunction{
      double accept(int v0,long v1,int v2,double v3);
      @Override
      default Double apply(Integer v0,Long v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILIDL extends Function4<Integer,Long,Integer,Double,Long>,PFunction{
      long accept(int v0,long v1,int v2,double v3);
      @Override
      default Long apply(Integer v0,Long v1,Integer v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILILI extends Function4<Integer,Long,Integer,Long,Integer>,PFunction{
      int accept(int v0,long v1,int v2,long v3);
      @Override
      default Integer apply(Integer v0,Long v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILILB extends Function4<Integer,Long,Integer,Long,Boolean>,PFunction{
      boolean accept(int v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILILD extends Function4<Integer,Long,Integer,Long,Double>,PFunction{
      double accept(int v0,long v1,int v2,long v3);
      @Override
      default Double apply(Integer v0,Long v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILILL extends Function4<Integer,Long,Integer,Long,Long>,PFunction{
      long accept(int v0,long v1,int v2,long v3);
      @Override
      default Long apply(Integer v0,Long v1,Integer v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILBII extends Function4<Integer,Long,Boolean,Integer,Integer>,PFunction{
      int accept(int v0,long v1,boolean v2,int v3);
      @Override
      default Integer apply(Integer v0,Long v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILBIB extends Function4<Integer,Long,Boolean,Integer,Boolean>,PFunction{
      boolean accept(int v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILBID extends Function4<Integer,Long,Boolean,Integer,Double>,PFunction{
      double accept(int v0,long v1,boolean v2,int v3);
      @Override
      default Double apply(Integer v0,Long v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILBIL extends Function4<Integer,Long,Boolean,Integer,Long>,PFunction{
      long accept(int v0,long v1,boolean v2,int v3);
      @Override
      default Long apply(Integer v0,Long v1,Boolean v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILBBI extends Function4<Integer,Long,Boolean,Boolean,Integer>,PFunction{
      int accept(int v0,long v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Long v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILBBB extends Function4<Integer,Long,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(int v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILBBD extends Function4<Integer,Long,Boolean,Boolean,Double>,PFunction{
      double accept(int v0,long v1,boolean v2,boolean v3);
      @Override
      default Double apply(Integer v0,Long v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILBBL extends Function4<Integer,Long,Boolean,Boolean,Long>,PFunction{
      long accept(int v0,long v1,boolean v2,boolean v3);
      @Override
      default Long apply(Integer v0,Long v1,Boolean v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILBDI extends Function4<Integer,Long,Boolean,Double,Integer>,PFunction{
      int accept(int v0,long v1,boolean v2,double v3);
      @Override
      default Integer apply(Integer v0,Long v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILBDB extends Function4<Integer,Long,Boolean,Double,Boolean>,PFunction{
      boolean accept(int v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILBDD extends Function4<Integer,Long,Boolean,Double,Double>,PFunction{
      double accept(int v0,long v1,boolean v2,double v3);
      @Override
      default Double apply(Integer v0,Long v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILBDL extends Function4<Integer,Long,Boolean,Double,Long>,PFunction{
      long accept(int v0,long v1,boolean v2,double v3);
      @Override
      default Long apply(Integer v0,Long v1,Boolean v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILBLI extends Function4<Integer,Long,Boolean,Long,Integer>,PFunction{
      int accept(int v0,long v1,boolean v2,long v3);
      @Override
      default Integer apply(Integer v0,Long v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILBLB extends Function4<Integer,Long,Boolean,Long,Boolean>,PFunction{
      boolean accept(int v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILBLD extends Function4<Integer,Long,Boolean,Long,Double>,PFunction{
      double accept(int v0,long v1,boolean v2,long v3);
      @Override
      default Double apply(Integer v0,Long v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILBLL extends Function4<Integer,Long,Boolean,Long,Long>,PFunction{
      long accept(int v0,long v1,boolean v2,long v3);
      @Override
      default Long apply(Integer v0,Long v1,Boolean v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILDII extends Function4<Integer,Long,Double,Integer,Integer>,PFunction{
      int accept(int v0,long v1,double v2,int v3);
      @Override
      default Integer apply(Integer v0,Long v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILDIB extends Function4<Integer,Long,Double,Integer,Boolean>,PFunction{
      boolean accept(int v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILDID extends Function4<Integer,Long,Double,Integer,Double>,PFunction{
      double accept(int v0,long v1,double v2,int v3);
      @Override
      default Double apply(Integer v0,Long v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILDIL extends Function4<Integer,Long,Double,Integer,Long>,PFunction{
      long accept(int v0,long v1,double v2,int v3);
      @Override
      default Long apply(Integer v0,Long v1,Double v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILDBI extends Function4<Integer,Long,Double,Boolean,Integer>,PFunction{
      int accept(int v0,long v1,double v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Long v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILDBB extends Function4<Integer,Long,Double,Boolean,Boolean>,PFunction{
      boolean accept(int v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILDBD extends Function4<Integer,Long,Double,Boolean,Double>,PFunction{
      double accept(int v0,long v1,double v2,boolean v3);
      @Override
      default Double apply(Integer v0,Long v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILDBL extends Function4<Integer,Long,Double,Boolean,Long>,PFunction{
      long accept(int v0,long v1,double v2,boolean v3);
      @Override
      default Long apply(Integer v0,Long v1,Double v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILDDI extends Function4<Integer,Long,Double,Double,Integer>,PFunction{
      int accept(int v0,long v1,double v2,double v3);
      @Override
      default Integer apply(Integer v0,Long v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILDDB extends Function4<Integer,Long,Double,Double,Boolean>,PFunction{
      boolean accept(int v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILDDD extends Function4<Integer,Long,Double,Double,Double>,PFunction{
      double accept(int v0,long v1,double v2,double v3);
      @Override
      default Double apply(Integer v0,Long v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILDDL extends Function4<Integer,Long,Double,Double,Long>,PFunction{
      long accept(int v0,long v1,double v2,double v3);
      @Override
      default Long apply(Integer v0,Long v1,Double v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILDLI extends Function4<Integer,Long,Double,Long,Integer>,PFunction{
      int accept(int v0,long v1,double v2,long v3);
      @Override
      default Integer apply(Integer v0,Long v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILDLB extends Function4<Integer,Long,Double,Long,Boolean>,PFunction{
      boolean accept(int v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILDLD extends Function4<Integer,Long,Double,Long,Double>,PFunction{
      double accept(int v0,long v1,double v2,long v3);
      @Override
      default Double apply(Integer v0,Long v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILDLL extends Function4<Integer,Long,Double,Long,Long>,PFunction{
      long accept(int v0,long v1,double v2,long v3);
      @Override
      default Long apply(Integer v0,Long v1,Double v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILLII extends Function4<Integer,Long,Long,Integer,Integer>,PFunction{
      int accept(int v0,long v1,long v2,int v3);
      @Override
      default Integer apply(Integer v0,Long v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILLIB extends Function4<Integer,Long,Long,Integer,Boolean>,PFunction{
      boolean accept(int v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILLID extends Function4<Integer,Long,Long,Integer,Double>,PFunction{
      double accept(int v0,long v1,long v2,int v3);
      @Override
      default Double apply(Integer v0,Long v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILLIL extends Function4<Integer,Long,Long,Integer,Long>,PFunction{
      long accept(int v0,long v1,long v2,int v3);
      @Override
      default Long apply(Integer v0,Long v1,Long v2,Integer v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnILLBI extends Function4<Integer,Long,Long,Boolean,Integer>,PFunction{
      int accept(int v0,long v1,long v2,boolean v3);
      @Override
      default Integer apply(Integer v0,Long v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILLBB extends Function4<Integer,Long,Long,Boolean,Boolean>,PFunction{
      boolean accept(int v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILLBD extends Function4<Integer,Long,Long,Boolean,Double>,PFunction{
      double accept(int v0,long v1,long v2,boolean v3);
      @Override
      default Double apply(Integer v0,Long v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILLBL extends Function4<Integer,Long,Long,Boolean,Long>,PFunction{
      long accept(int v0,long v1,long v2,boolean v3);
      @Override
      default Long apply(Integer v0,Long v1,Long v2,Boolean v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnILLDI extends Function4<Integer,Long,Long,Double,Integer>,PFunction{
      int accept(int v0,long v1,long v2,double v3);
      @Override
      default Integer apply(Integer v0,Long v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILLDB extends Function4<Integer,Long,Long,Double,Boolean>,PFunction{
      boolean accept(int v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILLDD extends Function4<Integer,Long,Long,Double,Double>,PFunction{
      double accept(int v0,long v1,long v2,double v3);
      @Override
      default Double apply(Integer v0,Long v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILLDL extends Function4<Integer,Long,Long,Double,Long>,PFunction{
      long accept(int v0,long v1,long v2,double v3);
      @Override
      default Long apply(Integer v0,Long v1,Long v2,Double v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnILLLI extends Function4<Integer,Long,Long,Long,Integer>,PFunction{
      int accept(int v0,long v1,long v2,long v3);
      @Override
      default Integer apply(Integer v0,Long v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILLLB extends Function4<Integer,Long,Long,Long,Boolean>,PFunction{
      boolean accept(int v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILLLD extends Function4<Integer,Long,Long,Long,Double>,PFunction{
      double accept(int v0,long v1,long v2,long v3);
      @Override
      default Double apply(Integer v0,Long v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnILLLL extends Function4<Integer,Long,Long,Long,Long>,PFunction{
      long accept(int v0,long v1,long v2,long v3);
      @Override
      default Long apply(Integer v0,Long v1,Long v2,Long v3) {
          return accept((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIIII extends Function4<Boolean,Integer,Integer,Integer,Integer>,PFunction{
      int accept(boolean v0,int v1,int v2,int v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIIIB extends Function4<Boolean,Integer,Integer,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIIID extends Function4<Boolean,Integer,Integer,Integer,Double>,PFunction{
      double accept(boolean v0,int v1,int v2,int v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIIIL extends Function4<Boolean,Integer,Integer,Integer,Long>,PFunction{
      long accept(boolean v0,int v1,int v2,int v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIIBI extends Function4<Boolean,Integer,Integer,Boolean,Integer>,PFunction{
      int accept(boolean v0,int v1,int v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIIBB extends Function4<Boolean,Integer,Integer,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIIBD extends Function4<Boolean,Integer,Integer,Boolean,Double>,PFunction{
      double accept(boolean v0,int v1,int v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIIBL extends Function4<Boolean,Integer,Integer,Boolean,Long>,PFunction{
      long accept(boolean v0,int v1,int v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIIDI extends Function4<Boolean,Integer,Integer,Double,Integer>,PFunction{
      int accept(boolean v0,int v1,int v2,double v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIIDB extends Function4<Boolean,Integer,Integer,Double,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIIDD extends Function4<Boolean,Integer,Integer,Double,Double>,PFunction{
      double accept(boolean v0,int v1,int v2,double v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIIDL extends Function4<Boolean,Integer,Integer,Double,Long>,PFunction{
      long accept(boolean v0,int v1,int v2,double v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIILI extends Function4<Boolean,Integer,Integer,Long,Integer>,PFunction{
      int accept(boolean v0,int v1,int v2,long v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIILB extends Function4<Boolean,Integer,Integer,Long,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIILD extends Function4<Boolean,Integer,Integer,Long,Double>,PFunction{
      double accept(boolean v0,int v1,int v2,long v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIILL extends Function4<Boolean,Integer,Integer,Long,Long>,PFunction{
      long accept(boolean v0,int v1,int v2,long v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIBII extends Function4<Boolean,Integer,Boolean,Integer,Integer>,PFunction{
      int accept(boolean v0,int v1,boolean v2,int v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIBIB extends Function4<Boolean,Integer,Boolean,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIBID extends Function4<Boolean,Integer,Boolean,Integer,Double>,PFunction{
      double accept(boolean v0,int v1,boolean v2,int v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIBIL extends Function4<Boolean,Integer,Boolean,Integer,Long>,PFunction{
      long accept(boolean v0,int v1,boolean v2,int v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIBBI extends Function4<Boolean,Integer,Boolean,Boolean,Integer>,PFunction{
      int accept(boolean v0,int v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIBBB extends Function4<Boolean,Integer,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIBBD extends Function4<Boolean,Integer,Boolean,Boolean,Double>,PFunction{
      double accept(boolean v0,int v1,boolean v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIBBL extends Function4<Boolean,Integer,Boolean,Boolean,Long>,PFunction{
      long accept(boolean v0,int v1,boolean v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIBDI extends Function4<Boolean,Integer,Boolean,Double,Integer>,PFunction{
      int accept(boolean v0,int v1,boolean v2,double v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIBDB extends Function4<Boolean,Integer,Boolean,Double,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIBDD extends Function4<Boolean,Integer,Boolean,Double,Double>,PFunction{
      double accept(boolean v0,int v1,boolean v2,double v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIBDL extends Function4<Boolean,Integer,Boolean,Double,Long>,PFunction{
      long accept(boolean v0,int v1,boolean v2,double v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIBLI extends Function4<Boolean,Integer,Boolean,Long,Integer>,PFunction{
      int accept(boolean v0,int v1,boolean v2,long v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIBLB extends Function4<Boolean,Integer,Boolean,Long,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIBLD extends Function4<Boolean,Integer,Boolean,Long,Double>,PFunction{
      double accept(boolean v0,int v1,boolean v2,long v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIBLL extends Function4<Boolean,Integer,Boolean,Long,Long>,PFunction{
      long accept(boolean v0,int v1,boolean v2,long v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIDII extends Function4<Boolean,Integer,Double,Integer,Integer>,PFunction{
      int accept(boolean v0,int v1,double v2,int v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIDIB extends Function4<Boolean,Integer,Double,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIDID extends Function4<Boolean,Integer,Double,Integer,Double>,PFunction{
      double accept(boolean v0,int v1,double v2,int v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIDIL extends Function4<Boolean,Integer,Double,Integer,Long>,PFunction{
      long accept(boolean v0,int v1,double v2,int v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBIDBI extends Function4<Boolean,Integer,Double,Boolean,Integer>,PFunction{
      int accept(boolean v0,int v1,double v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIDBB extends Function4<Boolean,Integer,Double,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIDBD extends Function4<Boolean,Integer,Double,Boolean,Double>,PFunction{
      double accept(boolean v0,int v1,double v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIDBL extends Function4<Boolean,Integer,Double,Boolean,Long>,PFunction{
      long accept(boolean v0,int v1,double v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBIDDI extends Function4<Boolean,Integer,Double,Double,Integer>,PFunction{
      int accept(boolean v0,int v1,double v2,double v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIDDB extends Function4<Boolean,Integer,Double,Double,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIDDD extends Function4<Boolean,Integer,Double,Double,Double>,PFunction{
      double accept(boolean v0,int v1,double v2,double v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIDDL extends Function4<Boolean,Integer,Double,Double,Long>,PFunction{
      long accept(boolean v0,int v1,double v2,double v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBIDLI extends Function4<Boolean,Integer,Double,Long,Integer>,PFunction{
      int accept(boolean v0,int v1,double v2,long v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIDLB extends Function4<Boolean,Integer,Double,Long,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIDLD extends Function4<Boolean,Integer,Double,Long,Double>,PFunction{
      double accept(boolean v0,int v1,double v2,long v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBIDLL extends Function4<Boolean,Integer,Double,Long,Long>,PFunction{
      long accept(boolean v0,int v1,double v2,long v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBILII extends Function4<Boolean,Integer,Long,Integer,Integer>,PFunction{
      int accept(boolean v0,int v1,long v2,int v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBILIB extends Function4<Boolean,Integer,Long,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBILID extends Function4<Boolean,Integer,Long,Integer,Double>,PFunction{
      double accept(boolean v0,int v1,long v2,int v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBILIL extends Function4<Boolean,Integer,Long,Integer,Long>,PFunction{
      long accept(boolean v0,int v1,long v2,int v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBILBI extends Function4<Boolean,Integer,Long,Boolean,Integer>,PFunction{
      int accept(boolean v0,int v1,long v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBILBB extends Function4<Boolean,Integer,Long,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBILBD extends Function4<Boolean,Integer,Long,Boolean,Double>,PFunction{
      double accept(boolean v0,int v1,long v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBILBL extends Function4<Boolean,Integer,Long,Boolean,Long>,PFunction{
      long accept(boolean v0,int v1,long v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBILDI extends Function4<Boolean,Integer,Long,Double,Integer>,PFunction{
      int accept(boolean v0,int v1,long v2,double v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBILDB extends Function4<Boolean,Integer,Long,Double,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBILDD extends Function4<Boolean,Integer,Long,Double,Double>,PFunction{
      double accept(boolean v0,int v1,long v2,double v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBILDL extends Function4<Boolean,Integer,Long,Double,Long>,PFunction{
      long accept(boolean v0,int v1,long v2,double v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBILLI extends Function4<Boolean,Integer,Long,Long,Integer>,PFunction{
      int accept(boolean v0,int v1,long v2,long v3);
      @Override
      default Integer apply(Boolean v0,Integer v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBILLB extends Function4<Boolean,Integer,Long,Long,Boolean>,PFunction{
      boolean accept(boolean v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBILLD extends Function4<Boolean,Integer,Long,Long,Double>,PFunction{
      double accept(boolean v0,int v1,long v2,long v3);
      @Override
      default Double apply(Boolean v0,Integer v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBILLL extends Function4<Boolean,Integer,Long,Long,Long>,PFunction{
      long accept(boolean v0,int v1,long v2,long v3);
      @Override
      default Long apply(Boolean v0,Integer v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBIII extends Function4<Boolean,Boolean,Integer,Integer,Integer>,PFunction{
      int accept(boolean v0,boolean v1,int v2,int v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBIIB extends Function4<Boolean,Boolean,Integer,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBIID extends Function4<Boolean,Boolean,Integer,Integer,Double>,PFunction{
      double accept(boolean v0,boolean v1,int v2,int v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBIIL extends Function4<Boolean,Boolean,Integer,Integer,Long>,PFunction{
      long accept(boolean v0,boolean v1,int v2,int v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBIBI extends Function4<Boolean,Boolean,Integer,Boolean,Integer>,PFunction{
      int accept(boolean v0,boolean v1,int v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBIBB extends Function4<Boolean,Boolean,Integer,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBIBD extends Function4<Boolean,Boolean,Integer,Boolean,Double>,PFunction{
      double accept(boolean v0,boolean v1,int v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBIBL extends Function4<Boolean,Boolean,Integer,Boolean,Long>,PFunction{
      long accept(boolean v0,boolean v1,int v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBIDI extends Function4<Boolean,Boolean,Integer,Double,Integer>,PFunction{
      int accept(boolean v0,boolean v1,int v2,double v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBIDB extends Function4<Boolean,Boolean,Integer,Double,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBIDD extends Function4<Boolean,Boolean,Integer,Double,Double>,PFunction{
      double accept(boolean v0,boolean v1,int v2,double v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBIDL extends Function4<Boolean,Boolean,Integer,Double,Long>,PFunction{
      long accept(boolean v0,boolean v1,int v2,double v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBILI extends Function4<Boolean,Boolean,Integer,Long,Integer>,PFunction{
      int accept(boolean v0,boolean v1,int v2,long v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBILB extends Function4<Boolean,Boolean,Integer,Long,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBILD extends Function4<Boolean,Boolean,Integer,Long,Double>,PFunction{
      double accept(boolean v0,boolean v1,int v2,long v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBILL extends Function4<Boolean,Boolean,Integer,Long,Long>,PFunction{
      long accept(boolean v0,boolean v1,int v2,long v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBBII extends Function4<Boolean,Boolean,Boolean,Integer,Integer>,PFunction{
      int accept(boolean v0,boolean v1,boolean v2,int v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBBIB extends Function4<Boolean,Boolean,Boolean,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBBID extends Function4<Boolean,Boolean,Boolean,Integer,Double>,PFunction{
      double accept(boolean v0,boolean v1,boolean v2,int v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBBIL extends Function4<Boolean,Boolean,Boolean,Integer,Long>,PFunction{
      long accept(boolean v0,boolean v1,boolean v2,int v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBBBI extends Function4<Boolean,Boolean,Boolean,Boolean,Integer>,PFunction{
      int accept(boolean v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBBBB extends Function4<Boolean,Boolean,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBBBD extends Function4<Boolean,Boolean,Boolean,Boolean,Double>,PFunction{
      double accept(boolean v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBBBL extends Function4<Boolean,Boolean,Boolean,Boolean,Long>,PFunction{
      long accept(boolean v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBBDI extends Function4<Boolean,Boolean,Boolean,Double,Integer>,PFunction{
      int accept(boolean v0,boolean v1,boolean v2,double v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBBDB extends Function4<Boolean,Boolean,Boolean,Double,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBBDD extends Function4<Boolean,Boolean,Boolean,Double,Double>,PFunction{
      double accept(boolean v0,boolean v1,boolean v2,double v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBBDL extends Function4<Boolean,Boolean,Boolean,Double,Long>,PFunction{
      long accept(boolean v0,boolean v1,boolean v2,double v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBBLI extends Function4<Boolean,Boolean,Boolean,Long,Integer>,PFunction{
      int accept(boolean v0,boolean v1,boolean v2,long v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBBLB extends Function4<Boolean,Boolean,Boolean,Long,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBBLD extends Function4<Boolean,Boolean,Boolean,Long,Double>,PFunction{
      double accept(boolean v0,boolean v1,boolean v2,long v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBBLL extends Function4<Boolean,Boolean,Boolean,Long,Long>,PFunction{
      long accept(boolean v0,boolean v1,boolean v2,long v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBDII extends Function4<Boolean,Boolean,Double,Integer,Integer>,PFunction{
      int accept(boolean v0,boolean v1,double v2,int v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBDIB extends Function4<Boolean,Boolean,Double,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBDID extends Function4<Boolean,Boolean,Double,Integer,Double>,PFunction{
      double accept(boolean v0,boolean v1,double v2,int v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBDIL extends Function4<Boolean,Boolean,Double,Integer,Long>,PFunction{
      long accept(boolean v0,boolean v1,double v2,int v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBDBI extends Function4<Boolean,Boolean,Double,Boolean,Integer>,PFunction{
      int accept(boolean v0,boolean v1,double v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBDBB extends Function4<Boolean,Boolean,Double,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBDBD extends Function4<Boolean,Boolean,Double,Boolean,Double>,PFunction{
      double accept(boolean v0,boolean v1,double v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBDBL extends Function4<Boolean,Boolean,Double,Boolean,Long>,PFunction{
      long accept(boolean v0,boolean v1,double v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBDDI extends Function4<Boolean,Boolean,Double,Double,Integer>,PFunction{
      int accept(boolean v0,boolean v1,double v2,double v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBDDB extends Function4<Boolean,Boolean,Double,Double,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBDDD extends Function4<Boolean,Boolean,Double,Double,Double>,PFunction{
      double accept(boolean v0,boolean v1,double v2,double v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBDDL extends Function4<Boolean,Boolean,Double,Double,Long>,PFunction{
      long accept(boolean v0,boolean v1,double v2,double v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBDLI extends Function4<Boolean,Boolean,Double,Long,Integer>,PFunction{
      int accept(boolean v0,boolean v1,double v2,long v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBDLB extends Function4<Boolean,Boolean,Double,Long,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBDLD extends Function4<Boolean,Boolean,Double,Long,Double>,PFunction{
      double accept(boolean v0,boolean v1,double v2,long v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBDLL extends Function4<Boolean,Boolean,Double,Long,Long>,PFunction{
      long accept(boolean v0,boolean v1,double v2,long v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBLII extends Function4<Boolean,Boolean,Long,Integer,Integer>,PFunction{
      int accept(boolean v0,boolean v1,long v2,int v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBLIB extends Function4<Boolean,Boolean,Long,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBLID extends Function4<Boolean,Boolean,Long,Integer,Double>,PFunction{
      double accept(boolean v0,boolean v1,long v2,int v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBLIL extends Function4<Boolean,Boolean,Long,Integer,Long>,PFunction{
      long accept(boolean v0,boolean v1,long v2,int v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBBLBI extends Function4<Boolean,Boolean,Long,Boolean,Integer>,PFunction{
      int accept(boolean v0,boolean v1,long v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBLBB extends Function4<Boolean,Boolean,Long,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBLBD extends Function4<Boolean,Boolean,Long,Boolean,Double>,PFunction{
      double accept(boolean v0,boolean v1,long v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBLBL extends Function4<Boolean,Boolean,Long,Boolean,Long>,PFunction{
      long accept(boolean v0,boolean v1,long v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBBLDI extends Function4<Boolean,Boolean,Long,Double,Integer>,PFunction{
      int accept(boolean v0,boolean v1,long v2,double v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBLDB extends Function4<Boolean,Boolean,Long,Double,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBLDD extends Function4<Boolean,Boolean,Long,Double,Double>,PFunction{
      double accept(boolean v0,boolean v1,long v2,double v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBLDL extends Function4<Boolean,Boolean,Long,Double,Long>,PFunction{
      long accept(boolean v0,boolean v1,long v2,double v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBBLLI extends Function4<Boolean,Boolean,Long,Long,Integer>,PFunction{
      int accept(boolean v0,boolean v1,long v2,long v3);
      @Override
      default Integer apply(Boolean v0,Boolean v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBLLB extends Function4<Boolean,Boolean,Long,Long,Boolean>,PFunction{
      boolean accept(boolean v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBLLD extends Function4<Boolean,Boolean,Long,Long,Double>,PFunction{
      double accept(boolean v0,boolean v1,long v2,long v3);
      @Override
      default Double apply(Boolean v0,Boolean v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBBLLL extends Function4<Boolean,Boolean,Long,Long,Long>,PFunction{
      long accept(boolean v0,boolean v1,long v2,long v3);
      @Override
      default Long apply(Boolean v0,Boolean v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDIII extends Function4<Boolean,Double,Integer,Integer,Integer>,PFunction{
      int accept(boolean v0,double v1,int v2,int v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDIIB extends Function4<Boolean,Double,Integer,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDIID extends Function4<Boolean,Double,Integer,Integer,Double>,PFunction{
      double accept(boolean v0,double v1,int v2,int v3);
      @Override
      default Double apply(Boolean v0,Double v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDIIL extends Function4<Boolean,Double,Integer,Integer,Long>,PFunction{
      long accept(boolean v0,double v1,int v2,int v3);
      @Override
      default Long apply(Boolean v0,Double v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDIBI extends Function4<Boolean,Double,Integer,Boolean,Integer>,PFunction{
      int accept(boolean v0,double v1,int v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDIBB extends Function4<Boolean,Double,Integer,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDIBD extends Function4<Boolean,Double,Integer,Boolean,Double>,PFunction{
      double accept(boolean v0,double v1,int v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Double v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDIBL extends Function4<Boolean,Double,Integer,Boolean,Long>,PFunction{
      long accept(boolean v0,double v1,int v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Double v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDIDI extends Function4<Boolean,Double,Integer,Double,Integer>,PFunction{
      int accept(boolean v0,double v1,int v2,double v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDIDB extends Function4<Boolean,Double,Integer,Double,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDIDD extends Function4<Boolean,Double,Integer,Double,Double>,PFunction{
      double accept(boolean v0,double v1,int v2,double v3);
      @Override
      default Double apply(Boolean v0,Double v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDIDL extends Function4<Boolean,Double,Integer,Double,Long>,PFunction{
      long accept(boolean v0,double v1,int v2,double v3);
      @Override
      default Long apply(Boolean v0,Double v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDILI extends Function4<Boolean,Double,Integer,Long,Integer>,PFunction{
      int accept(boolean v0,double v1,int v2,long v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDILB extends Function4<Boolean,Double,Integer,Long,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDILD extends Function4<Boolean,Double,Integer,Long,Double>,PFunction{
      double accept(boolean v0,double v1,int v2,long v3);
      @Override
      default Double apply(Boolean v0,Double v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDILL extends Function4<Boolean,Double,Integer,Long,Long>,PFunction{
      long accept(boolean v0,double v1,int v2,long v3);
      @Override
      default Long apply(Boolean v0,Double v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDBII extends Function4<Boolean,Double,Boolean,Integer,Integer>,PFunction{
      int accept(boolean v0,double v1,boolean v2,int v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDBIB extends Function4<Boolean,Double,Boolean,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDBID extends Function4<Boolean,Double,Boolean,Integer,Double>,PFunction{
      double accept(boolean v0,double v1,boolean v2,int v3);
      @Override
      default Double apply(Boolean v0,Double v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDBIL extends Function4<Boolean,Double,Boolean,Integer,Long>,PFunction{
      long accept(boolean v0,double v1,boolean v2,int v3);
      @Override
      default Long apply(Boolean v0,Double v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDBBI extends Function4<Boolean,Double,Boolean,Boolean,Integer>,PFunction{
      int accept(boolean v0,double v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDBBB extends Function4<Boolean,Double,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDBBD extends Function4<Boolean,Double,Boolean,Boolean,Double>,PFunction{
      double accept(boolean v0,double v1,boolean v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Double v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDBBL extends Function4<Boolean,Double,Boolean,Boolean,Long>,PFunction{
      long accept(boolean v0,double v1,boolean v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Double v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDBDI extends Function4<Boolean,Double,Boolean,Double,Integer>,PFunction{
      int accept(boolean v0,double v1,boolean v2,double v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDBDB extends Function4<Boolean,Double,Boolean,Double,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDBDD extends Function4<Boolean,Double,Boolean,Double,Double>,PFunction{
      double accept(boolean v0,double v1,boolean v2,double v3);
      @Override
      default Double apply(Boolean v0,Double v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDBDL extends Function4<Boolean,Double,Boolean,Double,Long>,PFunction{
      long accept(boolean v0,double v1,boolean v2,double v3);
      @Override
      default Long apply(Boolean v0,Double v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDBLI extends Function4<Boolean,Double,Boolean,Long,Integer>,PFunction{
      int accept(boolean v0,double v1,boolean v2,long v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDBLB extends Function4<Boolean,Double,Boolean,Long,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDBLD extends Function4<Boolean,Double,Boolean,Long,Double>,PFunction{
      double accept(boolean v0,double v1,boolean v2,long v3);
      @Override
      default Double apply(Boolean v0,Double v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDBLL extends Function4<Boolean,Double,Boolean,Long,Long>,PFunction{
      long accept(boolean v0,double v1,boolean v2,long v3);
      @Override
      default Long apply(Boolean v0,Double v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDDII extends Function4<Boolean,Double,Double,Integer,Integer>,PFunction{
      int accept(boolean v0,double v1,double v2,int v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDDIB extends Function4<Boolean,Double,Double,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDDID extends Function4<Boolean,Double,Double,Integer,Double>,PFunction{
      double accept(boolean v0,double v1,double v2,int v3);
      @Override
      default Double apply(Boolean v0,Double v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDDIL extends Function4<Boolean,Double,Double,Integer,Long>,PFunction{
      long accept(boolean v0,double v1,double v2,int v3);
      @Override
      default Long apply(Boolean v0,Double v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDDBI extends Function4<Boolean,Double,Double,Boolean,Integer>,PFunction{
      int accept(boolean v0,double v1,double v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDDBB extends Function4<Boolean,Double,Double,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDDBD extends Function4<Boolean,Double,Double,Boolean,Double>,PFunction{
      double accept(boolean v0,double v1,double v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Double v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDDBL extends Function4<Boolean,Double,Double,Boolean,Long>,PFunction{
      long accept(boolean v0,double v1,double v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Double v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDDDI extends Function4<Boolean,Double,Double,Double,Integer>,PFunction{
      int accept(boolean v0,double v1,double v2,double v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDDDB extends Function4<Boolean,Double,Double,Double,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDDDD extends Function4<Boolean,Double,Double,Double,Double>,PFunction{
      double accept(boolean v0,double v1,double v2,double v3);
      @Override
      default Double apply(Boolean v0,Double v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDDDL extends Function4<Boolean,Double,Double,Double,Long>,PFunction{
      long accept(boolean v0,double v1,double v2,double v3);
      @Override
      default Long apply(Boolean v0,Double v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDDLI extends Function4<Boolean,Double,Double,Long,Integer>,PFunction{
      int accept(boolean v0,double v1,double v2,long v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDDLB extends Function4<Boolean,Double,Double,Long,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDDLD extends Function4<Boolean,Double,Double,Long,Double>,PFunction{
      double accept(boolean v0,double v1,double v2,long v3);
      @Override
      default Double apply(Boolean v0,Double v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDDLL extends Function4<Boolean,Double,Double,Long,Long>,PFunction{
      long accept(boolean v0,double v1,double v2,long v3);
      @Override
      default Long apply(Boolean v0,Double v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDLII extends Function4<Boolean,Double,Long,Integer,Integer>,PFunction{
      int accept(boolean v0,double v1,long v2,int v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDLIB extends Function4<Boolean,Double,Long,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDLID extends Function4<Boolean,Double,Long,Integer,Double>,PFunction{
      double accept(boolean v0,double v1,long v2,int v3);
      @Override
      default Double apply(Boolean v0,Double v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDLIL extends Function4<Boolean,Double,Long,Integer,Long>,PFunction{
      long accept(boolean v0,double v1,long v2,int v3);
      @Override
      default Long apply(Boolean v0,Double v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBDLBI extends Function4<Boolean,Double,Long,Boolean,Integer>,PFunction{
      int accept(boolean v0,double v1,long v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDLBB extends Function4<Boolean,Double,Long,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDLBD extends Function4<Boolean,Double,Long,Boolean,Double>,PFunction{
      double accept(boolean v0,double v1,long v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Double v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDLBL extends Function4<Boolean,Double,Long,Boolean,Long>,PFunction{
      long accept(boolean v0,double v1,long v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Double v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBDLDI extends Function4<Boolean,Double,Long,Double,Integer>,PFunction{
      int accept(boolean v0,double v1,long v2,double v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDLDB extends Function4<Boolean,Double,Long,Double,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDLDD extends Function4<Boolean,Double,Long,Double,Double>,PFunction{
      double accept(boolean v0,double v1,long v2,double v3);
      @Override
      default Double apply(Boolean v0,Double v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDLDL extends Function4<Boolean,Double,Long,Double,Long>,PFunction{
      long accept(boolean v0,double v1,long v2,double v3);
      @Override
      default Long apply(Boolean v0,Double v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBDLLI extends Function4<Boolean,Double,Long,Long,Integer>,PFunction{
      int accept(boolean v0,double v1,long v2,long v3);
      @Override
      default Integer apply(Boolean v0,Double v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDLLB extends Function4<Boolean,Double,Long,Long,Boolean>,PFunction{
      boolean accept(boolean v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDLLD extends Function4<Boolean,Double,Long,Long,Double>,PFunction{
      double accept(boolean v0,double v1,long v2,long v3);
      @Override
      default Double apply(Boolean v0,Double v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBDLLL extends Function4<Boolean,Double,Long,Long,Long>,PFunction{
      long accept(boolean v0,double v1,long v2,long v3);
      @Override
      default Long apply(Boolean v0,Double v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLIII extends Function4<Boolean,Long,Integer,Integer,Integer>,PFunction{
      int accept(boolean v0,long v1,int v2,int v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLIIB extends Function4<Boolean,Long,Integer,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLIID extends Function4<Boolean,Long,Integer,Integer,Double>,PFunction{
      double accept(boolean v0,long v1,int v2,int v3);
      @Override
      default Double apply(Boolean v0,Long v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLIIL extends Function4<Boolean,Long,Integer,Integer,Long>,PFunction{
      long accept(boolean v0,long v1,int v2,int v3);
      @Override
      default Long apply(Boolean v0,Long v1,Integer v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLIBI extends Function4<Boolean,Long,Integer,Boolean,Integer>,PFunction{
      int accept(boolean v0,long v1,int v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLIBB extends Function4<Boolean,Long,Integer,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLIBD extends Function4<Boolean,Long,Integer,Boolean,Double>,PFunction{
      double accept(boolean v0,long v1,int v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Long v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLIBL extends Function4<Boolean,Long,Integer,Boolean,Long>,PFunction{
      long accept(boolean v0,long v1,int v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Long v1,Integer v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLIDI extends Function4<Boolean,Long,Integer,Double,Integer>,PFunction{
      int accept(boolean v0,long v1,int v2,double v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLIDB extends Function4<Boolean,Long,Integer,Double,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLIDD extends Function4<Boolean,Long,Integer,Double,Double>,PFunction{
      double accept(boolean v0,long v1,int v2,double v3);
      @Override
      default Double apply(Boolean v0,Long v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLIDL extends Function4<Boolean,Long,Integer,Double,Long>,PFunction{
      long accept(boolean v0,long v1,int v2,double v3);
      @Override
      default Long apply(Boolean v0,Long v1,Integer v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLILI extends Function4<Boolean,Long,Integer,Long,Integer>,PFunction{
      int accept(boolean v0,long v1,int v2,long v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLILB extends Function4<Boolean,Long,Integer,Long,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLILD extends Function4<Boolean,Long,Integer,Long,Double>,PFunction{
      double accept(boolean v0,long v1,int v2,long v3);
      @Override
      default Double apply(Boolean v0,Long v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLILL extends Function4<Boolean,Long,Integer,Long,Long>,PFunction{
      long accept(boolean v0,long v1,int v2,long v3);
      @Override
      default Long apply(Boolean v0,Long v1,Integer v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLBII extends Function4<Boolean,Long,Boolean,Integer,Integer>,PFunction{
      int accept(boolean v0,long v1,boolean v2,int v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLBIB extends Function4<Boolean,Long,Boolean,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLBID extends Function4<Boolean,Long,Boolean,Integer,Double>,PFunction{
      double accept(boolean v0,long v1,boolean v2,int v3);
      @Override
      default Double apply(Boolean v0,Long v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLBIL extends Function4<Boolean,Long,Boolean,Integer,Long>,PFunction{
      long accept(boolean v0,long v1,boolean v2,int v3);
      @Override
      default Long apply(Boolean v0,Long v1,Boolean v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLBBI extends Function4<Boolean,Long,Boolean,Boolean,Integer>,PFunction{
      int accept(boolean v0,long v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLBBB extends Function4<Boolean,Long,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLBBD extends Function4<Boolean,Long,Boolean,Boolean,Double>,PFunction{
      double accept(boolean v0,long v1,boolean v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Long v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLBBL extends Function4<Boolean,Long,Boolean,Boolean,Long>,PFunction{
      long accept(boolean v0,long v1,boolean v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Long v1,Boolean v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLBDI extends Function4<Boolean,Long,Boolean,Double,Integer>,PFunction{
      int accept(boolean v0,long v1,boolean v2,double v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLBDB extends Function4<Boolean,Long,Boolean,Double,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLBDD extends Function4<Boolean,Long,Boolean,Double,Double>,PFunction{
      double accept(boolean v0,long v1,boolean v2,double v3);
      @Override
      default Double apply(Boolean v0,Long v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLBDL extends Function4<Boolean,Long,Boolean,Double,Long>,PFunction{
      long accept(boolean v0,long v1,boolean v2,double v3);
      @Override
      default Long apply(Boolean v0,Long v1,Boolean v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLBLI extends Function4<Boolean,Long,Boolean,Long,Integer>,PFunction{
      int accept(boolean v0,long v1,boolean v2,long v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLBLB extends Function4<Boolean,Long,Boolean,Long,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLBLD extends Function4<Boolean,Long,Boolean,Long,Double>,PFunction{
      double accept(boolean v0,long v1,boolean v2,long v3);
      @Override
      default Double apply(Boolean v0,Long v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLBLL extends Function4<Boolean,Long,Boolean,Long,Long>,PFunction{
      long accept(boolean v0,long v1,boolean v2,long v3);
      @Override
      default Long apply(Boolean v0,Long v1,Boolean v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLDII extends Function4<Boolean,Long,Double,Integer,Integer>,PFunction{
      int accept(boolean v0,long v1,double v2,int v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLDIB extends Function4<Boolean,Long,Double,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLDID extends Function4<Boolean,Long,Double,Integer,Double>,PFunction{
      double accept(boolean v0,long v1,double v2,int v3);
      @Override
      default Double apply(Boolean v0,Long v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLDIL extends Function4<Boolean,Long,Double,Integer,Long>,PFunction{
      long accept(boolean v0,long v1,double v2,int v3);
      @Override
      default Long apply(Boolean v0,Long v1,Double v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLDBI extends Function4<Boolean,Long,Double,Boolean,Integer>,PFunction{
      int accept(boolean v0,long v1,double v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLDBB extends Function4<Boolean,Long,Double,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLDBD extends Function4<Boolean,Long,Double,Boolean,Double>,PFunction{
      double accept(boolean v0,long v1,double v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Long v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLDBL extends Function4<Boolean,Long,Double,Boolean,Long>,PFunction{
      long accept(boolean v0,long v1,double v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Long v1,Double v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLDDI extends Function4<Boolean,Long,Double,Double,Integer>,PFunction{
      int accept(boolean v0,long v1,double v2,double v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLDDB extends Function4<Boolean,Long,Double,Double,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLDDD extends Function4<Boolean,Long,Double,Double,Double>,PFunction{
      double accept(boolean v0,long v1,double v2,double v3);
      @Override
      default Double apply(Boolean v0,Long v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLDDL extends Function4<Boolean,Long,Double,Double,Long>,PFunction{
      long accept(boolean v0,long v1,double v2,double v3);
      @Override
      default Long apply(Boolean v0,Long v1,Double v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLDLI extends Function4<Boolean,Long,Double,Long,Integer>,PFunction{
      int accept(boolean v0,long v1,double v2,long v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLDLB extends Function4<Boolean,Long,Double,Long,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLDLD extends Function4<Boolean,Long,Double,Long,Double>,PFunction{
      double accept(boolean v0,long v1,double v2,long v3);
      @Override
      default Double apply(Boolean v0,Long v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLDLL extends Function4<Boolean,Long,Double,Long,Long>,PFunction{
      long accept(boolean v0,long v1,double v2,long v3);
      @Override
      default Long apply(Boolean v0,Long v1,Double v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLLII extends Function4<Boolean,Long,Long,Integer,Integer>,PFunction{
      int accept(boolean v0,long v1,long v2,int v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLLIB extends Function4<Boolean,Long,Long,Integer,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLLID extends Function4<Boolean,Long,Long,Integer,Double>,PFunction{
      double accept(boolean v0,long v1,long v2,int v3);
      @Override
      default Double apply(Boolean v0,Long v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLLIL extends Function4<Boolean,Long,Long,Integer,Long>,PFunction{
      long accept(boolean v0,long v1,long v2,int v3);
      @Override
      default Long apply(Boolean v0,Long v1,Long v2,Integer v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnBLLBI extends Function4<Boolean,Long,Long,Boolean,Integer>,PFunction{
      int accept(boolean v0,long v1,long v2,boolean v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLLBB extends Function4<Boolean,Long,Long,Boolean,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLLBD extends Function4<Boolean,Long,Long,Boolean,Double>,PFunction{
      double accept(boolean v0,long v1,long v2,boolean v3);
      @Override
      default Double apply(Boolean v0,Long v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLLBL extends Function4<Boolean,Long,Long,Boolean,Long>,PFunction{
      long accept(boolean v0,long v1,long v2,boolean v3);
      @Override
      default Long apply(Boolean v0,Long v1,Long v2,Boolean v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnBLLDI extends Function4<Boolean,Long,Long,Double,Integer>,PFunction{
      int accept(boolean v0,long v1,long v2,double v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLLDB extends Function4<Boolean,Long,Long,Double,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLLDD extends Function4<Boolean,Long,Long,Double,Double>,PFunction{
      double accept(boolean v0,long v1,long v2,double v3);
      @Override
      default Double apply(Boolean v0,Long v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLLDL extends Function4<Boolean,Long,Long,Double,Long>,PFunction{
      long accept(boolean v0,long v1,long v2,double v3);
      @Override
      default Long apply(Boolean v0,Long v1,Long v2,Double v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnBLLLI extends Function4<Boolean,Long,Long,Long,Integer>,PFunction{
      int accept(boolean v0,long v1,long v2,long v3);
      @Override
      default Integer apply(Boolean v0,Long v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLLLB extends Function4<Boolean,Long,Long,Long,Boolean>,PFunction{
      boolean accept(boolean v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLLLD extends Function4<Boolean,Long,Long,Long,Double>,PFunction{
      double accept(boolean v0,long v1,long v2,long v3);
      @Override
      default Double apply(Boolean v0,Long v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnBLLLL extends Function4<Boolean,Long,Long,Long,Long>,PFunction{
      long accept(boolean v0,long v1,long v2,long v3);
      @Override
      default Long apply(Boolean v0,Long v1,Long v2,Long v3) {
          return accept((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIIII extends Function4<Double,Integer,Integer,Integer,Integer>,PFunction{
      int accept(double v0,int v1,int v2,int v3);
      @Override
      default Integer apply(Double v0,Integer v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIIIB extends Function4<Double,Integer,Integer,Integer,Boolean>,PFunction{
      boolean accept(double v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIIID extends Function4<Double,Integer,Integer,Integer,Double>,PFunction{
      double accept(double v0,int v1,int v2,int v3);
      @Override
      default Double apply(Double v0,Integer v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIIIL extends Function4<Double,Integer,Integer,Integer,Long>,PFunction{
      long accept(double v0,int v1,int v2,int v3);
      @Override
      default Long apply(Double v0,Integer v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIIBI extends Function4<Double,Integer,Integer,Boolean,Integer>,PFunction{
      int accept(double v0,int v1,int v2,boolean v3);
      @Override
      default Integer apply(Double v0,Integer v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIIBB extends Function4<Double,Integer,Integer,Boolean,Boolean>,PFunction{
      boolean accept(double v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIIBD extends Function4<Double,Integer,Integer,Boolean,Double>,PFunction{
      double accept(double v0,int v1,int v2,boolean v3);
      @Override
      default Double apply(Double v0,Integer v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIIBL extends Function4<Double,Integer,Integer,Boolean,Long>,PFunction{
      long accept(double v0,int v1,int v2,boolean v3);
      @Override
      default Long apply(Double v0,Integer v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIIDI extends Function4<Double,Integer,Integer,Double,Integer>,PFunction{
      int accept(double v0,int v1,int v2,double v3);
      @Override
      default Integer apply(Double v0,Integer v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIIDB extends Function4<Double,Integer,Integer,Double,Boolean>,PFunction{
      boolean accept(double v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIIDD extends Function4<Double,Integer,Integer,Double,Double>,PFunction{
      double accept(double v0,int v1,int v2,double v3);
      @Override
      default Double apply(Double v0,Integer v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIIDL extends Function4<Double,Integer,Integer,Double,Long>,PFunction{
      long accept(double v0,int v1,int v2,double v3);
      @Override
      default Long apply(Double v0,Integer v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIILI extends Function4<Double,Integer,Integer,Long,Integer>,PFunction{
      int accept(double v0,int v1,int v2,long v3);
      @Override
      default Integer apply(Double v0,Integer v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIILB extends Function4<Double,Integer,Integer,Long,Boolean>,PFunction{
      boolean accept(double v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIILD extends Function4<Double,Integer,Integer,Long,Double>,PFunction{
      double accept(double v0,int v1,int v2,long v3);
      @Override
      default Double apply(Double v0,Integer v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIILL extends Function4<Double,Integer,Integer,Long,Long>,PFunction{
      long accept(double v0,int v1,int v2,long v3);
      @Override
      default Long apply(Double v0,Integer v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIBII extends Function4<Double,Integer,Boolean,Integer,Integer>,PFunction{
      int accept(double v0,int v1,boolean v2,int v3);
      @Override
      default Integer apply(Double v0,Integer v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIBIB extends Function4<Double,Integer,Boolean,Integer,Boolean>,PFunction{
      boolean accept(double v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIBID extends Function4<Double,Integer,Boolean,Integer,Double>,PFunction{
      double accept(double v0,int v1,boolean v2,int v3);
      @Override
      default Double apply(Double v0,Integer v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIBIL extends Function4<Double,Integer,Boolean,Integer,Long>,PFunction{
      long accept(double v0,int v1,boolean v2,int v3);
      @Override
      default Long apply(Double v0,Integer v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIBBI extends Function4<Double,Integer,Boolean,Boolean,Integer>,PFunction{
      int accept(double v0,int v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Double v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIBBB extends Function4<Double,Integer,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(double v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIBBD extends Function4<Double,Integer,Boolean,Boolean,Double>,PFunction{
      double accept(double v0,int v1,boolean v2,boolean v3);
      @Override
      default Double apply(Double v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIBBL extends Function4<Double,Integer,Boolean,Boolean,Long>,PFunction{
      long accept(double v0,int v1,boolean v2,boolean v3);
      @Override
      default Long apply(Double v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIBDI extends Function4<Double,Integer,Boolean,Double,Integer>,PFunction{
      int accept(double v0,int v1,boolean v2,double v3);
      @Override
      default Integer apply(Double v0,Integer v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIBDB extends Function4<Double,Integer,Boolean,Double,Boolean>,PFunction{
      boolean accept(double v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIBDD extends Function4<Double,Integer,Boolean,Double,Double>,PFunction{
      double accept(double v0,int v1,boolean v2,double v3);
      @Override
      default Double apply(Double v0,Integer v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIBDL extends Function4<Double,Integer,Boolean,Double,Long>,PFunction{
      long accept(double v0,int v1,boolean v2,double v3);
      @Override
      default Long apply(Double v0,Integer v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIBLI extends Function4<Double,Integer,Boolean,Long,Integer>,PFunction{
      int accept(double v0,int v1,boolean v2,long v3);
      @Override
      default Integer apply(Double v0,Integer v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIBLB extends Function4<Double,Integer,Boolean,Long,Boolean>,PFunction{
      boolean accept(double v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIBLD extends Function4<Double,Integer,Boolean,Long,Double>,PFunction{
      double accept(double v0,int v1,boolean v2,long v3);
      @Override
      default Double apply(Double v0,Integer v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIBLL extends Function4<Double,Integer,Boolean,Long,Long>,PFunction{
      long accept(double v0,int v1,boolean v2,long v3);
      @Override
      default Long apply(Double v0,Integer v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIDII extends Function4<Double,Integer,Double,Integer,Integer>,PFunction{
      int accept(double v0,int v1,double v2,int v3);
      @Override
      default Integer apply(Double v0,Integer v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIDIB extends Function4<Double,Integer,Double,Integer,Boolean>,PFunction{
      boolean accept(double v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIDID extends Function4<Double,Integer,Double,Integer,Double>,PFunction{
      double accept(double v0,int v1,double v2,int v3);
      @Override
      default Double apply(Double v0,Integer v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIDIL extends Function4<Double,Integer,Double,Integer,Long>,PFunction{
      long accept(double v0,int v1,double v2,int v3);
      @Override
      default Long apply(Double v0,Integer v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDIDBI extends Function4<Double,Integer,Double,Boolean,Integer>,PFunction{
      int accept(double v0,int v1,double v2,boolean v3);
      @Override
      default Integer apply(Double v0,Integer v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIDBB extends Function4<Double,Integer,Double,Boolean,Boolean>,PFunction{
      boolean accept(double v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIDBD extends Function4<Double,Integer,Double,Boolean,Double>,PFunction{
      double accept(double v0,int v1,double v2,boolean v3);
      @Override
      default Double apply(Double v0,Integer v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIDBL extends Function4<Double,Integer,Double,Boolean,Long>,PFunction{
      long accept(double v0,int v1,double v2,boolean v3);
      @Override
      default Long apply(Double v0,Integer v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDIDDI extends Function4<Double,Integer,Double,Double,Integer>,PFunction{
      int accept(double v0,int v1,double v2,double v3);
      @Override
      default Integer apply(Double v0,Integer v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIDDB extends Function4<Double,Integer,Double,Double,Boolean>,PFunction{
      boolean accept(double v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIDDD extends Function4<Double,Integer,Double,Double,Double>,PFunction{
      double accept(double v0,int v1,double v2,double v3);
      @Override
      default Double apply(Double v0,Integer v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIDDL extends Function4<Double,Integer,Double,Double,Long>,PFunction{
      long accept(double v0,int v1,double v2,double v3);
      @Override
      default Long apply(Double v0,Integer v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDIDLI extends Function4<Double,Integer,Double,Long,Integer>,PFunction{
      int accept(double v0,int v1,double v2,long v3);
      @Override
      default Integer apply(Double v0,Integer v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIDLB extends Function4<Double,Integer,Double,Long,Boolean>,PFunction{
      boolean accept(double v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIDLD extends Function4<Double,Integer,Double,Long,Double>,PFunction{
      double accept(double v0,int v1,double v2,long v3);
      @Override
      default Double apply(Double v0,Integer v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDIDLL extends Function4<Double,Integer,Double,Long,Long>,PFunction{
      long accept(double v0,int v1,double v2,long v3);
      @Override
      default Long apply(Double v0,Integer v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDILII extends Function4<Double,Integer,Long,Integer,Integer>,PFunction{
      int accept(double v0,int v1,long v2,int v3);
      @Override
      default Integer apply(Double v0,Integer v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDILIB extends Function4<Double,Integer,Long,Integer,Boolean>,PFunction{
      boolean accept(double v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDILID extends Function4<Double,Integer,Long,Integer,Double>,PFunction{
      double accept(double v0,int v1,long v2,int v3);
      @Override
      default Double apply(Double v0,Integer v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDILIL extends Function4<Double,Integer,Long,Integer,Long>,PFunction{
      long accept(double v0,int v1,long v2,int v3);
      @Override
      default Long apply(Double v0,Integer v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDILBI extends Function4<Double,Integer,Long,Boolean,Integer>,PFunction{
      int accept(double v0,int v1,long v2,boolean v3);
      @Override
      default Integer apply(Double v0,Integer v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDILBB extends Function4<Double,Integer,Long,Boolean,Boolean>,PFunction{
      boolean accept(double v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDILBD extends Function4<Double,Integer,Long,Boolean,Double>,PFunction{
      double accept(double v0,int v1,long v2,boolean v3);
      @Override
      default Double apply(Double v0,Integer v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDILBL extends Function4<Double,Integer,Long,Boolean,Long>,PFunction{
      long accept(double v0,int v1,long v2,boolean v3);
      @Override
      default Long apply(Double v0,Integer v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDILDI extends Function4<Double,Integer,Long,Double,Integer>,PFunction{
      int accept(double v0,int v1,long v2,double v3);
      @Override
      default Integer apply(Double v0,Integer v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDILDB extends Function4<Double,Integer,Long,Double,Boolean>,PFunction{
      boolean accept(double v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDILDD extends Function4<Double,Integer,Long,Double,Double>,PFunction{
      double accept(double v0,int v1,long v2,double v3);
      @Override
      default Double apply(Double v0,Integer v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDILDL extends Function4<Double,Integer,Long,Double,Long>,PFunction{
      long accept(double v0,int v1,long v2,double v3);
      @Override
      default Long apply(Double v0,Integer v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDILLI extends Function4<Double,Integer,Long,Long,Integer>,PFunction{
      int accept(double v0,int v1,long v2,long v3);
      @Override
      default Integer apply(Double v0,Integer v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDILLB extends Function4<Double,Integer,Long,Long,Boolean>,PFunction{
      boolean accept(double v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDILLD extends Function4<Double,Integer,Long,Long,Double>,PFunction{
      double accept(double v0,int v1,long v2,long v3);
      @Override
      default Double apply(Double v0,Integer v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDILLL extends Function4<Double,Integer,Long,Long,Long>,PFunction{
      long accept(double v0,int v1,long v2,long v3);
      @Override
      default Long apply(Double v0,Integer v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBIII extends Function4<Double,Boolean,Integer,Integer,Integer>,PFunction{
      int accept(double v0,boolean v1,int v2,int v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBIIB extends Function4<Double,Boolean,Integer,Integer,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBIID extends Function4<Double,Boolean,Integer,Integer,Double>,PFunction{
      double accept(double v0,boolean v1,int v2,int v3);
      @Override
      default Double apply(Double v0,Boolean v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBIIL extends Function4<Double,Boolean,Integer,Integer,Long>,PFunction{
      long accept(double v0,boolean v1,int v2,int v3);
      @Override
      default Long apply(Double v0,Boolean v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBIBI extends Function4<Double,Boolean,Integer,Boolean,Integer>,PFunction{
      int accept(double v0,boolean v1,int v2,boolean v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBIBB extends Function4<Double,Boolean,Integer,Boolean,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBIBD extends Function4<Double,Boolean,Integer,Boolean,Double>,PFunction{
      double accept(double v0,boolean v1,int v2,boolean v3);
      @Override
      default Double apply(Double v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBIBL extends Function4<Double,Boolean,Integer,Boolean,Long>,PFunction{
      long accept(double v0,boolean v1,int v2,boolean v3);
      @Override
      default Long apply(Double v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBIDI extends Function4<Double,Boolean,Integer,Double,Integer>,PFunction{
      int accept(double v0,boolean v1,int v2,double v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBIDB extends Function4<Double,Boolean,Integer,Double,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBIDD extends Function4<Double,Boolean,Integer,Double,Double>,PFunction{
      double accept(double v0,boolean v1,int v2,double v3);
      @Override
      default Double apply(Double v0,Boolean v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBIDL extends Function4<Double,Boolean,Integer,Double,Long>,PFunction{
      long accept(double v0,boolean v1,int v2,double v3);
      @Override
      default Long apply(Double v0,Boolean v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBILI extends Function4<Double,Boolean,Integer,Long,Integer>,PFunction{
      int accept(double v0,boolean v1,int v2,long v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBILB extends Function4<Double,Boolean,Integer,Long,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBILD extends Function4<Double,Boolean,Integer,Long,Double>,PFunction{
      double accept(double v0,boolean v1,int v2,long v3);
      @Override
      default Double apply(Double v0,Boolean v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBILL extends Function4<Double,Boolean,Integer,Long,Long>,PFunction{
      long accept(double v0,boolean v1,int v2,long v3);
      @Override
      default Long apply(Double v0,Boolean v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBBII extends Function4<Double,Boolean,Boolean,Integer,Integer>,PFunction{
      int accept(double v0,boolean v1,boolean v2,int v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBBIB extends Function4<Double,Boolean,Boolean,Integer,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBBID extends Function4<Double,Boolean,Boolean,Integer,Double>,PFunction{
      double accept(double v0,boolean v1,boolean v2,int v3);
      @Override
      default Double apply(Double v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBBIL extends Function4<Double,Boolean,Boolean,Integer,Long>,PFunction{
      long accept(double v0,boolean v1,boolean v2,int v3);
      @Override
      default Long apply(Double v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBBBI extends Function4<Double,Boolean,Boolean,Boolean,Integer>,PFunction{
      int accept(double v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBBBB extends Function4<Double,Boolean,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBBBD extends Function4<Double,Boolean,Boolean,Boolean,Double>,PFunction{
      double accept(double v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Double apply(Double v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBBBL extends Function4<Double,Boolean,Boolean,Boolean,Long>,PFunction{
      long accept(double v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Long apply(Double v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBBDI extends Function4<Double,Boolean,Boolean,Double,Integer>,PFunction{
      int accept(double v0,boolean v1,boolean v2,double v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBBDB extends Function4<Double,Boolean,Boolean,Double,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBBDD extends Function4<Double,Boolean,Boolean,Double,Double>,PFunction{
      double accept(double v0,boolean v1,boolean v2,double v3);
      @Override
      default Double apply(Double v0,Boolean v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBBDL extends Function4<Double,Boolean,Boolean,Double,Long>,PFunction{
      long accept(double v0,boolean v1,boolean v2,double v3);
      @Override
      default Long apply(Double v0,Boolean v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBBLI extends Function4<Double,Boolean,Boolean,Long,Integer>,PFunction{
      int accept(double v0,boolean v1,boolean v2,long v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBBLB extends Function4<Double,Boolean,Boolean,Long,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBBLD extends Function4<Double,Boolean,Boolean,Long,Double>,PFunction{
      double accept(double v0,boolean v1,boolean v2,long v3);
      @Override
      default Double apply(Double v0,Boolean v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBBLL extends Function4<Double,Boolean,Boolean,Long,Long>,PFunction{
      long accept(double v0,boolean v1,boolean v2,long v3);
      @Override
      default Long apply(Double v0,Boolean v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBDII extends Function4<Double,Boolean,Double,Integer,Integer>,PFunction{
      int accept(double v0,boolean v1,double v2,int v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBDIB extends Function4<Double,Boolean,Double,Integer,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBDID extends Function4<Double,Boolean,Double,Integer,Double>,PFunction{
      double accept(double v0,boolean v1,double v2,int v3);
      @Override
      default Double apply(Double v0,Boolean v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBDIL extends Function4<Double,Boolean,Double,Integer,Long>,PFunction{
      long accept(double v0,boolean v1,double v2,int v3);
      @Override
      default Long apply(Double v0,Boolean v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBDBI extends Function4<Double,Boolean,Double,Boolean,Integer>,PFunction{
      int accept(double v0,boolean v1,double v2,boolean v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBDBB extends Function4<Double,Boolean,Double,Boolean,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBDBD extends Function4<Double,Boolean,Double,Boolean,Double>,PFunction{
      double accept(double v0,boolean v1,double v2,boolean v3);
      @Override
      default Double apply(Double v0,Boolean v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBDBL extends Function4<Double,Boolean,Double,Boolean,Long>,PFunction{
      long accept(double v0,boolean v1,double v2,boolean v3);
      @Override
      default Long apply(Double v0,Boolean v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBDDI extends Function4<Double,Boolean,Double,Double,Integer>,PFunction{
      int accept(double v0,boolean v1,double v2,double v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBDDB extends Function4<Double,Boolean,Double,Double,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBDDD extends Function4<Double,Boolean,Double,Double,Double>,PFunction{
      double accept(double v0,boolean v1,double v2,double v3);
      @Override
      default Double apply(Double v0,Boolean v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBDDL extends Function4<Double,Boolean,Double,Double,Long>,PFunction{
      long accept(double v0,boolean v1,double v2,double v3);
      @Override
      default Long apply(Double v0,Boolean v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBDLI extends Function4<Double,Boolean,Double,Long,Integer>,PFunction{
      int accept(double v0,boolean v1,double v2,long v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBDLB extends Function4<Double,Boolean,Double,Long,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBDLD extends Function4<Double,Boolean,Double,Long,Double>,PFunction{
      double accept(double v0,boolean v1,double v2,long v3);
      @Override
      default Double apply(Double v0,Boolean v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBDLL extends Function4<Double,Boolean,Double,Long,Long>,PFunction{
      long accept(double v0,boolean v1,double v2,long v3);
      @Override
      default Long apply(Double v0,Boolean v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBLII extends Function4<Double,Boolean,Long,Integer,Integer>,PFunction{
      int accept(double v0,boolean v1,long v2,int v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBLIB extends Function4<Double,Boolean,Long,Integer,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBLID extends Function4<Double,Boolean,Long,Integer,Double>,PFunction{
      double accept(double v0,boolean v1,long v2,int v3);
      @Override
      default Double apply(Double v0,Boolean v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBLIL extends Function4<Double,Boolean,Long,Integer,Long>,PFunction{
      long accept(double v0,boolean v1,long v2,int v3);
      @Override
      default Long apply(Double v0,Boolean v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDBLBI extends Function4<Double,Boolean,Long,Boolean,Integer>,PFunction{
      int accept(double v0,boolean v1,long v2,boolean v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBLBB extends Function4<Double,Boolean,Long,Boolean,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBLBD extends Function4<Double,Boolean,Long,Boolean,Double>,PFunction{
      double accept(double v0,boolean v1,long v2,boolean v3);
      @Override
      default Double apply(Double v0,Boolean v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBLBL extends Function4<Double,Boolean,Long,Boolean,Long>,PFunction{
      long accept(double v0,boolean v1,long v2,boolean v3);
      @Override
      default Long apply(Double v0,Boolean v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDBLDI extends Function4<Double,Boolean,Long,Double,Integer>,PFunction{
      int accept(double v0,boolean v1,long v2,double v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBLDB extends Function4<Double,Boolean,Long,Double,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBLDD extends Function4<Double,Boolean,Long,Double,Double>,PFunction{
      double accept(double v0,boolean v1,long v2,double v3);
      @Override
      default Double apply(Double v0,Boolean v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBLDL extends Function4<Double,Boolean,Long,Double,Long>,PFunction{
      long accept(double v0,boolean v1,long v2,double v3);
      @Override
      default Long apply(Double v0,Boolean v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDBLLI extends Function4<Double,Boolean,Long,Long,Integer>,PFunction{
      int accept(double v0,boolean v1,long v2,long v3);
      @Override
      default Integer apply(Double v0,Boolean v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBLLB extends Function4<Double,Boolean,Long,Long,Boolean>,PFunction{
      boolean accept(double v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBLLD extends Function4<Double,Boolean,Long,Long,Double>,PFunction{
      double accept(double v0,boolean v1,long v2,long v3);
      @Override
      default Double apply(Double v0,Boolean v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDBLLL extends Function4<Double,Boolean,Long,Long,Long>,PFunction{
      long accept(double v0,boolean v1,long v2,long v3);
      @Override
      default Long apply(Double v0,Boolean v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDIII extends Function4<Double,Double,Integer,Integer,Integer>,PFunction{
      int accept(double v0,double v1,int v2,int v3);
      @Override
      default Integer apply(Double v0,Double v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDIIB extends Function4<Double,Double,Integer,Integer,Boolean>,PFunction{
      boolean accept(double v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDIID extends Function4<Double,Double,Integer,Integer,Double>,PFunction{
      double accept(double v0,double v1,int v2,int v3);
      @Override
      default Double apply(Double v0,Double v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDIIL extends Function4<Double,Double,Integer,Integer,Long>,PFunction{
      long accept(double v0,double v1,int v2,int v3);
      @Override
      default Long apply(Double v0,Double v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDIBI extends Function4<Double,Double,Integer,Boolean,Integer>,PFunction{
      int accept(double v0,double v1,int v2,boolean v3);
      @Override
      default Integer apply(Double v0,Double v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDIBB extends Function4<Double,Double,Integer,Boolean,Boolean>,PFunction{
      boolean accept(double v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDIBD extends Function4<Double,Double,Integer,Boolean,Double>,PFunction{
      double accept(double v0,double v1,int v2,boolean v3);
      @Override
      default Double apply(Double v0,Double v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDIBL extends Function4<Double,Double,Integer,Boolean,Long>,PFunction{
      long accept(double v0,double v1,int v2,boolean v3);
      @Override
      default Long apply(Double v0,Double v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDIDI extends Function4<Double,Double,Integer,Double,Integer>,PFunction{
      int accept(double v0,double v1,int v2,double v3);
      @Override
      default Integer apply(Double v0,Double v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDIDB extends Function4<Double,Double,Integer,Double,Boolean>,PFunction{
      boolean accept(double v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDIDD extends Function4<Double,Double,Integer,Double,Double>,PFunction{
      double accept(double v0,double v1,int v2,double v3);
      @Override
      default Double apply(Double v0,Double v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDIDL extends Function4<Double,Double,Integer,Double,Long>,PFunction{
      long accept(double v0,double v1,int v2,double v3);
      @Override
      default Long apply(Double v0,Double v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDILI extends Function4<Double,Double,Integer,Long,Integer>,PFunction{
      int accept(double v0,double v1,int v2,long v3);
      @Override
      default Integer apply(Double v0,Double v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDILB extends Function4<Double,Double,Integer,Long,Boolean>,PFunction{
      boolean accept(double v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDILD extends Function4<Double,Double,Integer,Long,Double>,PFunction{
      double accept(double v0,double v1,int v2,long v3);
      @Override
      default Double apply(Double v0,Double v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDILL extends Function4<Double,Double,Integer,Long,Long>,PFunction{
      long accept(double v0,double v1,int v2,long v3);
      @Override
      default Long apply(Double v0,Double v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDBII extends Function4<Double,Double,Boolean,Integer,Integer>,PFunction{
      int accept(double v0,double v1,boolean v2,int v3);
      @Override
      default Integer apply(Double v0,Double v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDBIB extends Function4<Double,Double,Boolean,Integer,Boolean>,PFunction{
      boolean accept(double v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDBID extends Function4<Double,Double,Boolean,Integer,Double>,PFunction{
      double accept(double v0,double v1,boolean v2,int v3);
      @Override
      default Double apply(Double v0,Double v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDBIL extends Function4<Double,Double,Boolean,Integer,Long>,PFunction{
      long accept(double v0,double v1,boolean v2,int v3);
      @Override
      default Long apply(Double v0,Double v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDBBI extends Function4<Double,Double,Boolean,Boolean,Integer>,PFunction{
      int accept(double v0,double v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Double v0,Double v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDBBB extends Function4<Double,Double,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(double v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDBBD extends Function4<Double,Double,Boolean,Boolean,Double>,PFunction{
      double accept(double v0,double v1,boolean v2,boolean v3);
      @Override
      default Double apply(Double v0,Double v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDBBL extends Function4<Double,Double,Boolean,Boolean,Long>,PFunction{
      long accept(double v0,double v1,boolean v2,boolean v3);
      @Override
      default Long apply(Double v0,Double v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDBDI extends Function4<Double,Double,Boolean,Double,Integer>,PFunction{
      int accept(double v0,double v1,boolean v2,double v3);
      @Override
      default Integer apply(Double v0,Double v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDBDB extends Function4<Double,Double,Boolean,Double,Boolean>,PFunction{
      boolean accept(double v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDBDD extends Function4<Double,Double,Boolean,Double,Double>,PFunction{
      double accept(double v0,double v1,boolean v2,double v3);
      @Override
      default Double apply(Double v0,Double v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDBDL extends Function4<Double,Double,Boolean,Double,Long>,PFunction{
      long accept(double v0,double v1,boolean v2,double v3);
      @Override
      default Long apply(Double v0,Double v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDBLI extends Function4<Double,Double,Boolean,Long,Integer>,PFunction{
      int accept(double v0,double v1,boolean v2,long v3);
      @Override
      default Integer apply(Double v0,Double v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDBLB extends Function4<Double,Double,Boolean,Long,Boolean>,PFunction{
      boolean accept(double v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDBLD extends Function4<Double,Double,Boolean,Long,Double>,PFunction{
      double accept(double v0,double v1,boolean v2,long v3);
      @Override
      default Double apply(Double v0,Double v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDBLL extends Function4<Double,Double,Boolean,Long,Long>,PFunction{
      long accept(double v0,double v1,boolean v2,long v3);
      @Override
      default Long apply(Double v0,Double v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDDII extends Function4<Double,Double,Double,Integer,Integer>,PFunction{
      int accept(double v0,double v1,double v2,int v3);
      @Override
      default Integer apply(Double v0,Double v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDDIB extends Function4<Double,Double,Double,Integer,Boolean>,PFunction{
      boolean accept(double v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDDID extends Function4<Double,Double,Double,Integer,Double>,PFunction{
      double accept(double v0,double v1,double v2,int v3);
      @Override
      default Double apply(Double v0,Double v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDDIL extends Function4<Double,Double,Double,Integer,Long>,PFunction{
      long accept(double v0,double v1,double v2,int v3);
      @Override
      default Long apply(Double v0,Double v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDDBI extends Function4<Double,Double,Double,Boolean,Integer>,PFunction{
      int accept(double v0,double v1,double v2,boolean v3);
      @Override
      default Integer apply(Double v0,Double v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDDBB extends Function4<Double,Double,Double,Boolean,Boolean>,PFunction{
      boolean accept(double v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDDBD extends Function4<Double,Double,Double,Boolean,Double>,PFunction{
      double accept(double v0,double v1,double v2,boolean v3);
      @Override
      default Double apply(Double v0,Double v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDDBL extends Function4<Double,Double,Double,Boolean,Long>,PFunction{
      long accept(double v0,double v1,double v2,boolean v3);
      @Override
      default Long apply(Double v0,Double v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDDDI extends Function4<Double,Double,Double,Double,Integer>,PFunction{
      int accept(double v0,double v1,double v2,double v3);
      @Override
      default Integer apply(Double v0,Double v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDDDB extends Function4<Double,Double,Double,Double,Boolean>,PFunction{
      boolean accept(double v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDDDD extends Function4<Double,Double,Double,Double,Double>,PFunction{
      double accept(double v0,double v1,double v2,double v3);
      @Override
      default Double apply(Double v0,Double v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDDDL extends Function4<Double,Double,Double,Double,Long>,PFunction{
      long accept(double v0,double v1,double v2,double v3);
      @Override
      default Long apply(Double v0,Double v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDDLI extends Function4<Double,Double,Double,Long,Integer>,PFunction{
      int accept(double v0,double v1,double v2,long v3);
      @Override
      default Integer apply(Double v0,Double v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDDLB extends Function4<Double,Double,Double,Long,Boolean>,PFunction{
      boolean accept(double v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDDLD extends Function4<Double,Double,Double,Long,Double>,PFunction{
      double accept(double v0,double v1,double v2,long v3);
      @Override
      default Double apply(Double v0,Double v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDDLL extends Function4<Double,Double,Double,Long,Long>,PFunction{
      long accept(double v0,double v1,double v2,long v3);
      @Override
      default Long apply(Double v0,Double v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDLII extends Function4<Double,Double,Long,Integer,Integer>,PFunction{
      int accept(double v0,double v1,long v2,int v3);
      @Override
      default Integer apply(Double v0,Double v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDLIB extends Function4<Double,Double,Long,Integer,Boolean>,PFunction{
      boolean accept(double v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDLID extends Function4<Double,Double,Long,Integer,Double>,PFunction{
      double accept(double v0,double v1,long v2,int v3);
      @Override
      default Double apply(Double v0,Double v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDLIL extends Function4<Double,Double,Long,Integer,Long>,PFunction{
      long accept(double v0,double v1,long v2,int v3);
      @Override
      default Long apply(Double v0,Double v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDDLBI extends Function4<Double,Double,Long,Boolean,Integer>,PFunction{
      int accept(double v0,double v1,long v2,boolean v3);
      @Override
      default Integer apply(Double v0,Double v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDLBB extends Function4<Double,Double,Long,Boolean,Boolean>,PFunction{
      boolean accept(double v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDLBD extends Function4<Double,Double,Long,Boolean,Double>,PFunction{
      double accept(double v0,double v1,long v2,boolean v3);
      @Override
      default Double apply(Double v0,Double v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDLBL extends Function4<Double,Double,Long,Boolean,Long>,PFunction{
      long accept(double v0,double v1,long v2,boolean v3);
      @Override
      default Long apply(Double v0,Double v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDDLDI extends Function4<Double,Double,Long,Double,Integer>,PFunction{
      int accept(double v0,double v1,long v2,double v3);
      @Override
      default Integer apply(Double v0,Double v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDLDB extends Function4<Double,Double,Long,Double,Boolean>,PFunction{
      boolean accept(double v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDLDD extends Function4<Double,Double,Long,Double,Double>,PFunction{
      double accept(double v0,double v1,long v2,double v3);
      @Override
      default Double apply(Double v0,Double v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDLDL extends Function4<Double,Double,Long,Double,Long>,PFunction{
      long accept(double v0,double v1,long v2,double v3);
      @Override
      default Long apply(Double v0,Double v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDDLLI extends Function4<Double,Double,Long,Long,Integer>,PFunction{
      int accept(double v0,double v1,long v2,long v3);
      @Override
      default Integer apply(Double v0,Double v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDLLB extends Function4<Double,Double,Long,Long,Boolean>,PFunction{
      boolean accept(double v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDLLD extends Function4<Double,Double,Long,Long,Double>,PFunction{
      double accept(double v0,double v1,long v2,long v3);
      @Override
      default Double apply(Double v0,Double v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDDLLL extends Function4<Double,Double,Long,Long,Long>,PFunction{
      long accept(double v0,double v1,long v2,long v3);
      @Override
      default Long apply(Double v0,Double v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLIII extends Function4<Double,Long,Integer,Integer,Integer>,PFunction{
      int accept(double v0,long v1,int v2,int v3);
      @Override
      default Integer apply(Double v0,Long v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLIIB extends Function4<Double,Long,Integer,Integer,Boolean>,PFunction{
      boolean accept(double v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLIID extends Function4<Double,Long,Integer,Integer,Double>,PFunction{
      double accept(double v0,long v1,int v2,int v3);
      @Override
      default Double apply(Double v0,Long v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLIIL extends Function4<Double,Long,Integer,Integer,Long>,PFunction{
      long accept(double v0,long v1,int v2,int v3);
      @Override
      default Long apply(Double v0,Long v1,Integer v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLIBI extends Function4<Double,Long,Integer,Boolean,Integer>,PFunction{
      int accept(double v0,long v1,int v2,boolean v3);
      @Override
      default Integer apply(Double v0,Long v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLIBB extends Function4<Double,Long,Integer,Boolean,Boolean>,PFunction{
      boolean accept(double v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLIBD extends Function4<Double,Long,Integer,Boolean,Double>,PFunction{
      double accept(double v0,long v1,int v2,boolean v3);
      @Override
      default Double apply(Double v0,Long v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLIBL extends Function4<Double,Long,Integer,Boolean,Long>,PFunction{
      long accept(double v0,long v1,int v2,boolean v3);
      @Override
      default Long apply(Double v0,Long v1,Integer v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLIDI extends Function4<Double,Long,Integer,Double,Integer>,PFunction{
      int accept(double v0,long v1,int v2,double v3);
      @Override
      default Integer apply(Double v0,Long v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLIDB extends Function4<Double,Long,Integer,Double,Boolean>,PFunction{
      boolean accept(double v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLIDD extends Function4<Double,Long,Integer,Double,Double>,PFunction{
      double accept(double v0,long v1,int v2,double v3);
      @Override
      default Double apply(Double v0,Long v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLIDL extends Function4<Double,Long,Integer,Double,Long>,PFunction{
      long accept(double v0,long v1,int v2,double v3);
      @Override
      default Long apply(Double v0,Long v1,Integer v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLILI extends Function4<Double,Long,Integer,Long,Integer>,PFunction{
      int accept(double v0,long v1,int v2,long v3);
      @Override
      default Integer apply(Double v0,Long v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLILB extends Function4<Double,Long,Integer,Long,Boolean>,PFunction{
      boolean accept(double v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLILD extends Function4<Double,Long,Integer,Long,Double>,PFunction{
      double accept(double v0,long v1,int v2,long v3);
      @Override
      default Double apply(Double v0,Long v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLILL extends Function4<Double,Long,Integer,Long,Long>,PFunction{
      long accept(double v0,long v1,int v2,long v3);
      @Override
      default Long apply(Double v0,Long v1,Integer v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLBII extends Function4<Double,Long,Boolean,Integer,Integer>,PFunction{
      int accept(double v0,long v1,boolean v2,int v3);
      @Override
      default Integer apply(Double v0,Long v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLBIB extends Function4<Double,Long,Boolean,Integer,Boolean>,PFunction{
      boolean accept(double v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLBID extends Function4<Double,Long,Boolean,Integer,Double>,PFunction{
      double accept(double v0,long v1,boolean v2,int v3);
      @Override
      default Double apply(Double v0,Long v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLBIL extends Function4<Double,Long,Boolean,Integer,Long>,PFunction{
      long accept(double v0,long v1,boolean v2,int v3);
      @Override
      default Long apply(Double v0,Long v1,Boolean v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLBBI extends Function4<Double,Long,Boolean,Boolean,Integer>,PFunction{
      int accept(double v0,long v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Double v0,Long v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLBBB extends Function4<Double,Long,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(double v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLBBD extends Function4<Double,Long,Boolean,Boolean,Double>,PFunction{
      double accept(double v0,long v1,boolean v2,boolean v3);
      @Override
      default Double apply(Double v0,Long v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLBBL extends Function4<Double,Long,Boolean,Boolean,Long>,PFunction{
      long accept(double v0,long v1,boolean v2,boolean v3);
      @Override
      default Long apply(Double v0,Long v1,Boolean v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLBDI extends Function4<Double,Long,Boolean,Double,Integer>,PFunction{
      int accept(double v0,long v1,boolean v2,double v3);
      @Override
      default Integer apply(Double v0,Long v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLBDB extends Function4<Double,Long,Boolean,Double,Boolean>,PFunction{
      boolean accept(double v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLBDD extends Function4<Double,Long,Boolean,Double,Double>,PFunction{
      double accept(double v0,long v1,boolean v2,double v3);
      @Override
      default Double apply(Double v0,Long v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLBDL extends Function4<Double,Long,Boolean,Double,Long>,PFunction{
      long accept(double v0,long v1,boolean v2,double v3);
      @Override
      default Long apply(Double v0,Long v1,Boolean v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLBLI extends Function4<Double,Long,Boolean,Long,Integer>,PFunction{
      int accept(double v0,long v1,boolean v2,long v3);
      @Override
      default Integer apply(Double v0,Long v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLBLB extends Function4<Double,Long,Boolean,Long,Boolean>,PFunction{
      boolean accept(double v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLBLD extends Function4<Double,Long,Boolean,Long,Double>,PFunction{
      double accept(double v0,long v1,boolean v2,long v3);
      @Override
      default Double apply(Double v0,Long v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLBLL extends Function4<Double,Long,Boolean,Long,Long>,PFunction{
      long accept(double v0,long v1,boolean v2,long v3);
      @Override
      default Long apply(Double v0,Long v1,Boolean v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLDII extends Function4<Double,Long,Double,Integer,Integer>,PFunction{
      int accept(double v0,long v1,double v2,int v3);
      @Override
      default Integer apply(Double v0,Long v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLDIB extends Function4<Double,Long,Double,Integer,Boolean>,PFunction{
      boolean accept(double v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLDID extends Function4<Double,Long,Double,Integer,Double>,PFunction{
      double accept(double v0,long v1,double v2,int v3);
      @Override
      default Double apply(Double v0,Long v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLDIL extends Function4<Double,Long,Double,Integer,Long>,PFunction{
      long accept(double v0,long v1,double v2,int v3);
      @Override
      default Long apply(Double v0,Long v1,Double v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLDBI extends Function4<Double,Long,Double,Boolean,Integer>,PFunction{
      int accept(double v0,long v1,double v2,boolean v3);
      @Override
      default Integer apply(Double v0,Long v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLDBB extends Function4<Double,Long,Double,Boolean,Boolean>,PFunction{
      boolean accept(double v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLDBD extends Function4<Double,Long,Double,Boolean,Double>,PFunction{
      double accept(double v0,long v1,double v2,boolean v3);
      @Override
      default Double apply(Double v0,Long v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLDBL extends Function4<Double,Long,Double,Boolean,Long>,PFunction{
      long accept(double v0,long v1,double v2,boolean v3);
      @Override
      default Long apply(Double v0,Long v1,Double v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLDDI extends Function4<Double,Long,Double,Double,Integer>,PFunction{
      int accept(double v0,long v1,double v2,double v3);
      @Override
      default Integer apply(Double v0,Long v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLDDB extends Function4<Double,Long,Double,Double,Boolean>,PFunction{
      boolean accept(double v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLDDD extends Function4<Double,Long,Double,Double,Double>,PFunction{
      double accept(double v0,long v1,double v2,double v3);
      @Override
      default Double apply(Double v0,Long v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLDDL extends Function4<Double,Long,Double,Double,Long>,PFunction{
      long accept(double v0,long v1,double v2,double v3);
      @Override
      default Long apply(Double v0,Long v1,Double v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLDLI extends Function4<Double,Long,Double,Long,Integer>,PFunction{
      int accept(double v0,long v1,double v2,long v3);
      @Override
      default Integer apply(Double v0,Long v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLDLB extends Function4<Double,Long,Double,Long,Boolean>,PFunction{
      boolean accept(double v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLDLD extends Function4<Double,Long,Double,Long,Double>,PFunction{
      double accept(double v0,long v1,double v2,long v3);
      @Override
      default Double apply(Double v0,Long v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLDLL extends Function4<Double,Long,Double,Long,Long>,PFunction{
      long accept(double v0,long v1,double v2,long v3);
      @Override
      default Long apply(Double v0,Long v1,Double v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLLII extends Function4<Double,Long,Long,Integer,Integer>,PFunction{
      int accept(double v0,long v1,long v2,int v3);
      @Override
      default Integer apply(Double v0,Long v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLLIB extends Function4<Double,Long,Long,Integer,Boolean>,PFunction{
      boolean accept(double v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLLID extends Function4<Double,Long,Long,Integer,Double>,PFunction{
      double accept(double v0,long v1,long v2,int v3);
      @Override
      default Double apply(Double v0,Long v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLLIL extends Function4<Double,Long,Long,Integer,Long>,PFunction{
      long accept(double v0,long v1,long v2,int v3);
      @Override
      default Long apply(Double v0,Long v1,Long v2,Integer v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnDLLBI extends Function4<Double,Long,Long,Boolean,Integer>,PFunction{
      int accept(double v0,long v1,long v2,boolean v3);
      @Override
      default Integer apply(Double v0,Long v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLLBB extends Function4<Double,Long,Long,Boolean,Boolean>,PFunction{
      boolean accept(double v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLLBD extends Function4<Double,Long,Long,Boolean,Double>,PFunction{
      double accept(double v0,long v1,long v2,boolean v3);
      @Override
      default Double apply(Double v0,Long v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLLBL extends Function4<Double,Long,Long,Boolean,Long>,PFunction{
      long accept(double v0,long v1,long v2,boolean v3);
      @Override
      default Long apply(Double v0,Long v1,Long v2,Boolean v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnDLLDI extends Function4<Double,Long,Long,Double,Integer>,PFunction{
      int accept(double v0,long v1,long v2,double v3);
      @Override
      default Integer apply(Double v0,Long v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLLDB extends Function4<Double,Long,Long,Double,Boolean>,PFunction{
      boolean accept(double v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLLDD extends Function4<Double,Long,Long,Double,Double>,PFunction{
      double accept(double v0,long v1,long v2,double v3);
      @Override
      default Double apply(Double v0,Long v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLLDL extends Function4<Double,Long,Long,Double,Long>,PFunction{
      long accept(double v0,long v1,long v2,double v3);
      @Override
      default Long apply(Double v0,Long v1,Long v2,Double v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnDLLLI extends Function4<Double,Long,Long,Long,Integer>,PFunction{
      int accept(double v0,long v1,long v2,long v3);
      @Override
      default Integer apply(Double v0,Long v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLLLB extends Function4<Double,Long,Long,Long,Boolean>,PFunction{
      boolean accept(double v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLLLD extends Function4<Double,Long,Long,Long,Double>,PFunction{
      double accept(double v0,long v1,long v2,long v3);
      @Override
      default Double apply(Double v0,Long v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnDLLLL extends Function4<Double,Long,Long,Long,Long>,PFunction{
      long accept(double v0,long v1,long v2,long v3);
      @Override
      default Long apply(Double v0,Long v1,Long v2,Long v3) {
          return accept((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIIII extends Function4<Long,Integer,Integer,Integer,Integer>,PFunction{
      int accept(long v0,int v1,int v2,int v3);
      @Override
      default Integer apply(Long v0,Integer v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIIIB extends Function4<Long,Integer,Integer,Integer,Boolean>,PFunction{
      boolean accept(long v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIIID extends Function4<Long,Integer,Integer,Integer,Double>,PFunction{
      double accept(long v0,int v1,int v2,int v3);
      @Override
      default Double apply(Long v0,Integer v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIIIL extends Function4<Long,Integer,Integer,Integer,Long>,PFunction{
      long accept(long v0,int v1,int v2,int v3);
      @Override
      default Long apply(Long v0,Integer v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIIBI extends Function4<Long,Integer,Integer,Boolean,Integer>,PFunction{
      int accept(long v0,int v1,int v2,boolean v3);
      @Override
      default Integer apply(Long v0,Integer v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIIBB extends Function4<Long,Integer,Integer,Boolean,Boolean>,PFunction{
      boolean accept(long v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIIBD extends Function4<Long,Integer,Integer,Boolean,Double>,PFunction{
      double accept(long v0,int v1,int v2,boolean v3);
      @Override
      default Double apply(Long v0,Integer v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIIBL extends Function4<Long,Integer,Integer,Boolean,Long>,PFunction{
      long accept(long v0,int v1,int v2,boolean v3);
      @Override
      default Long apply(Long v0,Integer v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIIDI extends Function4<Long,Integer,Integer,Double,Integer>,PFunction{
      int accept(long v0,int v1,int v2,double v3);
      @Override
      default Integer apply(Long v0,Integer v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIIDB extends Function4<Long,Integer,Integer,Double,Boolean>,PFunction{
      boolean accept(long v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIIDD extends Function4<Long,Integer,Integer,Double,Double>,PFunction{
      double accept(long v0,int v1,int v2,double v3);
      @Override
      default Double apply(Long v0,Integer v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIIDL extends Function4<Long,Integer,Integer,Double,Long>,PFunction{
      long accept(long v0,int v1,int v2,double v3);
      @Override
      default Long apply(Long v0,Integer v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIILI extends Function4<Long,Integer,Integer,Long,Integer>,PFunction{
      int accept(long v0,int v1,int v2,long v3);
      @Override
      default Integer apply(Long v0,Integer v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIILB extends Function4<Long,Integer,Integer,Long,Boolean>,PFunction{
      boolean accept(long v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIILD extends Function4<Long,Integer,Integer,Long,Double>,PFunction{
      double accept(long v0,int v1,int v2,long v3);
      @Override
      default Double apply(Long v0,Integer v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIILL extends Function4<Long,Integer,Integer,Long,Long>,PFunction{
      long accept(long v0,int v1,int v2,long v3);
      @Override
      default Long apply(Long v0,Integer v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIBII extends Function4<Long,Integer,Boolean,Integer,Integer>,PFunction{
      int accept(long v0,int v1,boolean v2,int v3);
      @Override
      default Integer apply(Long v0,Integer v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIBIB extends Function4<Long,Integer,Boolean,Integer,Boolean>,PFunction{
      boolean accept(long v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIBID extends Function4<Long,Integer,Boolean,Integer,Double>,PFunction{
      double accept(long v0,int v1,boolean v2,int v3);
      @Override
      default Double apply(Long v0,Integer v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIBIL extends Function4<Long,Integer,Boolean,Integer,Long>,PFunction{
      long accept(long v0,int v1,boolean v2,int v3);
      @Override
      default Long apply(Long v0,Integer v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIBBI extends Function4<Long,Integer,Boolean,Boolean,Integer>,PFunction{
      int accept(long v0,int v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Long v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIBBB extends Function4<Long,Integer,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(long v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIBBD extends Function4<Long,Integer,Boolean,Boolean,Double>,PFunction{
      double accept(long v0,int v1,boolean v2,boolean v3);
      @Override
      default Double apply(Long v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIBBL extends Function4<Long,Integer,Boolean,Boolean,Long>,PFunction{
      long accept(long v0,int v1,boolean v2,boolean v3);
      @Override
      default Long apply(Long v0,Integer v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIBDI extends Function4<Long,Integer,Boolean,Double,Integer>,PFunction{
      int accept(long v0,int v1,boolean v2,double v3);
      @Override
      default Integer apply(Long v0,Integer v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIBDB extends Function4<Long,Integer,Boolean,Double,Boolean>,PFunction{
      boolean accept(long v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIBDD extends Function4<Long,Integer,Boolean,Double,Double>,PFunction{
      double accept(long v0,int v1,boolean v2,double v3);
      @Override
      default Double apply(Long v0,Integer v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIBDL extends Function4<Long,Integer,Boolean,Double,Long>,PFunction{
      long accept(long v0,int v1,boolean v2,double v3);
      @Override
      default Long apply(Long v0,Integer v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIBLI extends Function4<Long,Integer,Boolean,Long,Integer>,PFunction{
      int accept(long v0,int v1,boolean v2,long v3);
      @Override
      default Integer apply(Long v0,Integer v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIBLB extends Function4<Long,Integer,Boolean,Long,Boolean>,PFunction{
      boolean accept(long v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIBLD extends Function4<Long,Integer,Boolean,Long,Double>,PFunction{
      double accept(long v0,int v1,boolean v2,long v3);
      @Override
      default Double apply(Long v0,Integer v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIBLL extends Function4<Long,Integer,Boolean,Long,Long>,PFunction{
      long accept(long v0,int v1,boolean v2,long v3);
      @Override
      default Long apply(Long v0,Integer v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIDII extends Function4<Long,Integer,Double,Integer,Integer>,PFunction{
      int accept(long v0,int v1,double v2,int v3);
      @Override
      default Integer apply(Long v0,Integer v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIDIB extends Function4<Long,Integer,Double,Integer,Boolean>,PFunction{
      boolean accept(long v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIDID extends Function4<Long,Integer,Double,Integer,Double>,PFunction{
      double accept(long v0,int v1,double v2,int v3);
      @Override
      default Double apply(Long v0,Integer v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIDIL extends Function4<Long,Integer,Double,Integer,Long>,PFunction{
      long accept(long v0,int v1,double v2,int v3);
      @Override
      default Long apply(Long v0,Integer v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLIDBI extends Function4<Long,Integer,Double,Boolean,Integer>,PFunction{
      int accept(long v0,int v1,double v2,boolean v3);
      @Override
      default Integer apply(Long v0,Integer v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIDBB extends Function4<Long,Integer,Double,Boolean,Boolean>,PFunction{
      boolean accept(long v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIDBD extends Function4<Long,Integer,Double,Boolean,Double>,PFunction{
      double accept(long v0,int v1,double v2,boolean v3);
      @Override
      default Double apply(Long v0,Integer v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIDBL extends Function4<Long,Integer,Double,Boolean,Long>,PFunction{
      long accept(long v0,int v1,double v2,boolean v3);
      @Override
      default Long apply(Long v0,Integer v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLIDDI extends Function4<Long,Integer,Double,Double,Integer>,PFunction{
      int accept(long v0,int v1,double v2,double v3);
      @Override
      default Integer apply(Long v0,Integer v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIDDB extends Function4<Long,Integer,Double,Double,Boolean>,PFunction{
      boolean accept(long v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIDDD extends Function4<Long,Integer,Double,Double,Double>,PFunction{
      double accept(long v0,int v1,double v2,double v3);
      @Override
      default Double apply(Long v0,Integer v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIDDL extends Function4<Long,Integer,Double,Double,Long>,PFunction{
      long accept(long v0,int v1,double v2,double v3);
      @Override
      default Long apply(Long v0,Integer v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLIDLI extends Function4<Long,Integer,Double,Long,Integer>,PFunction{
      int accept(long v0,int v1,double v2,long v3);
      @Override
      default Integer apply(Long v0,Integer v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIDLB extends Function4<Long,Integer,Double,Long,Boolean>,PFunction{
      boolean accept(long v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIDLD extends Function4<Long,Integer,Double,Long,Double>,PFunction{
      double accept(long v0,int v1,double v2,long v3);
      @Override
      default Double apply(Long v0,Integer v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLIDLL extends Function4<Long,Integer,Double,Long,Long>,PFunction{
      long accept(long v0,int v1,double v2,long v3);
      @Override
      default Long apply(Long v0,Integer v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLILII extends Function4<Long,Integer,Long,Integer,Integer>,PFunction{
      int accept(long v0,int v1,long v2,int v3);
      @Override
      default Integer apply(Long v0,Integer v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLILIB extends Function4<Long,Integer,Long,Integer,Boolean>,PFunction{
      boolean accept(long v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLILID extends Function4<Long,Integer,Long,Integer,Double>,PFunction{
      double accept(long v0,int v1,long v2,int v3);
      @Override
      default Double apply(Long v0,Integer v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLILIL extends Function4<Long,Integer,Long,Integer,Long>,PFunction{
      long accept(long v0,int v1,long v2,int v3);
      @Override
      default Long apply(Long v0,Integer v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLILBI extends Function4<Long,Integer,Long,Boolean,Integer>,PFunction{
      int accept(long v0,int v1,long v2,boolean v3);
      @Override
      default Integer apply(Long v0,Integer v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLILBB extends Function4<Long,Integer,Long,Boolean,Boolean>,PFunction{
      boolean accept(long v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLILBD extends Function4<Long,Integer,Long,Boolean,Double>,PFunction{
      double accept(long v0,int v1,long v2,boolean v3);
      @Override
      default Double apply(Long v0,Integer v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLILBL extends Function4<Long,Integer,Long,Boolean,Long>,PFunction{
      long accept(long v0,int v1,long v2,boolean v3);
      @Override
      default Long apply(Long v0,Integer v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLILDI extends Function4<Long,Integer,Long,Double,Integer>,PFunction{
      int accept(long v0,int v1,long v2,double v3);
      @Override
      default Integer apply(Long v0,Integer v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLILDB extends Function4<Long,Integer,Long,Double,Boolean>,PFunction{
      boolean accept(long v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLILDD extends Function4<Long,Integer,Long,Double,Double>,PFunction{
      double accept(long v0,int v1,long v2,double v3);
      @Override
      default Double apply(Long v0,Integer v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLILDL extends Function4<Long,Integer,Long,Double,Long>,PFunction{
      long accept(long v0,int v1,long v2,double v3);
      @Override
      default Long apply(Long v0,Integer v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLILLI extends Function4<Long,Integer,Long,Long,Integer>,PFunction{
      int accept(long v0,int v1,long v2,long v3);
      @Override
      default Integer apply(Long v0,Integer v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLILLB extends Function4<Long,Integer,Long,Long,Boolean>,PFunction{
      boolean accept(long v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLILLD extends Function4<Long,Integer,Long,Long,Double>,PFunction{
      double accept(long v0,int v1,long v2,long v3);
      @Override
      default Double apply(Long v0,Integer v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLILLL extends Function4<Long,Integer,Long,Long,Long>,PFunction{
      long accept(long v0,int v1,long v2,long v3);
      @Override
      default Long apply(Long v0,Integer v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBIII extends Function4<Long,Boolean,Integer,Integer,Integer>,PFunction{
      int accept(long v0,boolean v1,int v2,int v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBIIB extends Function4<Long,Boolean,Integer,Integer,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBIID extends Function4<Long,Boolean,Integer,Integer,Double>,PFunction{
      double accept(long v0,boolean v1,int v2,int v3);
      @Override
      default Double apply(Long v0,Boolean v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBIIL extends Function4<Long,Boolean,Integer,Integer,Long>,PFunction{
      long accept(long v0,boolean v1,int v2,int v3);
      @Override
      default Long apply(Long v0,Boolean v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBIBI extends Function4<Long,Boolean,Integer,Boolean,Integer>,PFunction{
      int accept(long v0,boolean v1,int v2,boolean v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBIBB extends Function4<Long,Boolean,Integer,Boolean,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBIBD extends Function4<Long,Boolean,Integer,Boolean,Double>,PFunction{
      double accept(long v0,boolean v1,int v2,boolean v3);
      @Override
      default Double apply(Long v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBIBL extends Function4<Long,Boolean,Integer,Boolean,Long>,PFunction{
      long accept(long v0,boolean v1,int v2,boolean v3);
      @Override
      default Long apply(Long v0,Boolean v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBIDI extends Function4<Long,Boolean,Integer,Double,Integer>,PFunction{
      int accept(long v0,boolean v1,int v2,double v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBIDB extends Function4<Long,Boolean,Integer,Double,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBIDD extends Function4<Long,Boolean,Integer,Double,Double>,PFunction{
      double accept(long v0,boolean v1,int v2,double v3);
      @Override
      default Double apply(Long v0,Boolean v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBIDL extends Function4<Long,Boolean,Integer,Double,Long>,PFunction{
      long accept(long v0,boolean v1,int v2,double v3);
      @Override
      default Long apply(Long v0,Boolean v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBILI extends Function4<Long,Boolean,Integer,Long,Integer>,PFunction{
      int accept(long v0,boolean v1,int v2,long v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBILB extends Function4<Long,Boolean,Integer,Long,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBILD extends Function4<Long,Boolean,Integer,Long,Double>,PFunction{
      double accept(long v0,boolean v1,int v2,long v3);
      @Override
      default Double apply(Long v0,Boolean v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBILL extends Function4<Long,Boolean,Integer,Long,Long>,PFunction{
      long accept(long v0,boolean v1,int v2,long v3);
      @Override
      default Long apply(Long v0,Boolean v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBBII extends Function4<Long,Boolean,Boolean,Integer,Integer>,PFunction{
      int accept(long v0,boolean v1,boolean v2,int v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBBIB extends Function4<Long,Boolean,Boolean,Integer,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBBID extends Function4<Long,Boolean,Boolean,Integer,Double>,PFunction{
      double accept(long v0,boolean v1,boolean v2,int v3);
      @Override
      default Double apply(Long v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBBIL extends Function4<Long,Boolean,Boolean,Integer,Long>,PFunction{
      long accept(long v0,boolean v1,boolean v2,int v3);
      @Override
      default Long apply(Long v0,Boolean v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBBBI extends Function4<Long,Boolean,Boolean,Boolean,Integer>,PFunction{
      int accept(long v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBBBB extends Function4<Long,Boolean,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBBBD extends Function4<Long,Boolean,Boolean,Boolean,Double>,PFunction{
      double accept(long v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Double apply(Long v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBBBL extends Function4<Long,Boolean,Boolean,Boolean,Long>,PFunction{
      long accept(long v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Long apply(Long v0,Boolean v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBBDI extends Function4<Long,Boolean,Boolean,Double,Integer>,PFunction{
      int accept(long v0,boolean v1,boolean v2,double v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBBDB extends Function4<Long,Boolean,Boolean,Double,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBBDD extends Function4<Long,Boolean,Boolean,Double,Double>,PFunction{
      double accept(long v0,boolean v1,boolean v2,double v3);
      @Override
      default Double apply(Long v0,Boolean v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBBDL extends Function4<Long,Boolean,Boolean,Double,Long>,PFunction{
      long accept(long v0,boolean v1,boolean v2,double v3);
      @Override
      default Long apply(Long v0,Boolean v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBBLI extends Function4<Long,Boolean,Boolean,Long,Integer>,PFunction{
      int accept(long v0,boolean v1,boolean v2,long v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBBLB extends Function4<Long,Boolean,Boolean,Long,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBBLD extends Function4<Long,Boolean,Boolean,Long,Double>,PFunction{
      double accept(long v0,boolean v1,boolean v2,long v3);
      @Override
      default Double apply(Long v0,Boolean v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBBLL extends Function4<Long,Boolean,Boolean,Long,Long>,PFunction{
      long accept(long v0,boolean v1,boolean v2,long v3);
      @Override
      default Long apply(Long v0,Boolean v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBDII extends Function4<Long,Boolean,Double,Integer,Integer>,PFunction{
      int accept(long v0,boolean v1,double v2,int v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBDIB extends Function4<Long,Boolean,Double,Integer,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBDID extends Function4<Long,Boolean,Double,Integer,Double>,PFunction{
      double accept(long v0,boolean v1,double v2,int v3);
      @Override
      default Double apply(Long v0,Boolean v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBDIL extends Function4<Long,Boolean,Double,Integer,Long>,PFunction{
      long accept(long v0,boolean v1,double v2,int v3);
      @Override
      default Long apply(Long v0,Boolean v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBDBI extends Function4<Long,Boolean,Double,Boolean,Integer>,PFunction{
      int accept(long v0,boolean v1,double v2,boolean v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBDBB extends Function4<Long,Boolean,Double,Boolean,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBDBD extends Function4<Long,Boolean,Double,Boolean,Double>,PFunction{
      double accept(long v0,boolean v1,double v2,boolean v3);
      @Override
      default Double apply(Long v0,Boolean v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBDBL extends Function4<Long,Boolean,Double,Boolean,Long>,PFunction{
      long accept(long v0,boolean v1,double v2,boolean v3);
      @Override
      default Long apply(Long v0,Boolean v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBDDI extends Function4<Long,Boolean,Double,Double,Integer>,PFunction{
      int accept(long v0,boolean v1,double v2,double v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBDDB extends Function4<Long,Boolean,Double,Double,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBDDD extends Function4<Long,Boolean,Double,Double,Double>,PFunction{
      double accept(long v0,boolean v1,double v2,double v3);
      @Override
      default Double apply(Long v0,Boolean v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBDDL extends Function4<Long,Boolean,Double,Double,Long>,PFunction{
      long accept(long v0,boolean v1,double v2,double v3);
      @Override
      default Long apply(Long v0,Boolean v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBDLI extends Function4<Long,Boolean,Double,Long,Integer>,PFunction{
      int accept(long v0,boolean v1,double v2,long v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBDLB extends Function4<Long,Boolean,Double,Long,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBDLD extends Function4<Long,Boolean,Double,Long,Double>,PFunction{
      double accept(long v0,boolean v1,double v2,long v3);
      @Override
      default Double apply(Long v0,Boolean v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBDLL extends Function4<Long,Boolean,Double,Long,Long>,PFunction{
      long accept(long v0,boolean v1,double v2,long v3);
      @Override
      default Long apply(Long v0,Boolean v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBLII extends Function4<Long,Boolean,Long,Integer,Integer>,PFunction{
      int accept(long v0,boolean v1,long v2,int v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBLIB extends Function4<Long,Boolean,Long,Integer,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBLID extends Function4<Long,Boolean,Long,Integer,Double>,PFunction{
      double accept(long v0,boolean v1,long v2,int v3);
      @Override
      default Double apply(Long v0,Boolean v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBLIL extends Function4<Long,Boolean,Long,Integer,Long>,PFunction{
      long accept(long v0,boolean v1,long v2,int v3);
      @Override
      default Long apply(Long v0,Boolean v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLBLBI extends Function4<Long,Boolean,Long,Boolean,Integer>,PFunction{
      int accept(long v0,boolean v1,long v2,boolean v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBLBB extends Function4<Long,Boolean,Long,Boolean,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBLBD extends Function4<Long,Boolean,Long,Boolean,Double>,PFunction{
      double accept(long v0,boolean v1,long v2,boolean v3);
      @Override
      default Double apply(Long v0,Boolean v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBLBL extends Function4<Long,Boolean,Long,Boolean,Long>,PFunction{
      long accept(long v0,boolean v1,long v2,boolean v3);
      @Override
      default Long apply(Long v0,Boolean v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLBLDI extends Function4<Long,Boolean,Long,Double,Integer>,PFunction{
      int accept(long v0,boolean v1,long v2,double v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBLDB extends Function4<Long,Boolean,Long,Double,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBLDD extends Function4<Long,Boolean,Long,Double,Double>,PFunction{
      double accept(long v0,boolean v1,long v2,double v3);
      @Override
      default Double apply(Long v0,Boolean v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBLDL extends Function4<Long,Boolean,Long,Double,Long>,PFunction{
      long accept(long v0,boolean v1,long v2,double v3);
      @Override
      default Long apply(Long v0,Boolean v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLBLLI extends Function4<Long,Boolean,Long,Long,Integer>,PFunction{
      int accept(long v0,boolean v1,long v2,long v3);
      @Override
      default Integer apply(Long v0,Boolean v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBLLB extends Function4<Long,Boolean,Long,Long,Boolean>,PFunction{
      boolean accept(long v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBLLD extends Function4<Long,Boolean,Long,Long,Double>,PFunction{
      double accept(long v0,boolean v1,long v2,long v3);
      @Override
      default Double apply(Long v0,Boolean v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLBLLL extends Function4<Long,Boolean,Long,Long,Long>,PFunction{
      long accept(long v0,boolean v1,long v2,long v3);
      @Override
      default Long apply(Long v0,Boolean v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDIII extends Function4<Long,Double,Integer,Integer,Integer>,PFunction{
      int accept(long v0,double v1,int v2,int v3);
      @Override
      default Integer apply(Long v0,Double v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDIIB extends Function4<Long,Double,Integer,Integer,Boolean>,PFunction{
      boolean accept(long v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDIID extends Function4<Long,Double,Integer,Integer,Double>,PFunction{
      double accept(long v0,double v1,int v2,int v3);
      @Override
      default Double apply(Long v0,Double v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDIIL extends Function4<Long,Double,Integer,Integer,Long>,PFunction{
      long accept(long v0,double v1,int v2,int v3);
      @Override
      default Long apply(Long v0,Double v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDIBI extends Function4<Long,Double,Integer,Boolean,Integer>,PFunction{
      int accept(long v0,double v1,int v2,boolean v3);
      @Override
      default Integer apply(Long v0,Double v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDIBB extends Function4<Long,Double,Integer,Boolean,Boolean>,PFunction{
      boolean accept(long v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDIBD extends Function4<Long,Double,Integer,Boolean,Double>,PFunction{
      double accept(long v0,double v1,int v2,boolean v3);
      @Override
      default Double apply(Long v0,Double v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDIBL extends Function4<Long,Double,Integer,Boolean,Long>,PFunction{
      long accept(long v0,double v1,int v2,boolean v3);
      @Override
      default Long apply(Long v0,Double v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDIDI extends Function4<Long,Double,Integer,Double,Integer>,PFunction{
      int accept(long v0,double v1,int v2,double v3);
      @Override
      default Integer apply(Long v0,Double v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDIDB extends Function4<Long,Double,Integer,Double,Boolean>,PFunction{
      boolean accept(long v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDIDD extends Function4<Long,Double,Integer,Double,Double>,PFunction{
      double accept(long v0,double v1,int v2,double v3);
      @Override
      default Double apply(Long v0,Double v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDIDL extends Function4<Long,Double,Integer,Double,Long>,PFunction{
      long accept(long v0,double v1,int v2,double v3);
      @Override
      default Long apply(Long v0,Double v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDILI extends Function4<Long,Double,Integer,Long,Integer>,PFunction{
      int accept(long v0,double v1,int v2,long v3);
      @Override
      default Integer apply(Long v0,Double v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDILB extends Function4<Long,Double,Integer,Long,Boolean>,PFunction{
      boolean accept(long v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDILD extends Function4<Long,Double,Integer,Long,Double>,PFunction{
      double accept(long v0,double v1,int v2,long v3);
      @Override
      default Double apply(Long v0,Double v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDILL extends Function4<Long,Double,Integer,Long,Long>,PFunction{
      long accept(long v0,double v1,int v2,long v3);
      @Override
      default Long apply(Long v0,Double v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDBII extends Function4<Long,Double,Boolean,Integer,Integer>,PFunction{
      int accept(long v0,double v1,boolean v2,int v3);
      @Override
      default Integer apply(Long v0,Double v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDBIB extends Function4<Long,Double,Boolean,Integer,Boolean>,PFunction{
      boolean accept(long v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDBID extends Function4<Long,Double,Boolean,Integer,Double>,PFunction{
      double accept(long v0,double v1,boolean v2,int v3);
      @Override
      default Double apply(Long v0,Double v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDBIL extends Function4<Long,Double,Boolean,Integer,Long>,PFunction{
      long accept(long v0,double v1,boolean v2,int v3);
      @Override
      default Long apply(Long v0,Double v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDBBI extends Function4<Long,Double,Boolean,Boolean,Integer>,PFunction{
      int accept(long v0,double v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Long v0,Double v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDBBB extends Function4<Long,Double,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(long v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDBBD extends Function4<Long,Double,Boolean,Boolean,Double>,PFunction{
      double accept(long v0,double v1,boolean v2,boolean v3);
      @Override
      default Double apply(Long v0,Double v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDBBL extends Function4<Long,Double,Boolean,Boolean,Long>,PFunction{
      long accept(long v0,double v1,boolean v2,boolean v3);
      @Override
      default Long apply(Long v0,Double v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDBDI extends Function4<Long,Double,Boolean,Double,Integer>,PFunction{
      int accept(long v0,double v1,boolean v2,double v3);
      @Override
      default Integer apply(Long v0,Double v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDBDB extends Function4<Long,Double,Boolean,Double,Boolean>,PFunction{
      boolean accept(long v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDBDD extends Function4<Long,Double,Boolean,Double,Double>,PFunction{
      double accept(long v0,double v1,boolean v2,double v3);
      @Override
      default Double apply(Long v0,Double v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDBDL extends Function4<Long,Double,Boolean,Double,Long>,PFunction{
      long accept(long v0,double v1,boolean v2,double v3);
      @Override
      default Long apply(Long v0,Double v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDBLI extends Function4<Long,Double,Boolean,Long,Integer>,PFunction{
      int accept(long v0,double v1,boolean v2,long v3);
      @Override
      default Integer apply(Long v0,Double v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDBLB extends Function4<Long,Double,Boolean,Long,Boolean>,PFunction{
      boolean accept(long v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDBLD extends Function4<Long,Double,Boolean,Long,Double>,PFunction{
      double accept(long v0,double v1,boolean v2,long v3);
      @Override
      default Double apply(Long v0,Double v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDBLL extends Function4<Long,Double,Boolean,Long,Long>,PFunction{
      long accept(long v0,double v1,boolean v2,long v3);
      @Override
      default Long apply(Long v0,Double v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDDII extends Function4<Long,Double,Double,Integer,Integer>,PFunction{
      int accept(long v0,double v1,double v2,int v3);
      @Override
      default Integer apply(Long v0,Double v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDDIB extends Function4<Long,Double,Double,Integer,Boolean>,PFunction{
      boolean accept(long v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDDID extends Function4<Long,Double,Double,Integer,Double>,PFunction{
      double accept(long v0,double v1,double v2,int v3);
      @Override
      default Double apply(Long v0,Double v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDDIL extends Function4<Long,Double,Double,Integer,Long>,PFunction{
      long accept(long v0,double v1,double v2,int v3);
      @Override
      default Long apply(Long v0,Double v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDDBI extends Function4<Long,Double,Double,Boolean,Integer>,PFunction{
      int accept(long v0,double v1,double v2,boolean v3);
      @Override
      default Integer apply(Long v0,Double v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDDBB extends Function4<Long,Double,Double,Boolean,Boolean>,PFunction{
      boolean accept(long v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDDBD extends Function4<Long,Double,Double,Boolean,Double>,PFunction{
      double accept(long v0,double v1,double v2,boolean v3);
      @Override
      default Double apply(Long v0,Double v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDDBL extends Function4<Long,Double,Double,Boolean,Long>,PFunction{
      long accept(long v0,double v1,double v2,boolean v3);
      @Override
      default Long apply(Long v0,Double v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDDDI extends Function4<Long,Double,Double,Double,Integer>,PFunction{
      int accept(long v0,double v1,double v2,double v3);
      @Override
      default Integer apply(Long v0,Double v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDDDB extends Function4<Long,Double,Double,Double,Boolean>,PFunction{
      boolean accept(long v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDDDD extends Function4<Long,Double,Double,Double,Double>,PFunction{
      double accept(long v0,double v1,double v2,double v3);
      @Override
      default Double apply(Long v0,Double v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDDDL extends Function4<Long,Double,Double,Double,Long>,PFunction{
      long accept(long v0,double v1,double v2,double v3);
      @Override
      default Long apply(Long v0,Double v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDDLI extends Function4<Long,Double,Double,Long,Integer>,PFunction{
      int accept(long v0,double v1,double v2,long v3);
      @Override
      default Integer apply(Long v0,Double v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDDLB extends Function4<Long,Double,Double,Long,Boolean>,PFunction{
      boolean accept(long v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDDLD extends Function4<Long,Double,Double,Long,Double>,PFunction{
      double accept(long v0,double v1,double v2,long v3);
      @Override
      default Double apply(Long v0,Double v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDDLL extends Function4<Long,Double,Double,Long,Long>,PFunction{
      long accept(long v0,double v1,double v2,long v3);
      @Override
      default Long apply(Long v0,Double v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDLII extends Function4<Long,Double,Long,Integer,Integer>,PFunction{
      int accept(long v0,double v1,long v2,int v3);
      @Override
      default Integer apply(Long v0,Double v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDLIB extends Function4<Long,Double,Long,Integer,Boolean>,PFunction{
      boolean accept(long v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDLID extends Function4<Long,Double,Long,Integer,Double>,PFunction{
      double accept(long v0,double v1,long v2,int v3);
      @Override
      default Double apply(Long v0,Double v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDLIL extends Function4<Long,Double,Long,Integer,Long>,PFunction{
      long accept(long v0,double v1,long v2,int v3);
      @Override
      default Long apply(Long v0,Double v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLDLBI extends Function4<Long,Double,Long,Boolean,Integer>,PFunction{
      int accept(long v0,double v1,long v2,boolean v3);
      @Override
      default Integer apply(Long v0,Double v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDLBB extends Function4<Long,Double,Long,Boolean,Boolean>,PFunction{
      boolean accept(long v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDLBD extends Function4<Long,Double,Long,Boolean,Double>,PFunction{
      double accept(long v0,double v1,long v2,boolean v3);
      @Override
      default Double apply(Long v0,Double v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDLBL extends Function4<Long,Double,Long,Boolean,Long>,PFunction{
      long accept(long v0,double v1,long v2,boolean v3);
      @Override
      default Long apply(Long v0,Double v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLDLDI extends Function4<Long,Double,Long,Double,Integer>,PFunction{
      int accept(long v0,double v1,long v2,double v3);
      @Override
      default Integer apply(Long v0,Double v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDLDB extends Function4<Long,Double,Long,Double,Boolean>,PFunction{
      boolean accept(long v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDLDD extends Function4<Long,Double,Long,Double,Double>,PFunction{
      double accept(long v0,double v1,long v2,double v3);
      @Override
      default Double apply(Long v0,Double v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDLDL extends Function4<Long,Double,Long,Double,Long>,PFunction{
      long accept(long v0,double v1,long v2,double v3);
      @Override
      default Long apply(Long v0,Double v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLDLLI extends Function4<Long,Double,Long,Long,Integer>,PFunction{
      int accept(long v0,double v1,long v2,long v3);
      @Override
      default Integer apply(Long v0,Double v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDLLB extends Function4<Long,Double,Long,Long,Boolean>,PFunction{
      boolean accept(long v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDLLD extends Function4<Long,Double,Long,Long,Double>,PFunction{
      double accept(long v0,double v1,long v2,long v3);
      @Override
      default Double apply(Long v0,Double v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLDLLL extends Function4<Long,Double,Long,Long,Long>,PFunction{
      long accept(long v0,double v1,long v2,long v3);
      @Override
      default Long apply(Long v0,Double v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLIII extends Function4<Long,Long,Integer,Integer,Integer>,PFunction{
      int accept(long v0,long v1,int v2,int v3);
      @Override
      default Integer apply(Long v0,Long v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLIIB extends Function4<Long,Long,Integer,Integer,Boolean>,PFunction{
      boolean accept(long v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLIID extends Function4<Long,Long,Integer,Integer,Double>,PFunction{
      double accept(long v0,long v1,int v2,int v3);
      @Override
      default Double apply(Long v0,Long v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLIIL extends Function4<Long,Long,Integer,Integer,Long>,PFunction{
      long accept(long v0,long v1,int v2,int v3);
      @Override
      default Long apply(Long v0,Long v1,Integer v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLIBI extends Function4<Long,Long,Integer,Boolean,Integer>,PFunction{
      int accept(long v0,long v1,int v2,boolean v3);
      @Override
      default Integer apply(Long v0,Long v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLIBB extends Function4<Long,Long,Integer,Boolean,Boolean>,PFunction{
      boolean accept(long v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLIBD extends Function4<Long,Long,Integer,Boolean,Double>,PFunction{
      double accept(long v0,long v1,int v2,boolean v3);
      @Override
      default Double apply(Long v0,Long v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLIBL extends Function4<Long,Long,Integer,Boolean,Long>,PFunction{
      long accept(long v0,long v1,int v2,boolean v3);
      @Override
      default Long apply(Long v0,Long v1,Integer v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLIDI extends Function4<Long,Long,Integer,Double,Integer>,PFunction{
      int accept(long v0,long v1,int v2,double v3);
      @Override
      default Integer apply(Long v0,Long v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLIDB extends Function4<Long,Long,Integer,Double,Boolean>,PFunction{
      boolean accept(long v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLIDD extends Function4<Long,Long,Integer,Double,Double>,PFunction{
      double accept(long v0,long v1,int v2,double v3);
      @Override
      default Double apply(Long v0,Long v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLIDL extends Function4<Long,Long,Integer,Double,Long>,PFunction{
      long accept(long v0,long v1,int v2,double v3);
      @Override
      default Long apply(Long v0,Long v1,Integer v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLILI extends Function4<Long,Long,Integer,Long,Integer>,PFunction{
      int accept(long v0,long v1,int v2,long v3);
      @Override
      default Integer apply(Long v0,Long v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLILB extends Function4<Long,Long,Integer,Long,Boolean>,PFunction{
      boolean accept(long v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLILD extends Function4<Long,Long,Integer,Long,Double>,PFunction{
      double accept(long v0,long v1,int v2,long v3);
      @Override
      default Double apply(Long v0,Long v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLILL extends Function4<Long,Long,Integer,Long,Long>,PFunction{
      long accept(long v0,long v1,int v2,long v3);
      @Override
      default Long apply(Long v0,Long v1,Integer v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLBII extends Function4<Long,Long,Boolean,Integer,Integer>,PFunction{
      int accept(long v0,long v1,boolean v2,int v3);
      @Override
      default Integer apply(Long v0,Long v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLBIB extends Function4<Long,Long,Boolean,Integer,Boolean>,PFunction{
      boolean accept(long v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLBID extends Function4<Long,Long,Boolean,Integer,Double>,PFunction{
      double accept(long v0,long v1,boolean v2,int v3);
      @Override
      default Double apply(Long v0,Long v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLBIL extends Function4<Long,Long,Boolean,Integer,Long>,PFunction{
      long accept(long v0,long v1,boolean v2,int v3);
      @Override
      default Long apply(Long v0,Long v1,Boolean v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLBBI extends Function4<Long,Long,Boolean,Boolean,Integer>,PFunction{
      int accept(long v0,long v1,boolean v2,boolean v3);
      @Override
      default Integer apply(Long v0,Long v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLBBB extends Function4<Long,Long,Boolean,Boolean,Boolean>,PFunction{
      boolean accept(long v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLBBD extends Function4<Long,Long,Boolean,Boolean,Double>,PFunction{
      double accept(long v0,long v1,boolean v2,boolean v3);
      @Override
      default Double apply(Long v0,Long v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLBBL extends Function4<Long,Long,Boolean,Boolean,Long>,PFunction{
      long accept(long v0,long v1,boolean v2,boolean v3);
      @Override
      default Long apply(Long v0,Long v1,Boolean v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLBDI extends Function4<Long,Long,Boolean,Double,Integer>,PFunction{
      int accept(long v0,long v1,boolean v2,double v3);
      @Override
      default Integer apply(Long v0,Long v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLBDB extends Function4<Long,Long,Boolean,Double,Boolean>,PFunction{
      boolean accept(long v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLBDD extends Function4<Long,Long,Boolean,Double,Double>,PFunction{
      double accept(long v0,long v1,boolean v2,double v3);
      @Override
      default Double apply(Long v0,Long v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLBDL extends Function4<Long,Long,Boolean,Double,Long>,PFunction{
      long accept(long v0,long v1,boolean v2,double v3);
      @Override
      default Long apply(Long v0,Long v1,Boolean v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLBLI extends Function4<Long,Long,Boolean,Long,Integer>,PFunction{
      int accept(long v0,long v1,boolean v2,long v3);
      @Override
      default Integer apply(Long v0,Long v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLBLB extends Function4<Long,Long,Boolean,Long,Boolean>,PFunction{
      boolean accept(long v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLBLD extends Function4<Long,Long,Boolean,Long,Double>,PFunction{
      double accept(long v0,long v1,boolean v2,long v3);
      @Override
      default Double apply(Long v0,Long v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLBLL extends Function4<Long,Long,Boolean,Long,Long>,PFunction{
      long accept(long v0,long v1,boolean v2,long v3);
      @Override
      default Long apply(Long v0,Long v1,Boolean v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLDII extends Function4<Long,Long,Double,Integer,Integer>,PFunction{
      int accept(long v0,long v1,double v2,int v3);
      @Override
      default Integer apply(Long v0,Long v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLDIB extends Function4<Long,Long,Double,Integer,Boolean>,PFunction{
      boolean accept(long v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLDID extends Function4<Long,Long,Double,Integer,Double>,PFunction{
      double accept(long v0,long v1,double v2,int v3);
      @Override
      default Double apply(Long v0,Long v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLDIL extends Function4<Long,Long,Double,Integer,Long>,PFunction{
      long accept(long v0,long v1,double v2,int v3);
      @Override
      default Long apply(Long v0,Long v1,Double v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLDBI extends Function4<Long,Long,Double,Boolean,Integer>,PFunction{
      int accept(long v0,long v1,double v2,boolean v3);
      @Override
      default Integer apply(Long v0,Long v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLDBB extends Function4<Long,Long,Double,Boolean,Boolean>,PFunction{
      boolean accept(long v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLDBD extends Function4<Long,Long,Double,Boolean,Double>,PFunction{
      double accept(long v0,long v1,double v2,boolean v3);
      @Override
      default Double apply(Long v0,Long v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLDBL extends Function4<Long,Long,Double,Boolean,Long>,PFunction{
      long accept(long v0,long v1,double v2,boolean v3);
      @Override
      default Long apply(Long v0,Long v1,Double v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLDDI extends Function4<Long,Long,Double,Double,Integer>,PFunction{
      int accept(long v0,long v1,double v2,double v3);
      @Override
      default Integer apply(Long v0,Long v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLDDB extends Function4<Long,Long,Double,Double,Boolean>,PFunction{
      boolean accept(long v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLDDD extends Function4<Long,Long,Double,Double,Double>,PFunction{
      double accept(long v0,long v1,double v2,double v3);
      @Override
      default Double apply(Long v0,Long v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLDDL extends Function4<Long,Long,Double,Double,Long>,PFunction{
      long accept(long v0,long v1,double v2,double v3);
      @Override
      default Long apply(Long v0,Long v1,Double v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLDLI extends Function4<Long,Long,Double,Long,Integer>,PFunction{
      int accept(long v0,long v1,double v2,long v3);
      @Override
      default Integer apply(Long v0,Long v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLDLB extends Function4<Long,Long,Double,Long,Boolean>,PFunction{
      boolean accept(long v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLDLD extends Function4<Long,Long,Double,Long,Double>,PFunction{
      double accept(long v0,long v1,double v2,long v3);
      @Override
      default Double apply(Long v0,Long v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLDLL extends Function4<Long,Long,Double,Long,Long>,PFunction{
      long accept(long v0,long v1,double v2,long v3);
      @Override
      default Long apply(Long v0,Long v1,Double v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLLII extends Function4<Long,Long,Long,Integer,Integer>,PFunction{
      int accept(long v0,long v1,long v2,int v3);
      @Override
      default Integer apply(Long v0,Long v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLLIB extends Function4<Long,Long,Long,Integer,Boolean>,PFunction{
      boolean accept(long v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLLID extends Function4<Long,Long,Long,Integer,Double>,PFunction{
      double accept(long v0,long v1,long v2,int v3);
      @Override
      default Double apply(Long v0,Long v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLLIL extends Function4<Long,Long,Long,Integer,Long>,PFunction{
      long accept(long v0,long v1,long v2,int v3);
      @Override
      default Long apply(Long v0,Long v1,Long v2,Integer v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface FnLLLBI extends Function4<Long,Long,Long,Boolean,Integer>,PFunction{
      int accept(long v0,long v1,long v2,boolean v3);
      @Override
      default Integer apply(Long v0,Long v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLLBB extends Function4<Long,Long,Long,Boolean,Boolean>,PFunction{
      boolean accept(long v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLLBD extends Function4<Long,Long,Long,Boolean,Double>,PFunction{
      double accept(long v0,long v1,long v2,boolean v3);
      @Override
      default Double apply(Long v0,Long v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLLBL extends Function4<Long,Long,Long,Boolean,Long>,PFunction{
      long accept(long v0,long v1,long v2,boolean v3);
      @Override
      default Long apply(Long v0,Long v1,Long v2,Boolean v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface FnLLLDI extends Function4<Long,Long,Long,Double,Integer>,PFunction{
      int accept(long v0,long v1,long v2,double v3);
      @Override
      default Integer apply(Long v0,Long v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLLDB extends Function4<Long,Long,Long,Double,Boolean>,PFunction{
      boolean accept(long v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLLDD extends Function4<Long,Long,Long,Double,Double>,PFunction{
      double accept(long v0,long v1,long v2,double v3);
      @Override
      default Double apply(Long v0,Long v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLLDL extends Function4<Long,Long,Long,Double,Long>,PFunction{
      long accept(long v0,long v1,long v2,double v3);
      @Override
      default Long apply(Long v0,Long v1,Long v2,Double v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface FnLLLLI extends Function4<Long,Long,Long,Long,Integer>,PFunction{
      int accept(long v0,long v1,long v2,long v3);
      @Override
      default Integer apply(Long v0,Long v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLLLB extends Function4<Long,Long,Long,Long,Boolean>,PFunction{
      boolean accept(long v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLLLD extends Function4<Long,Long,Long,Long,Double>,PFunction{
      double accept(long v0,long v1,long v2,long v3);
      @Override
      default Double apply(Long v0,Long v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface FnLLLLL extends Function4<Long,Long,Long,Long,Long>,PFunction{
      long accept(long v0,long v1,long v2,long v3);
      @Override
      default Long apply(Long v0,Long v1,Long v2,Long v3) {
          return accept((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}

}
