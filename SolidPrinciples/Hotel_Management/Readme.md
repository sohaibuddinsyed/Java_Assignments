# Hotel management

The above example demonstrates a use-case of SOLID principles. The project is composed of 2 main components.
* Guests
* Bookings

Both of these components correspond to actual Hotel management elements. The various ways in which SOLID practices are followed is explained below.

## Single Responsibility 
According to this principle, each class should have a single resonsibility and must change only for one reason.
* In package Guests, in order to add details in the Guest sub classes, additional classes `AddRegularGuestDetails` and `AddVipGuestDetails` are created instead of modifying the Guest class with new methods.
* The class `ShowGuestDetails` takes the responsibility of printing the details of any Guest type.
* The globalclass `Printer` takes the responsibility of printing all the data members of any given object and further reduces the reason for other printer classes to be modified.

In all the scenarios, classes hold SRP and have not more than one reason to change.

## Open Closed Principle
According to this principle, every class should be open to extension but closed to modification.
* In package Guests, the behavior of class `Guest` is extended into `RegularGuest` and `VipGuest` instead of modifications to base class Guest.
* In package Bookings, the different types of bookables are put into separate classes `RegularRoom` , `VipRoom` and `Suit` instead of modifying the behaviour of `Booking` by extending the abstract superc classes.
* Both the scenarios use extension as a solution to modification.


## Liskov Substitution Principle
This principle implies that the super class must be substitutable for its subclass. It applies for the subclass to be in perfect behavioural synchronization with the superclass.
* In package Bookings, there exist 3 booking options i.e. regular rooms, vip rooms and suites.
* In order to satisfy the Liskov principle, classes `RegularRoom` and `VipRoom` both inherit from an abstract class `Room` which inturn extends `Booking`.
* `Suit` extends `Boooking` directly instead of `Room`.

This makes all sub-classes able to substitute for super classes.



## Interface Segregation principle
According to this principle, larger interfaces should be split into smaller ones. This allows the implementing classes to be flexible with their methods of relevance.
* In package Bookings, there are three Booking types namely `VipRooms` , `RegularRooms` and `Suites` . 
* Instead of creating a common large interface of general services, 2 different interfaces `RegularRoomServices` and `VipRoomServices` have been created.
* This allows Suit type to implement both the interfaces and offer both type of services.



## Dependency Inversion
The principle of dependency inversion implies modules to be loosely coupled and abstracted so as to have maximum flexibility.
* In package Guests, `ShowGuestDetails.showGuestDetails()` takes an abstraction of any Guest type.
```Java
ShowGuestDetails.showGuestDetails(vipGuest);
ShowGuestDetails.showGuestDetails(regularpGuest);
```

* Between both the packages, the `checkIn()` in Guest sub classes can take an abstraction of all Booking types.
```Java
// Creating and passing a reference of Suit type
VipRoom vipRoom = new VipRoom();
vipGuest.checkIn(vipRoom);
```

```Java
// Creating and passing a reference of Suit type
Suit suit = new Suit();
vipGuest.checkIn(suit);
```
* Both these scenarios depict dependency inversion.
