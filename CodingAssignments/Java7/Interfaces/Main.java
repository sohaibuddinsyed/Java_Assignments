package CodingAssignments.Java7.Interfaces;

public class Main {
    public static void main(String[]args){
        Sub sub = new Sub();
        interface1(sub);
        interface2(sub);
        interface3(sub);
        interface123(sub);

    }
    static void interface1(Interface1 interface1){
        interface1.interface11();
        interface1.interface12();
    }
    static void interface2(Interface2 interface2){
        interface2.interface21();
    }
    static void interface3(Interface3 interface3){
        interface3.interface31();
    }
    static void interface123(Interface123 interface123){
        interface123.interface123();
    }
}
