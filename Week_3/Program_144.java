package Week_3;

import java.util.Scanner;

public class Program_144 {
    public static String removeAllAdjacentDuplicates(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (result.length() > 0 && result.charAt(result.length() - 1) == currentChar) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.println("Enter a string to remove all adjacent duplicates:");
            String input = scanner.nextLine();

            String output = removeAllAdjacentDuplicates(input);

            System.out.println("Original String: " + input);
            System.out.println("String after removing all adjacent duplicates: " + output);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}

