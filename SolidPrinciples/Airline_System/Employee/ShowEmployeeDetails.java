package SolidPrinciples.Airline_System.Employee;

import SolidPrinciples.Airline_System.Printer;

public class ShowEmployeeDetails {

    private Employee e;

    ShowEmployeeDetails(Employee e){
        this.e = e;
    }
    void showEmployeeDetails(){
        Printer.printer("The employee details are :",
                e.getId(), e.getName(), e.getPosition(),e.getSalary());

    }
}
