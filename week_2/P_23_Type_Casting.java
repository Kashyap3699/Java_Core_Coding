package week_2;

// Program to demonstrate type casting between primitive data types.

public class P_23_Type_Casting {

	public static void main(String[] args) {

        try {
            int intValue = 700;
            double doubleValue = intValue;

            System.out.println("Int To Double");
            System.out.println("intValue (int): " + intValue);
            System.out.println("doubleValue (double): " + doubleValue);

            double doubleValue2 = 70.70;
            int intValue2 = (int) doubleValue2;

            System.out.println("\nDouble To Int:");
            System.out.println("doubleValue2 (double): " + doubleValue2);
            System.out.println("intValue2 (int) after casting: " + intValue2);

            float floatValue = 10.10f;
            long longValue = (long) floatValue;

            System.out.println("\nFloat To Long");
            System.out.println("floatValue (float): " + floatValue);
            System.out.println("longValue (long) after casting: " + longValue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
