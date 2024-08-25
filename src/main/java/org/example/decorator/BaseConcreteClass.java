package org.example.decorator;

public class BaseConcreteClass implements BaseInterface{
    @Override
    public void functionToBeDecorated() {
        System.out.println("Base Functionalities");
    }
}
