package Week_4;

import java.util.HashMap;
import java.util.Map;

public class Program_167 {
    public static void main(String[] args) {
        String inputString = "Kashyap";
        countCharacters(inputString);
    }

    public static void countCharacters(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
