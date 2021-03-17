package org.dhm.berlinclockkata.clock.seconds;


import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnitPart;

import java.util.List;

import static java.util.Arrays.asList;

public class SecondsFactory {
    public static List<? extends TimeUnit> createParts() {
        return asList(createPart());
    }

    public static TimeUnitPart createPart() {
        return new TimeUnitPart();
    }
}
