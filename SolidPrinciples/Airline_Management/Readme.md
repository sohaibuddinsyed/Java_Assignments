
# Airline Management
### The above example demonstrates a use-case of SOLID principles.
The project is composed of 4 main components. 
* Employees
* Flights
* Tickets
* Passengers

Each of these components correspond to actual Airline management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility Principle
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Employes, in order to perform utility tasks on the Employee class additional classes ``` AddEmployee ``` and ``` ShowEmployeeDetails ``` are created instead of modifying the Employee class with new methods.
* In package Ticket, classes ```PrintTicketDetails``` and ```TicketBookingService``` take the responsibility of displaying and booking respectively instead of changing the Ticket class. 
* Further, the class ```Printer``` takes the responsibility of printing all the data members of any given object and further reduces the reason for other printer classes to be modified.
* In all the scenarios, the base classes were not added with additional methods and have only one reason to change. Hence, demonstrating the SRP.

## Open-Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Employee, the employee schema is modified by extending the ```Employee``` class into ```ModifiedEmployee``` class while ```AddModifiedEmployee``` extends ```ModifiedEmployee```. For any modifications to the characteristics of an Employee, simply the Employee class can be inherited and the class object can be substituted very easily in place of Employee object.
* In package Employee, ```TicketBookingForEconomy``` and ```TicketBookingForExecutive``` extend ```TicketBookingService``` inorder to implement different functionality.
* Both the scenarios provide extension as a solution to modification.

## Liskov Substitution Principle
This principle implies that the super class must be substitutable for its subclass. This applies for the subclass to be in perfect behaviour synchronization with superclass.
* In package Ticket, tickets booked are represented by the `Ticket` class. There are two type of bookings, 
commercial and
invite based (vouchers). 
* The commercial tickets are booked by `TicketBookingForEconomy` and `TicketBookingForExecutive` classes which extend the abstract `TicketBookingServiceClass`.
* However, adding a different kind of TicketBookingForVoucher by extending the abstract TicketBookingServiceClass would violate the Liskov principle since `TicketBookingForVoucher` will have no payment methods involved and will differ in behaviour.
* Hence, `TicketBookingForVoucher` extends the Ticket class.


