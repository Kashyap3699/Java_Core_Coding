package week_2;


class MyClass {
    public void publicMethod() {
        System.out.println("Public method in BaseClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in BaseClass");
    }

    void defaultMethod() {
        System.out.println("Default method in BaseClass");
    }

    private void privateMethod() {
        System.out.println("Private method in BaseClass");
    }

    public void accessPrivateMethod() {
        privateMethod();
    }
}


class MySubClass extends MyClass {
    @Override
    public void publicMethod() {
        System.out.println("Public method in SubClass");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Protected method in SubClass");
    }

    // Default method in BaseClass cannot be overridden
    // @Override
    // void defaultMethod() {
    //
    // }

    // Private method in BaseClass cannot be accessed or overridden

    public void demonstrateMethods() {
        publicMethod();
        protectedMethod();
        accessPrivateMethod();
    }
}


public class P_53_Class_Hierarchy {
    public static void main(String[] args) {

        MySubClass mySubClass = new MySubClass();
        mySubClass.demonstrateMethods();

        MyClass myClass = new MyClass();
        myClass.publicMethod();    // Accessible
        myClass.protectedMethod(); // Accessible within the same package or via subclass
        // myClass.defaultMethod(); // Not accessible  outside the package
        // myClass.privateMethod(); // Not accessible  outside the class
    }

}

