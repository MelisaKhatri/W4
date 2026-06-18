public class TheatreBooking {
    public static void main(String[] args) {

        RegularSeat rs = new RegularSeat("A7");
        PremiumSeat ps = new PremiumSeat("P3");

        rs.bookSeat();
        ps.bookSeat();
    }
}

abstract class Seat {
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public abstract void bookSeat();
}

class RegularSeat extends Seat {

    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Regular Seat Booking");
        System.out.println("Seat No: " + getSeatNumber());
        System.out.println("Status: Booking allowed at any time");
        System.out.println();
    }
}

class PremiumSeat extends Seat {

    public PremiumSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Premium Seat Booking");
        System.out.println("Seat No: " + getSeatNumber());
        System.out.println("Status: Includes snacks + luxury tax");
        System.out.println();
    }
}