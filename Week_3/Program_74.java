//Find the second smallest element in an array.

package Week_3;
import java.util.Arrays;

public class Program_74 {
    public static void main(String args[]) {
        int[] array = {10, 30, 15, 12, 60};
//        int size = array.length;
        Arrays.sort(array);
        System.out.println("Sorted Array : " + Arrays.toString(array));
        int secondSmallest = array[1];
        System.out.println("2nd smallest element is : " + secondSmallest);
    }
}
