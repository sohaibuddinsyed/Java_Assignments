package SolidPrinciples.Airline_Management.Employes;

import SolidPrinciples.Airline_Management.Printer;

public class ShowEmployeeDetails {

    private Employee e;

    ShowEmployeeDetails(Employee e){
        this.e = e;
    }
    void showEmployeeDetails(Employee e){
        Printer.printer("The employee details are :",
                e.getId(), e.getName(), e.getPosition(),e.getSalary());

    }
}
