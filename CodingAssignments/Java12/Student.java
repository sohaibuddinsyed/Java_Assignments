package CodingAssignments.Java12;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfEnrollment;
    private double percentageTillDate;

    public Student(int id, String name, int age, String gender,
                   String department, int yearOfEnrollment, double percentageTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }

    public void getAllDetails() {
        System.out.println("\nid: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("gender: " + this.gender);
        System.out.println("department:" + this.department);
        System.out.println("year of enrollment: " + this.yearOfEnrollment);
        System.out.println("percentage: " + this.percentageTillDate);
    }

    public String getName() {
        return this.name;
    }
    public int getAge(){ return this.age;}

    public String getGender() {
        return this.gender;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getYearOfEnrolled() {
        return this.yearOfEnrollment;
    }

    public double getPercentageTillDate() {
        return this.percentageTillDate;
    }

}
