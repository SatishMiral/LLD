package DesignPatterns.Factory.FactoryMethod;

// Factory Interface
public abstract class PaymentFactory {
    // Factory method
    public abstract Payment createPayment();

    // General Workflows
    public void processPayment(int amount){
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
