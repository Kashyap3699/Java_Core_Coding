
//Find the minimum number of swaps needed to sort an array.
package Week_3;

import java.util.Scanner;

public class Program_105 {
    public static void main(String[] args) {

        int temp;
        int swapCount = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.print("Elements are : ");
            for (int a : arr) {
                System.out.print(a + " ");
            }

            // Using bubble sort algorithm
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        // Swap elements
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        swapCount++;
                    }
                }
            }

            System.out.println();
            System.out.print("Sorted elements are : ");
            for (int a : arr) {
                System.out.print(a + " ");
            }

            System.out.println();
            System.out.println("Number of swaps: " + swapCount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
