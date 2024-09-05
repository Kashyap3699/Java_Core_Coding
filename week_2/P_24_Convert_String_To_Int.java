package week_2;

import java.util.Scanner;

public class P_24_Convert_String_To_Int {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter the first number: ");
			String str1 = scanner.nextLine();
			System.out.print("Enter the second number: ");
			String str2 = scanner.nextLine();

			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			int sum = num1 + num2;
			int difference = num1 - num2;
			int product = num1 * num2;
			int quotient = num1 / num2;

			System.out.println("Sum: " + sum);
			System.out.println("Difference: " + difference);
			System.out.println("Product: " + product);
			System.out.println("Quotient: " + quotient);

		} catch (NumberFormatException e) {
			System.out.println("One strings is not a valid integer.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not allowed.");
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}

		scanner.close();
	}
}
