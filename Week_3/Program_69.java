
//Check if an array contains a specific value.
package Week_3;

public class Program_69 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int valueToFind = 5;
        boolean found = false;

        for (int number : numbers) {
            if (number == valueToFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found in the array.");
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}
