import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom confRoom;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "Double");
        confRoom = new ConferenceRoom("Zsolt", 2);
        bedrooms = new ArrayList<Bedroom>();
        confRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(bedroom);
        confRooms.add(confRoom);
        hotel = new Hotel(bedrooms, confRooms);

        guest = new Guest("Nil");
    }

    @Test
    public void hasBedrooms(){
        assertEquals(1, hotel.countBedrooms());
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

}
