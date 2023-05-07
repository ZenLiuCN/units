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

import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.type.*;
import net.bytebuddy.implementation.bytecode.StackSize;

/**
 * @author Zen.Liu
 * @since 2023-05-06
 */
public abstract class HolderType extends TypeDescription.AbstractBase {

    @Override
    public Generic getSuperClass() {
        return null;
    }

    @Override
    public TypeList.Generic getInterfaces() {
        return null;
    }

    @Override
    public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
        return null;
    }

    @Override
    public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
        return null;
    }

    @Override
    public RecordComponentList<RecordComponentDescription.InDefinedShape> getRecordComponents() {
        return null;
    }

    @Override
    public StackSize getStackSize() {
        return null;
    }

    @Override
    public boolean isArray() {
        return false;
    }

    @Override
    public boolean isRecord() {
        return false;
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }


    @Override
    public TypeDescription getComponentType() {
        return null;
    }

    @Override
    public TypeDescription getDeclaringType() {
        return null;
    }

    @Override
    public TypeList getDeclaredTypes() {
        return null;
    }

    @Override
    public MethodDescription.InDefinedShape getEnclosingMethod() {
        return null;
    }

    @Override
    public TypeDescription getEnclosingType() {
        return null;
    }

    @Override
    public String getSimpleName() {
        return null;
    }

    @Override
    public String getCanonicalName() {
        return null;
    }

    @Override
    public boolean isAnonymousType() {
        return false;
    }

    @Override
    public boolean isLocalType() {
        return false;
    }

    @Override
    public PackageDescription getPackage() {
        return null;
    }

    @Override
    public TypeDescription getNestHost() {
        return null;
    }

    @Override
    public TypeList getNestMembers() {
        return null;
    }

    @Override
    public TypeList getPermittedSubtypes() {
        return null;
    }

    @Override
    public String getDescriptor() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public TypeList.Generic getTypeVariables() {
        return null;
    }

    @Override
    public AnnotationList getDeclaredAnnotations() {
        return null;
    }

    @Override
    public int getModifiers() {
        return 0;
    }
}
