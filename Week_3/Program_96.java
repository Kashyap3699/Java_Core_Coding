
////Find the kth largest element in an array.
package Week_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_96 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int k = 0;

        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the value of k : ");
            k = scanner.nextInt();

            if (k < 1 || k > n) {
                throw new IllegalArgumentException("Value of k must be between 1 and " + n);
            }

            int kthLargest = findKthLargest(array, k);
            System.out.println("The " + k + "th largest element is: " + kthLargest);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}


