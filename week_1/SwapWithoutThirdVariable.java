
import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int a = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int b = scanner.nextInt();
		
		// before swapping
		System.out.println("Before swapping:");
		System.out.println("Variable a: " + a);
		System.out.println("Variable b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		// after swapping
		System.out.println("After swapping:");
		System.out.println("First number: " + a);
		System.out.println("Second number: " + b);

		scanner.close();
	}
}
