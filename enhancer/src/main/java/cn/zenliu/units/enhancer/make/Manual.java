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

import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
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
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static cn.zenliu.units.enhancer.make.Manipulate.Simple.*;

@SuppressWarnings("unused")
public class Manual implements ByteCodeManipulates {
    final Manipulates manipulates = new Manipulates();
    final AtomicInteger local = new AtomicInteger();

    public Manual append(StackManipulation m) {
        manipulates.push(m);
        return this;
    }

    //region Operates
    //@formatter:off
    public Manual IADD() {
        return append(Addition.INTEGER);
    }

    public Manual LADD() {
        return append(Addition.LONG);
    }

    public Manual FADD() {
        return append(Addition.FLOAT);
    }

    public Manual DADD() {
        return append(Addition.DOUBLE);
    }

    public Manual ISUB() {
        return append(Subtraction.INTEGER);
    }

    public Manual LSUB() {
        return append(Subtraction.LONG);
    }

    public Manual FSUB() {
        return append(Subtraction.FLOAT);
    }

    public Manual DSUB() {
        return append(Subtraction.DOUBLE);
    }

    public Manual IMUL() {
        return append(Multiplication.INTEGER);
    }

    public Manual LMUL() {
        return append(Multiplication.LONG);
    }

    public Manual FMUL() {
        return append(Multiplication.FLOAT);
    }

    public Manual DMUL() {
        return append(Multiplication.DOUBLE);
    }

    public Manual IDIV() {
        return append(Division.INTEGER);
    }

    public Manual LDIV() {
        return append(Division.LONG);
    }

    public Manual FDIV() {
        return append(Division.FLOAT);
    }

    public Manual DDIV() {
        return append(Division.DOUBLE);
    }

    public Manual IREM() {
        return append(Remainder.INTEGER);
    }

    public Manual LREM() {
        return append(Remainder.LONG);
    }

    public Manual FREM() {
        return append(Remainder.FLOAT);
    }

    public Manual DREM() {
        return append(Remainder.DOUBLE);
    }

    public Manual INEG() {
        return append(INEG);
    }

    public Manual LNEG() {
        return append(LNEG);
    }

    public Manual FNEG() {
        return append(FNEG);
    }

    public Manual DNEG() {
        return append(DNEG);
    }

    public Manual ISHL() {
        return append(ShiftLeft.INTEGER);
    }

    public Manual LSHL() {
        return append(ShiftLeft.LONG);
    }

    public Manual ISHR() {
        return append(ShiftRight.INTEGER);
    }

    public Manual LSHR() {
        return append(ShiftRight.LONG);
    }

    public Manual IOR() {
        return append(IOR);
    }

    public Manual LOR() {
        return append(LOR);
    }

    public Manual IXOR() {
        return append(IXOR);
    }

    public Manual LXOR() {
        return append(LXOR);
    }

    public Manual IAND() {
        return append(IAND);
    }

    public Manual LAND() {
        return append(LAND);
    }

    public Manual LCMP() {
        return append(LCMP);
    }

    public Manual FCMPG() {
        return append(FCMPG);
    }

    public Manual FCMPL() {
        return append(FCMPL);
    }

    public Manual DCMPG() {
        return append(DCMPG);
    }

    public Manual DCMPL() {
        return append(DCMPL);
    }

    public Manual SWAP() {
        return append(SWAP);
    }

    public Manual POP1() {
        return append(Removal.SINGLE);
    }

    public Manual POP2() {
        return append(Removal.DOUBLE);
    }

    public Manual DUP() {
        return append(Duplication.SINGLE);
    }

    public Manual DUP2() {
        return append(Duplication.DOUBLE);
    }

    public Manual DUPX1() {
        return append(Duplication.SINGLE.flipOver(INT));
    }

    public Manual DUPX2() {
        return append(Duplication.SINGLE.flipOver(LONG));
    }

    public Manual DUP2X1() {
        return append(Duplication.DOUBLE.flipOver(INT));
    }

    public Manual DUP2X2() {
        return append(Duplication.DOUBLE.flipOver(LONG));
    }

    public Manual LOAD(ParameterDescription p) {
        return append(MethodVariableAccess.load(p));
    }

    public Manual ALOAD(int vi) {
        return append(MethodVariableAccess.REFERENCE.loadFrom(vi));
    }

    public Manual ILOAD(int vi) {
        return append(MethodVariableAccess.INTEGER.loadFrom(vi));
    }

    public Manual LLOAD(int vi) {
        return append(MethodVariableAccess.LONG.loadFrom(vi));
    }

    public Manual FLOAD(int vi) {
        return append(MethodVariableAccess.FLOAT.loadFrom(vi));
    }

    public Manual DLOAD(int vi) {
        return append(MethodVariableAccess.DOUBLE.loadFrom(vi));
    }

    public Manual ASTORE(int vi) {
        return append(MethodVariableAccess.REFERENCE.storeAt(vi));
    }

    public Manual ISTORE(int vi) {
        return append(MethodVariableAccess.INTEGER.storeAt(vi));
    }

    public Manual LSTORE(int vi) {
        return append(MethodVariableAccess.LONG.storeAt(vi));
    }

    public Manual FSTORE(int vi) {
        return append(MethodVariableAccess.FLOAT.storeAt(vi));
    }

    public Manual DSTORE(int vi) {
        return append(MethodVariableAccess.DOUBLE.storeAt(vi));
    }

    public Manual ATHROW() {
        return append(ATHROW);
    }

    public Manual IINC(int vi, int v) {
        return append(Manipulate.IINC(vi, v));
    }

    public Manual NEW(TypeDescription type) {
        return append(TypeCreation.of(type));
    }

    public Manual CHECKCAST(TypeDescription type) {
        return append(TypeCasting.to(type));
    }

    public Manual INSTANCEOF(TypeDescription type) {
        return append(InstanceCheck.of(type));
    }

    public Manual NEWARRAY(TypeDescription.Generic component, StackManipulation... values) {
        return append(ArrayFactory.forType(component).withValues(Arrays.asList(values)));
    }

    public Manual ARRAYLENGTH() {
        return append(ArrayLength.INSTANCE);
    }

    public Manual AASTORE() {
        return append(ArrayAccess.REFERENCE.store());
    }

    public Manual AALOAD() {
        return append(ArrayAccess.REFERENCE.load());
    }

    public Manual IASTORE() {
        return append(ArrayAccess.INTEGER.store());
    }

    public Manual IALOAD() {
        return append(ArrayAccess.INTEGER.load());
    }

    public Manual LASTORE() {
        return append(ArrayAccess.LONG.store());
    }

    public Manual LALOAD() {
        return append(ArrayAccess.LONG.load());
    }

    public Manual FASTORE() {
        return append(ArrayAccess.FLOAT.store());
    }

    public Manual FALOAD() {
        return append(ArrayAccess.FLOAT.load());
    }

    public Manual DASTORE() {
        return append(ArrayAccess.DOUBLE.store());
    }

    public Manual DALOAD() {
        return append(ArrayAccess.DOUBLE.load());
    }

    public Manual BASTORE() {
        return append(ArrayAccess.BYTE.store());
    }

    public Manual BALOAD() {
        return append(ArrayAccess.BYTE.load());
    }

    public Manual CASTORE() {
        return append(ArrayAccess.CHARACTER.store());
    }

    public Manual CALOAD() {
        return append(ArrayAccess.CHARACTER.load());
    }

    public Manual SASTORE() {
        return append(ArrayAccess.SHORT.store());
    }

    public Manual SALOAD() {
        return append(ArrayAccess.SHORT.load());
    }

    public Manual ARETURN() {
        return append(MethodReturn.REFERENCE);
    }

    public Manual IRETURN() {
        return append(MethodReturn.INTEGER);
    }

    public Manual LRETURN() {
        return append(MethodReturn.LONG);
    }

    public Manual FRETURN() {
        return append(MethodReturn.FLOAT);
    }

    public Manual DRETURN() {
        return append(MethodReturn.DOUBLE);
    }

    public Manual RETURN() {
        return append(MethodReturn.VOID);
    }

    public Manual GETFIELD(FieldDescription field) {
        return append(FieldAccess.forField(field).read());
    }

    public Manual PUTFIELD(FieldDescription field) {
        return append(FieldAccess.forField(field).write());
    }


    public Manual IFEQ(Label lbl) {
        return append(IFEQ.apply(lbl));
    }

    public Manual IFNE(Label lbl) {
        return append(IFNE.apply(lbl));
    }

    public Manual IFLT(Label lbl) {
        return append(IFLT.apply(lbl));
    }

    public Manual IFGE(Label lbl) {
        return append(IFGE.apply(lbl));
    }

    public Manual IFGT(Label lbl) {
        return append(IFGT.apply(lbl));
    }

    public Manual IFLE(Label lbl) {
        return append(IFLE.apply(lbl));
    }

    public Manual IF_ICMPEQ(Label lbl) {
        return append(IF_ICMPEQ.apply(lbl));
    }

    public Manual IF_ICMPNE(Label lbl) {
        return append(IF_ICMPNE.apply(lbl));
    }

    public Manual IF_ICMPLT(Label lbl) {
        return append(IF_ICMPLT.apply(lbl));
    }

    public Manual IF_ICMPGE(Label lbl) {
        return append(IF_ICMPGE.apply(lbl));
    }

    public Manual IF_ICMPGT(Label lbl) {
        return append(IF_ICMPGT.apply(lbl));
    }

    public Manual IF_ICMPLE(Label lbl) {
        return append(IF_ICMPLE.apply(lbl));
    }

    public Manual IF_ACMPEQ(Label lbl) {
        return append(IF_ACMPEQ.apply(lbl));
    }

    public Manual IF_ACMPNE(Label lbl) {
        return append(IF_ACMPNE.apply(lbl));
    }


    /**
     * @see Manipulate#LABEL(Label, int, List, List)
     */
    public Manual LABEL(Label lbl, int type, List<TypeDescription> locals, List<TypeDescription> stack) {
        return append(Manipulate.LABEL(lbl, type, locals, stack));
    }

    public Manual LAMBDA(MethodDescription target, TypeDescription face, TypeDescription... closures) {
        return append(Manipulate.LAMBDA(target, face, closures));
    }

    public Manual LAMBDA(FieldDescription target, TypeDescription face, TypeDescription... closures) {
        return append(Manipulate.LAMBDA(target, face, closures));
    }


    //@formatter:on
    public Manual INVOKE(MethodDescription method) {
        return append(MethodInvocation.invoke(method));
    }

    public Manual INVOKE_SPEICAL(MethodDescription method, TypeDescription target) {
        return append(MethodInvocation.invoke(method).special(target));
    }

    public Manual INVOKE_VITRUAL(MethodDescription method, TypeDescription target) {
        return append(MethodInvocation.invoke(method).virtual(target));
    }

    public Manual BOX(TypeDescription type) {
        return append(PrimitiveBoxingDelegate
                .forPrimitive(type)
                .assignBoxedTo(TypeDescription.ForLoadedType.of(Object.class).asGenericType(), Assigner.DEFAULT, Assigner.Typing.STATIC));
    }

    public Manual UNBOX(TypeDescription type) {
        return append(PrimitiveUnboxingDelegate
                .forReferenceType(type)
                .assignUnboxedTo(type.asUnboxed().asGenericType(), Assigner.GENERICS_AWARE, Assigner.Typing.DYNAMIC));
    }

    //endregion

    public Manual adjustLocalSize(int size) {
        local.set(size);
        return this;
    }

    @Override
    public Size apply(MethodVisitor v, Implementation.Context c, MethodDescription m) {
        Size size = Size.ZERO.merge(new Simple(manipulates).apply(v, c, m));
        return size.merge(new Size(0, local.get() + m.getStackSize()));
    }

    public static Manual create() {
        return new Manual();
    }
}