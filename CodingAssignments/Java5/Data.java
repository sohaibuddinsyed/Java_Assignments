package CodingAssignments.Java5;

public class Data {
    int intData;
    char charData;

    void printFields(){
        System.out.println(intData);
        System.out.println(charData);
    }

    void printLocal(){
        int local1;
        int local2;

        // Uninitialized variables cannot be printed
//        System.out.println(local1);
//        System.out.println(local2)
    }
}
