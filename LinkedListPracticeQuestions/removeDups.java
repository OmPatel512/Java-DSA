package LinkedListPracticeQuestions;

import java.util.*;

public class removeDups {

    public void removeDupps(LinkedList linkedlist) {
        HashSet<Integer> hashset = new HashSet<>();
        Node cNode = linkedlist.head;
        Node prev = null;
        while (cNode.next != null) {
            if (hashset.contains(cNode.value)) {
                prev.next = cNode.next;
                linkedlist.size--;
            } else {
                hashset.add(cNode.value);
                prev = cNode;
            }
            cNode = cNode.next;
        }
    }
    // if duplicate present at lastnode this method
        // won't work.

}
