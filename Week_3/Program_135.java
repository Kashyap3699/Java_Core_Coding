
//Character Occurrence Check: Write a program to count the number of times a specific character appears in a string.
package Week_3;

import java.util.Scanner;

public class Program_135 {
    public static int countCharacterOccurrences(String str, char targetChar) {
        if (str == null) {
            return 0;
        }
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = scanner.nextLine().charAt(0); // Read the first character of the input

        if (Character.isWhitespace(targetChar)) {
            System.out.println("The character must be a non-whitespace character.");
        } else {
            int count = countCharacterOccurrences(str, targetChar);
            System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
        }
        scanner.close();
    }
}
