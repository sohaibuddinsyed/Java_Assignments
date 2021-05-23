package SolidPrinciples.Airline_Management.Employs;
import java.util.Scanner;

public class AddModifiedEmployee extends AddEmployee{
    static Scanner sc = new Scanner(System.in);

    public AddModifiedEmployee(Employee e) {
        super(e);
    }

    public static void addModifiedEmployee(ModifiedEmployee e){
        addEmployee(e);
        System.out.println("Enter Employee gender:");
        e.setGender(sc.next());
    }
}
