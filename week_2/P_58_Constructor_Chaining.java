package week_2;

class People {

    public People() {
        System.out.println("People constructor called");
    }

}

class Employee extends People {

    public Employee() {
        super();
        System.out.println("Employee constructor called");
    }
}

public class P_58_Constructor_Chaining {
    public static void main(String[] args) {
        Employee child = new Employee();
    }
}
