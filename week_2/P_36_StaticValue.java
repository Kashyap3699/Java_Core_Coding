package week_2;

//Demonstrate the use of static blocks for initializing static variables.

public class P_36_StaticValue {

    private static int staticVariable;

    static {
        System.out.println("Static block is executed.");
        staticVariable = 7;
    }

    public static void main(String[] args) {
        System.out.println("Value of staticVariable: " + staticVariable);
    }
}

