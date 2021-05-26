package CodingAssignments.Java8;

public class Exceptions {
    void exceptions(int exceptionValue) throws MyException1, MyException2, MyException3, NullPointerException{
        if(exceptionValue == 1)
            throw new MyException1(exceptionValue);
        if(exceptionValue == 2)
            throw new MyException2(exceptionValue);
        if(exceptionValue == 3)
            throw new MyException3(exceptionValue);
        if(exceptionValue == 4)
            throw new NullPointerException();
    }
}
