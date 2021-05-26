package CodingAssignments.Java3;

import CodingAssignments.InputReader;

import java.util.ArrayList;
import java.util.Scanner;

/*

Write a java function that will ping any host ( given as input ) and
computes the median of the time taken to ping.

 */
public class Main {

   static Scanner sc = new Scanner(System.in);
   static String inputString;
   static ArrayList<Double> pingTimes = new ArrayList<>();

    public static void main(String[] args){
        Ping ping = new Ping();
        MedianCalculation medianCalculation = new MedianCalculation();
        inputString = InputReader.inputReader("Enter the host ip address:");
        pingTimes = ping.ping("ping " + inputString);
        medianCalculation.medianCalculation(pingTimes);
    }

}
