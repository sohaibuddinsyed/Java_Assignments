package SolidPrinciples.Vehicle_Management.Vehicles;

public abstract class Vehicle {
    private int tyres;
    private int seats;
    private int mileage;

    void setTyres(int tyres){
        this.tyres = tyres;
    }
    void setSeats(int seats){
        this.seats=seats;
    }
    void setMileage(int mileage){
        this.mileage=mileage;
    }
    int getTyres(){
        return this.tyres;
    }
    int getSeats(){
        return this.seats;
    }
    int getMileage(){
        return this.mileage;
    }

    protected abstract void drive();
    protected abstract void start();

}
