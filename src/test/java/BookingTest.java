import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private int nights;
    private Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(5, 2, "Double");
        booking = new Booking(bedroom, 4);
    }

    @Test
    public void hasNights() {
        assertEquals(4, booking.getNights());
    }

    @Test
    public void canCalculateBill() {
        assertEquals(160 , booking.calculateBill());
    }


}


