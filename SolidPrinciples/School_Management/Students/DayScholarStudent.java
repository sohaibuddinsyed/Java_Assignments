package SolidPrinciples.School_Management.Students;

import java.util.Scanner;

public class DayScholarStudent extends Student implements StudentDuties{
    private int schoolFee;
    private boolean waiver;
    Scanner sc=new Scanner(System.in);
    public DayScholarStudent(){
        System.out.println("Enter the name of student:");
        setName(sc.next());
        System.out.println("Enter the class of student:");
        setClass(sc.nextInt());
        System.out.println("Enter the roll number of student:");
        setRollNumber(sc.nextInt());
        System.out.println("Enter the school fee of student:");
        this.schoolFee=sc.nextInt();
        System.out.println("Does the student have a waiver (true/false):");
        this.waiver=sc.nextBoolean();
    }
    @Override
    public double schoolFeeCalculation(int schoolFee) {
        if(this.waiver == true)
            return 0;
        else
            return this.schoolFee;
    }
    public void totalFee(){

        System.out.println("The total fee for "+getName()+ " with roll number " + getRollNumber()
                +" is: " + schoolFeeCalculation(this.schoolFee));
    }
}
