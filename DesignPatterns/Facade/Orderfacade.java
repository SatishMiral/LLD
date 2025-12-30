package DesignPatterns.Facade;

import DesignPatterns.Facade.subsystems.InventoryService;
import DesignPatterns.Facade.subsystems.NotificationService;
import DesignPatterns.Facade.subsystems.PaymentService;
import DesignPatterns.Facade.subsystems.ShippingService;

public class Orderfacade {
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public Orderfacade() {
        this.paymentService = new PaymentService();
        this.inventoryService = new InventoryService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder() {
        inventoryService.reserveProduct();
        paymentService.makePayment();
        shippingService.shipProduct();
        notificationService.sendNotification();
    }
}
