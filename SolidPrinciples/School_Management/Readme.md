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

# Single Responsibility Principle
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Staff, in order to add details in the Staff sub classes additional classes `AddAttenderDetails` and 
`AddFacultyDetails` are created instead of modifying the Staff class with new methods.
* In package Students, the different types of students are put into separate classes `DayScholarStudent` and `HostelStudent` instead of modifying the behaviour of `Student`.
* The globalclass Printer takes the responsibility of printing all the data members of any given object and further reduces the reason for 
other printer classes to be modified.
In all the scenarios, classes hold SRP and have not more than one reason to change.
