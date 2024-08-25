package org.example.strategy;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new PassengerVehicle();
        vehicle2.drive();
    }
}
