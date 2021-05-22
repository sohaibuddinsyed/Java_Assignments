package SolidPrinciples.Hospital_Management.Treatments;

import java.util.Scanner;

public class Diagnostic extends Appointment implements LabTest{

    Scanner sc=new Scanner(System.in);
    @Override
    public void labTest() {
        System.out.println("Enter the doctor's name:");
        setDoctorName(sc.next());
        System.out.println("Enter appointment time:");
        setAppointmentTime(sc.next());
        System.out.println("\nLab test performed.");
    }
}
