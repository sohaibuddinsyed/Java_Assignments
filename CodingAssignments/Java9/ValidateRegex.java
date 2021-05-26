package CodingAssignments.Java9;

import java.util.regex.Matcher;

public class ValidateRegex {
    public static void validateRegex(Matcher matcher, String input){
        if(matcher.find() && input.charAt(0)>='A' && input.charAt(0)<='Z' && input.charAt(input.length()-1)=='.')
            System.out.println("Input starts with a capital letter and ends with a period.");
        else if(matcher.find())
            System.out.println("Regex matched input string. \nHowever, input does not start with a capital letter and does not end with a period.");
        if(!matcher.find())
            System.out.println("Regex does not match input.");
    }
}
