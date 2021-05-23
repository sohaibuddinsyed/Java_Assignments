package SolidPrinciples.Airline_Management.Tickets;

public abstract class Ticket{
    private int ticketNumber;
    private String ticketType;
    private String passengerName;
    private String flightNumber;
    private String className;

    Ticket(){}


//    protected void setTicketType(String ticketType){ this.ticketType=ticketType;}
    protected void setPassengerName(String passengerName){ this.passengerName=passengerName;}
    protected void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }
    protected void setClassName(String className){
        this.className=className;
    }

//    protected String getTicketType(){ return this.ticketType;}
    public String getFlightNumber(){
        return this.flightNumber;
    }
    protected String getClassName(){
        return this.className;
    }
    protected String getPassengerName(){ return this.passengerName;}
    protected void book(){}
}
