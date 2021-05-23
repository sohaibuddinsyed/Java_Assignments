package SolidPrinciples.Bank_Management.Accounts;

import java.util.Scanner;

public class AddAccountDetails {
    static Scanner sc = new Scanner(System.in);

    public static void addAccountDetails(Account account){
        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextInt())  ;
        System.out.print("Enter the holder name:");
        account.setHolderName(sc.next())  ;
        System.out.print("Enter initial balance :");
        account.setBalance(sc.nextInt());

    }
    public static void addAccountDetails(ModifiedAccount modifiedAccount){
        System.out.print("Enter modifiedAccount number: ");
        modifiedAccount.setAccountNumber(sc.nextInt())  ;
        System.out.print("Enter the holder name:");
        modifiedAccount.setHolderName(sc.next())  ;
        System.out.print("Enter initial balance :");
        modifiedAccount.setBalance(sc.nextInt());
        System.out.print("Enter the min balance (Modified detail) :");
        modifiedAccount.setMinimumBalance(sc.nextInt());

    }
}
