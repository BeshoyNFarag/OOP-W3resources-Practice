/*
2. Write a Java program to create a class called BankAccount with private instance variables
accountNumber and balance. Provide public getter and setter methods to access and
modify these variables.
*/



public class BankAccount {

    private int accountNumber;
    private double balance;



    public void setAccoutNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}
