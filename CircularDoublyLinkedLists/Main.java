package CircularDoublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(3);
        cdll.insertNodeinCDLL(5, 0);
        cdll.insertNodeinCDLL(7, 1);
        cdll.insertNodeinCDLL(1, 5);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
    }
}
