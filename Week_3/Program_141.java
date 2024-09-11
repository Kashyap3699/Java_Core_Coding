package Week_3;

public class Program_141 {
    public static boolean isSubsequence(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        int m = s1.length();
        int n = s2.length();

        int i = 0; // Pointer for s1
        int j = 0; // Pointer for s2

        // Traverse s2 to find all characters of s1
        while (i < m && j < n) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++; // Move pointer in s1
            }
            j++; // Always move pointer in s2
        }

        return i == m;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.println("Enter the first string (s1):");
            String s1 = scanner.nextLine();

            System.out.println("Enter the second string (s2):");
            String s2 = scanner.nextLine();

            boolean result = isSubsequence(s1, s2);
            if (result) {
                System.out.println("'" + s1 + "' is a subsequence of '" + s2 + "'.");
            } else {
                System.out.println("'" + s1 + "' is not a subsequence of '" + s2 + "'.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
