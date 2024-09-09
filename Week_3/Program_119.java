//Substring Extraction: Extract a substring from a given string using the substring() method.
package Week_3;

import java.util.Scanner;

public class Program_119 {
    public static String extractSubstring(String str, int start, int end) {
        if (start < 0 || end > str.length() || start >= end) {
            throw new IllegalArgumentException("Invalid start or end index.");
        }
        return str.substring(start, end);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scanner.nextLine();

        System.out.println("Please enter the start index:");
        int start = scanner.nextInt();

        System.out.println("Please enter the end index:");
        int end = scanner.nextInt();
        try {
            String substring = extractSubstring(str, start, end);
            System.out.println("Extracted Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

}
