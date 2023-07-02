import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList{
    private final LinkedList<Integer> linkedList;

    public MyLinkedList() {
        this.linkedList = new LinkedList<>();
    }

    public void Enqueue(Integer data){
        linkedList.addLast(data);
    }

    public Integer First(){
        return linkedList.peekFirst();
    }

    public Integer Dequeue(){
        return linkedList.pollLast();
    }

    public LinkedList<Integer> ReversList(){
        LinkedList<Integer> out = new LinkedList<>();

        for (Integer integer : linkedList) {
            out.addFirst(integer);
        }

        return out;
    }
    public LinkedList<Integer> DirectList(){
        return linkedList;
    }
}
