//Find the maximum difference between any two elements in an array.
package Week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_106 {


    public static int findMaxDifference(int[] nums) {
        if (nums.length == 0) return 0;

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return max - min;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            int[] array = new int[n];

            // Input array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            // Find the maximum difference
            int maxDifference = findMaxDifference(array);
            System.out.println("The maximum difference between any two elements in the array is: " + maxDifference);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }


    }
}
