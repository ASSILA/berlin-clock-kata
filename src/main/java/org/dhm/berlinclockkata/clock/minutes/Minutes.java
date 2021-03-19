package org.dhm.berlinclockkata.clock.minutes;


import org.dhm.berlinclockkata.clock.AbstractTimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.validator.Precondition;

public class Minutes extends AbstractTimeUnit implements TimeUnit {
    public Minutes() {
        timeUnitParts = MinutesFactory.createParts();
        precondition = new Precondition(
                (units) -> units >= 0 && units <= 59,
                "Minute units must be in range: units >= 0 && units <= 59");
    }
}
