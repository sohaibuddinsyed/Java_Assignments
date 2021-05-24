package CodingAssignments;

import java.util.HashMap;
import java.util.Scanner;

/*
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.

 */


public class Java2 {
    static Scanner sc = new Scanner(System.in);
    static String inputString;

    public static void main(String []args){
       System.out.println("Enter the string to check if it contains entire alphabet :");
       inputString = sc.next();
       containsAlphabet(inputString);
    }


    // Space - O(n)
    // Time - O(n)
    static void containsAlphabet(String inputString){
        boolean [] alphabets = new boolean[26];

        // Compares the ASCII values
        for(int i=0 ; i < inputString.length();i++){
            if(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z'  ){
                alphabets[inputString.charAt(i) - 97] = true;
            }
            if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z'  ){
                alphabets[inputString.charAt(i) - 65] = true;
            }
        }
        for( boolean b : alphabets){
            if(b == false) {
                System.out.println("Input string does not contain entire alphabet");
                return;
            }
        }
        System.out.println("Input string contains entire alphabet");
    }


}
