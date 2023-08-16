package QueueArray;

public class Main {
    public static void main(String[] args) {
        Queue newq = new Queue(3);
        newq.enQueue(1);
        newq.enQueue(2);
        newq.enQueue(3);
        newq.deleteQueue();
    }
}
