package Trees.Binary_Tree.Binary_tree_linkedlist;
import java.util.*;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    // preOrder Traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inOrder Traversal
    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }

    // postOrder Traversal
    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+ " ");
    }

    // levelOrder Traveral
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode pnode = queue.remove();
            System.out.print(pnode.value+" ");
            if(pnode.left != null) {
                queue.add(pnode.left);
            }
            if(pnode.right != null) {
                queue.add(pnode.right);
            }
        }
        System.out.println("");
    }

    // search Method
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode pnode = queue.remove();
            if(pnode.value == value) {
                System.out.println("Value "+value+" is found in Tree.");
                return;
            } else {
                if(pnode.left != null) {
                queue.add(pnode.left);
                }
                if(pnode.right != null) {
                    queue.add(pnode.right);
                }
            }
        }
        System.out.println("Value "+value+" is not found in Tree");
    }

    // Insert method
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("New node is inserted at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode pNode = queue.remove();
            if (pNode.left == null) {
                pNode.left = newNode;
                System.out.println("Successfully inserted.");
                break;
            } else if (pNode.right == null) {
                pNode.right = newNode;
                System.out.println("Successfully inserted.");
                break;
            } else {
                queue.add(pNode.left);
                queue.add(pNode.right);
            }
        }
    }

    // Get Deepest node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode pNode = null;
        while(!queue.isEmpty()) {
            pNode = queue.remove();
            if(pNode.left != null) {
                queue.add(pNode.left);    
            }
            if(pNode.right != null) {
                queue.add(pNode.right);    
            }
        }
        return pNode;
    }

    // delete deepest node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete given node
    void deleteNode (String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode pNode = queue.remove();
            if (pNode.value == value) {
                pNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node is deleted.");
                return;
            } else {
                if (pNode.left != null) {
                    queue.add(pNode.left);
                }
                if (pNode.right != null) {
                    queue.add(pNode.right);
                }
            }
        }
        System.out.println("Node doesn't exist in binary tree.");
    }

    // Delete Binary Tree
    void deleteBT() {
        root= null;
        System.out.println("BT deleted succesfully");
    }
}
