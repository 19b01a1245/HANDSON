package com.gen.day4;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}


class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    
    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
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

   
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest calculated: $" + interest);
    }

    
    public void viewBalance() {
        System.out.println("Savings Account Balance: $" + balance);
    }
}


class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

   
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
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
        double availableFunds = balance + overdraftLimit;
        if (amount > 0 && amount <= availableFunds) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

   
    public void calculateInterest() 
        
    }

    
    public void viewBalance() {
        System.out.println("Current Account Balance: $" + balance);
    }
}


class Bank {
    private List<Account> accounts;

    
    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        account.add(account);
    }

    public static void main(String[] args) {
       
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        
        savingsAccount.deposit(500);
        savingsAccount.calculateInterest();
        savingsAccount.viewBalance();
        savingsAccount.withdraw(200);
        savingsAccount.viewBalance();

        currentAccount.deposit(800);
        currentAccount.viewBalance();
        currentAccount.withdraw(3000);
        currentAccount.viewBalance();
    }
}
