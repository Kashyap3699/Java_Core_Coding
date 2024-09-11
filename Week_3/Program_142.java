package Week_3;

import java.util.Scanner;

public class Program_142 {
    public static String insertCharAt(String str, char ch, int position) {
        if (position < 0 || position > str.length()) {
            throw new IllegalArgumentException("Position out of bounds.");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a character to insert:");
            char ch = scanner.next().charAt(0);

            System.out.println("Enter a string:");
            String str = scanner.next();

            System.out.println("Enter the position to insert the character (0-based index):");
            int position = scanner.nextInt();

            String result = insertCharAt(str, ch, position);

            System.out.println("Resulting string: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
