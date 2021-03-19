package org.dhm.berlinclockkata.clock.seconds;


import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnitPart;
import org.dhm.berlinclockkata.view.Color;
import org.dhm.berlinclockkata.view.Lamp;

import java.util.List;

import static java.lang.Math.abs;
import static java.util.Arrays.asList;

public class SecondsFactory {
    public static List<? extends TimeUnit> createParts() {
        return asList(createPart());
    }

    public static TimeUnitPart createPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.YELLOW)),
                (units) -> abs((units % 2) - 1));
    }
}
