package CodingAssignments.Java8;

public class MyException3 extends Exception{
    int exceptionValue;

    public MyException3(){}
    public MyException3(String message){
        super(message);
    }

    public MyException3(int exceptionValue){
        this.exceptionValue = exceptionValue;
    }
    public String toString(){
        return "Exception3 thrown with value: "+ exceptionValue;
    }


}