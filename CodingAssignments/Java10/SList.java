package CodingAssignments.Java10;

public class SList <T> {
    SListNode <T> head;

    SList(){}
    public SList(T data){
        this.head = new SListNode<T>(data,null);
    }

    public SListIterator iterator(){
        return new SListIterator(this);
    }
}
