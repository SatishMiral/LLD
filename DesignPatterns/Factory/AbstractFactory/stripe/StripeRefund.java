package DesignPatterns.Factory.AbstractFactory.stripe;

import DesignPatterns.Factory.AbstractFactory.payment.Refund;

// Stripe Implementations (Concrete Product)
public class StripeRefund implements Refund {
    public void refund(int amount){
        System.out.println("Refunded" + amount + "Using Stripe");
    }
}
