package SolidPrinciples.Airline_System.Employee;
import java.util.Scanner;
public class AddAnEmployee {

    private Employee e;

    public AddAnEmployee(Employee e){
        this.e=e;
    }
    Scanner sc = new Scanner(System.in);
    public void addAnEmployee(){

        System.out.println("Enter Employee id:");
        e.setId(sc.nextInt());
        System.out.println("Enter Employee name:");
        e.setName(sc.next());
        System.out.println("Enter Employee position:");
        e.setPosition(sc.next());
        System.out.println("Enter Employee Salary");
        e.setSalary(sc.nextInt());
        System.out.println("Is employee on leave:");
        e.setOnLeave(sc.nextBoolean());
    }
}