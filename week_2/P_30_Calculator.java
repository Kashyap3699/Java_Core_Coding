package week_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P_30_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Result: " + Math.addExact(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + Math.subtractExact(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + Math.multiplyExact(num1, num2));
                    break;
                case '/':
                    // Handle division by zero
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + Math.floorDiv(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
