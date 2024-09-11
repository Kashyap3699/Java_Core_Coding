
// Method to check if two character arrays are anagrams
package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_129 {


    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string:");
        String input1 = scanner.nextLine();

        System.out.println("Please enter the second string:");
        String input2 = scanner.nextLine();

        char[] str1 = input1.toCharArray();
        char[] str2 = input2.toCharArray();

        if (areAnagram(str1, str2))
            System.out.println("The two strings are anagrams of each other");
        else
            System.out.println("The two strings are not anagrams of each other");

        scanner.close();
    }
}


