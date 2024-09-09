//Split an array into two halves.

package Week_3;

import java.util.Arrays;

public class Program_92 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[][] result = splitArray(array);

        System.out.println("First half: " + Arrays.toString(result[0]));
        System.out.println("Second half: " + Arrays.toString(result[1]));
    }

    public static int[][] splitArray(int[] array) {
        int mid = (array.length + 1) / 2;
        return new int[][]{
                Arrays.copyOfRange(array, 0, mid), // First
                Arrays.copyOfRange(array, mid, array.length) // Second
        };
    }
}
