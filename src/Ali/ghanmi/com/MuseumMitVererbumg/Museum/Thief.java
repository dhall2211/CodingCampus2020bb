package Ali.ghanmi.com.MuseumMitVererbumg.Museum;

public class Thief extends ExternalPerson {
    public Thief(String firstName, String lastName) {
        super(firstName, lastName, PersonType.THIEF);
    }

    @Override
    public String toString() {
        return "Thief{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
