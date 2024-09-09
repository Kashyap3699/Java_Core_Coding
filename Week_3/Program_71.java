//Sort an array in ascending order (using any sorting algorithm).

package Week_3;
import java.util.Arrays;

public class Program_71 {
    public static void bubbleSort(int[] array) {
        int n = array.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (array[j] > array[j + 1]) {
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

//        System.out.println("Sorted array:");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }

        System.out.println("Sorted Array:\n" + Arrays.toString(array));
    }
}
