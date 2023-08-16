package DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(4);
        dll.insertDLL(3, 0);
        dll.insertDLL(2, 1);
        dll.insertDLL(7, 2);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
