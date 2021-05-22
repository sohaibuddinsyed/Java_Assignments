package SolidPrinciples.Hospital_Management.Patients;


import SolidPrinciples.ObjectPrinter;

public class ShowPatientDetails {

    static public void showPatientDetails(OutPatient outPatient){
        ObjectPrinter.printer("The outPatient details are :",
                outPatient.getName(), outPatient.getAge());

    }
    static public void showPatientDetails(InPatient inPatient){
        ObjectPrinter.printer("The inPatient details are :",
               inPatient.getName(),inPatient.getAge(), inPatient.getRoomNo());

    }
}
