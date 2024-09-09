
//Find the longest consecutive subsequence in an array.
package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_103 {


    public static int findLongestConsecutiveSubsequence(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == arr[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements for the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int longestStreak = findLongestConsecutiveSubsequence(arr);
            System.out.println("The length of the longest consecutive subsequence is: " + longestStreak);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
