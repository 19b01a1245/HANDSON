package com.gen.day4;

abstract class BankAccount {
    protected double balance;

    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

   
    public double getBalance() {
        return balance;
    }



class SavingsAccount extends BankAccount {
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }


    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

class CurrentAccount extends BankAccount {
    
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }


    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CurrentAccount currentAccount = new CurrentAccount(2000);

        
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        
        currentAccount.deposit(800);
        currentAccount.withdraw(3000);
        System.out.println("Current Account Balance: $" + currentAccount.getBalance());
    }
}

    





