package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_159 {
    public static boolean isValidIpV4(String IpV4) {

        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

        Matcher matcher = pattern.matcher(IpV4);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the IpV4 to validate: ");
        String username = scanner.nextLine();

        boolean isValid = isValidIpV4(username);

        if (isValid) {
            System.out.println("The IpV4 is valid.");
        } else {
            System.out.println("The IpV4 is invalid.");
        }
        scanner.close();
    }
}
