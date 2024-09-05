package week_2;

public class P_62_Exception {
    public static class InvalidPersonDataException extends Exception {
        public InvalidPersonDataException(String message) {
            super(message);
        }
    }

    private String name;
    private int age;

    public P_62_Exception(String name, int age) throws InvalidPersonDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPersonDataException("Name cannot be null or empty");
        }
        if (age < 0 || age > 100) {
            throw new InvalidPersonDataException("Age must be between 0 and 100");
        }

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        try {
            P_62_Exception ex = new P_62_Exception("Kishan", 30);
            System.out.println(ex);

            P_62_Exception ex1 = new P_62_Exception("", 30);
        } catch (InvalidPersonDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            P_62_Exception ex2 = new P_62_Exception("Kashyap", 120);
        } catch (InvalidPersonDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
