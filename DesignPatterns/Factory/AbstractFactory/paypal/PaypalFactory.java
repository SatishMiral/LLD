package DesignPatterns.Factory.AbstractFactory.paypal;

import DesignPatterns.Factory.AbstractFactory.factory.PaymentFactory;
import DesignPatterns.Factory.AbstractFactory.payment.Payment;
import DesignPatterns.Factory.AbstractFactory.payment.Refund;

// Concrete Factory for Paypal
public class PaypalFactory implements PaymentFactory {
    
    public Payment createPayment(){
        return new PaypalPayment();
    }

    public Refund createRefund(){
        return new PaypalRefund();
    }
}
