
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
* In both the scenarios, the base classes were not added with additional methods in order to follow the Single Responsibility Principle.
