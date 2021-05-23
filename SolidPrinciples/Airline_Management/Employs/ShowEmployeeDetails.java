package SolidPrinciples.Airline_Management.Employs;

import SolidPrinciples.ObjectPrinter;

public class ShowEmployeeDetails {

    private Employee e;

    ShowEmployeeDetails(Employee e){
        this.e = e;
    }
    void showEmployeeDetails(Employee e){
        ObjectPrinter.printer("The employee details are :",
                "\nId:"+e.getId(), "\nName:"+e.getName(), "\nPosition:"+e.getPosition(),
                "\nSalary:"+e.getSalary());

    }
}
