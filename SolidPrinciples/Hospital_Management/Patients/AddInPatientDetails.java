package SolidPrinciples.Hospital_Management.Patients;

import java.util.Scanner;

public class AddInPatientDetails {
    static Scanner sc=new Scanner(System.in);
    public static void addInPatientDetails(InPatient inPatient){
        System.out.println("Enter the patient name:");
        inPatient.setName(sc.next());
        System.out.println("Enter the patient age:");
        inPatient.setAge(sc.nextInt());
        System.out.println("Enter admitted patient's room number:");
        inPatient.setRoomNo(sc.nextInt());
    }
}
