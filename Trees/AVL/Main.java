package Trees.AVL;

public class Main {
    public static void main(String[] args) {
        AVL avl = new AVL();
        avl.insert(5);
        avl.insert(10);
        avl.insert(15);
        avl.insert(20);
        avl.insert(60);
        avl.insert(40);
        avl.insert(80);
        avl.levelOrder();
        System.out.println();
        avl.delete(60);
        avl.levelOrder();
    }
}
