package CodingAssignments.Java4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
( KYC ) which has to be filled annually.
form date -> date the form was filled
KYC form can only be filled within + or - 30 days of the signup anniversary

 */
public class Java4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
//        date.;
        int inputs;
        inputs = Integer.parseInt(sc.nextLine());


        while(inputs!= 0){
            solve(sc.nextLine());
            --inputs;
        }

    }
    static void solve(String bothDates){
        int [] arrayDate1,arrayDate2;
        String[] dates = new String[2];
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        StringTokenizer stringTokenizer = new StringTokenizer(bothDates," ");
        dates[0] = (String)stringTokenizer.nextElement();
        dates[1] = (String) stringTokenizer.nextElement();

        arrayDate1 = makeIntDate(dates[0]);
        Calendar signUpDate = Calendar.getInstance();
        signUpDate.set(arrayDate1[2],arrayDate1[1]-1,arrayDate1[0]);

        arrayDate2 = makeIntDate(dates[1]);
        Calendar currentDate = Calendar.getInstance();
        currentDate.set(arrayDate2[2],arrayDate2[1]-1,arrayDate2[0]);

        Calendar previous30Days = Calendar.getInstance();
        previous30Days.set(arrayDate2[2],arrayDate1[1]-1,arrayDate1[0]);
        previous30Days.add(Calendar.DATE,-30);

        Calendar next30Days = (Calendar) signUpDate.clone();
        previous30Days.set(arrayDate2[2],arrayDate1[1]-1,arrayDate1[0]);
        next30Days.add(Calendar.DATE,+30);

        if((sdf.format(previous30Days.getTime())).equals(sdf.format(currentDate.getTime())) ||
                (sdf.format(previous30Days.getTime())).equals(sdf.format(next30Days.getTime())) ){
            System.out.println("No Range");
        }else if(next30Days.after(currentDate)){
            System.out.println(sdf.format(previous30Days.getTime()) + " " + sdf.format(currentDate.getTime()));
        }else{
            System.out.println(sdf.format(previous30Days.getTime()) + " " + sdf.format(next30Days.getTime()));
        }

//        System.out.println("\nSignup: " +sdf.format(signUpDate.getTime()) + " " + "Current: " +sdf.format(currentDate.getTime()));
//        System.out.println("\np: " +sdf.format(previous30Days.getTime()) + " " + "n: " +sdf.format(next30Days.getTime()));

    }
    static int[] makeIntDate(String string){
        int [] array = new int[3];
        array[0] = Integer.parseInt(string.substring(0,2));
        array[1] = Integer.parseInt(string.substring(3,5));
        array[2] = Integer.parseInt(string.substring(6,10));
        return array;
    }
}
