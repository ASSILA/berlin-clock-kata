package org.dhm.berlinclockkata.parser;

import org.dhm.berlinclockkata.Time;

public interface Parser {
    Time parse(String time);
}
