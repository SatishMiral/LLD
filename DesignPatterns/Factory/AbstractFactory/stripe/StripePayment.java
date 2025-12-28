package DesignPatterns.Factory.AbstractFactory.stripe;

import DesignPatterns.Factory.AbstractFactory.payment.Payment;

// Stripe Implementations (Concrete Product)
public class StripePayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid" + amount + "Using Stripe");
    }
}
