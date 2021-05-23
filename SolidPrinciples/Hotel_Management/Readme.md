# Hotel management

The above example demonstrates a use-case of SOLID principles. The project is composed of 2 main components.
* Guests
* Rooms

Both of these components correspond to actual Hospital management elements. The various ways in which SOLID practices are followed is explained below.

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
VipRoom vipRoom =new VipRoom();
vipGuest.checkIn(vipRoom);
```

```Java
// Creating and passing a reference of Suit type
Suit suit = new Suit();
vipGuest.checkIn(suit);
```
* Both these scenarios depict dependency inversion.
