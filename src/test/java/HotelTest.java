import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom confRoom;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "Double");
        bedroom2 = new Bedroom(2, 2, "Double");
        bedroom3 = new Bedroom(3, 2, "Single");
        confRoom = new ConferenceRoom("Zsolt", 2);
        bedrooms = new ArrayList<Bedroom>();
        confRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(bedroom);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        confRooms.add(confRoom);
        hotel = new Hotel(bedrooms, confRooms);

        guest = new Guest("Nil");
    }

    @Test
    public void hasBedrooms(){
        assertEquals(3, hotel.countBedrooms());
    }

    @Test
    public void hasConfRooms(){
        assertEquals(1, hotel.countConfRooms());
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canCheckInGuestToConferenceroom() {
        hotel.checkInConfRoom(guest, confRoom);
        assertEquals(1, confRoom.countGuests());
    }

    @Test
    public void canCreateBooking() {
        Booking booking = hotel.bookRoom(bedroom, 5);
        assertEquals(200, booking.calculateBill());
    }

    @Test
    public void canGetEmptyRooms() {
        hotel.checkInBedroom(guest, bedroom);
        ArrayList<Bedroom> emptyRooms = new ArrayList<Bedroom>();
        emptyRooms = hotel.getEmptyRooms();
        assertEquals(2, emptyRooms.size());
    }

}
