package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;

public class SavingsAccount {

    public Account account;
    Scanner sc = new Scanner(System.in);

    public SavingsAccount(Account account) {
        this.account = account;
        this.account.setAccountType("savings");

    }


}
