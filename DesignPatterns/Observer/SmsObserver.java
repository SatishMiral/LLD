package DesignPatterns.Observer;

// Concrete Observers
public class SmsObserver implements Observer {
    public void update(String message) {
        System.out.println("SMS received: " + message);
    }
}
