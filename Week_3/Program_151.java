package Week_3;

public class Program_151 {
    public static int countOccurrences(String mainString, String substring) {
        if (mainString == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "ababcabcabc";
        String substring = "abc";

        int count = countOccurrences(mainString, substring);
        System.out.println("The substring \"" + substring + "\" appears " + count + " times in the string \"" + mainString + "\".");
    }
}
