public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.Enqueue(1);
        myLinkedList.Enqueue(2);
        myLinkedList.Enqueue(3);
        myLinkedList.Enqueue(4);
        myLinkedList.Enqueue(5);
        myLinkedList.Enqueue(6);
        System.out.println("List: " + myLinkedList.DirectList());

        System.out.println("Dequeue 1: " + myLinkedList.Dequeue());
        System.out.println("Dequeue 2: " + myLinkedList.Dequeue());
        System.out.println("List: " + myLinkedList.DirectList());

        System.out.println("First: " + myLinkedList.First());
        System.out.println("List: " + myLinkedList.DirectList());

        System.out.println("ReversList: " + myLinkedList.ReversList());
    }
}