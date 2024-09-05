import java.util.Scanner;
public class DaysToYears_Days_Week {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of days: ");
	        int totalDays = scanner.nextInt();

	        final int daysInYear = 365;
	        final int daysInWeek = 7;

	        int years = totalDays / daysInYear;
	        int remainingDays = totalDays % daysInYear;

	        int weeks = remainingDays / daysInWeek;
	        remainingDays = remainingDays % daysInWeek;

	        System.out.println("Equivalent time: " + years + " years, " + weeks + " weeks, and " + remainingDays + " days");

	        scanner.close();
	    }
	}


