package CodingAssignments.Java11;

import java.util.Map;

public class CountCharsInFile {
    static void countCharsInFile(Map<Character,Integer> map, String inputString){
        for(int i=0;i<inputString.length();i++){
            int currentCount;
            if(map.containsKey(inputString.charAt(i))){
                currentCount = map.get(inputString.charAt(i));
                map.put(inputString.charAt(i),++currentCount);
            }
            if(!map.containsKey(inputString.charAt(i))){
                map.put(inputString.charAt(i),1);
            }
        }
    }
}
