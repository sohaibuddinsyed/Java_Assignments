
# Airline Management
### The above example demonstrates a use-case of SOLID principles.
The project is composed of 4 main components. 
* Employees
* Flights
* Tickets

### Structure of the program - 
```
package Employs -
    class Employee
    class Modified employee extends Employee
    class AddEmployee, AddModifiedEmployee, ShowEmployeeDetails
    
package Tickets -
    abstract class Ticket
    abstract class TicketBookingService
    class TicketBookingForEconomy, TicketBookingForExecutive extends TicketBookingService
    class TicketBookingWithVoucher extends Ticket
    
package Flights - 
    interfaces FlightChecks, UtilityChecks
    class Flight(Employee,Ticket) implements FlightChecks, UtilityChecks
```
Each of these components correspond to actual Airline management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility Principle
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Employes, in order to perform utility tasks on the Employee class additional classes ``` AddEmployee ``` and ``` ShowEmployeeDetails ``` are created instead of modifying the Employee class with new methods.
* In package Ticket, classes ```PrintTicketDetails``` and ```TicketBookingService``` take the responsibility of displaying and booking respectively instead of changing the Ticket class. 
* Further, the class ```Printer``` takes the responsibility of printing all the data members of any given object and further reduces the reason for other printer classes to be modified.
* In all the scenarios, the base classes were not added with additional methods and have only one reason to change. Hence, demonstrating the SRP.

## Open-Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Employee, the employee schema is modified by extending the ```Employee``` class into ```ModifiedEmployee``` class while ```AddModifiedEmployee``` extends ```ModifiedEmployee```.
* In package Employee, ```TicketBookingForEconomy``` and ```TicketBookingForExecutive``` extend ```TicketBookingService```.
* Both the scenarios provide extension as a solution to modification.

## Liskov Substitution Principle
This principle implies that the super class must be substitutable for its subclass. This applies for the subclass to be in perfect behaviour synchronization with superclass.
* In package Ticket, tickets booked are represented by the `Ticket` class. There are two type of bookings, 
commercial and
invite based (vouchers). 
* The commercial tickets are booked by `TicketBookingForEconomy` and `TicketBookingForExecutive` classes which extend the abstract `TicketBookingServiceClass`.
* However, adding a different kind of TicketBookingForVoucher by extending the abstract TicketBookingServiceClass would violate the Liskov principle since `TicketBookingWithVoucher` will have no payment methods involved and will differ in behaviour.
* Hence, `TicketBookingWithVoucher` extends the Ticket class.


## Interface Segregation principle
According to this principle, larger interfaces should be split into smaller ones. This allows the implementing classes to be flexible with their methods of relevance.
* In package Flights, the various kind of flight checks must be put into different interfaces.
* `AeroplaneChecks` hold all essential aircraft checks.
* `UtilityChecks` contains methods for utility and less essential checks.
* This allows Flight type to implement both the interfaces and perform both type of checks.



## Dependency Inversion
The principle of dependency inversion implies modules to be loosely coupled and abstracted so as to have maximum flexibility.
* In package Airline_Management, a flight object can take any `Employee`,`Ticket` subclasses.
* Both the scenarios below depict dependency inversion while providing abstraction and lower coupling.
```Java
Employee employee = new Employee();
TicketBookingForEconomy ticket = new TicketBookingForEconomy();
Flight flight = new Flight(employee, ticket);
 ```
 or
 
 ```Java
ModifiedEmployee modifiedEmployee = new ModifiedEmployee ();
TicketBookingForExecutive ticket = new TicketBookingForExecutive();
Flight flight = new Flight(modifiedEmployee, ticket);
