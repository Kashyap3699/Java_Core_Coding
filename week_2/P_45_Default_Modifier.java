package week_2;

public class P_45_Default_Modifier {
    public static void main(String[] args) {
        Person person = new Person("Kashyap", 23);
        Person person1 = new Person();
        person.displayInfo();
        person.setName("Karan");
        person.setAge(28);
        person.displayInfo();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
