package DesignPatterns.Factory.SimpleFactory;

// The Client
public class Client {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay(1000);
    }
}
