package DesignPatterns.Factory.FactoryMethod;

// Concrete Factory
public class UPIPaymentFactory extends PaymentFactory{
    public Payment createPayment(){
        return new UPIPayment();
    }
}
