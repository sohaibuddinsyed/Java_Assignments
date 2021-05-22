package SolidPrinciples.Bank_Management.Accounts;

import SolidPrinciples.ObjectPrinter;

public class AccountDetailsPrinter {
    public static void accountDetailsPrinter(SavingsAccount savingsAccount){
        ObjectPrinter.printer("The saving account details are :", "\nAcc.No: "+savingsAccount.account.getAccountNumber(),
                "\nAcc.Type:"+savingsAccount.account.getAccountType(),"\nHolder: "+savingsAccount.account.getHolderName(),
                "\nRs. "+ savingsAccount.account.getBalance());
    }
    public static void accountDetailsPrinter(DepositAccount depositAccount){
        ObjectPrinter.printer("The saving account details are :", "\nAcc.No: "+depositAccount.account.getAccountNumber(),
                "\nAcc.Type:"+depositAccount.account.getAccountType(),"\nHolder: "+depositAccount.account.getHolderName(),
                "\nRs. "+ depositAccount.account.getBalance());
    }
}
