package SolidPrinciples.Vehicle_Management.Performance;

import SolidPrinciples.Vehicle_Management.Vehicles.Vehicle;

public interface Measurable {
    void torque(Vehicle V);
    void horsePower(Vehicle V);
    void pickup(Vehicle V);
}
