package SolidPrinciples.Airline_System.Tickets;


public abstract class Ticket {
    private String passengerName;
    private String flightNumber;
    private String className;

    Ticket(){}

    void setPassengerName(String passengerName){
        this.passengerName=passengerName;
    }
    void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }
    void setclassName(String className){
        this.className=className;
    }
    String getPassengerName(){
        return this.passengerName;
    }
    String getFlightNumber(){
        return this.flightNumber;
    }
    String getClassName(){
        return this.className;
    }

    public abstract void book();
}
