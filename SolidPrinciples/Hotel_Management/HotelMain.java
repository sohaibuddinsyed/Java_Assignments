package SolidPrinciples.Hotel_Management;

import SolidPrinciples.Hotel_Management.Bookings.*;
import SolidPrinciples.Hotel_Management.Guests.*;

/*
package Guests -
    abstract class Guest
    classes RegularGuest, VipGuest extends Guest
    class ShowGuestDetails
    class AddGuestDetails

package Bookings -
    abstract class Booking
    abstract class Room extends Booking
    interfaces RegularRoomServices, VipRoomServices
    class RegularRoom extends Room implements RegularRoomServices
    class VipRoom extends Room implements VipRoomServices
    class Suite extends Booking
    class Suite extends Room implements RegularRoomServices, VipRoomServices
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


