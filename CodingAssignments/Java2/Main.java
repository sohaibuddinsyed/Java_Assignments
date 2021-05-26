package CodingAssignments.Java2;

import CodingAssignments.InputReader;
import java.util.Scanner;

/*

Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.

 */

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String inputString;
    static boolean [] alphabets = new boolean[26];

    // Space - O(n)
    // Time - O(n)

    public static void main(String []args){
        Writer writer = new Writer();
        ContainsAlphabet containsAlphabet = new ContainsAlphabet();

       inputString = InputReader.inputReader("Enter the string to check if it contains entire alphabet :");
       containsAlphabet.containsAlphabet(inputString,alphabets);
       writer.writer(alphabets);
    }
}
