package week_2;

public class P_56_Calling_Constructor {
    private String name;
    private int age;

    // Constructor with no arguments
    public P_56_Calling_Constructor() {
        this("Karan", 28);
    }

    // Constructor with name and age arguments
    public P_56_Calling_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        P_56_Calling_Constructor con = new P_56_Calling_Constructor();
        con.display();

        P_56_Calling_Constructor con2 = new P_56_Calling_Constructor("Kashyap", 23);
        con2.display();
    }
}
