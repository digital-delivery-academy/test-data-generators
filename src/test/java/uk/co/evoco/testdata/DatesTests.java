package uk.co.evoco.testdata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static uk.co.evoco.testdata.Dates.futureDate;
import static uk.co.evoco.testdata.Dates.pastDate;
import static uk.co.evoco.testdata.Dates.futureDateBusinessDays;

public class DatesTests {

    @Test
    public void testCanGetDateInFuture() {
        assertThat(futureDate("01/06/2019", 5), is("06/06/2019"));
    }

    @Test
    public void testCanGetDateInPast() {
        assertThat(pastDate("06/06/2019", 5), is("01/06/2019"));
    }

    @Test
    public void testCanDataInFutureAvoidingWeekend() {
        assertThat(futureDateBusinessDays("06/06/2019", 5), is("13/06/2019"));
    }
}
