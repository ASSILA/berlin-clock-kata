package org.dhm.berlinclockkata.clock.hours;

import org.dhm.berlinclockkata.clock.AbstractTimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.validator.Precondition;

public class Hours extends AbstractTimeUnit implements TimeUnit {
    public Hours() {
        timeUnitParts = HoursFactory.createParts();
        precondition = new Precondition(
                (units) -> units >= 1 && units <= 24,
                "Hour units must be in range: units >= 1 && units <= 24");
    }
}
