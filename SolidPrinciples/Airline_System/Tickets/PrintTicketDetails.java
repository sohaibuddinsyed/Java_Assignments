package SolidPrinciples.Airline_System.Tickets;

import SolidPrinciples.Airline_System.Printer;

public class PrintTicketDetails {

    PrintTicketDetails(){}
    public static void printTicket(TicketBookingForEconomy ticketBookingForEconomy){
        Printer.printer("Your ticket details are :",
                ticketBookingForEconomy.getClassName(),ticketBookingForEconomy.getFlightNumber(),
                ticketBookingForEconomy.getPassengerName());
    }
}
