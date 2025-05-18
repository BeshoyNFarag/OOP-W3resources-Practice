/*
8. Static Members in Different Contexts

Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber'
and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and
set the static variables. Create several 'BankAccount' objects and print their details along with the
static variables.
*/




public class BankAccount {


    private int accountNumber;
    private double balance;
    private static final String bankName = "AO Bank";
    private static final double interestRate = 0.05;


    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }






    public void getDetail(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " +  interestRate);

    }
}
