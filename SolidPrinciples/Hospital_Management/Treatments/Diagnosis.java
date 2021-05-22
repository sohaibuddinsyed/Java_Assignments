package SolidPrinciples.Hospital_Management.Treatments;

import SolidPrinciples.Hospital_Management.Patients.Patient;

import java.util.Scanner;

public class Diagnosis extends Appointment implements LabTest{

    public Diagnosis(Patient patient){
        System.out.println("\nThis is Diagnostic for "+ patient.getName());
    }
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
