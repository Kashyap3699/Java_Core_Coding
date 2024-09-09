
////Rotate an array by a given number of positions to the left.
package Week_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_86 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 54, 2, 78, 90, 5, 9, 45, 22};
        int n;
        System.out.println("Array is " + Arrays.toString(arr));

        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Enter number of rotations to the left : ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int j, first;

                first = arr[0];
                for (j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[j] = first;
            }
            System.out.println("After rotating to the left : " + Arrays.toString(arr));
        }catch (InputMismatchException e){
            System.out.println("Enter valid number");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
