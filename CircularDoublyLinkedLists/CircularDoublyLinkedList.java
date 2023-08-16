package CircularDoublyLinkedLists;

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create CDLL
    public Node createCDLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return newNode;
    }

    // Insertion in CDLL
    public void insertNodeinCDLL(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        } else if( location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    // Traversal in CDLL
    public void traverseCDLL() {
        if(head == null) {
            System.out.println("CDLL doesn't exist");
            return;
        } else{
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                tempNode = tempNode.next;
                if(i != size-1){
                    System.out.print("->");
                }
            }  
        }
        System.out.print("\n");
    }

    // Reverse traverse CDLL
    public void reverseTraverseCDLL(){
        if(head == null) {
            System.out.println("CDLL doesn't exist");
            return;
        } else{
            Node tempNode = tail;
            for (int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }  
        }
        System.out.print("\n");
    }

    // Searching in CDLL
    public boolean searchCDLL(int nodeValue) {
        if(head == null){
            System.out.println("CDLL doesn't exist.");
            return false;
        } else {
            Node cNode = head;
            for(int i=0; i<size; i++){
                if(cNode.value == nodeValue){
                    System.out.println("Node found at location: "+i);
                }
                cNode = cNode.next;
            }
            return true;
        }
    }

    // Deleting a node in CDLL
    public void deleteNodeCDLL(int location){
        if(head == null){
            System.out.println("CDLL doesn't exist");
            return;
        } else if (location == 0) {
            if (size == 1){
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1){
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            } 
        } else {
            Node tempNode = head;
            for(int i=0; i< location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete entire CDLL
    public void deleteCDLL() {
        Node tempNode = head;
        for(int i=0; i<size;i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head =  null;
        tail = null;
        System.out.println("The CDLL has been deleted.");
    }
}
