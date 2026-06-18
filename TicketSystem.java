public class TicketSystem {
    public static void main(String[] args) {

        BusTicket bt = new BusTicket(1107, 1800, "B5");
        TrainTicket tt = new TrainTicket(2209, 1350, "2A");
        FlightTicket ft = new FlightTicket(3315, 7200, "G12");

        bt.generateTicket();
        tt.generateTicket();
        ft.generateTicket();
    }
}

abstract class Ticket {
    private int ticketNumber;
    private double price;

    public Ticket(int tn, double price) {
        this.ticketNumber = tn;
        this.price = price;
    }

    public abstract void generateTicket();
    public int getTicketNumber() {
        return ticketNumber;
    }

    public double getPrice() {
        return price;
    }
}

class BusTicket extends Ticket {
    private String seatNumber;

    public BusTicket(int ticketNumber, double price, String seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    public void generateTicket() {
        System.out.println("Bus Ticket");
        System.out.println("Ticket No: " + getTicketNumber());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Seat No: " + seatNumber);
        System.out.println();
    }
}

class TrainTicket extends Ticket {
    private String coachType;

    public TrainTicket(int ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override
    public void generateTicket() {
        System.out.println("Train Ticket");
        System.out.println("Ticket No: " + getTicketNumber());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Coach Type: " + coachType);
        System.out.println();
    }
}

class FlightTicket extends Ticket {
    private String boardingGate;

    public FlightTicket(int ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    public void generateTicket() {
        System.out.println("Flight Ticket");
        System.out.println("Ticket No: " + getTicketNumber());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Boarding Gate: " + boardingGate);
        System.out.println();
    }
}