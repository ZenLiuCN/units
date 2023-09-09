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

package cn.zenliu.classes;

import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Tick compat with C# tick
 */
public interface Tick {
    /**
     * a Nano time for adjust times between server
     */
    AtomicLong Adjust = new AtomicLong(0);
    long KindUtc = 0x4000000000000000L;//1
    //   long KindLocal = 0x8000000000000000L;//2
    long TicksMask = 0x3FFFFFFFFFFFFFFFL;
    //  int KindShift = 62;
    int tickPerSec = 10_000_000;
    long base = -62135596800L;

    static Instant from(long ticks) {
        //   final long flag = ticks >>> KindShift;
        final long tick = ticks & TicksMask;
        final long sec = tick / tickPerSec;
        final long nano = (tick % tickPerSec) * 100;
        return Instant.ofEpochSecond(sec + base, nano);
    }

    static long from(@NotNull Instant instant) {
        long nano = (instant.getNano() + Adjust.get()) / 100;
        long sec = (instant.getEpochSecond() - base) * tickPerSec;
        long tick = sec + nano;
        return tick | KindUtc;
    }

    static long now() {
        return from(Instant.now());
    }

    static Duration between(long firstUTC, long secondUTC) {
        return Duration.between(from(firstUTC), from(secondUTC));
    }

    static Duration betweenNow(long firstUTC) {
        return Duration.between(from(firstUTC), Instant.now());
    }
}
