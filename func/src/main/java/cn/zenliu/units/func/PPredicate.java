package cn.zenliu.units.func;
import org.jooq.lambda.function.*;
import static java.util.Objects.requireNonNull;
public  interface PPredicate extends Fn {
      interface PredII extends Function2<Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1);
      @Override
      default Boolean apply(Integer v0,Integer v1) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface PredIB extends Function2<Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1);
      @Override
      default Boolean apply(Integer v0,Boolean v1) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface PredID extends Function2<Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1);
      @Override
      default Boolean apply(Integer v0,Double v1) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface PredIL extends Function2<Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1);
      @Override
      default Boolean apply(Integer v0,Long v1) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface PredBI extends Function2<Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1);
      @Override
      default Boolean apply(Boolean v0,Integer v1) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface PredBB extends Function2<Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1);
      @Override
      default Boolean apply(Boolean v0,Boolean v1) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface PredBD extends Function2<Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1);
      @Override
      default Boolean apply(Boolean v0,Double v1) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface PredBL extends Function2<Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1);
      @Override
      default Boolean apply(Boolean v0,Long v1) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface PredDI extends Function2<Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1);
      @Override
      default Boolean apply(Double v0,Integer v1) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface PredDB extends Function2<Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1);
      @Override
      default Boolean apply(Double v0,Boolean v1) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface PredDD extends Function2<Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1);
      @Override
      default Boolean apply(Double v0,Double v1) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface PredDL extends Function2<Double,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1);
      @Override
      default Boolean apply(Double v0,Long v1) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface PredLI extends Function2<Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1);
      @Override
      default Boolean apply(Long v0,Integer v1) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface PredLB extends Function2<Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1);
      @Override
      default Boolean apply(Long v0,Boolean v1) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface PredLD extends Function2<Long,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1);
      @Override
      default Boolean apply(Long v0,Double v1) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface PredLL extends Function2<Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1);
      @Override
      default Boolean apply(Long v0,Long v1) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface PredIII extends Function3<Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredIIB extends Function3<Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredIID extends Function3<Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredIIL extends Function3<Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredIBI extends Function3<Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredIBB extends Function3<Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredIBD extends Function3<Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredIBL extends Function3<Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredIDI extends Function3<Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredIDB extends Function3<Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredIDD extends Function3<Integer,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredIDL extends Function3<Integer,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredILI extends Function3<Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredILB extends Function3<Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredILD extends Function3<Integer,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredILL extends Function3<Integer,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredBII extends Function3<Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredBIB extends Function3<Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredBID extends Function3<Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredBIL extends Function3<Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredBBI extends Function3<Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredBBB extends Function3<Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredBBD extends Function3<Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredBBL extends Function3<Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredBDI extends Function3<Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredBDB extends Function3<Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredBDD extends Function3<Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredBDL extends Function3<Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredBLI extends Function3<Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredBLB extends Function3<Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredBLD extends Function3<Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredBLL extends Function3<Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredDII extends Function3<Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredDIB extends Function3<Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredDID extends Function3<Double,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredDIL extends Function3<Double,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredDBI extends Function3<Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredDBB extends Function3<Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredDBD extends Function3<Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredDBL extends Function3<Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredDDI extends Function3<Double,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredDDB extends Function3<Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredDDD extends Function3<Double,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredDDL extends Function3<Double,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredDLI extends Function3<Double,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredDLB extends Function3<Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredDLD extends Function3<Double,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredDLL extends Function3<Double,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredLII extends Function3<Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredLIB extends Function3<Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredLID extends Function3<Long,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredLIL extends Function3<Long,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredLBI extends Function3<Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredLBB extends Function3<Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredLBD extends Function3<Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredLBL extends Function3<Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredLDI extends Function3<Long,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredLDB extends Function3<Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredLDD extends Function3<Long,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredLDL extends Function3<Long,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredLLI extends Function3<Long,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface PredLLB extends Function3<Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface PredLLD extends Function3<Long,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface PredLLL extends Function3<Long,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface PredIIII extends Function4<Integer,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Integer v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIIIB extends Function4<Integer,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Boolean v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIIID extends Function4<Integer,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Double v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIIIL extends Function4<Integer,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Long v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIIBI extends Function4<Integer,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Integer v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIIBB extends Function4<Integer,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Boolean v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIIBD extends Function4<Integer,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Double v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIIBL extends Function4<Integer,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Long v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIIDI extends Function4<Integer,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Integer v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIIDB extends Function4<Integer,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Boolean v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIIDD extends Function4<Integer,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Double v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIIDL extends Function4<Integer,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Long v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIILI extends Function4<Integer,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Integer v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIILB extends Function4<Integer,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Boolean v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIILD extends Function4<Integer,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Double v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIILL extends Function4<Integer,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Long v3) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIBII extends Function4<Integer,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Integer v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIBIB extends Function4<Integer,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Boolean v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIBID extends Function4<Integer,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Double v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIBIL extends Function4<Integer,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Long v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIBBI extends Function4<Integer,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Integer v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIBBB extends Function4<Integer,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Boolean v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIBBD extends Function4<Integer,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Double v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIBBL extends Function4<Integer,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Long v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIBDI extends Function4<Integer,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Integer v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIBDB extends Function4<Integer,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Boolean v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIBDD extends Function4<Integer,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Double v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIBDL extends Function4<Integer,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Long v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIBLI extends Function4<Integer,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Integer v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIBLB extends Function4<Integer,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Boolean v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIBLD extends Function4<Integer,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Double v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIBLL extends Function4<Integer,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Long v3) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIDII extends Function4<Integer,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Integer v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIDIB extends Function4<Integer,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Boolean v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIDID extends Function4<Integer,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Double v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIDIL extends Function4<Integer,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Long v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIDBI extends Function4<Integer,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Integer v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIDBB extends Function4<Integer,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Boolean v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIDBD extends Function4<Integer,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Double v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIDBL extends Function4<Integer,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Long v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIDDI extends Function4<Integer,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Integer v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIDDB extends Function4<Integer,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Boolean v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIDDD extends Function4<Integer,Double,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Double v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIDDL extends Function4<Integer,Double,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Long v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIDLI extends Function4<Integer,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Integer v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredIDLB extends Function4<Integer,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Boolean v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredIDLD extends Function4<Integer,Double,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Double v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredIDLL extends Function4<Integer,Double,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Long v3) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredILII extends Function4<Integer,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Integer v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredILIB extends Function4<Integer,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Boolean v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredILID extends Function4<Integer,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Double v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredILIL extends Function4<Integer,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Long v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredILBI extends Function4<Integer,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Integer v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredILBB extends Function4<Integer,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Boolean v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredILBD extends Function4<Integer,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Double v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredILBL extends Function4<Integer,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Long v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredILDI extends Function4<Integer,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Integer v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredILDB extends Function4<Integer,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Boolean v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredILDD extends Function4<Integer,Long,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Double v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredILDL extends Function4<Integer,Long,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Long v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredILLI extends Function4<Integer,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Integer v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredILLB extends Function4<Integer,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Boolean v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredILLD extends Function4<Integer,Long,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Double v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredILLL extends Function4<Integer,Long,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Long v3) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBIII extends Function4<Boolean,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBIIB extends Function4<Boolean,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBIID extends Function4<Boolean,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Double v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBIIL extends Function4<Boolean,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Long v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBIBI extends Function4<Boolean,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBIBB extends Function4<Boolean,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBIBD extends Function4<Boolean,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Double v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBIBL extends Function4<Boolean,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Long v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBIDI extends Function4<Boolean,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBIDB extends Function4<Boolean,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBIDD extends Function4<Boolean,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Double v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBIDL extends Function4<Boolean,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Long v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBILI extends Function4<Boolean,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBILB extends Function4<Boolean,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBILD extends Function4<Boolean,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Double v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBILL extends Function4<Boolean,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Long v3) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBBII extends Function4<Boolean,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBBIB extends Function4<Boolean,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBBID extends Function4<Boolean,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Double v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBBIL extends Function4<Boolean,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Long v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBBBI extends Function4<Boolean,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBBBB extends Function4<Boolean,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBBBD extends Function4<Boolean,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Double v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBBBL extends Function4<Boolean,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Long v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBBDI extends Function4<Boolean,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBBDB extends Function4<Boolean,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBBDD extends Function4<Boolean,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Double v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBBDL extends Function4<Boolean,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Long v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBBLI extends Function4<Boolean,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBBLB extends Function4<Boolean,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBBLD extends Function4<Boolean,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Double v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBBLL extends Function4<Boolean,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Long v3) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBDII extends Function4<Boolean,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBDIB extends Function4<Boolean,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBDID extends Function4<Boolean,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Double v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBDIL extends Function4<Boolean,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Long v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBDBI extends Function4<Boolean,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBDBB extends Function4<Boolean,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBDBD extends Function4<Boolean,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Double v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBDBL extends Function4<Boolean,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Long v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBDDI extends Function4<Boolean,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBDDB extends Function4<Boolean,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBDDD extends Function4<Boolean,Double,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Double v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBDDL extends Function4<Boolean,Double,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Long v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBDLI extends Function4<Boolean,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBDLB extends Function4<Boolean,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBDLD extends Function4<Boolean,Double,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Double v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBDLL extends Function4<Boolean,Double,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Long v3) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBLII extends Function4<Boolean,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBLIB extends Function4<Boolean,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBLID extends Function4<Boolean,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Double v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBLIL extends Function4<Boolean,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Long v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBLBI extends Function4<Boolean,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBLBB extends Function4<Boolean,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBLBD extends Function4<Boolean,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Double v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBLBL extends Function4<Boolean,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Long v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBLDI extends Function4<Boolean,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBLDB extends Function4<Boolean,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBLDD extends Function4<Boolean,Long,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Double v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBLDL extends Function4<Boolean,Long,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Long v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredBLLI extends Function4<Boolean,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Integer v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredBLLB extends Function4<Boolean,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Boolean v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredBLLD extends Function4<Boolean,Long,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Double v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredBLLL extends Function4<Boolean,Long,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Long v3) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDIII extends Function4<Double,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Integer v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDIIB extends Function4<Double,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Boolean v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDIID extends Function4<Double,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Double v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDIIL extends Function4<Double,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Long v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDIBI extends Function4<Double,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Integer v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDIBB extends Function4<Double,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Boolean v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDIBD extends Function4<Double,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Double v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDIBL extends Function4<Double,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Long v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDIDI extends Function4<Double,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Integer v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDIDB extends Function4<Double,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Boolean v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDIDD extends Function4<Double,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Double v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDIDL extends Function4<Double,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Long v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDILI extends Function4<Double,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Integer v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDILB extends Function4<Double,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Boolean v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDILD extends Function4<Double,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Double v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDILL extends Function4<Double,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Long v3) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDBII extends Function4<Double,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Integer v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDBIB extends Function4<Double,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Boolean v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDBID extends Function4<Double,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Double v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDBIL extends Function4<Double,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Long v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDBBI extends Function4<Double,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Integer v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDBBB extends Function4<Double,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Boolean v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDBBD extends Function4<Double,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Double v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDBBL extends Function4<Double,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Long v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDBDI extends Function4<Double,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Integer v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDBDB extends Function4<Double,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Boolean v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDBDD extends Function4<Double,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Double v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDBDL extends Function4<Double,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Long v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDBLI extends Function4<Double,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Integer v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDBLB extends Function4<Double,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Boolean v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDBLD extends Function4<Double,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Double v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDBLL extends Function4<Double,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Long v3) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDDII extends Function4<Double,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Integer v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDDIB extends Function4<Double,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Boolean v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDDID extends Function4<Double,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Double v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDDIL extends Function4<Double,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Long v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDDBI extends Function4<Double,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Integer v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDDBB extends Function4<Double,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Boolean v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDDBD extends Function4<Double,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Double v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDDBL extends Function4<Double,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Long v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDDDI extends Function4<Double,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Integer v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDDDB extends Function4<Double,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Boolean v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDDDD extends Function4<Double,Double,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Double v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDDDL extends Function4<Double,Double,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Long v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDDLI extends Function4<Double,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Integer v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDDLB extends Function4<Double,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Boolean v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDDLD extends Function4<Double,Double,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Double v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDDLL extends Function4<Double,Double,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Long v3) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDLII extends Function4<Double,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Integer v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDLIB extends Function4<Double,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Boolean v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDLID extends Function4<Double,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Double v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDLIL extends Function4<Double,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Long v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDLBI extends Function4<Double,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Integer v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDLBB extends Function4<Double,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Boolean v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDLBD extends Function4<Double,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Double v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDLBL extends Function4<Double,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Long v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDLDI extends Function4<Double,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Integer v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDLDB extends Function4<Double,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Boolean v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDLDD extends Function4<Double,Long,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Double v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDLDL extends Function4<Double,Long,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Long v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredDLLI extends Function4<Double,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Integer v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredDLLB extends Function4<Double,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Boolean v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredDLLD extends Function4<Double,Long,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Double v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredDLLL extends Function4<Double,Long,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Long v3) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLIII extends Function4<Long,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Integer v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLIIB extends Function4<Long,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Boolean v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLIID extends Function4<Long,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Double v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLIIL extends Function4<Long,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Long v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLIBI extends Function4<Long,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Integer v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLIBB extends Function4<Long,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Boolean v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLIBD extends Function4<Long,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Double v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLIBL extends Function4<Long,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Long v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLIDI extends Function4<Long,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Integer v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLIDB extends Function4<Long,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Boolean v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLIDD extends Function4<Long,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Double v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLIDL extends Function4<Long,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Long v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLILI extends Function4<Long,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Integer v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLILB extends Function4<Long,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Boolean v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLILD extends Function4<Long,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Double v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLILL extends Function4<Long,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Long v3) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLBII extends Function4<Long,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Integer v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLBIB extends Function4<Long,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Boolean v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLBID extends Function4<Long,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Double v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLBIL extends Function4<Long,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Long v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLBBI extends Function4<Long,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Integer v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLBBB extends Function4<Long,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Boolean v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLBBD extends Function4<Long,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Double v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLBBL extends Function4<Long,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Long v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLBDI extends Function4<Long,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Integer v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLBDB extends Function4<Long,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Boolean v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLBDD extends Function4<Long,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Double v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLBDL extends Function4<Long,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Long v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLBLI extends Function4<Long,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Integer v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLBLB extends Function4<Long,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Boolean v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLBLD extends Function4<Long,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Double v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLBLL extends Function4<Long,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Long v3) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLDII extends Function4<Long,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Integer v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLDIB extends Function4<Long,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Boolean v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLDID extends Function4<Long,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Double v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLDIL extends Function4<Long,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Long v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLDBI extends Function4<Long,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Integer v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLDBB extends Function4<Long,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Boolean v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLDBD extends Function4<Long,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Double v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLDBL extends Function4<Long,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Long v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLDDI extends Function4<Long,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Integer v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLDDB extends Function4<Long,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Boolean v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLDDD extends Function4<Long,Double,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Double v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLDDL extends Function4<Long,Double,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Long v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLDLI extends Function4<Long,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Integer v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLDLB extends Function4<Long,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Boolean v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLDLD extends Function4<Long,Double,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Double v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLDLL extends Function4<Long,Double,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Long v3) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLLII extends Function4<Long,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Integer v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLLIB extends Function4<Long,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Boolean v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLLID extends Function4<Long,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Double v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLLIL extends Function4<Long,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Long v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLLBI extends Function4<Long,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Integer v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLLBB extends Function4<Long,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Boolean v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLLBD extends Function4<Long,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Double v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLLBL extends Function4<Long,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Long v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLLDI extends Function4<Long,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Integer v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLLDB extends Function4<Long,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Boolean v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLLDD extends Function4<Long,Long,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Double v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLLDL extends Function4<Long,Long,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Long v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredLLLI extends Function4<Long,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,int v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Integer v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface PredLLLB extends Function4<Long,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,boolean v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Boolean v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface PredLLLD extends Function4<Long,Long,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,double v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Double v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface PredLLLL extends Function4<Long,Long,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,long v3);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Long v3) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface PredIIIII extends Function5<Integer,Integer,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIIIB extends Function5<Integer,Integer,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIIID extends Function5<Integer,Integer,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIIIL extends Function5<Integer,Integer,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIIBI extends Function5<Integer,Integer,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIIBB extends Function5<Integer,Integer,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIIBD extends Function5<Integer,Integer,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIIBL extends Function5<Integer,Integer,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIIDI extends Function5<Integer,Integer,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIIDB extends Function5<Integer,Integer,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIIDD extends Function5<Integer,Integer,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIIDL extends Function5<Integer,Integer,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIILI extends Function5<Integer,Integer,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIILB extends Function5<Integer,Integer,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIILD extends Function5<Integer,Integer,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIILL extends Function5<Integer,Integer,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Integer v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIBII extends Function5<Integer,Integer,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIBIB extends Function5<Integer,Integer,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIBID extends Function5<Integer,Integer,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIBIL extends Function5<Integer,Integer,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIBBI extends Function5<Integer,Integer,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIBBB extends Function5<Integer,Integer,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIBBD extends Function5<Integer,Integer,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIBBL extends Function5<Integer,Integer,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIBDI extends Function5<Integer,Integer,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIBDB extends Function5<Integer,Integer,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIBDD extends Function5<Integer,Integer,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIBDL extends Function5<Integer,Integer,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIBLI extends Function5<Integer,Integer,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIBLB extends Function5<Integer,Integer,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIBLD extends Function5<Integer,Integer,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIBLL extends Function5<Integer,Integer,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Boolean v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIDII extends Function5<Integer,Integer,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIDIB extends Function5<Integer,Integer,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIDID extends Function5<Integer,Integer,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIDIL extends Function5<Integer,Integer,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIDBI extends Function5<Integer,Integer,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIDBB extends Function5<Integer,Integer,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIDBD extends Function5<Integer,Integer,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIDBL extends Function5<Integer,Integer,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIDDI extends Function5<Integer,Integer,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIDDB extends Function5<Integer,Integer,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIDDD extends Function5<Integer,Integer,Double,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIDDL extends Function5<Integer,Integer,Double,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIIDLI extends Function5<Integer,Integer,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIIDLB extends Function5<Integer,Integer,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIIDLD extends Function5<Integer,Integer,Double,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIIDLL extends Function5<Integer,Integer,Double,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Double v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIILII extends Function5<Integer,Integer,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIILIB extends Function5<Integer,Integer,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIILID extends Function5<Integer,Integer,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIILIL extends Function5<Integer,Integer,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIILBI extends Function5<Integer,Integer,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIILBB extends Function5<Integer,Integer,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIILBD extends Function5<Integer,Integer,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIILBL extends Function5<Integer,Integer,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIILDI extends Function5<Integer,Integer,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIILDB extends Function5<Integer,Integer,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIILDD extends Function5<Integer,Integer,Long,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIILDL extends Function5<Integer,Integer,Long,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIILLI extends Function5<Integer,Integer,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIILLB extends Function5<Integer,Integer,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIILLD extends Function5<Integer,Integer,Long,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIILLL extends Function5<Integer,Integer,Long,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,int v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Integer v1,Long v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBIII extends Function5<Integer,Boolean,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBIIB extends Function5<Integer,Boolean,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBIID extends Function5<Integer,Boolean,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBIIL extends Function5<Integer,Boolean,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBIBI extends Function5<Integer,Boolean,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBIBB extends Function5<Integer,Boolean,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBIBD extends Function5<Integer,Boolean,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBIBL extends Function5<Integer,Boolean,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBIDI extends Function5<Integer,Boolean,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBIDB extends Function5<Integer,Boolean,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBIDD extends Function5<Integer,Boolean,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBIDL extends Function5<Integer,Boolean,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBILI extends Function5<Integer,Boolean,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBILB extends Function5<Integer,Boolean,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBILD extends Function5<Integer,Boolean,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBILL extends Function5<Integer,Boolean,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Integer v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBBII extends Function5<Integer,Boolean,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBBIB extends Function5<Integer,Boolean,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBBID extends Function5<Integer,Boolean,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBBIL extends Function5<Integer,Boolean,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBBBI extends Function5<Integer,Boolean,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBBBB extends Function5<Integer,Boolean,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBBBD extends Function5<Integer,Boolean,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBBBL extends Function5<Integer,Boolean,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBBDI extends Function5<Integer,Boolean,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBBDB extends Function5<Integer,Boolean,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBBDD extends Function5<Integer,Boolean,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBBDL extends Function5<Integer,Boolean,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBBLI extends Function5<Integer,Boolean,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBBLB extends Function5<Integer,Boolean,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBBLD extends Function5<Integer,Boolean,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBBLL extends Function5<Integer,Boolean,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBDII extends Function5<Integer,Boolean,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBDIB extends Function5<Integer,Boolean,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBDID extends Function5<Integer,Boolean,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBDIL extends Function5<Integer,Boolean,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBDBI extends Function5<Integer,Boolean,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBDBB extends Function5<Integer,Boolean,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBDBD extends Function5<Integer,Boolean,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBDBL extends Function5<Integer,Boolean,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBDDI extends Function5<Integer,Boolean,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBDDB extends Function5<Integer,Boolean,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBDDD extends Function5<Integer,Boolean,Double,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBDDL extends Function5<Integer,Boolean,Double,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBDLI extends Function5<Integer,Boolean,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBDLB extends Function5<Integer,Boolean,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBDLD extends Function5<Integer,Boolean,Double,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBDLL extends Function5<Integer,Boolean,Double,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Double v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBLII extends Function5<Integer,Boolean,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBLIB extends Function5<Integer,Boolean,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBLID extends Function5<Integer,Boolean,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBLIL extends Function5<Integer,Boolean,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBLBI extends Function5<Integer,Boolean,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBLBB extends Function5<Integer,Boolean,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBLBD extends Function5<Integer,Boolean,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBLBL extends Function5<Integer,Boolean,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBLDI extends Function5<Integer,Boolean,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBLDB extends Function5<Integer,Boolean,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBLDD extends Function5<Integer,Boolean,Long,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBLDL extends Function5<Integer,Boolean,Long,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIBLLI extends Function5<Integer,Boolean,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIBLLB extends Function5<Integer,Boolean,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIBLLD extends Function5<Integer,Boolean,Long,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIBLLL extends Function5<Integer,Boolean,Long,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,boolean v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Boolean v1,Long v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDIII extends Function5<Integer,Double,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDIIB extends Function5<Integer,Double,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDIID extends Function5<Integer,Double,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDIIL extends Function5<Integer,Double,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDIBI extends Function5<Integer,Double,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDIBB extends Function5<Integer,Double,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDIBD extends Function5<Integer,Double,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDIBL extends Function5<Integer,Double,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDIDI extends Function5<Integer,Double,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDIDB extends Function5<Integer,Double,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDIDD extends Function5<Integer,Double,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDIDL extends Function5<Integer,Double,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDILI extends Function5<Integer,Double,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDILB extends Function5<Integer,Double,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDILD extends Function5<Integer,Double,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDILL extends Function5<Integer,Double,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Integer v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDBII extends Function5<Integer,Double,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDBIB extends Function5<Integer,Double,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDBID extends Function5<Integer,Double,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDBIL extends Function5<Integer,Double,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDBBI extends Function5<Integer,Double,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDBBB extends Function5<Integer,Double,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDBBD extends Function5<Integer,Double,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDBBL extends Function5<Integer,Double,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDBDI extends Function5<Integer,Double,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDBDB extends Function5<Integer,Double,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDBDD extends Function5<Integer,Double,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDBDL extends Function5<Integer,Double,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDBLI extends Function5<Integer,Double,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDBLB extends Function5<Integer,Double,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDBLD extends Function5<Integer,Double,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDBLL extends Function5<Integer,Double,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Boolean v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDDII extends Function5<Integer,Double,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDDIB extends Function5<Integer,Double,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDDID extends Function5<Integer,Double,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDDIL extends Function5<Integer,Double,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDDBI extends Function5<Integer,Double,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDDBB extends Function5<Integer,Double,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDDBD extends Function5<Integer,Double,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDDBL extends Function5<Integer,Double,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDDDI extends Function5<Integer,Double,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDDDB extends Function5<Integer,Double,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDDDD extends Function5<Integer,Double,Double,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDDDL extends Function5<Integer,Double,Double,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDDLI extends Function5<Integer,Double,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDDLB extends Function5<Integer,Double,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDDLD extends Function5<Integer,Double,Double,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDDLL extends Function5<Integer,Double,Double,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Double v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDLII extends Function5<Integer,Double,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDLIB extends Function5<Integer,Double,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDLID extends Function5<Integer,Double,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDLIL extends Function5<Integer,Double,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDLBI extends Function5<Integer,Double,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDLBB extends Function5<Integer,Double,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDLBD extends Function5<Integer,Double,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDLBL extends Function5<Integer,Double,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDLDI extends Function5<Integer,Double,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDLDB extends Function5<Integer,Double,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDLDD extends Function5<Integer,Double,Long,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDLDL extends Function5<Integer,Double,Long,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredIDLLI extends Function5<Integer,Double,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredIDLLB extends Function5<Integer,Double,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredIDLLD extends Function5<Integer,Double,Long,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredIDLLL extends Function5<Integer,Double,Long,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,double v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Double v1,Long v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILIII extends Function5<Integer,Long,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILIIB extends Function5<Integer,Long,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILIID extends Function5<Integer,Long,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILIIL extends Function5<Integer,Long,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILIBI extends Function5<Integer,Long,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILIBB extends Function5<Integer,Long,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILIBD extends Function5<Integer,Long,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILIBL extends Function5<Integer,Long,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILIDI extends Function5<Integer,Long,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILIDB extends Function5<Integer,Long,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILIDD extends Function5<Integer,Long,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILIDL extends Function5<Integer,Long,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILILI extends Function5<Integer,Long,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILILB extends Function5<Integer,Long,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILILD extends Function5<Integer,Long,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILILL extends Function5<Integer,Long,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Integer v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILBII extends Function5<Integer,Long,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILBIB extends Function5<Integer,Long,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILBID extends Function5<Integer,Long,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILBIL extends Function5<Integer,Long,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILBBI extends Function5<Integer,Long,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILBBB extends Function5<Integer,Long,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILBBD extends Function5<Integer,Long,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILBBL extends Function5<Integer,Long,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILBDI extends Function5<Integer,Long,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILBDB extends Function5<Integer,Long,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILBDD extends Function5<Integer,Long,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILBDL extends Function5<Integer,Long,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILBLI extends Function5<Integer,Long,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILBLB extends Function5<Integer,Long,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILBLD extends Function5<Integer,Long,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILBLL extends Function5<Integer,Long,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Boolean v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILDII extends Function5<Integer,Long,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILDIB extends Function5<Integer,Long,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILDID extends Function5<Integer,Long,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILDIL extends Function5<Integer,Long,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILDBI extends Function5<Integer,Long,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILDBB extends Function5<Integer,Long,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILDBD extends Function5<Integer,Long,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILDBL extends Function5<Integer,Long,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILDDI extends Function5<Integer,Long,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILDDB extends Function5<Integer,Long,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILDDD extends Function5<Integer,Long,Double,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILDDL extends Function5<Integer,Long,Double,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILDLI extends Function5<Integer,Long,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILDLB extends Function5<Integer,Long,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILDLD extends Function5<Integer,Long,Double,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILDLL extends Function5<Integer,Long,Double,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Double v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILLII extends Function5<Integer,Long,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Integer v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILLIB extends Function5<Integer,Long,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Integer v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILLID extends Function5<Integer,Long,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Integer v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILLIL extends Function5<Integer,Long,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Integer v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILLBI extends Function5<Integer,Long,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Boolean v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILLBB extends Function5<Integer,Long,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILLBD extends Function5<Integer,Long,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Boolean v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILLBL extends Function5<Integer,Long,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Boolean v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILLDI extends Function5<Integer,Long,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Double v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILLDB extends Function5<Integer,Long,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Double v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILLDD extends Function5<Integer,Long,Long,Double,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Double v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILLDL extends Function5<Integer,Long,Long,Double,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Double v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredILLLI extends Function5<Integer,Long,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Long v3,Integer v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredILLLB extends Function5<Integer,Long,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Long v3,Boolean v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredILLLD extends Function5<Integer,Long,Long,Long,Double,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Long v3,Double v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredILLLL extends Function5<Integer,Long,Long,Long,Long,Boolean>,PPredicate {
      boolean test(int v0,long v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Integer v0,Long v1,Long v2,Long v3,Long v4) {
          return test((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIIII extends Function5<Boolean,Integer,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIIIB extends Function5<Boolean,Integer,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIIID extends Function5<Boolean,Integer,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIIIL extends Function5<Boolean,Integer,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIIBI extends Function5<Boolean,Integer,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIIBB extends Function5<Boolean,Integer,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIIBD extends Function5<Boolean,Integer,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIIBL extends Function5<Boolean,Integer,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIIDI extends Function5<Boolean,Integer,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIIDB extends Function5<Boolean,Integer,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIIDD extends Function5<Boolean,Integer,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIIDL extends Function5<Boolean,Integer,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIILI extends Function5<Boolean,Integer,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIILB extends Function5<Boolean,Integer,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIILD extends Function5<Boolean,Integer,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIILL extends Function5<Boolean,Integer,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Integer v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIBII extends Function5<Boolean,Integer,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIBIB extends Function5<Boolean,Integer,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIBID extends Function5<Boolean,Integer,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIBIL extends Function5<Boolean,Integer,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIBBI extends Function5<Boolean,Integer,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIBBB extends Function5<Boolean,Integer,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIBBD extends Function5<Boolean,Integer,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIBBL extends Function5<Boolean,Integer,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIBDI extends Function5<Boolean,Integer,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIBDB extends Function5<Boolean,Integer,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIBDD extends Function5<Boolean,Integer,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIBDL extends Function5<Boolean,Integer,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIBLI extends Function5<Boolean,Integer,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIBLB extends Function5<Boolean,Integer,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIBLD extends Function5<Boolean,Integer,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIBLL extends Function5<Boolean,Integer,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Boolean v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIDII extends Function5<Boolean,Integer,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIDIB extends Function5<Boolean,Integer,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIDID extends Function5<Boolean,Integer,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIDIL extends Function5<Boolean,Integer,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIDBI extends Function5<Boolean,Integer,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIDBB extends Function5<Boolean,Integer,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIDBD extends Function5<Boolean,Integer,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIDBL extends Function5<Boolean,Integer,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIDDI extends Function5<Boolean,Integer,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIDDB extends Function5<Boolean,Integer,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIDDD extends Function5<Boolean,Integer,Double,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIDDL extends Function5<Boolean,Integer,Double,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBIDLI extends Function5<Boolean,Integer,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBIDLB extends Function5<Boolean,Integer,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBIDLD extends Function5<Boolean,Integer,Double,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBIDLL extends Function5<Boolean,Integer,Double,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Double v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBILII extends Function5<Boolean,Integer,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBILIB extends Function5<Boolean,Integer,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBILID extends Function5<Boolean,Integer,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBILIL extends Function5<Boolean,Integer,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBILBI extends Function5<Boolean,Integer,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBILBB extends Function5<Boolean,Integer,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBILBD extends Function5<Boolean,Integer,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBILBL extends Function5<Boolean,Integer,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBILDI extends Function5<Boolean,Integer,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBILDB extends Function5<Boolean,Integer,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBILDD extends Function5<Boolean,Integer,Long,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBILDL extends Function5<Boolean,Integer,Long,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBILLI extends Function5<Boolean,Integer,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBILLB extends Function5<Boolean,Integer,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBILLD extends Function5<Boolean,Integer,Long,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBILLL extends Function5<Boolean,Integer,Long,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,int v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Integer v1,Long v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBIII extends Function5<Boolean,Boolean,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBIIB extends Function5<Boolean,Boolean,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBIID extends Function5<Boolean,Boolean,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBIIL extends Function5<Boolean,Boolean,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBIBI extends Function5<Boolean,Boolean,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBIBB extends Function5<Boolean,Boolean,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBIBD extends Function5<Boolean,Boolean,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBIBL extends Function5<Boolean,Boolean,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBIDI extends Function5<Boolean,Boolean,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBIDB extends Function5<Boolean,Boolean,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBIDD extends Function5<Boolean,Boolean,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBIDL extends Function5<Boolean,Boolean,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBILI extends Function5<Boolean,Boolean,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBILB extends Function5<Boolean,Boolean,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBILD extends Function5<Boolean,Boolean,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBILL extends Function5<Boolean,Boolean,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Integer v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBBII extends Function5<Boolean,Boolean,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBBIB extends Function5<Boolean,Boolean,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBBID extends Function5<Boolean,Boolean,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBBIL extends Function5<Boolean,Boolean,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBBBI extends Function5<Boolean,Boolean,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBBBB extends Function5<Boolean,Boolean,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBBBD extends Function5<Boolean,Boolean,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBBBL extends Function5<Boolean,Boolean,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBBDI extends Function5<Boolean,Boolean,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBBDB extends Function5<Boolean,Boolean,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBBDD extends Function5<Boolean,Boolean,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBBDL extends Function5<Boolean,Boolean,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBBLI extends Function5<Boolean,Boolean,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBBLB extends Function5<Boolean,Boolean,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBBLD extends Function5<Boolean,Boolean,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBBLL extends Function5<Boolean,Boolean,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBDII extends Function5<Boolean,Boolean,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBDIB extends Function5<Boolean,Boolean,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBDID extends Function5<Boolean,Boolean,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBDIL extends Function5<Boolean,Boolean,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBDBI extends Function5<Boolean,Boolean,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBDBB extends Function5<Boolean,Boolean,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBDBD extends Function5<Boolean,Boolean,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBDBL extends Function5<Boolean,Boolean,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBDDI extends Function5<Boolean,Boolean,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBDDB extends Function5<Boolean,Boolean,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBDDD extends Function5<Boolean,Boolean,Double,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBDDL extends Function5<Boolean,Boolean,Double,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBDLI extends Function5<Boolean,Boolean,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBDLB extends Function5<Boolean,Boolean,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBDLD extends Function5<Boolean,Boolean,Double,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBDLL extends Function5<Boolean,Boolean,Double,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Double v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBLII extends Function5<Boolean,Boolean,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBLIB extends Function5<Boolean,Boolean,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBLID extends Function5<Boolean,Boolean,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBLIL extends Function5<Boolean,Boolean,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBLBI extends Function5<Boolean,Boolean,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBLBB extends Function5<Boolean,Boolean,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBLBD extends Function5<Boolean,Boolean,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBLBL extends Function5<Boolean,Boolean,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBLDI extends Function5<Boolean,Boolean,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBLDB extends Function5<Boolean,Boolean,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBLDD extends Function5<Boolean,Boolean,Long,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBLDL extends Function5<Boolean,Boolean,Long,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBBLLI extends Function5<Boolean,Boolean,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBBLLB extends Function5<Boolean,Boolean,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBBLLD extends Function5<Boolean,Boolean,Long,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBBLLL extends Function5<Boolean,Boolean,Long,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,boolean v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Boolean v1,Long v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDIII extends Function5<Boolean,Double,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDIIB extends Function5<Boolean,Double,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDIID extends Function5<Boolean,Double,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDIIL extends Function5<Boolean,Double,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDIBI extends Function5<Boolean,Double,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDIBB extends Function5<Boolean,Double,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDIBD extends Function5<Boolean,Double,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDIBL extends Function5<Boolean,Double,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDIDI extends Function5<Boolean,Double,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDIDB extends Function5<Boolean,Double,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDIDD extends Function5<Boolean,Double,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDIDL extends Function5<Boolean,Double,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDILI extends Function5<Boolean,Double,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDILB extends Function5<Boolean,Double,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDILD extends Function5<Boolean,Double,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDILL extends Function5<Boolean,Double,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Integer v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDBII extends Function5<Boolean,Double,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDBIB extends Function5<Boolean,Double,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDBID extends Function5<Boolean,Double,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDBIL extends Function5<Boolean,Double,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDBBI extends Function5<Boolean,Double,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDBBB extends Function5<Boolean,Double,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDBBD extends Function5<Boolean,Double,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDBBL extends Function5<Boolean,Double,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDBDI extends Function5<Boolean,Double,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDBDB extends Function5<Boolean,Double,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDBDD extends Function5<Boolean,Double,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDBDL extends Function5<Boolean,Double,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDBLI extends Function5<Boolean,Double,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDBLB extends Function5<Boolean,Double,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDBLD extends Function5<Boolean,Double,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDBLL extends Function5<Boolean,Double,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Boolean v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDDII extends Function5<Boolean,Double,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDDIB extends Function5<Boolean,Double,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDDID extends Function5<Boolean,Double,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDDIL extends Function5<Boolean,Double,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDDBI extends Function5<Boolean,Double,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDDBB extends Function5<Boolean,Double,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDDBD extends Function5<Boolean,Double,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDDBL extends Function5<Boolean,Double,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDDDI extends Function5<Boolean,Double,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDDDB extends Function5<Boolean,Double,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDDDD extends Function5<Boolean,Double,Double,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDDDL extends Function5<Boolean,Double,Double,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDDLI extends Function5<Boolean,Double,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDDLB extends Function5<Boolean,Double,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDDLD extends Function5<Boolean,Double,Double,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDDLL extends Function5<Boolean,Double,Double,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Double v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDLII extends Function5<Boolean,Double,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDLIB extends Function5<Boolean,Double,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDLID extends Function5<Boolean,Double,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDLIL extends Function5<Boolean,Double,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDLBI extends Function5<Boolean,Double,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDLBB extends Function5<Boolean,Double,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDLBD extends Function5<Boolean,Double,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDLBL extends Function5<Boolean,Double,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDLDI extends Function5<Boolean,Double,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDLDB extends Function5<Boolean,Double,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDLDD extends Function5<Boolean,Double,Long,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDLDL extends Function5<Boolean,Double,Long,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBDLLI extends Function5<Boolean,Double,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBDLLB extends Function5<Boolean,Double,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBDLLD extends Function5<Boolean,Double,Long,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBDLLL extends Function5<Boolean,Double,Long,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,double v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Double v1,Long v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLIII extends Function5<Boolean,Long,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLIIB extends Function5<Boolean,Long,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLIID extends Function5<Boolean,Long,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLIIL extends Function5<Boolean,Long,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLIBI extends Function5<Boolean,Long,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLIBB extends Function5<Boolean,Long,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLIBD extends Function5<Boolean,Long,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLIBL extends Function5<Boolean,Long,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLIDI extends Function5<Boolean,Long,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLIDB extends Function5<Boolean,Long,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLIDD extends Function5<Boolean,Long,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLIDL extends Function5<Boolean,Long,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLILI extends Function5<Boolean,Long,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLILB extends Function5<Boolean,Long,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLILD extends Function5<Boolean,Long,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLILL extends Function5<Boolean,Long,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Integer v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLBII extends Function5<Boolean,Long,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLBIB extends Function5<Boolean,Long,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLBID extends Function5<Boolean,Long,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLBIL extends Function5<Boolean,Long,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLBBI extends Function5<Boolean,Long,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLBBB extends Function5<Boolean,Long,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLBBD extends Function5<Boolean,Long,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLBBL extends Function5<Boolean,Long,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLBDI extends Function5<Boolean,Long,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLBDB extends Function5<Boolean,Long,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLBDD extends Function5<Boolean,Long,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLBDL extends Function5<Boolean,Long,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLBLI extends Function5<Boolean,Long,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLBLB extends Function5<Boolean,Long,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLBLD extends Function5<Boolean,Long,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLBLL extends Function5<Boolean,Long,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Boolean v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLDII extends Function5<Boolean,Long,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLDIB extends Function5<Boolean,Long,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLDID extends Function5<Boolean,Long,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLDIL extends Function5<Boolean,Long,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLDBI extends Function5<Boolean,Long,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLDBB extends Function5<Boolean,Long,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLDBD extends Function5<Boolean,Long,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLDBL extends Function5<Boolean,Long,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLDDI extends Function5<Boolean,Long,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLDDB extends Function5<Boolean,Long,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLDDD extends Function5<Boolean,Long,Double,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLDDL extends Function5<Boolean,Long,Double,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLDLI extends Function5<Boolean,Long,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLDLB extends Function5<Boolean,Long,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLDLD extends Function5<Boolean,Long,Double,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLDLL extends Function5<Boolean,Long,Double,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Double v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLLII extends Function5<Boolean,Long,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Integer v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLLIB extends Function5<Boolean,Long,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Integer v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLLID extends Function5<Boolean,Long,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Integer v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLLIL extends Function5<Boolean,Long,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Integer v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLLBI extends Function5<Boolean,Long,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Boolean v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLLBB extends Function5<Boolean,Long,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLLBD extends Function5<Boolean,Long,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Boolean v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLLBL extends Function5<Boolean,Long,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Boolean v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLLDI extends Function5<Boolean,Long,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Double v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLLDB extends Function5<Boolean,Long,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Double v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLLDD extends Function5<Boolean,Long,Long,Double,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Double v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLLDL extends Function5<Boolean,Long,Long,Double,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Double v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredBLLLI extends Function5<Boolean,Long,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Long v3,Integer v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredBLLLB extends Function5<Boolean,Long,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Long v3,Boolean v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredBLLLD extends Function5<Boolean,Long,Long,Long,Double,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Long v3,Double v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredBLLLL extends Function5<Boolean,Long,Long,Long,Long,Boolean>,PPredicate {
      boolean test(boolean v0,long v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Boolean v0,Long v1,Long v2,Long v3,Long v4) {
          return test((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIIII extends Function5<Double,Integer,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIIIB extends Function5<Double,Integer,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIIID extends Function5<Double,Integer,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIIIL extends Function5<Double,Integer,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIIBI extends Function5<Double,Integer,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIIBB extends Function5<Double,Integer,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIIBD extends Function5<Double,Integer,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIIBL extends Function5<Double,Integer,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIIDI extends Function5<Double,Integer,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIIDB extends Function5<Double,Integer,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIIDD extends Function5<Double,Integer,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIIDL extends Function5<Double,Integer,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIILI extends Function5<Double,Integer,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIILB extends Function5<Double,Integer,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIILD extends Function5<Double,Integer,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIILL extends Function5<Double,Integer,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Integer v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIBII extends Function5<Double,Integer,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIBIB extends Function5<Double,Integer,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIBID extends Function5<Double,Integer,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIBIL extends Function5<Double,Integer,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIBBI extends Function5<Double,Integer,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIBBB extends Function5<Double,Integer,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIBBD extends Function5<Double,Integer,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIBBL extends Function5<Double,Integer,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIBDI extends Function5<Double,Integer,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIBDB extends Function5<Double,Integer,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIBDD extends Function5<Double,Integer,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIBDL extends Function5<Double,Integer,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIBLI extends Function5<Double,Integer,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIBLB extends Function5<Double,Integer,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIBLD extends Function5<Double,Integer,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIBLL extends Function5<Double,Integer,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Boolean v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIDII extends Function5<Double,Integer,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIDIB extends Function5<Double,Integer,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIDID extends Function5<Double,Integer,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIDIL extends Function5<Double,Integer,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIDBI extends Function5<Double,Integer,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIDBB extends Function5<Double,Integer,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIDBD extends Function5<Double,Integer,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIDBL extends Function5<Double,Integer,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIDDI extends Function5<Double,Integer,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIDDB extends Function5<Double,Integer,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIDDD extends Function5<Double,Integer,Double,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIDDL extends Function5<Double,Integer,Double,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDIDLI extends Function5<Double,Integer,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDIDLB extends Function5<Double,Integer,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDIDLD extends Function5<Double,Integer,Double,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDIDLL extends Function5<Double,Integer,Double,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Double v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDILII extends Function5<Double,Integer,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDILIB extends Function5<Double,Integer,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDILID extends Function5<Double,Integer,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDILIL extends Function5<Double,Integer,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDILBI extends Function5<Double,Integer,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDILBB extends Function5<Double,Integer,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDILBD extends Function5<Double,Integer,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDILBL extends Function5<Double,Integer,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDILDI extends Function5<Double,Integer,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDILDB extends Function5<Double,Integer,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDILDD extends Function5<Double,Integer,Long,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDILDL extends Function5<Double,Integer,Long,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDILLI extends Function5<Double,Integer,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDILLB extends Function5<Double,Integer,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDILLD extends Function5<Double,Integer,Long,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDILLL extends Function5<Double,Integer,Long,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,int v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Integer v1,Long v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBIII extends Function5<Double,Boolean,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBIIB extends Function5<Double,Boolean,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBIID extends Function5<Double,Boolean,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBIIL extends Function5<Double,Boolean,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBIBI extends Function5<Double,Boolean,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBIBB extends Function5<Double,Boolean,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBIBD extends Function5<Double,Boolean,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBIBL extends Function5<Double,Boolean,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBIDI extends Function5<Double,Boolean,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBIDB extends Function5<Double,Boolean,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBIDD extends Function5<Double,Boolean,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBIDL extends Function5<Double,Boolean,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBILI extends Function5<Double,Boolean,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBILB extends Function5<Double,Boolean,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBILD extends Function5<Double,Boolean,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBILL extends Function5<Double,Boolean,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Integer v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBBII extends Function5<Double,Boolean,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBBIB extends Function5<Double,Boolean,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBBID extends Function5<Double,Boolean,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBBIL extends Function5<Double,Boolean,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBBBI extends Function5<Double,Boolean,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBBBB extends Function5<Double,Boolean,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBBBD extends Function5<Double,Boolean,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBBBL extends Function5<Double,Boolean,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBBDI extends Function5<Double,Boolean,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBBDB extends Function5<Double,Boolean,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBBDD extends Function5<Double,Boolean,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBBDL extends Function5<Double,Boolean,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBBLI extends Function5<Double,Boolean,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBBLB extends Function5<Double,Boolean,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBBLD extends Function5<Double,Boolean,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBBLL extends Function5<Double,Boolean,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBDII extends Function5<Double,Boolean,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBDIB extends Function5<Double,Boolean,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBDID extends Function5<Double,Boolean,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBDIL extends Function5<Double,Boolean,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBDBI extends Function5<Double,Boolean,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBDBB extends Function5<Double,Boolean,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBDBD extends Function5<Double,Boolean,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBDBL extends Function5<Double,Boolean,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBDDI extends Function5<Double,Boolean,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBDDB extends Function5<Double,Boolean,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBDDD extends Function5<Double,Boolean,Double,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBDDL extends Function5<Double,Boolean,Double,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBDLI extends Function5<Double,Boolean,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBDLB extends Function5<Double,Boolean,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBDLD extends Function5<Double,Boolean,Double,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBDLL extends Function5<Double,Boolean,Double,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Double v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBLII extends Function5<Double,Boolean,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBLIB extends Function5<Double,Boolean,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBLID extends Function5<Double,Boolean,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBLIL extends Function5<Double,Boolean,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBLBI extends Function5<Double,Boolean,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBLBB extends Function5<Double,Boolean,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBLBD extends Function5<Double,Boolean,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBLBL extends Function5<Double,Boolean,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBLDI extends Function5<Double,Boolean,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBLDB extends Function5<Double,Boolean,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBLDD extends Function5<Double,Boolean,Long,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBLDL extends Function5<Double,Boolean,Long,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDBLLI extends Function5<Double,Boolean,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDBLLB extends Function5<Double,Boolean,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDBLLD extends Function5<Double,Boolean,Long,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDBLLL extends Function5<Double,Boolean,Long,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,boolean v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Boolean v1,Long v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDIII extends Function5<Double,Double,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDIIB extends Function5<Double,Double,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDIID extends Function5<Double,Double,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDIIL extends Function5<Double,Double,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDIBI extends Function5<Double,Double,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDIBB extends Function5<Double,Double,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDIBD extends Function5<Double,Double,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDIBL extends Function5<Double,Double,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDIDI extends Function5<Double,Double,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDIDB extends Function5<Double,Double,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDIDD extends Function5<Double,Double,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDIDL extends Function5<Double,Double,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDILI extends Function5<Double,Double,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDILB extends Function5<Double,Double,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDILD extends Function5<Double,Double,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDILL extends Function5<Double,Double,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Integer v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDBII extends Function5<Double,Double,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDBIB extends Function5<Double,Double,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDBID extends Function5<Double,Double,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDBIL extends Function5<Double,Double,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDBBI extends Function5<Double,Double,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDBBB extends Function5<Double,Double,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDBBD extends Function5<Double,Double,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDBBL extends Function5<Double,Double,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDBDI extends Function5<Double,Double,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDBDB extends Function5<Double,Double,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDBDD extends Function5<Double,Double,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDBDL extends Function5<Double,Double,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDBLI extends Function5<Double,Double,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDBLB extends Function5<Double,Double,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDBLD extends Function5<Double,Double,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDBLL extends Function5<Double,Double,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Boolean v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDDII extends Function5<Double,Double,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDDIB extends Function5<Double,Double,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDDID extends Function5<Double,Double,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDDIL extends Function5<Double,Double,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDDBI extends Function5<Double,Double,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDDBB extends Function5<Double,Double,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDDBD extends Function5<Double,Double,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDDBL extends Function5<Double,Double,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDDDI extends Function5<Double,Double,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDDDB extends Function5<Double,Double,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDDDD extends Function5<Double,Double,Double,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDDDL extends Function5<Double,Double,Double,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDDLI extends Function5<Double,Double,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDDLB extends Function5<Double,Double,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDDLD extends Function5<Double,Double,Double,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDDLL extends Function5<Double,Double,Double,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Double v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDLII extends Function5<Double,Double,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDLIB extends Function5<Double,Double,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDLID extends Function5<Double,Double,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDLIL extends Function5<Double,Double,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDLBI extends Function5<Double,Double,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDLBB extends Function5<Double,Double,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDLBD extends Function5<Double,Double,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDLBL extends Function5<Double,Double,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDLDI extends Function5<Double,Double,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDLDB extends Function5<Double,Double,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDLDD extends Function5<Double,Double,Long,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDLDL extends Function5<Double,Double,Long,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDDLLI extends Function5<Double,Double,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDDLLB extends Function5<Double,Double,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDDLLD extends Function5<Double,Double,Long,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDDLLL extends Function5<Double,Double,Long,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,double v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Double v1,Long v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLIII extends Function5<Double,Long,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLIIB extends Function5<Double,Long,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLIID extends Function5<Double,Long,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLIIL extends Function5<Double,Long,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLIBI extends Function5<Double,Long,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLIBB extends Function5<Double,Long,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLIBD extends Function5<Double,Long,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLIBL extends Function5<Double,Long,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLIDI extends Function5<Double,Long,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLIDB extends Function5<Double,Long,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLIDD extends Function5<Double,Long,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLIDL extends Function5<Double,Long,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLILI extends Function5<Double,Long,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLILB extends Function5<Double,Long,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLILD extends Function5<Double,Long,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLILL extends Function5<Double,Long,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Integer v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLBII extends Function5<Double,Long,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLBIB extends Function5<Double,Long,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLBID extends Function5<Double,Long,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLBIL extends Function5<Double,Long,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLBBI extends Function5<Double,Long,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLBBB extends Function5<Double,Long,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLBBD extends Function5<Double,Long,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLBBL extends Function5<Double,Long,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLBDI extends Function5<Double,Long,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLBDB extends Function5<Double,Long,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLBDD extends Function5<Double,Long,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLBDL extends Function5<Double,Long,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLBLI extends Function5<Double,Long,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLBLB extends Function5<Double,Long,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLBLD extends Function5<Double,Long,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLBLL extends Function5<Double,Long,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Boolean v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLDII extends Function5<Double,Long,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLDIB extends Function5<Double,Long,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLDID extends Function5<Double,Long,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLDIL extends Function5<Double,Long,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLDBI extends Function5<Double,Long,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLDBB extends Function5<Double,Long,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLDBD extends Function5<Double,Long,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLDBL extends Function5<Double,Long,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLDDI extends Function5<Double,Long,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLDDB extends Function5<Double,Long,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLDDD extends Function5<Double,Long,Double,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLDDL extends Function5<Double,Long,Double,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLDLI extends Function5<Double,Long,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLDLB extends Function5<Double,Long,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLDLD extends Function5<Double,Long,Double,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLDLL extends Function5<Double,Long,Double,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Double v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLLII extends Function5<Double,Long,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Integer v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLLIB extends Function5<Double,Long,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Integer v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLLID extends Function5<Double,Long,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Integer v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLLIL extends Function5<Double,Long,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Integer v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLLBI extends Function5<Double,Long,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Boolean v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLLBB extends Function5<Double,Long,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLLBD extends Function5<Double,Long,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Boolean v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLLBL extends Function5<Double,Long,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Boolean v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLLDI extends Function5<Double,Long,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Double v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLLDB extends Function5<Double,Long,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Double v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLLDD extends Function5<Double,Long,Long,Double,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Double v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLLDL extends Function5<Double,Long,Long,Double,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Double v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredDLLLI extends Function5<Double,Long,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Long v3,Integer v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredDLLLB extends Function5<Double,Long,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Long v3,Boolean v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredDLLLD extends Function5<Double,Long,Long,Long,Double,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Long v3,Double v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredDLLLL extends Function5<Double,Long,Long,Long,Long,Boolean>,PPredicate {
      boolean test(double v0,long v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Double v0,Long v1,Long v2,Long v3,Long v4) {
          return test((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIIII extends Function5<Long,Integer,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIIIB extends Function5<Long,Integer,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIIID extends Function5<Long,Integer,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIIIL extends Function5<Long,Integer,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIIBI extends Function5<Long,Integer,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIIBB extends Function5<Long,Integer,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIIBD extends Function5<Long,Integer,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIIBL extends Function5<Long,Integer,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIIDI extends Function5<Long,Integer,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIIDB extends Function5<Long,Integer,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIIDD extends Function5<Long,Integer,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIIDL extends Function5<Long,Integer,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIILI extends Function5<Long,Integer,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIILB extends Function5<Long,Integer,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIILD extends Function5<Long,Integer,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIILL extends Function5<Long,Integer,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Integer v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIBII extends Function5<Long,Integer,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIBIB extends Function5<Long,Integer,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIBID extends Function5<Long,Integer,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIBIL extends Function5<Long,Integer,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIBBI extends Function5<Long,Integer,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIBBB extends Function5<Long,Integer,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIBBD extends Function5<Long,Integer,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIBBL extends Function5<Long,Integer,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIBDI extends Function5<Long,Integer,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIBDB extends Function5<Long,Integer,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIBDD extends Function5<Long,Integer,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIBDL extends Function5<Long,Integer,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIBLI extends Function5<Long,Integer,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIBLB extends Function5<Long,Integer,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIBLD extends Function5<Long,Integer,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIBLL extends Function5<Long,Integer,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Boolean v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIDII extends Function5<Long,Integer,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIDIB extends Function5<Long,Integer,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIDID extends Function5<Long,Integer,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIDIL extends Function5<Long,Integer,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIDBI extends Function5<Long,Integer,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIDBB extends Function5<Long,Integer,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIDBD extends Function5<Long,Integer,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIDBL extends Function5<Long,Integer,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIDDI extends Function5<Long,Integer,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIDDB extends Function5<Long,Integer,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIDDD extends Function5<Long,Integer,Double,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIDDL extends Function5<Long,Integer,Double,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLIDLI extends Function5<Long,Integer,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLIDLB extends Function5<Long,Integer,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLIDLD extends Function5<Long,Integer,Double,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLIDLL extends Function5<Long,Integer,Double,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Double v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLILII extends Function5<Long,Integer,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLILIB extends Function5<Long,Integer,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLILID extends Function5<Long,Integer,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLILIL extends Function5<Long,Integer,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLILBI extends Function5<Long,Integer,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLILBB extends Function5<Long,Integer,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLILBD extends Function5<Long,Integer,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLILBL extends Function5<Long,Integer,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLILDI extends Function5<Long,Integer,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLILDB extends Function5<Long,Integer,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLILDD extends Function5<Long,Integer,Long,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLILDL extends Function5<Long,Integer,Long,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLILLI extends Function5<Long,Integer,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLILLB extends Function5<Long,Integer,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLILLD extends Function5<Long,Integer,Long,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLILLL extends Function5<Long,Integer,Long,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,int v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Integer v1,Long v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBIII extends Function5<Long,Boolean,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBIIB extends Function5<Long,Boolean,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBIID extends Function5<Long,Boolean,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBIIL extends Function5<Long,Boolean,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBIBI extends Function5<Long,Boolean,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBIBB extends Function5<Long,Boolean,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBIBD extends Function5<Long,Boolean,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBIBL extends Function5<Long,Boolean,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBIDI extends Function5<Long,Boolean,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBIDB extends Function5<Long,Boolean,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBIDD extends Function5<Long,Boolean,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBIDL extends Function5<Long,Boolean,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBILI extends Function5<Long,Boolean,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBILB extends Function5<Long,Boolean,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBILD extends Function5<Long,Boolean,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBILL extends Function5<Long,Boolean,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Integer v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBBII extends Function5<Long,Boolean,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBBIB extends Function5<Long,Boolean,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBBID extends Function5<Long,Boolean,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBBIL extends Function5<Long,Boolean,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBBBI extends Function5<Long,Boolean,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBBBB extends Function5<Long,Boolean,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBBBD extends Function5<Long,Boolean,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBBBL extends Function5<Long,Boolean,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBBDI extends Function5<Long,Boolean,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBBDB extends Function5<Long,Boolean,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBBDD extends Function5<Long,Boolean,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBBDL extends Function5<Long,Boolean,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBBLI extends Function5<Long,Boolean,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBBLB extends Function5<Long,Boolean,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBBLD extends Function5<Long,Boolean,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBBLL extends Function5<Long,Boolean,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBDII extends Function5<Long,Boolean,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBDIB extends Function5<Long,Boolean,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBDID extends Function5<Long,Boolean,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBDIL extends Function5<Long,Boolean,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBDBI extends Function5<Long,Boolean,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBDBB extends Function5<Long,Boolean,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBDBD extends Function5<Long,Boolean,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBDBL extends Function5<Long,Boolean,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBDDI extends Function5<Long,Boolean,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBDDB extends Function5<Long,Boolean,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBDDD extends Function5<Long,Boolean,Double,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBDDL extends Function5<Long,Boolean,Double,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBDLI extends Function5<Long,Boolean,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBDLB extends Function5<Long,Boolean,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBDLD extends Function5<Long,Boolean,Double,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBDLL extends Function5<Long,Boolean,Double,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Double v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBLII extends Function5<Long,Boolean,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBLIB extends Function5<Long,Boolean,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBLID extends Function5<Long,Boolean,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBLIL extends Function5<Long,Boolean,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBLBI extends Function5<Long,Boolean,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBLBB extends Function5<Long,Boolean,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBLBD extends Function5<Long,Boolean,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBLBL extends Function5<Long,Boolean,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBLDI extends Function5<Long,Boolean,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBLDB extends Function5<Long,Boolean,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBLDD extends Function5<Long,Boolean,Long,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBLDL extends Function5<Long,Boolean,Long,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLBLLI extends Function5<Long,Boolean,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLBLLB extends Function5<Long,Boolean,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLBLLD extends Function5<Long,Boolean,Long,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLBLLL extends Function5<Long,Boolean,Long,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,boolean v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Boolean v1,Long v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDIII extends Function5<Long,Double,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDIIB extends Function5<Long,Double,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDIID extends Function5<Long,Double,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDIIL extends Function5<Long,Double,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDIBI extends Function5<Long,Double,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDIBB extends Function5<Long,Double,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDIBD extends Function5<Long,Double,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDIBL extends Function5<Long,Double,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDIDI extends Function5<Long,Double,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDIDB extends Function5<Long,Double,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDIDD extends Function5<Long,Double,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDIDL extends Function5<Long,Double,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDILI extends Function5<Long,Double,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDILB extends Function5<Long,Double,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDILD extends Function5<Long,Double,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDILL extends Function5<Long,Double,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Integer v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDBII extends Function5<Long,Double,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDBIB extends Function5<Long,Double,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDBID extends Function5<Long,Double,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDBIL extends Function5<Long,Double,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDBBI extends Function5<Long,Double,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDBBB extends Function5<Long,Double,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDBBD extends Function5<Long,Double,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDBBL extends Function5<Long,Double,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDBDI extends Function5<Long,Double,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDBDB extends Function5<Long,Double,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDBDD extends Function5<Long,Double,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDBDL extends Function5<Long,Double,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDBLI extends Function5<Long,Double,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDBLB extends Function5<Long,Double,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDBLD extends Function5<Long,Double,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDBLL extends Function5<Long,Double,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Boolean v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDDII extends Function5<Long,Double,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDDIB extends Function5<Long,Double,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDDID extends Function5<Long,Double,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDDIL extends Function5<Long,Double,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDDBI extends Function5<Long,Double,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDDBB extends Function5<Long,Double,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDDBD extends Function5<Long,Double,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDDBL extends Function5<Long,Double,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDDDI extends Function5<Long,Double,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDDDB extends Function5<Long,Double,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDDDD extends Function5<Long,Double,Double,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDDDL extends Function5<Long,Double,Double,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDDLI extends Function5<Long,Double,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDDLB extends Function5<Long,Double,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDDLD extends Function5<Long,Double,Double,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDDLL extends Function5<Long,Double,Double,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Double v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDLII extends Function5<Long,Double,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDLIB extends Function5<Long,Double,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDLID extends Function5<Long,Double,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDLIL extends Function5<Long,Double,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDLBI extends Function5<Long,Double,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDLBB extends Function5<Long,Double,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDLBD extends Function5<Long,Double,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDLBL extends Function5<Long,Double,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDLDI extends Function5<Long,Double,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDLDB extends Function5<Long,Double,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDLDD extends Function5<Long,Double,Long,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDLDL extends Function5<Long,Double,Long,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLDLLI extends Function5<Long,Double,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLDLLB extends Function5<Long,Double,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLDLLD extends Function5<Long,Double,Long,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLDLLL extends Function5<Long,Double,Long,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,double v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Double v1,Long v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLIII extends Function5<Long,Long,Integer,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLIIB extends Function5<Long,Long,Integer,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLIID extends Function5<Long,Long,Integer,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLIIL extends Function5<Long,Long,Integer,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLIBI extends Function5<Long,Long,Integer,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLIBB extends Function5<Long,Long,Integer,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLIBD extends Function5<Long,Long,Integer,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLIBL extends Function5<Long,Long,Integer,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLIDI extends Function5<Long,Long,Integer,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLIDB extends Function5<Long,Long,Integer,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLIDD extends Function5<Long,Long,Integer,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLIDL extends Function5<Long,Long,Integer,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLILI extends Function5<Long,Long,Integer,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLILB extends Function5<Long,Long,Integer,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLILD extends Function5<Long,Long,Integer,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLILL extends Function5<Long,Long,Integer,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,int v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Integer v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLBII extends Function5<Long,Long,Boolean,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLBIB extends Function5<Long,Long,Boolean,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLBID extends Function5<Long,Long,Boolean,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLBIL extends Function5<Long,Long,Boolean,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLBBI extends Function5<Long,Long,Boolean,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLBBB extends Function5<Long,Long,Boolean,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLBBD extends Function5<Long,Long,Boolean,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLBBL extends Function5<Long,Long,Boolean,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLBDI extends Function5<Long,Long,Boolean,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLBDB extends Function5<Long,Long,Boolean,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLBDD extends Function5<Long,Long,Boolean,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLBDL extends Function5<Long,Long,Boolean,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLBLI extends Function5<Long,Long,Boolean,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLBLB extends Function5<Long,Long,Boolean,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLBLD extends Function5<Long,Long,Boolean,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLBLL extends Function5<Long,Long,Boolean,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,boolean v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Boolean v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLDII extends Function5<Long,Long,Double,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLDIB extends Function5<Long,Long,Double,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLDID extends Function5<Long,Long,Double,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLDIL extends Function5<Long,Long,Double,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLDBI extends Function5<Long,Long,Double,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLDBB extends Function5<Long,Long,Double,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLDBD extends Function5<Long,Long,Double,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLDBL extends Function5<Long,Long,Double,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLDDI extends Function5<Long,Long,Double,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLDDB extends Function5<Long,Long,Double,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLDDD extends Function5<Long,Long,Double,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLDDL extends Function5<Long,Long,Double,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLDLI extends Function5<Long,Long,Double,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLDLB extends Function5<Long,Long,Double,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLDLD extends Function5<Long,Long,Double,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLDLL extends Function5<Long,Long,Double,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,double v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Double v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLLII extends Function5<Long,Long,Long,Integer,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,int v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Integer v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLLIB extends Function5<Long,Long,Long,Integer,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,int v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Integer v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLLID extends Function5<Long,Long,Long,Integer,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,int v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Integer v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLLIL extends Function5<Long,Long,Long,Integer,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,int v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Integer v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLLBI extends Function5<Long,Long,Long,Boolean,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,boolean v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Boolean v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLLBB extends Function5<Long,Long,Long,Boolean,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLLBD extends Function5<Long,Long,Long,Boolean,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,boolean v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Boolean v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLLBL extends Function5<Long,Long,Long,Boolean,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,boolean v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Boolean v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLLDI extends Function5<Long,Long,Long,Double,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,double v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Double v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLLDB extends Function5<Long,Long,Long,Double,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,double v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Double v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLLDD extends Function5<Long,Long,Long,Double,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,double v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Double v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLLDL extends Function5<Long,Long,Long,Double,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,double v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Double v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface PredLLLLI extends Function5<Long,Long,Long,Long,Integer,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,long v3,int v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Long v3,Integer v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface PredLLLLB extends Function5<Long,Long,Long,Long,Boolean,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,long v3,boolean v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Long v3,Boolean v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface PredLLLLD extends Function5<Long,Long,Long,Long,Double,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,long v3,double v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Long v3,Double v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface PredLLLLL extends Function5<Long,Long,Long,Long,Long,Boolean>,PPredicate {
      boolean test(long v0,long v1,long v2,long v3,long v4);
      @Override
      default Boolean apply(Long v0,Long v1,Long v2,Long v3,Long v4) {
          return test((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}

}
