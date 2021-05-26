package CodingAssignments.Java4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
( KYC ) which has to be filled annually.
form date -> date the form was filled
KYC form can only be filled within + or - 30 days of the signup anniversary

 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        int inputs;
        inputs = Integer.parseInt(sc.nextLine());


        while(inputs!= 0){
            RangeCalculation.rangeCalculation(sc.nextLine());
            --inputs;
        }

    }

}
