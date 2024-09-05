package week_2;

public class P_54_Default_Constructor {
    private String name;
    private Integer age;

    //default constructor
    P_54_Default_Constructor() {

    }

    //constructor with all parameters
    P_54_Default_Constructor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "P_54_Default_Constructor{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {

        P_54_Default_Constructor p1 = new P_54_Default_Constructor();
        P_54_Default_Constructor p3 = new P_54_Default_Constructor("Karan", 28);

        System.out.println(p1);
        System.out.println(p3);
    }
}
