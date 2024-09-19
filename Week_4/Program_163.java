
//Create a program that reads a paragraph of text and uses a HashMap to count the frequency of each word.
// Display the word and its count in descending order of frequency.
package Week_4;

import java.util.*;

public class Program_163 {
    public static void main(String[] args) {

        String str = "One man stay in the river and One man stay in the mountain";
        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {

            Integer count = hashMap.get(word);

            if (count == null)
                hashMap.put(word, 1);

            else {
                hashMap.put(word, count + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}
