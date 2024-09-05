package week_2;

public class P_37_StaticMathod_InstanceMethod {


    private int instanceVariable = 10;
    private static int staticVariable = 20;

    public static void staticMethod() {
        System.out.println("StaticMethod.");
        System.out.println("Static variable: " + staticVariable);
    }

    public void instanceMethod() {
        System.out.println("InstanceMethod.");
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        P_37_StaticMathod_InstanceMethod.staticMethod();

        P_37_StaticMathod_InstanceMethod obj = new P_37_StaticMathod_InstanceMethod();
        obj.instanceMethod();
    }
}


