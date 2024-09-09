//Find the second largest element in an array.

package Week_3;
import java.util.Arrays;

public class Program_73 {

    public static void main(String args[]) {
        int array[] = {10, 20, 25, 96, 65, 80};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("Sorted Array :\n" + Arrays.toString(array));
        int secondLargest = array[size-2];
        System.out.println("2nd largest element is : " + secondLargest);
    }
}
