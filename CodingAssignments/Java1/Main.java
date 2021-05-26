package CodingAssignments.Java1;

/*

Create a java program to search through the home directory and look for files
that match a regular expression. The program should be able to take inputs repeatedly
and should print out the full absolute path of the matching files found.

 */

import CodingAssignments.InputReader;
import CodingAssignments.Java9.ReadRegEx;

import java.io.IOException;
import java.util.regex.*;


public class Main {
    static Pattern pattern;
    static Matcher matcher;
    static String  fileName, moreInput;
    static boolean isMoreInput;
    static ReadRegEx readRegEx = new ReadRegEx();
    static FileMatcher fileMatcher = new FileMatcher();

    public static void main(String[] args) throws IOException {
        do{
            pattern= readRegEx.readAndValidateRegEx();
            fileName= InputReader.inputReader("Enter the file name to be searched.");
            matcher=pattern.matcher(fileName);
            fileMatcher.fileMatcher(matcher, fileName);
            toContinue();
        }while(isMoreInput);

    }
    // Checks for continuation of program
    static void toContinue(){
        moreInput=InputReader.inputReader("\nWant to enter another string ? [ Y / N ]");

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

    }
}
