public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray)  {
        arr = new int[sizeOfArray];
        for (int i=1; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index to acces array.");
        }
    }

    // Array traversal

    public void traverseArray() {
        try{
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i]+ " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist.");
        }
    }

    // Search for given element in java

    public void searchArray(int valueToSearch) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at index " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // delete value from array
    public void deleteValue (int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Index provided is not in the range of arr.");
        }
    }
}
