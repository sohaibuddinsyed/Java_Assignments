# School Management

The above example demonstrates a use-case of SOLID principles.
The project is composed of 4 main components.

* Staff
* Students
### Structure of the program
```
package Staff -       
    abstract class Employee
    abstract TeachingStaff, NonTeachingStaff extends Employee
    class Faculty extends TeachingStaff
    class Attender extends NonTeachingStaff
    class ShowEmployeeDetails
    class AddEmployeeDetails

package Student -   
   abstract class Student
   interface StudentDuties, Hosteler Duties
   class HostelStudent, DayScholarStudent extends Student implement StudentDuties, Hosteler Duties
```
Each of these components correspond to actual School management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility Principle
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Staff, in order to add details in the Staff sub classes additional classes `AddAttenderDetails` and 
`AddFacultyDetails` are created instead of modifying the Staff class with new methods.
* In package Students, the different types of students are put into separate classes `DayScholarStudent` and `HostelStudent` instead of modifying the behaviour of `Student`.
* The globalclass Printer takes the responsibility of printing all the data members of any given object and further reduces the reason for 
other printer classes to be modified.

In all the scenarios, classes hold SRP and have not more than one reason to change.

## Open-Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Staff, the behavior of class `Employee` is extended into abstract classes `TeachingStaff` and `NonTeachingStaff` instead of modifications to itself.
* Further, abstract classes `TeachingStaff` and `NonTeachingStaff` are extended by classes `Faculty` and `Attender` inorder to implement specific features.
* In package Students, the different types of students are put into separate classes  `DayScholarStudent` and `HostelStudent` instead of modifying the behaviour of `Student` .
* Both the scenarios use extension as a solution to modification.


## Liskov Substitution Principle
This principle implies that the super class must be substitutable for its subclass. It applies for the subclass to be in perfect behavioural synchronization with the superclass.
* In package Staff, there exist 2 type of staff members, `Faculty` and `Attender`.
* In order to satisfy the Liskov principle, these classes extend abstract classes `TeachingStaff` and `NonTeachingStaff` which inturn extend `Employee`.

This makes all sub-classes able to substitute for super classes.


## Interface Segregation principle
According to this principle, larger interfaces should be split into smaller ones. This allows the implementing classes to be flexible with their methods of relevance.
* In package Students, there are 2 Duties namely `HostelerDuties` and `StudentDuties`. 
* Instead of creating a common large interface of duties, 2 different smaller interfaces have been created.
* This allows Student types to implement the interfaces according to the type of duties.



## Dependency Inversion
The principle of dependency inversion implies modules to be loosely coupled and abstracted so as to have maximum flexibility.
* In package School_management, `ShowEmployeeDetails.showEmployeeDetails()` takes an abstraction of any Staff type.
```Java
Faculty faculty= new Faculty();
ShowEmployeeDetails.showEmployeeDetails(faculty);
```
or
```Java
Atttender attender = new Attender();
ShowEmployeeDetails.showEmployeeDetails(attender);
```
* Both these scenarios depict dependency inversion.








