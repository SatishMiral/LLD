package DesignPatterns.Factory.SimpleFactory;

// Concrete Product
public class UPIPayment implements Payment{
    
    @Override
    public void pay(int amount){
        System.out.println("Paid" + amount + "Using UPI");
    }
}
