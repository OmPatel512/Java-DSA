import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 11);
        tda.insertValueInTheArray(0, 1, 10);
        tda.insertValueInTheArray(1, 1, 50);
        tda.insertValueInTheArray(1, 0, 40);
        tda.insertValueInTheArray(2, 1, 30);
        tda.insertValueInTheArray(2, 0, 70);

        tda.deleteValue(0, 0);
    }
}
