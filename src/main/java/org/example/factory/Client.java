package org.example.factory;

public class Client {
    public static void main(String[] args) {
        Car sedan = CarFactory.createCar("Sedan");
        sedan.drive();
        Car suv = CarFactory.createCar("Suv");
        suv.drive();
    }
}
