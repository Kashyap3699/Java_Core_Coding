package Week_3;

import java.util.Scanner;

public class Program_125 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Please enter a string:");
        String str = scanner.nextLine();
        System.out.println("Number of words in the string: " + countWords(str));

        scanner.close();
    }

    public static int countWords(String str) {

        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split(" ");

        return words.length;
    }
}
