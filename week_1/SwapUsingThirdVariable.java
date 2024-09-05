import java.util.Scanner;

public class SwapUsingThirdVariable {

	public static void main(String[] args) {
		int temp;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of variable a: ");
		int a = scanner.nextInt();

		System.out.print("Enter the value of variable b: ");
		int b = scanner.nextInt();
		
		// before swapping
		System.out.println("Before swapping:");
		System.out.println("Variable a: " + a);
		System.out.println("Variable b: " + b);

		temp = a;
		a = b;
		b = temp;

		// after swapping
		System.out.println("After swapping:");
		System.out.println("Variable a: " + a);
		System.out.println("Variable b: " + b);

		scanner.close();
	}
}
