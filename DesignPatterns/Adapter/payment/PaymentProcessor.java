package DesignPatterns.Adapter.payment;

// Target interface (the interface expected by the client)
public interface PaymentProcessor {
    void pay(int amount);
}
