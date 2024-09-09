package Week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_79 {

    public static void main(String[] args) {
        // Initialize the array
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Original array:");
            for (int i : my_array) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.print("Enter the index position for insert the new value (0 to " + (my_array.length - 1) + "): ");
            int index_position = scanner.nextInt();

            if (index_position < 0 || index_position >= my_array.length) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds. Please enter a valid index.");
            }

            System.out.print("Enter the new value to insert: ");
            int newValue = scanner.nextInt();

            for (int i = my_array.length - 1; i > index_position; i--) {
                my_array[i] = my_array[i - 1];
            }

            my_array[index_position] = newValue;

            System.out.println("New array:");
            for (int j : my_array) {
                System.out.print(j + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
