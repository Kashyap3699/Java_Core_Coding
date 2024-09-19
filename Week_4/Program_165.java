package Week_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program_165 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);

        List<Integer> uniqueNumbersList = uniqueNumbersSet.stream().toList();

        System.out.println("Unique numbers: " + uniqueNumbersList);
    }
}


