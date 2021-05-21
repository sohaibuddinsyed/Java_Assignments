package SolidPrinciples.Airline_System;

import SolidPrinciples.Airline_System.Employee.*;
import SolidPrinciples.Airline_System.Tickets.*;

public class Airlines {
    public static void main(String args[]){
         AddAnEmployee ad = new AddAnEmployee(new Employee());
         ad.addAnEmployee();
        TicketBookingForEconomy ticket = new TicketBookingForEconomy();
        ticket.book();
        PrintTicketDetails.printTicket(ticket);

    }
}
