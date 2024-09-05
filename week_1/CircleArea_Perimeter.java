import java.util.Scanner;

public class CircleArea_Perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		double radius = sc.nextDouble();

		final double PI = 3.14159;

		double area = PI * radius * radius;

		double perimeter = 2 * PI * radius;

		System.out.println("Area of the circle " + area);
		System.out.println("Perimeter of the circle " + perimeter);

		sc.close();
	}
}
