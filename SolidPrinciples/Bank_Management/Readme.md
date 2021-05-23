# Bank Management System

The above example demonstrates a use-case of SOLID principles. The project is composed of 2 main components.
* Accounts
* Transactions

Both of these components correspond to actual Hotel management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility 
According to this principle, each class should have a single resonsibility and must change only for one reason.



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

