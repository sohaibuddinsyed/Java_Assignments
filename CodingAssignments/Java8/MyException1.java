package CodingAssignments.Java8;

public class MyException1 extends Exception{
    int exceptionValue;
    public MyException1(){}
    public MyException1(String message){
        super(message);
    }
    public MyException1(int exceptionValue){
        this.exceptionValue = exceptionValue;
    }
    public String toString(){
        return "Exception1 thrown with value: "+ exceptionValue;
    }


}
