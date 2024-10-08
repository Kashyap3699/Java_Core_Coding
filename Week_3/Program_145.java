package Week_3;

import java.util.Arrays;

public class Program_145 {
    public static boolean arePermutations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Example usage
        String str1 = "Kashyap";
        String str2 = "ashyapK";

        boolean result = arePermutations(str1, str2);
        System.out.println("Are the strings permutations? " + result);
    }
}
