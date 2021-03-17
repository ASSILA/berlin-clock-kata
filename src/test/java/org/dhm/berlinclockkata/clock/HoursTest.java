package org.dhm.berlinclockkata.clock;

import org.dhm.berlinclockkata.clock.hours.Hours;
import org.dhm.berlinclockkata.utils.Exceptions;
import org.junit.*;
import static org.fest.assertions.api.Assertions.assertThat;

public class HoursTest {
    AbstractTimeUnit hours;

    @Before
    public void setUp() {
        hours = new Hours();
    }

    @Test
    public void ten() {
        System.out.println(hours.display(10));
    }

    @Test
    public void allHoursOn() {
        assertThat(hours.display(24)).isEqualTo("RRRR RRRR");
    }

    @Test
    public void last4HoursOn() {
        assertThat(hours.display(04)).isEqualTo("OOOO RRRR");
    }

    @Test
    public void last1AndFirst1HoursOn() {
        assertThat(hours.display(6)).isEqualTo("ROOO ROOO");
    }

    @Test
    public void hoursIllegal() {
        Exceptions.assertThat(() ->
                hours.display(25))
                .throwsException(IllegalArgumentException.class)
                .withMessageContaining("Hour");
    }
}
