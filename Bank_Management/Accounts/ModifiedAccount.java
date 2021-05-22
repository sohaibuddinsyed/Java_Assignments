package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;
public class ModifiedAccount extends Account{
    private int minBalance;
    Scanner sc = new Scanner(System.in);
    void setCreditScore(int minBalance) { this.minBalance=minBalance;}
    int getCreditScore() { return this.minBalance;}

    public ModifiedAccount(){
        System.out.print("Enter the min balance (Modified detail) :");
        this.minBalance=sc.nextInt();
    }

}
