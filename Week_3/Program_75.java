//Merge two arrays into a single array.

package Week_3;
import java.util.Arrays;

public class Program_75 {

    public static void main(String[] args)
    {
        int[] firstArray = {23,45,12,78};
        int[] secondArray = {77,11,45,88,32};
        int f = firstArray.length;
        int s = secondArray.length;
        System.out.println("First Array is :\n" + Arrays.toString(firstArray));
        System.out.println("Second Array is :\n" + Arrays.toString(secondArray));

        int[] result = new int[f + s];
        System.arraycopy(firstArray, 0, result, 0, f);
        System.arraycopy(secondArray, 0, result, f, s);
        System.out.println("New Array is :\n"+Arrays.toString(result));
}
}
