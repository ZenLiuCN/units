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

import net.bytebuddy.description.ByteCodeElement;
import net.bytebuddy.description.NamedElement;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static net.bytebuddy.matcher.ElementMatchers.isAbstract;

public interface Manipulate extends StackManipulation {
    @Override
    default boolean isValid() {
        return true;
    }

    enum Simple implements Manipulate {
        IAND(Opcodes.IAND, StackSize.SINGLE),
        LAND(Opcodes.LAND, StackSize.DOUBLE),
        DCMPG(Opcodes.DCMPG, StackSize.DOUBLE),
        DCMPL(Opcodes.DCMPL, StackSize.DOUBLE),
        FCMPG(Opcodes.FCMPG, StackSize.SINGLE),
        FCMPL(Opcodes.FCMPL, StackSize.SINGLE),
        LCMP(Opcodes.LCMP, StackSize.DOUBLE),
        DNEG(Opcodes.DNEG, StackSize.DOUBLE),
        FNEG(Opcodes.FNEG, StackSize.SINGLE),
        INEG(Opcodes.INEG, StackSize.SINGLE),
        LNEG(Opcodes.LNEG, StackSize.DOUBLE),
        IOR(Opcodes.IOR, StackSize.SINGLE),
        LOR(Opcodes.LOR, StackSize.DOUBLE),
        SWAP(Opcodes.SWAP, StackSize.ZERO),
        ATHROW(Opcodes.ATHROW, StackSize.SINGLE),
        IXOR(Opcodes.IXOR, StackSize.SINGLE),
        LXOR(Opcodes.LXOR, StackSize.DOUBLE);
        private final int opcode;
        private final StackSize stackSize;

        Simple(int opcode, StackSize stackSize) {
            this.opcode = opcode;
            this.stackSize = stackSize;
        }

        @Override
        public Size apply(MethodVisitor methodVisitor, Implementation.Context implementationContext) {
            methodVisitor.visitInsn(opcode);
            return stackSize.toDecreasingSize();
        }


    }

    Size DEC1 = new Size(-1, 1);
    Size DEC2 = new Size(-2, 2);
    Size INC1 = new Size(1, 2);

    //@formatter:off
    Manipulate NOP = (v, c) -> {
        v.visitInsn(Opcodes.NOP);
        return Size.ZERO;
    };
    //cast
//    Manipulate I2L=(v,c)->{v.visitInsn(Opcodes.I2L);return INC1;};
//    Manipulate I2F=(v,c)->{v.visitInsn(Opcodes.I2F);return Size.ZERO;};
//    Manipulate I2D=(v,c)->{v.visitInsn(Opcodes.I2D);return INC1;};
//    Manipulate L2I=(v,c)->{v.visitInsn(Opcodes.L2I);return DEC1;};
//    Manipulate L2F=(v,c)->{v.visitInsn(Opcodes.L2F);return DEC1;};
//    Manipulate L2D=(v,c)->{v.visitInsn(Opcodes.L2D);return Size.ZERO;};
//    Manipulate F2I=(v,c)->{v.visitInsn(Opcodes.F2I);return Size.ZERO;};
//    Manipulate F2L=(v,c)->{v.visitInsn(Opcodes.F2L);return INC1;};
//    Manipulate F2D=(v,c)->{v.visitInsn(Opcodes.F2D);return INC1;};
//    Manipulate D2I=(v,c)->{v.visitInsn(Opcodes.D2I);return DEC1;};
//    Manipulate D2L=(v,c)->{v.visitInsn(Opcodes.D2L);return Size.ZERO;};
//    Manipulate D2F=(v,c)->{v.visitInsn(Opcodes.D2F);return DEC1;};
//    Manipulate I2B=(v,c)->{v.visitInsn(Opcodes.I2B);return Size.ZERO;};
//    Manipulate I2C=(v,c)->{v.visitInsn(Opcodes.I2C);return Size.ZERO;};
//    Manipulate I2S=(v,c)->{v.visitInsn(Opcodes.I2S);return Size.ZERO;};

    //@formatter:on
    static Manipulate IINC(int varIdx, int v) {
        return (mv, c) -> {
            mv.visitIincInsn(varIdx, v);
            return Size.ZERO;
        };
    }

    static Manipulate GOTO(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.GOTO, label);
            return Size.ZERO;
        };
    }

    static Manipulate IFNULL(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFNULL, label);
            return DEC1;
        };
    }

    static Manipulate IFNONNULL(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFNONNULL, label);
            return DEC1;
        };
    }

    //@formatter:off
    static Manipulate IF_ICMPEQ(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ICMPEQ, label);
            return DEC2;
        };
    }

    static Manipulate IF_ICMPNE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ICMPNE, label);
            return DEC2;
        };
    }

    static Manipulate IF_ICMPLT(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ICMPLT, label);
            return DEC2;
        };
    }

    static Manipulate IF_ICMPGE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ICMPGE, label);
            return DEC2;
        };
    }

    static Manipulate IF_ICMPGT(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ICMPGT, label);
            return DEC2;
        };
    }

    static Manipulate IF_ICMPLE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ICMPLE, label);
            return DEC2;
        };
    }

    static Manipulate IF_ACMPEQ(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ACMPEQ, label);
            return DEC2;
        };
    }

    static Manipulate IF_ACMPNE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IF_ACMPNE, label);
            return DEC2;
        };
    }

    Function<Label, Manipulate> IFNONNULL = Manipulate::IFNONNULL;
    Function<Label, Manipulate> IFNULL = Manipulate::IFNULL;
    Function<Label, Manipulate> GOTO = Manipulate::GOTO;
    Function<Label, Manipulate> IF_ICMPEQ = Manipulate::IF_ICMPEQ;
    Function<Label, Manipulate> IF_ICMPNE = Manipulate::IF_ICMPNE;
    Function<Label, Manipulate> IF_ICMPLT = Manipulate::IF_ICMPLT;
    Function<Label, Manipulate> IF_ICMPGE = Manipulate::IF_ICMPGE;
    Function<Label, Manipulate> IF_ICMPGT = Manipulate::IF_ICMPGT;
    Function<Label, Manipulate> IF_ICMPLE = Manipulate::IF_ICMPLE;
    Function<Label, Manipulate> IF_ACMPEQ = Manipulate::IF_ACMPEQ;
    Function<Label, Manipulate> IF_ACMPNE = Manipulate::IF_ACMPNE;

    Function<Label, Manipulate> IFEQ = Manipulate::IFEQ;
    Function<Label, Manipulate> IFNE = Manipulate::IFNE;
    Function<Label, Manipulate> IFLT = Manipulate::IFLT;
    Function<Label, Manipulate> IFGE = Manipulate::IFGE;
    Function<Label, Manipulate> IFGT = Manipulate::IFGT;
    Function<Label, Manipulate> IFLE = Manipulate::IFLE;

    static Manipulate IFEQ(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFEQ, label);
            return DEC1;
        };
    }

    static Manipulate IFNE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFNE, label);
            return DEC1;
        };
    }

    static Manipulate IFLT(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFLT, label);
            return DEC1;
        };
    }

    static Manipulate IFGE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFGE, label);
            return DEC1;
        };
    }

    static Manipulate IFGT(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFGT, label);
            return DEC1;
        };
    }

    static Manipulate IFLE(Label label) {
        return (v, c) -> {
            v.visitJumpInsn(Opcodes.IFLE, label);
            return DEC1;
        };
    }

    //@formatter:on
    static Object internalName(TypeDescription type) {
        if (type.isPrimitive()) {
            if (ByteCodeManipulates.INT_LIKE.isAssignableFrom(type)) return Opcodes.INTEGER;
            if (ByteCodeManipulates.FLOAT.isAssignableFrom(type)) return Opcodes.FLOAT;
            if (ByteCodeManipulates.DOUBLE.isAssignableFrom(type)) return Opcodes.DOUBLE;
            if (ByteCodeManipulates.LONG.isAssignableFrom(type)) return Opcodes.LONG;
        }
        return type.asErasure().getInternalName();
    }

    static Object[] toInternalName(List<TypeDescription> types) {
        if (types == null || types.isEmpty()) return null;
        int n = types.size();
        Object[] out = new Object[n];
        for (int i = 0; i < n; i++) {
            out[i] = internalName(types.get(i));
        }
        return out;
    }


    /**
     * declare a Label
     *
     * @param label     the label to declar
     * @param frameType the frame type of
     *                  {@link Opcodes#F_FULL},{@link Opcodes#F_APPEND},{@link Opcodes#F_CHOP},{@link Opcodes#F_SAME} or {@link Opcodes#F_SAME1} otherwise won't add Frame Map
     * @param locals    the locals match with frameType
     * @param stack     the stack match with frameType
     */
    static Manipulate LABEL(Label label, int frameType, List<TypeDescription> locals, List<TypeDescription> stack) {
        int localSize = locals == null ? 0 : locals.size();
        int stackSize = stack == null ? 0 : stack.size();
        Object[] localName = toInternalName(locals);
        Object[] stackName = toInternalName(stack);
        switch (frameType) {
            case Opcodes.F_FULL:
                return (v, c) -> {
                    v.visitLabel(label);
                    v.visitFrame(Opcodes.F_FULL, localSize, localName, stackSize, stackName);
                    return Size.ZERO;
                };
            case Opcodes.F_APPEND:
                return (v, c) -> {
                    v.visitLabel(label);
                    v.visitFrame(Opcodes.F_APPEND, localSize, localName, 0, null);
                    return Size.ZERO;
                };
            case Opcodes.F_SAME:
                return (v, c) -> {
                    v.visitLabel(label);
                    v.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
                    return Size.ZERO;
                };
            case Opcodes.F_SAME1:
                return (v, c) -> {
                    v.visitLabel(label);
                    v.visitFrame(Opcodes.F_SAME1, 0, null, 1, stackName);
                    return Size.ZERO;
                };
            case Opcodes.F_CHOP:
                return (v, c) -> {
                    v.visitLabel(label);
                    v.visitFrame(Opcodes.F_CHOP, localSize, null, 0, null);
                    return Size.ZERO;
                };
            default:
                return (v, c) -> {
                    v.visitLabel(label);
                    return Size.ZERO;
                };
        }
    }

    static int handleKindDecider(ByteCodeElement target, boolean setter) {
        if (target instanceof MethodDescription) {
            MethodDescription m = (MethodDescription) target;
            return m.isStatic()
                    ? Opcodes.H_INVOKESTATIC
                    : m.isConstructor() ? Opcodes.H_NEWINVOKESPECIAL
                    : m.getDeclaringType().isInterface() ? Opcodes.H_INVOKEINTERFACE
                    : !m.isMethod() || m.isAbstract() || m.isDefaultMethod() ? Opcodes.H_INVOKESPECIAL
                    : Opcodes.H_INVOKEVIRTUAL; //TODO
        } else if (target instanceof FieldDescription) {
            FieldDescription f = (FieldDescription) target;
            return f.isStatic()
                    ? (setter ? Opcodes.H_PUTSTATIC : Opcodes.H_GETSTATIC)
                    : (setter ? Opcodes.H_PUTFIELD : Opcodes.H_GETFIELD);
        } else throw new AssertionError("unknown handle kind of " + target);

    }

    /**
     * Bootstrap a lambda target to a Method
     *
     * @param target   target method
     * @param face     the functinal interface
     * @param closures closure parameters
     */
    static Manipulate LAMBDA(MethodDescription target, TypeDescription face, TypeDescription... closures) {
        MethodDescription.InDefinedShape delegate = face.getDeclaredMethods().filter(isAbstract()).getOnly();
        String delegateSignature = delegate.getName();
        //!! (closure1;closure2)result
        String delegateDescriptor = (closures.length == 0
                ? "()"
                : Arrays.stream(closures).map(NamedElement.WithDescriptor::getDescriptor).collect(Collectors.joining(";", "(", ")")))
                + delegate.getDeclaringType().getDescriptor();
        Handle bootstrapHandle = new Handle(Opcodes.H_INVOKESTATIC,
                "java/lang/invoke/LambdaMetafactory",
                "metafactory",
                "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                false);
        Type functionType = Type.getType(delegate.getDescriptor());
        Handle targetHandle = new Handle(
                handleKindDecider(target, false),
                target.getDeclaringType().asErasure().getInternalName(),//owner
                target.getName(),//method name
                target.getDescriptor(), //descriptor
                target.getDeclaringType().isInterface()
        );
        Type targetDescriptor = Type.getType(target.getDescriptor());
        return (mv, c) -> {
            mv.visitInvokeDynamicInsn(
                    delegateSignature,//methodName(closures;...)Result
                    delegateDescriptor,
                    bootstrapHandle,
                    //** arguments for bootstrap method
                    functionType, //arguments for functional interface method
                    targetHandle, //the target method handle
                    targetDescriptor //the target method descriptor
            );
            return new Size(1, 1);
        };
    }

    /**
     * Bootstrap a lambda target to a Field
     *
     * @param target   target field
     * @param face     the functinal interface
     * @param closures closure parameters
     */
    static Manipulate LAMBDA(FieldDescription target, TypeDescription face, TypeDescription... closures) {
        MethodDescription.InDefinedShape delegate = face.getDeclaredMethods().filter(isAbstract()).getOnly();
        String delegateSignature = delegate.getName();
        //!! (closure1;closure2)result
        String delegateDescriptor = (closures.length == 0
                ? "()"
                : Arrays.stream(closures).map(NamedElement.WithDescriptor::getDescriptor).collect(Collectors.joining(";", "(", ")")))
                + delegate.getDeclaringType().getDescriptor();
        Handle bootstrapHandle = new Handle(Opcodes.H_INVOKESTATIC,
                "java/lang/invoke/LambdaMetafactory",
                "metafactory",
                "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                false);
        Type functionType = Type.getType(delegate.getDescriptor());
        Handle targetHandle = new Handle(
                handleKindDecider(target, (delegate.getParameters().size() - closures.length) != 0),//setter
                target.getDeclaringType().asErasure().getInternalName(),//owner
                target.getName(),//method name
                target.getDescriptor(), //descriptor
                target.getDeclaringType().isInterface()
        );
        Type targetDescriptor = Type.getType(target.getDescriptor());
        return (mv, c) -> {
            mv.visitInvokeDynamicInsn(
                    delegateSignature,//methodName(closures;...)Result
                    delegateDescriptor,
                    bootstrapHandle,
                    //** arguments for bootstrap method
                    functionType, //arguments for functional interface method
                    targetHandle, //the target method handle
                    targetDescriptor //the target method descriptor
            );
            return new Size(1, 1);
        };
    }
}
