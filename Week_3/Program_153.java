package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_153 {
    public static boolean onlyDigits(String str) {

        // Compile the regex
        Pattern p = Pattern.compile("^\\d+$");

        if (str == null) {
            return false;
        }
        // Create a matcher for the input string
        Matcher m = p.matcher(str);

        // Return whether the string matches the regex
        return m.matches();
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it contains only digits: ");
        String str = scanner.nextLine();

        System.out.println("The string contains only digits: " + onlyDigits(str));

        // Close the scanner
        scanner.close();
    }
}
