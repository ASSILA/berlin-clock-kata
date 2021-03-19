package org.dhm.berlinclockkata.clock.seconds;


import org.dhm.berlinclockkata.clock.AbstractTimeUnit;
import org.dhm.berlinclockkata.clock.TimeUnit;
import org.dhm.berlinclockkata.validator.Precondition;

public class Seconds extends AbstractTimeUnit implements TimeUnit {
    public Seconds() {
        timeUnitParts = SecondsFactory.createParts();
        precondition = new Precondition(
                (units) -> units >= 0 && units <= 59,
                "Second units must be in range: units >= 0 && units <= 59");
    }
}
