package CodingAssignments.Java6;

import java.util.logging.LogManager;

/*
A vampire number v is a number with an even number of digits n,
that can be factored into two numbers x and y
each with n/2 digits and not both with trailing zeroes,
where v contains precisely all the digits from x and from y, in any order. W

Write a java program to print first 100 vampire numbers.

 */
public class VampireNumber {
    public static long x,y;
    static long noOfDigits;
    public static void main(String []args){
        long countVampireNumbers =100;
        long startNumber =1200;
        long []arr;

        while(countVampireNumbers!=0){
//            System.out.prlongln(startNumber);
            noOfDigits = getEvenNoOfDigits(startNumber);
            if (noOfDigits != -1) {
                if(factors(startNumber)){
                    System.out.println(startNumber);
                    countVampireNumbers--;
                }
            }
            startNumber++;
        }
    }
    static long getEvenNoOfDigits(long number){
        long digitCount = 0;
        while(number!=0){
            number/=10;
            digitCount++;
        }
        if((digitCount % 2) == 0)
            return digitCount;
        else
            return -1;
    }
    static boolean factors(long startNumber){

        long []arr = new long[2];
        long y,i;
        String strxy;
        for(long x=1;x<=startNumber/2;x++){
            if(startNumber % x == 0){
                y = (long)startNumber/x;
                if(getEvenNoOfDigits(y) == noOfDigits/2 && y%10 !=0 && getEvenNoOfDigits(x) == noOfDigits/2 && x%10 !=0)
                {
                    strxy = Long.toString(x) +Long.toString(y);
                    String strStartNumber = Long.toString(startNumber);
                    boolean flag=false;
                    for(i=0;i<strxy.length();i++){
                        Character ch1 = strxy.charAt((int)i);
                        Character ch2 = strStartNumber.charAt((int)i);
                        if(!strStartNumber.contains(ch1.toString()) || !strxy.contains(ch2.toString())){
                            return false;
                        }
                    }

                    if(i >= strxy.length()){
                        System.out.println(x + " " + y);
                        return true;
                    }

                }

            }
        }
       return false;
    }

}
