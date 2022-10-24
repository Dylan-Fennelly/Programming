package org.example.Testing;

public class BankAccount
{
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CURRENT = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance,int typeofAccount)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeofAccount;
    }

    //If the branch arguement is true that the transaction was performed in a branch.
    //Otherwise, at an ATM

    public double deposit(double amount, boolean branch)
    {
        if(amount > 500.0 & !branch)
        {
            throw new IllegalArgumentException();
        }
        balance += amount;
        return balance;
    }
    public double withdraw(double amount, boolean branch)
    {
        balance -= amount;
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean isCurrent()
    {
        return accountType == CURRENT;
    }
}
