package week_2;

public class P_28_Compare_Primitive_To_Wrapper_Class {
	public static void main(String[] args) {
		int int1 = 10;
		int int2 = 10;
		double double1 = 15.4;
		double double2 = 15.5;

		Integer intWrapper1 = Integer.valueOf(int1);
		Integer intWrapper2 = Integer.valueOf(int2);
		Double doubleWrapper1 = Double.valueOf(double1);
		Double doubleWrapper2 = Double.valueOf(double2);

		boolean intequal = intWrapper1.equals(intWrapper2);
		boolean doubleequal = doubleWrapper1.equals(doubleWrapper2);

		System.out.println("Are the two integers equal? : " + intequal);
		System.out.println("Are the two doubles equal? : " + doubleequal);
	}
}
