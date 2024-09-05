package week_2;


class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class P_47_Singletone {

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();

        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton);
    }
}




