package week_2;

public class P_57_Copy_Constructor {

    private String name;
    private int age;

    // Parameterized constructor
    public P_57_Copy_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public P_57_Copy_Constructor(P_57_Copy_Constructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        P_57_Copy_Constructor original = new P_57_Copy_Constructor("Kishan", 23);
        System.out.println("Original :");
        original.displayInfo();

        P_57_Copy_Constructor copied = new P_57_Copy_Constructor(original);
        System.out.println("\nCopied :");
        copied.displayInfo();
    }
}

