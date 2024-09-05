package week_2;

public class P_43_OverRide_FinalMethod {

    static class Animal {
        public final void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        // It will give Compile Error
    /*
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    */
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

       Dog dog = new Dog();
        dog.makeSound();
    }
}
