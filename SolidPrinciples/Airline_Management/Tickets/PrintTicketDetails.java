package SolidPrinciples.Airline_Management.Tickets;

import SolidPrinciples.ObjectPrinter;

public class PrintTicketDetails {

    PrintTicketDetails(){}
    public static void printTicket(TicketBookingForEconomy ticketBookingForEconomy){
        ObjectPrinter.printer("Your ticket details are :",
                ticketBookingForEconomy.getClassName(),ticketBookingForEconomy.getFlightNumber(),
                ticketBookingForEconomy.getPassengerName());
    }
    public static void printTicket(TicketBookingForExecutive ticketBookingForExecutive){
        ObjectPrinter.printer("Your ticket details are :",
                ticketBookingForExecutive.getClassName(),ticketBookingForExecutive.getFlightNumber(),
                ticketBookingForExecutive.getPassengerName());
    }
}
