/*
2. Write a Java program to create a class called BankAccount with private instance variables
accountNumber and balance. Provide public getter and setter methods to access and
modify these variables.
*/


public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(2500.232);
        acc.setAccoutNumber(241341);
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());
    }
}