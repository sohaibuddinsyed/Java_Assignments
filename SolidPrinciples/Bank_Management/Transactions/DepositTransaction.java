package SolidPrinciples.Bank_Management.Transactions;

import SolidPrinciples.Bank_Management.Accounts.Account;

import java.util.Scanner;

public class DepositTransaction implements Deposit{
    private int updatedBalance;
    private Scanner sc = new Scanner(System.in);
    static private DepositTransaction depositTransaction;
    static private Account account;

    public static void deposit(Account account){
        DepositTransaction.account = account;
        DepositTransaction.depositTransaction = new DepositTransaction();
        depositTransaction.deposit(account);
    }

    @Override
    public void deposit() {
        System.out.print("Enter deposit amount:");
        updatedBalance = account.getBalance()+sc.nextInt();
        account.setBalance(updatedBalance);
        System.out.println("Updated Balance is :" + account.getBalance());


    }

}
