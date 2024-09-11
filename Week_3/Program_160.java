package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_160 {
    public static boolean isValidUsername(String username) {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{5,10}$");

        Matcher matcher = pattern.matcher(username);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the username to validate: ");
        String username = scanner.nextLine();

        boolean isValid = isValidUsername(username);

        if (isValid) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is invalid.");
        }
        scanner.close();
    }

}

