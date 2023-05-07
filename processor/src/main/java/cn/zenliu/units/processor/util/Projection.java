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

package cn.zenliu.units.processor.util;

import lombok.Value;
import lombok.experimental.Accessors;

import javax.lang.model.element.ExecutableElement;
import java.util.List;

/**
 * <ul>
 * <li>src               source method (that have real logic).</li>
 * <li>tar               target method (that can be impl).</li>
 * <li>chain             dose target method use chain return and src not.</li>
 * <li>parameterMappings parameter value mapping objects in same ordered (null if not need).</li>
 * <li>returnTypeMapping return value mapping object (null if not need).</li>
 * <li>{@code <T>}               type mapping object</li>
 * </ul>
 */
@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Projection<T> {
    ExecutableElement src;
    ExecutableElement tar;
    boolean chain;
    List<T> parameterMappings;
    T returnTypeMapping;

}
