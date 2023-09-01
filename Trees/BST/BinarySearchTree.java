package Trees.BST;
import java.util.*;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    // insert
    private BinaryNode insertNode(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newnode = new BinaryNode();
            newnode.value = value;
            if (this.root == null) {
                this.root = newnode;
            }
            System.out.println("The value successfully inserted.");
            return newnode;
        } else if( value <= currentNode.value) {
            currentNode.left = insertNode(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insertNode(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        insertNode(root, value);
    }

    // preOrder
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inOrder
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }

    // postOrder
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+ " ");
    }

    //levelOrder
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+ " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // Search
    BinaryNode search(BinaryNode node, int value ) {
        if(node == null) {
            System.out.println("value not found");
            return null;
        } else if(node.value == value) {
            System.out.println("value is found");
            return node;
        } else if(value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    // Minimum Node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return null;
        } else {
            return minimumNode(root.left);
        }
    }

    // Delete node
    // it does'nt delete root node.
    // it has some errors.
    public BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    // delete BST
    public void deleteBST() {
        root = null;
        System.out.println("BST deleted successfully.");
    }
}
