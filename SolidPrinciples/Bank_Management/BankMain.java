package SolidPrinciples.Bank_Management;

import SolidPrinciples.Bank_Management.Accounts.Account;
import SolidPrinciples.Bank_Management.Accounts.AccountDetailsPrinter;
import SolidPrinciples.Bank_Management.Accounts.ModifiedAccount;
import SolidPrinciples.Bank_Management.Accounts.SavingsAccount;
import SolidPrinciples.Bank_Management.Transactions.SavingsTransaction;


/*
    Create an account. (Types of account -> Savings, FixedDeposit.)
    Modify account details or type, print details.

    abstract class -> Account
        classes -> Account, ModifiedAccount extends Account
        classes -> SavingsAccount(Account or ModifiedAccount), FixedDepositAccount(Account or ModifiedAccount)
        class   -> PrintAccountDetails ( SavingsAccount or FixedDepositAccount )
        class   -> ModifyAccountDetails ( SavingsAccount or FixedDepositAccount )

    Perform a transaction (Take account object).
    Deposit, withdraw, transfer.

        interfaces -> Withdraw, Deposit, Transfer
        classes -> SavingsAccountTransaction(SavingsAccount), FixedDepositAccountTransaction(FixedDepositAccount)

*/

public class BankMain {
    public static void main(String[] args){
    SavingsAccount s1 = new SavingsAccount(new Account());
    AccountDetailsPrinter.accountDetailsPrinter(s1);
    SavingsTransaction.deposit(s1);
    AccountDetailsPrinter.accountDetailsPrinter(s1);
    }
}