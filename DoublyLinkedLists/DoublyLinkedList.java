package DoublyLinkedLists;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    // Creating DLL
    public Node createDLL(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Inserting in DLL
    public void insertDLL(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while( index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traverse DLL
    public void traverseDLL(){
        if(head == null) {
            System.out.println("DLL doesn't exist");
            return;
        } else {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if( i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // reverse traverse DLL
    public void reverseTraverseDLL() {
        if (head != null) {
            Node tempNode = tail;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL doesn't exist");
        }
        System.out.println("\n");
    }

    // Searching in DLL
    public boolean searchDLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node is found at location: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found.");
        return false;
    }

    // deleting a node in DLL
    public void deletenodeDLL(int location) {
        if (head == null) {
            System.out.println("DLL doesn't exist.");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            Node tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }    
        } else {
            Node tempNode = head;
            for (int i=0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete entire DLL
    public void deleteDLL() {
        Node tempNode = head;
        for(int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("DLL has been deleted.");
    }
}
