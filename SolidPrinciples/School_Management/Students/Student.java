package SolidPrinciples.School_Management.Students;

public abstract class Student {
    private String name;
    private int rollNumber;
    private int _class;

    void setName(String name){ this.name=name;}
    void setClass(int _class){ this._class=_class;}
    void setRollNumber(int rollNumber){this.rollNumber=rollNumber;}

    int get_Class(){return this._class;}
    int getRollNumber(){return this.rollNumber;}
    String getName(){ return this.name;}
}
