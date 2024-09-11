
//Character Removal: Remove a specific character from a string.
package Week_3;

import java.util.Scanner;

public class Program_130 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter a string:");
            String str = scanner.nextLine();

            System.out.println("Please enter the character to remove:");
            String charInput = scanner.nextLine();

            char charToRemove = charInput.charAt(0);

            String newStr = str.replace(String.valueOf(charToRemove), "");

            System.out.println("Original String: " + str);
            System.out.println("Modified String: " + newStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
