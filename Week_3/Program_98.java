package Week_3;

import java.util.Scanner;

public class Program_98 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int maxSum = findMaxSubarraySum(arr);
            System.out.println("Maximum contiguous subarray sum is: " + maxSum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxSubarraySum(int[] arr) {
        int max_far = arr[0];
        int max_ending = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max_ending
            max_ending = Math.max(arr[i], max_ending + arr[i]);

            // Update max_far
            max_far = Math.max(max_far, max_ending);
        }

        return max_far;
    }
}
