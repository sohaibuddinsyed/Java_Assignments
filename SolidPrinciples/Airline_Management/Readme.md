
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
* In package Employes, classes ``` AddEmployee ``` and ``` ShowEmployeeDetails ``` take the responsibility of adding new Employee data and displaying the same.
* In package Ticket, classes ```PrintTicketDetails``` and ```TicketBookingService``` take the responsibility of displaying and booking respectively.
* * Further, the class ```Printer``` takes the responsibility of printing all the data members of any given object.
* In all the scenarios, the base classes were not added with additional methods in order to follow the Single Responsibility Principle.

## Open-Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Employee, the employee schema is modified by extending the ```Employee``` class into ```ModifiedEmployee``` class while ```AddModifiedEmployee``` extends ```ModifiedEmployee```.
* In package Employee, ```TicketBookingForEconomy``` and ```TicketBookingForExecutive``` extend ```TicketBookingService```.
* Both the scenarios provide extension as a solution to modification.
