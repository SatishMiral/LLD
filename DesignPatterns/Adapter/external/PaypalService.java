package DesignPatterns.Adapter.external;

// Adaptee class (Third-party service with a different interface)
public class PaypalService {
    public void charge(int amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}
