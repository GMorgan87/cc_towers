import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int countGuests(){
        return this.guests.size();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        if(this.capacity > this.countGuests()){
            this.guests.add(guest);
        }

    }

    public Guest removeGuest(Guest guest) {
        if (this.guests.contains(guest)) {
            this.guests.remove(guest);
            return guest;
        }
        return null;
    }
}
