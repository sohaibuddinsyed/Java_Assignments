package CodingAssignments.Java6;
/*

 Create a class with two (overloaded) constructors.
 Using this, call the second constructor inside the first one.

 */
public class OverloadedConstructors {
    String message1;
    String message2;

    OverloadedConstructors(String message1){
        this.message1=message1;
    }
    OverloadedConstructors(String message1,String message2){
        this(message1);
        this.message2=message2;
    }

    public static void main(String [] args){
        OverloadedConstructors overloadedConstructors = new OverloadedConstructors("Hello ", "World");
        System.out.println(overloadedConstructors.message1 + overloadedConstructors.message2);
    }
}
