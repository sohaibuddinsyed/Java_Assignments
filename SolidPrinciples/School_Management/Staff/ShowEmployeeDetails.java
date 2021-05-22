package SolidPrinciples.School_Management.Staff;

import SolidPrinciples.ObjectPrinter;

public class ShowEmployeeDetails {

    private Employee e;

    ShowEmployeeDetails(Employee e){
        this.e = e;
    }
    void showEmployeeDetails(Employee e){
        ObjectPrinter.printer("The employee details are :",
                e.getId(), e.getName(), e.getPosition(),e.getSalary());

    }
}
