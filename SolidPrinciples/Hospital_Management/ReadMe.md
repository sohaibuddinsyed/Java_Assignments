# Hospital Management

## Dependency Inversion
The principle of dependency inversion implies modules to be loosely coupled and abstracted so as to have maximum flexibility.
* In our example, all the three types of Appointment classes, `Consultation`,`Diagnostic` and `Surgery' can take an object of any `Patient` class types.
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
