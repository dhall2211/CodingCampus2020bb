package Ali.ghanmi.com.Museum;

public class Thief {
    private String firstName;
    private String lastName;

    public Thief(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Thief{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
