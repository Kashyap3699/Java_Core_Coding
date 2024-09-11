
//String Contains Check: Write a method to check if one string contains another string as a substring.
package Week_3;

import java.util.Scanner;

public class Program_133 {
    public static boolean containsSubstring(String str1, String str2) {
        return str1.contains(str2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter the main string:");
            String mainString = scanner.nextLine();

            System.out.println("Please enter the substring to check:");
            String substring = scanner.nextLine();

            boolean contains = containsSubstring(mainString, substring);

            if (contains) {
                System.out.println("The main string contains the substring.");
            } else {
                System.out.println("The main string does not contain the substring.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
