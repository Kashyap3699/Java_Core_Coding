
//Find the duplicate number in an array of n+1 elements.
package Week_3;

import java.util.Arrays;

public class Program_94 {
    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);

            // Check if the index is within bounds
            if (index < arr.length && arr[index] < 0)
                return index;

            // Negate the value at the correct index to mark it as visited
            if (index < arr.length)
                arr[i] = -arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3}; //array of n + 1 elements
        System.out.println("Array is : " + Arrays.toString(arr));
        int duplicate = findDuplicate(arr);
        String res = (duplicate != -1) ? "Duplicate is : " + duplicate : "No duplicates ";
        System.out.println(res);

    }
}
