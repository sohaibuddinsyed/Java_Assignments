package CodingAssignments;

/*

Create a java program to search through the home directory and look for files
that match a regular expression. The program should be able to take inputs repeatedly
and should print out the full absolute path of the matching files found.

 */

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.*;


public class Java1 {

    static Scanner sc = new Scanner(System.in);
    static Pattern pattern;
    static Matcher matcher;
    static String regularExpression, fileName, moreInput;
    static boolean isValidRegularExpression, isMoreInput;
    static File file;

    public static void main(String[] args) throws IOException {
        // Reading a regular expression from the user
        do{
            isValidRegularExpression=true;
            System.out.println("\nEnter the regular expression for the file(s) to be searched : ");
            regularExpression = sc.nextLine();
            try{
                pattern = Pattern.compile(regularExpression);
            }catch(PatternSyntaxException patternSyntaxException) {
                System.out.println("Invalid syntax. Try again.");
                isValidRegularExpression = false;
            }
        }while(!isValidRegularExpression);

        // Reading the file name continuously
        do{

            System.out.println("Enter the filez name to be searched.");
            fileName = sc.nextLine();

            matcher=pattern.matcher(fileName);
            if (matcher.find()) {
                Path path = Path.of("").toAbsolutePath();
                file = new File( "C:\\Users\\cools\\IdeaProjects\\Java Assignments\\src\\CodingAssignments", fileName);
                System.out.println(file.getParent());
                if (file.exists()) {
                    System.out.println("Absolute path of the file is :" + file.getAbsolutePath());
                } else {
                    System.out.println("File does not exist.");
                }
            } else {
                System.out.println("File name does not match the regular expression.");
            }
            System.out.println("\nWant to enter another string ? [ Y / N ]");
            moreInput = sc.nextLine();
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

        }while(isMoreInput);

    }
}
