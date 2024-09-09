//Reverse a String: Write a method that takes a string and returns its reverse.
package Week_3;

public class Program_113 {
    public static String reverse(String str) {
        String reversed = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String original = "Kashyap";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

