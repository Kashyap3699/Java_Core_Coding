package week_2;

class User {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class P_51_Encapsulation{
    public static void main(String[] args) {
        User user = new User();
        user.setName("Kashyap");
        user.setAge(23);
        System.out.println("User Name is " + user.getName() +" & Age is "+ user.getAge());
    }
}

