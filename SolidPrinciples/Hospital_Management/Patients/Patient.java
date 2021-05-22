package SolidPrinciples.Hospital_Management.Patients;

public abstract class Patient {
    private String name;
    private int age;

    protected void setAge(int age){this.age=age;}
    protected void setName(String name){this.name=name;}

    protected String getName(){return this.name;}
    protected int getAge(){ return this.age;}

}
