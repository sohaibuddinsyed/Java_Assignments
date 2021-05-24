package SolidPrinciples.Hotel_Management.Bookings;

import java.util.Scanner;

public class RegularRoom extends Room implements RegularRoomServices{
    private int regularRoomNo;

    Scanner sc= new Scanner(System.in);

    public RegularRoom(int regularRoomNo){
        this.regularRoomNo=regularRoomNo;
    }
    int getRegularRoomNo(){return this.regularRoomNo;}

    public void setRegularRoomNo(int roomNo){ this.regularRoomNo=roomNo;}
    @Override
    public void regularServices() {
        System.out.println("\nCheckIn ");
        System.out.println("Enter bookingId:");
        setBookingId(sc.nextInt());
        System.out.println("Enter Vip room capacity");
        setCapacity(sc.nextInt());
        System.out.println("\nYour Vip room number :"+ getRegularRoomNo());
        System.out.println("This is Vip Room service.");
        System.out.println("This is Regular Room service;");
    }
}
