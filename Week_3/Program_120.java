//Remove Whitespace: Remove all leading and trailing whitespaces from a string.
package Week_3;

import java.util.Scanner;

public class Program_120 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scanner.nextLine();
        System.out.println("Trimmed string: \"" + str.trim() + "\"");
        scanner.close();
    }
}
