package DesignPatterns.Adapter.external;

// Adaptee class (Third-party service with a different interface)
public class StripeService {
    public void makePayment(int amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}
