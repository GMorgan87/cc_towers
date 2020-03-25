import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private int rate;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.rate = this.initialRate();
    }

    public int countGuests() {
        return this.guests.size();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public int getRate() {
        return this.rate;
    }

    public void addGuest(Guest guest) {
        if (this.isEmpty()) {
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

    public boolean isEmpty() {
        return this.guests.size() == 0;
    }

    public int initialRate() {
        if (this.type.equals("Single")) {
            return 20;
        } else if (this.type.equals("Double")){
            return 40;
        } else {
            return 60;
        }
    }
}
