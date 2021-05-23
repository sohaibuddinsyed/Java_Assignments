package SolidPrinciples.Hotel_Management;

import SolidPrinciples.Hotel_Management.Bookings.*;
import SolidPrinciples.Hotel_Management.Guests.*;

/*
package Guests          // S,O,D
    abstract class Guest
    classes RegularGuest, VipGuest
    class ShowGuestDetails
    Class Add GuestDetails

package Bookings        // I, L
    abstract class Booking
    abstract class Room
    interfaces RegularRoomServices, VipRoomServices
    class RegularRoom, VipRoom
    class Suite
 */

public class HotelMain {
    public static void main(String [] args){
        VipGuest vipGuest = new VipGuest();
        AddVipGuestDetails.addVipGuestDetails(vipGuest);
        ShowGuestDetails.showGuestDetails(vipGuest);

        VipRoom vipRoom =new VipRoom();
        vipGuest.checkIn(vipRoom);
        Suit suit = new Suit();
        vipGuest.checkIn(suit);
        vipRoom.vipServices();
    }
}


