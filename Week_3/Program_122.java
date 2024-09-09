
//String Comparison: Compare two strings lexicographically (using compareTo() method).
package Week_3;

import java.util.Scanner;

public class Program_122 {

    public static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Please enter the second string:");
        String str2 = scanner.nextLine();

        int result = compareStrings(str1, str2);
        if (result < 0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }
        scanner.close();
    }
}
