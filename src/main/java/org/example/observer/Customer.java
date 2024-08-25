package org.example.observer;

public class Customer implements Observer{
    private String name;

    public Customer (String name )
    {
        this.name = name;
    }
    @Override
    public void update(Product product) {
        if(product.isState()) System.out.println(" Hello "+ name+ " , "+ product.getName()+" is now available");
        else System.out.println("Hello " + name + " , "+ product.getName()+" is currently out of stock" );
    }
}
