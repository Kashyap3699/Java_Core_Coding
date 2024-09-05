package week_2;

import java.util.Scanner;

public class P_25_Odd_Even {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			String input = scanner.nextLine();

			Integer numberObject = Integer.valueOf(input);

			int number = numberObject.intValue();

			if (number % 2 == 0) {
				System.out.println("The number " + number + " is even.");
			} else {
				System.out.println("The number " + number + " is odd.");
			}

		} catch (NumberFormatException e) {
			System.out.println(" The input is not a valid integer.");
		}
	}
}
