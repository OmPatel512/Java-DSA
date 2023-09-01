package Trees.BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(20);
        bst.levelOrder();
        bst.deleteNode(bst.root, 70);
        System.out.println();
        bst.levelOrder();
    }
}
