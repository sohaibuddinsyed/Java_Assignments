package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;
public class ModifiedAccount extends Account{
    private int minBalance;
    Scanner sc = new Scanner(System.in);
    void setMinimumBalance(int minBalance) { this.minBalance=minBalance;}
    int getMinimumBalance() { return this.minBalance;}

}
