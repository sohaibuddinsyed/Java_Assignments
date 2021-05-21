package SolidPrinciples.Airline_Management.Tickets;
import SolidPrinciples.Airline_Management.Passengers;

public abstract class Ticket extends Passengers {
    private int ticketNumber;

    private String flightNumber;
    private String className;

    Ticket(){}


    void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }
    void setclassName(String className){
        this.className=className;
    }

    String getFlightNumber(){
        return this.flightNumber;
    }
    String getClassName(){
        return this.className;
    }

    public abstract void book();
}
