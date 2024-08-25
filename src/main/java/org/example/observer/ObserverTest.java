package org.example.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Customer aman  = new Customer("Aman");
        Customer prakash = new Customer("Prakash");

        Product fridge = new Product("Fridge");
        fridge.add(aman);
        fridge.add(prakash);
        fridge.changeState(true);
        System.out.println("******************************************************************");
        fridge.changeState(false);
    }
}
