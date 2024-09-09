
//Move all zeroes to the end of the array without changing the order of non-zero elements.
package Week_3;

public class Program_95 {


    public static void moveZeroes(int[] nums) {
        int notZeroIndex = 0; //  non-zero element

        // Traverse the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[notZeroIndex];
                nums[notZeroIndex] = nums[current];
                nums[current] = temp;

                notZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12,8,55};

        moveZeroes(array);

        System.out.println("Array after moving zeroes to the end: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
