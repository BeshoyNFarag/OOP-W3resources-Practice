/*
8. Static Members in Different Contexts

Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber'
and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and
set the static variables. Create several 'BankAccount' objects and print their details along with the
static variables.
*/


public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1234, 2500.3);
        BankAccount acc2 = new BankAccount(5678, 220.3);
        BankAccount acc3 = new BankAccount(91011, 4400);
        BankAccount acc4 = new BankAccount(121314, 1500.43);

        acc.getDetail();
        System.out.println();
        acc2.getDetail();
        System.out.println();
        acc3.getDetail();
        System.out.println();
        acc4.getDetail();


    }
}