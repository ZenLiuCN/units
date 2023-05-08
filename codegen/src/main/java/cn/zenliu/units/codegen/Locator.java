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


import lombok.SneakyThrows;
import lombok.var;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Configurer: the configuration file locator and resolver
 *
 * @author Zen.Liu
 * @since 2023-05-07
 */

public class Locator {
    protected Path root;

    /**
     * Located root config file
     */
    public @Nullable Path root() {
        return root;
    }

    /**
     * The found project modules, defined by a located build tool config file.
     */
    protected SortedSet<Path> modules = new TreeSet<>(CHILDREN_LAST);

    /**
     * All found modules.
     */
    public SortedSet<Path> modules() {
        return modules;
    }

    /**
     * Located config files grouped by depth. Key is the module build tool config file.
     */
    protected final Map<Path, SortedSet<Path>> configs = new ConcurrentHashMap<>();

    /**
     * All found configuration files.
     */
    public Map<Path, SortedSet<Path>> configs() {
        return configs;
    }

    protected final Predicate<Path> configFilePredicate;
    protected final Predicate<Path> buildConfigFilePredicate;

    public final Logger log;
    protected final Object lock = new Object();

    /**
     * @param configPredicate      the predicate for configuration file
     * @param buildConfigPredicate the predicate for build tool configuration file
     * @param deep                 depth level lookup in sub-dirs
     * @param up                   depth level for lookup in parent-dirs
     * @param debug                logging debug info (in console)
     */
    public Locator(Predicate<Path> configPredicate, Predicate<Path> buildConfigPredicate, int deep, int up, boolean debug, String name) {
        configFilePredicate = Objects.requireNonNull(configPredicate, "missing config file predicate");
        buildConfigFilePredicate = Objects.requireNonNull(buildConfigPredicate, "missing build config file predicate");
        log = (Logger.simple(debug ? Logger.FLAG_DEBUG : Logger.FLAG_ERROR, name == null || name.isEmpty() ? "[\tLocator\t]\t" : name));
        initial(deep, up);
    }

    private Locator(Locator other) {
        log = other.log;
        buildConfigFilePredicate = other.buildConfigFilePredicate;
        configFilePredicate = other.configFilePredicate;
        configs.putAll(other.configs);
        root = other.root;
        modules.addAll(other.modules);
    }

    /**
     * @param deep depth level lookup in sub-dirs
     * @param up   depth level for lookup in parent-dirs
     */
    protected void initial(int deep, int up) {
        configs.clear();
        modules.clear();
        var modules = (log.isDebugEnabled()
                ? locator(deep, up, buildConfigFilePredicate).stream().peek(p -> log.debug("Found build config file: {}", p))
                : locator(deep, up, buildConfigFilePredicate).stream())
                .map(Path::getParent)
                .collect(Collectors.toSet());
        var settings =
                log.isDebugEnabled()
                        ? locator(deep, up, configFilePredicate).stream().peek(p -> log.debug("Found config file: {}", p)).collect(Collectors.toSet())
                        : locator(deep, up, configFilePredicate);
        for (var module : modules) {
            module = module.toAbsolutePath();
            var m = module.toString();
            for (var setting : settings) {
                setting = setting.toAbsolutePath();
                if (setting.toString().startsWith(m)) {
                    if (root == null) root = setting;
                    else if (root.getNameCount() > setting.getNameCount()) root = setting;
                    var set = configs.computeIfAbsent(module, i -> new TreeSet<>(Comparator.comparing(Path::getNameCount)));
                    set.add(setting);
                    break;
                }
            }
        }
        this.modules.addAll(modules);
        if (root != null) {
            var prj = this.modules.first();
            log.debug("Try check project config under {}", prj);
            var rs = configs.get(this.modules.first());
            if (rs != null && !rs.isEmpty() && !rs.first().getParent().equals(prj)) {
                rs.clear(); //NO root configuration
            }
        }
        log.debug("Found root config: {} ", root);
        log.debug("Found configs: {} ", configs);
        log.debug("Found modules: {} ", this.modules);
    }

    /**
     * Compute current module root by a root file path.
     *
     * @param root the root path of module
     * @return succeed or not
     */
    public boolean resolveRoot(Path root) {
        root = root.toAbsolutePath();
        log.debug("Try resolve module root from {}", root);
        var val = configs.get(root);
        if (val == null || val.isEmpty()) {
            log.debug("Can't found module {} config in {}", root, configs);
            if (this.root == null) return false;
            return root.toString().startsWith(this.root.toString());//simple check if a submodule of located config
        }
        var newRoot = val.first();
        log.debug("Resolved module {} config of {} ", root, newRoot);
        synchronized (lock) {
            this.root = newRoot;
        }
        return true;
    }

    /**
     * Resolve configurations relative to file.
     *
     * @param file current source file
     * @return found configuration files
     */
    public SortedSet<Path> resolve(Path file) {
        var path = file.toAbsolutePath().getParent().toString();
        Set<Path> match = null;
        Path last = null;
        for (var entry : configs.entrySet()) {
            var key = entry.getKey();
            var val = entry.getValue();
            if (path.startsWith(key.toString()) && !val.isEmpty()) {
                if (last == null || last.getNameCount() < key.getNameCount()) {
                    match = val;
                    last = key;
                }

            }
        }
        var out = new TreeSet<>(CHILDREN_FIRST);
        if (match == null) {
            log.debug("Found no configuration relative to {} ", file);
            return out;
        }
        out.addAll(match);
        if (root != null && last.toString().startsWith(root.toString()))
            out.add(root);
        log.debug("Found configurations {} relative to {} ", out, file);
        return out;
    }

    /**
     * @return copied new Configurer from current status.
     */
    public Locator copy() {
        return new Locator(this);
    }

    /**
     * User Dir property, usually is the project source root.
     */
    protected static final Path USER_DIR = Paths.get(System.getProperty("user.dir"));

    public static Path USER_DIR() {
        return USER_DIR;
    }

    public static final Comparator<Path> CHILDREN_LAST = Comparator.comparing(Path::getNameCount);
    public static final Comparator<Path> CHILDREN_FIRST = CHILDREN_LAST.reversed();

    protected static Set<Path> locator(int depth, int upLimit, Predicate<Path> match) {
        var found = new HashSet<Path>();
        into(depth, match).forEach(found::add);
        upto(upLimit, match).findFirst().ifPresent(found::add);
        return found;
    }

    protected static class UpIter implements Iterator<Path> {
        volatile int deep;
        volatile Path current;
        private final Object lock = new Object();

        public UpIter(int deep, Path root) {
            this.deep = deep;
            this.current = root;
        }

        @Override
        public boolean hasNext() {
            return deep > 0 && current.getParent() != null;
        }

        @Override
        public Path next() {
            synchronized (lock) {
                current = current.getParent();
                deep--;
            }
            return current;
        }
    }

    protected static Stream<Path> upto(int deep, Predicate<Path> match) {
        var it = new UpIter(deep, USER_DIR);
        var sp = Spliterators.spliteratorUnknownSize(it, Spliterator.DISTINCT);
        return StreamSupport.stream(sp, false)
                .flatMap(x -> {
                    try {
                        return Files.list(x);
                    } catch (IOException e) {
                        return Stream.empty();
                    }
                })
                .filter(x -> x.getFileName().toString().charAt(0) != '.' && x.toFile().isFile())
                .filter(match);
    }

    @SuppressWarnings("resource")
    @SneakyThrows
    protected static Stream<Path> into(int deep, Predicate<Path> match) {
        return Files.walk(USER_DIR, deep)
                .filter(x -> x.getFileName().toString().charAt(0) != '.' && x.toFile().isFile())
                .filter(match);
    }
}
