package StackByArray;

import LinkedListPracticeQuestions.removeDups;

public class Stack {
    int[] arr;
    int top;

    // Create
    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        System.out.println("The Stack is created with size of: "+size);
    }

    // isEmpty
    public boolean isEmpty() {
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (top == arr.length-1) {
            // System.out.println("THe stack is full");
            return true;
        } else {
            return false;
        }
    }

    // push
    public void push(int value) {
        if (isFull()){
            System.out.println("The Stack is full");
        } else {
            arr[top+1] = value;
            top++;
            System.out.println("The value is successfully inserted.");

        }
    }

    // pop
    public int pop() {
        if (isEmpty()){
            System.out.println("The Stack is Empty.");
            return -1;
        } else {
            int topStack = arr[top];
            top--;
            return topStack;
        }
    }
    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is empty.");
            return -1;
        } else {
            return arr[top];
        }
    }
    // delete
    public void deleteStack() {
        arr = null;
        System.out.println("The stack is deleted.");
    }
}
