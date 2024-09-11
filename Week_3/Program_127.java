
//Find First Non-Repeated Character: Find the first non-repeated character in a string.
package Week_3;

import java.util.Scanner;

public class Program_127 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input a String:");
        String word = s.next();
        boolean flag = true;

        for(char i :word.toCharArray())
        {
            if (word.indexOf(i) == word.lastIndexOf(i))
            {
                System.out.println("The first character which is not repeating is: "+ i);
                flag = false;
                break;
            }
        }
        if(flag== true){
            System.out.println("There is no non-repeating character in the input string");
        }
    }
}
