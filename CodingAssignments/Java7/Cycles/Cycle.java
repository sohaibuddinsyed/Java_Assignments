package CodingAssignments.Java7.Cycles;

/*
Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
Create instances of all three types and upcast them to an array of Cycle.

Try to call balance( ) on each element of the array and observe the results.
Downcast and call balance( ) and observe what happens.

 */
public class Cycle {
    public static void main(String [] args){
        Cycle cycle [] = new Cycle[3];

        UniCycle uniCycle = new UniCycle();
        Bicycle biCycle = new Bicycle();
        TriCycle triCycle= new TriCycle();

        // UpCasting
        cycle[0] = (Cycle) uniCycle;
        cycle[1] = (Cycle) biCycle;
        cycle[2] =(Cycle) triCycle;

        cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();

        // DownCasting
        cycle[0] = (UniCycle) uniCycle;
        cycle[1] = (Bicycle) biCycle;
        cycle[2] = (TriCycle) triCycle;

        cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();


    }
    public void balance(){
        System.out.println("Balancing a cycle superclass");
    }
}

