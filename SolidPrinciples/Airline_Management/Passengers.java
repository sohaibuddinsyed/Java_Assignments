package SolidPrinciples.Airline_Management;


public class Passengers {
    private int ticketNumber;
    private String passengerName;

    String getPassengerName(){
        return this.passengerName;
    }
    void setPassengerName(String passengerName){
        this.passengerName=passengerName;
    }
}
