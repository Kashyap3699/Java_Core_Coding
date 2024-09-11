//Remove Duplicates: Write a program that removes duplicate characters from a string.
package Week_3;

import java.util.Scanner;

public class Program_124 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = scanner.nextLine();

        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                s2 = s2.concat(String.valueOf(s.charAt(i)));
            }
        }

        System.out.println("String after removing duplicates: " + s2);

        scanner.close();
    }
}


