package SolidPrinciples.Hospital_Management.Treatments;

import SolidPrinciples.Hospital_Management.Patients.Patient;

import java.util.Scanner;

public class Consultation extends Appointment implements CheckUp {
    Scanner sc=new Scanner(System.in);
    public Consultation(Patient patient){
        System.out.println("This is Consultation for "+ patient.getName());
    }
    @Override
    public void checkUp() {
        System.out.println("Enter the doctor's name:");
        setDoctorName(sc.next());
        System.out.println("Enter appointment time:");
        setAppointmentTime(sc.next());
        System.out.println("\nAppointment fixed. Checkup will be Done.");
    }
}
