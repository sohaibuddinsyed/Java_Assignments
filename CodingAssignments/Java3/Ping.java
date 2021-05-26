package CodingAssignments.Java3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ping {
    static Process process;
    static String inputString;
    static String responseString;
    static ArrayList<Double> pingTime= new ArrayList<>();
    static ArrayList<Double> ping(String command){
        try{
            process = Runtime.getRuntime().exec(command);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            System.out.println("Response:");
            while((responseString=bufferedReader.readLine()) != null){

                if(responseString.contains("time<")){
                    int timeIndex = responseString.lastIndexOf("time<");
                    pingTime.add(Double.parseDouble(responseString
                            .substring(timeIndex+5,responseString.indexOf("ms"))));
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pingTime;
    }
}
