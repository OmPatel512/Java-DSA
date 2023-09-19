package Trees.Binary_Heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap newBH = new BinaryHeap(5);
        newBH.insert(5, "Max");
        newBH.insert(50, "Max");
        newBH.insert(15, "Max");
        newBH.insert(1, "Max");
        newBH.levelOrder();
        newBH.deleteBH();
    }
}
