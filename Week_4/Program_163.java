
//Create a program that reads a paragraph of text and uses a HashMap to count the frequency of each word.
// Display the word and its count in descending order of frequency.
package Week_4;

import java.util.*;

public class Program_163 {
    public static void main(String[] args)
    {

        String str = "One man stay in the river and One man stay in the mountain";
        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {

            Integer integer = hashMap.get(word);

            if (integer == null)
                hashMap.put(word, 1);

            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }


}
