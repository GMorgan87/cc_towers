
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;
    private ArrayList<Bedroom> emptyRooms;


    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> confRooms){
        this.bedrooms= bedrooms;
        this.confRooms= confRooms;
        this.emptyRooms = new ArrayList<Bedroom>();
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

    public void addEmptyRoom(Bedroom bedroom){
        if (bedroom.isEmpty()) {
            this.emptyRooms.add(bedroom);
        }
    }

    public ArrayList<Bedroom> getEmptyRooms(){
        for (Bedroom bedroom : this.bedrooms)
            if (bedroom.isEmpty()){
                addEmptyRoom(bedroom);
            }
        return this.emptyRooms;
    }
}
