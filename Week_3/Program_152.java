package Week_3;

import java.util.Scanner;
import java.util.Stack;

public class Program_152 {
    public static void main(String[] args) {
        String str;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter expression (e.g., {}, [], ()): ");
            str = sc.nextLine();
            if (str.trim().isEmpty())
                throw new RuntimeException("Cannot be empty");
            System.out.println("String is : " + str);
            if (areBracketsBalanced(str)) {
                System.out.println("All brackets are closed");
            } else {
                System.out.println("All brackets are not closed");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean areBracketsBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
