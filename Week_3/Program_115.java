//String Concatenation: Concatenate two strings without using the + operator.
package Week_3;

public class Program_115 {

    public static String concatenate(String str1, String str2) {
        return str1.concat(str2);
    }

    public static void main(String[] args) {
        String str1 = "Kashyap ";
        String str2 = "Hainiya";
        String result = concatenate(str1, str2);
        System.out.println("Concatenated String: " + result);
    }
}
