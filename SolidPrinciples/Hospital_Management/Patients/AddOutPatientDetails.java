package SolidPrinciples.Hospital_Management.Patients;

import java.util.Scanner;

public class AddOutPatientDetails {
    static Scanner sc=new Scanner(System.in);
    public static void addOutPatientDetails(OutPatient outPatient){
        System.out.println("Enter the patient name:");
        outPatient.setName(sc.next());
        System.out.println("Enter the patient age:");
        outPatient.setAge(sc.nextInt());
    }
}
