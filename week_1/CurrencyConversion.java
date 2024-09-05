import java.util.Scanner;

public class CurrencyConversion {

	public static void main(String[] args) {
		final double conversionRate = 83.89;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the amount in USD: ");
		double amountInUSD = scanner.nextDouble();

		double amountInINR = amountInUSD * conversionRate;

		System.out.println("Amount in INR: " + amountInINR);

		scanner.close();
	}
}
