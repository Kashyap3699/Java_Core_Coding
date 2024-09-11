package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_161 {
    public static boolean isValidDate(String date) {

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");

        Matcher matcher = pattern.matcher(date);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date to validate (dd/mm/yyyy): ");
        String date = scanner.nextLine();

        boolean isValid = isValidDate(date);

        if (isValid) {
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is invalid.");
        }

        scanner.close();
    }
}
