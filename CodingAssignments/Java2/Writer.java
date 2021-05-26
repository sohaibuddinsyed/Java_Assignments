package CodingAssignments.Java2;

public class Writer {
    void writer(boolean []alphabets){
        for( boolean b : alphabets){
            if(b == false) {
                System.out.println("Input string does not contain entire alphabet");
                return;
            }
        }
        System.out.println("Input string contains entire alphabet");
    }
}
