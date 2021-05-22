package SolidPrinciples.Airline_Management.Tickets;

import java.util.Scanner;

public class TicketBookingForVoucher extends Ticket{
    private int voucherNumber;
    public static Scanner sc = new Scanner(System.in);

    protected void setVoucherNumber(int voucherNumber){ this.voucherNumber = voucherNumber;}
    @Override
    public void book() {
        setClassName("Voucher");
        System.out.println("Enter the passenger name: ");
        setPassengerName(sc.next());
        System.out.println("Enter the voucher number: ");
        setVoucherNumber(sc.nextInt());
        System.out.println("Enter the flight number: ");
        setFlightNumber(sc.next());
    }

}
