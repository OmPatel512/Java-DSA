package QueueLinkedList;

import SinglyLinkedLists.SinglyLinkedList;

public class Queue {
    SinglyLinkedList list;

    public Queue() {
        list = new SinglyLinkedList();
        System.out.println("The Queue is created.");
    }

    // isEmpty
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted "+ value+" in the queue");

    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            value = list.head.value;
            list.deleteNode(0);
            return value;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("Queue is deleted");
    }
}
