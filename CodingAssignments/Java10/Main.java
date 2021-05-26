package CodingAssignments.Java10;

public class Main {
    public static void main(String[]args){
        SList<Integer> sList = new SList<>();
        SListIterator sListIterator = sList.iterator();
        int array[] = {1,2,3,4,5};

        for(int i=0;i<array.length;i++){
            sListIterator.addNode(array[i]);
        }
        sListIterator.removeNode(array[1]);

        SListPrinter.sListPrinter(sListIterator.sList);
    }
}
