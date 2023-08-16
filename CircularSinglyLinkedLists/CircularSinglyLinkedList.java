package CircularSinglyLinkedLists;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create CSLL
    public Node createCSLL(int nodeValue) {
        //head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert in CSLL
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversal in CSLL
    public void traverseCSLL() {
        if (head != null)  {
            Node tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("\nCSLL doesn't exist.");
        }
    }

    //Searh in CSLL
    public boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for( int i=0; i<size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.println("Found Node at location: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found.");
        return false;
    }

    // Deleting a node
    public void deleteNodeCSLL(int location) {
        if(head == null){
            System.out.println("CSLL doesn't exist");
            return;
        } else if(location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            } 
        } else if(location >= size) {
            Node tempNode = head;
            for (int i=0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for(int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    
    // Delete Entire CSLL
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("CSLL doesn't exist");
        } else {
            head = null;
            tail.next = null;
            tail =null;
            System.out.println("CSLL has been deleted");
        }
    }
}
