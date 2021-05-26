package CodingAssignments.Java8;

public class MyException2 extends Exception{
    int exceptionValue;
    public MyException2(){}
    public MyException2(String message){
        super(message);
    }
    public MyException2(int exceptionValue){
        this.exceptionValue = exceptionValue;
    }
    public String toString(){
        return "Exception2 thrown with value: "+ exceptionValue;
    }

}
