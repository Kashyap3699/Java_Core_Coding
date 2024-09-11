
// Method to replace all occurrences of a character with another character
package Week_3;

import java.util.Scanner;

public class Program_123 {

    public static String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String str = scanner.nextLine();

        System.out.println("Please enter the character to be replaced:");
        char oldChar = scanner.next().charAt(0);

        System.out.println("Please enter the replacement character:");
        char newChar = scanner.next().charAt(0);

        String result = replaceCharacter(str, oldChar, newChar);

        System.out.println("Resulting String: " + result);
        scanner.close();
    }
}



