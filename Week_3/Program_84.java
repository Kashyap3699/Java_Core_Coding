//Swap two elements in an array.

package Week_3;
public class Program_84 {

    public static void main(String[] args) {

        int[] arr = {10, 2, 3, -5, 99, 12, 0, -1};

        System.out.println("The array elements before swapping are :");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int firstIndex = 2, secondIndex = 4;

        int temp = arr[firstIndex];

        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;

        System.out.println("\nThe array elements after swapping are :");
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }
}
