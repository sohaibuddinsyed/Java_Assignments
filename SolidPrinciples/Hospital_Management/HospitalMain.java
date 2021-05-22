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

package Patient:    // S,O,D
   abstract class Patient
   class InPatient, OutPatient extend Patient
   class AddPatientDetails, ShowPatientDetails

package Treatments  // I,L
    abstract class Doctor
    interface LabTests, CheckUp
    abstract class Appointment extends Doctor
    class Consultation implements CheckUp extends Appointment
    class Diagnostic implements LabTests extends Appointment
    class Emergency extends Doctor

 */