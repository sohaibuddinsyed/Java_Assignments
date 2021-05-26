package CodingAssignments.Java1;

import java.io.File;
import java.nio.file.Path;
import java.util.regex.Matcher;

public class FileMatcher {

    // Checks if the file exists and then mat5ches for absolute path
    public void fileMatcher(Matcher matcher, String fileName){

        File file;
        if (matcher.find()) {
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
    }
}
