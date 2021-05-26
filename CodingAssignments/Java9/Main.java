package CodingAssignments.Java9;

import CodingAssignments.InputReader;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Pattern pattern;
    static Matcher matcher;
    static String input, moreInput;
    static boolean isMoreInput;

    public static void main(String[] args) throws IOException {
        ReadRegEx readRegEx = new ReadRegEx();
        do{
            pattern= readRegEx.readAndValidateRegEx();
            input= InputReader.inputReader("Enter the string to be checked against regex: ");
            matcher=pattern.matcher(input);
            ValidateRegex.validateRegex(matcher,input);
            isMoreInput = ToContinue.toContinue(isMoreInput);
        }while(isMoreInput);

    }

}
