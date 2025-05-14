/*
9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in
each subclass to impose different withdrawal limits and fees.
*/


public class Main {
    public static void main(String[] args) {
        BankAccount checking = new CheckinAccount(2500.20);
        BankAccount savings =  new SavingsAccount(5000);
        checking.deposit(200);
        savings.deposit(300);

        savings.withdraw(5300);
        checking.withdraw(2697);



        savings.getBalance();
        checking.getBalance();

        savings.withdraw(1000);
        checking.withdraw(1000);
        System.out.println();

        savings.getBalance();
        checking.getBalance();


    }
}