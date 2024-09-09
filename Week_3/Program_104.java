
//Find all pairs in an array whose sum equals a given number.
package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_104 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the target sum: ");
            int target = sc.nextInt();

            findPairsWithSum(arr, target);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findPairsWithSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        boolean foundPair = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--;
                foundPair = true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!foundPair) {
            System.out.println("No pairs found.");
        }
    }
}
