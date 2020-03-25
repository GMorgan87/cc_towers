import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> confRooms){
        this.bedrooms= bedrooms;
        this.confRooms= confRooms;
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countConfRooms() {
        return this.confRooms.size();
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom) {
        if (this.bedrooms.contains(bedroom)) {
            bedroom.addGuest(guest);
        }
    }

    public void checkInConfRoom(Guest guest, ConferenceRoom confRoom) {
        if (this.confRooms.contains(confRoom)) {
            confRoom.addGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        return new Booking(bedroom, nights);
    }
}
