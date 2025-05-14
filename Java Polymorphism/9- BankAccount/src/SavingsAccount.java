/*
9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in
each subclass to impose different withdrawal limits and fees.
*/




public class SavingsAccount extends BankAccount {
    private double balance;
    public SavingsAccount( double balance) {
        this.balance = balance;


    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {

        if(balance >= (amount + 2.5) ) {
            balance -= amount;
            balance -= 2.5;
        }
        else
            System.out.println("insufficient balance for: " + this.getClass().getName());

    }

    public void getBalance() {
        System.out.println(balance);
    }
}
