package SolidPrinciples.Bank_Management.Transactions;

import SolidPrinciples.Bank_Management.Accounts.Account;
import SolidPrinciples.Bank_Management.Accounts.SavingsAccount;

import java.util.Scanner;

public class SavingsTransaction implements Withdraw, Deposit {
    static int updatedBalance;
    static Scanner sc = new Scanner(System.in);
    static SavingsAccount savingsAccount;


    public static void deposit(SavingsAccount savingsAccount){
        SavingsTransaction.savingsAccount=savingsAccount;
        SavingsTransaction savingsTransaction= new SavingsTransaction();
        savingsTransaction.deposit();
    }

    @Override
    public void deposit() {
        System.out.println("\nEnter deposit amount:");
        updatedBalance=sc.nextInt();
        updatedBalance += savingsAccount.account.getBalance();
        savingsAccount.account.setBalance(updatedBalance);
        System.out.println("Updated Balance is :" + savingsAccount.account.getBalance());


    }

    @Override
    public void withdraw(Account account) {

    }
}
