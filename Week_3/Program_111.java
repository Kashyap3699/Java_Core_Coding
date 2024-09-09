//Find the median of an unsorted array.
package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_111 {

    public static double findMedian(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0) {
            return arr[n / 2];
        }
        return (arr[(n - 1) / 2] + arr[(n / 2)]) / 2.0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input array size
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

            System.out.println("Array is : " + Arrays.toString(arr));

            double median = findMedian(arr);

            System.out.println("Median is : " + median);

        } catch (Exception e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
}
