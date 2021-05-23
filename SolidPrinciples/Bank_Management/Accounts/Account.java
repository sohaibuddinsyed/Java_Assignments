package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int balance;
    private String holderName;
    protected String accountType;


    public Account(){

    }
    public void setAccountNumber(int accountNumber){ this.accountNumber=accountNumber;}
    public void setHolderName(String holderName){ this.holderName=holderName;}
    public void setAccountType(String accountType){this.accountType=accountType;}
    public void setBalance(int balance){this.balance=balance;}

    public int getBalance(){ return this.balance;}
    public int getAccountNumber(){ return this.accountNumber;}
    protected String getHolderName(){return this.holderName;}
    protected String getAccountType(){ return this.accountType;}




}
