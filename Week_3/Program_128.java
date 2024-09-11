//String Rotation: Write a program to check if one string is a rotation of another string.
package Week_3;

import java.util.Scanner;

public class Program_128 {

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Please enter the second string:");
        String str2 = scanner.nextLine();

        boolean isRotation = isRotation(str1, str2);

        if (isRotation) {
            System.out.println("The second string is a rotation of the first string.");
        } else {
            System.out.println("The second string is not a rotation of the first string.");
        }

        scanner.close();
    }
}
