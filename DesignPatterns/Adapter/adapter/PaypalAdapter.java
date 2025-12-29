package DesignPatterns.Adapter.adapter;

import DesignPatterns.Adapter.external.PaypalService;
import DesignPatterns.Adapter.payment.PaymentProcessor;

// Adapter class for PaypalService
public class PaypalAdapter implements PaymentProcessor {
    private PaypalService paypalService;

    public PaypalAdapter(PaypalService paypalService) {
        this.paypalService = paypalService;
    }

    public void pay(int amount) {
        paypalService.charge(amount);
    }
}
