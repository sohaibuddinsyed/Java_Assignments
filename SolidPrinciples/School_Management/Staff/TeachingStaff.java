package SolidPrinciples.School_Management.Staff;

public abstract class TeachingStaff extends Employee{
    private String department;
    private String subject;

    protected void setDepartment(String department){this.department=department;}
    protected void setSubject(String subject){this.subject=subject;}

    protected String getDepartment(){ return this.department;}
    protected String getSubject(){return this.subject;}

}
