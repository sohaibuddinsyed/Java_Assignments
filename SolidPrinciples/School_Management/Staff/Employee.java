package SolidPrinciples.School_Management.Staff;

public abstract class Employee {
    private int id;
    private String name;
    private String position;
    private int salary;

    public Employee(){}
    Employee(int id, String name, String position, int salary){
        this.id=id;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }


    protected void setId(int id){
        this.id=id;
    }
    protected void setName(String name){
        this.name=name;
    }
    protected void setPosition(String position){
        this.position=position;
    }
    protected void setSalary(int salary){
        this.salary=salary;
    }

    protected int getId(){
        return this.id;
    }
    protected String getName(){
        return this.name;
    }
    protected String getPosition(){
        return this.position;
    }
    protected int getSalary(){
        return this.salary;
    }

}
