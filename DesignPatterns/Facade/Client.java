package DesignPatterns.Facade;

public class Client {
    public static void main(String[] args) {
        Orderfacade orderfacade = new Orderfacade();
        orderfacade.placeOrder();
    }
}
