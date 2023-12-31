package StackByLinkedList;

public class LinkedList {
   
    public Node head;
    public Node tail;
    public int size;

    // creating 
    public Node creatSinglyLinkedLists(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    // Insert method in Singlylinkeddlist
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            creatSinglyLinkedLists(nodeValue);
            return;
        } else if (location == 0){
            node.next = head;
            head = node;
        } else if(location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Deleting a node from SinglylinkedLists
        public void deleteNode(int location) {
            if(head == null){
                System.out.println("SLL doesn't exist.");
                return;
            } else if( location == 0){
                head = head.next;
                size--;
                if(size == 0) {
                    tail = null;
                }
                
            } else if (location >= size) {
                Node tempNode = head;
                for(int i=0; i<size-2; i++) {
                    tempNode = tempNode.next;
                }
                if (tempNode == head) {
                    this.tail = this.head = null;
                    size--;
                    return;
                }
                tempNode.next = null;
                tail = tempNode;
                size--;
            } else {
                Node tempNode = head;
                for(int i=0; i<location-1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }

        }

        // Delete Entire SinglyLinkedList
        public void deleteSLL() {
            head = null;
            tail = null;
            System.out.println("SLL deleted succesfully");
        }
}


