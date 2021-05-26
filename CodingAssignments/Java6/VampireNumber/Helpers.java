package CodingAssignments.Java6.VampireNumber;

public class Helpers {
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
    static long getNoOfDigits(long number){
        long digitCount = 0;
        while(number!=0){
            number/=10;
            digitCount++;
        }

        return digitCount;
    }

    static private String sort(String s) {

        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    static public Boolean getIsPermutations(String perm1, String perm2) {
        if(perm1.length() != perm2.length()) return false;
        return sort(perm1).equals(sort(perm2));
    }
}
