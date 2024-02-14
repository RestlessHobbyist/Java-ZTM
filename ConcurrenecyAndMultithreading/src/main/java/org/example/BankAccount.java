package org.example;

public class BankAccount {
    private double balance;

    public synchronized void deposit(double amount){
        double  newBalance = balance + amount;
        balance = newBalance;
    }

    public synchronized void withdraw(double amount) throws Exception{
        double newBalance = balance - amount;
        if (newBalance < 0){
            throw new Exception("Insufficient funds");
        }
        balance = newBalance;
    }

    public synchronized double getBalance(){
        return balance;
    }

    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 10;
        System.out.println("Balance is: " + bankAccount.getBalance());
        bankAccount.withdraw(9);
        System.out.println("Balance is: " + bankAccount.getBalance());
    }
}
