/*
. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount,
and CurrentAccount. The bank should have a list of accounts and methods for adding them.
Accounts should be an interface with methods to deposit, withdraw, calculate interest,
and view balances. SavingsAccount and CurrentAccount should implement the Account interface
and have their own unique methods.
*/


import java.util.ArrayList;

public class BankAccount {

    public static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public static void removeBankAccount(BankAccount bankAccount) {
        accounts.remove(bankAccount);
    }

    public static void showDetails() {
        for (BankAccount account : accounts) {
            if(account instanceof Account){
                Account acc = (Account) account;

                System.out.printf("Name: %s%nBalance: %.2f%nIBAN: %s%n%n", acc.viewName(), acc.viewBalance(), acc.viewIban() );
            }
        }
    }
}
