package SolidPrinciples.Hospital_Management.Treatments;

import java.util.Scanner;

public class Consultation extends Appointment implements CheckUp {
    Scanner sc=new Scanner(System.in);
    @Override
    public void checkUp() {
        System.out.println("Enter the doctor's name:");
        setDoctorName(sc.next());
        System.out.println("Enter appointment time:");
        setAppointmentTime(sc.next());
        System.out.println("\nAppointment fixed. Checkup will be Done.");
    }
}
