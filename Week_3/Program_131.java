//Count Vowels and Consonants: Count the number of vowels and consonants in a given string.
package Week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter a string:");
            String str = scanner.nextLine();

            if (str == null || str.trim().isEmpty()) {
                throw new IllegalArgumentException("Input string cannot be null or empty.");
            }

            int vowelCount = 0;
            int consonantCount = 0;


            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid string.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
