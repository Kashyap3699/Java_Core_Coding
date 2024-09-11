package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_155 {
    public static boolean isValidPhoneNumber(String phoneNumber) {

        Pattern pattern = Pattern.compile("^(\\+\\d{1,3})?[-.\\s]?\\(?\\d{3}\\)[-.\\s]?\\d{3}?[-.\\s]?\\d{4}$");

        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the phone number to validate: ");
        String phoneNumber = scanner.nextLine();

        boolean isValid = isValidPhoneNumber(phoneNumber);

        if (isValid) {
            System.out.println("The phone number is valid.");
        } else {
            System.out.println("The phone number is invalid.");
        }

        // Close the scanner
        scanner.close();
    }
}
