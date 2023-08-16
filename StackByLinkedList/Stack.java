package StackByLinkedList;

public class Stack {
   LinkedList linkedList;
   
   public Stack(){
    linkedList = new LinkedList();
   }

   //push
   public void push(int value){
    linkedList.insertInLinkedList(value, 0);
    System.out.println("Inserted "+ value+ " in stack.");
   }

   //isEmpty
   public boolean isEmpty() {
      if(linkedList.head == null) {
         return true;
      } else {
         return false;
      }
   }

   //pop
   public int pop(){
      int res = -1;
      if (isEmpty()) {
         System.out.println("Stack is empty.");
      } else {
         res = linkedList.head.value;
         linkedList.deleteNode(0);
      }
      return res;
   }

   //peek
   public int peek(){
      if (isEmpty()) {
         System.out.println("Stack is empty.");
         return -1;
      } else {
         return linkedList.head.value;
      }
   }

   // delete
   public void deleteStack() {
      linkedList.head = null;
      System.out.println("Stack is deleted");
   }
}
