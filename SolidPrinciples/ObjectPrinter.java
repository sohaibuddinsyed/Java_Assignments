package SolidPrinciples;

public class ObjectPrinter {
    public static <T> void printer(String message, T ... args){
        System.out.println(message);
        for(T arg : args){
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
