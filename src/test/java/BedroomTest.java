import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "Double");
        guest = new Guest("GG");
        guest2 = new Guest("Gareth");
        guest3 = new Guest("Fraser");
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
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void hasRate() {assertEquals(40, bedroom.getRate());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
        assertEquals(false, bedroom.isEmpty());
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

    @Test
    public void cantAddGuestIfOccupied() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        assertEquals(1, bedroom.countGuests());
    }
}
