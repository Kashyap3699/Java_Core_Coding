
//Find the sum of all elements in an array.

package Week_3;

public class Program_64 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The sum of the array elements is: " + sum);

    }
}



