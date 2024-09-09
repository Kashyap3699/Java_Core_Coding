//Find the common elements in three sorted arrays.
package Week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_112 {


    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int maxCommonSize = Math.min(arr1.length, Math.min(arr2.length, arr3.length));
        int[] result = new int[maxCommonSize];
        int index = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result[index++] = arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        // Fill remaining elements with placeholder values
        while (index < result.length) {
            result[index++] = Integer.MIN_VALUE;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1, array2, array3;

        try {
            System.out.print("Enter the number of elements in the first array: ");
            int n1 = scanner.nextInt();
            array1 = new int[n1];
            System.out.println("Enter the elements of the first array (sorted):");
            for (int i = 0; i < n1; i++) {
                array1[i] = scanner.nextInt();
            }

            System.out.print("Enter the number of elements in the second array: ");
            int n2 = scanner.nextInt();
            array2 = new int[n2];
            System.out.println("Enter the elements of the second array (sorted):");
            for (int i = 0; i < n2; i++) {
                array2[i] = scanner.nextInt();
            }

            System.out.print("Enter the number of elements in the third array: ");
            int n3 = scanner.nextInt();
            array3 = new int[n3];
            System.out.println("Enter the elements of the third array (sorted):");
            for (int i = 0; i < n3; i++) {
                array3[i] = scanner.nextInt();
            }

            // Find the common elements
            int[] commonElements = findCommonElements(array1, array2, array3);
            System.out.println("Common elements in the three sorted arrays are:");
            for (int element : commonElements) {
                if (element != Integer.MIN_VALUE) { // Check to avoid printing placeholder values
                    System.out.print(element + " ");
                }
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
