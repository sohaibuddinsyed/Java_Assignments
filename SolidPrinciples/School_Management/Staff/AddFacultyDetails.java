package SolidPrinciples.School_Management.Staff;

import java.util.Scanner;

public class AddFacultyDetails {
    private Employee e;

    public AddFacultyDetails(Employee e){
        this.e=e;
    }

    static Scanner sc = new Scanner(System.in);
    public static void addFaculty(Faculty e){

        System.out.print("\nEnter Faculty id:");
        e.setId(sc.nextInt());
        System.out.print("\nEnter Faculty name:");
        e.setName(sc.next());
        System.out.print("\nEnter Faculty position (role):");
        e.setPosition(sc.next());
        System.out.print("\nEnter Faculty Salary");
        e.setSalary(sc.nextInt());

    }
}
