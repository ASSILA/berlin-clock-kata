package org.dhm.berlinclockkata.clock.hours;



import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnitPart;
import org.dhm.berlinclockkata.view.Color;
import org.dhm.berlinclockkata.view.Lamp;


import java.util.List;

import static java.util.Arrays.asList;

public class HoursFactory {
    public static List<? extends TimeUnit> createParts() {
        return asList(
                createTopPart(),
                createBottomPart());
    }

    public static TimeUnitPart createTopPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED)),
                (units) -> units / 5);
    }

    public static TimeUnitPart createBottomPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED)),
                (units) -> units % 5);
    }
}

