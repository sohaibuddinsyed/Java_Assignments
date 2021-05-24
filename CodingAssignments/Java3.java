package CodingAssignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*

Write a java function that will ping any host ( given as input ) and
computes the median of the time taken to ping.

 */
public class Java3 {

   static Scanner sc = new Scanner(System.in);
   static String inputString;
   static Process process;

    public static void main(String[] args){
        System.out.println("Enter the host ip address:");
        inputString = sc.nextLine();
        ping("ping " +inputString);

    }
    static void ping(String command){
        try{
            process = Runtime.getRuntime().exec(command);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            System.out.println("Response:");
            while((inputString=bufferedReader.readLine()) != null){
                System.out.println(inputString);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
