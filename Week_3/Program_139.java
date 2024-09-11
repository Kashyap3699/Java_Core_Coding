package Week_3;

import java.util.Scanner;

public class Program_139 {
    public static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; // Initialize the count of the current character

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)); // Append the previous character
                compressed.append(count); // Append its count
                count = 1; // Reset the count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);

        // Return the compressed string if it's shorter than the original
        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a string to compress:");
            String input = scanner.nextLine();
            String result = compressString(input);
            System.out.println("Compressed string: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
