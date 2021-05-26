package CodingAssignments.Java10;

public class SListPrinter {
    public static void sListPrinter(SList sList){
        SListNode sListNode = sList.head;
        if(sListNode == null){
            System.out.println("Empty list.");
            return;
        }
        System.out.print("Head " );
        while(sListNode!=null){
            System.out.print(" -> " + sListNode.data );
            sListNode = sListNode.next;
        }
    }
}
