/*
. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount,
and CurrentAccount. The bank should have a list of accounts and methods for adding them.
Accounts should be an interface with methods to deposit, withdraw, calculate interest,
and view balances. SavingsAccount and CurrentAccount should implement the Account interface
and have their own unique methods.
*/



public class SavingsAccount extends BankAccount implements Account {
    private double balance;
    private float interestRate;
    private String name;
    private String iban;

    public SavingsAccount( String name, double balance, float interestRate, String iban) {
        this.iban = iban;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("insufficient balance");
        }
        else
            balance -= amount;

    }
    public double viewBalance(){
        return balance;
    }
    public double calculateInterest(){
        return interestRate * this.balance;
    }

    public String viewName(){
        return name;
    }
    public String viewIban(){
        return iban;
    }

}
