package org.example.observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
}
