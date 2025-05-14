/*
9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in
each subclass to impose different withdrawal limits and fees.
*/




public abstract class BankAccount {

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void getBalance();
}
