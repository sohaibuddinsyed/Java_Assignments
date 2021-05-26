package CodingAssignments.Java6.VampireNumber;

public class FactorsVerification {

    public static boolean factorsVerification(long number) {
        long noOfDigits = Helpers.getEvenNoOfDigits(number);
        long[] arr = new long[2];
        long y, i;
        boolean flag = false;
        String factorsCombined, givenNumber;
        Character ch1,ch2;

        for (long x = 1; x <= number / 2; x++) {
            if (number % x == 0) {
                y = (long) number / x;
                if (Helpers.getNoOfDigits(y) == noOfDigits / 2 && Helpers.getNoOfDigits(x) == noOfDigits / 2 && !((y & 10) == 0 && (x & 10) == 0)) {
                    factorsCombined = Long.toString(x) + Long.toString(y);
                    givenNumber = Long.toString(number);

                    for (i = 0; i < factorsCombined.length(); i++) {
                        ch1 = factorsCombined.charAt((int) i);
                        ch2 = givenNumber.charAt((int) i);
                        if (!givenNumber.contains(ch1.toString()) || !factorsCombined.contains(ch2.toString())) {
                            break;
                        }
                    }

                    if (i >= factorsCombined.length() && Helpers.getIsPermutations(factorsCombined, givenNumber)) {
                        return true;
                    }

                }

            }
        }

        return false;
    }
}

