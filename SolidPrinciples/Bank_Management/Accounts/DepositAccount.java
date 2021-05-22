package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;

public class DepositAccount {
//    private int deposit;
    private int updatedBalance;
    private double interest;
    private int time;
    Account account;
    Scanner sc = new Scanner(System.in);
    public DepositAccount(Account account){

        this.account=new Account();
        this.account.setAccountType("Deposit") ;
        System.out.print("Enter deposit amount: ");
        this.updatedBalance = this.account.getBalance() + sc.nextInt();
        this.account.setBalance(this.updatedBalance);
        System.out.print("Enter interest :");
        this.interest=sc.nextDouble();
        System.out.print("Enter the time period:");
        this.time=sc.nextInt();
    }

//    void setDeposit(int deposit){ this.deposit=deposit;}
    void setInterest(double interest){ this.interest=interest;}
    void setTime(int time){ this.time=time;}

//    int getDeposit(){ return this.deposit;}
    double getInterest(){ return this.interest;}
    int getTime(){ return this.time;}

}
