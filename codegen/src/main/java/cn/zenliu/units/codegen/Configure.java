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

package cn.zenliu.units.codegen;

import cn.zenliu.classes.Classes;
import lombok.SneakyThrows;
import lombok.var;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;

/**
 * SPI Configurer to read and load configuration and code generator
 *
 * @author Zen.Liu
 * @since 2023-05-07
 */
public interface Configure {
    /**
     * Config should support project root level and module nest overrides.
     */
    interface Config {
        /**
         * current code generator enabled or CodeGenerateProcessor disabled
         */
        boolean isEnabled();

        /**
         * this global config only
         */
        boolean isDebug();

        Optional<Boolean> readBoolean(String key);

        Optional<String> readString(String key);

        <E extends Enum<E>> Optional<E> readEnum(String key, Class<E> enumType);

        Optional<Integer> readInteger(String key);

        Optional<BigDecimal> readDecimal(String key);

        Optional<Class<?>> readClass(String key);
    }

    /**
     * @param files the config files founded , sorted by depth.
     * @return config
     */
    Config build(Set<Path> files);

    /**
     * Default for maven, override to implement for other build tool
     *
     * @param outputClass found output class root
     * @return module root or project root
     */
    default Path classesToModuleRoot(Path outputClass) {
        return outputClass.toAbsolutePath().getParent().getParent();
    }

    /**
     * implement for predicate if a file is build tool config, default implement is for maven only
     */
    default boolean isBuildToolConfig(Path file) {
        return file.getFileName().toString().equalsIgnoreCase("pom.xml");
    }

    /**
     * implement for predicate if a file is generator config
     */
    boolean isGeneratorConfig(Path file);

    /**
     * store current using Configurer
     */
    void locator(Locator value);

    /**
     * read stored Configurer
     */
    Locator locator();

    //region Logger Delegates
    default boolean isDebugEnabled() {
        return locator().log.isDebugEnabled();
    }

    default boolean isWarnEnabled() {
        return locator().log.isWarnEnabled();
    }

    default boolean isErrorEnabled() {
        return locator().log.isErrorEnabled();
    }

    default void debug(String message) {
        locator().log.debug(message);
    }

    default void error(String message) {
        locator().log.error(message);
    }

    default void fatal(String message) {
        locator().log.fatal(message);
    }

    default void debug(String format, Object... args) {
        locator().log.debug(format, args);
    }

    default void error(String format, Object... args) {
        locator().log.error(format, args);
    }

    @SneakyThrows
    default void fatal(String format, Object... args) {
        locator().log.fatal(format, args);
    }

    default void warn(String message) {
        locator().log.warn(message);
    }

    default void warn(String format, Object... args) {
        locator().log.warn(format, args);
    }

    //endregion


    /**
     * @return found a root config or not
     */
    default boolean init() {
        var conf = new Locator(this::isGeneratorConfig, this::isBuildToolConfig, 14, 5, System.getProperty("generator.debug") != null, "[ CodeGenerator ] ");
        locator(conf);
        return conf.root() == null;
    }

    default boolean resolve(Path root) {
        return locator().resolveRoot(classesToModuleRoot(root));
    }

    default Config parseRoot() {
        var root = locator().root();
        assert root != null;
        return rootConfig(build(Collections.singleton(root)));
    }

    Config rootConfig(Config root);

    Config rootConfig();

    abstract class AbstractConfigure implements Configure {
        protected Config root;
        protected Locator configurer;

        public Config rootConfig(Config root) {
            this.root = root;
            return root;
        }

        public Config rootConfig() {
            return root;
        }

        public Locator locator() {
            return configurer;
        }

        @Override
        public void locator(Locator configurer) {
            this.configurer = configurer;
        }


    }

    /**
     * default implement with 'codegen.properties' as configuration file.<br/>
     * only support maven/gradle as build tool.<br/>
     * use 'generators' with comma separated class names for enabled CodeGenerator. <br/>
     */
    abstract class DefaultConfigure extends AbstractConfigure {
        protected final String configName;

        protected DefaultConfigure(String configName) {
            this.configName = configName;
        }

        static class PropertyConfig implements Config {
            final List<Properties> properties;

            @SneakyThrows
            PropertyConfig(Set<Path> files) {
                this.properties = new ArrayList<>();
                for (var file : files) {
                    var p = new Properties();
                    p.load(file.toFile().toURI().toURL().openStream());
                    properties.add(p);
                }
            }

            protected <T> Optional<T> read(String key, Function<String, T> parser) {
                for (Properties prop : properties) {
                    String p = prop.getProperty(key);
                    if (p != null) return Optional.ofNullable(parser.apply(p));
                }
                return Optional.empty();
            }

            @Override
            public boolean isEnabled() {
                return readBoolean("enable").orElse(true);
            }

            @Override
            public boolean isDebug() {
                return readBoolean("debug").orElse(false);
            }

            @Override
            public Optional<Boolean> readBoolean(String key) {
                return read(key, Boolean::parseBoolean);
            }

            @Override
            public Optional<String> readString(String key) {
                return read(key, Function.identity());
            }

            @Override
            public <E extends Enum<E>> Optional<E> readEnum(String key, Class<E> enumType) {
                return read(key, x -> Enum.valueOf(enumType, x));
            }

            @Override
            public Optional<Integer> readInteger(String key) {
                return read(key, Integer::parseInt);
            }

            @Override
            public Optional<BigDecimal> readDecimal(String key) {
                return read(key, BigDecimal::new);
            }

            @Override
            public Optional<Class<?>> readClass(String key) {
                return read(key, Classes::forName);
            }
        }

        enum BuildType {
            MAVEN("pom.xml"),
            GRADLE("build.gradle"),
            ;
            final String file;

            BuildType(String file) {
                this.file = file;
            }

            public static @Nullable BuildType match(Path file) {
                var name = file.toFile().getName();
                for (BuildType value : values()) {
                    if (value.file.equalsIgnoreCase(name)) return value;
                }
                return null;
            }
        }

        @Override
        public Config build(Set<Path> files) {
            return new PropertyConfig(files);
        }

        private BuildType buildType;

        @Override
        public boolean isBuildToolConfig(Path file) {
            var type = BuildType.match(file);
            if (type != null && buildType == null) synchronized (this) {
                if (buildType == null) buildType = type;
            }
            return type != null;
        }

        @Override
        public boolean isGeneratorConfig(Path file) {
            return file.toFile().getName().equalsIgnoreCase(configName);
        }

    }
}
