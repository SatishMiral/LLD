package DesignPatterns.Factory.AbstractFactory.factory;

import DesignPatterns.Factory.AbstractFactory.payment.Payment;
import DesignPatterns.Factory.AbstractFactory.payment.Refund;

// Abstract Factory Interface
public interface PaymentFactory {
    Payment createPayment();
    Refund createRefund();
} 
