package Week_3;

import java.util.Scanner;

public class Program_121{

    public static String[] splitString(String str) {
        return str.split(" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scanner.nextLine();

        String[] words = splitString(str);
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
