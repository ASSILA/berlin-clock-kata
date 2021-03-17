package org.dhm.berlinclockkata.parser;


import org.dhm.berlinclockkata.Time;
import org.dhm.berlinclockkata.utils.Exceptions;
import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockKataParserTest {

    Parser parser;

    @Before
    public void setUp() {
        parser = new BerlinClockKataParser("(\\d{2})::(\\d{2}):(\\d{2})");
    }

    @Test
    public void testParseWrongFormat() {
        Exceptions.assertThat(() -> parser.parse("1::17:01"))
                .throwsException(IllegalArgumentException.class)
                .withMessageContaining("Input");
    }

    @Test
    public void testParseOk() {
        Assertions.assertThat(parser.parse("01::17:01"))
                .isEqualsToByComparingFields(new Time(1, 17, 1));
    }
}
