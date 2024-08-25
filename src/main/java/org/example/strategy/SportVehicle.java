package org.example.strategy;

public class SportVehicle extends Vehicle{
    SportVehicle( ) { super(new SpecialDriveStrategy()); }



}
