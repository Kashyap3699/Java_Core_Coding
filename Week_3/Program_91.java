//Check if an array is a palindrome (same forwards and backwards)

package Week_3;

public class Program_91 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4, 3, 2, 1};

        System.out.println("Array1 is palindrome: " + isPalindrome(array1));
        System.out.println("Array2 is palindrome: " + isPalindrome(array2));
    }

    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
