package CodingAssignments.Java4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
( KYC ) which has to be filled annually.
form date -> date the form was filled
KYC form can only be filled within + or - 30 days of the signup anniversary

 */
public class Java4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
//        date.;

        int inputs;
        inputs=sc.nextInt();
        String string;
        string=sc.next();
        System.out.println(string);
        string=sc.next();
        System.out.println(string);
    }
}
