package CodingAssignments.Java11;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static String inputString;
    public static Map<Character,Integer> map = new HashMap<Character,Integer>();

    public static void main(String [] args) throws Exception {
        CountCharsInFile.countCharsInFile(map,readFileAsString(args[0]));
        WriteToFile.writeToFile(map,args[1]);
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

}
