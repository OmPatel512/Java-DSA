package LinkedListPracticeQuestions;

public class partition {
    public LinkedList partition(LinkedList ll, int x) {
        int k = 0;
        Node cNode = ll.head;
        Node tNode = ll.head;
        for(int i=0; i<ll.size; i++) {
            if(tNode.value < x){
                int a = tNode.value;
                tNode.value = cNode.value;
                cNode.value = a;
                cNode = cNode.next;
                k++;
            }
            tNode = tNode.next;
        }
        return ll;
    }
}
