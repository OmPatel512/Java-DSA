import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        // Declare
        int[][] int2DArray;
        // Instantiate
        int2DArray = new int[2][2];
        // Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        // All together

        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2DArray));
    }
}
