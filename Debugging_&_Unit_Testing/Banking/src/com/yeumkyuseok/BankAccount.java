package com.yeumkyuseok;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // The branch argument is true if the customer is performing the transcation at a branch, with a teller.
    // False if customer is performing the transaction at an atm
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the transcation at a branch, with a teller.
    // False if customer is performing the transaction at an atm
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

}
