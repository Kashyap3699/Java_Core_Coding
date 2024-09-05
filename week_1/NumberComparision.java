import java.util.Scanner;

public class NumberComparision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the num1 : ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the num2 : ");
		int num2 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println("The num1 " + num1 + " is greater than the num2 " + num2);
		} else if (num1 < num2) {
			System.out.println("The num1 " + num1 + " is less than the num2 " + num2);
		} else {
			System.out.println("The num1 " + num1 + " is equal to the num2 " + num2);
		}

		scanner.close();
	}
}
