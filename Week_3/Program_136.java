
// Method to check if the string has all unique characters
package Week_3;

import java.util.Scanner;

public class Program_136 {


    public static boolean hasUniqueCharacters(String str) {

        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false; // Found a duplicate character
                }
            }
        }
        return true; // All characters are unique
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a string
            System.out.println("Please enter a string:");
            String input = scanner.nextLine();

            // Check for unique characters
            boolean unique = hasUniqueCharacters(input);

            // Display the result
            if (unique) {
                System.out.println("The string has all unique characters.");
            } else {
                System.out.println("The string does not have all unique characters.");
            }
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
