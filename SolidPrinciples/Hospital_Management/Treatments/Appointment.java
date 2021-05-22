package SolidPrinciples.Hospital_Management.Treatments;

public abstract class Appointment extends Doctor {
    private String appointmentTime;

    void setAppointmentTime(String setAppointmentTime){ this.appointmentTime=appointmentTime;}

    String getAppointmentTime(){return this.appointmentTime;}

}
