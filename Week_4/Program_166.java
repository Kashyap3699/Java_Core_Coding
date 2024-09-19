package Week_4;

import java.util.ArrayList;
import java.util.List;

public class Program_166 {
    public static List<Integer> reverseListLoop(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> reversedNumbers = reverseListLoop(numbers);
        System.out.println("Reversed List (Loop): " + reversedNumbers);
    }
}
