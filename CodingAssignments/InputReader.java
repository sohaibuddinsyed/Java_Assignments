package CodingAssignments;

import java.util.Scanner;

public class InputReader {
    public static String inputReader(String string){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println(string);
        input = sc.nextLine();
        return input;
    }
}
