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

package cn.zenliu.units.reflect;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.util.Optional;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */ //region QualifiedNames
@Getter
@Accessors(fluent = true)
public abstract class QualifiedName<T> {
    protected final String qualifiedName;

    protected QualifiedName(String qualifiedName) {
        assert qualifiedName != null && !qualifiedName.isEmpty() : "invalid qualifiedName";
        this.qualifiedName = qualifiedName;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(qualifiedName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QualifiedName<?>)
            return Objects.equals(((QualifiedName<?>) obj).qualifiedName, qualifiedName);
        return false;
    }

    @Override
    public String toString() {
        return qualifiedName;
    }

    abstract public T find(ClassLoader cl, boolean inStack);

    abstract public T mustFind(ClassLoader cl, boolean inStack);

    public Optional<T> maybe(ClassLoader cl, boolean inStack) {
        return Optional.ofNullable(find(cl, inStack));
    }
}
