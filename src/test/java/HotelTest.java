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

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "double");
        confRoom = new ConferenceRoom("Zsolt", 2);
        bedrooms = new ArrayList<Bedroom>();
        confRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(bedroom);
        confRooms.add(confRoom);
        hotel = new Hotel(bedrooms, confRooms);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void hasConfRooms(){
        assertEquals(1, hotel.countConfRooms());
    }



}
