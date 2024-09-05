import java.util.Scanner;

public class MinutesToHours_Minute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		int totalMinutes = scanner.nextInt();

		int hours = totalMinutes / 60;
		int minutes = totalMinutes % 60;

		System.out.println("Equivalent time: " + hours + " hours and " + minutes + " minutes");

		scanner.close();
	}
}
