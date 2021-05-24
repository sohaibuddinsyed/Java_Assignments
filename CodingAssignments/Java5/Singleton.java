package CodingAssignments.Java5;

public class Singleton {
    String string;
    static Singleton method(String string){
        string = string;
        return new Singleton();
    }
    void print(){
        System.out.println(string);
    }
}
