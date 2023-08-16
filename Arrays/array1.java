// Initialization of Array

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        // Declare
        int[] intArray;
        // Instantiate
        intArray = new int[4];
        // Initialize
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;

        System.out.println(Arrays.toString(intArray));

        String sArray[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(sArray));

    }
}