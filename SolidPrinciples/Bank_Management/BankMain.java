package SolidPrinciples.Bank_Management;

import SolidPrinciples.Bank_Management.Accounts.Account;
import SolidPrinciples.Bank_Management.Accounts.AccountDetailsPrinter;
import SolidPrinciples.Bank_Management.Accounts.ModifiedAccount;
import SolidPrinciples.Bank_Management.Accounts.SavingsAccount;
import SolidPrinciples.Bank_Management.Transactions.SavingsTransaction;


/*
package Accounts -
    abstract class Account
    class Account, ModifiedAccount extends Account
    class SavingsAccount(Account / ModifiedAccount), FixedDepositAccount(Account/ModifiedAccount)
    class PrintAccountDetails (SavingsAccount / FixedDepositAccount)
    class ModifyAccountDetails (SavingsAccount / FixedDepositAccount)

package Transactions -
    interfaces Withdraw, Deposit
    class SavingsAccountTransaction(SavingsAccount), FixedDepositAccountTransaction(FixedDepositAccount)

*/

public class BankMain {
    public static void main(String[] args){
    SavingsAccount s1 = new SavingsAccount(new Account());
    AccountDetailsPrinter.accountDetailsPrinter(s1);
    SavingsTransaction.deposit(s1);
    AccountDetailsPrinter.accountDetailsPrinter(s1);
    }
}