//Find the smallest element in an array.

package Week_3;

public class Program_66 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 28, 59, 63};

        int smallest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The largest element in the array is: " + smallest);
    }

}
