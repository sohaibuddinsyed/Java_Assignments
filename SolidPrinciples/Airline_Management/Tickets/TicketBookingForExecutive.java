package SolidPrinciples.Airline_Management.Tickets;

public class TicketBookingForExecutive extends TicketBookingService {

    TicketBookingForExecutive(){

    }
    @Override
    public void book() {
        super.book();

    }
    public void customMeal(){
        setClassName("Executive");
    }

}