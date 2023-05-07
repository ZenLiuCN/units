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

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.jar.asm.MethodVisitor;

interface ByteCodeManipulates extends ByteCodeAppender {
    TypeDescription INT = TypeDescription.ForLoadedType.of(int.class);
    TypeDescription LONG = TypeDescription.ForLoadedType.of(long.class);
    TypeDescription FLOAT = TypeDescription.ForLoadedType.of(float.class);
    TypeDescription DOUBLE = TypeDescription.ForLoadedType.of(double.class);
    TypeDescription CHAR = TypeDescription.ForLoadedType.of(char.class);
    TypeDescription SHORT = TypeDescription.ForLoadedType.of(short.class);
    TypeDescription BYTE = TypeDescription.ForLoadedType.of(byte.class);
    TypeDescription BOOL = TypeDescription.ForLoadedType.of(boolean.class);


    TypeDescription INT_LIKE = new LikeType(INT, FLOAT, LONG, DOUBLE, BOOL, SHORT, BYTE, CHAR);
    TypeDescription INT_NUM_LIKE = new LikeType(INT, FLOAT, LONG, DOUBLE, SHORT, BYTE, CHAR);
    TypeDescription TOP = new HolderType() {
    };

    @Override
    Size apply(MethodVisitor v, Implementation.Context c, MethodDescription m);

    default Implementation implementation() {
        return new Implementation.Simple(this);
    }

    default Implementation.Composable composable() {
        return new SimpleComposable(this);
    }

    default ByteCodeAppender compound(ByteCodeAppender... other) {
        if (other.length == 0) return new Compound(this);
        ByteCodeAppender[] o = new ByteCodeAppender[other.length + 1];
        o[0] = this;
        System.arraycopy(other, 0, o, 1, other.length);
        return new Compound(o);
    }


}
