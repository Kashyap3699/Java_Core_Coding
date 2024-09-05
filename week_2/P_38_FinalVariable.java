package week_2;

public class P_38_FinalVariable {

    public static void main(String[] args) {
        try {
            final int num = 10;
            System.out.println(num);
           // num = 20;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

