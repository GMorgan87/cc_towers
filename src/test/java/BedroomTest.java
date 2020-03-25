import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "double");
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(5, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("double", bedroom.getType());
    }

}
