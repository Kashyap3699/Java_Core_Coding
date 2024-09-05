package week_2;

class BaseClass {

    public void publicMethod() {
        System.out.println("Public method in BaseClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in BaseClass");
    }

    private void privateMethod() {
        System.out.println("Private method in BaseClass");
    }

    public void accessPrivateMethod() {
        privateMethod();
    }


}

class SubClass extends BaseClass {
    public void accessMethods() {
        publicMethod();
        protectedMethod();

    }
}


class OtherClass {
    public void testAccess() {
        BaseClass allModifiers = new BaseClass();
        allModifiers.publicMethod();
    }
}

public class P_46_All_Modifiers {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.accessMethods();

        OtherClass other = new OtherClass();
        other.testAccess();

        BaseClass base = new BaseClass();
        base.accessPrivateMethod();
    }
}










