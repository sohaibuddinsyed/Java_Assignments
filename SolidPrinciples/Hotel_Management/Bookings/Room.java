package SolidPrinciples.Hotel_Management.Bookings;

public abstract class Room extends Booking{
    private int capacity;

    void setCapacity(int capacity){ this.capacity=capacity;}
    int getCapacity(){ return this.capacity;}
}
