
//Find the majority element in an array (element that appears more than n/2 times).
package Week_3;

import java.util.Scanner;

public class Program_110 {


    public static int findMajorityElement(int[] arr) {
        int candidate = findCandidate(arr);

        // Verify if the candidate is the majority element
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    private static int findCandidate(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        return candidate;
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

            int majorityElement = findMajorityElement(arr);
            if (majorityElement != -1) {
                System.out.println("The majority element is: " + majorityElement);
            } else {
                System.out.println("No majority element found.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
