package week_2;

import MyPackage.Class1;
class Class2 extends Class1{
    public void accessVariables() {
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
    }
}

public class P_49_Public_Protected {

    public static void main(String[] args) {

        Class2 class2 = new Class2();
        class2.accessVariables();
    }

}
