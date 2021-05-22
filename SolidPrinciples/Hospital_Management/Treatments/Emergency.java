package SolidPrinciples.Hospital_Management.Treatments;

import java.util.Scanner;

public class Emergency extends Doctor{

    Scanner sc=new Scanner(System.in);
    public void emergency(){
        System.out.println("Enter the doctor's name:");
        setDoctorName(sc.next());
    }
}
