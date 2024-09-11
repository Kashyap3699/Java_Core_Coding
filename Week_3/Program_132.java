
//String Starts/Ends Check: Write a program to check if a string starts with a specified substring and ends with another substring.
package Week_3;

import java.util.Scanner;

public class Program_132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter the main string:");
            String mainString = scanner.nextLine();

            System.out.println("Please enter the substring that the main string should start with:");
            String startSubstring = scanner.nextLine();

            System.out.println("Please enter the substring that the main string should end with:");
            String endSubstring = scanner.nextLine();

            boolean startsWith = mainString.startsWith(startSubstring);

            boolean endsWith = mainString.endsWith(endSubstring);

            if (startsWith && endsWith) {
                System.out.println("The main string starts with \"" + startSubstring + "\" and ends with \"" + endSubstring + "\".");
            } else if (startsWith) {
                System.out.println("The main string starts with \"" + startSubstring + "\" but does not end with \"" + endSubstring + "\".");
            } else if (endsWith) {
                System.out.println("The main string does not start with \"" + startSubstring + "\" but ends with \"" + endSubstring + "\".");
            } else {
                System.out.println("The main string neither starts with \"" + startSubstring + "\" nor ends with \"" + endSubstring + "\".");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
