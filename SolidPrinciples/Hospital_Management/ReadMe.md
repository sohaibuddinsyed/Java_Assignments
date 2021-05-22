# Hospital Management

The above example demonstrates a use-case of SOLID principles.
The project is composed of 2 main components.
* Patients
* Treatments

Both of these components correspond to actual Hospital management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility 
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Patients, in order to add details in the Patient classes, `InPatient` and `OutPatient` additional classes `AddInPatientDetails` and `AddOutPatientDetails` are created instead of modifying the Patient class with new methods.
* In package Treatments, the different types of appointments are put into separate classes `Consultation` and `Diagnostic` instead of modifying the behaviour of `Appointment`.
* The globalclass Printer takes the responsibility of printing all the data members of any given object and further reduces the reason for other printer classes to be modified.
In all the scenarios, classes hold SRP and have not more than one reason to change.

## Open Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Patients, the behavior of class `Patient` is extended into `InPatient` and `OutPatient` instead of modifications to base class Patient.
* In package Treatments, the different types of appointments are put into separate classes `Consultation` and `Diagnostic` instead of modifying the behaviour of `Appointment`.
* Both the scenarios use extension as a solution to modification.

## Liskov Substitution Principle
This principle implies that the super class must be substitutable for its subclass. It applies for the subclass to be in perfect behavioural synchronization with the superclass.
* In package Treatments, the 2 services `Consultation` and `Diagnosis` extend the abstract `Appointment` class.
* However, adding an emergency service via `Emergency` class by extending the abstract `Appointment` class would violate the Liskov principle since `Emergency` class will not have any need for prior appointments and will differ in behaviour. 
* Hence, both `Emergency` class and `Appointment` class nare modified to extend a new abstract class `Doctor` which provides all the support for emergency without violating Liskov principle.

## Interface Segregation principle
According to this principle, larger interfaces should be split into smaller ones. This allows the implementing classes to be flexible with their methods of relevance.
* In package Treatments, the interfaces `CheckUp` and `LabTest` are split in order to provide more meaning to underlying classes that regard consultation and diagnosis differently.

## Dependency Inversion
The principle of dependency inversion implies modules to be loosely coupled and abstracted so as to have maximum flexibility.
* In our example, all the three types of Appointment classes, `Consultation`,`Diagnostic` and `Surgery` can take an object of any `Patient` class type.
```Java 
InPatient inPatient = new InPatient();
Consultation consultation = new Consultation(inPatient); 
```
or
```Java 
OutPatient inPatient = new OutPatient();
Consultation consultation = new Consultation(outPatient); 
```
* This clearly demonstrates Dependency Inversion.
