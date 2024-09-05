package week_2;

import MyPackage.MainClass;

class ChildClass extends MainClass {
    public void accessProtectedVariable() {
        System.out.println(protectedVariable);
    }
}

public class P_48_Protected_Variable {
    public static void main(String[] args) {
        ChildClass subClass = new ChildClass();
        subClass.accessProtectedVariable();
    }
}
