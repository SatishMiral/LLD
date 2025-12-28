package DesignPatterns.Factory.AbstractFactory.paypal;

import DesignPatterns.Factory.AbstractFactory.payment.Refund;

// Paypal Implementations (Concrete Product)
public class PaypalRefund implements Refund {
    public void refund(int amount){
        System.out.println("Refunded" + amount + "Using Paypal");
    }
}
