package CodingAssignments.Java10;

public class SListIterator<T> {
    public SList<T> sList;
    public SListNode<T> lastSListNode;

    public SListIterator(SList slist){
        this.sList=slist;
        this.sList.head = slist.head;
        this.lastSListNode = slist.head;
    }
    public String toString(){
        return "";
    }

    public void addNode(T data){
        if(sList.head == null){
           sList.head = new SListNode<T>(data,null);
           lastSListNode = sList.head;
        }else{
            lastSListNode.next = new SListNode(data,null);
            lastSListNode = lastSListNode.next;
        }
        System.out.println("Added:" + data);
    }
    public void removeNode(T delete){
        if( sList.head == null)
            System.out.println("Cannot remove. Underflow.");
        else if(sList.head.next == null){
            System.out.println("Head "+sList.head.data+" removed.");
            sList.head=null;
        }
        else{
            SListNode iterator = sList.head;
            while(delete != iterator.next.data){
                iterator = iterator.next;
            }
            System.out.println("Deleted " + iterator.next.data);
            iterator.next = iterator.next.next;
        }

    }
}
