package DesignPatterns.Adapter;

import DesignPatterns.Adapter.adapter.PaypalAdapter;
import DesignPatterns.Adapter.external.PaypalService;
import DesignPatterns.Adapter.external.StripeService;
import DesignPatterns.Adapter.payment.PaymentProcessor;
import DesignPatterns.Adapter.adapter.StripeAdapter;

// Client code that uses the PaymentProcessor interface
public class Client {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PaypalAdapter(new PaypalService());
        paypalProcessor.pay(100);

        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeService());
        stripeProcessor.pay(200);
    }
}
