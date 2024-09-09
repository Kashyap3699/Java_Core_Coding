
//Find the kth smallest element in an array.
package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_97 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            System.out.print("Enter the value of k: ");
            int k = sc.nextInt();

            if (k > 0 && k <= n) {
                int result = findKthSmallest(arr, k);
                System.out.println(k + "th smallest element is: " + result);
            } else {
                System.out.println("Invalid value of k");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findKthSmallest(int[] arr, int k) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the k-th smallest element
        return arr[k - 1];
    }
}
