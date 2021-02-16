package Ali.ghanmi.com.MuseumMitVererbumg.Museum;

public class Guard extends Person {
    private Room room;

    public Guard(String firstName, String lastName) {
        super(firstName, lastName, PersonType.GUARD);
    }

    @Override
    public String toString() {
        return "Guard{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
