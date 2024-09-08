package org.example.factory;

public class CarFactory {

    public static Car createCar(String car)
    {
        if(car.equalsIgnoreCase("sedan"))
        {
            return new Sedan();
        }
        else if(car.equalsIgnoreCase("SUV"))
        {
            return new Suv();
        }
        return null;
    }
}
