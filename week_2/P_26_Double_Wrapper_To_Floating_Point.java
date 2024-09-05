package week_2;

import java.util.Scanner;

public class P_26_Double_Wrapper_To_Floating_Point {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			double num = scanner.nextDouble();

			double rounded = Math.round(num * 100.0) / 100.0;

			System.out.println("Double Number: " + num);

			System.out.println("Rounded Number: " + rounded);

		} catch (Exception e) {
			System.out.println("An error occurred. Please make sure to enter a valid number.");
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
