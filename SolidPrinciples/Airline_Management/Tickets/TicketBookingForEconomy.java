package SolidPrinciples.Airline_Management.Tickets;

public class TicketBookingForEconomy extends TicketBookingService {
    public TicketBookingForEconomy() {

    }

    @Override
    public void book() {
        super.book();
        setClassName("Economy");

    }


}
