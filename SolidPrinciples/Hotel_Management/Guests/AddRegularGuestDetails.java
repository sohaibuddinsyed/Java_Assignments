package SolidPrinciples.Hotel_Management.Guests;

import java.util.Scanner;

public class AddRegularGuestDetails {
    static Scanner sc= new Scanner(System.in);

    public static void addRegularGuestDetails(RegularGuest regularGuest){
        System.out.println("Enter the reg room number :");
        regularGuest.setRegularRoomNo(sc.nextInt());
        System.out.println("Enter the duration of stay in days:");
        regularGuest.setNoOfDays(sc.nextInt());
    }
}
