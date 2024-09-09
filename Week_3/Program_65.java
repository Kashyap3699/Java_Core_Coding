//Find the largest element in an array.

package Week_3;

public class Program_65 {
    public static void main(String[] args) {

        int[] numbers = {5,10,28,59,63};

        int largest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }

}
