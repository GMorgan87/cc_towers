public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public int getNights() {
        return this.nights;
    }

    public int calculateBill() {
        return this.nights * this.bedroom.getRate();
    }
}
