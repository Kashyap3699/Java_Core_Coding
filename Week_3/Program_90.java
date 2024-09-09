
//Find the difference between two arrays (elements in the first array but not in the second).
package Week_3;

import java.util.Arrays;

public class Program_90 {
    static int[] difference(int[] a, int[] b) {
        int[] diff = new int[a.length];
        int k = 0;

        // Check each element of the first array
        for (int i = 0; i < a.length; i++) {
            if (!isPresent(b, a[i])) {
                diff[k++] = a[i];
            }
        }

        return Arrays.copyOf(diff, k);
    }

    static boolean isPresent(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr1 = {12, 1, 11, 56, 78, 90};
        int[] arr2 = {12, 65, 920, 93, 89};

        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        int[] diff = difference(arr1, arr2);
        System.out.println("Difference : " + Arrays.toString(diff));
    }
}
