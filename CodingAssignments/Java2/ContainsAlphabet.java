package CodingAssignments.Java2;

public class ContainsAlphabet {
    public void containsAlphabet(String inputString, boolean[] alphabets){
        // Compares the ASCII values
        for(int i=0 ; i < inputString.length();i++){
            if(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z'  ){
                alphabets[inputString.charAt(i) - 97] = true;
            }
            if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z'  ){
                alphabets[inputString.charAt(i) - 65] = true;
            }
        }
    }
}
