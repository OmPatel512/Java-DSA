package CircularSinglyLinkedLists;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csLL = new CircularSinglyLinkedList();
        csLL.createCSLL(30);
        csLL.insertCSLL(4, 0);
        csLL.insertCSLL(5, 1);
        csLL.insertCSLL(7, 2);
        csLL.traverseCSLL();
        csLL.deleteNodeCSLL(0);
        csLL.traverseCSLL();
    }
}
