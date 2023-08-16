package QueueArray;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    // create
    public Queue(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue is successsfully created with size of: "+size);
    }

    // isFull
    public boolean isFull() {
        if (topOfQueue == arr.length -1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfQueue == -1 || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full.");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+ value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+ value + " in the queue");
        }
    }

    // deQueue
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("The queue is empty.");
            return -1;
        } else {
            int res = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;
            } 
            return res;
        }
    }

    // peek
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The queue is empty!");
            return -1;
        }
    }

    // delete
    public void deleteQueue() {
        arr = null;
        System.out.println("Queue is deleted.");
    }
}
