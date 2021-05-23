package SolidPrinciples.Hotel_Management.Guests;

import SolidPrinciples.Hotel_Management.Bookings.Suit;
import SolidPrinciples.Hotel_Management.Bookings.VipRoom;

import java.util.Scanner;

public class VipGuest extends Guest{
    private int vipRoomNo;
    private int noOfDays;

    public void setVipRoomNo(int roomNo){ this.vipRoomNo=roomNo;}
    void setNoOfDays(int noOfDays) {this.noOfDays=noOfDays; }

    int getVipRoomNo(){return this.vipRoomNo;}
    int getNoOfDays(){return this.noOfDays;}

    public void checkIn(VipRoom vipRoom){
        vipRoom.setVipRoomNo(this.getVipRoomNo());
    }
    public void checkIn(Suit suit){
        suit.setSuitNo(this.getVipRoomNo());
    }
}