package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class OrderService implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void placeOrder() {
        System.out.println("Order placed successfully");
        notifyObservers("Order has been placed");
    }
}
