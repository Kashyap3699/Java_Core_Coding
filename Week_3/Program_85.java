//Check if two arrays are equal.

package Week_3;
import java.util.Arrays;

public class Program_85 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 6};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean equals = Arrays.equals(array1, array2);

        if (equals) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
