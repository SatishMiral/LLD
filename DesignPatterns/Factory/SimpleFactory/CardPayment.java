package DesignPatterns.Factory.SimpleFactory;

// Concrete Product
public class CardPayment implements Payment{
    
    @Override
    public void pay(int amount){
        System.out.println("Paid" + amount + "Using Card");
    }
}
