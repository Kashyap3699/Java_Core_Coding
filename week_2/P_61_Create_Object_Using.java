package week_2;

public class P_61_Create_Object_Using {

    private String name;
    private int age;

    // Constructor with no arguments
    public P_61_Create_Object_Using() {
        this("Karan", 28);
    }

    // Constructor with name and age arguments
    public P_61_Create_Object_Using(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        P_61_Create_Object_Using con = new P_61_Create_Object_Using();
        con.display();

        P_61_Create_Object_Using con2 = new P_61_Create_Object_Using("Kashyap", 23);
        con2.display();
    }
}
