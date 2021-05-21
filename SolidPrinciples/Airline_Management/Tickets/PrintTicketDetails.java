package SolidPrinciples.Airline_Management.Tickets;

import SolidPrinciples.Airline_Management.Printer;

public class PrintTicketDetails {

    PrintTicketDetails(){}
    public static void printTicket(TicketBookingForEconomy ticketBookingForEconomy){
        Printer.printer("Your ticket details are :",
                ticketBookingForEconomy.getClassName(),ticketBookingForEconomy.getFlightNumber(),
                ticketBookingForEconomy.getPassengerName());
    }
}
