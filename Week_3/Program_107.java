
//Find the largest element in a rotated sorted array.
package Week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_107 {


    public static int findLargestInRotatedArray(int[] nums) {
        if (nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        int largest = nums[0];
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
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

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int largest = findLargestInRotatedArray(array);
            System.out.println("The largest element in sorted array is: " + largest);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}
