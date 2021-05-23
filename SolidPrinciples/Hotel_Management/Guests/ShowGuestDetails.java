package SolidPrinciples.Hotel_Management.Guests;

import SolidPrinciples.ObjectPrinter;

public class ShowGuestDetails {

    public static void showGuestDetails(RegularGuest regularGuest){
        ObjectPrinter.printer("\nRegular guest details are: ","\nGuest id: "+regularGuest.getGuestId(),
                "\nGuest name:"+ regularGuest.getName(), "\nReg Guest Room no: "+
                        regularGuest.getRegularRoomNo(), "\nNo of days: "+regularGuest.getNoOfDays());
    }
    public static void showGuestDetails(VipGuest vipGuest){
        ObjectPrinter.printer("\nRegular guest details are: ","\nGuest id: "+vipGuest.getGuestId(),
                "\nGuest name:"+ vipGuest.getName(), "\nVip Guest Room no: "+
                        vipGuest.getVipRoomNo(), "\nNo of days: "+vipGuest.getNoOfDays());
    }
}
