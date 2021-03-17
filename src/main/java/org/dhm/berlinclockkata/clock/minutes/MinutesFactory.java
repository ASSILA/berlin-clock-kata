package org.dhm.berlinclockkata.clock.minutes;


import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnitPart;


import java.util.List;

import static java.util.Arrays.asList;

public class MinutesFactory {
    public static List<? extends TimeUnit> createParts() {
        return asList(
                createTopPart(),
                createBottomPart());
    }

    public static TimeUnitPart createTopPart() {
        return new TimeUnitPart();
    }

    public static TimeUnitPart createBottomPart() {
        return new TimeUnitPart();
    }
}
