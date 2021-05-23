package SolidPrinciples.Hospital_Management;

import SolidPrinciples.Hospital_Management.Patients.*;
import SolidPrinciples.Hospital_Management.Treatments.Consultation;


public class HospitalMain {
   public static void main(String [] args){
       InPatient inPatient = new InPatient();
       AddInPatientDetails.addInPatientDetails(inPatient);
       ShowPatientDetails.showPatientDetails(inPatient);

       Consultation consultation = new Consultation(inPatient);
       consultation.checkUp();
   }
}

/*

package Patients -
   abstract class Patient
   class InPatient, OutPatient extends Patient
   class AddPatientDetails, ShowPatientDetails

package Treatments -
    abstract class Doctor
    abstract class Appointment extends Doctor
    interface LabTests, CheckUp
    class Consultation implements CheckUp extends Appointment
    class Diagnostic implements LabTests extends Appointment
    class Emergency extends Doctor

 */