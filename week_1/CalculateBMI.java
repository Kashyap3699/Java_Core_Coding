import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter height in meters: ");
		double height = scanner.nextDouble();

		System.out.print("Enter weight in kilograms: ");
		double weight = scanner.nextDouble();

		if (height <= 0) {
			System.out.println("Weight must be positive number");
		} else if (weight <= 0) {
			System.out.println("Height must be positive number");
		} else {

			double bmi = weight / (height * height);

			System.out.println("Your BMI is: " + bmi);
		}

		scanner.close();
	}
}
