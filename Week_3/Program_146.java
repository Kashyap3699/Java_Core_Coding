package Week_3;

import java.util.Scanner;

public class Program_146 {
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");

        String longestWord = "";

        // Iterate through the words to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            String longestWord = findLongestWord(sentence);

            System.out.println("The longest word in the sentence is: " + longestWord);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
