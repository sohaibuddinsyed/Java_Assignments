package CodingAssignments.Java12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Queries {

    ArrayList<Student> student;

    Queries(ArrayList<Student> student){
        this.student=student;
    }

    void query(){
        System.out.println("\n1) Names of all Departments in college:");
        student.stream().forEach(s-> System.out.println(s.getDepartment()));
        System.out.println("\n2) Names of all students who have enrolled after 2018:");
        student.stream().filter( s -> s.getYearOfEnrolled() > 2018)
                .forEach( s -> System.out.println(s.getName()));

        System.out.print("\n3) Details of all male student in the computer sci department:\n");
        detailsOfAllMaleStudentsInCS();

        System.out.print("\n4) No. of male and female students:\n");
        System.out.println("Males: " + noOfMaleAndFemaleStudents()[0] + " Females:" + noOfMaleAndFemaleStudents()[1]);

        System.out.print("\n5) Average age of male and female students:\n");
        averageAgeOfMaleAndFemaleStudents();

        System.out.print("\n6) Details of student with highest %:\n");
        System.out.println(student.stream().collect(Collectors.maxBy(Comparator.comparingDouble(s -> s.getPercentageTillDate()))));
    };
    int[] noOfMaleAndFemaleStudents(){
        int [] noOfMaleAndFemaleStudents = new int[2];
        int i=0;

        Map<Object,Long> result = student.stream().collect(Collectors.groupingBy(s -> s.getGender()
                ,Collectors.counting()));
        for(long value: result.values()){
            noOfMaleAndFemaleStudents[i] = (int)value;
            i++;
        }
        return noOfMaleAndFemaleStudents;
    }
    void averageAgeOfMaleAndFemaleStudents(){
        System.out.println("Avg Male age: " + (
                student.stream().filter(s -> s.getGender()=="Male").collect(Collectors.averagingDouble(s -> s.getAge()))
        )+
                "\nAvg Female Age:" +(
                student.stream().filter(s -> s.getGender()=="Female").collect(Collectors.averagingInt(s -> s.getAge()))
        ));
    }
    void detailsOfAllMaleStudentsInCS(){
        student.stream().filter( s -> s.getGender() == "Male")
                .filter( s -> s.getDepartment()=="Computer Science")
                .forEach( s -> s.getAllDetails());
    }
}
