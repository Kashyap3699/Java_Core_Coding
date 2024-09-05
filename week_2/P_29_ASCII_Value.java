package week_2;

public class P_29_ASCII_Value {

	public static void main(String[] args) {
		Character character = 'B';

		int asciiValue = (int) character.charValue();

		System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
	}
}
