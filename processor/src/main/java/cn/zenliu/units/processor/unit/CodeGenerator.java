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

package cn.zenliu.units.processor.unit;

import cn.zenliu.classes.Classes;
import cn.zenliu.units.codegen.Configure;
import cn.zenliu.units.codegen.Generated;
import cn.zenliu.units.processor.Desc;
import com.squareup.javapoet.AnnotationSpec;
import lombok.var;

import javax.annotation.Nullable;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

/**
 * @author Zen.Liu
 * @since 2023-05-07
 */
public abstract class CodeGenerator {

    public String name() {
        return this.getClass().getSimpleName();
    }

    private String desc;

    /**
     * default to read {@link Desc} value, or just a 'Modeler Generator class.getSimpleName()'.
     */
    public String desc() {
        if (this.desc != null) {
            return this.desc;
        }
        var desc = this.getClass().getAnnotation(Desc.class);
        if (desc != null) {
            return this.desc = desc.value();
        }
        return this.desc = "CodeGenerator " + this.getClass().getSimpleName();
    }

    /**
     * @see Processor#getSupportedAnnotationTypes()
     */
    public abstract List<String> acceptTypes();

    private String pomVersion;

    /**
     * auto read version from a pom.properties
     */
    protected String pomVersion() {
        if (pomVersion == null) pomVersion = Classes.pomVersion(this.getClass());
        return pomVersion;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", name() + "[", "]")
                .add("version=" + pomVersion())
                .add("desc=" + desc())
                .toString();
    }

    /**
     * @return a Generated annotation
     */
    protected AnnotationSpec generated() {
        return AnnotationSpec.builder(Generated.class)
                .addMember("processor", "$S", name())
                .addMember("version", "$S", pomVersion())
                .addMember("timestamp", "$LL", System.currentTimeMillis())
                .build();
    }

    /**
     * @param ele current process element
     * @param u   util
     * @return null if already generated by current processor or config is disabled
     */
    protected @Nullable Configure.Config preCheck(Element ele, ProcUtil u) {
        if (u.isGeneratedBy(ele, name())) {
            return null;
        }
        var c = u.configure().resolve(u, ele);
        if (!(c.isEnabled())) {
            if (c.isDebug()) u.mandatoryWarn(name(), "disabled when process {}", ele);
            return null;
        }
        if (c.isEnabled()) u.debug(name(), "Configs {} for target '{}'", c, ele);
        return c;
    }


    /**
     * @param element     current element, null if {@link #acceptTypes()} contains a "*" pattern.
     * @param annotations {@link Processor#process(Set, RoundEnvironment)}
     * @param roundEnv    {@link Processor#process(Set, RoundEnvironment)}
     * @param util        {@link ProcUtil}
     * @return skip next processor or not
     */
    public abstract boolean process(@Nullable Element element, Set<? extends TypeElement> annotations, RoundEnvironment roundEnv, ProcUtil util);

}