
//Find the missing number in an array of 1 to n
package Week_3;

public class Program_93 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = 10;

        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
