package CodingAssignments.Java6;
/*

Create a class with a constructor that takes a String argument.
During construction, print the argument.
Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.

Complete the previous exercise by creating objects to attach to the array of references.

 */

public class ObjectReferences {
    ObjectReferences(String string){
        System.out.println(string);
    }
    public static void main (String []args){
        ObjectReferences objectReferences = new ObjectReferences("Hello World");
        ObjectReferences [] arrayOfObjectReferences = new ObjectReferences[5];

        //Initializing an array of object references
        for(ObjectReferences iterator : arrayOfObjectReferences){
            iterator = objectReferences;
        }
        // Initializing each element in an array of object references with objects.
        for(ObjectReferences iterator : arrayOfObjectReferences){
            iterator = new ObjectReferences("Hello world from array of objects.");
        }
    }
}
