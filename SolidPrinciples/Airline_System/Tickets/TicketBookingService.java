package SolidPrinciples.Airline_System.Tickets;

import java.util.Scanner;

public abstract class TicketBookingService extends Ticket{
    private String transactionId;
    private String paymentMethod;

    public static Scanner sc = new Scanner(System.in);

    void setPaymentMethod(String paymentMethod){
        this.paymentMethod=paymentMethod;
    }
    void setTransactionId(String transactionId){
        this.transactionId=transactionId;
    }

    TicketBookingService() {}

    @Override
    public void book() {
        System.out.println("Enter the passenger name: ");
        super.setPassengerName(sc.next());
        System.out.println("Enter the flight number: ");
        super.setFlightNumber(sc.next());
    }
}