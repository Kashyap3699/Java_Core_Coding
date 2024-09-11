
//Reverse Each Word: Reverse each word in a sentence while keeping the word order intact.
package Week_3;

import java.util.Scanner;

public class Program_126 {
    // Method to reverse each word in a sentence
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseEachWord(sentence);

        System.out.println("Sentence with each word reversed: " + reversedSentence);

        scanner.close();
    }

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        return String.valueOf(result);
    }
}
