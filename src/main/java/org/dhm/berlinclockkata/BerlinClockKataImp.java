package org.dhm.berlinclockkata;

import org.dhm.berlinclockkata.clock.hours.Hours;
import org.dhm.berlinclockkata.clock.minutes.Minutes;
import org.dhm.berlinclockkata.clock.seconds.Seconds;
import org.dhm.berlinclockkata.parser.Parser;
import org.dhm.berlinclockkata.validator.Preconditions;

public class BerlinClockKataImp implements BerlinClockKata{
    public static final String TIME_UNIT_DELIMITER = " ";
    public static final int MAX_SIZE = 28;
    private Parser parser;

    private Hours hours = new Hours();
    private Minutes minutes = new Minutes();
    private Seconds seconds = new Seconds();

    public BerlinClockKataImp(Parser parser) {
        this.parser = parser;
    }
    @Override
    public String displayTime(String input) {
        Preconditions.validate(input != null, "Input string is null");
        Time time = parser.parse(input);

        return new StringBuilder(MAX_SIZE).
                append(seconds.display(time.seconds)).append(TIME_UNIT_DELIMITER).
                append(hours.display(time.hours)).append(TIME_UNIT_DELIMITER).
                append(minutes.display(time.minutes)).toString();

    }
}
