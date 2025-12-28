package DesignPatterns.Factory.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        PaymentFactory factory = new UPIPaymentFactory();
        factory.processPayment(1000);

        PaymentFactory factory2 = new CardPaymentFactory();
        factory2.processPayment(2000);
    }
}
