package org.dhm.berlinclockkata.parser;

import org.dhm.berlinclockkata.Time;
import org.dhm.berlinclockkata.validator.Preconditions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class BerlinClockKataParser implements Parser{
    public static final String DEFAULT_PATTERN = "(\\d{2})::(\\d{2}):(\\d{2})";
    private Pattern pattern;

    public BerlinClockKataParser(String patternConfig) {
        pattern = Pattern.compile(patternConfig);
    }

    public BerlinClockKataParser() {
        pattern = Pattern.compile(DEFAULT_PATTERN);
    }

    @Override
    public Time parse(String time) {

        Matcher matcher = pattern.matcher(time);

        Preconditions.validate(matcher.find(), "Input string does not comply to hh::mm:ss");

        return new Time(
                parseInt(matcher.group(1)),
                parseInt(matcher.group(2)),
                parseInt(matcher.group(3)));
    }
}
