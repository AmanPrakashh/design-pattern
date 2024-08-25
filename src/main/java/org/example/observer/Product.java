package org.example.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Product implements  Observable{


    @Getter
    @Setter
    private String name;
    @Getter
    private boolean state;

    private List<Observer> observerList = new ArrayList<>();

    public Product (String name){
        this.name = name;
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer obj : observerList)
        {
            obj.update(this);
        }
    }

    public void changeState(boolean changeState){
        this.state = changeState;
        notifyObserver();
    }
}
