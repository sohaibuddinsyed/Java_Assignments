# Bank Management System

The above example demonstrates a use-case of SOLID principles. The project is composed of 2 main components.
* Accounts
* Transactions
### Structure of the program
```
package Accounts -
    abstract class Account
    class Account, ModifiedAccount extends Account
    class SavingsAccount(Account / ModifiedAccount), FixedDepositAccount(Account/ModifiedAccount)
    class PrintAccountDetails (SavingsAccount / FixedDepositAccount)
    class ModifyAccountDetails (SavingsAccount / FixedDepositAccount)

package Transactions -
    interfaces Withdraw, Deposit
    class SavingsAccountTransaction(SavingsAccount), FixedDepositAccountTransaction(FixedDepositAccount)

```
Both of these components correspond to actual Hotel management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility Principle
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Accounts, in order to add details, additional class `AddAccountDetails` has been created instead of modifying the Account class with new method.
* Similarly, the class `ShowAccountDetails` takes the responsibility of printing the details of any Account type.
* The globalclass `Printer` takes the responsibility of printing all the data members of any given object and further reduces the reason for other printer classes to be modified.

In all the scenarios, classes hold SRP and have not more than one reason to change.

## Open Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Accounts, the behavior of class `Account` is extended by creating a new class `ModifiedAccount` instead of modifying the Account class with new methods.
* The scenarios use extension as a solution to modification.


## Liskov Substitution Principle and Interface Segregation
Liskov substitution implies that the super class must be substitutable for its subclass. It applies for the subclass to be in perfect behavioural synchronization with the superclass and according to Interface Segregation, larger interfaces should be split into smaller ones. This allows the implementing classes to be flexible with their methods of relevance.
* In package Transactions, the two main type of transactions are withdraw and deposit represented by interfaces `Withdraw` and `Deposit` respectively.
* Each of the transaction types are implemented by classes `DepositTransaction` and `WithdrawTransaction`.
* This segregation of transaction types into two separate interface isntead of one makes the subclass account for distinct behaviour expected.
* Hence both the principles are satisfied.

## Dependency Inversion
The principle of dependency inversion implies modules to be loosely coupled and abstracted so as to have maximum flexibility.
* In package Airline_Management, both `SavingsAccount` and `DepositAccount` can take an object of any Account types.
* Both these scenarios depict dependency inversion, abstraction and loose coupling between unrelated classes.

```java
SavingsAccount savingsAccount = new SavingsAccount(new Account());
```
or

```java
SavingsAccount savingsAccount = new SavingsAccount(new ModifiedAccount());
```
