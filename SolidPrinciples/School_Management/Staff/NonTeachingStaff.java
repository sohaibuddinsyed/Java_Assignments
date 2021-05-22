package SolidPrinciples.School_Management.Staff;

public abstract class NonTeachingStaff extends Employee{
    private String department;

    protected void setDepartment( String department){ this.department=department;}

    protected String getDepartment(){ return this.department;}
}
