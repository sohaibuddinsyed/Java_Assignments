package SolidPrinciples.Hotel_Management.Guests;

import java.util.Scanner;

public abstract class Guest {
    private String name;
    private String guestId;
    Scanner sc= new Scanner(System.in);
    public Guest(){
        System.out.println("Enter the guest's name:");
        setName(sc.next());
        System.out.println("Enter the guest id:");
        setGuestId(sc.next());
    }

    void setName(String name){ this.name=name;}
    void setGuestId(String guestId) { this.guestId=guestId;}

    String getName(){ return this.name;}
    String getGuestId(){ return this.guestId;}
}
