package Week_4;

public class Program_168 {
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap (Integer): ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        swap(intArray, 1, 3);
        System.out.println("\nAfter swap (Integer): ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        // Test with String array
        String[] strArray = {"Kashyap", "Karan", "Dhaval", "Shubham"};
        System.out.println("\n\nBefore swap (String): ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        swap(strArray, 0, 2);
        System.out.println("\nAfter swap (String): ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }
}
