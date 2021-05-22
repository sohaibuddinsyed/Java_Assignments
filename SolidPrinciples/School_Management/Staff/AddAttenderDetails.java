package SolidPrinciples.School_Management.Staff;


import java.util.Scanner;

public class AddAttenderDetails {
    private Attender e;

    public AddAttenderDetails(Attender e){
        this.e=e;
    }

    static Scanner sc = new Scanner(System.in);
    public static void addAttender(Attender e){

        System.out.print("\nEnter Attender id:");
        e.setId(sc.nextInt());
        System.out.print("\nEnter Attender name:");
        e.setName(sc.next());
        System.out.print("\nEnter Attender position (role):");
        e.setPosition(sc.next());
        System.out.print("\nEnter Attender Salary");
        e.setSalary(sc.nextInt());


    }
}