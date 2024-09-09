//Find the smallest element in a rotated sorted array.
package Week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_108 {


    public static int findSmallestInRotatedArray(int[] nums) {
        if (nums.length == 0) {
            return Integer.MAX_VALUE;
        }

        int smallest = nums[0];
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;

        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Array must have at least 1 element.");
                return;
            }

            array = new int[n];

            // Input array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int smallest = findSmallestInRotatedArray(array);
            System.out.println("The smallest element in sorted array is: " + smallest);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }

}
