package CodingAssignments.Java7.CycleFactory;

public class MainCycle {
    public static void main(String []args){
        CycleFactory cycleFactory = new CycleFactory();
        Cycle cycle = cycleFactory.cycleFactory("UniCycle");
        cycle.balance();
    }
}
