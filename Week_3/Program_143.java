package Week_3;

import java.util.Scanner;

public class Program_143 {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String joinStrings(String[] strings, String delimiter) {
        // Reverse each string in the array
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reverseString(strings[i]);
        }
        return String.join(delimiter, strings);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("How many strings would you like to join?");
            int count = scanner.nextInt();
            scanner.nextLine();

            String[] strings = new String[count];

            System.out.println("Please enter the strings:");
            for (int i = 0; i < count; i++) {
                strings[i] = scanner.nextLine();
            }

            System.out.println("Please enter the delimiter:");
            String delimiter = scanner.nextLine();

            String joinedString = joinStrings(strings, delimiter);

            System.out.println("Joined String: " + joinedString);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
