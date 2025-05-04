/*
. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount,
and CurrentAccount. The bank should have a list of accounts and methods for adding them.
Accounts should be an interface with methods to deposit, withdraw, calculate interest,
and view balances. SavingsAccount and CurrentAccount should implement the Account interface
and have their own unique methods.
*/

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("John Smith", 2500.23, 0.05f, "US42 42432");
        CurrentAccount currentAccount = new CurrentAccount("Dwayne Johnson", 27631.23, 0.025f, "US24 352");

        BankAccount.addBankAccount(savings);
        BankAccount.addBankAccount(currentAccount);

        savings.deposit(200);
        savings.withdraw(100);
        System.out.println(savings.calculateInterest());
        System.out.println(savings.viewBalance());
        System.out.println();

        currentAccount.deposit(300);
        currentAccount.withdraw(278900);
        System.out.println(currentAccount.calculateInterest());
        System.out.println(currentAccount.viewBalance());
        System.out.println();

        BankAccount.showDetails();
    }
}