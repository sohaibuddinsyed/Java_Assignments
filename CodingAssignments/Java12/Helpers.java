package CodingAssignments.Java12;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Helpers {
    ArrayList<Student> student;
    Helpers(  ArrayList<Student> student){ this.student=student;}
    Map noOfStudentsInEachDept(){
        int [] noOfMaleAndFemaleStudentsCS = new int[7];
        int i=0;

        Map<Object,Long> result = student.stream()
                .collect(Collectors.groupingBy(s -> s.getDepartment()
                        ,Collectors.counting()));
        return result;
    }
    int[] noOfMaleAndFemaleStudentsCS(){
        int [] noOfMaleAndFemaleStudentsCS = new int[2];
        int i=0;

        Map<Object,Long> result = student.stream().filter(s -> s.getDepartment() == "Computer Science")
                .collect(Collectors.groupingBy(s -> s.getGender()
                        ,Collectors.counting()));
        for(long value: result.values()){
            noOfMaleAndFemaleStudentsCS[i] = (int)value;
            i++;
        }
        return noOfMaleAndFemaleStudentsCS;
    }
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
    void averagePercentageInEachDept() {
        student.stream().collect(Collectors.groupingBy( s -> s.getDepartment(), Collectors.averagingInt( s-> (int) s.getPercentageTillDate())));
    }

    void detailsOfAllMaleStudentsInCS(){
        student.stream().filter( s -> s.getGender() == "Male")
                .filter( s -> s.getDepartment()=="Computer Science")
                .forEach( s -> s.getAllDetails());
    }
}
