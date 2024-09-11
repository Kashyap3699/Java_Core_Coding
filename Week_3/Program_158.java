package Week_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_158 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        try  {
            System.out.print("Enter string  : ");
            str = sc.nextLine();

            if (str.trim().isEmpty())
                throw new RuntimeException("Cannot be empty");

            System.out.println("string is  : " + str);
            Pattern pattern = Pattern.compile("\\d");

            Matcher matcher = pattern.matcher(str);

            StringBuffer sb = new StringBuffer();
            while (matcher.find()){
                matcher.appendReplacement(sb,"#");
            }
            matcher.appendTail(sb);

            System.out.println(sb.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
