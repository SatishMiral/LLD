package DesignPatterns.Factory.FactoryMethod;

// Concrete Factory
public class CardPaymentFactory extends PaymentFactory{
    public Payment createPayment(){
        return new CardPayment();
    }
}
