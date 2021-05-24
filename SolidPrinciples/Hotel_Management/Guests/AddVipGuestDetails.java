package SolidPrinciples.Hotel_Management.Guests;

import java.util.Scanner;

public class AddVipGuestDetails {
    static Scanner sc= new Scanner(System.in);

    public static void addVipGuestDetails(VipGuest vipGuest){
        System.out.println("Enter the Vip room number :");
        vipGuest.setVipRoomNo(sc.nextInt());
        System.out.println("Enter the duration of stay in days:");
        vipGuest.setNoOfDays(sc.nextInt());
    }
}
