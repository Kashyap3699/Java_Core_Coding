package Week_3;

import java.util.Scanner;

public class Program_99 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int maxProduct = findMaxProduct(arr);
            System.out.println("Maximum product of two elements is: " + maxProduct);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                // Update max2 before updating max1
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        // Return the product of the two largest numbers
        return max1 * max2;
    }
}
