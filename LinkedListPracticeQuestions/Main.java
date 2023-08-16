package LinkedListPracticeQuestions;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        removeDups rd = new removeDups();
        ll.createLL(3);
        ll.insertNode(5);
        ll.insertNode(8);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(2);
        ll.insertNode(1);
        partition p = new partition();
        ll = p.partition(ll,5);
        ll.traversalLL();
    }
}
