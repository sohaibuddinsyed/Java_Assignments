package CodingAssignments.Java9;

import CodingAssignments.InputReader;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class ReadRegEx {
    static String regularExpression;
    static Pattern pattern;
    boolean isValidRegularExpression;

    public Pattern readAndValidateRegEx(){

        // Reading and validating a regular expression from the user
        do{
            isValidRegularExpression=true;
            regularExpression = InputReader.inputReader("\nEnter the regular expression: ");
            try{
                pattern = Pattern.compile(regularExpression);
            }catch(PatternSyntaxException patternSyntaxException) {
                System.out.println("Invalid syntax. Try again.");
                isValidRegularExpression = false;
            }
        }while(!isValidRegularExpression);

        return pattern;
    }
}
