package DesignPatterns.Factory.AbstractFactory.stripe;

import DesignPatterns.Factory.AbstractFactory.factory.PaymentFactory;
import DesignPatterns.Factory.AbstractFactory.payment.Payment;
import DesignPatterns.Factory.AbstractFactory.payment.Refund;

// Concrete Factory for Stripe
public class StripeFactory implements PaymentFactory {

    public Payment createPayment(){
        return new StripePayment();
    }

    public Refund createRefund(){
        return new StripeRefund();
    }
}
