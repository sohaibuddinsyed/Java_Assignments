package CodingAssignments.Java9;

import CodingAssignments.InputReader;

public class ToContinue {
    static String moreInput;
    static boolean toContinue(boolean isMoreInput){
        moreInput= InputReader.inputReader("\nWant to enter another string ? [ Y / N ]");

        if(moreInput.equalsIgnoreCase("Y")){
            isMoreInput = true ;
        }
        else if(moreInput.equalsIgnoreCase("N")){
            isMoreInput = false ;
        }
        else {
            isMoreInput = true ;
            System.out.println("Enter [ Y / N ] !!!");
        }
        return isMoreInput;

    }
}
