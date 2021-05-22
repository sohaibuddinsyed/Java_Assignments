package SolidPrinciples.Airline_Management;

import SolidPrinciples.Airline_Management.Employes.*;
import SolidPrinciples.Airline_Management.Tickets.*;

public class Main {
    public static void main(String args[]){

/*
    Create an Employee object.
    Add an Employee.

    Create a flight object.

    Create a TicketBookingForEconomy object.
    Book an Economy Ticket (take flight object).
    Print ticket.
    return passenger object.

    Show Passenger details from ticket.



*/
        Employee e1 = new Employee();
//        AddEmployee.addEmployee(e1);
        AddModifiedEmployee.addEmployee(e1);


        TicketBookingForEconomy ticket = new TicketBookingForEconomy();
        ticket.book();
        PrintTicketDetails.printTicket(ticket);

    }
}
