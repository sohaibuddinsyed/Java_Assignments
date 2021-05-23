package SolidPrinciples.Hotel_Management.Bookings;

public abstract class Booking {
    private int bookingId;

    void setBookingId(int bookingId){this.bookingId=bookingId;}
    int getBookingId(){ return this.bookingId;}

}
