package CircularQueueArray;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.enQueue(6);
        cq.deleteQueue();
    }
}
