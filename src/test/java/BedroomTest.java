import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "double");
        guest = new Guest("GG");
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

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        Guest removedGuest = bedroom.removeGuest(guest);
        assertEquals(guest, removedGuest);
    }

    @Test
    public void cantRemoveGuestIfNotThere() {
        Guest removedGuest = bedroom.removeGuest(guest);
        assertEquals(null, removedGuest);
    }
}
