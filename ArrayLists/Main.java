package ArrayLists;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating Array List
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // // Inserting in ArrayList
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);
        // numbers.add(5);
        // numbers.add(6);

        // numbers.add(2,4);
        // System.out.println(numbers);
        

        // ArrayList<String> stringList = new ArrayList<String>();
        // stringList.add("A");
        // stringList.add("B");
        // stringList.add(3,"C");// Raise Error
        // System.out.println(stringList);

        // Traversing in an Array
        
        // // Approach-1 --> for loop 
        // for(int i=0; i<numbers.size(); i++) {
        //     int num = numbers.get(i);
        //     System.out.println(num);
        // }

        // // Approach-2 --> for each loop
        // for(int num: numbers) {
        //     System.out.println(num);
        // }

        // // Approach-3 --> Iterator
        // Iterator<Integer> iterator = numbers.iterator();
        // while(iterator.hasNext()) {
        //     int num = iterator.next();
        //     System.out.println(num);
        // }

        // Search for a element in ArrayList

        // // Approach-1
        // for(int num: numbers) {
        //     if(num == 3){
        //         System.out.println("The elemnt is found");
        //         break;
        //     }
        // }

        // // Approach-2
        // int index = numbers.indexOf(3);
        // System.out.println("The elemnt is found at: "+ index);

        // Deleting an element in ArrayList

        // // Approach-1 --> Index
        // numbers.remove(2);
        // System.out.println(numbers);

        //  Approach-2 --> Element
        
    }
}
