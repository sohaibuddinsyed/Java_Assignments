package CodingAssignments.Java3;

import java.util.ArrayList;
import java.util.Collections;

public class MedianCalculation {
    public void medianCalculation(ArrayList<Double> time){
        Collections.sort(time);
        if(time.size() % 2 == 0){
            System.out.println("Median is " + time.get(time.size()/2) + " ms");
        }else{
            System.out.println("Median are " + time.get((time.size()/2) - 1) + " and "+time.get((time.size()/2) + 1) + " ms");
        }

    }
}
