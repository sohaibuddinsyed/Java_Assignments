package SolidPrinciples.Airline_System.Employee;

public class Employee {
    private int id;
    private String name;
    private String position;
    private int salary;
    private boolean onLeave;

    public Employee(){}
    Employee(int id, String name, String position, int salary){
        this.id=id;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    // acessors for private data members
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setPosition(String position){
        this.position=position;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    void setOnLeave(boolean onLeave){
        this.onLeave=onLeave;
    }
    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    String getPosition(){
        return this.position;
    }
    int getSalary(){
        return this.salary;
    }
    boolean isOnLeave(){
        return this.onLeave;
    }

}
