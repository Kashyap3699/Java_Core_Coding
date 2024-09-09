//Shift all elements of an array one position to the left.

package Week_3;
public class Program_77 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5};

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
