package DesignPatterns.Factory.AbstractFactory;

import DesignPatterns.Factory.AbstractFactory.factory.PaymentFactory;
import DesignPatterns.Factory.AbstractFactory.payment.Payment;
import DesignPatterns.Factory.AbstractFactory.payment.Refund;
import DesignPatterns.Factory.AbstractFactory.stripe.StripeFactory;

public class Client {
    public static void main(String[] args) {
        PaymentFactory factory = new StripeFactory();

        Payment payment = factory.createPayment();
        Refund refund = factory.createRefund();

        payment.pay(100);
        refund.refund(100);
    }
}
