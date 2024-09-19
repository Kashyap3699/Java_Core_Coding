package Week_4;

public enum Program_171 {
    ADMIN("Full access to the system"),
    USER("Limited access to user features"),
    GUEST("Read-only access to public information");

    private final String permissions;

    Program_171(String permissions) {

        this.permissions = permissions;
    }

    public String getPermissions() {
        return permissions;
    }

    public static void main(String[] args) {
        // Example usage
        for (Program_171 role : Program_171.values()) {
            System.out.println(role + ": " + role.getPermissions());
        }
    }
}
