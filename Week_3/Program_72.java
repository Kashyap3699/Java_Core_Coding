//Sort an array in descending order.

package Week_3;

import java.util.Arrays;
import java.util.Collections;

public class Program_72 {

    public static void bubbleSort(int[] array) {
        int n = array.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(array);

        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
