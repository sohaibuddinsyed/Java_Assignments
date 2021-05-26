package CodingAssignments.Java6.VampireNumber;

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

        while(countVampireNumbers!=0){
            noOfDigits = Helpers.getEvenNoOfDigits(startNumber);
            if (noOfDigits != -1) {
                if(FactorsVerification.factorsVerification(startNumber)){
                    System.out.println(startNumber);
                    countVampireNumbers--;
                }
            }
            startNumber++;
        }
    }

}
