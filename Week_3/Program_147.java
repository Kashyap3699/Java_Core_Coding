package Week_3;

import java.util.Scanner;

public class Program_147 {
    public static String removeSubstring(String original, String toRemove) {
        if (original == null || toRemove == null) {
        }

        return original.replace(toRemove, "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the original string:");
            String original = scanner.nextLine();

            System.out.println("Enter the substring to remove:");
            String toRemove = scanner.nextLine();

            String result = removeSubstring(original, toRemove);

            System.out.println("String after removing substring: " + result);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
