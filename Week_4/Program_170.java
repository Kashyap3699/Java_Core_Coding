package Week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_170 {
    public static <T> List<T> mergeList(List<T> list1, List<T> list2) {

        List<T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);


        return mergedList;
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("Kashyap", "Karan", "Dhaval");
        List<String> list2 = List.of("Kirtan", "Shubham");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        System.out.println("After merging : " + mergeList(list1, list2));

    }
}
