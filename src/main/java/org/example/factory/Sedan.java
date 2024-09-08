package org.example.factory;

public class Sedan implements Car{
    @Override
    public void drive() {
        System.out.println("driving sedan car");
    }
}
