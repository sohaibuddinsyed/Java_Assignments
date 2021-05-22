package SolidPrinciples.Airline_Management.Flights;

public class Flight implements FlightChecks, UtilityChecks {
    private final String AIRLINE_ID = "AI";
    private String flightNumber;
    private String date;
    private String captainName;
    private String source;
    private String destination;

    Flight(){}

    @Override
    public void engineCheck() {

    }

    @Override
    public void electronicCheck() {

    }

    @Override
    public void mechanicalCheck() {

    }

    @Override
    public void foodChecks() {

    }

    @Override
    public void passengerChecks() {

    }
}
