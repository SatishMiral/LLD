package DesignPatterns.Factory.AbstractFactory.paypal;

import DesignPatterns.Factory.AbstractFactory.payment.Payment;

// Paypal Implementations (Concrete Product)
public class PaypalPayment implements Payment {
    public void pay(int amount){
        System.out.println("Paid" + amount + "Using Paypal");
    }
}
