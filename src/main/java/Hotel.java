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
}
