
//Check if an array is sorted in ascending order.
package Week_3;

import java.util.Scanner;

public class Program_101 {


    public static boolean checkIfSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            boolean isSorted = checkIfSorted(arr);
            if (isSorted) {
                System.out.println("The array is sorted in ascending order.");
            } else {
                System.out.println("The array is not sorted in ascending order.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
