package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_162 {

    public static String removeHtmlTags(String input) {

        Pattern pattern = Pattern.compile("<[^>]+>");

        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string with HTML tags: ");
        String input = scanner.nextLine();

        String result = removeHtmlTags(input);

        System.out.println("String without HTML tags: " + result);

        scanner.close();
    }
}
