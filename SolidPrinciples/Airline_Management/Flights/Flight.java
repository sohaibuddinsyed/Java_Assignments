package SolidPrinciples.Airline_Management.Flights;

import SolidPrinciples.Airline_Management.Employs.Employee;
import SolidPrinciples.Airline_Management.Tickets.Ticket;

public class Flight implements AeroplaneChecks, UtilityChecks {
    private final String AIRLINE_ID = "AI";
    private String flightNumber;
    private String captainName;

    public Flight(Employee employee, Ticket ticket){
        this.engineCheck(); this.electronicCheck();this.mechanicalCheck();
        this.scheduleChecks();this.foodChecks();
        this.flightNumber=ticket.getFlightNumber();
        this.captainName=employee.getName();
        System.out.println("Flight number "+this.AIRLINE_ID+" " + this.flightNumber);
        System.out.println("Captain "+ this.captainName);
    }

    @Override
    public void engineCheck() {
        System.out.println("\nEngine Check.");
    }

    @Override
    public void electronicCheck() {
        System.out.println("\nElectronics Check.");
    }

    @Override
    public void mechanicalCheck() {
        System.out.println("\nMechanics Check.");
    }

    @Override
    public void foodChecks() {
        System.out.println("\nFood Menu Check.");
    }

    @Override
    public void scheduleChecks() {
        System.out.println("\nSchedule Check.");
    }
}
