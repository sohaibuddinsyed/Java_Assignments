package SolidPrinciples.Hotel_Management.Bookings;

import java.util.Scanner;

public class Suit extends Booking implements VipRoomServices, RegularRoomServices{
    private int capacity;
    private int suitNo;
    Scanner sc= new Scanner(System.in);

    void setCapacity(int capacity){ this.capacity=capacity;}

    int getCapacity(){ return this.capacity;}
    public int getSuitNo(){ return this.suitNo;}
    public void setSuitNo(int suitNo) {this.suitNo= suitNo;}

    @Override
    public void vipServices() {
        System.out.println("\nCheckIn VIP Suit ");
        System.out.println("Enter bookingId:");
        setBookingId(sc.nextInt());
        System.out.println("Enter Vip suit capacity");
        setCapacity(sc.nextInt());
        System.out.println("\nYour Vip suit number :"+ getSuitNo());
        System.out.println("This is Vip Suit service.");
    }

    @Override
    public void regularServices() {
        System.out.println("\nCheckIn Regular Suit");
        System.out.println("Enter bookingId:");
        setBookingId(sc.nextInt());
        System.out.println("Enter Regular suit capacity");
        setCapacity(sc.nextInt());
        System.out.println("\nYour Regular suit number :"+ getSuitNo());
        System.out.println("This is Regular Suit service.");

    }
}
