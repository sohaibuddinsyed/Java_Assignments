package CodingAssignments.Java5;

public class Main {

    public static void main(String[] args){
        Data data = new Data();
        data.printFields();
        // Uninitialized variables in the method cannot be printed.
        // data.printLocal();

        // The method takes String type arguments. Empty argument list would lead top an error.
        // Singleton singleton = Singleton.method();
        Singleton singleton = Singleton.method("string required as argument");
        singleton.print();

    }
}
