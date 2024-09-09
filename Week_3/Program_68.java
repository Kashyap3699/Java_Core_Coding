//Count the occurrences of a specific element in an array.

package Week_3;

public class Program_68 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5, 2, 7};

        int target = 2;

        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("The element " + target + " occurs " + count + " times.");
    }
}
