# Bank Management
### The above example demonstrates a use-case of SOLID principles.
This project is composed of 2 main components. 
* Accounts
* Transactions

Each of these components correspond to 2 important Bank management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility Principle
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Accounts, in order to perform utility tasks on the Account class additional classes ```ModifyAccountDetails ``` and ``` PrintAccountDetails ``` are 
created instead of modifying the Account class with new methods.
* The global class ```ObjectPrinter``` takes the responsibility of printing all the data members of any given object and further reduces the reason for other printer classes to be modified.
* In all the scenarios, the base classes were not added with additional methods and have only one reason to change. Hence, demonstrating the SRP.

## Open Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Account, the employee schema is modified by extending the ```Account``` class into ```ModifiedAccount``` class . For any modifications to the characteristics of an Account, simply the Account class can be inherited and the class object can be substituted very easily in place of Account object.

## Liskov substitution

## Interface Segregation

## Dependency Inversion
This principle states that various modules should be rightly decoupled and work with abstractions so that changes can be accomodated easily.
* In order to create a savings account, we nee dto pass an ```Account``` type to the `SavingsAccount` constructor.
* However, since Modified account is also a possibility in our system, we decouple the creation of savings account type by doing the following:
```java
SavingsAccount savingsAccount = new SavingsAccount(new Account());
```
or
```java
SavingsAccount savingsAccount = new SavingsAccount(new ModifiedAccount());
```
* This demonstrates the dependency inversion principle.
