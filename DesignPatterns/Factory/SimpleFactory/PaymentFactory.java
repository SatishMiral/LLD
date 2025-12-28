package DesignPatterns.Factory.SimpleFactory;

// The Factory which return correct objects (Object Creation)
public class PaymentFactory {
    public static Payment getPayment(String type){
        if(type.equalsIgnoreCase("UPI")){
            return new UPIPayment();
        }
        else if(type.equalsIgnoreCase("Card")){
            return new CardPayment();
        }
        else if(type.equalsIgnoreCase("UPI")){
            return new WalletPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}
