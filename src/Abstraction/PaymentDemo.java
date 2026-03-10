package Abstraction;

abstract class Payment {
    abstract void pay(double amount);

    void printReceipt(double amount) {
        System.out.println("Payment of $" + amount + " successful.");
    }
}
class UPIPayment extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("Processing UPI payment...");
       
    }
}
class CardPayment extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("Processing Card payment...");
       
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1=new UPIPayment();
        p1.pay(1000);
        p1.printReceipt(1000);  
        
        Payment p2=new CardPayment();
        p2.pay(2000);
        p2.printReceipt(2000);      
    }
}
