package CodingAssignments.Java10;


public class SListNode<T> {
    T data;
    SListNode next;

    public SListNode(T data, SListNode next){
        this.data = data;
        this.next = next;
    }
}
