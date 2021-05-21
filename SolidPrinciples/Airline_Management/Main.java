package SolidPrinciples.Airline_Management;

import SolidPrinciples.Airline_Management.Employes.*;
import SolidPrinciples.Airline_Management.Tickets.*;

public class Main {
    public static void main(String args[]){
        Employee e1 = new Employee();
//        AddEmployee.addEmployee(e1);
        AddModifiedEmployee.addEmployee(e1);


        TicketBookingForEconomy ticket = new TicketBookingForEconomy();
        ticket.book();
        PrintTicketDetails.printTicket(ticket);

    }
}
