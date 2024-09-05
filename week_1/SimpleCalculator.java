import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter the operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		double result;
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Result: " + Math.addExact(num1,num2));
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		default:
			System.out.println("Error: Invalid operator. Please use +, -, *, or /.");

		}
		scanner.close();
	}
}
