package CodingAssignments.Java8;

import CodingAssignments.InputReader;

public class Main {
    public static void main(String[]args){
        int exceptionValue;
        Exceptions exceptions = new Exceptions();
        try{
            exceptionValue = Integer.parseInt(InputReader.inputReader("Enter the value\n" +
                    "1 -> Exception1 " +
                    "\n2 -> Exception2 " +
                    "\n3 -> Exception3 " +
                    "\n4 -> NullPointerException"));
            exceptions.exceptions(exceptionValue);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Finally clause executed.");
        }
    }
}
