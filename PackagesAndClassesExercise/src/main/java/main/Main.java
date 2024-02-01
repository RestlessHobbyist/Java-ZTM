package main;

import bank.BankAccount;

import bank.BankAccount;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      BankAccount bAccnt1 = new BankAccount();
      bAccnt1.accountNumber = (12345);
      bAccnt1.accountHolder = "Pierce";
      bAccnt1.balance = 1000000000.00;

        System.out.println("Accnt #: " + bAccnt1.accountNumber);
        System.out.println("AccntHldr: " + bAccnt1.accountHolder);
        System.out.println("AccntBalance: $" + bAccnt1.balance);
    }
}