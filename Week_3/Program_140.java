package Week_3;

public class Program_140 {

    public static String expandString(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                int count = ch - '0'; // Convert char digit to int
                i++;

                // Check for multi-digit count
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    count = count * 10 + (str.charAt(i) - '0');
                    i++;
                }

                // Ensure that we do not go out of bounds
                if (i < str.length()) {
                    // Repeat the following character 'count' times
                    for (int j = 0; j < count; j++) {
                        result.append(str.charAt(i));
                    }
                }
            } else {
                result.append(ch);
            }

            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "a3b2c1d1";
        String str2 = "2ab3cd";
        String str3 = "a10bc";

        System.out.println(expandString(str1)); // Output: aaabbcdd
        System.out.println(expandString(str2)); // Output: aabbcccdd
        System.out.println(expandString(str3)); // Output: aaaaaaaaaabc
    }
}
