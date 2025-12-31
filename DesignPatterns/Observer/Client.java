package DesignPatterns.Observer;

import DesignPatterns.Observer.SmsObserver;
import DesignPatterns.Observer.*;

public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Observer email = new EmailObserver();
        Observer sms = new SmsObserver();

        orderService.addObserver(email);
        orderService.addObserver(sms);

        orderService.placeOrder();
    }
}
