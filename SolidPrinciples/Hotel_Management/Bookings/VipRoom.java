package SolidPrinciples.Hotel_Management.Bookings;

import java.util.Scanner;

public class VipRoom extends Room implements VipRoomServices{

    private int vipRoomNo;
    Scanner sc= new Scanner(System.in);

    int getVipRoomNo(){ return this.vipRoomNo;}
    public void setVipRoomNo(int vipRoomNo){ this.vipRoomNo=vipRoomNo;}

    @Override
    public void vipServices() {
        System.out.println("\nCheckIn ");
        System.out.println("Enter bookingId:");
        setBookingId(sc.nextInt());
        System.out.println("Enter Vip room capacity");
        setCapacity(sc.nextInt());
        System.out.println("\nYour Vip room number :"+ getVipRoomNo());
        System.out.println("This is Vip Room service.");
    }
}
