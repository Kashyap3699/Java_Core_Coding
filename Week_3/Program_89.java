package Week_3;

import java.util.Arrays;

public class Program_89 {
    static int[] union(int[] a, int[] b) {
        int[] union = new int[a.length + b.length];
        int k = 0;

        // Add elements from the first array to the union array
        for (int i = 0; i < a.length; i++) {
            if (!isPresent(union, a[i], k)) {
                union[k++] = a[i];
            }
        }

        // Add elements from the second array to the union array
        for (int i = 0; i < b.length; i++) {
            if (!isPresent(union, b[i], k)) {
                union[k++] = b[i];
            }
        }
        return Arrays.copyOf(union, k);
    }

    static boolean isPresent(int[] array, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 2, 9, 56};
        int[] arr2 = {1, 56, 2, 9, 3, 6, 10, 23};

        System.out.println("Arr1 : " + Arrays.toString(arr1));
        System.out.println("Arr2 : " + Arrays.toString(arr2));
        int[] union = union(arr1, arr2);
        System.out.println("Union is : " + Arrays.toString(union));
    }
}
