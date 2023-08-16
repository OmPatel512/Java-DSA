package SinglyLinkedLists;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertInLinkedList(6,0);
        sll.insertInLinkedList(9,1);
        sll.insertInLinkedList(7,2);
        sll.insertInLinkedList(6,3);
        sll.traverseSinglyLinkedList();
        sll.deleteSLL();
        sll.traverseSinglyLinkedList();
    }
}
