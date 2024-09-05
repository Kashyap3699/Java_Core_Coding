
import java.util.Scanner;

public class SimpleArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		int num2 = scanner.nextInt();

		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;

		System.out.println("The difference between " + num1 + " and " + num2 + " is " + difference);
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
		System.out.println("The quotient of " + num1 + " divided by " + num2 + " is " + quotient);

		scanner.close();
	}
}
