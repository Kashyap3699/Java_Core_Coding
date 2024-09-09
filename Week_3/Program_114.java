package Week_3;

public class Program_114 {

    public static boolean isPalindromeOrNot(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "level";
        boolean result = isPalindromeOrNot(test);
        System.out.println("The string \"" + test + "\" is a palindrome? " + result);
    }
}
