package cn.zenliu.units.func;
import cn.zenliu.units.func.Fn;
import org.jooq.lambda.function.*;
import static java.util.Objects.requireNonNull;
public  interface PConsumer extends Fn {
      interface CuII extends Consumer2<Integer,Integer>,PConsumer {
      void consume(int v0,int v1);
      @Override
      default void accept(Integer v0,Integer v1) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface CuIB extends Consumer2<Integer,Boolean>,PConsumer {
      void consume(int v0,boolean v1);
      @Override
      default void accept(Integer v0,Boolean v1) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface CuID extends Consumer2<Integer,Double>,PConsumer {
      void consume(int v0,double v1);
      @Override
      default void accept(Integer v0,Double v1) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface CuIL extends Consumer2<Integer,Long>,PConsumer {
      void consume(int v0,long v1);
      @Override
      default void accept(Integer v0,Long v1) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface CuBI extends Consumer2<Boolean,Integer>,PConsumer {
      void consume(boolean v0,int v1);
      @Override
      default void accept(Boolean v0,Integer v1) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface CuBB extends Consumer2<Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1);
      @Override
      default void accept(Boolean v0,Boolean v1) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface CuBD extends Consumer2<Boolean,Double>,PConsumer {
      void consume(boolean v0,double v1);
      @Override
      default void accept(Boolean v0,Double v1) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface CuBL extends Consumer2<Boolean,Long>,PConsumer {
      void consume(boolean v0,long v1);
      @Override
      default void accept(Boolean v0,Long v1) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface CuDI extends Consumer2<Double,Integer>,PConsumer {
      void consume(double v0,int v1);
      @Override
      default void accept(Double v0,Integer v1) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface CuDB extends Consumer2<Double,Boolean>,PConsumer {
      void consume(double v0,boolean v1);
      @Override
      default void accept(Double v0,Boolean v1) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface CuDD extends Consumer2<Double,Double>,PConsumer {
      void consume(double v0,double v1);
      @Override
      default void accept(Double v0,Double v1) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface CuDL extends Consumer2<Double,Long>,PConsumer {
      void consume(double v0,long v1);
      @Override
      default void accept(Double v0,Long v1) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface CuLI extends Consumer2<Long,Integer>,PConsumer {
      void consume(long v0,int v1);
      @Override
      default void accept(Long v0,Integer v1) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1));
       }
}
interface CuLB extends Consumer2<Long,Boolean>,PConsumer {
      void consume(long v0,boolean v1);
      @Override
      default void accept(Long v0,Boolean v1) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1));
       }
}
interface CuLD extends Consumer2<Long,Double>,PConsumer {
      void consume(long v0,double v1);
      @Override
      default void accept(Long v0,Double v1) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1));
       }
}
interface CuLL extends Consumer2<Long,Long>,PConsumer {
      void consume(long v0,long v1);
      @Override
      default void accept(Long v0,Long v1) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1));
       }
}
interface CuIII extends Consumer3<Integer,Integer,Integer>,PConsumer {
      void consume(int v0,int v1,int v2);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuIIB extends Consumer3<Integer,Integer,Boolean>,PConsumer {
      void consume(int v0,int v1,boolean v2);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuIID extends Consumer3<Integer,Integer,Double>,PConsumer {
      void consume(int v0,int v1,double v2);
      @Override
      default void accept(Integer v0,Integer v1,Double v2) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuIIL extends Consumer3<Integer,Integer,Long>,PConsumer {
      void consume(int v0,int v1,long v2);
      @Override
      default void accept(Integer v0,Integer v1,Long v2) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuIBI extends Consumer3<Integer,Boolean,Integer>,PConsumer {
      void consume(int v0,boolean v1,int v2);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuIBB extends Consumer3<Integer,Boolean,Boolean>,PConsumer {
      void consume(int v0,boolean v1,boolean v2);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuIBD extends Consumer3<Integer,Boolean,Double>,PConsumer {
      void consume(int v0,boolean v1,double v2);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuIBL extends Consumer3<Integer,Boolean,Long>,PConsumer {
      void consume(int v0,boolean v1,long v2);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuIDI extends Consumer3<Integer,Double,Integer>,PConsumer {
      void consume(int v0,double v1,int v2);
      @Override
      default void accept(Integer v0,Double v1,Integer v2) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuIDB extends Consumer3<Integer,Double,Boolean>,PConsumer {
      void consume(int v0,double v1,boolean v2);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuIDD extends Consumer3<Integer,Double,Double>,PConsumer {
      void consume(int v0,double v1,double v2);
      @Override
      default void accept(Integer v0,Double v1,Double v2) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuIDL extends Consumer3<Integer,Double,Long>,PConsumer {
      void consume(int v0,double v1,long v2);
      @Override
      default void accept(Integer v0,Double v1,Long v2) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuILI extends Consumer3<Integer,Long,Integer>,PConsumer {
      void consume(int v0,long v1,int v2);
      @Override
      default void accept(Integer v0,Long v1,Integer v2) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuILB extends Consumer3<Integer,Long,Boolean>,PConsumer {
      void consume(int v0,long v1,boolean v2);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuILD extends Consumer3<Integer,Long,Double>,PConsumer {
      void consume(int v0,long v1,double v2);
      @Override
      default void accept(Integer v0,Long v1,Double v2) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuILL extends Consumer3<Integer,Long,Long>,PConsumer {
      void consume(int v0,long v1,long v2);
      @Override
      default void accept(Integer v0,Long v1,Long v2) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuBII extends Consumer3<Boolean,Integer,Integer>,PConsumer {
      void consume(boolean v0,int v1,int v2);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuBIB extends Consumer3<Boolean,Integer,Boolean>,PConsumer {
      void consume(boolean v0,int v1,boolean v2);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuBID extends Consumer3<Boolean,Integer,Double>,PConsumer {
      void consume(boolean v0,int v1,double v2);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuBIL extends Consumer3<Boolean,Integer,Long>,PConsumer {
      void consume(boolean v0,int v1,long v2);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuBBI extends Consumer3<Boolean,Boolean,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,int v2);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuBBB extends Consumer3<Boolean,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuBBD extends Consumer3<Boolean,Boolean,Double>,PConsumer {
      void consume(boolean v0,boolean v1,double v2);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuBBL extends Consumer3<Boolean,Boolean,Long>,PConsumer {
      void consume(boolean v0,boolean v1,long v2);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuBDI extends Consumer3<Boolean,Double,Integer>,PConsumer {
      void consume(boolean v0,double v1,int v2);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuBDB extends Consumer3<Boolean,Double,Boolean>,PConsumer {
      void consume(boolean v0,double v1,boolean v2);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuBDD extends Consumer3<Boolean,Double,Double>,PConsumer {
      void consume(boolean v0,double v1,double v2);
      @Override
      default void accept(Boolean v0,Double v1,Double v2) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuBDL extends Consumer3<Boolean,Double,Long>,PConsumer {
      void consume(boolean v0,double v1,long v2);
      @Override
      default void accept(Boolean v0,Double v1,Long v2) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuBLI extends Consumer3<Boolean,Long,Integer>,PConsumer {
      void consume(boolean v0,long v1,int v2);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuBLB extends Consumer3<Boolean,Long,Boolean>,PConsumer {
      void consume(boolean v0,long v1,boolean v2);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuBLD extends Consumer3<Boolean,Long,Double>,PConsumer {
      void consume(boolean v0,long v1,double v2);
      @Override
      default void accept(Boolean v0,Long v1,Double v2) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuBLL extends Consumer3<Boolean,Long,Long>,PConsumer {
      void consume(boolean v0,long v1,long v2);
      @Override
      default void accept(Boolean v0,Long v1,Long v2) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuDII extends Consumer3<Double,Integer,Integer>,PConsumer {
      void consume(double v0,int v1,int v2);
      @Override
      default void accept(Double v0,Integer v1,Integer v2) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuDIB extends Consumer3<Double,Integer,Boolean>,PConsumer {
      void consume(double v0,int v1,boolean v2);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuDID extends Consumer3<Double,Integer,Double>,PConsumer {
      void consume(double v0,int v1,double v2);
      @Override
      default void accept(Double v0,Integer v1,Double v2) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuDIL extends Consumer3<Double,Integer,Long>,PConsumer {
      void consume(double v0,int v1,long v2);
      @Override
      default void accept(Double v0,Integer v1,Long v2) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuDBI extends Consumer3<Double,Boolean,Integer>,PConsumer {
      void consume(double v0,boolean v1,int v2);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuDBB extends Consumer3<Double,Boolean,Boolean>,PConsumer {
      void consume(double v0,boolean v1,boolean v2);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuDBD extends Consumer3<Double,Boolean,Double>,PConsumer {
      void consume(double v0,boolean v1,double v2);
      @Override
      default void accept(Double v0,Boolean v1,Double v2) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuDBL extends Consumer3<Double,Boolean,Long>,PConsumer {
      void consume(double v0,boolean v1,long v2);
      @Override
      default void accept(Double v0,Boolean v1,Long v2) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuDDI extends Consumer3<Double,Double,Integer>,PConsumer {
      void consume(double v0,double v1,int v2);
      @Override
      default void accept(Double v0,Double v1,Integer v2) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuDDB extends Consumer3<Double,Double,Boolean>,PConsumer {
      void consume(double v0,double v1,boolean v2);
      @Override
      default void accept(Double v0,Double v1,Boolean v2) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuDDD extends Consumer3<Double,Double,Double>,PConsumer {
      void consume(double v0,double v1,double v2);
      @Override
      default void accept(Double v0,Double v1,Double v2) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuDDL extends Consumer3<Double,Double,Long>,PConsumer {
      void consume(double v0,double v1,long v2);
      @Override
      default void accept(Double v0,Double v1,Long v2) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuDLI extends Consumer3<Double,Long,Integer>,PConsumer {
      void consume(double v0,long v1,int v2);
      @Override
      default void accept(Double v0,Long v1,Integer v2) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuDLB extends Consumer3<Double,Long,Boolean>,PConsumer {
      void consume(double v0,long v1,boolean v2);
      @Override
      default void accept(Double v0,Long v1,Boolean v2) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuDLD extends Consumer3<Double,Long,Double>,PConsumer {
      void consume(double v0,long v1,double v2);
      @Override
      default void accept(Double v0,Long v1,Double v2) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuDLL extends Consumer3<Double,Long,Long>,PConsumer {
      void consume(double v0,long v1,long v2);
      @Override
      default void accept(Double v0,Long v1,Long v2) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuLII extends Consumer3<Long,Integer,Integer>,PConsumer {
      void consume(long v0,int v1,int v2);
      @Override
      default void accept(Long v0,Integer v1,Integer v2) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuLIB extends Consumer3<Long,Integer,Boolean>,PConsumer {
      void consume(long v0,int v1,boolean v2);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuLID extends Consumer3<Long,Integer,Double>,PConsumer {
      void consume(long v0,int v1,double v2);
      @Override
      default void accept(Long v0,Integer v1,Double v2) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuLIL extends Consumer3<Long,Integer,Long>,PConsumer {
      void consume(long v0,int v1,long v2);
      @Override
      default void accept(Long v0,Integer v1,Long v2) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuLBI extends Consumer3<Long,Boolean,Integer>,PConsumer {
      void consume(long v0,boolean v1,int v2);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuLBB extends Consumer3<Long,Boolean,Boolean>,PConsumer {
      void consume(long v0,boolean v1,boolean v2);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuLBD extends Consumer3<Long,Boolean,Double>,PConsumer {
      void consume(long v0,boolean v1,double v2);
      @Override
      default void accept(Long v0,Boolean v1,Double v2) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuLBL extends Consumer3<Long,Boolean,Long>,PConsumer {
      void consume(long v0,boolean v1,long v2);
      @Override
      default void accept(Long v0,Boolean v1,Long v2) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuLDI extends Consumer3<Long,Double,Integer>,PConsumer {
      void consume(long v0,double v1,int v2);
      @Override
      default void accept(Long v0,Double v1,Integer v2) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuLDB extends Consumer3<Long,Double,Boolean>,PConsumer {
      void consume(long v0,double v1,boolean v2);
      @Override
      default void accept(Long v0,Double v1,Boolean v2) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuLDD extends Consumer3<Long,Double,Double>,PConsumer {
      void consume(long v0,double v1,double v2);
      @Override
      default void accept(Long v0,Double v1,Double v2) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuLDL extends Consumer3<Long,Double,Long>,PConsumer {
      void consume(long v0,double v1,long v2);
      @Override
      default void accept(Long v0,Double v1,Long v2) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuLLI extends Consumer3<Long,Long,Integer>,PConsumer {
      void consume(long v0,long v1,int v2);
      @Override
      default void accept(Long v0,Long v1,Integer v2) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2));
       }
}
interface CuLLB extends Consumer3<Long,Long,Boolean>,PConsumer {
      void consume(long v0,long v1,boolean v2);
      @Override
      default void accept(Long v0,Long v1,Boolean v2) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2));
       }
}
interface CuLLD extends Consumer3<Long,Long,Double>,PConsumer {
      void consume(long v0,long v1,double v2);
      @Override
      default void accept(Long v0,Long v1,Double v2) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2));
       }
}
interface CuLLL extends Consumer3<Long,Long,Long>,PConsumer {
      void consume(long v0,long v1,long v2);
      @Override
      default void accept(Long v0,Long v1,Long v2) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2));
       }
}
interface CuIIII extends Consumer4<Integer,Integer,Integer,Integer>,PConsumer {
      void consume(int v0,int v1,int v2,int v3);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Integer v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIIIB extends Consumer4<Integer,Integer,Integer,Boolean>,PConsumer {
      void consume(int v0,int v1,int v2,boolean v3);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Boolean v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIIID extends Consumer4<Integer,Integer,Integer,Double>,PConsumer {
      void consume(int v0,int v1,int v2,double v3);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Double v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIIIL extends Consumer4<Integer,Integer,Integer,Long>,PConsumer {
      void consume(int v0,int v1,int v2,long v3);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Long v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIIBI extends Consumer4<Integer,Integer,Boolean,Integer>,PConsumer {
      void consume(int v0,int v1,boolean v2,int v3);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Integer v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIIBB extends Consumer4<Integer,Integer,Boolean,Boolean>,PConsumer {
      void consume(int v0,int v1,boolean v2,boolean v3);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Boolean v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIIBD extends Consumer4<Integer,Integer,Boolean,Double>,PConsumer {
      void consume(int v0,int v1,boolean v2,double v3);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Double v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIIBL extends Consumer4<Integer,Integer,Boolean,Long>,PConsumer {
      void consume(int v0,int v1,boolean v2,long v3);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Long v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIIDI extends Consumer4<Integer,Integer,Double,Integer>,PConsumer {
      void consume(int v0,int v1,double v2,int v3);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Integer v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIIDB extends Consumer4<Integer,Integer,Double,Boolean>,PConsumer {
      void consume(int v0,int v1,double v2,boolean v3);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Boolean v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIIDD extends Consumer4<Integer,Integer,Double,Double>,PConsumer {
      void consume(int v0,int v1,double v2,double v3);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Double v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIIDL extends Consumer4<Integer,Integer,Double,Long>,PConsumer {
      void consume(int v0,int v1,double v2,long v3);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Long v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIILI extends Consumer4<Integer,Integer,Long,Integer>,PConsumer {
      void consume(int v0,int v1,long v2,int v3);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Integer v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIILB extends Consumer4<Integer,Integer,Long,Boolean>,PConsumer {
      void consume(int v0,int v1,long v2,boolean v3);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Boolean v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIILD extends Consumer4<Integer,Integer,Long,Double>,PConsumer {
      void consume(int v0,int v1,long v2,double v3);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Double v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIILL extends Consumer4<Integer,Integer,Long,Long>,PConsumer {
      void consume(int v0,int v1,long v2,long v3);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Long v3) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIBII extends Consumer4<Integer,Boolean,Integer,Integer>,PConsumer {
      void consume(int v0,boolean v1,int v2,int v3);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Integer v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIBIB extends Consumer4<Integer,Boolean,Integer,Boolean>,PConsumer {
      void consume(int v0,boolean v1,int v2,boolean v3);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Boolean v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIBID extends Consumer4<Integer,Boolean,Integer,Double>,PConsumer {
      void consume(int v0,boolean v1,int v2,double v3);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Double v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIBIL extends Consumer4<Integer,Boolean,Integer,Long>,PConsumer {
      void consume(int v0,boolean v1,int v2,long v3);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Long v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIBBI extends Consumer4<Integer,Boolean,Boolean,Integer>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,int v3);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Integer v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIBBB extends Consumer4<Integer,Boolean,Boolean,Boolean>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,boolean v3);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Boolean v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIBBD extends Consumer4<Integer,Boolean,Boolean,Double>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,double v3);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Double v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIBBL extends Consumer4<Integer,Boolean,Boolean,Long>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,long v3);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Long v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIBDI extends Consumer4<Integer,Boolean,Double,Integer>,PConsumer {
      void consume(int v0,boolean v1,double v2,int v3);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Integer v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIBDB extends Consumer4<Integer,Boolean,Double,Boolean>,PConsumer {
      void consume(int v0,boolean v1,double v2,boolean v3);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Boolean v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIBDD extends Consumer4<Integer,Boolean,Double,Double>,PConsumer {
      void consume(int v0,boolean v1,double v2,double v3);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Double v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIBDL extends Consumer4<Integer,Boolean,Double,Long>,PConsumer {
      void consume(int v0,boolean v1,double v2,long v3);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Long v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIBLI extends Consumer4<Integer,Boolean,Long,Integer>,PConsumer {
      void consume(int v0,boolean v1,long v2,int v3);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Integer v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIBLB extends Consumer4<Integer,Boolean,Long,Boolean>,PConsumer {
      void consume(int v0,boolean v1,long v2,boolean v3);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Boolean v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIBLD extends Consumer4<Integer,Boolean,Long,Double>,PConsumer {
      void consume(int v0,boolean v1,long v2,double v3);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Double v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIBLL extends Consumer4<Integer,Boolean,Long,Long>,PConsumer {
      void consume(int v0,boolean v1,long v2,long v3);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Long v3) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIDII extends Consumer4<Integer,Double,Integer,Integer>,PConsumer {
      void consume(int v0,double v1,int v2,int v3);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Integer v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIDIB extends Consumer4<Integer,Double,Integer,Boolean>,PConsumer {
      void consume(int v0,double v1,int v2,boolean v3);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Boolean v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIDID extends Consumer4<Integer,Double,Integer,Double>,PConsumer {
      void consume(int v0,double v1,int v2,double v3);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Double v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIDIL extends Consumer4<Integer,Double,Integer,Long>,PConsumer {
      void consume(int v0,double v1,int v2,long v3);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Long v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIDBI extends Consumer4<Integer,Double,Boolean,Integer>,PConsumer {
      void consume(int v0,double v1,boolean v2,int v3);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Integer v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIDBB extends Consumer4<Integer,Double,Boolean,Boolean>,PConsumer {
      void consume(int v0,double v1,boolean v2,boolean v3);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Boolean v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIDBD extends Consumer4<Integer,Double,Boolean,Double>,PConsumer {
      void consume(int v0,double v1,boolean v2,double v3);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Double v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIDBL extends Consumer4<Integer,Double,Boolean,Long>,PConsumer {
      void consume(int v0,double v1,boolean v2,long v3);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Long v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIDDI extends Consumer4<Integer,Double,Double,Integer>,PConsumer {
      void consume(int v0,double v1,double v2,int v3);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Integer v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIDDB extends Consumer4<Integer,Double,Double,Boolean>,PConsumer {
      void consume(int v0,double v1,double v2,boolean v3);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Boolean v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIDDD extends Consumer4<Integer,Double,Double,Double>,PConsumer {
      void consume(int v0,double v1,double v2,double v3);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Double v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIDDL extends Consumer4<Integer,Double,Double,Long>,PConsumer {
      void consume(int v0,double v1,double v2,long v3);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Long v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIDLI extends Consumer4<Integer,Double,Long,Integer>,PConsumer {
      void consume(int v0,double v1,long v2,int v3);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Integer v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuIDLB extends Consumer4<Integer,Double,Long,Boolean>,PConsumer {
      void consume(int v0,double v1,long v2,boolean v3);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Boolean v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuIDLD extends Consumer4<Integer,Double,Long,Double>,PConsumer {
      void consume(int v0,double v1,long v2,double v3);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Double v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuIDLL extends Consumer4<Integer,Double,Long,Long>,PConsumer {
      void consume(int v0,double v1,long v2,long v3);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Long v3) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuILII extends Consumer4<Integer,Long,Integer,Integer>,PConsumer {
      void consume(int v0,long v1,int v2,int v3);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Integer v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuILIB extends Consumer4<Integer,Long,Integer,Boolean>,PConsumer {
      void consume(int v0,long v1,int v2,boolean v3);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Boolean v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuILID extends Consumer4<Integer,Long,Integer,Double>,PConsumer {
      void consume(int v0,long v1,int v2,double v3);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Double v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuILIL extends Consumer4<Integer,Long,Integer,Long>,PConsumer {
      void consume(int v0,long v1,int v2,long v3);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Long v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuILBI extends Consumer4<Integer,Long,Boolean,Integer>,PConsumer {
      void consume(int v0,long v1,boolean v2,int v3);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Integer v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuILBB extends Consumer4<Integer,Long,Boolean,Boolean>,PConsumer {
      void consume(int v0,long v1,boolean v2,boolean v3);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Boolean v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuILBD extends Consumer4<Integer,Long,Boolean,Double>,PConsumer {
      void consume(int v0,long v1,boolean v2,double v3);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Double v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuILBL extends Consumer4<Integer,Long,Boolean,Long>,PConsumer {
      void consume(int v0,long v1,boolean v2,long v3);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Long v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuILDI extends Consumer4<Integer,Long,Double,Integer>,PConsumer {
      void consume(int v0,long v1,double v2,int v3);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Integer v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuILDB extends Consumer4<Integer,Long,Double,Boolean>,PConsumer {
      void consume(int v0,long v1,double v2,boolean v3);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Boolean v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuILDD extends Consumer4<Integer,Long,Double,Double>,PConsumer {
      void consume(int v0,long v1,double v2,double v3);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Double v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuILDL extends Consumer4<Integer,Long,Double,Long>,PConsumer {
      void consume(int v0,long v1,double v2,long v3);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Long v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuILLI extends Consumer4<Integer,Long,Long,Integer>,PConsumer {
      void consume(int v0,long v1,long v2,int v3);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Integer v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuILLB extends Consumer4<Integer,Long,Long,Boolean>,PConsumer {
      void consume(int v0,long v1,long v2,boolean v3);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Boolean v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuILLD extends Consumer4<Integer,Long,Long,Double>,PConsumer {
      void consume(int v0,long v1,long v2,double v3);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Double v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuILLL extends Consumer4<Integer,Long,Long,Long>,PConsumer {
      void consume(int v0,long v1,long v2,long v3);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Long v3) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBIII extends Consumer4<Boolean,Integer,Integer,Integer>,PConsumer {
      void consume(boolean v0,int v1,int v2,int v3);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBIIB extends Consumer4<Boolean,Integer,Integer,Boolean>,PConsumer {
      void consume(boolean v0,int v1,int v2,boolean v3);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBIID extends Consumer4<Boolean,Integer,Integer,Double>,PConsumer {
      void consume(boolean v0,int v1,int v2,double v3);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Double v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBIIL extends Consumer4<Boolean,Integer,Integer,Long>,PConsumer {
      void consume(boolean v0,int v1,int v2,long v3);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Long v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBIBI extends Consumer4<Boolean,Integer,Boolean,Integer>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,int v3);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBIBB extends Consumer4<Boolean,Integer,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,boolean v3);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBIBD extends Consumer4<Boolean,Integer,Boolean,Double>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,double v3);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Double v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBIBL extends Consumer4<Boolean,Integer,Boolean,Long>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,long v3);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Long v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBIDI extends Consumer4<Boolean,Integer,Double,Integer>,PConsumer {
      void consume(boolean v0,int v1,double v2,int v3);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBIDB extends Consumer4<Boolean,Integer,Double,Boolean>,PConsumer {
      void consume(boolean v0,int v1,double v2,boolean v3);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBIDD extends Consumer4<Boolean,Integer,Double,Double>,PConsumer {
      void consume(boolean v0,int v1,double v2,double v3);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Double v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBIDL extends Consumer4<Boolean,Integer,Double,Long>,PConsumer {
      void consume(boolean v0,int v1,double v2,long v3);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Long v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBILI extends Consumer4<Boolean,Integer,Long,Integer>,PConsumer {
      void consume(boolean v0,int v1,long v2,int v3);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBILB extends Consumer4<Boolean,Integer,Long,Boolean>,PConsumer {
      void consume(boolean v0,int v1,long v2,boolean v3);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBILD extends Consumer4<Boolean,Integer,Long,Double>,PConsumer {
      void consume(boolean v0,int v1,long v2,double v3);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Double v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBILL extends Consumer4<Boolean,Integer,Long,Long>,PConsumer {
      void consume(boolean v0,int v1,long v2,long v3);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Long v3) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBBII extends Consumer4<Boolean,Boolean,Integer,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,int v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBBIB extends Consumer4<Boolean,Boolean,Integer,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,boolean v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBBID extends Consumer4<Boolean,Boolean,Integer,Double>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,double v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Double v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBBIL extends Consumer4<Boolean,Boolean,Integer,Long>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,long v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Long v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBBBI extends Consumer4<Boolean,Boolean,Boolean,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,int v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBBBB extends Consumer4<Boolean,Boolean,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,boolean v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBBBD extends Consumer4<Boolean,Boolean,Boolean,Double>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,double v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Double v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBBBL extends Consumer4<Boolean,Boolean,Boolean,Long>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,long v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Long v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBBDI extends Consumer4<Boolean,Boolean,Double,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,int v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBBDB extends Consumer4<Boolean,Boolean,Double,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,boolean v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBBDD extends Consumer4<Boolean,Boolean,Double,Double>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,double v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Double v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBBDL extends Consumer4<Boolean,Boolean,Double,Long>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,long v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Long v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBBLI extends Consumer4<Boolean,Boolean,Long,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,int v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBBLB extends Consumer4<Boolean,Boolean,Long,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,boolean v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBBLD extends Consumer4<Boolean,Boolean,Long,Double>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,double v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Double v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBBLL extends Consumer4<Boolean,Boolean,Long,Long>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,long v3);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Long v3) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBDII extends Consumer4<Boolean,Double,Integer,Integer>,PConsumer {
      void consume(boolean v0,double v1,int v2,int v3);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBDIB extends Consumer4<Boolean,Double,Integer,Boolean>,PConsumer {
      void consume(boolean v0,double v1,int v2,boolean v3);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBDID extends Consumer4<Boolean,Double,Integer,Double>,PConsumer {
      void consume(boolean v0,double v1,int v2,double v3);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Double v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBDIL extends Consumer4<Boolean,Double,Integer,Long>,PConsumer {
      void consume(boolean v0,double v1,int v2,long v3);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Long v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBDBI extends Consumer4<Boolean,Double,Boolean,Integer>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,int v3);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBDBB extends Consumer4<Boolean,Double,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,boolean v3);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBDBD extends Consumer4<Boolean,Double,Boolean,Double>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,double v3);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Double v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBDBL extends Consumer4<Boolean,Double,Boolean,Long>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,long v3);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Long v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBDDI extends Consumer4<Boolean,Double,Double,Integer>,PConsumer {
      void consume(boolean v0,double v1,double v2,int v3);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBDDB extends Consumer4<Boolean,Double,Double,Boolean>,PConsumer {
      void consume(boolean v0,double v1,double v2,boolean v3);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBDDD extends Consumer4<Boolean,Double,Double,Double>,PConsumer {
      void consume(boolean v0,double v1,double v2,double v3);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Double v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBDDL extends Consumer4<Boolean,Double,Double,Long>,PConsumer {
      void consume(boolean v0,double v1,double v2,long v3);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Long v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBDLI extends Consumer4<Boolean,Double,Long,Integer>,PConsumer {
      void consume(boolean v0,double v1,long v2,int v3);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBDLB extends Consumer4<Boolean,Double,Long,Boolean>,PConsumer {
      void consume(boolean v0,double v1,long v2,boolean v3);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBDLD extends Consumer4<Boolean,Double,Long,Double>,PConsumer {
      void consume(boolean v0,double v1,long v2,double v3);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Double v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBDLL extends Consumer4<Boolean,Double,Long,Long>,PConsumer {
      void consume(boolean v0,double v1,long v2,long v3);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Long v3) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBLII extends Consumer4<Boolean,Long,Integer,Integer>,PConsumer {
      void consume(boolean v0,long v1,int v2,int v3);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBLIB extends Consumer4<Boolean,Long,Integer,Boolean>,PConsumer {
      void consume(boolean v0,long v1,int v2,boolean v3);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBLID extends Consumer4<Boolean,Long,Integer,Double>,PConsumer {
      void consume(boolean v0,long v1,int v2,double v3);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Double v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBLIL extends Consumer4<Boolean,Long,Integer,Long>,PConsumer {
      void consume(boolean v0,long v1,int v2,long v3);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Long v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBLBI extends Consumer4<Boolean,Long,Boolean,Integer>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,int v3);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBLBB extends Consumer4<Boolean,Long,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,boolean v3);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBLBD extends Consumer4<Boolean,Long,Boolean,Double>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,double v3);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Double v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBLBL extends Consumer4<Boolean,Long,Boolean,Long>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,long v3);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Long v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBLDI extends Consumer4<Boolean,Long,Double,Integer>,PConsumer {
      void consume(boolean v0,long v1,double v2,int v3);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBLDB extends Consumer4<Boolean,Long,Double,Boolean>,PConsumer {
      void consume(boolean v0,long v1,double v2,boolean v3);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBLDD extends Consumer4<Boolean,Long,Double,Double>,PConsumer {
      void consume(boolean v0,long v1,double v2,double v3);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Double v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBLDL extends Consumer4<Boolean,Long,Double,Long>,PConsumer {
      void consume(boolean v0,long v1,double v2,long v3);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Long v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuBLLI extends Consumer4<Boolean,Long,Long,Integer>,PConsumer {
      void consume(boolean v0,long v1,long v2,int v3);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Integer v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuBLLB extends Consumer4<Boolean,Long,Long,Boolean>,PConsumer {
      void consume(boolean v0,long v1,long v2,boolean v3);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Boolean v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuBLLD extends Consumer4<Boolean,Long,Long,Double>,PConsumer {
      void consume(boolean v0,long v1,long v2,double v3);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Double v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuBLLL extends Consumer4<Boolean,Long,Long,Long>,PConsumer {
      void consume(boolean v0,long v1,long v2,long v3);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Long v3) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDIII extends Consumer4<Double,Integer,Integer,Integer>,PConsumer {
      void consume(double v0,int v1,int v2,int v3);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Integer v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDIIB extends Consumer4<Double,Integer,Integer,Boolean>,PConsumer {
      void consume(double v0,int v1,int v2,boolean v3);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Boolean v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDIID extends Consumer4<Double,Integer,Integer,Double>,PConsumer {
      void consume(double v0,int v1,int v2,double v3);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Double v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDIIL extends Consumer4<Double,Integer,Integer,Long>,PConsumer {
      void consume(double v0,int v1,int v2,long v3);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Long v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDIBI extends Consumer4<Double,Integer,Boolean,Integer>,PConsumer {
      void consume(double v0,int v1,boolean v2,int v3);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Integer v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDIBB extends Consumer4<Double,Integer,Boolean,Boolean>,PConsumer {
      void consume(double v0,int v1,boolean v2,boolean v3);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Boolean v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDIBD extends Consumer4<Double,Integer,Boolean,Double>,PConsumer {
      void consume(double v0,int v1,boolean v2,double v3);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Double v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDIBL extends Consumer4<Double,Integer,Boolean,Long>,PConsumer {
      void consume(double v0,int v1,boolean v2,long v3);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Long v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDIDI extends Consumer4<Double,Integer,Double,Integer>,PConsumer {
      void consume(double v0,int v1,double v2,int v3);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Integer v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDIDB extends Consumer4<Double,Integer,Double,Boolean>,PConsumer {
      void consume(double v0,int v1,double v2,boolean v3);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Boolean v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDIDD extends Consumer4<Double,Integer,Double,Double>,PConsumer {
      void consume(double v0,int v1,double v2,double v3);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Double v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDIDL extends Consumer4<Double,Integer,Double,Long>,PConsumer {
      void consume(double v0,int v1,double v2,long v3);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Long v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDILI extends Consumer4<Double,Integer,Long,Integer>,PConsumer {
      void consume(double v0,int v1,long v2,int v3);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Integer v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDILB extends Consumer4<Double,Integer,Long,Boolean>,PConsumer {
      void consume(double v0,int v1,long v2,boolean v3);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Boolean v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDILD extends Consumer4<Double,Integer,Long,Double>,PConsumer {
      void consume(double v0,int v1,long v2,double v3);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Double v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDILL extends Consumer4<Double,Integer,Long,Long>,PConsumer {
      void consume(double v0,int v1,long v2,long v3);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Long v3) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDBII extends Consumer4<Double,Boolean,Integer,Integer>,PConsumer {
      void consume(double v0,boolean v1,int v2,int v3);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Integer v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDBIB extends Consumer4<Double,Boolean,Integer,Boolean>,PConsumer {
      void consume(double v0,boolean v1,int v2,boolean v3);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Boolean v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDBID extends Consumer4<Double,Boolean,Integer,Double>,PConsumer {
      void consume(double v0,boolean v1,int v2,double v3);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Double v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDBIL extends Consumer4<Double,Boolean,Integer,Long>,PConsumer {
      void consume(double v0,boolean v1,int v2,long v3);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Long v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDBBI extends Consumer4<Double,Boolean,Boolean,Integer>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,int v3);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Integer v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDBBB extends Consumer4<Double,Boolean,Boolean,Boolean>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,boolean v3);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Boolean v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDBBD extends Consumer4<Double,Boolean,Boolean,Double>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,double v3);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Double v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDBBL extends Consumer4<Double,Boolean,Boolean,Long>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,long v3);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Long v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDBDI extends Consumer4<Double,Boolean,Double,Integer>,PConsumer {
      void consume(double v0,boolean v1,double v2,int v3);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Integer v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDBDB extends Consumer4<Double,Boolean,Double,Boolean>,PConsumer {
      void consume(double v0,boolean v1,double v2,boolean v3);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Boolean v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDBDD extends Consumer4<Double,Boolean,Double,Double>,PConsumer {
      void consume(double v0,boolean v1,double v2,double v3);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Double v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDBDL extends Consumer4<Double,Boolean,Double,Long>,PConsumer {
      void consume(double v0,boolean v1,double v2,long v3);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Long v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDBLI extends Consumer4<Double,Boolean,Long,Integer>,PConsumer {
      void consume(double v0,boolean v1,long v2,int v3);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Integer v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDBLB extends Consumer4<Double,Boolean,Long,Boolean>,PConsumer {
      void consume(double v0,boolean v1,long v2,boolean v3);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Boolean v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDBLD extends Consumer4<Double,Boolean,Long,Double>,PConsumer {
      void consume(double v0,boolean v1,long v2,double v3);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Double v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDBLL extends Consumer4<Double,Boolean,Long,Long>,PConsumer {
      void consume(double v0,boolean v1,long v2,long v3);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Long v3) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDDII extends Consumer4<Double,Double,Integer,Integer>,PConsumer {
      void consume(double v0,double v1,int v2,int v3);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Integer v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDDIB extends Consumer4<Double,Double,Integer,Boolean>,PConsumer {
      void consume(double v0,double v1,int v2,boolean v3);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Boolean v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDDID extends Consumer4<Double,Double,Integer,Double>,PConsumer {
      void consume(double v0,double v1,int v2,double v3);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Double v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDDIL extends Consumer4<Double,Double,Integer,Long>,PConsumer {
      void consume(double v0,double v1,int v2,long v3);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Long v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDDBI extends Consumer4<Double,Double,Boolean,Integer>,PConsumer {
      void consume(double v0,double v1,boolean v2,int v3);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Integer v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDDBB extends Consumer4<Double,Double,Boolean,Boolean>,PConsumer {
      void consume(double v0,double v1,boolean v2,boolean v3);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Boolean v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDDBD extends Consumer4<Double,Double,Boolean,Double>,PConsumer {
      void consume(double v0,double v1,boolean v2,double v3);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Double v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDDBL extends Consumer4<Double,Double,Boolean,Long>,PConsumer {
      void consume(double v0,double v1,boolean v2,long v3);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Long v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDDDI extends Consumer4<Double,Double,Double,Integer>,PConsumer {
      void consume(double v0,double v1,double v2,int v3);
      @Override
      default void accept(Double v0,Double v1,Double v2,Integer v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDDDB extends Consumer4<Double,Double,Double,Boolean>,PConsumer {
      void consume(double v0,double v1,double v2,boolean v3);
      @Override
      default void accept(Double v0,Double v1,Double v2,Boolean v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDDDD extends Consumer4<Double,Double,Double,Double>,PConsumer {
      void consume(double v0,double v1,double v2,double v3);
      @Override
      default void accept(Double v0,Double v1,Double v2,Double v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDDDL extends Consumer4<Double,Double,Double,Long>,PConsumer {
      void consume(double v0,double v1,double v2,long v3);
      @Override
      default void accept(Double v0,Double v1,Double v2,Long v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDDLI extends Consumer4<Double,Double,Long,Integer>,PConsumer {
      void consume(double v0,double v1,long v2,int v3);
      @Override
      default void accept(Double v0,Double v1,Long v2,Integer v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDDLB extends Consumer4<Double,Double,Long,Boolean>,PConsumer {
      void consume(double v0,double v1,long v2,boolean v3);
      @Override
      default void accept(Double v0,Double v1,Long v2,Boolean v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDDLD extends Consumer4<Double,Double,Long,Double>,PConsumer {
      void consume(double v0,double v1,long v2,double v3);
      @Override
      default void accept(Double v0,Double v1,Long v2,Double v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDDLL extends Consumer4<Double,Double,Long,Long>,PConsumer {
      void consume(double v0,double v1,long v2,long v3);
      @Override
      default void accept(Double v0,Double v1,Long v2,Long v3) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDLII extends Consumer4<Double,Long,Integer,Integer>,PConsumer {
      void consume(double v0,long v1,int v2,int v3);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Integer v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDLIB extends Consumer4<Double,Long,Integer,Boolean>,PConsumer {
      void consume(double v0,long v1,int v2,boolean v3);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Boolean v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDLID extends Consumer4<Double,Long,Integer,Double>,PConsumer {
      void consume(double v0,long v1,int v2,double v3);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Double v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDLIL extends Consumer4<Double,Long,Integer,Long>,PConsumer {
      void consume(double v0,long v1,int v2,long v3);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Long v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDLBI extends Consumer4<Double,Long,Boolean,Integer>,PConsumer {
      void consume(double v0,long v1,boolean v2,int v3);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Integer v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDLBB extends Consumer4<Double,Long,Boolean,Boolean>,PConsumer {
      void consume(double v0,long v1,boolean v2,boolean v3);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Boolean v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDLBD extends Consumer4<Double,Long,Boolean,Double>,PConsumer {
      void consume(double v0,long v1,boolean v2,double v3);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Double v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDLBL extends Consumer4<Double,Long,Boolean,Long>,PConsumer {
      void consume(double v0,long v1,boolean v2,long v3);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Long v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDLDI extends Consumer4<Double,Long,Double,Integer>,PConsumer {
      void consume(double v0,long v1,double v2,int v3);
      @Override
      default void accept(Double v0,Long v1,Double v2,Integer v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDLDB extends Consumer4<Double,Long,Double,Boolean>,PConsumer {
      void consume(double v0,long v1,double v2,boolean v3);
      @Override
      default void accept(Double v0,Long v1,Double v2,Boolean v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDLDD extends Consumer4<Double,Long,Double,Double>,PConsumer {
      void consume(double v0,long v1,double v2,double v3);
      @Override
      default void accept(Double v0,Long v1,Double v2,Double v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDLDL extends Consumer4<Double,Long,Double,Long>,PConsumer {
      void consume(double v0,long v1,double v2,long v3);
      @Override
      default void accept(Double v0,Long v1,Double v2,Long v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuDLLI extends Consumer4<Double,Long,Long,Integer>,PConsumer {
      void consume(double v0,long v1,long v2,int v3);
      @Override
      default void accept(Double v0,Long v1,Long v2,Integer v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuDLLB extends Consumer4<Double,Long,Long,Boolean>,PConsumer {
      void consume(double v0,long v1,long v2,boolean v3);
      @Override
      default void accept(Double v0,Long v1,Long v2,Boolean v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuDLLD extends Consumer4<Double,Long,Long,Double>,PConsumer {
      void consume(double v0,long v1,long v2,double v3);
      @Override
      default void accept(Double v0,Long v1,Long v2,Double v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuDLLL extends Consumer4<Double,Long,Long,Long>,PConsumer {
      void consume(double v0,long v1,long v2,long v3);
      @Override
      default void accept(Double v0,Long v1,Long v2,Long v3) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLIII extends Consumer4<Long,Integer,Integer,Integer>,PConsumer {
      void consume(long v0,int v1,int v2,int v3);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Integer v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLIIB extends Consumer4<Long,Integer,Integer,Boolean>,PConsumer {
      void consume(long v0,int v1,int v2,boolean v3);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Boolean v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLIID extends Consumer4<Long,Integer,Integer,Double>,PConsumer {
      void consume(long v0,int v1,int v2,double v3);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Double v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLIIL extends Consumer4<Long,Integer,Integer,Long>,PConsumer {
      void consume(long v0,int v1,int v2,long v3);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Long v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLIBI extends Consumer4<Long,Integer,Boolean,Integer>,PConsumer {
      void consume(long v0,int v1,boolean v2,int v3);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Integer v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLIBB extends Consumer4<Long,Integer,Boolean,Boolean>,PConsumer {
      void consume(long v0,int v1,boolean v2,boolean v3);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Boolean v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLIBD extends Consumer4<Long,Integer,Boolean,Double>,PConsumer {
      void consume(long v0,int v1,boolean v2,double v3);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Double v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLIBL extends Consumer4<Long,Integer,Boolean,Long>,PConsumer {
      void consume(long v0,int v1,boolean v2,long v3);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Long v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLIDI extends Consumer4<Long,Integer,Double,Integer>,PConsumer {
      void consume(long v0,int v1,double v2,int v3);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Integer v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLIDB extends Consumer4<Long,Integer,Double,Boolean>,PConsumer {
      void consume(long v0,int v1,double v2,boolean v3);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Boolean v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLIDD extends Consumer4<Long,Integer,Double,Double>,PConsumer {
      void consume(long v0,int v1,double v2,double v3);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Double v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLIDL extends Consumer4<Long,Integer,Double,Long>,PConsumer {
      void consume(long v0,int v1,double v2,long v3);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Long v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLILI extends Consumer4<Long,Integer,Long,Integer>,PConsumer {
      void consume(long v0,int v1,long v2,int v3);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Integer v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLILB extends Consumer4<Long,Integer,Long,Boolean>,PConsumer {
      void consume(long v0,int v1,long v2,boolean v3);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Boolean v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLILD extends Consumer4<Long,Integer,Long,Double>,PConsumer {
      void consume(long v0,int v1,long v2,double v3);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Double v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLILL extends Consumer4<Long,Integer,Long,Long>,PConsumer {
      void consume(long v0,int v1,long v2,long v3);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Long v3) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLBII extends Consumer4<Long,Boolean,Integer,Integer>,PConsumer {
      void consume(long v0,boolean v1,int v2,int v3);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Integer v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLBIB extends Consumer4<Long,Boolean,Integer,Boolean>,PConsumer {
      void consume(long v0,boolean v1,int v2,boolean v3);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Boolean v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLBID extends Consumer4<Long,Boolean,Integer,Double>,PConsumer {
      void consume(long v0,boolean v1,int v2,double v3);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Double v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLBIL extends Consumer4<Long,Boolean,Integer,Long>,PConsumer {
      void consume(long v0,boolean v1,int v2,long v3);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Long v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLBBI extends Consumer4<Long,Boolean,Boolean,Integer>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,int v3);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Integer v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLBBB extends Consumer4<Long,Boolean,Boolean,Boolean>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,boolean v3);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Boolean v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLBBD extends Consumer4<Long,Boolean,Boolean,Double>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,double v3);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Double v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLBBL extends Consumer4<Long,Boolean,Boolean,Long>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,long v3);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Long v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLBDI extends Consumer4<Long,Boolean,Double,Integer>,PConsumer {
      void consume(long v0,boolean v1,double v2,int v3);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Integer v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLBDB extends Consumer4<Long,Boolean,Double,Boolean>,PConsumer {
      void consume(long v0,boolean v1,double v2,boolean v3);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Boolean v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLBDD extends Consumer4<Long,Boolean,Double,Double>,PConsumer {
      void consume(long v0,boolean v1,double v2,double v3);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Double v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLBDL extends Consumer4<Long,Boolean,Double,Long>,PConsumer {
      void consume(long v0,boolean v1,double v2,long v3);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Long v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLBLI extends Consumer4<Long,Boolean,Long,Integer>,PConsumer {
      void consume(long v0,boolean v1,long v2,int v3);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Integer v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLBLB extends Consumer4<Long,Boolean,Long,Boolean>,PConsumer {
      void consume(long v0,boolean v1,long v2,boolean v3);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Boolean v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLBLD extends Consumer4<Long,Boolean,Long,Double>,PConsumer {
      void consume(long v0,boolean v1,long v2,double v3);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Double v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLBLL extends Consumer4<Long,Boolean,Long,Long>,PConsumer {
      void consume(long v0,boolean v1,long v2,long v3);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Long v3) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLDII extends Consumer4<Long,Double,Integer,Integer>,PConsumer {
      void consume(long v0,double v1,int v2,int v3);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Integer v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLDIB extends Consumer4<Long,Double,Integer,Boolean>,PConsumer {
      void consume(long v0,double v1,int v2,boolean v3);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Boolean v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLDID extends Consumer4<Long,Double,Integer,Double>,PConsumer {
      void consume(long v0,double v1,int v2,double v3);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Double v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLDIL extends Consumer4<Long,Double,Integer,Long>,PConsumer {
      void consume(long v0,double v1,int v2,long v3);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Long v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLDBI extends Consumer4<Long,Double,Boolean,Integer>,PConsumer {
      void consume(long v0,double v1,boolean v2,int v3);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Integer v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLDBB extends Consumer4<Long,Double,Boolean,Boolean>,PConsumer {
      void consume(long v0,double v1,boolean v2,boolean v3);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Boolean v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLDBD extends Consumer4<Long,Double,Boolean,Double>,PConsumer {
      void consume(long v0,double v1,boolean v2,double v3);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Double v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLDBL extends Consumer4<Long,Double,Boolean,Long>,PConsumer {
      void consume(long v0,double v1,boolean v2,long v3);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Long v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLDDI extends Consumer4<Long,Double,Double,Integer>,PConsumer {
      void consume(long v0,double v1,double v2,int v3);
      @Override
      default void accept(Long v0,Double v1,Double v2,Integer v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLDDB extends Consumer4<Long,Double,Double,Boolean>,PConsumer {
      void consume(long v0,double v1,double v2,boolean v3);
      @Override
      default void accept(Long v0,Double v1,Double v2,Boolean v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLDDD extends Consumer4<Long,Double,Double,Double>,PConsumer {
      void consume(long v0,double v1,double v2,double v3);
      @Override
      default void accept(Long v0,Double v1,Double v2,Double v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLDDL extends Consumer4<Long,Double,Double,Long>,PConsumer {
      void consume(long v0,double v1,double v2,long v3);
      @Override
      default void accept(Long v0,Double v1,Double v2,Long v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLDLI extends Consumer4<Long,Double,Long,Integer>,PConsumer {
      void consume(long v0,double v1,long v2,int v3);
      @Override
      default void accept(Long v0,Double v1,Long v2,Integer v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLDLB extends Consumer4<Long,Double,Long,Boolean>,PConsumer {
      void consume(long v0,double v1,long v2,boolean v3);
      @Override
      default void accept(Long v0,Double v1,Long v2,Boolean v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLDLD extends Consumer4<Long,Double,Long,Double>,PConsumer {
      void consume(long v0,double v1,long v2,double v3);
      @Override
      default void accept(Long v0,Double v1,Long v2,Double v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLDLL extends Consumer4<Long,Double,Long,Long>,PConsumer {
      void consume(long v0,double v1,long v2,long v3);
      @Override
      default void accept(Long v0,Double v1,Long v2,Long v3) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLLII extends Consumer4<Long,Long,Integer,Integer>,PConsumer {
      void consume(long v0,long v1,int v2,int v3);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Integer v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLLIB extends Consumer4<Long,Long,Integer,Boolean>,PConsumer {
      void consume(long v0,long v1,int v2,boolean v3);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Boolean v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLLID extends Consumer4<Long,Long,Integer,Double>,PConsumer {
      void consume(long v0,long v1,int v2,double v3);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Double v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLLIL extends Consumer4<Long,Long,Integer,Long>,PConsumer {
      void consume(long v0,long v1,int v2,long v3);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Long v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLLBI extends Consumer4<Long,Long,Boolean,Integer>,PConsumer {
      void consume(long v0,long v1,boolean v2,int v3);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Integer v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLLBB extends Consumer4<Long,Long,Boolean,Boolean>,PConsumer {
      void consume(long v0,long v1,boolean v2,boolean v3);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Boolean v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLLBD extends Consumer4<Long,Long,Boolean,Double>,PConsumer {
      void consume(long v0,long v1,boolean v2,double v3);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Double v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLLBL extends Consumer4<Long,Long,Boolean,Long>,PConsumer {
      void consume(long v0,long v1,boolean v2,long v3);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Long v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLLDI extends Consumer4<Long,Long,Double,Integer>,PConsumer {
      void consume(long v0,long v1,double v2,int v3);
      @Override
      default void accept(Long v0,Long v1,Double v2,Integer v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLLDB extends Consumer4<Long,Long,Double,Boolean>,PConsumer {
      void consume(long v0,long v1,double v2,boolean v3);
      @Override
      default void accept(Long v0,Long v1,Double v2,Boolean v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLLDD extends Consumer4<Long,Long,Double,Double>,PConsumer {
      void consume(long v0,long v1,double v2,double v3);
      @Override
      default void accept(Long v0,Long v1,Double v2,Double v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLLDL extends Consumer4<Long,Long,Double,Long>,PConsumer {
      void consume(long v0,long v1,double v2,long v3);
      @Override
      default void accept(Long v0,Long v1,Double v2,Long v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuLLLI extends Consumer4<Long,Long,Long,Integer>,PConsumer {
      void consume(long v0,long v1,long v2,int v3);
      @Override
      default void accept(Long v0,Long v1,Long v2,Integer v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3));
       }
}
interface CuLLLB extends Consumer4<Long,Long,Long,Boolean>,PConsumer {
      void consume(long v0,long v1,long v2,boolean v3);
      @Override
      default void accept(Long v0,Long v1,Long v2,Boolean v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3));
       }
}
interface CuLLLD extends Consumer4<Long,Long,Long,Double>,PConsumer {
      void consume(long v0,long v1,long v2,double v3);
      @Override
      default void accept(Long v0,Long v1,Long v2,Double v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3));
       }
}
interface CuLLLL extends Consumer4<Long,Long,Long,Long>,PConsumer {
      void consume(long v0,long v1,long v2,long v3);
      @Override
      default void accept(Long v0,Long v1,Long v2,Long v3) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3));
       }
}
interface CuIIIII extends Consumer5<Integer,Integer,Integer,Integer,Integer>,PConsumer {
      void consume(int v0,int v1,int v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIIIB extends Consumer5<Integer,Integer,Integer,Integer,Boolean>,PConsumer {
      void consume(int v0,int v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIIID extends Consumer5<Integer,Integer,Integer,Integer,Double>,PConsumer {
      void consume(int v0,int v1,int v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIIIL extends Consumer5<Integer,Integer,Integer,Integer,Long>,PConsumer {
      void consume(int v0,int v1,int v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIIBI extends Consumer5<Integer,Integer,Integer,Boolean,Integer>,PConsumer {
      void consume(int v0,int v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIIBB extends Consumer5<Integer,Integer,Integer,Boolean,Boolean>,PConsumer {
      void consume(int v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIIBD extends Consumer5<Integer,Integer,Integer,Boolean,Double>,PConsumer {
      void consume(int v0,int v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIIBL extends Consumer5<Integer,Integer,Integer,Boolean,Long>,PConsumer {
      void consume(int v0,int v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIIDI extends Consumer5<Integer,Integer,Integer,Double,Integer>,PConsumer {
      void consume(int v0,int v1,int v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIIDB extends Consumer5<Integer,Integer,Integer,Double,Boolean>,PConsumer {
      void consume(int v0,int v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIIDD extends Consumer5<Integer,Integer,Integer,Double,Double>,PConsumer {
      void consume(int v0,int v1,int v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIIDL extends Consumer5<Integer,Integer,Integer,Double,Long>,PConsumer {
      void consume(int v0,int v1,int v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIILI extends Consumer5<Integer,Integer,Integer,Long,Integer>,PConsumer {
      void consume(int v0,int v1,int v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIILB extends Consumer5<Integer,Integer,Integer,Long,Boolean>,PConsumer {
      void consume(int v0,int v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIILD extends Consumer5<Integer,Integer,Integer,Long,Double>,PConsumer {
      void consume(int v0,int v1,int v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIILL extends Consumer5<Integer,Integer,Integer,Long,Long>,PConsumer {
      void consume(int v0,int v1,int v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Integer v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIBII extends Consumer5<Integer,Integer,Boolean,Integer,Integer>,PConsumer {
      void consume(int v0,int v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIBIB extends Consumer5<Integer,Integer,Boolean,Integer,Boolean>,PConsumer {
      void consume(int v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIBID extends Consumer5<Integer,Integer,Boolean,Integer,Double>,PConsumer {
      void consume(int v0,int v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIBIL extends Consumer5<Integer,Integer,Boolean,Integer,Long>,PConsumer {
      void consume(int v0,int v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIBBI extends Consumer5<Integer,Integer,Boolean,Boolean,Integer>,PConsumer {
      void consume(int v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIBBB extends Consumer5<Integer,Integer,Boolean,Boolean,Boolean>,PConsumer {
      void consume(int v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIBBD extends Consumer5<Integer,Integer,Boolean,Boolean,Double>,PConsumer {
      void consume(int v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIBBL extends Consumer5<Integer,Integer,Boolean,Boolean,Long>,PConsumer {
      void consume(int v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIBDI extends Consumer5<Integer,Integer,Boolean,Double,Integer>,PConsumer {
      void consume(int v0,int v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIBDB extends Consumer5<Integer,Integer,Boolean,Double,Boolean>,PConsumer {
      void consume(int v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIBDD extends Consumer5<Integer,Integer,Boolean,Double,Double>,PConsumer {
      void consume(int v0,int v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIBDL extends Consumer5<Integer,Integer,Boolean,Double,Long>,PConsumer {
      void consume(int v0,int v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIBLI extends Consumer5<Integer,Integer,Boolean,Long,Integer>,PConsumer {
      void consume(int v0,int v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIBLB extends Consumer5<Integer,Integer,Boolean,Long,Boolean>,PConsumer {
      void consume(int v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIBLD extends Consumer5<Integer,Integer,Boolean,Long,Double>,PConsumer {
      void consume(int v0,int v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIBLL extends Consumer5<Integer,Integer,Boolean,Long,Long>,PConsumer {
      void consume(int v0,int v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Boolean v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIDII extends Consumer5<Integer,Integer,Double,Integer,Integer>,PConsumer {
      void consume(int v0,int v1,double v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIDIB extends Consumer5<Integer,Integer,Double,Integer,Boolean>,PConsumer {
      void consume(int v0,int v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIDID extends Consumer5<Integer,Integer,Double,Integer,Double>,PConsumer {
      void consume(int v0,int v1,double v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIDIL extends Consumer5<Integer,Integer,Double,Integer,Long>,PConsumer {
      void consume(int v0,int v1,double v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIDBI extends Consumer5<Integer,Integer,Double,Boolean,Integer>,PConsumer {
      void consume(int v0,int v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIDBB extends Consumer5<Integer,Integer,Double,Boolean,Boolean>,PConsumer {
      void consume(int v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIDBD extends Consumer5<Integer,Integer,Double,Boolean,Double>,PConsumer {
      void consume(int v0,int v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIDBL extends Consumer5<Integer,Integer,Double,Boolean,Long>,PConsumer {
      void consume(int v0,int v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIDDI extends Consumer5<Integer,Integer,Double,Double,Integer>,PConsumer {
      void consume(int v0,int v1,double v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIDDB extends Consumer5<Integer,Integer,Double,Double,Boolean>,PConsumer {
      void consume(int v0,int v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIDDD extends Consumer5<Integer,Integer,Double,Double,Double>,PConsumer {
      void consume(int v0,int v1,double v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIDDL extends Consumer5<Integer,Integer,Double,Double,Long>,PConsumer {
      void consume(int v0,int v1,double v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIIDLI extends Consumer5<Integer,Integer,Double,Long,Integer>,PConsumer {
      void consume(int v0,int v1,double v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIIDLB extends Consumer5<Integer,Integer,Double,Long,Boolean>,PConsumer {
      void consume(int v0,int v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIIDLD extends Consumer5<Integer,Integer,Double,Long,Double>,PConsumer {
      void consume(int v0,int v1,double v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIIDLL extends Consumer5<Integer,Integer,Double,Long,Long>,PConsumer {
      void consume(int v0,int v1,double v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Double v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIILII extends Consumer5<Integer,Integer,Long,Integer,Integer>,PConsumer {
      void consume(int v0,int v1,long v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIILIB extends Consumer5<Integer,Integer,Long,Integer,Boolean>,PConsumer {
      void consume(int v0,int v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIILID extends Consumer5<Integer,Integer,Long,Integer,Double>,PConsumer {
      void consume(int v0,int v1,long v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIILIL extends Consumer5<Integer,Integer,Long,Integer,Long>,PConsumer {
      void consume(int v0,int v1,long v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIILBI extends Consumer5<Integer,Integer,Long,Boolean,Integer>,PConsumer {
      void consume(int v0,int v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIILBB extends Consumer5<Integer,Integer,Long,Boolean,Boolean>,PConsumer {
      void consume(int v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIILBD extends Consumer5<Integer,Integer,Long,Boolean,Double>,PConsumer {
      void consume(int v0,int v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIILBL extends Consumer5<Integer,Integer,Long,Boolean,Long>,PConsumer {
      void consume(int v0,int v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIILDI extends Consumer5<Integer,Integer,Long,Double,Integer>,PConsumer {
      void consume(int v0,int v1,long v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIILDB extends Consumer5<Integer,Integer,Long,Double,Boolean>,PConsumer {
      void consume(int v0,int v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIILDD extends Consumer5<Integer,Integer,Long,Double,Double>,PConsumer {
      void consume(int v0,int v1,long v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIILDL extends Consumer5<Integer,Integer,Long,Double,Long>,PConsumer {
      void consume(int v0,int v1,long v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIILLI extends Consumer5<Integer,Integer,Long,Long,Integer>,PConsumer {
      void consume(int v0,int v1,long v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIILLB extends Consumer5<Integer,Integer,Long,Long,Boolean>,PConsumer {
      void consume(int v0,int v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIILLD extends Consumer5<Integer,Integer,Long,Long,Double>,PConsumer {
      void consume(int v0,int v1,long v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIILLL extends Consumer5<Integer,Integer,Long,Long,Long>,PConsumer {
      void consume(int v0,int v1,long v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Integer v1,Long v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBIII extends Consumer5<Integer,Boolean,Integer,Integer,Integer>,PConsumer {
      void consume(int v0,boolean v1,int v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBIIB extends Consumer5<Integer,Boolean,Integer,Integer,Boolean>,PConsumer {
      void consume(int v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBIID extends Consumer5<Integer,Boolean,Integer,Integer,Double>,PConsumer {
      void consume(int v0,boolean v1,int v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBIIL extends Consumer5<Integer,Boolean,Integer,Integer,Long>,PConsumer {
      void consume(int v0,boolean v1,int v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBIBI extends Consumer5<Integer,Boolean,Integer,Boolean,Integer>,PConsumer {
      void consume(int v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBIBB extends Consumer5<Integer,Boolean,Integer,Boolean,Boolean>,PConsumer {
      void consume(int v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBIBD extends Consumer5<Integer,Boolean,Integer,Boolean,Double>,PConsumer {
      void consume(int v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBIBL extends Consumer5<Integer,Boolean,Integer,Boolean,Long>,PConsumer {
      void consume(int v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBIDI extends Consumer5<Integer,Boolean,Integer,Double,Integer>,PConsumer {
      void consume(int v0,boolean v1,int v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBIDB extends Consumer5<Integer,Boolean,Integer,Double,Boolean>,PConsumer {
      void consume(int v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBIDD extends Consumer5<Integer,Boolean,Integer,Double,Double>,PConsumer {
      void consume(int v0,boolean v1,int v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBIDL extends Consumer5<Integer,Boolean,Integer,Double,Long>,PConsumer {
      void consume(int v0,boolean v1,int v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBILI extends Consumer5<Integer,Boolean,Integer,Long,Integer>,PConsumer {
      void consume(int v0,boolean v1,int v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBILB extends Consumer5<Integer,Boolean,Integer,Long,Boolean>,PConsumer {
      void consume(int v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBILD extends Consumer5<Integer,Boolean,Integer,Long,Double>,PConsumer {
      void consume(int v0,boolean v1,int v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBILL extends Consumer5<Integer,Boolean,Integer,Long,Long>,PConsumer {
      void consume(int v0,boolean v1,int v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Integer v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBBII extends Consumer5<Integer,Boolean,Boolean,Integer,Integer>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBBIB extends Consumer5<Integer,Boolean,Boolean,Integer,Boolean>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBBID extends Consumer5<Integer,Boolean,Boolean,Integer,Double>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBBIL extends Consumer5<Integer,Boolean,Boolean,Integer,Long>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBBBI extends Consumer5<Integer,Boolean,Boolean,Boolean,Integer>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBBBB extends Consumer5<Integer,Boolean,Boolean,Boolean,Boolean>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBBBD extends Consumer5<Integer,Boolean,Boolean,Boolean,Double>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBBBL extends Consumer5<Integer,Boolean,Boolean,Boolean,Long>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBBDI extends Consumer5<Integer,Boolean,Boolean,Double,Integer>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBBDB extends Consumer5<Integer,Boolean,Boolean,Double,Boolean>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBBDD extends Consumer5<Integer,Boolean,Boolean,Double,Double>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBBDL extends Consumer5<Integer,Boolean,Boolean,Double,Long>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBBLI extends Consumer5<Integer,Boolean,Boolean,Long,Integer>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBBLB extends Consumer5<Integer,Boolean,Boolean,Long,Boolean>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBBLD extends Consumer5<Integer,Boolean,Boolean,Long,Double>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBBLL extends Consumer5<Integer,Boolean,Boolean,Long,Long>,PConsumer {
      void consume(int v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBDII extends Consumer5<Integer,Boolean,Double,Integer,Integer>,PConsumer {
      void consume(int v0,boolean v1,double v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBDIB extends Consumer5<Integer,Boolean,Double,Integer,Boolean>,PConsumer {
      void consume(int v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBDID extends Consumer5<Integer,Boolean,Double,Integer,Double>,PConsumer {
      void consume(int v0,boolean v1,double v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBDIL extends Consumer5<Integer,Boolean,Double,Integer,Long>,PConsumer {
      void consume(int v0,boolean v1,double v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBDBI extends Consumer5<Integer,Boolean,Double,Boolean,Integer>,PConsumer {
      void consume(int v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBDBB extends Consumer5<Integer,Boolean,Double,Boolean,Boolean>,PConsumer {
      void consume(int v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBDBD extends Consumer5<Integer,Boolean,Double,Boolean,Double>,PConsumer {
      void consume(int v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBDBL extends Consumer5<Integer,Boolean,Double,Boolean,Long>,PConsumer {
      void consume(int v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBDDI extends Consumer5<Integer,Boolean,Double,Double,Integer>,PConsumer {
      void consume(int v0,boolean v1,double v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBDDB extends Consumer5<Integer,Boolean,Double,Double,Boolean>,PConsumer {
      void consume(int v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBDDD extends Consumer5<Integer,Boolean,Double,Double,Double>,PConsumer {
      void consume(int v0,boolean v1,double v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBDDL extends Consumer5<Integer,Boolean,Double,Double,Long>,PConsumer {
      void consume(int v0,boolean v1,double v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBDLI extends Consumer5<Integer,Boolean,Double,Long,Integer>,PConsumer {
      void consume(int v0,boolean v1,double v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBDLB extends Consumer5<Integer,Boolean,Double,Long,Boolean>,PConsumer {
      void consume(int v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBDLD extends Consumer5<Integer,Boolean,Double,Long,Double>,PConsumer {
      void consume(int v0,boolean v1,double v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBDLL extends Consumer5<Integer,Boolean,Double,Long,Long>,PConsumer {
      void consume(int v0,boolean v1,double v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Double v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBLII extends Consumer5<Integer,Boolean,Long,Integer,Integer>,PConsumer {
      void consume(int v0,boolean v1,long v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBLIB extends Consumer5<Integer,Boolean,Long,Integer,Boolean>,PConsumer {
      void consume(int v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBLID extends Consumer5<Integer,Boolean,Long,Integer,Double>,PConsumer {
      void consume(int v0,boolean v1,long v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBLIL extends Consumer5<Integer,Boolean,Long,Integer,Long>,PConsumer {
      void consume(int v0,boolean v1,long v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBLBI extends Consumer5<Integer,Boolean,Long,Boolean,Integer>,PConsumer {
      void consume(int v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBLBB extends Consumer5<Integer,Boolean,Long,Boolean,Boolean>,PConsumer {
      void consume(int v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBLBD extends Consumer5<Integer,Boolean,Long,Boolean,Double>,PConsumer {
      void consume(int v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBLBL extends Consumer5<Integer,Boolean,Long,Boolean,Long>,PConsumer {
      void consume(int v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBLDI extends Consumer5<Integer,Boolean,Long,Double,Integer>,PConsumer {
      void consume(int v0,boolean v1,long v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBLDB extends Consumer5<Integer,Boolean,Long,Double,Boolean>,PConsumer {
      void consume(int v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBLDD extends Consumer5<Integer,Boolean,Long,Double,Double>,PConsumer {
      void consume(int v0,boolean v1,long v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBLDL extends Consumer5<Integer,Boolean,Long,Double,Long>,PConsumer {
      void consume(int v0,boolean v1,long v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIBLLI extends Consumer5<Integer,Boolean,Long,Long,Integer>,PConsumer {
      void consume(int v0,boolean v1,long v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIBLLB extends Consumer5<Integer,Boolean,Long,Long,Boolean>,PConsumer {
      void consume(int v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIBLLD extends Consumer5<Integer,Boolean,Long,Long,Double>,PConsumer {
      void consume(int v0,boolean v1,long v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIBLLL extends Consumer5<Integer,Boolean,Long,Long,Long>,PConsumer {
      void consume(int v0,boolean v1,long v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Boolean v1,Long v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDIII extends Consumer5<Integer,Double,Integer,Integer,Integer>,PConsumer {
      void consume(int v0,double v1,int v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDIIB extends Consumer5<Integer,Double,Integer,Integer,Boolean>,PConsumer {
      void consume(int v0,double v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDIID extends Consumer5<Integer,Double,Integer,Integer,Double>,PConsumer {
      void consume(int v0,double v1,int v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDIIL extends Consumer5<Integer,Double,Integer,Integer,Long>,PConsumer {
      void consume(int v0,double v1,int v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDIBI extends Consumer5<Integer,Double,Integer,Boolean,Integer>,PConsumer {
      void consume(int v0,double v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDIBB extends Consumer5<Integer,Double,Integer,Boolean,Boolean>,PConsumer {
      void consume(int v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDIBD extends Consumer5<Integer,Double,Integer,Boolean,Double>,PConsumer {
      void consume(int v0,double v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDIBL extends Consumer5<Integer,Double,Integer,Boolean,Long>,PConsumer {
      void consume(int v0,double v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDIDI extends Consumer5<Integer,Double,Integer,Double,Integer>,PConsumer {
      void consume(int v0,double v1,int v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDIDB extends Consumer5<Integer,Double,Integer,Double,Boolean>,PConsumer {
      void consume(int v0,double v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDIDD extends Consumer5<Integer,Double,Integer,Double,Double>,PConsumer {
      void consume(int v0,double v1,int v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDIDL extends Consumer5<Integer,Double,Integer,Double,Long>,PConsumer {
      void consume(int v0,double v1,int v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDILI extends Consumer5<Integer,Double,Integer,Long,Integer>,PConsumer {
      void consume(int v0,double v1,int v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDILB extends Consumer5<Integer,Double,Integer,Long,Boolean>,PConsumer {
      void consume(int v0,double v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDILD extends Consumer5<Integer,Double,Integer,Long,Double>,PConsumer {
      void consume(int v0,double v1,int v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDILL extends Consumer5<Integer,Double,Integer,Long,Long>,PConsumer {
      void consume(int v0,double v1,int v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Integer v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDBII extends Consumer5<Integer,Double,Boolean,Integer,Integer>,PConsumer {
      void consume(int v0,double v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDBIB extends Consumer5<Integer,Double,Boolean,Integer,Boolean>,PConsumer {
      void consume(int v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDBID extends Consumer5<Integer,Double,Boolean,Integer,Double>,PConsumer {
      void consume(int v0,double v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDBIL extends Consumer5<Integer,Double,Boolean,Integer,Long>,PConsumer {
      void consume(int v0,double v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDBBI extends Consumer5<Integer,Double,Boolean,Boolean,Integer>,PConsumer {
      void consume(int v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDBBB extends Consumer5<Integer,Double,Boolean,Boolean,Boolean>,PConsumer {
      void consume(int v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDBBD extends Consumer5<Integer,Double,Boolean,Boolean,Double>,PConsumer {
      void consume(int v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDBBL extends Consumer5<Integer,Double,Boolean,Boolean,Long>,PConsumer {
      void consume(int v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDBDI extends Consumer5<Integer,Double,Boolean,Double,Integer>,PConsumer {
      void consume(int v0,double v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDBDB extends Consumer5<Integer,Double,Boolean,Double,Boolean>,PConsumer {
      void consume(int v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDBDD extends Consumer5<Integer,Double,Boolean,Double,Double>,PConsumer {
      void consume(int v0,double v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDBDL extends Consumer5<Integer,Double,Boolean,Double,Long>,PConsumer {
      void consume(int v0,double v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDBLI extends Consumer5<Integer,Double,Boolean,Long,Integer>,PConsumer {
      void consume(int v0,double v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDBLB extends Consumer5<Integer,Double,Boolean,Long,Boolean>,PConsumer {
      void consume(int v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDBLD extends Consumer5<Integer,Double,Boolean,Long,Double>,PConsumer {
      void consume(int v0,double v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDBLL extends Consumer5<Integer,Double,Boolean,Long,Long>,PConsumer {
      void consume(int v0,double v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Boolean v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDDII extends Consumer5<Integer,Double,Double,Integer,Integer>,PConsumer {
      void consume(int v0,double v1,double v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDDIB extends Consumer5<Integer,Double,Double,Integer,Boolean>,PConsumer {
      void consume(int v0,double v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDDID extends Consumer5<Integer,Double,Double,Integer,Double>,PConsumer {
      void consume(int v0,double v1,double v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDDIL extends Consumer5<Integer,Double,Double,Integer,Long>,PConsumer {
      void consume(int v0,double v1,double v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDDBI extends Consumer5<Integer,Double,Double,Boolean,Integer>,PConsumer {
      void consume(int v0,double v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDDBB extends Consumer5<Integer,Double,Double,Boolean,Boolean>,PConsumer {
      void consume(int v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDDBD extends Consumer5<Integer,Double,Double,Boolean,Double>,PConsumer {
      void consume(int v0,double v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDDBL extends Consumer5<Integer,Double,Double,Boolean,Long>,PConsumer {
      void consume(int v0,double v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDDDI extends Consumer5<Integer,Double,Double,Double,Integer>,PConsumer {
      void consume(int v0,double v1,double v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDDDB extends Consumer5<Integer,Double,Double,Double,Boolean>,PConsumer {
      void consume(int v0,double v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDDDD extends Consumer5<Integer,Double,Double,Double,Double>,PConsumer {
      void consume(int v0,double v1,double v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDDDL extends Consumer5<Integer,Double,Double,Double,Long>,PConsumer {
      void consume(int v0,double v1,double v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDDLI extends Consumer5<Integer,Double,Double,Long,Integer>,PConsumer {
      void consume(int v0,double v1,double v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDDLB extends Consumer5<Integer,Double,Double,Long,Boolean>,PConsumer {
      void consume(int v0,double v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDDLD extends Consumer5<Integer,Double,Double,Long,Double>,PConsumer {
      void consume(int v0,double v1,double v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDDLL extends Consumer5<Integer,Double,Double,Long,Long>,PConsumer {
      void consume(int v0,double v1,double v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Double v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDLII extends Consumer5<Integer,Double,Long,Integer,Integer>,PConsumer {
      void consume(int v0,double v1,long v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDLIB extends Consumer5<Integer,Double,Long,Integer,Boolean>,PConsumer {
      void consume(int v0,double v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDLID extends Consumer5<Integer,Double,Long,Integer,Double>,PConsumer {
      void consume(int v0,double v1,long v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDLIL extends Consumer5<Integer,Double,Long,Integer,Long>,PConsumer {
      void consume(int v0,double v1,long v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDLBI extends Consumer5<Integer,Double,Long,Boolean,Integer>,PConsumer {
      void consume(int v0,double v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDLBB extends Consumer5<Integer,Double,Long,Boolean,Boolean>,PConsumer {
      void consume(int v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDLBD extends Consumer5<Integer,Double,Long,Boolean,Double>,PConsumer {
      void consume(int v0,double v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDLBL extends Consumer5<Integer,Double,Long,Boolean,Long>,PConsumer {
      void consume(int v0,double v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDLDI extends Consumer5<Integer,Double,Long,Double,Integer>,PConsumer {
      void consume(int v0,double v1,long v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDLDB extends Consumer5<Integer,Double,Long,Double,Boolean>,PConsumer {
      void consume(int v0,double v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDLDD extends Consumer5<Integer,Double,Long,Double,Double>,PConsumer {
      void consume(int v0,double v1,long v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDLDL extends Consumer5<Integer,Double,Long,Double,Long>,PConsumer {
      void consume(int v0,double v1,long v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuIDLLI extends Consumer5<Integer,Double,Long,Long,Integer>,PConsumer {
      void consume(int v0,double v1,long v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuIDLLB extends Consumer5<Integer,Double,Long,Long,Boolean>,PConsumer {
      void consume(int v0,double v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuIDLLD extends Consumer5<Integer,Double,Long,Long,Double>,PConsumer {
      void consume(int v0,double v1,long v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuIDLLL extends Consumer5<Integer,Double,Long,Long,Long>,PConsumer {
      void consume(int v0,double v1,long v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Double v1,Long v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILIII extends Consumer5<Integer,Long,Integer,Integer,Integer>,PConsumer {
      void consume(int v0,long v1,int v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILIIB extends Consumer5<Integer,Long,Integer,Integer,Boolean>,PConsumer {
      void consume(int v0,long v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILIID extends Consumer5<Integer,Long,Integer,Integer,Double>,PConsumer {
      void consume(int v0,long v1,int v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILIIL extends Consumer5<Integer,Long,Integer,Integer,Long>,PConsumer {
      void consume(int v0,long v1,int v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILIBI extends Consumer5<Integer,Long,Integer,Boolean,Integer>,PConsumer {
      void consume(int v0,long v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILIBB extends Consumer5<Integer,Long,Integer,Boolean,Boolean>,PConsumer {
      void consume(int v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILIBD extends Consumer5<Integer,Long,Integer,Boolean,Double>,PConsumer {
      void consume(int v0,long v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILIBL extends Consumer5<Integer,Long,Integer,Boolean,Long>,PConsumer {
      void consume(int v0,long v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILIDI extends Consumer5<Integer,Long,Integer,Double,Integer>,PConsumer {
      void consume(int v0,long v1,int v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILIDB extends Consumer5<Integer,Long,Integer,Double,Boolean>,PConsumer {
      void consume(int v0,long v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILIDD extends Consumer5<Integer,Long,Integer,Double,Double>,PConsumer {
      void consume(int v0,long v1,int v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILIDL extends Consumer5<Integer,Long,Integer,Double,Long>,PConsumer {
      void consume(int v0,long v1,int v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILILI extends Consumer5<Integer,Long,Integer,Long,Integer>,PConsumer {
      void consume(int v0,long v1,int v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILILB extends Consumer5<Integer,Long,Integer,Long,Boolean>,PConsumer {
      void consume(int v0,long v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILILD extends Consumer5<Integer,Long,Integer,Long,Double>,PConsumer {
      void consume(int v0,long v1,int v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILILL extends Consumer5<Integer,Long,Integer,Long,Long>,PConsumer {
      void consume(int v0,long v1,int v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Integer v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILBII extends Consumer5<Integer,Long,Boolean,Integer,Integer>,PConsumer {
      void consume(int v0,long v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILBIB extends Consumer5<Integer,Long,Boolean,Integer,Boolean>,PConsumer {
      void consume(int v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILBID extends Consumer5<Integer,Long,Boolean,Integer,Double>,PConsumer {
      void consume(int v0,long v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILBIL extends Consumer5<Integer,Long,Boolean,Integer,Long>,PConsumer {
      void consume(int v0,long v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILBBI extends Consumer5<Integer,Long,Boolean,Boolean,Integer>,PConsumer {
      void consume(int v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILBBB extends Consumer5<Integer,Long,Boolean,Boolean,Boolean>,PConsumer {
      void consume(int v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILBBD extends Consumer5<Integer,Long,Boolean,Boolean,Double>,PConsumer {
      void consume(int v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILBBL extends Consumer5<Integer,Long,Boolean,Boolean,Long>,PConsumer {
      void consume(int v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILBDI extends Consumer5<Integer,Long,Boolean,Double,Integer>,PConsumer {
      void consume(int v0,long v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILBDB extends Consumer5<Integer,Long,Boolean,Double,Boolean>,PConsumer {
      void consume(int v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILBDD extends Consumer5<Integer,Long,Boolean,Double,Double>,PConsumer {
      void consume(int v0,long v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILBDL extends Consumer5<Integer,Long,Boolean,Double,Long>,PConsumer {
      void consume(int v0,long v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILBLI extends Consumer5<Integer,Long,Boolean,Long,Integer>,PConsumer {
      void consume(int v0,long v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILBLB extends Consumer5<Integer,Long,Boolean,Long,Boolean>,PConsumer {
      void consume(int v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILBLD extends Consumer5<Integer,Long,Boolean,Long,Double>,PConsumer {
      void consume(int v0,long v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILBLL extends Consumer5<Integer,Long,Boolean,Long,Long>,PConsumer {
      void consume(int v0,long v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Boolean v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILDII extends Consumer5<Integer,Long,Double,Integer,Integer>,PConsumer {
      void consume(int v0,long v1,double v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILDIB extends Consumer5<Integer,Long,Double,Integer,Boolean>,PConsumer {
      void consume(int v0,long v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILDID extends Consumer5<Integer,Long,Double,Integer,Double>,PConsumer {
      void consume(int v0,long v1,double v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILDIL extends Consumer5<Integer,Long,Double,Integer,Long>,PConsumer {
      void consume(int v0,long v1,double v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILDBI extends Consumer5<Integer,Long,Double,Boolean,Integer>,PConsumer {
      void consume(int v0,long v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILDBB extends Consumer5<Integer,Long,Double,Boolean,Boolean>,PConsumer {
      void consume(int v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILDBD extends Consumer5<Integer,Long,Double,Boolean,Double>,PConsumer {
      void consume(int v0,long v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILDBL extends Consumer5<Integer,Long,Double,Boolean,Long>,PConsumer {
      void consume(int v0,long v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILDDI extends Consumer5<Integer,Long,Double,Double,Integer>,PConsumer {
      void consume(int v0,long v1,double v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILDDB extends Consumer5<Integer,Long,Double,Double,Boolean>,PConsumer {
      void consume(int v0,long v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILDDD extends Consumer5<Integer,Long,Double,Double,Double>,PConsumer {
      void consume(int v0,long v1,double v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILDDL extends Consumer5<Integer,Long,Double,Double,Long>,PConsumer {
      void consume(int v0,long v1,double v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILDLI extends Consumer5<Integer,Long,Double,Long,Integer>,PConsumer {
      void consume(int v0,long v1,double v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILDLB extends Consumer5<Integer,Long,Double,Long,Boolean>,PConsumer {
      void consume(int v0,long v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILDLD extends Consumer5<Integer,Long,Double,Long,Double>,PConsumer {
      void consume(int v0,long v1,double v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILDLL extends Consumer5<Integer,Long,Double,Long,Long>,PConsumer {
      void consume(int v0,long v1,double v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Double v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILLII extends Consumer5<Integer,Long,Long,Integer,Integer>,PConsumer {
      void consume(int v0,long v1,long v2,int v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Integer v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILLIB extends Consumer5<Integer,Long,Long,Integer,Boolean>,PConsumer {
      void consume(int v0,long v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Integer v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILLID extends Consumer5<Integer,Long,Long,Integer,Double>,PConsumer {
      void consume(int v0,long v1,long v2,int v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Integer v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILLIL extends Consumer5<Integer,Long,Long,Integer,Long>,PConsumer {
      void consume(int v0,long v1,long v2,int v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Integer v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILLBI extends Consumer5<Integer,Long,Long,Boolean,Integer>,PConsumer {
      void consume(int v0,long v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Boolean v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILLBB extends Consumer5<Integer,Long,Long,Boolean,Boolean>,PConsumer {
      void consume(int v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILLBD extends Consumer5<Integer,Long,Long,Boolean,Double>,PConsumer {
      void consume(int v0,long v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Boolean v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILLBL extends Consumer5<Integer,Long,Long,Boolean,Long>,PConsumer {
      void consume(int v0,long v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Boolean v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILLDI extends Consumer5<Integer,Long,Long,Double,Integer>,PConsumer {
      void consume(int v0,long v1,long v2,double v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Double v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILLDB extends Consumer5<Integer,Long,Long,Double,Boolean>,PConsumer {
      void consume(int v0,long v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Double v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILLDD extends Consumer5<Integer,Long,Long,Double,Double>,PConsumer {
      void consume(int v0,long v1,long v2,double v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Double v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILLDL extends Consumer5<Integer,Long,Long,Double,Long>,PConsumer {
      void consume(int v0,long v1,long v2,double v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Double v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuILLLI extends Consumer5<Integer,Long,Long,Long,Integer>,PConsumer {
      void consume(int v0,long v1,long v2,long v3,int v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Long v3,Integer v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuILLLB extends Consumer5<Integer,Long,Long,Long,Boolean>,PConsumer {
      void consume(int v0,long v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Long v3,Boolean v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuILLLD extends Consumer5<Integer,Long,Long,Long,Double>,PConsumer {
      void consume(int v0,long v1,long v2,long v3,double v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Long v3,Double v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuILLLL extends Consumer5<Integer,Long,Long,Long,Long>,PConsumer {
      void consume(int v0,long v1,long v2,long v3,long v4);
      @Override
      default void accept(Integer v0,Long v1,Long v2,Long v3,Long v4) {
          consume((int)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIIII extends Consumer5<Boolean,Integer,Integer,Integer,Integer>,PConsumer {
      void consume(boolean v0,int v1,int v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIIIB extends Consumer5<Boolean,Integer,Integer,Integer,Boolean>,PConsumer {
      void consume(boolean v0,int v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIIID extends Consumer5<Boolean,Integer,Integer,Integer,Double>,PConsumer {
      void consume(boolean v0,int v1,int v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIIIL extends Consumer5<Boolean,Integer,Integer,Integer,Long>,PConsumer {
      void consume(boolean v0,int v1,int v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIIBI extends Consumer5<Boolean,Integer,Integer,Boolean,Integer>,PConsumer {
      void consume(boolean v0,int v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIIBB extends Consumer5<Boolean,Integer,Integer,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIIBD extends Consumer5<Boolean,Integer,Integer,Boolean,Double>,PConsumer {
      void consume(boolean v0,int v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIIBL extends Consumer5<Boolean,Integer,Integer,Boolean,Long>,PConsumer {
      void consume(boolean v0,int v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIIDI extends Consumer5<Boolean,Integer,Integer,Double,Integer>,PConsumer {
      void consume(boolean v0,int v1,int v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIIDB extends Consumer5<Boolean,Integer,Integer,Double,Boolean>,PConsumer {
      void consume(boolean v0,int v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIIDD extends Consumer5<Boolean,Integer,Integer,Double,Double>,PConsumer {
      void consume(boolean v0,int v1,int v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIIDL extends Consumer5<Boolean,Integer,Integer,Double,Long>,PConsumer {
      void consume(boolean v0,int v1,int v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIILI extends Consumer5<Boolean,Integer,Integer,Long,Integer>,PConsumer {
      void consume(boolean v0,int v1,int v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIILB extends Consumer5<Boolean,Integer,Integer,Long,Boolean>,PConsumer {
      void consume(boolean v0,int v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIILD extends Consumer5<Boolean,Integer,Integer,Long,Double>,PConsumer {
      void consume(boolean v0,int v1,int v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIILL extends Consumer5<Boolean,Integer,Integer,Long,Long>,PConsumer {
      void consume(boolean v0,int v1,int v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Integer v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIBII extends Consumer5<Boolean,Integer,Boolean,Integer,Integer>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIBIB extends Consumer5<Boolean,Integer,Boolean,Integer,Boolean>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIBID extends Consumer5<Boolean,Integer,Boolean,Integer,Double>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIBIL extends Consumer5<Boolean,Integer,Boolean,Integer,Long>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIBBI extends Consumer5<Boolean,Integer,Boolean,Boolean,Integer>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIBBB extends Consumer5<Boolean,Integer,Boolean,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIBBD extends Consumer5<Boolean,Integer,Boolean,Boolean,Double>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIBBL extends Consumer5<Boolean,Integer,Boolean,Boolean,Long>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIBDI extends Consumer5<Boolean,Integer,Boolean,Double,Integer>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIBDB extends Consumer5<Boolean,Integer,Boolean,Double,Boolean>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIBDD extends Consumer5<Boolean,Integer,Boolean,Double,Double>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIBDL extends Consumer5<Boolean,Integer,Boolean,Double,Long>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIBLI extends Consumer5<Boolean,Integer,Boolean,Long,Integer>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIBLB extends Consumer5<Boolean,Integer,Boolean,Long,Boolean>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIBLD extends Consumer5<Boolean,Integer,Boolean,Long,Double>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIBLL extends Consumer5<Boolean,Integer,Boolean,Long,Long>,PConsumer {
      void consume(boolean v0,int v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Boolean v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIDII extends Consumer5<Boolean,Integer,Double,Integer,Integer>,PConsumer {
      void consume(boolean v0,int v1,double v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIDIB extends Consumer5<Boolean,Integer,Double,Integer,Boolean>,PConsumer {
      void consume(boolean v0,int v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIDID extends Consumer5<Boolean,Integer,Double,Integer,Double>,PConsumer {
      void consume(boolean v0,int v1,double v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIDIL extends Consumer5<Boolean,Integer,Double,Integer,Long>,PConsumer {
      void consume(boolean v0,int v1,double v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIDBI extends Consumer5<Boolean,Integer,Double,Boolean,Integer>,PConsumer {
      void consume(boolean v0,int v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIDBB extends Consumer5<Boolean,Integer,Double,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIDBD extends Consumer5<Boolean,Integer,Double,Boolean,Double>,PConsumer {
      void consume(boolean v0,int v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIDBL extends Consumer5<Boolean,Integer,Double,Boolean,Long>,PConsumer {
      void consume(boolean v0,int v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIDDI extends Consumer5<Boolean,Integer,Double,Double,Integer>,PConsumer {
      void consume(boolean v0,int v1,double v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIDDB extends Consumer5<Boolean,Integer,Double,Double,Boolean>,PConsumer {
      void consume(boolean v0,int v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIDDD extends Consumer5<Boolean,Integer,Double,Double,Double>,PConsumer {
      void consume(boolean v0,int v1,double v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIDDL extends Consumer5<Boolean,Integer,Double,Double,Long>,PConsumer {
      void consume(boolean v0,int v1,double v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBIDLI extends Consumer5<Boolean,Integer,Double,Long,Integer>,PConsumer {
      void consume(boolean v0,int v1,double v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBIDLB extends Consumer5<Boolean,Integer,Double,Long,Boolean>,PConsumer {
      void consume(boolean v0,int v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBIDLD extends Consumer5<Boolean,Integer,Double,Long,Double>,PConsumer {
      void consume(boolean v0,int v1,double v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBIDLL extends Consumer5<Boolean,Integer,Double,Long,Long>,PConsumer {
      void consume(boolean v0,int v1,double v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Double v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBILII extends Consumer5<Boolean,Integer,Long,Integer,Integer>,PConsumer {
      void consume(boolean v0,int v1,long v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBILIB extends Consumer5<Boolean,Integer,Long,Integer,Boolean>,PConsumer {
      void consume(boolean v0,int v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBILID extends Consumer5<Boolean,Integer,Long,Integer,Double>,PConsumer {
      void consume(boolean v0,int v1,long v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBILIL extends Consumer5<Boolean,Integer,Long,Integer,Long>,PConsumer {
      void consume(boolean v0,int v1,long v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBILBI extends Consumer5<Boolean,Integer,Long,Boolean,Integer>,PConsumer {
      void consume(boolean v0,int v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBILBB extends Consumer5<Boolean,Integer,Long,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBILBD extends Consumer5<Boolean,Integer,Long,Boolean,Double>,PConsumer {
      void consume(boolean v0,int v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBILBL extends Consumer5<Boolean,Integer,Long,Boolean,Long>,PConsumer {
      void consume(boolean v0,int v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBILDI extends Consumer5<Boolean,Integer,Long,Double,Integer>,PConsumer {
      void consume(boolean v0,int v1,long v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBILDB extends Consumer5<Boolean,Integer,Long,Double,Boolean>,PConsumer {
      void consume(boolean v0,int v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBILDD extends Consumer5<Boolean,Integer,Long,Double,Double>,PConsumer {
      void consume(boolean v0,int v1,long v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBILDL extends Consumer5<Boolean,Integer,Long,Double,Long>,PConsumer {
      void consume(boolean v0,int v1,long v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBILLI extends Consumer5<Boolean,Integer,Long,Long,Integer>,PConsumer {
      void consume(boolean v0,int v1,long v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBILLB extends Consumer5<Boolean,Integer,Long,Long,Boolean>,PConsumer {
      void consume(boolean v0,int v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBILLD extends Consumer5<Boolean,Integer,Long,Long,Double>,PConsumer {
      void consume(boolean v0,int v1,long v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBILLL extends Consumer5<Boolean,Integer,Long,Long,Long>,PConsumer {
      void consume(boolean v0,int v1,long v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Integer v1,Long v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBIII extends Consumer5<Boolean,Boolean,Integer,Integer,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBIIB extends Consumer5<Boolean,Boolean,Integer,Integer,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBIID extends Consumer5<Boolean,Boolean,Integer,Integer,Double>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBIIL extends Consumer5<Boolean,Boolean,Integer,Integer,Long>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBIBI extends Consumer5<Boolean,Boolean,Integer,Boolean,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBIBB extends Consumer5<Boolean,Boolean,Integer,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBIBD extends Consumer5<Boolean,Boolean,Integer,Boolean,Double>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBIBL extends Consumer5<Boolean,Boolean,Integer,Boolean,Long>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBIDI extends Consumer5<Boolean,Boolean,Integer,Double,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBIDB extends Consumer5<Boolean,Boolean,Integer,Double,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBIDD extends Consumer5<Boolean,Boolean,Integer,Double,Double>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBIDL extends Consumer5<Boolean,Boolean,Integer,Double,Long>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBILI extends Consumer5<Boolean,Boolean,Integer,Long,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBILB extends Consumer5<Boolean,Boolean,Integer,Long,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBILD extends Consumer5<Boolean,Boolean,Integer,Long,Double>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBILL extends Consumer5<Boolean,Boolean,Integer,Long,Long>,PConsumer {
      void consume(boolean v0,boolean v1,int v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Integer v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBBII extends Consumer5<Boolean,Boolean,Boolean,Integer,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBBIB extends Consumer5<Boolean,Boolean,Boolean,Integer,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBBID extends Consumer5<Boolean,Boolean,Boolean,Integer,Double>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBBIL extends Consumer5<Boolean,Boolean,Boolean,Integer,Long>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBBBI extends Consumer5<Boolean,Boolean,Boolean,Boolean,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBBBB extends Consumer5<Boolean,Boolean,Boolean,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBBBD extends Consumer5<Boolean,Boolean,Boolean,Boolean,Double>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBBBL extends Consumer5<Boolean,Boolean,Boolean,Boolean,Long>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBBDI extends Consumer5<Boolean,Boolean,Boolean,Double,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBBDB extends Consumer5<Boolean,Boolean,Boolean,Double,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBBDD extends Consumer5<Boolean,Boolean,Boolean,Double,Double>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBBDL extends Consumer5<Boolean,Boolean,Boolean,Double,Long>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBBLI extends Consumer5<Boolean,Boolean,Boolean,Long,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBBLB extends Consumer5<Boolean,Boolean,Boolean,Long,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBBLD extends Consumer5<Boolean,Boolean,Boolean,Long,Double>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBBLL extends Consumer5<Boolean,Boolean,Boolean,Long,Long>,PConsumer {
      void consume(boolean v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBDII extends Consumer5<Boolean,Boolean,Double,Integer,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBDIB extends Consumer5<Boolean,Boolean,Double,Integer,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBDID extends Consumer5<Boolean,Boolean,Double,Integer,Double>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBDIL extends Consumer5<Boolean,Boolean,Double,Integer,Long>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBDBI extends Consumer5<Boolean,Boolean,Double,Boolean,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBDBB extends Consumer5<Boolean,Boolean,Double,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBDBD extends Consumer5<Boolean,Boolean,Double,Boolean,Double>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBDBL extends Consumer5<Boolean,Boolean,Double,Boolean,Long>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBDDI extends Consumer5<Boolean,Boolean,Double,Double,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBDDB extends Consumer5<Boolean,Boolean,Double,Double,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBDDD extends Consumer5<Boolean,Boolean,Double,Double,Double>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBDDL extends Consumer5<Boolean,Boolean,Double,Double,Long>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBDLI extends Consumer5<Boolean,Boolean,Double,Long,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBDLB extends Consumer5<Boolean,Boolean,Double,Long,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBDLD extends Consumer5<Boolean,Boolean,Double,Long,Double>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBDLL extends Consumer5<Boolean,Boolean,Double,Long,Long>,PConsumer {
      void consume(boolean v0,boolean v1,double v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Double v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBLII extends Consumer5<Boolean,Boolean,Long,Integer,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBLIB extends Consumer5<Boolean,Boolean,Long,Integer,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBLID extends Consumer5<Boolean,Boolean,Long,Integer,Double>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBLIL extends Consumer5<Boolean,Boolean,Long,Integer,Long>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBLBI extends Consumer5<Boolean,Boolean,Long,Boolean,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBLBB extends Consumer5<Boolean,Boolean,Long,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBLBD extends Consumer5<Boolean,Boolean,Long,Boolean,Double>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBLBL extends Consumer5<Boolean,Boolean,Long,Boolean,Long>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBLDI extends Consumer5<Boolean,Boolean,Long,Double,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBLDB extends Consumer5<Boolean,Boolean,Long,Double,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBLDD extends Consumer5<Boolean,Boolean,Long,Double,Double>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBLDL extends Consumer5<Boolean,Boolean,Long,Double,Long>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBBLLI extends Consumer5<Boolean,Boolean,Long,Long,Integer>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBBLLB extends Consumer5<Boolean,Boolean,Long,Long,Boolean>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBBLLD extends Consumer5<Boolean,Boolean,Long,Long,Double>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBBLLL extends Consumer5<Boolean,Boolean,Long,Long,Long>,PConsumer {
      void consume(boolean v0,boolean v1,long v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Boolean v1,Long v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDIII extends Consumer5<Boolean,Double,Integer,Integer,Integer>,PConsumer {
      void consume(boolean v0,double v1,int v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDIIB extends Consumer5<Boolean,Double,Integer,Integer,Boolean>,PConsumer {
      void consume(boolean v0,double v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDIID extends Consumer5<Boolean,Double,Integer,Integer,Double>,PConsumer {
      void consume(boolean v0,double v1,int v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDIIL extends Consumer5<Boolean,Double,Integer,Integer,Long>,PConsumer {
      void consume(boolean v0,double v1,int v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDIBI extends Consumer5<Boolean,Double,Integer,Boolean,Integer>,PConsumer {
      void consume(boolean v0,double v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDIBB extends Consumer5<Boolean,Double,Integer,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDIBD extends Consumer5<Boolean,Double,Integer,Boolean,Double>,PConsumer {
      void consume(boolean v0,double v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDIBL extends Consumer5<Boolean,Double,Integer,Boolean,Long>,PConsumer {
      void consume(boolean v0,double v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDIDI extends Consumer5<Boolean,Double,Integer,Double,Integer>,PConsumer {
      void consume(boolean v0,double v1,int v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDIDB extends Consumer5<Boolean,Double,Integer,Double,Boolean>,PConsumer {
      void consume(boolean v0,double v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDIDD extends Consumer5<Boolean,Double,Integer,Double,Double>,PConsumer {
      void consume(boolean v0,double v1,int v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDIDL extends Consumer5<Boolean,Double,Integer,Double,Long>,PConsumer {
      void consume(boolean v0,double v1,int v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDILI extends Consumer5<Boolean,Double,Integer,Long,Integer>,PConsumer {
      void consume(boolean v0,double v1,int v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDILB extends Consumer5<Boolean,Double,Integer,Long,Boolean>,PConsumer {
      void consume(boolean v0,double v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDILD extends Consumer5<Boolean,Double,Integer,Long,Double>,PConsumer {
      void consume(boolean v0,double v1,int v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDILL extends Consumer5<Boolean,Double,Integer,Long,Long>,PConsumer {
      void consume(boolean v0,double v1,int v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Integer v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDBII extends Consumer5<Boolean,Double,Boolean,Integer,Integer>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDBIB extends Consumer5<Boolean,Double,Boolean,Integer,Boolean>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDBID extends Consumer5<Boolean,Double,Boolean,Integer,Double>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDBIL extends Consumer5<Boolean,Double,Boolean,Integer,Long>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDBBI extends Consumer5<Boolean,Double,Boolean,Boolean,Integer>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDBBB extends Consumer5<Boolean,Double,Boolean,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDBBD extends Consumer5<Boolean,Double,Boolean,Boolean,Double>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDBBL extends Consumer5<Boolean,Double,Boolean,Boolean,Long>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDBDI extends Consumer5<Boolean,Double,Boolean,Double,Integer>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDBDB extends Consumer5<Boolean,Double,Boolean,Double,Boolean>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDBDD extends Consumer5<Boolean,Double,Boolean,Double,Double>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDBDL extends Consumer5<Boolean,Double,Boolean,Double,Long>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDBLI extends Consumer5<Boolean,Double,Boolean,Long,Integer>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDBLB extends Consumer5<Boolean,Double,Boolean,Long,Boolean>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDBLD extends Consumer5<Boolean,Double,Boolean,Long,Double>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDBLL extends Consumer5<Boolean,Double,Boolean,Long,Long>,PConsumer {
      void consume(boolean v0,double v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Boolean v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDDII extends Consumer5<Boolean,Double,Double,Integer,Integer>,PConsumer {
      void consume(boolean v0,double v1,double v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDDIB extends Consumer5<Boolean,Double,Double,Integer,Boolean>,PConsumer {
      void consume(boolean v0,double v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDDID extends Consumer5<Boolean,Double,Double,Integer,Double>,PConsumer {
      void consume(boolean v0,double v1,double v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDDIL extends Consumer5<Boolean,Double,Double,Integer,Long>,PConsumer {
      void consume(boolean v0,double v1,double v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDDBI extends Consumer5<Boolean,Double,Double,Boolean,Integer>,PConsumer {
      void consume(boolean v0,double v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDDBB extends Consumer5<Boolean,Double,Double,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDDBD extends Consumer5<Boolean,Double,Double,Boolean,Double>,PConsumer {
      void consume(boolean v0,double v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDDBL extends Consumer5<Boolean,Double,Double,Boolean,Long>,PConsumer {
      void consume(boolean v0,double v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDDDI extends Consumer5<Boolean,Double,Double,Double,Integer>,PConsumer {
      void consume(boolean v0,double v1,double v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDDDB extends Consumer5<Boolean,Double,Double,Double,Boolean>,PConsumer {
      void consume(boolean v0,double v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDDDD extends Consumer5<Boolean,Double,Double,Double,Double>,PConsumer {
      void consume(boolean v0,double v1,double v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDDDL extends Consumer5<Boolean,Double,Double,Double,Long>,PConsumer {
      void consume(boolean v0,double v1,double v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDDLI extends Consumer5<Boolean,Double,Double,Long,Integer>,PConsumer {
      void consume(boolean v0,double v1,double v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDDLB extends Consumer5<Boolean,Double,Double,Long,Boolean>,PConsumer {
      void consume(boolean v0,double v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDDLD extends Consumer5<Boolean,Double,Double,Long,Double>,PConsumer {
      void consume(boolean v0,double v1,double v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDDLL extends Consumer5<Boolean,Double,Double,Long,Long>,PConsumer {
      void consume(boolean v0,double v1,double v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Double v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDLII extends Consumer5<Boolean,Double,Long,Integer,Integer>,PConsumer {
      void consume(boolean v0,double v1,long v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDLIB extends Consumer5<Boolean,Double,Long,Integer,Boolean>,PConsumer {
      void consume(boolean v0,double v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDLID extends Consumer5<Boolean,Double,Long,Integer,Double>,PConsumer {
      void consume(boolean v0,double v1,long v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDLIL extends Consumer5<Boolean,Double,Long,Integer,Long>,PConsumer {
      void consume(boolean v0,double v1,long v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDLBI extends Consumer5<Boolean,Double,Long,Boolean,Integer>,PConsumer {
      void consume(boolean v0,double v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDLBB extends Consumer5<Boolean,Double,Long,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDLBD extends Consumer5<Boolean,Double,Long,Boolean,Double>,PConsumer {
      void consume(boolean v0,double v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDLBL extends Consumer5<Boolean,Double,Long,Boolean,Long>,PConsumer {
      void consume(boolean v0,double v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDLDI extends Consumer5<Boolean,Double,Long,Double,Integer>,PConsumer {
      void consume(boolean v0,double v1,long v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDLDB extends Consumer5<Boolean,Double,Long,Double,Boolean>,PConsumer {
      void consume(boolean v0,double v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDLDD extends Consumer5<Boolean,Double,Long,Double,Double>,PConsumer {
      void consume(boolean v0,double v1,long v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDLDL extends Consumer5<Boolean,Double,Long,Double,Long>,PConsumer {
      void consume(boolean v0,double v1,long v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBDLLI extends Consumer5<Boolean,Double,Long,Long,Integer>,PConsumer {
      void consume(boolean v0,double v1,long v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBDLLB extends Consumer5<Boolean,Double,Long,Long,Boolean>,PConsumer {
      void consume(boolean v0,double v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBDLLD extends Consumer5<Boolean,Double,Long,Long,Double>,PConsumer {
      void consume(boolean v0,double v1,long v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBDLLL extends Consumer5<Boolean,Double,Long,Long,Long>,PConsumer {
      void consume(boolean v0,double v1,long v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Double v1,Long v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLIII extends Consumer5<Boolean,Long,Integer,Integer,Integer>,PConsumer {
      void consume(boolean v0,long v1,int v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLIIB extends Consumer5<Boolean,Long,Integer,Integer,Boolean>,PConsumer {
      void consume(boolean v0,long v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLIID extends Consumer5<Boolean,Long,Integer,Integer,Double>,PConsumer {
      void consume(boolean v0,long v1,int v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLIIL extends Consumer5<Boolean,Long,Integer,Integer,Long>,PConsumer {
      void consume(boolean v0,long v1,int v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLIBI extends Consumer5<Boolean,Long,Integer,Boolean,Integer>,PConsumer {
      void consume(boolean v0,long v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLIBB extends Consumer5<Boolean,Long,Integer,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLIBD extends Consumer5<Boolean,Long,Integer,Boolean,Double>,PConsumer {
      void consume(boolean v0,long v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLIBL extends Consumer5<Boolean,Long,Integer,Boolean,Long>,PConsumer {
      void consume(boolean v0,long v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLIDI extends Consumer5<Boolean,Long,Integer,Double,Integer>,PConsumer {
      void consume(boolean v0,long v1,int v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLIDB extends Consumer5<Boolean,Long,Integer,Double,Boolean>,PConsumer {
      void consume(boolean v0,long v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLIDD extends Consumer5<Boolean,Long,Integer,Double,Double>,PConsumer {
      void consume(boolean v0,long v1,int v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLIDL extends Consumer5<Boolean,Long,Integer,Double,Long>,PConsumer {
      void consume(boolean v0,long v1,int v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLILI extends Consumer5<Boolean,Long,Integer,Long,Integer>,PConsumer {
      void consume(boolean v0,long v1,int v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLILB extends Consumer5<Boolean,Long,Integer,Long,Boolean>,PConsumer {
      void consume(boolean v0,long v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLILD extends Consumer5<Boolean,Long,Integer,Long,Double>,PConsumer {
      void consume(boolean v0,long v1,int v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLILL extends Consumer5<Boolean,Long,Integer,Long,Long>,PConsumer {
      void consume(boolean v0,long v1,int v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Integer v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLBII extends Consumer5<Boolean,Long,Boolean,Integer,Integer>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLBIB extends Consumer5<Boolean,Long,Boolean,Integer,Boolean>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLBID extends Consumer5<Boolean,Long,Boolean,Integer,Double>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLBIL extends Consumer5<Boolean,Long,Boolean,Integer,Long>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLBBI extends Consumer5<Boolean,Long,Boolean,Boolean,Integer>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLBBB extends Consumer5<Boolean,Long,Boolean,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLBBD extends Consumer5<Boolean,Long,Boolean,Boolean,Double>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLBBL extends Consumer5<Boolean,Long,Boolean,Boolean,Long>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLBDI extends Consumer5<Boolean,Long,Boolean,Double,Integer>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLBDB extends Consumer5<Boolean,Long,Boolean,Double,Boolean>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLBDD extends Consumer5<Boolean,Long,Boolean,Double,Double>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLBDL extends Consumer5<Boolean,Long,Boolean,Double,Long>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLBLI extends Consumer5<Boolean,Long,Boolean,Long,Integer>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLBLB extends Consumer5<Boolean,Long,Boolean,Long,Boolean>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLBLD extends Consumer5<Boolean,Long,Boolean,Long,Double>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLBLL extends Consumer5<Boolean,Long,Boolean,Long,Long>,PConsumer {
      void consume(boolean v0,long v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Boolean v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLDII extends Consumer5<Boolean,Long,Double,Integer,Integer>,PConsumer {
      void consume(boolean v0,long v1,double v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLDIB extends Consumer5<Boolean,Long,Double,Integer,Boolean>,PConsumer {
      void consume(boolean v0,long v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLDID extends Consumer5<Boolean,Long,Double,Integer,Double>,PConsumer {
      void consume(boolean v0,long v1,double v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLDIL extends Consumer5<Boolean,Long,Double,Integer,Long>,PConsumer {
      void consume(boolean v0,long v1,double v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLDBI extends Consumer5<Boolean,Long,Double,Boolean,Integer>,PConsumer {
      void consume(boolean v0,long v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLDBB extends Consumer5<Boolean,Long,Double,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLDBD extends Consumer5<Boolean,Long,Double,Boolean,Double>,PConsumer {
      void consume(boolean v0,long v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLDBL extends Consumer5<Boolean,Long,Double,Boolean,Long>,PConsumer {
      void consume(boolean v0,long v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLDDI extends Consumer5<Boolean,Long,Double,Double,Integer>,PConsumer {
      void consume(boolean v0,long v1,double v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLDDB extends Consumer5<Boolean,Long,Double,Double,Boolean>,PConsumer {
      void consume(boolean v0,long v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLDDD extends Consumer5<Boolean,Long,Double,Double,Double>,PConsumer {
      void consume(boolean v0,long v1,double v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLDDL extends Consumer5<Boolean,Long,Double,Double,Long>,PConsumer {
      void consume(boolean v0,long v1,double v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLDLI extends Consumer5<Boolean,Long,Double,Long,Integer>,PConsumer {
      void consume(boolean v0,long v1,double v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLDLB extends Consumer5<Boolean,Long,Double,Long,Boolean>,PConsumer {
      void consume(boolean v0,long v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLDLD extends Consumer5<Boolean,Long,Double,Long,Double>,PConsumer {
      void consume(boolean v0,long v1,double v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLDLL extends Consumer5<Boolean,Long,Double,Long,Long>,PConsumer {
      void consume(boolean v0,long v1,double v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Double v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLLII extends Consumer5<Boolean,Long,Long,Integer,Integer>,PConsumer {
      void consume(boolean v0,long v1,long v2,int v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Integer v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLLIB extends Consumer5<Boolean,Long,Long,Integer,Boolean>,PConsumer {
      void consume(boolean v0,long v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Integer v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLLID extends Consumer5<Boolean,Long,Long,Integer,Double>,PConsumer {
      void consume(boolean v0,long v1,long v2,int v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Integer v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLLIL extends Consumer5<Boolean,Long,Long,Integer,Long>,PConsumer {
      void consume(boolean v0,long v1,long v2,int v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Integer v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLLBI extends Consumer5<Boolean,Long,Long,Boolean,Integer>,PConsumer {
      void consume(boolean v0,long v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Boolean v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLLBB extends Consumer5<Boolean,Long,Long,Boolean,Boolean>,PConsumer {
      void consume(boolean v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLLBD extends Consumer5<Boolean,Long,Long,Boolean,Double>,PConsumer {
      void consume(boolean v0,long v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Boolean v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLLBL extends Consumer5<Boolean,Long,Long,Boolean,Long>,PConsumer {
      void consume(boolean v0,long v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Boolean v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLLDI extends Consumer5<Boolean,Long,Long,Double,Integer>,PConsumer {
      void consume(boolean v0,long v1,long v2,double v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Double v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLLDB extends Consumer5<Boolean,Long,Long,Double,Boolean>,PConsumer {
      void consume(boolean v0,long v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Double v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLLDD extends Consumer5<Boolean,Long,Long,Double,Double>,PConsumer {
      void consume(boolean v0,long v1,long v2,double v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Double v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLLDL extends Consumer5<Boolean,Long,Long,Double,Long>,PConsumer {
      void consume(boolean v0,long v1,long v2,double v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Double v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuBLLLI extends Consumer5<Boolean,Long,Long,Long,Integer>,PConsumer {
      void consume(boolean v0,long v1,long v2,long v3,int v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Long v3,Integer v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuBLLLB extends Consumer5<Boolean,Long,Long,Long,Boolean>,PConsumer {
      void consume(boolean v0,long v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Long v3,Boolean v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuBLLLD extends Consumer5<Boolean,Long,Long,Long,Double>,PConsumer {
      void consume(boolean v0,long v1,long v2,long v3,double v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Long v3,Double v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuBLLLL extends Consumer5<Boolean,Long,Long,Long,Long>,PConsumer {
      void consume(boolean v0,long v1,long v2,long v3,long v4);
      @Override
      default void accept(Boolean v0,Long v1,Long v2,Long v3,Long v4) {
          consume((boolean)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIIII extends Consumer5<Double,Integer,Integer,Integer,Integer>,PConsumer {
      void consume(double v0,int v1,int v2,int v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIIIB extends Consumer5<Double,Integer,Integer,Integer,Boolean>,PConsumer {
      void consume(double v0,int v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIIID extends Consumer5<Double,Integer,Integer,Integer,Double>,PConsumer {
      void consume(double v0,int v1,int v2,int v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIIIL extends Consumer5<Double,Integer,Integer,Integer,Long>,PConsumer {
      void consume(double v0,int v1,int v2,int v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIIBI extends Consumer5<Double,Integer,Integer,Boolean,Integer>,PConsumer {
      void consume(double v0,int v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIIBB extends Consumer5<Double,Integer,Integer,Boolean,Boolean>,PConsumer {
      void consume(double v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIIBD extends Consumer5<Double,Integer,Integer,Boolean,Double>,PConsumer {
      void consume(double v0,int v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIIBL extends Consumer5<Double,Integer,Integer,Boolean,Long>,PConsumer {
      void consume(double v0,int v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIIDI extends Consumer5<Double,Integer,Integer,Double,Integer>,PConsumer {
      void consume(double v0,int v1,int v2,double v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIIDB extends Consumer5<Double,Integer,Integer,Double,Boolean>,PConsumer {
      void consume(double v0,int v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIIDD extends Consumer5<Double,Integer,Integer,Double,Double>,PConsumer {
      void consume(double v0,int v1,int v2,double v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIIDL extends Consumer5<Double,Integer,Integer,Double,Long>,PConsumer {
      void consume(double v0,int v1,int v2,double v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIILI extends Consumer5<Double,Integer,Integer,Long,Integer>,PConsumer {
      void consume(double v0,int v1,int v2,long v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIILB extends Consumer5<Double,Integer,Integer,Long,Boolean>,PConsumer {
      void consume(double v0,int v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIILD extends Consumer5<Double,Integer,Integer,Long,Double>,PConsumer {
      void consume(double v0,int v1,int v2,long v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIILL extends Consumer5<Double,Integer,Integer,Long,Long>,PConsumer {
      void consume(double v0,int v1,int v2,long v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Integer v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIBII extends Consumer5<Double,Integer,Boolean,Integer,Integer>,PConsumer {
      void consume(double v0,int v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIBIB extends Consumer5<Double,Integer,Boolean,Integer,Boolean>,PConsumer {
      void consume(double v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIBID extends Consumer5<Double,Integer,Boolean,Integer,Double>,PConsumer {
      void consume(double v0,int v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIBIL extends Consumer5<Double,Integer,Boolean,Integer,Long>,PConsumer {
      void consume(double v0,int v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIBBI extends Consumer5<Double,Integer,Boolean,Boolean,Integer>,PConsumer {
      void consume(double v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIBBB extends Consumer5<Double,Integer,Boolean,Boolean,Boolean>,PConsumer {
      void consume(double v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIBBD extends Consumer5<Double,Integer,Boolean,Boolean,Double>,PConsumer {
      void consume(double v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIBBL extends Consumer5<Double,Integer,Boolean,Boolean,Long>,PConsumer {
      void consume(double v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIBDI extends Consumer5<Double,Integer,Boolean,Double,Integer>,PConsumer {
      void consume(double v0,int v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIBDB extends Consumer5<Double,Integer,Boolean,Double,Boolean>,PConsumer {
      void consume(double v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIBDD extends Consumer5<Double,Integer,Boolean,Double,Double>,PConsumer {
      void consume(double v0,int v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIBDL extends Consumer5<Double,Integer,Boolean,Double,Long>,PConsumer {
      void consume(double v0,int v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIBLI extends Consumer5<Double,Integer,Boolean,Long,Integer>,PConsumer {
      void consume(double v0,int v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIBLB extends Consumer5<Double,Integer,Boolean,Long,Boolean>,PConsumer {
      void consume(double v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIBLD extends Consumer5<Double,Integer,Boolean,Long,Double>,PConsumer {
      void consume(double v0,int v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIBLL extends Consumer5<Double,Integer,Boolean,Long,Long>,PConsumer {
      void consume(double v0,int v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Boolean v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIDII extends Consumer5<Double,Integer,Double,Integer,Integer>,PConsumer {
      void consume(double v0,int v1,double v2,int v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIDIB extends Consumer5<Double,Integer,Double,Integer,Boolean>,PConsumer {
      void consume(double v0,int v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIDID extends Consumer5<Double,Integer,Double,Integer,Double>,PConsumer {
      void consume(double v0,int v1,double v2,int v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIDIL extends Consumer5<Double,Integer,Double,Integer,Long>,PConsumer {
      void consume(double v0,int v1,double v2,int v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIDBI extends Consumer5<Double,Integer,Double,Boolean,Integer>,PConsumer {
      void consume(double v0,int v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIDBB extends Consumer5<Double,Integer,Double,Boolean,Boolean>,PConsumer {
      void consume(double v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIDBD extends Consumer5<Double,Integer,Double,Boolean,Double>,PConsumer {
      void consume(double v0,int v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIDBL extends Consumer5<Double,Integer,Double,Boolean,Long>,PConsumer {
      void consume(double v0,int v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIDDI extends Consumer5<Double,Integer,Double,Double,Integer>,PConsumer {
      void consume(double v0,int v1,double v2,double v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIDDB extends Consumer5<Double,Integer,Double,Double,Boolean>,PConsumer {
      void consume(double v0,int v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIDDD extends Consumer5<Double,Integer,Double,Double,Double>,PConsumer {
      void consume(double v0,int v1,double v2,double v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIDDL extends Consumer5<Double,Integer,Double,Double,Long>,PConsumer {
      void consume(double v0,int v1,double v2,double v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDIDLI extends Consumer5<Double,Integer,Double,Long,Integer>,PConsumer {
      void consume(double v0,int v1,double v2,long v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDIDLB extends Consumer5<Double,Integer,Double,Long,Boolean>,PConsumer {
      void consume(double v0,int v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDIDLD extends Consumer5<Double,Integer,Double,Long,Double>,PConsumer {
      void consume(double v0,int v1,double v2,long v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDIDLL extends Consumer5<Double,Integer,Double,Long,Long>,PConsumer {
      void consume(double v0,int v1,double v2,long v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Double v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDILII extends Consumer5<Double,Integer,Long,Integer,Integer>,PConsumer {
      void consume(double v0,int v1,long v2,int v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDILIB extends Consumer5<Double,Integer,Long,Integer,Boolean>,PConsumer {
      void consume(double v0,int v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDILID extends Consumer5<Double,Integer,Long,Integer,Double>,PConsumer {
      void consume(double v0,int v1,long v2,int v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDILIL extends Consumer5<Double,Integer,Long,Integer,Long>,PConsumer {
      void consume(double v0,int v1,long v2,int v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDILBI extends Consumer5<Double,Integer,Long,Boolean,Integer>,PConsumer {
      void consume(double v0,int v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDILBB extends Consumer5<Double,Integer,Long,Boolean,Boolean>,PConsumer {
      void consume(double v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDILBD extends Consumer5<Double,Integer,Long,Boolean,Double>,PConsumer {
      void consume(double v0,int v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDILBL extends Consumer5<Double,Integer,Long,Boolean,Long>,PConsumer {
      void consume(double v0,int v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDILDI extends Consumer5<Double,Integer,Long,Double,Integer>,PConsumer {
      void consume(double v0,int v1,long v2,double v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDILDB extends Consumer5<Double,Integer,Long,Double,Boolean>,PConsumer {
      void consume(double v0,int v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDILDD extends Consumer5<Double,Integer,Long,Double,Double>,PConsumer {
      void consume(double v0,int v1,long v2,double v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDILDL extends Consumer5<Double,Integer,Long,Double,Long>,PConsumer {
      void consume(double v0,int v1,long v2,double v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDILLI extends Consumer5<Double,Integer,Long,Long,Integer>,PConsumer {
      void consume(double v0,int v1,long v2,long v3,int v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDILLB extends Consumer5<Double,Integer,Long,Long,Boolean>,PConsumer {
      void consume(double v0,int v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDILLD extends Consumer5<Double,Integer,Long,Long,Double>,PConsumer {
      void consume(double v0,int v1,long v2,long v3,double v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDILLL extends Consumer5<Double,Integer,Long,Long,Long>,PConsumer {
      void consume(double v0,int v1,long v2,long v3,long v4);
      @Override
      default void accept(Double v0,Integer v1,Long v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBIII extends Consumer5<Double,Boolean,Integer,Integer,Integer>,PConsumer {
      void consume(double v0,boolean v1,int v2,int v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBIIB extends Consumer5<Double,Boolean,Integer,Integer,Boolean>,PConsumer {
      void consume(double v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBIID extends Consumer5<Double,Boolean,Integer,Integer,Double>,PConsumer {
      void consume(double v0,boolean v1,int v2,int v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBIIL extends Consumer5<Double,Boolean,Integer,Integer,Long>,PConsumer {
      void consume(double v0,boolean v1,int v2,int v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBIBI extends Consumer5<Double,Boolean,Integer,Boolean,Integer>,PConsumer {
      void consume(double v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBIBB extends Consumer5<Double,Boolean,Integer,Boolean,Boolean>,PConsumer {
      void consume(double v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBIBD extends Consumer5<Double,Boolean,Integer,Boolean,Double>,PConsumer {
      void consume(double v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBIBL extends Consumer5<Double,Boolean,Integer,Boolean,Long>,PConsumer {
      void consume(double v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBIDI extends Consumer5<Double,Boolean,Integer,Double,Integer>,PConsumer {
      void consume(double v0,boolean v1,int v2,double v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBIDB extends Consumer5<Double,Boolean,Integer,Double,Boolean>,PConsumer {
      void consume(double v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBIDD extends Consumer5<Double,Boolean,Integer,Double,Double>,PConsumer {
      void consume(double v0,boolean v1,int v2,double v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBIDL extends Consumer5<Double,Boolean,Integer,Double,Long>,PConsumer {
      void consume(double v0,boolean v1,int v2,double v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBILI extends Consumer5<Double,Boolean,Integer,Long,Integer>,PConsumer {
      void consume(double v0,boolean v1,int v2,long v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBILB extends Consumer5<Double,Boolean,Integer,Long,Boolean>,PConsumer {
      void consume(double v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBILD extends Consumer5<Double,Boolean,Integer,Long,Double>,PConsumer {
      void consume(double v0,boolean v1,int v2,long v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBILL extends Consumer5<Double,Boolean,Integer,Long,Long>,PConsumer {
      void consume(double v0,boolean v1,int v2,long v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Integer v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBBII extends Consumer5<Double,Boolean,Boolean,Integer,Integer>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBBIB extends Consumer5<Double,Boolean,Boolean,Integer,Boolean>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBBID extends Consumer5<Double,Boolean,Boolean,Integer,Double>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBBIL extends Consumer5<Double,Boolean,Boolean,Integer,Long>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBBBI extends Consumer5<Double,Boolean,Boolean,Boolean,Integer>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBBBB extends Consumer5<Double,Boolean,Boolean,Boolean,Boolean>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBBBD extends Consumer5<Double,Boolean,Boolean,Boolean,Double>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBBBL extends Consumer5<Double,Boolean,Boolean,Boolean,Long>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBBDI extends Consumer5<Double,Boolean,Boolean,Double,Integer>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBBDB extends Consumer5<Double,Boolean,Boolean,Double,Boolean>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBBDD extends Consumer5<Double,Boolean,Boolean,Double,Double>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBBDL extends Consumer5<Double,Boolean,Boolean,Double,Long>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBBLI extends Consumer5<Double,Boolean,Boolean,Long,Integer>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBBLB extends Consumer5<Double,Boolean,Boolean,Long,Boolean>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBBLD extends Consumer5<Double,Boolean,Boolean,Long,Double>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBBLL extends Consumer5<Double,Boolean,Boolean,Long,Long>,PConsumer {
      void consume(double v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBDII extends Consumer5<Double,Boolean,Double,Integer,Integer>,PConsumer {
      void consume(double v0,boolean v1,double v2,int v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBDIB extends Consumer5<Double,Boolean,Double,Integer,Boolean>,PConsumer {
      void consume(double v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBDID extends Consumer5<Double,Boolean,Double,Integer,Double>,PConsumer {
      void consume(double v0,boolean v1,double v2,int v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBDIL extends Consumer5<Double,Boolean,Double,Integer,Long>,PConsumer {
      void consume(double v0,boolean v1,double v2,int v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBDBI extends Consumer5<Double,Boolean,Double,Boolean,Integer>,PConsumer {
      void consume(double v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBDBB extends Consumer5<Double,Boolean,Double,Boolean,Boolean>,PConsumer {
      void consume(double v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBDBD extends Consumer5<Double,Boolean,Double,Boolean,Double>,PConsumer {
      void consume(double v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBDBL extends Consumer5<Double,Boolean,Double,Boolean,Long>,PConsumer {
      void consume(double v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBDDI extends Consumer5<Double,Boolean,Double,Double,Integer>,PConsumer {
      void consume(double v0,boolean v1,double v2,double v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBDDB extends Consumer5<Double,Boolean,Double,Double,Boolean>,PConsumer {
      void consume(double v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBDDD extends Consumer5<Double,Boolean,Double,Double,Double>,PConsumer {
      void consume(double v0,boolean v1,double v2,double v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBDDL extends Consumer5<Double,Boolean,Double,Double,Long>,PConsumer {
      void consume(double v0,boolean v1,double v2,double v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBDLI extends Consumer5<Double,Boolean,Double,Long,Integer>,PConsumer {
      void consume(double v0,boolean v1,double v2,long v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBDLB extends Consumer5<Double,Boolean,Double,Long,Boolean>,PConsumer {
      void consume(double v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBDLD extends Consumer5<Double,Boolean,Double,Long,Double>,PConsumer {
      void consume(double v0,boolean v1,double v2,long v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBDLL extends Consumer5<Double,Boolean,Double,Long,Long>,PConsumer {
      void consume(double v0,boolean v1,double v2,long v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Double v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBLII extends Consumer5<Double,Boolean,Long,Integer,Integer>,PConsumer {
      void consume(double v0,boolean v1,long v2,int v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBLIB extends Consumer5<Double,Boolean,Long,Integer,Boolean>,PConsumer {
      void consume(double v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBLID extends Consumer5<Double,Boolean,Long,Integer,Double>,PConsumer {
      void consume(double v0,boolean v1,long v2,int v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBLIL extends Consumer5<Double,Boolean,Long,Integer,Long>,PConsumer {
      void consume(double v0,boolean v1,long v2,int v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBLBI extends Consumer5<Double,Boolean,Long,Boolean,Integer>,PConsumer {
      void consume(double v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBLBB extends Consumer5<Double,Boolean,Long,Boolean,Boolean>,PConsumer {
      void consume(double v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBLBD extends Consumer5<Double,Boolean,Long,Boolean,Double>,PConsumer {
      void consume(double v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBLBL extends Consumer5<Double,Boolean,Long,Boolean,Long>,PConsumer {
      void consume(double v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBLDI extends Consumer5<Double,Boolean,Long,Double,Integer>,PConsumer {
      void consume(double v0,boolean v1,long v2,double v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBLDB extends Consumer5<Double,Boolean,Long,Double,Boolean>,PConsumer {
      void consume(double v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBLDD extends Consumer5<Double,Boolean,Long,Double,Double>,PConsumer {
      void consume(double v0,boolean v1,long v2,double v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBLDL extends Consumer5<Double,Boolean,Long,Double,Long>,PConsumer {
      void consume(double v0,boolean v1,long v2,double v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDBLLI extends Consumer5<Double,Boolean,Long,Long,Integer>,PConsumer {
      void consume(double v0,boolean v1,long v2,long v3,int v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDBLLB extends Consumer5<Double,Boolean,Long,Long,Boolean>,PConsumer {
      void consume(double v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDBLLD extends Consumer5<Double,Boolean,Long,Long,Double>,PConsumer {
      void consume(double v0,boolean v1,long v2,long v3,double v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDBLLL extends Consumer5<Double,Boolean,Long,Long,Long>,PConsumer {
      void consume(double v0,boolean v1,long v2,long v3,long v4);
      @Override
      default void accept(Double v0,Boolean v1,Long v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDIII extends Consumer5<Double,Double,Integer,Integer,Integer>,PConsumer {
      void consume(double v0,double v1,int v2,int v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDIIB extends Consumer5<Double,Double,Integer,Integer,Boolean>,PConsumer {
      void consume(double v0,double v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDIID extends Consumer5<Double,Double,Integer,Integer,Double>,PConsumer {
      void consume(double v0,double v1,int v2,int v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDIIL extends Consumer5<Double,Double,Integer,Integer,Long>,PConsumer {
      void consume(double v0,double v1,int v2,int v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDIBI extends Consumer5<Double,Double,Integer,Boolean,Integer>,PConsumer {
      void consume(double v0,double v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDIBB extends Consumer5<Double,Double,Integer,Boolean,Boolean>,PConsumer {
      void consume(double v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDIBD extends Consumer5<Double,Double,Integer,Boolean,Double>,PConsumer {
      void consume(double v0,double v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDIBL extends Consumer5<Double,Double,Integer,Boolean,Long>,PConsumer {
      void consume(double v0,double v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDIDI extends Consumer5<Double,Double,Integer,Double,Integer>,PConsumer {
      void consume(double v0,double v1,int v2,double v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDIDB extends Consumer5<Double,Double,Integer,Double,Boolean>,PConsumer {
      void consume(double v0,double v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDIDD extends Consumer5<Double,Double,Integer,Double,Double>,PConsumer {
      void consume(double v0,double v1,int v2,double v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDIDL extends Consumer5<Double,Double,Integer,Double,Long>,PConsumer {
      void consume(double v0,double v1,int v2,double v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDILI extends Consumer5<Double,Double,Integer,Long,Integer>,PConsumer {
      void consume(double v0,double v1,int v2,long v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDILB extends Consumer5<Double,Double,Integer,Long,Boolean>,PConsumer {
      void consume(double v0,double v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDILD extends Consumer5<Double,Double,Integer,Long,Double>,PConsumer {
      void consume(double v0,double v1,int v2,long v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDILL extends Consumer5<Double,Double,Integer,Long,Long>,PConsumer {
      void consume(double v0,double v1,int v2,long v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Integer v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDBII extends Consumer5<Double,Double,Boolean,Integer,Integer>,PConsumer {
      void consume(double v0,double v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDBIB extends Consumer5<Double,Double,Boolean,Integer,Boolean>,PConsumer {
      void consume(double v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDBID extends Consumer5<Double,Double,Boolean,Integer,Double>,PConsumer {
      void consume(double v0,double v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDBIL extends Consumer5<Double,Double,Boolean,Integer,Long>,PConsumer {
      void consume(double v0,double v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDBBI extends Consumer5<Double,Double,Boolean,Boolean,Integer>,PConsumer {
      void consume(double v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDBBB extends Consumer5<Double,Double,Boolean,Boolean,Boolean>,PConsumer {
      void consume(double v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDBBD extends Consumer5<Double,Double,Boolean,Boolean,Double>,PConsumer {
      void consume(double v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDBBL extends Consumer5<Double,Double,Boolean,Boolean,Long>,PConsumer {
      void consume(double v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDBDI extends Consumer5<Double,Double,Boolean,Double,Integer>,PConsumer {
      void consume(double v0,double v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDBDB extends Consumer5<Double,Double,Boolean,Double,Boolean>,PConsumer {
      void consume(double v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDBDD extends Consumer5<Double,Double,Boolean,Double,Double>,PConsumer {
      void consume(double v0,double v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDBDL extends Consumer5<Double,Double,Boolean,Double,Long>,PConsumer {
      void consume(double v0,double v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDBLI extends Consumer5<Double,Double,Boolean,Long,Integer>,PConsumer {
      void consume(double v0,double v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDBLB extends Consumer5<Double,Double,Boolean,Long,Boolean>,PConsumer {
      void consume(double v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDBLD extends Consumer5<Double,Double,Boolean,Long,Double>,PConsumer {
      void consume(double v0,double v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDBLL extends Consumer5<Double,Double,Boolean,Long,Long>,PConsumer {
      void consume(double v0,double v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Boolean v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDDII extends Consumer5<Double,Double,Double,Integer,Integer>,PConsumer {
      void consume(double v0,double v1,double v2,int v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDDIB extends Consumer5<Double,Double,Double,Integer,Boolean>,PConsumer {
      void consume(double v0,double v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDDID extends Consumer5<Double,Double,Double,Integer,Double>,PConsumer {
      void consume(double v0,double v1,double v2,int v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDDIL extends Consumer5<Double,Double,Double,Integer,Long>,PConsumer {
      void consume(double v0,double v1,double v2,int v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDDBI extends Consumer5<Double,Double,Double,Boolean,Integer>,PConsumer {
      void consume(double v0,double v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDDBB extends Consumer5<Double,Double,Double,Boolean,Boolean>,PConsumer {
      void consume(double v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDDBD extends Consumer5<Double,Double,Double,Boolean,Double>,PConsumer {
      void consume(double v0,double v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDDBL extends Consumer5<Double,Double,Double,Boolean,Long>,PConsumer {
      void consume(double v0,double v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDDDI extends Consumer5<Double,Double,Double,Double,Integer>,PConsumer {
      void consume(double v0,double v1,double v2,double v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDDDB extends Consumer5<Double,Double,Double,Double,Boolean>,PConsumer {
      void consume(double v0,double v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDDDD extends Consumer5<Double,Double,Double,Double,Double>,PConsumer {
      void consume(double v0,double v1,double v2,double v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDDDL extends Consumer5<Double,Double,Double,Double,Long>,PConsumer {
      void consume(double v0,double v1,double v2,double v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDDLI extends Consumer5<Double,Double,Double,Long,Integer>,PConsumer {
      void consume(double v0,double v1,double v2,long v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDDLB extends Consumer5<Double,Double,Double,Long,Boolean>,PConsumer {
      void consume(double v0,double v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDDLD extends Consumer5<Double,Double,Double,Long,Double>,PConsumer {
      void consume(double v0,double v1,double v2,long v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDDLL extends Consumer5<Double,Double,Double,Long,Long>,PConsumer {
      void consume(double v0,double v1,double v2,long v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Double v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDLII extends Consumer5<Double,Double,Long,Integer,Integer>,PConsumer {
      void consume(double v0,double v1,long v2,int v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDLIB extends Consumer5<Double,Double,Long,Integer,Boolean>,PConsumer {
      void consume(double v0,double v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDLID extends Consumer5<Double,Double,Long,Integer,Double>,PConsumer {
      void consume(double v0,double v1,long v2,int v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDLIL extends Consumer5<Double,Double,Long,Integer,Long>,PConsumer {
      void consume(double v0,double v1,long v2,int v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDLBI extends Consumer5<Double,Double,Long,Boolean,Integer>,PConsumer {
      void consume(double v0,double v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDLBB extends Consumer5<Double,Double,Long,Boolean,Boolean>,PConsumer {
      void consume(double v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDLBD extends Consumer5<Double,Double,Long,Boolean,Double>,PConsumer {
      void consume(double v0,double v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDLBL extends Consumer5<Double,Double,Long,Boolean,Long>,PConsumer {
      void consume(double v0,double v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDLDI extends Consumer5<Double,Double,Long,Double,Integer>,PConsumer {
      void consume(double v0,double v1,long v2,double v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDLDB extends Consumer5<Double,Double,Long,Double,Boolean>,PConsumer {
      void consume(double v0,double v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDLDD extends Consumer5<Double,Double,Long,Double,Double>,PConsumer {
      void consume(double v0,double v1,long v2,double v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDLDL extends Consumer5<Double,Double,Long,Double,Long>,PConsumer {
      void consume(double v0,double v1,long v2,double v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDDLLI extends Consumer5<Double,Double,Long,Long,Integer>,PConsumer {
      void consume(double v0,double v1,long v2,long v3,int v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDDLLB extends Consumer5<Double,Double,Long,Long,Boolean>,PConsumer {
      void consume(double v0,double v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDDLLD extends Consumer5<Double,Double,Long,Long,Double>,PConsumer {
      void consume(double v0,double v1,long v2,long v3,double v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDDLLL extends Consumer5<Double,Double,Long,Long,Long>,PConsumer {
      void consume(double v0,double v1,long v2,long v3,long v4);
      @Override
      default void accept(Double v0,Double v1,Long v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLIII extends Consumer5<Double,Long,Integer,Integer,Integer>,PConsumer {
      void consume(double v0,long v1,int v2,int v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLIIB extends Consumer5<Double,Long,Integer,Integer,Boolean>,PConsumer {
      void consume(double v0,long v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLIID extends Consumer5<Double,Long,Integer,Integer,Double>,PConsumer {
      void consume(double v0,long v1,int v2,int v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLIIL extends Consumer5<Double,Long,Integer,Integer,Long>,PConsumer {
      void consume(double v0,long v1,int v2,int v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLIBI extends Consumer5<Double,Long,Integer,Boolean,Integer>,PConsumer {
      void consume(double v0,long v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLIBB extends Consumer5<Double,Long,Integer,Boolean,Boolean>,PConsumer {
      void consume(double v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLIBD extends Consumer5<Double,Long,Integer,Boolean,Double>,PConsumer {
      void consume(double v0,long v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLIBL extends Consumer5<Double,Long,Integer,Boolean,Long>,PConsumer {
      void consume(double v0,long v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLIDI extends Consumer5<Double,Long,Integer,Double,Integer>,PConsumer {
      void consume(double v0,long v1,int v2,double v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLIDB extends Consumer5<Double,Long,Integer,Double,Boolean>,PConsumer {
      void consume(double v0,long v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLIDD extends Consumer5<Double,Long,Integer,Double,Double>,PConsumer {
      void consume(double v0,long v1,int v2,double v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLIDL extends Consumer5<Double,Long,Integer,Double,Long>,PConsumer {
      void consume(double v0,long v1,int v2,double v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLILI extends Consumer5<Double,Long,Integer,Long,Integer>,PConsumer {
      void consume(double v0,long v1,int v2,long v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLILB extends Consumer5<Double,Long,Integer,Long,Boolean>,PConsumer {
      void consume(double v0,long v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLILD extends Consumer5<Double,Long,Integer,Long,Double>,PConsumer {
      void consume(double v0,long v1,int v2,long v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLILL extends Consumer5<Double,Long,Integer,Long,Long>,PConsumer {
      void consume(double v0,long v1,int v2,long v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Integer v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLBII extends Consumer5<Double,Long,Boolean,Integer,Integer>,PConsumer {
      void consume(double v0,long v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLBIB extends Consumer5<Double,Long,Boolean,Integer,Boolean>,PConsumer {
      void consume(double v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLBID extends Consumer5<Double,Long,Boolean,Integer,Double>,PConsumer {
      void consume(double v0,long v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLBIL extends Consumer5<Double,Long,Boolean,Integer,Long>,PConsumer {
      void consume(double v0,long v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLBBI extends Consumer5<Double,Long,Boolean,Boolean,Integer>,PConsumer {
      void consume(double v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLBBB extends Consumer5<Double,Long,Boolean,Boolean,Boolean>,PConsumer {
      void consume(double v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLBBD extends Consumer5<Double,Long,Boolean,Boolean,Double>,PConsumer {
      void consume(double v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLBBL extends Consumer5<Double,Long,Boolean,Boolean,Long>,PConsumer {
      void consume(double v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLBDI extends Consumer5<Double,Long,Boolean,Double,Integer>,PConsumer {
      void consume(double v0,long v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLBDB extends Consumer5<Double,Long,Boolean,Double,Boolean>,PConsumer {
      void consume(double v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLBDD extends Consumer5<Double,Long,Boolean,Double,Double>,PConsumer {
      void consume(double v0,long v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLBDL extends Consumer5<Double,Long,Boolean,Double,Long>,PConsumer {
      void consume(double v0,long v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLBLI extends Consumer5<Double,Long,Boolean,Long,Integer>,PConsumer {
      void consume(double v0,long v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLBLB extends Consumer5<Double,Long,Boolean,Long,Boolean>,PConsumer {
      void consume(double v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLBLD extends Consumer5<Double,Long,Boolean,Long,Double>,PConsumer {
      void consume(double v0,long v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLBLL extends Consumer5<Double,Long,Boolean,Long,Long>,PConsumer {
      void consume(double v0,long v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Boolean v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLDII extends Consumer5<Double,Long,Double,Integer,Integer>,PConsumer {
      void consume(double v0,long v1,double v2,int v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLDIB extends Consumer5<Double,Long,Double,Integer,Boolean>,PConsumer {
      void consume(double v0,long v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLDID extends Consumer5<Double,Long,Double,Integer,Double>,PConsumer {
      void consume(double v0,long v1,double v2,int v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLDIL extends Consumer5<Double,Long,Double,Integer,Long>,PConsumer {
      void consume(double v0,long v1,double v2,int v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLDBI extends Consumer5<Double,Long,Double,Boolean,Integer>,PConsumer {
      void consume(double v0,long v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLDBB extends Consumer5<Double,Long,Double,Boolean,Boolean>,PConsumer {
      void consume(double v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLDBD extends Consumer5<Double,Long,Double,Boolean,Double>,PConsumer {
      void consume(double v0,long v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLDBL extends Consumer5<Double,Long,Double,Boolean,Long>,PConsumer {
      void consume(double v0,long v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLDDI extends Consumer5<Double,Long,Double,Double,Integer>,PConsumer {
      void consume(double v0,long v1,double v2,double v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLDDB extends Consumer5<Double,Long,Double,Double,Boolean>,PConsumer {
      void consume(double v0,long v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLDDD extends Consumer5<Double,Long,Double,Double,Double>,PConsumer {
      void consume(double v0,long v1,double v2,double v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLDDL extends Consumer5<Double,Long,Double,Double,Long>,PConsumer {
      void consume(double v0,long v1,double v2,double v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLDLI extends Consumer5<Double,Long,Double,Long,Integer>,PConsumer {
      void consume(double v0,long v1,double v2,long v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLDLB extends Consumer5<Double,Long,Double,Long,Boolean>,PConsumer {
      void consume(double v0,long v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLDLD extends Consumer5<Double,Long,Double,Long,Double>,PConsumer {
      void consume(double v0,long v1,double v2,long v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLDLL extends Consumer5<Double,Long,Double,Long,Long>,PConsumer {
      void consume(double v0,long v1,double v2,long v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Double v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLLII extends Consumer5<Double,Long,Long,Integer,Integer>,PConsumer {
      void consume(double v0,long v1,long v2,int v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Integer v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLLIB extends Consumer5<Double,Long,Long,Integer,Boolean>,PConsumer {
      void consume(double v0,long v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Integer v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLLID extends Consumer5<Double,Long,Long,Integer,Double>,PConsumer {
      void consume(double v0,long v1,long v2,int v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Integer v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLLIL extends Consumer5<Double,Long,Long,Integer,Long>,PConsumer {
      void consume(double v0,long v1,long v2,int v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Integer v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLLBI extends Consumer5<Double,Long,Long,Boolean,Integer>,PConsumer {
      void consume(double v0,long v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Boolean v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLLBB extends Consumer5<Double,Long,Long,Boolean,Boolean>,PConsumer {
      void consume(double v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLLBD extends Consumer5<Double,Long,Long,Boolean,Double>,PConsumer {
      void consume(double v0,long v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Boolean v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLLBL extends Consumer5<Double,Long,Long,Boolean,Long>,PConsumer {
      void consume(double v0,long v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Boolean v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLLDI extends Consumer5<Double,Long,Long,Double,Integer>,PConsumer {
      void consume(double v0,long v1,long v2,double v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Double v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLLDB extends Consumer5<Double,Long,Long,Double,Boolean>,PConsumer {
      void consume(double v0,long v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Double v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLLDD extends Consumer5<Double,Long,Long,Double,Double>,PConsumer {
      void consume(double v0,long v1,long v2,double v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Double v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLLDL extends Consumer5<Double,Long,Long,Double,Long>,PConsumer {
      void consume(double v0,long v1,long v2,double v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Double v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuDLLLI extends Consumer5<Double,Long,Long,Long,Integer>,PConsumer {
      void consume(double v0,long v1,long v2,long v3,int v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Long v3,Integer v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuDLLLB extends Consumer5<Double,Long,Long,Long,Boolean>,PConsumer {
      void consume(double v0,long v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Long v3,Boolean v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuDLLLD extends Consumer5<Double,Long,Long,Long,Double>,PConsumer {
      void consume(double v0,long v1,long v2,long v3,double v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Long v3,Double v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuDLLLL extends Consumer5<Double,Long,Long,Long,Long>,PConsumer {
      void consume(double v0,long v1,long v2,long v3,long v4);
      @Override
      default void accept(Double v0,Long v1,Long v2,Long v3,Long v4) {
          consume((double)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIIII extends Consumer5<Long,Integer,Integer,Integer,Integer>,PConsumer {
      void consume(long v0,int v1,int v2,int v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIIIB extends Consumer5<Long,Integer,Integer,Integer,Boolean>,PConsumer {
      void consume(long v0,int v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIIID extends Consumer5<Long,Integer,Integer,Integer,Double>,PConsumer {
      void consume(long v0,int v1,int v2,int v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIIIL extends Consumer5<Long,Integer,Integer,Integer,Long>,PConsumer {
      void consume(long v0,int v1,int v2,int v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIIBI extends Consumer5<Long,Integer,Integer,Boolean,Integer>,PConsumer {
      void consume(long v0,int v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIIBB extends Consumer5<Long,Integer,Integer,Boolean,Boolean>,PConsumer {
      void consume(long v0,int v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIIBD extends Consumer5<Long,Integer,Integer,Boolean,Double>,PConsumer {
      void consume(long v0,int v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIIBL extends Consumer5<Long,Integer,Integer,Boolean,Long>,PConsumer {
      void consume(long v0,int v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIIDI extends Consumer5<Long,Integer,Integer,Double,Integer>,PConsumer {
      void consume(long v0,int v1,int v2,double v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIIDB extends Consumer5<Long,Integer,Integer,Double,Boolean>,PConsumer {
      void consume(long v0,int v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIIDD extends Consumer5<Long,Integer,Integer,Double,Double>,PConsumer {
      void consume(long v0,int v1,int v2,double v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIIDL extends Consumer5<Long,Integer,Integer,Double,Long>,PConsumer {
      void consume(long v0,int v1,int v2,double v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIILI extends Consumer5<Long,Integer,Integer,Long,Integer>,PConsumer {
      void consume(long v0,int v1,int v2,long v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIILB extends Consumer5<Long,Integer,Integer,Long,Boolean>,PConsumer {
      void consume(long v0,int v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIILD extends Consumer5<Long,Integer,Integer,Long,Double>,PConsumer {
      void consume(long v0,int v1,int v2,long v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIILL extends Consumer5<Long,Integer,Integer,Long,Long>,PConsumer {
      void consume(long v0,int v1,int v2,long v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Integer v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIBII extends Consumer5<Long,Integer,Boolean,Integer,Integer>,PConsumer {
      void consume(long v0,int v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIBIB extends Consumer5<Long,Integer,Boolean,Integer,Boolean>,PConsumer {
      void consume(long v0,int v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIBID extends Consumer5<Long,Integer,Boolean,Integer,Double>,PConsumer {
      void consume(long v0,int v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIBIL extends Consumer5<Long,Integer,Boolean,Integer,Long>,PConsumer {
      void consume(long v0,int v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIBBI extends Consumer5<Long,Integer,Boolean,Boolean,Integer>,PConsumer {
      void consume(long v0,int v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIBBB extends Consumer5<Long,Integer,Boolean,Boolean,Boolean>,PConsumer {
      void consume(long v0,int v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIBBD extends Consumer5<Long,Integer,Boolean,Boolean,Double>,PConsumer {
      void consume(long v0,int v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIBBL extends Consumer5<Long,Integer,Boolean,Boolean,Long>,PConsumer {
      void consume(long v0,int v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIBDI extends Consumer5<Long,Integer,Boolean,Double,Integer>,PConsumer {
      void consume(long v0,int v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIBDB extends Consumer5<Long,Integer,Boolean,Double,Boolean>,PConsumer {
      void consume(long v0,int v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIBDD extends Consumer5<Long,Integer,Boolean,Double,Double>,PConsumer {
      void consume(long v0,int v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIBDL extends Consumer5<Long,Integer,Boolean,Double,Long>,PConsumer {
      void consume(long v0,int v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIBLI extends Consumer5<Long,Integer,Boolean,Long,Integer>,PConsumer {
      void consume(long v0,int v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIBLB extends Consumer5<Long,Integer,Boolean,Long,Boolean>,PConsumer {
      void consume(long v0,int v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIBLD extends Consumer5<Long,Integer,Boolean,Long,Double>,PConsumer {
      void consume(long v0,int v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIBLL extends Consumer5<Long,Integer,Boolean,Long,Long>,PConsumer {
      void consume(long v0,int v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Boolean v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIDII extends Consumer5<Long,Integer,Double,Integer,Integer>,PConsumer {
      void consume(long v0,int v1,double v2,int v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIDIB extends Consumer5<Long,Integer,Double,Integer,Boolean>,PConsumer {
      void consume(long v0,int v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIDID extends Consumer5<Long,Integer,Double,Integer,Double>,PConsumer {
      void consume(long v0,int v1,double v2,int v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIDIL extends Consumer5<Long,Integer,Double,Integer,Long>,PConsumer {
      void consume(long v0,int v1,double v2,int v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIDBI extends Consumer5<Long,Integer,Double,Boolean,Integer>,PConsumer {
      void consume(long v0,int v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIDBB extends Consumer5<Long,Integer,Double,Boolean,Boolean>,PConsumer {
      void consume(long v0,int v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIDBD extends Consumer5<Long,Integer,Double,Boolean,Double>,PConsumer {
      void consume(long v0,int v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIDBL extends Consumer5<Long,Integer,Double,Boolean,Long>,PConsumer {
      void consume(long v0,int v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIDDI extends Consumer5<Long,Integer,Double,Double,Integer>,PConsumer {
      void consume(long v0,int v1,double v2,double v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIDDB extends Consumer5<Long,Integer,Double,Double,Boolean>,PConsumer {
      void consume(long v0,int v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIDDD extends Consumer5<Long,Integer,Double,Double,Double>,PConsumer {
      void consume(long v0,int v1,double v2,double v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIDDL extends Consumer5<Long,Integer,Double,Double,Long>,PConsumer {
      void consume(long v0,int v1,double v2,double v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLIDLI extends Consumer5<Long,Integer,Double,Long,Integer>,PConsumer {
      void consume(long v0,int v1,double v2,long v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLIDLB extends Consumer5<Long,Integer,Double,Long,Boolean>,PConsumer {
      void consume(long v0,int v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLIDLD extends Consumer5<Long,Integer,Double,Long,Double>,PConsumer {
      void consume(long v0,int v1,double v2,long v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLIDLL extends Consumer5<Long,Integer,Double,Long,Long>,PConsumer {
      void consume(long v0,int v1,double v2,long v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Double v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLILII extends Consumer5<Long,Integer,Long,Integer,Integer>,PConsumer {
      void consume(long v0,int v1,long v2,int v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLILIB extends Consumer5<Long,Integer,Long,Integer,Boolean>,PConsumer {
      void consume(long v0,int v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLILID extends Consumer5<Long,Integer,Long,Integer,Double>,PConsumer {
      void consume(long v0,int v1,long v2,int v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLILIL extends Consumer5<Long,Integer,Long,Integer,Long>,PConsumer {
      void consume(long v0,int v1,long v2,int v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLILBI extends Consumer5<Long,Integer,Long,Boolean,Integer>,PConsumer {
      void consume(long v0,int v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLILBB extends Consumer5<Long,Integer,Long,Boolean,Boolean>,PConsumer {
      void consume(long v0,int v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLILBD extends Consumer5<Long,Integer,Long,Boolean,Double>,PConsumer {
      void consume(long v0,int v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLILBL extends Consumer5<Long,Integer,Long,Boolean,Long>,PConsumer {
      void consume(long v0,int v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLILDI extends Consumer5<Long,Integer,Long,Double,Integer>,PConsumer {
      void consume(long v0,int v1,long v2,double v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLILDB extends Consumer5<Long,Integer,Long,Double,Boolean>,PConsumer {
      void consume(long v0,int v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLILDD extends Consumer5<Long,Integer,Long,Double,Double>,PConsumer {
      void consume(long v0,int v1,long v2,double v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLILDL extends Consumer5<Long,Integer,Long,Double,Long>,PConsumer {
      void consume(long v0,int v1,long v2,double v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLILLI extends Consumer5<Long,Integer,Long,Long,Integer>,PConsumer {
      void consume(long v0,int v1,long v2,long v3,int v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLILLB extends Consumer5<Long,Integer,Long,Long,Boolean>,PConsumer {
      void consume(long v0,int v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLILLD extends Consumer5<Long,Integer,Long,Long,Double>,PConsumer {
      void consume(long v0,int v1,long v2,long v3,double v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLILLL extends Consumer5<Long,Integer,Long,Long,Long>,PConsumer {
      void consume(long v0,int v1,long v2,long v3,long v4);
      @Override
      default void accept(Long v0,Integer v1,Long v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(int)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBIII extends Consumer5<Long,Boolean,Integer,Integer,Integer>,PConsumer {
      void consume(long v0,boolean v1,int v2,int v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBIIB extends Consumer5<Long,Boolean,Integer,Integer,Boolean>,PConsumer {
      void consume(long v0,boolean v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBIID extends Consumer5<Long,Boolean,Integer,Integer,Double>,PConsumer {
      void consume(long v0,boolean v1,int v2,int v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBIIL extends Consumer5<Long,Boolean,Integer,Integer,Long>,PConsumer {
      void consume(long v0,boolean v1,int v2,int v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBIBI extends Consumer5<Long,Boolean,Integer,Boolean,Integer>,PConsumer {
      void consume(long v0,boolean v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBIBB extends Consumer5<Long,Boolean,Integer,Boolean,Boolean>,PConsumer {
      void consume(long v0,boolean v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBIBD extends Consumer5<Long,Boolean,Integer,Boolean,Double>,PConsumer {
      void consume(long v0,boolean v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBIBL extends Consumer5<Long,Boolean,Integer,Boolean,Long>,PConsumer {
      void consume(long v0,boolean v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBIDI extends Consumer5<Long,Boolean,Integer,Double,Integer>,PConsumer {
      void consume(long v0,boolean v1,int v2,double v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBIDB extends Consumer5<Long,Boolean,Integer,Double,Boolean>,PConsumer {
      void consume(long v0,boolean v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBIDD extends Consumer5<Long,Boolean,Integer,Double,Double>,PConsumer {
      void consume(long v0,boolean v1,int v2,double v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBIDL extends Consumer5<Long,Boolean,Integer,Double,Long>,PConsumer {
      void consume(long v0,boolean v1,int v2,double v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBILI extends Consumer5<Long,Boolean,Integer,Long,Integer>,PConsumer {
      void consume(long v0,boolean v1,int v2,long v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBILB extends Consumer5<Long,Boolean,Integer,Long,Boolean>,PConsumer {
      void consume(long v0,boolean v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBILD extends Consumer5<Long,Boolean,Integer,Long,Double>,PConsumer {
      void consume(long v0,boolean v1,int v2,long v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBILL extends Consumer5<Long,Boolean,Integer,Long,Long>,PConsumer {
      void consume(long v0,boolean v1,int v2,long v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Integer v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBBII extends Consumer5<Long,Boolean,Boolean,Integer,Integer>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBBIB extends Consumer5<Long,Boolean,Boolean,Integer,Boolean>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBBID extends Consumer5<Long,Boolean,Boolean,Integer,Double>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBBIL extends Consumer5<Long,Boolean,Boolean,Integer,Long>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBBBI extends Consumer5<Long,Boolean,Boolean,Boolean,Integer>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBBBB extends Consumer5<Long,Boolean,Boolean,Boolean,Boolean>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBBBD extends Consumer5<Long,Boolean,Boolean,Boolean,Double>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBBBL extends Consumer5<Long,Boolean,Boolean,Boolean,Long>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBBDI extends Consumer5<Long,Boolean,Boolean,Double,Integer>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBBDB extends Consumer5<Long,Boolean,Boolean,Double,Boolean>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBBDD extends Consumer5<Long,Boolean,Boolean,Double,Double>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBBDL extends Consumer5<Long,Boolean,Boolean,Double,Long>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBBLI extends Consumer5<Long,Boolean,Boolean,Long,Integer>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBBLB extends Consumer5<Long,Boolean,Boolean,Long,Boolean>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBBLD extends Consumer5<Long,Boolean,Boolean,Long,Double>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBBLL extends Consumer5<Long,Boolean,Boolean,Long,Long>,PConsumer {
      void consume(long v0,boolean v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Boolean v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBDII extends Consumer5<Long,Boolean,Double,Integer,Integer>,PConsumer {
      void consume(long v0,boolean v1,double v2,int v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBDIB extends Consumer5<Long,Boolean,Double,Integer,Boolean>,PConsumer {
      void consume(long v0,boolean v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBDID extends Consumer5<Long,Boolean,Double,Integer,Double>,PConsumer {
      void consume(long v0,boolean v1,double v2,int v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBDIL extends Consumer5<Long,Boolean,Double,Integer,Long>,PConsumer {
      void consume(long v0,boolean v1,double v2,int v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBDBI extends Consumer5<Long,Boolean,Double,Boolean,Integer>,PConsumer {
      void consume(long v0,boolean v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBDBB extends Consumer5<Long,Boolean,Double,Boolean,Boolean>,PConsumer {
      void consume(long v0,boolean v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBDBD extends Consumer5<Long,Boolean,Double,Boolean,Double>,PConsumer {
      void consume(long v0,boolean v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBDBL extends Consumer5<Long,Boolean,Double,Boolean,Long>,PConsumer {
      void consume(long v0,boolean v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBDDI extends Consumer5<Long,Boolean,Double,Double,Integer>,PConsumer {
      void consume(long v0,boolean v1,double v2,double v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBDDB extends Consumer5<Long,Boolean,Double,Double,Boolean>,PConsumer {
      void consume(long v0,boolean v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBDDD extends Consumer5<Long,Boolean,Double,Double,Double>,PConsumer {
      void consume(long v0,boolean v1,double v2,double v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBDDL extends Consumer5<Long,Boolean,Double,Double,Long>,PConsumer {
      void consume(long v0,boolean v1,double v2,double v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBDLI extends Consumer5<Long,Boolean,Double,Long,Integer>,PConsumer {
      void consume(long v0,boolean v1,double v2,long v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBDLB extends Consumer5<Long,Boolean,Double,Long,Boolean>,PConsumer {
      void consume(long v0,boolean v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBDLD extends Consumer5<Long,Boolean,Double,Long,Double>,PConsumer {
      void consume(long v0,boolean v1,double v2,long v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBDLL extends Consumer5<Long,Boolean,Double,Long,Long>,PConsumer {
      void consume(long v0,boolean v1,double v2,long v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Double v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBLII extends Consumer5<Long,Boolean,Long,Integer,Integer>,PConsumer {
      void consume(long v0,boolean v1,long v2,int v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBLIB extends Consumer5<Long,Boolean,Long,Integer,Boolean>,PConsumer {
      void consume(long v0,boolean v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBLID extends Consumer5<Long,Boolean,Long,Integer,Double>,PConsumer {
      void consume(long v0,boolean v1,long v2,int v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBLIL extends Consumer5<Long,Boolean,Long,Integer,Long>,PConsumer {
      void consume(long v0,boolean v1,long v2,int v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBLBI extends Consumer5<Long,Boolean,Long,Boolean,Integer>,PConsumer {
      void consume(long v0,boolean v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBLBB extends Consumer5<Long,Boolean,Long,Boolean,Boolean>,PConsumer {
      void consume(long v0,boolean v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBLBD extends Consumer5<Long,Boolean,Long,Boolean,Double>,PConsumer {
      void consume(long v0,boolean v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBLBL extends Consumer5<Long,Boolean,Long,Boolean,Long>,PConsumer {
      void consume(long v0,boolean v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBLDI extends Consumer5<Long,Boolean,Long,Double,Integer>,PConsumer {
      void consume(long v0,boolean v1,long v2,double v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBLDB extends Consumer5<Long,Boolean,Long,Double,Boolean>,PConsumer {
      void consume(long v0,boolean v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBLDD extends Consumer5<Long,Boolean,Long,Double,Double>,PConsumer {
      void consume(long v0,boolean v1,long v2,double v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBLDL extends Consumer5<Long,Boolean,Long,Double,Long>,PConsumer {
      void consume(long v0,boolean v1,long v2,double v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLBLLI extends Consumer5<Long,Boolean,Long,Long,Integer>,PConsumer {
      void consume(long v0,boolean v1,long v2,long v3,int v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLBLLB extends Consumer5<Long,Boolean,Long,Long,Boolean>,PConsumer {
      void consume(long v0,boolean v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLBLLD extends Consumer5<Long,Boolean,Long,Long,Double>,PConsumer {
      void consume(long v0,boolean v1,long v2,long v3,double v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLBLLL extends Consumer5<Long,Boolean,Long,Long,Long>,PConsumer {
      void consume(long v0,boolean v1,long v2,long v3,long v4);
      @Override
      default void accept(Long v0,Boolean v1,Long v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(boolean)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDIII extends Consumer5<Long,Double,Integer,Integer,Integer>,PConsumer {
      void consume(long v0,double v1,int v2,int v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDIIB extends Consumer5<Long,Double,Integer,Integer,Boolean>,PConsumer {
      void consume(long v0,double v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDIID extends Consumer5<Long,Double,Integer,Integer,Double>,PConsumer {
      void consume(long v0,double v1,int v2,int v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDIIL extends Consumer5<Long,Double,Integer,Integer,Long>,PConsumer {
      void consume(long v0,double v1,int v2,int v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDIBI extends Consumer5<Long,Double,Integer,Boolean,Integer>,PConsumer {
      void consume(long v0,double v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDIBB extends Consumer5<Long,Double,Integer,Boolean,Boolean>,PConsumer {
      void consume(long v0,double v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDIBD extends Consumer5<Long,Double,Integer,Boolean,Double>,PConsumer {
      void consume(long v0,double v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDIBL extends Consumer5<Long,Double,Integer,Boolean,Long>,PConsumer {
      void consume(long v0,double v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDIDI extends Consumer5<Long,Double,Integer,Double,Integer>,PConsumer {
      void consume(long v0,double v1,int v2,double v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDIDB extends Consumer5<Long,Double,Integer,Double,Boolean>,PConsumer {
      void consume(long v0,double v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDIDD extends Consumer5<Long,Double,Integer,Double,Double>,PConsumer {
      void consume(long v0,double v1,int v2,double v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDIDL extends Consumer5<Long,Double,Integer,Double,Long>,PConsumer {
      void consume(long v0,double v1,int v2,double v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDILI extends Consumer5<Long,Double,Integer,Long,Integer>,PConsumer {
      void consume(long v0,double v1,int v2,long v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDILB extends Consumer5<Long,Double,Integer,Long,Boolean>,PConsumer {
      void consume(long v0,double v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDILD extends Consumer5<Long,Double,Integer,Long,Double>,PConsumer {
      void consume(long v0,double v1,int v2,long v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDILL extends Consumer5<Long,Double,Integer,Long,Long>,PConsumer {
      void consume(long v0,double v1,int v2,long v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Integer v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDBII extends Consumer5<Long,Double,Boolean,Integer,Integer>,PConsumer {
      void consume(long v0,double v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDBIB extends Consumer5<Long,Double,Boolean,Integer,Boolean>,PConsumer {
      void consume(long v0,double v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDBID extends Consumer5<Long,Double,Boolean,Integer,Double>,PConsumer {
      void consume(long v0,double v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDBIL extends Consumer5<Long,Double,Boolean,Integer,Long>,PConsumer {
      void consume(long v0,double v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDBBI extends Consumer5<Long,Double,Boolean,Boolean,Integer>,PConsumer {
      void consume(long v0,double v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDBBB extends Consumer5<Long,Double,Boolean,Boolean,Boolean>,PConsumer {
      void consume(long v0,double v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDBBD extends Consumer5<Long,Double,Boolean,Boolean,Double>,PConsumer {
      void consume(long v0,double v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDBBL extends Consumer5<Long,Double,Boolean,Boolean,Long>,PConsumer {
      void consume(long v0,double v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDBDI extends Consumer5<Long,Double,Boolean,Double,Integer>,PConsumer {
      void consume(long v0,double v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDBDB extends Consumer5<Long,Double,Boolean,Double,Boolean>,PConsumer {
      void consume(long v0,double v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDBDD extends Consumer5<Long,Double,Boolean,Double,Double>,PConsumer {
      void consume(long v0,double v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDBDL extends Consumer5<Long,Double,Boolean,Double,Long>,PConsumer {
      void consume(long v0,double v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDBLI extends Consumer5<Long,Double,Boolean,Long,Integer>,PConsumer {
      void consume(long v0,double v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDBLB extends Consumer5<Long,Double,Boolean,Long,Boolean>,PConsumer {
      void consume(long v0,double v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDBLD extends Consumer5<Long,Double,Boolean,Long,Double>,PConsumer {
      void consume(long v0,double v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDBLL extends Consumer5<Long,Double,Boolean,Long,Long>,PConsumer {
      void consume(long v0,double v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Boolean v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDDII extends Consumer5<Long,Double,Double,Integer,Integer>,PConsumer {
      void consume(long v0,double v1,double v2,int v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDDIB extends Consumer5<Long,Double,Double,Integer,Boolean>,PConsumer {
      void consume(long v0,double v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDDID extends Consumer5<Long,Double,Double,Integer,Double>,PConsumer {
      void consume(long v0,double v1,double v2,int v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDDIL extends Consumer5<Long,Double,Double,Integer,Long>,PConsumer {
      void consume(long v0,double v1,double v2,int v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDDBI extends Consumer5<Long,Double,Double,Boolean,Integer>,PConsumer {
      void consume(long v0,double v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDDBB extends Consumer5<Long,Double,Double,Boolean,Boolean>,PConsumer {
      void consume(long v0,double v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDDBD extends Consumer5<Long,Double,Double,Boolean,Double>,PConsumer {
      void consume(long v0,double v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDDBL extends Consumer5<Long,Double,Double,Boolean,Long>,PConsumer {
      void consume(long v0,double v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDDDI extends Consumer5<Long,Double,Double,Double,Integer>,PConsumer {
      void consume(long v0,double v1,double v2,double v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDDDB extends Consumer5<Long,Double,Double,Double,Boolean>,PConsumer {
      void consume(long v0,double v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDDDD extends Consumer5<Long,Double,Double,Double,Double>,PConsumer {
      void consume(long v0,double v1,double v2,double v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDDDL extends Consumer5<Long,Double,Double,Double,Long>,PConsumer {
      void consume(long v0,double v1,double v2,double v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDDLI extends Consumer5<Long,Double,Double,Long,Integer>,PConsumer {
      void consume(long v0,double v1,double v2,long v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDDLB extends Consumer5<Long,Double,Double,Long,Boolean>,PConsumer {
      void consume(long v0,double v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDDLD extends Consumer5<Long,Double,Double,Long,Double>,PConsumer {
      void consume(long v0,double v1,double v2,long v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDDLL extends Consumer5<Long,Double,Double,Long,Long>,PConsumer {
      void consume(long v0,double v1,double v2,long v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Double v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDLII extends Consumer5<Long,Double,Long,Integer,Integer>,PConsumer {
      void consume(long v0,double v1,long v2,int v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDLIB extends Consumer5<Long,Double,Long,Integer,Boolean>,PConsumer {
      void consume(long v0,double v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDLID extends Consumer5<Long,Double,Long,Integer,Double>,PConsumer {
      void consume(long v0,double v1,long v2,int v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDLIL extends Consumer5<Long,Double,Long,Integer,Long>,PConsumer {
      void consume(long v0,double v1,long v2,int v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDLBI extends Consumer5<Long,Double,Long,Boolean,Integer>,PConsumer {
      void consume(long v0,double v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDLBB extends Consumer5<Long,Double,Long,Boolean,Boolean>,PConsumer {
      void consume(long v0,double v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDLBD extends Consumer5<Long,Double,Long,Boolean,Double>,PConsumer {
      void consume(long v0,double v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDLBL extends Consumer5<Long,Double,Long,Boolean,Long>,PConsumer {
      void consume(long v0,double v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDLDI extends Consumer5<Long,Double,Long,Double,Integer>,PConsumer {
      void consume(long v0,double v1,long v2,double v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDLDB extends Consumer5<Long,Double,Long,Double,Boolean>,PConsumer {
      void consume(long v0,double v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDLDD extends Consumer5<Long,Double,Long,Double,Double>,PConsumer {
      void consume(long v0,double v1,long v2,double v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDLDL extends Consumer5<Long,Double,Long,Double,Long>,PConsumer {
      void consume(long v0,double v1,long v2,double v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLDLLI extends Consumer5<Long,Double,Long,Long,Integer>,PConsumer {
      void consume(long v0,double v1,long v2,long v3,int v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLDLLB extends Consumer5<Long,Double,Long,Long,Boolean>,PConsumer {
      void consume(long v0,double v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLDLLD extends Consumer5<Long,Double,Long,Long,Double>,PConsumer {
      void consume(long v0,double v1,long v2,long v3,double v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLDLLL extends Consumer5<Long,Double,Long,Long,Long>,PConsumer {
      void consume(long v0,double v1,long v2,long v3,long v4);
      @Override
      default void accept(Long v0,Double v1,Long v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(double)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLIII extends Consumer5<Long,Long,Integer,Integer,Integer>,PConsumer {
      void consume(long v0,long v1,int v2,int v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLIIB extends Consumer5<Long,Long,Integer,Integer,Boolean>,PConsumer {
      void consume(long v0,long v1,int v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLIID extends Consumer5<Long,Long,Integer,Integer,Double>,PConsumer {
      void consume(long v0,long v1,int v2,int v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLIIL extends Consumer5<Long,Long,Integer,Integer,Long>,PConsumer {
      void consume(long v0,long v1,int v2,int v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLIBI extends Consumer5<Long,Long,Integer,Boolean,Integer>,PConsumer {
      void consume(long v0,long v1,int v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLIBB extends Consumer5<Long,Long,Integer,Boolean,Boolean>,PConsumer {
      void consume(long v0,long v1,int v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLIBD extends Consumer5<Long,Long,Integer,Boolean,Double>,PConsumer {
      void consume(long v0,long v1,int v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLIBL extends Consumer5<Long,Long,Integer,Boolean,Long>,PConsumer {
      void consume(long v0,long v1,int v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLIDI extends Consumer5<Long,Long,Integer,Double,Integer>,PConsumer {
      void consume(long v0,long v1,int v2,double v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLIDB extends Consumer5<Long,Long,Integer,Double,Boolean>,PConsumer {
      void consume(long v0,long v1,int v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLIDD extends Consumer5<Long,Long,Integer,Double,Double>,PConsumer {
      void consume(long v0,long v1,int v2,double v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLIDL extends Consumer5<Long,Long,Integer,Double,Long>,PConsumer {
      void consume(long v0,long v1,int v2,double v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLILI extends Consumer5<Long,Long,Integer,Long,Integer>,PConsumer {
      void consume(long v0,long v1,int v2,long v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLILB extends Consumer5<Long,Long,Integer,Long,Boolean>,PConsumer {
      void consume(long v0,long v1,int v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLILD extends Consumer5<Long,Long,Integer,Long,Double>,PConsumer {
      void consume(long v0,long v1,int v2,long v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLILL extends Consumer5<Long,Long,Integer,Long,Long>,PConsumer {
      void consume(long v0,long v1,int v2,long v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Integer v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(int)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLBII extends Consumer5<Long,Long,Boolean,Integer,Integer>,PConsumer {
      void consume(long v0,long v1,boolean v2,int v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLBIB extends Consumer5<Long,Long,Boolean,Integer,Boolean>,PConsumer {
      void consume(long v0,long v1,boolean v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLBID extends Consumer5<Long,Long,Boolean,Integer,Double>,PConsumer {
      void consume(long v0,long v1,boolean v2,int v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLBIL extends Consumer5<Long,Long,Boolean,Integer,Long>,PConsumer {
      void consume(long v0,long v1,boolean v2,int v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLBBI extends Consumer5<Long,Long,Boolean,Boolean,Integer>,PConsumer {
      void consume(long v0,long v1,boolean v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLBBB extends Consumer5<Long,Long,Boolean,Boolean,Boolean>,PConsumer {
      void consume(long v0,long v1,boolean v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLBBD extends Consumer5<Long,Long,Boolean,Boolean,Double>,PConsumer {
      void consume(long v0,long v1,boolean v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLBBL extends Consumer5<Long,Long,Boolean,Boolean,Long>,PConsumer {
      void consume(long v0,long v1,boolean v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLBDI extends Consumer5<Long,Long,Boolean,Double,Integer>,PConsumer {
      void consume(long v0,long v1,boolean v2,double v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLBDB extends Consumer5<Long,Long,Boolean,Double,Boolean>,PConsumer {
      void consume(long v0,long v1,boolean v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLBDD extends Consumer5<Long,Long,Boolean,Double,Double>,PConsumer {
      void consume(long v0,long v1,boolean v2,double v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLBDL extends Consumer5<Long,Long,Boolean,Double,Long>,PConsumer {
      void consume(long v0,long v1,boolean v2,double v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLBLI extends Consumer5<Long,Long,Boolean,Long,Integer>,PConsumer {
      void consume(long v0,long v1,boolean v2,long v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLBLB extends Consumer5<Long,Long,Boolean,Long,Boolean>,PConsumer {
      void consume(long v0,long v1,boolean v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLBLD extends Consumer5<Long,Long,Boolean,Long,Double>,PConsumer {
      void consume(long v0,long v1,boolean v2,long v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLBLL extends Consumer5<Long,Long,Boolean,Long,Long>,PConsumer {
      void consume(long v0,long v1,boolean v2,long v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Boolean v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(boolean)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLDII extends Consumer5<Long,Long,Double,Integer,Integer>,PConsumer {
      void consume(long v0,long v1,double v2,int v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLDIB extends Consumer5<Long,Long,Double,Integer,Boolean>,PConsumer {
      void consume(long v0,long v1,double v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLDID extends Consumer5<Long,Long,Double,Integer,Double>,PConsumer {
      void consume(long v0,long v1,double v2,int v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLDIL extends Consumer5<Long,Long,Double,Integer,Long>,PConsumer {
      void consume(long v0,long v1,double v2,int v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLDBI extends Consumer5<Long,Long,Double,Boolean,Integer>,PConsumer {
      void consume(long v0,long v1,double v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLDBB extends Consumer5<Long,Long,Double,Boolean,Boolean>,PConsumer {
      void consume(long v0,long v1,double v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLDBD extends Consumer5<Long,Long,Double,Boolean,Double>,PConsumer {
      void consume(long v0,long v1,double v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLDBL extends Consumer5<Long,Long,Double,Boolean,Long>,PConsumer {
      void consume(long v0,long v1,double v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLDDI extends Consumer5<Long,Long,Double,Double,Integer>,PConsumer {
      void consume(long v0,long v1,double v2,double v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLDDB extends Consumer5<Long,Long,Double,Double,Boolean>,PConsumer {
      void consume(long v0,long v1,double v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLDDD extends Consumer5<Long,Long,Double,Double,Double>,PConsumer {
      void consume(long v0,long v1,double v2,double v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLDDL extends Consumer5<Long,Long,Double,Double,Long>,PConsumer {
      void consume(long v0,long v1,double v2,double v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLDLI extends Consumer5<Long,Long,Double,Long,Integer>,PConsumer {
      void consume(long v0,long v1,double v2,long v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLDLB extends Consumer5<Long,Long,Double,Long,Boolean>,PConsumer {
      void consume(long v0,long v1,double v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLDLD extends Consumer5<Long,Long,Double,Long,Double>,PConsumer {
      void consume(long v0,long v1,double v2,long v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLDLL extends Consumer5<Long,Long,Double,Long,Long>,PConsumer {
      void consume(long v0,long v1,double v2,long v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Double v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(double)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLLII extends Consumer5<Long,Long,Long,Integer,Integer>,PConsumer {
      void consume(long v0,long v1,long v2,int v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Integer v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLLIB extends Consumer5<Long,Long,Long,Integer,Boolean>,PConsumer {
      void consume(long v0,long v1,long v2,int v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Integer v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLLID extends Consumer5<Long,Long,Long,Integer,Double>,PConsumer {
      void consume(long v0,long v1,long v2,int v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Integer v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLLIL extends Consumer5<Long,Long,Long,Integer,Long>,PConsumer {
      void consume(long v0,long v1,long v2,int v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Integer v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(int)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLLBI extends Consumer5<Long,Long,Long,Boolean,Integer>,PConsumer {
      void consume(long v0,long v1,long v2,boolean v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Boolean v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLLBB extends Consumer5<Long,Long,Long,Boolean,Boolean>,PConsumer {
      void consume(long v0,long v1,long v2,boolean v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Boolean v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLLBD extends Consumer5<Long,Long,Long,Boolean,Double>,PConsumer {
      void consume(long v0,long v1,long v2,boolean v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Boolean v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLLBL extends Consumer5<Long,Long,Long,Boolean,Long>,PConsumer {
      void consume(long v0,long v1,long v2,boolean v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Boolean v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(boolean)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLLDI extends Consumer5<Long,Long,Long,Double,Integer>,PConsumer {
      void consume(long v0,long v1,long v2,double v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Double v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLLDB extends Consumer5<Long,Long,Long,Double,Boolean>,PConsumer {
      void consume(long v0,long v1,long v2,double v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Double v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLLDD extends Consumer5<Long,Long,Long,Double,Double>,PConsumer {
      void consume(long v0,long v1,long v2,double v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Double v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLLDL extends Consumer5<Long,Long,Long,Double,Long>,PConsumer {
      void consume(long v0,long v1,long v2,double v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Double v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(double)requireNonNull(v3),(long)requireNonNull(v4));
       }
}
interface CuLLLLI extends Consumer5<Long,Long,Long,Long,Integer>,PConsumer {
      void consume(long v0,long v1,long v2,long v3,int v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Long v3,Integer v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(int)requireNonNull(v4));
       }
}
interface CuLLLLB extends Consumer5<Long,Long,Long,Long,Boolean>,PConsumer {
      void consume(long v0,long v1,long v2,long v3,boolean v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Long v3,Boolean v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(boolean)requireNonNull(v4));
       }
}
interface CuLLLLD extends Consumer5<Long,Long,Long,Long,Double>,PConsumer {
      void consume(long v0,long v1,long v2,long v3,double v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Long v3,Double v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(double)requireNonNull(v4));
       }
}
interface CuLLLLL extends Consumer5<Long,Long,Long,Long,Long>,PConsumer {
      void consume(long v0,long v1,long v2,long v3,long v4);
      @Override
      default void accept(Long v0,Long v1,Long v2,Long v3,Long v4) {
          consume((long)requireNonNull(v0),(long)requireNonNull(v1),(long)requireNonNull(v2),(long)requireNonNull(v3),(long)requireNonNull(v4));
       }
}

}
