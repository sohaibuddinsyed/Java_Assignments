package CodingAssignments.Java7.CycleFactory;

public class CycleFactory {
    public Cycle cycleFactory(String string){
        if(string.equals("UniCycle"))
            return new UniCycle();
        if(string.equals("BiCycle"))
            return new BiCycle();
        if(string.equals("TriCycle"))
            return new TriCycle();
        return null;
    }
}
