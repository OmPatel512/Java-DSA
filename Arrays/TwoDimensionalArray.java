public class TwoDimensionalArray {
    int[][] arr = null;

    //Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr.length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in array
    public void insertValueInTheArray(int row, int col, int value) {
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Value is succesfully Inserted.");
            }  else {
                System.out.println("This cell is already occupiied.");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array.");
        }
    }

    // Accesing cell from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing row#: "+ row +" col#: "+ col);
        try {
            System.out.println("Cell value is: "+ arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index foe 2d array.");
        }
    }

    // Travers 2D Array
    public void traverse2DArray() {
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[0].length; col++){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    // Searching for a single value in 2D array.
    public void searchingValue(int value) {
        for(int row=0; row<arr.length; row++) {
           for(int col=0; col<arr[0].length; col++){
            if (arr[row][col] == value) {
                System.out.println("Value is found at row#: "+row+" col# "+col);
                return;
            }
           } 
        }
        System.out.println("Value is not found");
    }

    // Deleting a value from 2D  Array.
    public void deleteValue(int row, int col) {
        try {
            System.out.println("Succesfull Deleted: "+ arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array.");
        }
    }
}
