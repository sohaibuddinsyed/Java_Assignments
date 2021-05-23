package SolidPrinciples.Hotel_Management.Guests;

import SolidPrinciples.Hotel_Management.Bookings.VipRoom;

import java.util.Scanner;

public class RegularGuest extends Guest{
    private int regularRoomNo;
    private int noOfDays;
    Scanner sc= new Scanner(System.in);
    RegularGuest(){

    }
    void setRegularRoomNo(int roomNo){ this.regularRoomNo=roomNo;}
    void setNoOfDays(int noOfDays) {this.noOfDays=noOfDays; }

    int getRegularRoomNo(){return this.regularRoomNo;}
    int getNoOfDays(){return this.noOfDays;}

    public VipRoom checkIn(){
        return new VipRoom(this.getRegularRoomNo());
    }
}