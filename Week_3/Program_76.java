//Remove duplicate elements from an array.

package Week_3;
import java.util.Arrays;

public class Program_76 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 10, 5, 20};

        int[] uniqueArray = Arrays
                .stream(array)
                .distinct()
                .toArray();

        System.out.println("Array without Duplicate " + Arrays.toString(uniqueArray));
    }
}
