package Encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ main method inside the same class
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);
        System.out.println(acc.getBalance()); // 5000.0
    }
}
