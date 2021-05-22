package SolidPrinciples.School_Management.Staff;

import SolidPrinciples.ObjectPrinter;

public class ShowEmployeeDetails {

    private Employee e;

    ShowEmployeeDetails(Employee e){
        this.e = e;
    }
    static public void showEmployeeDetails(Faculty faculty){
        ObjectPrinter.printer("The faculty details are :",
                faculty.getId(), faculty.getName(), faculty.getPosition(),faculty.getSalary());

    }
    static public void showEmployeeDetails(Attender attender){
        ObjectPrinter.printer("The attender details are :",
                attender.getId(), attender.getName(), attender.getPosition(),attender.getSalary());

    }
}
