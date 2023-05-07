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

package cn.zenliu.units.enhancer.make;

import lombok.AllArgsConstructor;
import lombok.Value;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.method.ParameterList;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.*;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.InstanceCheck;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate;
import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate;
import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.collection.ArrayLength;
import net.bytebuddy.implementation.bytecode.constant.*;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Opcodes;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiFunction;

import static cn.zenliu.units.enhancer.make.Manipulate.Simple.*;
import static net.bytebuddy.matcher.ElementMatchers.isAbstract;
import static net.bytebuddy.matcher.ElementMatchers.named;

@SuppressWarnings("unused")
public class Compute implements ByteCodeManipulates {
    @Value
    @AllArgsConstructor
    static class Frame {
        int op;
        List<TypeDescription> locals;
        List<TypeDescription> stack;
        Frame pre;


        public Frame(Compute assembler) {
            this(Integer.MIN_VALUE,
                    new ArrayList<>(assembler.locals),
                    new ArrayList<>(assembler.stack),
                    assembler.initial);
        }


        public Frame differ(Frame last) {
            if (last == null) return this;
            boolean sameLocal = last.locals.equals(locals);
            boolean sameStack = stack.equals(last.stack);
            if (sameLocal && sameStack) {
                //SAME
                return new Frame(Opcodes.F_SAME, Collections.emptyList(), Collections.emptyList(), last);
            }
            if (stack.isEmpty() && !sameLocal) {
                int diff = locals.size() - last.locals.size();
                if (diff > 0 && diff <= 3) {
                    if (locals.subList(0, locals.size() - diff).equals(last.locals)) {
                        return new Frame(Opcodes.F_APPEND, locals.subList(locals.size() - diff, locals.size()), Collections.emptyList(), last);
                    }
                } else if (diff >= -3 && diff < 0) {
                    if (last.locals.subList(0, last.locals.size() - diff).equals(locals)) {
                        return new Frame(Opcodes.F_CHOP, last.locals.subList(last.locals.size() - diff, last.locals.size()), Collections.emptyList(), last);
                    }
                }
            }
            if (sameLocal && stack.size() == 1) {
                //SAME 1
                return new Frame(Opcodes.F_SAME1, Collections.emptyList(), stack, last);
            }
            return new Frame(Opcodes.F_FULL, locals, stack, last);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Frame frame = (Frame) o;
            return op == frame.op && Objects.equals(locals, frame.locals) && Objects.equals(stack, frame.stack);
        }

        @Override
        public int hashCode() {
            return Objects.hash(op, locals, stack);
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Frame.class.getSimpleName() + "[", "]")
                    .add("op=" + (
                                    op == Opcodes.F_NEW ? "F_NEW" :
                                            op == Opcodes.F_FULL ? "F_FULL" :
                                                    op == Opcodes.F_APPEND ? "F_APPEND" :
                                                            op == Opcodes.F_CHOP ? "F_CHOP" :
                                                                    op == Opcodes.F_SAME ? "F_SAME" :
                                                                            op == Opcodes.F_SAME1 ? "F_SAME1" :
                                                                                    op == Integer.MAX_VALUE ? "INITIAL" :
                                                                                            op == Integer.MIN_VALUE ? "NONE_CALCULATED" :
                                                                                                    "UNKNOWN<" + op + ">"
                            )
                    )
                    .add("locals=" + locals)
                    .add("stack=" + stack)
                    .add("pre=" + (pre == null ? "NULL" : pre == this ? "SELF" : pre))
                    .toString();
        }
    }


    final Stack<ByteCodeAppender> manipulates = new Stack<>();
    final Stack<StackManipulation> operates = new Stack<>();
    final Stack<TypeDescription> locals = new Stack<>();
    final Stack<TypeDescription> stack = new Stack<>();
    final Map<Label, Frame> frame = new HashMap<>();
    final Frame initial;
    private final TypeDescription target;
    private final MethodDescription method;
    private final int offset;

    public Compute(TypeDescription target, @Nullable MethodDescription method) {
        this.target = target;
        this.method = method;
        if (method != null && !method.isStatic()) locals.push(target);
        if (method != null) method.getParameters().asTypeList().forEach(x -> locals.push(x.asErasure()));
        this.offset = (method != null ? (method.isStatic() ? 0 : 1) + (method.getParameters().size()) : 0);
        initial = new Frame(Integer.MAX_VALUE, new ArrayList<>(locals), Collections.emptyList(), null);
    }

    private static boolean notAssignable(TypeDescription a, TypeDescription b) {
        // if(a.represents(Object.class)&&b.isAssignableTo(TypeDescription.ForLoadedType.of(Object.class))) return true;
        return b == INT_LIKE ? !b.isAssignableFrom(a) : !a.isAssignableTo(b);
    }

    private boolean require(boolean pop, int amount, TypeDescription... types) {
        if (stack.size() < amount) return false;
        int index = stack.size() - amount;
        if (types.length == 0) {
            return true;
        }
        boolean result = true;
        if (types.length == 1) {
            for (int i = 0; i < amount; i++) {
                if (notAssignable(stack.get(index), types[0])) return false;
                index++;
            }
        } else if (types.length == amount) {
            for (int i = 0; i < amount; i++) {
                if (notAssignable(stack.get(index), types[i])) return false;
                index++;
            }
        }
        if (pop) stack.removeElement(stack.size() - amount, stack.size());
        return result;

    }

    private void pushIn(TypeDescription type) {
        stack.push(type);
    }

    private TypeDescription popOut() {
        assert require(false, 1) : "invalid stack size for pop one";
        return stack.pop();
    }

    public Compute append(ByteCodeAppender operate) {
        manipulates.push(operate);
        return this;
    }

    private void append(StackManipulation operate) {
        operates.push(operate);
    }

    private void clearOperates() {
        if (!operates.isEmpty()) {
            append(new ByteCodeAppender.Simple(new ArrayList<>(operates)));
            operates.clear();
        }
    }

    /**
     * add a Manual fragment
     *
     * @param action the generator consumer current locals and stack returns appending ByteCodeAppender
     */
    public Compute manual(BiFunction<Stack<TypeDescription>, Stack<TypeDescription>, ByteCodeAppender> action) {
        clearOperates();
        manipulates.push(action.apply(locals, stack));
        return this;
    }

    //region Mathematical
    public Compute add() {
        if (require(true, 2, INT_LIKE)) {
            append(Addition.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(Addition.LONG);
            pushIn(LONG);
        } else if (require(true, 2, FLOAT)) {
            append(Addition.FLOAT);
            pushIn(FLOAT);
        } else if (require(true, 2, DOUBLE)) {
            append(Addition.DOUBLE);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Addition requirement");
        return this;
    }

    public Compute sub() {
        if (require(true, 2, INT_LIKE)) {
            append(Subtraction.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(Subtraction.LONG);
            pushIn(LONG);
        } else if (require(true, 2, FLOAT)) {
            append(Subtraction.FLOAT);
            pushIn(FLOAT);
        } else if (require(true, 2, DOUBLE)) {
            append(Subtraction.DOUBLE);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Subtraction requirement");
        return this;
    }

    public Compute mul() {
        if (require(true, 2, INT_LIKE)) {
            append(Multiplication.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(Multiplication.LONG);
            pushIn(LONG);
        } else if (require(true, 2, FLOAT)) {
            append(Multiplication.FLOAT);
            pushIn(FLOAT);
        } else if (require(true, 2, DOUBLE)) {
            append(Multiplication.DOUBLE);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Multiplication requirement");
        return this;
    }

    public Compute div() {
        if (require(true, 2, INT_LIKE)) {
            append(Division.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(Division.LONG);
            pushIn(LONG);
        } else if (require(true, 2, FLOAT)) {
            append(Division.FLOAT);
            pushIn(FLOAT);
        } else if (require(true, 2, DOUBLE)) {
            append(Division.DOUBLE);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Division requirement");
        return this;
    }

    public Compute rem() {
        if (require(true, 2, INT_LIKE)) {
            append(Remainder.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(Remainder.LONG);
            pushIn(LONG);
        } else if (require(true, 2, FLOAT)) {
            append(Remainder.FLOAT);
            pushIn(FLOAT);
        } else if (require(true, 2, DOUBLE)) {
            append(Remainder.DOUBLE);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Remainder requirement");
        return this;
    }

    public Compute neg() {
        if (require(true, 1, INT_NUM_LIKE)) {
            append(INEG);
            pushIn(INT);
        } else if (require(true, 1, LONG)) {
            append(LNEG);
            pushIn(LONG);
        } else if (require(true, 1, FLOAT)) {
            append(FNEG);
            pushIn(FLOAT);
        } else if (require(true, 1, DOUBLE)) {
            append(DNEG);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Negative requirement");
        return this;
    }

    public Compute shl() {
        if (require(true, 2, INT_NUM_LIKE)) {
            append(ShiftLeft.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(ShiftLeft.LONG);
            pushIn(LONG);
        } else throw new IllegalArgumentException("top two value on stack not match any ShiftLeft requirement");
        return this;
    }

    public Compute shr() {
        if (require(true, 2, INT_NUM_LIKE)) {
            append(ShiftRight.INTEGER);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(ShiftRight.LONG);
            pushIn(LONG);
        } else throw new IllegalArgumentException("top two value on stack not match any ShiftRight requirement");
        return this;
    }

    public Compute or() {
        if (require(true, 2, INT_NUM_LIKE)) {
            append(IOR);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(LOR);
            pushIn(LONG);
        } else throw new IllegalArgumentException("top two value on stack not match any bitwise OR requirement");
        return this;
    }

    public Compute xor() {
        if (require(true, 2, INT_NUM_LIKE)) {
            append(IXOR);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(LXOR);
            pushIn(LONG);
        } else throw new IllegalArgumentException("top two value on stack not match any bitwise XOR requirement");
        return this;
    }

    public Compute and() {
        if (require(true, 2, INT_NUM_LIKE)) {
            append(IAND);
            pushIn(INT);
        } else if (require(true, 2, LONG)) {
            append(LAND);
            pushIn(LONG);
        } else throw new IllegalArgumentException("top two value on stack not match any bitwise AND requirement");
        return this;
    }


    //endregion
    //region Comparative and Jump
    public Compute cmp(boolean nanBigger) {
        if (require(true, 2, LONG)) {
            append(LCMP);
            pushIn(LONG);
        }
        if (require(true, 2, FLOAT)) {
            append(nanBigger ? FCMPG : FCMPL);
            pushIn(FLOAT);
        }
        if (require(true, 2, DOUBLE)) {
            append(nanBigger ? DCMPG : DCMPL);
            pushIn(DOUBLE);
        } else throw new IllegalArgumentException("top two value on stack not match any Comparative requirement");
        return this;
    }

    private boolean checkOld(Label label, Frame current) {
        Frame old = frame.get(label);
        if (old == null) return true;
        return old.equals(current);
    }

    private Frame calc(Label from, Label to) {
        if (to == null && from == null) return null;
        Frame current = new Frame(this);
        if (to != null && from != null) { //forward jump
            Frame last = frame.get(from);
            assert last != null : "missing from label frame";
            Frame old = frame.get(to);
            Frame differ = current.differ(last);
            assert old == null || differ.equals(old) : "invalid Frame from last jump location: current " + differ + " vs old " + old;
            frame.put(to, differ);
            return differ;
        } else if (to != null) {//back jump
            current = current.differ(initial);
            assert checkOld(to, current) : "invalid backward jump frame: old " + frame.get(to) + " vs " + current;
            frame.put(to, current);
            return current;
        } else {
            frame.put(from, current.differ(initial));
            return current;
        }
    }

    /**
     * Calc Frame with initial frame
     */
    private Frame calc(Label to) {
        Frame current = new Frame(this);
        Frame old = frame.get(to);
        Frame differ = current.differ(initial);
        assert old == null || differ.equals(old) : "invalid Frame from last jump location: " + old + " vs " + differ;
        frame.put(to, differ);
        return differ;
    }


    //@formatter:off

    /**
     * Jump from on Frame to Other frame
     *
     * @param from from Frame label ;null for backwards jump.
     * @param to   to Frame label
     */
    public Compute jump(Label from, Label to) {
        calc(from, to);
        append(GOTO.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jz(Label from, Label to) {
        assert require(false, 1, INT_LIKE) : "stack required one Integer";
        popOut();
        calc(from, to);
        append(IFEQ.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jnz(Label from, Label to) {
        assert require(false, 1, INT_LIKE) : "stack required one Integer";
        popOut();
        calc(from, to);
        append(IFNE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jlez(Label from, Label to) {
        assert require(false, 1, INT_LIKE) : "stack required one Integer";
        popOut();
        calc(from, to);
        append(IFLE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jgez(Label from, Label to) {
        assert require(false, 1, INT_LIKE) : "stack required one Integer";
        popOut();
        calc(from, to);
        append(IFGE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jltz(Label from, Label to) {
        assert require(false, 1, INT_LIKE) : "stack required one Integer";
        popOut();
        calc(from, to);
        append(IFLT.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jgtz(Label from, Label to) {
        assert require(false, 1, INT_LIKE) : "stack required one Integer";
        popOut();
        calc(from, to);
        append(IFGT.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute je(Label from, Label to) {
        assert require(false, 2, INT_LIKE) : "stack required two Integer";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ICMPEQ.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jn(Label from, Label to) {
        assert require(false, 2, INT_LIKE) : "stack required two Integer";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ICMPNE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jle(Label from, Label to) {
        assert require(false, 2, INT_LIKE) : "stack required two Integer";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ICMPLE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jge(Label from, Label to) {
        assert require(false, 2, INT_LIKE) : "stack required two Integer";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ICMPGE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jlt(Label from, Label to) {
        assert require(false, 2, INT_LIKE) : "stack required two Integer";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ICMPLT.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jgt(Label from, Label to) {
        assert require(false, 2, INT_LIKE) : "stack required two Integer";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ICMPGT.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jea(Label from, Label to) {
        assert require(false, 2, TypeDescription.ForLoadedType.of(Object.class)) : "stack required two Object";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ACMPEQ.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jna(Label from, Label to) {
        assert require(false, 2, TypeDescription.ForLoadedType.of(Object.class)) : "stack required two Object";
        popOut();
        popOut();
        calc(from, to);
        append(IF_ACMPNE.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jen(Label from, Label to) {
        assert require(false, 1, TypeDescription.ForLoadedType.of(Object.class)) : "stack required one Object";
        popOut();
        popOut();
        calc(from, to);
        append(IFNULL.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute jnn(Label from, Label to) {
        assert require(false, 1, TypeDescription.ForLoadedType.of(Object.class)) : "stack required one Object";
        popOut();
        popOut();
        calc(from, to);
        append(IFNONNULL.apply(to));
        return this;
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute goTo(Label from, Label to) {
        return jump(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifEQ(Label from, Label to) {
        return jz(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifNE(Label from, Label to) {
        return jnz(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifLE(Label from, Label to) {
        return jlez(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifGE(Label from, Label to) {
        return jgez(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifLT(Label from, Label to) {
        return jltz(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifGT(Label from, Label to) {
        return jgtz(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifCmpEQ(Label from, Label to) {
        return je(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifCmpNE(Label from, Label to) {
        return jn(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifCmpLT(Label from, Label to) {
        return jlt(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifCmpLE(Label from, Label to) {
        return jle(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifCmpGT(Label from, Label to) {
        return jgt(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifCmpGE(Label from, Label to) {
        return jge(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifAEQ(Label from, Label to) {
        return jea(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifANE(Label from, Label to) {
        return jna(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifNull(Label from, Label to) {
        return jen(from, to);
    }

    /**
     * @see #jump(Label, Label)
     **/
    public Compute ifNonNull(Label from, Label to) {
        return jnn(from, to);
    }


    //@formatter:on

    //endregion
    //region Label

    /**
     * Manual define label and Frame Map
     *
     * @param label     the label
     * @param frameType the FrameMapType in {@link Opcodes#F_FULL} to {@link Opcodes#F_SAME1} [0,4] or value greater than 4 for not use Frame Map
     * @param local     local for frameType
     * @param stack     stack for FrameType
     */
    public Compute labelManual(Label label, int frameType, List<TypeDescription> local, List<TypeDescription> stack) {
        assert frameType >= 0 : "invalid frame type " + frameType;
        append(Manipulate.LABEL(label, frameType, local, stack));
        return this;
    }

    /**
     * declare label and compute frame against initial frame
     *
     * @param label current label
     */
    public Compute labelComputeInit(Label label) {
        Frame frm = calc(label);
        append(Manipulate.LABEL(label, frm.op, frm.locals, frm.stack));
        return this;
    }

    /**
     * declare label and compute frame against pre declared one
     *
     * @param from  predefined label
     * @param label current label
     */
    public Compute labelCompute(Label from, Label label) {
        Frame frm = calc(from, label);
        append(Manipulate.LABEL(label, frm.op, frm.locals, frm.stack));
        return this;
    }

    /**
     * declare a label and compute frame against last jump point
     *
     * @param lbl the label
     */
    public Compute label(Label lbl) {
        Frame frm = frame.remove(lbl);
        assert frm != null : "empty frame for label";
        append(Manipulate.LABEL(lbl, frm.op, frm.locals, frm.stack));
        return this;
    }

    //endregion

    //region Locals and Stack
    public Compute swap() {
        assert require(false, 2) : "empty stack for swap";
        TypeDescription t1 = popOut();
        TypeDescription t2 = popOut();
        assert t1.getStackSize() == StackSize.SINGLE && t2.getStackSize() == StackSize.SINGLE : "swap only support single size value";
        append(SWAP);
        pushIn(t1);
        pushIn(t2);
        return this;
    }

    public Compute pop() {
        assert require(false, 1) : "empty stack for pop";
        append(Removal.of(popOut()));
        return this;
    }

    public Compute dup() {
        assert require(false, 1) : "empty stack for Duplication";
        TypeDescription t = popOut();
        append(Duplication.of(t));
        pushIn(t);
        pushIn(t);
        return this;
    }

    public Compute dupFlip() {
        assert require(false, 2) : "empty stack for Duplication and FlipOver";
        TypeDescription t1 = popOut();
        TypeDescription t2 = popOut();
        append(Duplication.of(t1).flipOver(t2));
        pushIn(t1);
        pushIn(t2);
        pushIn(t1);
        return this;
    }

    public Compute loadThis() {
        append(MethodVariableAccess.loadThis());
        pushIn(target);
        return this;
    }

    public Compute loadLocal(int vi) {
        int x = vi + offset;
        assert x < locals.size() : "invalid local as offset " + vi;
        assert locals.get(x) != TOP : "invalid local as offset " + vi + " which is part of DOUBLE size value";
        append(MethodVariableAccess.of(locals.get(x)).loadFrom(x));
        pushIn(locals.get(x));
        return this;
    }

    public Compute storeLocal() {
        TypeDescription type = popOut();
        if (type.getStackSize().getSize() == 2) {
            locals.push(TOP);
        }
        locals.push(type);
        append(MethodVariableAccess.of(type).storeAt(locals.size() - 1));

        return this;
    }

    public Compute storeLocal(int vi) {
        int x = vi + offset;
        assert x < locals.size() : "invalid local as offset " + vi;
        TypeDescription type = popOut();
        {
            TypeDescription local = locals.get(x);
            assert type.isAssignableTo(local) : "incompatible local variable type: " + type + " and " + local;
        }
        append(MethodVariableAccess.of(type).storeAt(x));
        return this;
    }

    public Compute loadParameter(int vi) {
        assert method != null : "invalid without parameters";
        assert method.getParameters().size() > vi : "invalid without enough parameters";
        int x = vi + (method.isStatic() ? 0 : 1);
        assert x < locals.size() : "invalid local as offset " + vi;
        ParameterDescription param = method.getParameters().get(vi);
        append(MethodVariableAccess.load(param));
        pushIn(param.getType().asErasure());
        return this;
    }

    public Compute readField(String name) {
        assert target != null : "no target type";
        FieldDescription.InDefinedShape field = target.getDeclaredFields().filter(named(name)).getOnly();
        assert (field.isStatic() && (method == null || method.isStatic())) || (method != null && !method.isStatic()) : "invalid access field ";
        if (!field.isStatic()) {
            assert require(false, 1, target) : "require target on stack";
            popOut();
        }
        append(FieldAccess.forField(field).read());
        pushIn(field.getType().asErasure());
        return this;
    }

    public Compute readField(FieldDescription field) {
        if (!field.isStatic()) {
            assert require(false, 1, field.getDeclaringType().asErasure()) : "require target on stack";
            popOut();
        }
        append(FieldAccess.forField(field).read());
        pushIn(field.getType().asErasure());
        return this;
    }

    public Compute writeField(FieldDescription field) {
        assert require(false, 1, field.getType().asErasure()) : "require value with match type on stack";
        popOut();//value
        if (!field.isStatic()) {
            assert require(false, 1, field.getDeclaringType().asErasure()) : "require target on stack";
            popOut(); //instance
        }
        append(FieldAccess.forField(field).write());
        return this;
    }

    public Compute writeField(String name) {
        assert target != null : "no target type";
        FieldDescription.InDefinedShape field = target.getDeclaredFields().filter(named(name)).getOnly();
        assert (field.isStatic() && (method == null || method.isStatic())) || (method != null && !method.isStatic()) : "invalid access field ";
        assert require(false, 1, field.getType().asErasure()) : "require value with match type on stack";
        popOut();//value
        if (!field.isStatic()) {
            assert require(false, 1, target) : "require target on stack";
            popOut();
        }
        append(FieldAccess.forField(field).write());
        return this;
    }

    //endregion
    //region Type
    public Compute creation(TypeDescription type) {
        append(TypeCreation.of(type));
        pushIn(type);
        return this;
    }

    public Compute cast(TypeDescription type, boolean... unsafe) {
        assert require(false, 1) : "cast on empty stack";
        TypeDescription t = popOut();
        assert unsafe.length != 0 || t.isAssignableTo(type) : "cast unsafe";
        append(TypeCasting.to(type));
        pushIn(type);
        return this;
    }

    public Compute box() {
        assert require(false, 1) : "box on empty stack";
        TypeDescription t = popOut();
        assert t.isPrimitive() : "none primitive type for box";
        assert !t.isAssignableTo(void.class) : "void type for unbox";
        append(PrimitiveBoxingDelegate.forPrimitive(t).assignBoxedTo(
                TypeDescription.ForLoadedType.of(Object.class).asGenericType(),
                Assigner.DEFAULT,
                Assigner.Typing.STATIC
        ));
        pushIn(t.asBoxed());
        return this;
    }

    public Compute unbox() {
        assert require(false, 1) : "unbox on empty stack";
        TypeDescription t = popOut();
        assert !t.isPrimitive() : "primitive type for unbox";
        assert !t.isAssignableTo(Void.class) : "void type for unbox";
        append(PrimitiveUnboxingDelegate.forReferenceType(t)
                .assignUnboxedTo(t.asUnboxed().asGenericType(),
                        Assigner.GENERICS_AWARE,
                        Assigner.Typing.DYNAMIC));
        pushIn(t.asUnboxed());
        return this;
    }

    public Compute instanceOf(TypeDescription type) {
        assert require(false, 1) : "instanceOf on empty stack";
        TypeDescription t = popOut();
        assert !t.isPrimitive() : "primitive type for instanceOf";
        assert !t.isAssignableTo(Void.class) : "void type for instanceOf";
        append(InstanceCheck.of(type));
        pushIn(INT);
        return this;
    }

    //endregion
    //region Array

    public Compute array(TypeDescription.Generic component, StackManipulation... values) {
        append(ArrayFactory.forType(component).withValues(Arrays.asList(values)));
        pushIn(TypeDescription.ArrayProjection.of(component.asErasure()));
        return this;
    }

    public Compute array(TypeDescription.Generic component, List<StackManipulation> values) {
        append(ArrayFactory.forType(component).withValues(values));
        pushIn(TypeDescription.ArrayProjection.of(component.asErasure()));
        return this;
    }

    public Compute arraySet() {
        assert require(false, 3) : "operand not 3 for array set";
        TypeDescription val = popOut();
        TypeDescription idx = popOut();
        TypeDescription ar = popOut();
        assert INT_NUM_LIKE.isAssignableTo(idx) : "invalid index type " + idx;
        assert ar.isArray() : "invalid array type " + ar;
        assert Objects.requireNonNull(ar.getComponentType()).isAssignableFrom(val) : "invalid value type " + val;
        append(ArrayAccess.of(ar).store());
        return this;
    }

    public Compute arrayGet() {
        assert require(false, 2) : "operand not 2 for array get";
        TypeDescription idx = popOut();
        TypeDescription ar = popOut();
        assert INT_NUM_LIKE.isAssignableTo(idx) : "invalid index type " + idx;
        assert ar.isArray() : "invalid array type " + ar;
        append(ArrayAccess.of(ar).load());
        pushIn(ar.getComponentType());
        return this;
    }

    public Compute arrayLength() {
        assert require(false, 1) : "operand lesser than 1 for array length";
        TypeDescription ar = popOut();
        assert ar.isArray() : "invalid array type " + ar;
        append(ArrayLength.INSTANCE);
        pushIn(ar.getComponentType());
        return this;
    }

    //endregion
    //region Terminate
    public Compute aThrow() {
        assert require(false, 1, TypeDescription.ForLoadedType.of(Throwable.class)) : "invalid stack to aThrow";
        append(ATHROW);
        return this;
    }

    public Compute returns() {
        assert method != null : "not method";
        if (method.getReturnType().asErasure().isAssignableTo(void.class)) {
            append(MethodReturn.VOID);
            return this;
        }
        assert require(false, 1) : "not value to return";
        TypeDescription t = popOut();
        assert t.isAssignableTo(method.getReturnType().asErasure()) : "invalid return type " + t;
        append(MethodReturn.of(t));
        return this;
    }


    //endregion

    //region Constant
    public Compute constNull(TypeDescription type) {
        append(NullConstant.INSTANCE);
        pushIn(type);
        return this;
    }

    public Compute constant(String text) {
        append(new TextConstant(text));
        pushIn(TypeDescription.ForLoadedType.of(String.class));
        return this;
    }

    //@formatter:off
    public Compute defaultValue(TypeDescription type) {
        append(DefaultValue.of(type));
        pushIn(type);
        return this;
    }

    public Compute constant(int val) {
        append(IntegerConstant.forValue(val));
        pushIn(INT);
        return this;
    }

    public Compute constant(char val) {
        append(IntegerConstant.forValue(val));
        pushIn(CHAR);
        return this;
    }

    public Compute constant(byte val) {
        append(IntegerConstant.forValue(val));
        pushIn(BYTE);
        return this;
    }

    public Compute constant(short val) {
        append(IntegerConstant.forValue(val));
        pushIn(SHORT);
        return this;
    }

    public Compute constant(boolean val) {
        append(IntegerConstant.forValue(val));
        pushIn(BOOL);
        return this;
    }

    public Compute constant(long val) {
        append(LongConstant.forValue(val));
        pushIn(LONG);
        return this;
    }

    public Compute constant(float val) {
        append(FloatConstant.forValue(val));
        pushIn(FLOAT);
        return this;
    }

    public Compute constant(double val) {
        append(DoubleConstant.forValue(val));
        pushIn(DOUBLE);
        return this;
    }
    //@formatter:on

    //endregion
    //region Invocation
    public Compute invoke(MethodDescription m) {
        checkMethodParameters(m);
        TypeDefinition t = m.getDeclaringType();
        if (!m.isStatic() && m.isMethod()) {
            assert require(false, 1, m.getDeclaringType().asErasure()) : "instance type not match";
            t = popOut();
        }
        if (!m.isMethod() || m.isAbstract())
            append(MethodInvocation.invoke(m).special(m.getDeclaringType().asErasure()));
        else if (t.getDeclaredMethods().filter(x -> x.asTypeToken().equals(m.asTypeToken())).size() < 1)
            append(MethodInvocation.invoke(m).virtual(m.getDeclaringType().asErasure()));
        else append(MethodInvocation.invoke(m));
        if (!m.getReturnType().asErasure().represents(void.class)) pushIn(m.getReturnType().asErasure());
        return this;
    }

    private void checkMethodParameters(MethodDescription m) {
        int n = m.getParameters().size();
        if (n > 0) {
            assert require(false, n) : "required parameter " + n;
            for (int i = n - 1; i >= 0; i--) {
                TypeDescription t = popOut();
                assert t.isAssignableTo(m.getParameters().get(i).getType().asErasure()) : "parameter type not match at " + i;
            }
        }
    }

    /**
     * Invoke Special or Invoke Virtual on Target
     *
     * @param m      method to invoke
     * @param target the target to use
     */
    public Compute invoke(MethodDescription m, TypeDescription target) {
        checkMethodParameters(m);
        if (!m.isStatic() && m.isMethod()) {
            assert require(false, 1, target) : "instance type not match";
            popOut();
        }
        if (!m.isMethod() || m.isAbstract() || m.isDefaultMethod())
            append(MethodInvocation.invoke(m).special(target));
        else append(MethodInvocation.invoke(m).virtual(m.getDeclaringType().asErasure()));
        if (!m.getReturnType().asErasure().represents(void.class)) pushIn(m.getReturnType().asErasure());
        return this;
    }

    //endregion
    //region Lambda
    //todo replace with InvokeDynamic ?
    public Compute lambda(MethodDescription method, TypeDescription face) {
        MethodDescription.InDefinedShape delegate = face.getDeclaredMethods().filter(isAbstract()).getOnly();
        //MethodInvocation.invoke(delegate).dynamic(method.getName(),method.getReturnType().asErasure(),Arrays.asList(method.getDeclaringType().asErasure()),null);
        ParameterList<ParameterDescription.InDefinedShape> target = delegate.getParameters();
        ParameterList<?> source = method.getParameters();
        if (target.size() == source.size()) { //!! same parameters
            if (method.isStatic()) {
                //!! static method reference
                append(Manipulate.LAMBDA(method, face));
            } else {
                //!! instance method reference
                assert require(false, 1) : "absent instance on stack";
                TypeDescription t = popOut();
                assert t.isAssignableTo(method.getDeclaringType().asErasure()) : "invalid type for instance";
                append(Manipulate.LAMBDA(method, face, t));
            }
        } else {
            //closure size
            int clo = source.size() - target.size() + (method.isStatic() ? 0 : 1);
            TypeDescription[] closure = new TypeDescription[clo];
            TypeList types = target.asTypeList().asErasures();
            assert require(false, clo) : "absent closure parameters";
            for (int i = 0; i < clo; i++) {
                closure[i] = popOut();
                assert closure[i].isAssignableTo(types.get(i)) : "invalid type for closure: index " + i;
            }
            append(Manipulate.LAMBDA(method, face, closure));
        }
        pushIn(face);
        return this;

    }

    public Compute lambda(FieldDescription field, TypeDescription face) {
        MethodDescription.InDefinedShape delegate = face.getDeclaredMethods().filter(isAbstract()).getOnly();
        ParameterList<ParameterDescription.InDefinedShape> target = delegate.getParameters();
        TypeDescription.Generic source = field.getType();
        assert target.size() == 1 : "functional parameter not match for field";
        if (!field.isStatic()) {
            assert require(false, 1) : "absent instance on stack";
            TypeDescription t = popOut();
            assert t.isAssignableTo(field.getDeclaringType().asErasure()) : "invalid type for instance";
            append(Manipulate.LAMBDA(field, face, t));
        } else {
            append(Manipulate.LAMBDA(field, face));
        }
        pushIn(face);
        return this;
    }
    //endregion

    @Override
    public Size apply(MethodVisitor v, Implementation.Context c, MethodDescription m) {
        clearOperates();
        frame.clear();
        Size size = Size.ZERO;
        for (ByteCodeAppender mani : manipulates) {
            size = size.merge(mani.apply(v, c, m));
        }
        return size.merge(new Size(0, locals.size()));
    }

    /**
     * Use Compute Assembler to build ASM.</br>
     * This should slower than {@link Manual},but easier for frame compute and less error.
     *
     * @param target the type own this ASM code
     * @param method the method own this ASM code (null if not a Method)
     */
    public static Compute create(TypeDescription target, @Nullable MethodDescription method) {
        return new Compute(target, method);
    }
}