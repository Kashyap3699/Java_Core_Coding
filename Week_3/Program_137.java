
//Longest Common Prefix: Find the longest common prefix among an array of strings.
package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_137 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "-1";
        }
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        if (i == 0) {
            return "-1";
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strs;

        try {
            System.out.println("Enter the number of strings:");
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException("Number of strings must be positive.");
            }

            strs = new String[n];

            System.out.println("Enter the strings:");
            for (int i = 0; i < n; i++) {
                strs[i] = scanner.nextLine();
            }

            System.out.println("The longest common prefix is: " + longestCommonPrefix(strs));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
