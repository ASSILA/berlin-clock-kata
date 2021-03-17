package org.dhm.berlinclockkata.clock;


import org.dhm.berlinclockkata.view.Lamp;

import java.util.ArrayList;
import java.util.List;


public class TimeUnitPart implements TimeUnit {

    protected  List<Lamp> lamps;
    protected  LampsOnFunction lampsOnFunction;

    public TimeUnitPart(List<Lamp> lamps, LampsOnFunction lampsOnFunction) {
        this.lamps = lamps;
        this.lampsOnFunction = lampsOnFunction;
    }
    public TimeUnitPart(){}


    public String display(int units) {
       return null;
    }

}