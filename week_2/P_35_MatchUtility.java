package week_2;

public class P_35_MatchUtility {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 0;

        try {
            System.out.println("Addition: " + P_35_MatchUtility.add(num1, num2));
            System.out.println("Subtraction: " + P_35_MatchUtility.subtract(num1, num2));
            System.out.println("Multiplication: " + P_35_MatchUtility.multiply(num1, num2));
            System.out.println("Division: " + P_35_MatchUtility.divide(num1, num2));
            System.out.println("Division by zero: " + P_35_MatchUtility.divide(num1, num3));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


