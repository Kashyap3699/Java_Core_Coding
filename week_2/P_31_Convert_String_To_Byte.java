package week_2;

import java.util.Arrays;

public class P_31_Convert_String_To_Byte {

    public static void main(String[] args) {
        String str = "Kashyap";

        byte[] byteArr = str.getBytes();

        System.out.println("String to byte array: " + Arrays.toString(byteArr));

        String convertedStr = new String(byteArr);

        System.out.println("Byte array to String: " + convertedStr);
    }
}


