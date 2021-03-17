package org.dhm.berlinclockkata.parser;

import org.dhm.berlinclockkata.Time;

import java.util.regex.Pattern;

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
        return null;
    }
}
