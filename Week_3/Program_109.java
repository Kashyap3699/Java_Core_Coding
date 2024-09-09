//Find the minimum number of jumps needed to reach the end of an array.
package Week_3;

import java.util.Scanner;

public class Program_109 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Array cannot be empty.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int minJumps = minJumpsToEnd(arr);

            if (minJumps == Integer.MAX_VALUE) {
                System.out.println("End of array is not reachable.");
            } else {
                System.out.println("Minimum number of jumps to reach the end: " + minJumps);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int minJumpsToEnd(int[] arr) {
        if (arr.length == 1) return 0; // Already at the end

        int maxReach = arr[0];
        int steps = arr[0];    // Steps we can still take
        int jumps = 1;         // We need at least one jump initially

        for (int i = 1; i < arr.length; i++) {
            // Check if we've reached the end of the array
            if (i == arr.length - 1) {
                return jumps;
            }

            // Update the maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            steps--;

            // If no steps are left
            if (steps == 0) {
                // We need to jump
                jumps++;

                if (i >= maxReach) {
                    return Integer.MAX_VALUE; // Not reachable
                }

                steps = maxReach - i;
            }
        }

        return Integer.MAX_VALUE;
    }
}
