package SolidPrinciples.School_Management.Staff;

import java.util.Scanner;

public class AddEmployeeDetails {
    private Employee e;

    public AddEmployeeDetails(Employee e){
        this.e=e;
    }

    static Scanner sc = new Scanner(System.in);
    public static void addEmployee(Employee e){

        System.out.print("\nEnter Employee id:");
        e.setId(sc.nextInt());
        System.out.print("\nEnter Employee name:");
        e.setName(sc.next());
        System.out.print("\nEnter Employee position:");
        e.setPosition(sc.next());
        System.out.print("\nEnter Employee Salary");
        e.setSalary(sc.nextInt());
        System.out.print("\nIs employee on leave:");
        e.setOnLeave(sc.nextBoolean());
    }
}
