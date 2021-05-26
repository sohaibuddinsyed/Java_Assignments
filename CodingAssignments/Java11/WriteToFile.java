package CodingAssignments.Java11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteToFile {
    static void writeToFile(Map<Character,Integer> map, String outputFile) throws IOException {
        FileWriter fileWriter = new FileWriter(outputFile);
        map.forEach((key,value) -> {
            try {
                fileWriter.write(key +" : " + value + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        fileWriter.close();
    }
}
