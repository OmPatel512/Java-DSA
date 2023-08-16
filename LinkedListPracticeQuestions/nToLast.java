package LinkedListPracticeQuestions;

public class nToLast {
    
    public int nthToLast(LinkedList ll, int n) {
        Node tNode = ll.head;
        for(int i=0; i<ll.size-n; i++) {
            tNode = tNode.next;
        }
        return tNode.value;
    }
}
