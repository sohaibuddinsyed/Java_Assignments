package CodingAssignments.Java12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Queries {

    ArrayList<Student> student;
    Queries(ArrayList<Student> student){
        this.student=student;
    }

    void query(){
        Helpers helpers = new Helpers(this.student);
        System.out.println("\n1) Names of all Departments in college:");
        student.stream().forEach(s-> System.out.println(s.getDepartment()));

        System.out.println("\n2) Names of all students who have enrolled after 2018:");
        student.stream().filter( s -> s.getYearOfEnrolled() > 2018)
                .forEach( s -> System.out.println(s.getName()));

        System.out.print("\n3) Details of all male student in the computer sci department:\n");
        helpers.detailsOfAllMaleStudentsInCS();

        System.out.print("\n4) No. of male and female students:\n");
        System.out.println("Males: " + helpers.noOfMaleAndFemaleStudents()[0] + " Females:" + helpers.noOfMaleAndFemaleStudents()[1]);

        System.out.print("\n5) Average age of male and female students:\n");
        helpers.averageAgeOfMaleAndFemaleStudents();

        System.out.print("\n6) Details of student with highest %:\n");
        System.out.println(student.stream().collect(Collectors.maxBy(Comparator.comparing(s -> s.getPercentageTillDate()))).get().getName());

        System.out.print("\n7) Number of students in each department :\n");
        helpers.noOfStudentsInEachDept().forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.print("\n8) Average percentage achieved in each department :\n");
        System.out.println(student.stream().collect(Collectors.groupingBy( s -> s.getDepartment(), Collectors.averagingDouble( s->  s.getPercentageTillDate()))));

        System.out.print("\n9) Details of youngest male student in the Electronic department :\n");
        System.out.println(student.stream().filter(s -> s.getDepartment().equals("Electronic") && s.getGender().equals("Male")).min(Comparator.comparing(s -> s.getAge())).get().getName());

        System.out.print("\n10) Male and female students in the computer science department :\n");
        System.out.println("Males in CS: " + helpers.noOfMaleAndFemaleStudentsCS()[0] + " Females in CS:" + helpers.noOfMaleAndFemaleStudentsCS()[1]);

    };

}
