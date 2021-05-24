package CodingAssignments.Java7;
/*

Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
In the base class, provide methods that are common to all Rodents, and override these in the derived classes
to perform different behaviors depending on the specific type of Rodent.

Create an array of Rodent, fill it with different specific types of Rodents,
and call your base-class methods to see what happens.

Make the methods of Rodent abstract whenever possible and all classes should have default constructors that
prints a message about that class.

 */

public class InheritanceWithRodents {

    public static void main(String [] args){
        Rodent [] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();

        // Over-riding base class methods
        rodent[0].whichTypeOfRodent();
        rodent[1].whichTypeOfRodent();
        rodent[2].whichTypeOfRodent();

    }
}
class Rodent{

    Rodent(){
        System.out.println("Constructor of Rodent Superclass");
    }
    // method common to all Rodents
    void whichTypeOfRodent(){
        System.out.println("I am a Rodent.");
    }
}
class Mouse extends Rodent{

    Mouse(){
        System.out.println("Constructor of Mouse");
    }
    void whichTypeOfRodent(){
        System.out.println("I am a Mouse.");
    }
}
class Gerbil extends Mouse{

    Gerbil(){
        System.out.println("Constructor of Gerbil");
    }
    void whichTypeOfRodent(){
        System.out.println("I am a Gerbil.");
    }
}
class Hamster extends Gerbil{
    Hamster(){
        System.out.println("Constructor of Hamster");
    }
    void whichTypeOfRodent(){
        System.out.println("I am a Hamster");
    }
}
