import java.util.Scanner;

public class TempratureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Select the conversion type 1 or 2: ");
        int select = sc.nextInt();

        if (select == 1) {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            float celsius = sc.nextFloat();
            float fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        } else if (select == 2) {
            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            float fahrenheit = sc.nextFloat();
            float celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");

        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }
}
