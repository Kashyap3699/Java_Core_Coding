
////Find the intersection of two arrays.

package Week_3;

import java.util.Arrays;

public class Program_88 {
    static int[] intersection(int[] a, int[] a2) {

        int size = Math.min(a.length, a2.length);
        int[] intersection = new int[size];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a[i] == a2[j]) {
                    intersection[k] = a[i];
                    k++;
                    break;

                }
            }
        }

        // Trim the array to the actual size of the intersection
        return Arrays.copyOf(intersection, k);
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 9, 23, 2};
        int[] arr2 = {1, 56, 2, 9, 3, 6, 10, 23};

        System.out.println("Arr1 : " + Arrays.toString(arr1));
        System.out.println("Arr2 : " + Arrays.toString(arr2));
        int[] intersection = intersection(arr1, arr2);
        System.out.println("Intersection is : " + Arrays.toString(intersection));

    }
}
