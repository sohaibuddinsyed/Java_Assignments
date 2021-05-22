package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int balance;
    private String holderName;
    protected String accountType;
    static Scanner sc = new Scanner(System.in);

    public Account(){
        System.out.print("Enter account number: ");
        this.accountNumber = sc.nextInt();
        System.out.print("Enter the holder name:");
        this.holderName = sc.next();
        System.out.print("Enter initial balance :");
        this.balance=sc.nextInt();

    }
    protected void setAccountNumber(int accountNumber){ this.accountNumber=accountNumber;}
    protected void setHolderName(String holderName){ this.holderName=holderName;}
    protected void setAccountType(String accountType){this.accountType=accountType;}
    public void setBalance(int balance){this.balance=balance;}

    public int getBalance(){ return this.balance;}
    protected int getAccountNumber(){ return this.accountNumber;}
    protected String getHolderName(){return this.holderName;}
    protected String getAccountType(){ return this.accountType;}




}
