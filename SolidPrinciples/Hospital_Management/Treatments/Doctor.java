package SolidPrinciples.Hospital_Management.Treatments;

public abstract class Doctor {
    private String doctorName;

    void setDoctorName(String name){ this.doctorName=name;}
    String getDoctorName(){ return this.doctorName;}
}
