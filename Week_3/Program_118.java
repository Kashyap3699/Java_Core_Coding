package Week_3;

import java.util.Scanner;

public class Program_118 {
    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scanner.nextLine();

        String lowerCase = convertToLowerCase(str);

        System.out.println("Lowercase String: " + lowerCase);
        scanner.close();
    }
}
