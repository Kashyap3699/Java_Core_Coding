package week_2;

public class P_44_Getter_Setter {

    private String name;
    private int age;

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
        if (age >= 0) {  // Example validation: age should not be negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }


    public static void main(String[] args) {
        P_44_Getter_Setter person = new P_44_Getter_Setter();

        person.setName("Kashyap");
        person.setAge(23);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.setAge(-5);
    }
}



