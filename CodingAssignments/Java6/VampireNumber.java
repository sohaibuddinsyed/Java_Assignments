package CodingAssignments.Java6;
/*
A vampire number v is a number with an even number of digits n,
that can be factored into two numbers x and y
each with n/2 digits and not both with trailing zeroes,
where v contains precisely all the digits from x and from y, in any order. W

Write a java program to print first 100 vampire numbers.

 */
public class VampireNumber {
    static int noOfDigits;
    public static void main(String []args){

        int countVampireNumbers =100;
        int startNumber =10;

        while(Boolean.getBoolean(Integer.toString(countVampireNumbers))){
            noOfDigits = getEvenNoOfDigits(startNumber);
            if(noOfDigits==-1){

                startNumber++;
            }else{

            }
            countVampireNumbers--;
        }
    }
    static int getEvenNoOfDigits(int number){
        int digitCount = 0;
        while(number!=0){
            number/=number;
            digitCount++;
        }
        if((digitCount % 2) == 0)
            return digitCount;
        else
            return -1;
    }

}
