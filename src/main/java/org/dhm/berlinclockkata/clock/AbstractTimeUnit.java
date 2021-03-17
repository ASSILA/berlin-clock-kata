package org.dhm.berlinclockkata.clock;

import java.util.List;

public abstract class AbstractTimeUnit implements TimeUnit {

    protected List<? extends TimeUnit> timeUnitParts;
    @Override
    public String display(int units) {
        return null;
    }
}
