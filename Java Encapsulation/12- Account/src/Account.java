/*
12. Write a Java program to create a class called Account with private instance variables accountNumber,
accountHolder, and balance. Provide public getter and setter methods to access and modify these variables.
Add a method called deposit() that takes an amount and increases the balance by that amount,
and a method called withdraw() that takes an amount and decreases the balance by that amount.
*/


public class Account {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        else
            System.out.println("Insufficient balance");
    }
}
