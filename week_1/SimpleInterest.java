
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount: ");
		double principal = scanner.nextDouble();

		System.out.print("Enter the annual interest rate (in %): ");
		double rate = scanner.nextDouble();

		System.out.print("Enter the time period (in years): ");
		double time = scanner.nextDouble();

		double interest = (principal * rate * time) / 100;

		System.out.println("The simple interest is: " + interest);

		scanner.close();
	}
}
