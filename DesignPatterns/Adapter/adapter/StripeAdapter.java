package DesignPatterns.Adapter.adapter;

import DesignPatterns.Adapter.external.StripeService;
import DesignPatterns.Adapter.payment.PaymentProcessor;

// Adapter class for StripeService
public class StripeAdapter implements PaymentProcessor {
    private StripeService stripeService;

    public StripeAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    public void pay(int amount) {
        stripeService.makePayment(amount);
    }
}
