package SolidPrinciples.Airline_Management.Tickets;

import SolidPrinciples.ObjectPrinter;

public class PrintTicketDetails {

    PrintTicketDetails(){}
    public static void printTicket(TicketBookingForEconomy ticketBookingForEconomy){
        ObjectPrinter.printer("\n\nYour ticket details are :",
                "\nPassenger name:"+ ticketBookingForEconomy.getPassengerName(),
                "\nClass:"+ticketBookingForEconomy.getClassName(),
                "\nFlight number:"+ticketBookingForEconomy.getFlightNumber());
    }
    public static void printTicket(TicketBookingForExecutive ticketBookingForExecutive){
        ObjectPrinter.printer("\n\nYour ticket details are :",
                "\nPassenger name:"+ ticketBookingForExecutive.getPassengerName(),
                "\nClass:"+ ticketBookingForExecutive.getClassName(),
                "\nFlight number:"+ticketBookingForExecutive.getFlightNumber());
    }
}
