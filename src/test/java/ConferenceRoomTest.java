import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom confRoom;
    private Guest guest;

    @Before
    public void before(){
        confRoom = new ConferenceRoom("Zsolt", 2);
        guest = new Guest("GG");
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, confRoom.countGuests());
    }

    @Test
    public void hasName() {
        assertEquals("Zsolt", confRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, confRoom.getCapacity());
    }


    @Test
    public void canAddGuest() {
        confRoom.addGuest(guest);
        assertEquals(1, confRoom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        confRoom.addGuest(guest);
        Guest removedGuest = confRoom.removeGuest(guest);
        assertEquals(guest, removedGuest);
    }

    @Test
    public void cantRemoveGuestIfNotThere() {
        Guest removedGuest = confRoom.removeGuest(guest);
        assertEquals(null, removedGuest);
    }
}