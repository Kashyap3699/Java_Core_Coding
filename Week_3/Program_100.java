package Week_3;

import java.util.Scanner;

public class Program_100 {


    public static int findMaxProductOfThree(int[] arr) {
        // Initialize the three largest and two smallest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Traverse the array to find the three largest and two smallest numbers
        for (int num : arr) {
            // Update the largest values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update the smallest values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Calculate the maximum product of three numbers
        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;

        // Return the maximum of the two possible products
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int maxProduct = findMaxProductOfThree(arr);
            System.out.println("Maximum product of three elements is: " + maxProduct);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
