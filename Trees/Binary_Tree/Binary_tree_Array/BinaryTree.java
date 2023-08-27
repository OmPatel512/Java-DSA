package Trees.Binary_Tree.Binary_tree_Array;

import LinkedListPracticeQuestions.removeDups;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Tree of "+size+" has been created.");
    }

    boolean isFull() {
        if(arr.length-1 == lastUsedIndex) {
            return true;
        }
        return false;
    }

    // Insert Method in Binary tree
    void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted");
        } else {
            System.out.println("BT is full.");
        }
    }

    // preOrder traversal
    public void preOrder(int rootIndex) {
        if(rootIndex > lastUsedIndex) {
            return;
        }
        System.out.print(arr[rootIndex]+" ");
        preOrder(rootIndex*2);
        preOrder((rootIndex*2)+1);
    }

    // inOrder traversal
    public void inOrder(int rootIndex) {
        if(rootIndex > lastUsedIndex) {
            return;
        }
        inOrder(rootIndex*2);
        System.out.print(arr[rootIndex]+" ");
        inOrder((rootIndex*2)+1);
    }

    // postOrder traversal
    public void postOrder(int rootIndex) {
        if(rootIndex > lastUsedIndex) {
            return;
        }
        postOrder(rootIndex*2);
        postOrder((rootIndex*2)+1);
        System.out.print(arr[rootIndex]+" ");
    }

    // levelOrder traversal
    public void levelOrder() {
        for (int i=1; i<= lastUsedIndex; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // search Method
    public int search(String value) {
        for (int i=1; i<= lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println(value+" exists at the location "+i);
                return i;
            }
        }
        System.out.println(value+" doesn't exist in BT.");
        return -1;
    }

    // Delete Method
    public void delete(String Value) {
        int location = search(Value);
        if (location == -1){
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node is successfully deleted.");
        }
    }

    // delete entire BT
    public void deleteBT() {
        try {
            arr = null;
            System.out.println("BT has been deleted succesfully");
        } catch (Exception e){
            System.out.println("There was an error deleing the Bt");
        }
    }
}   
