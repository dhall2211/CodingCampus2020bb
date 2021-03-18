package Bokhee.Daniel_Lehrer.Museum;

public class Visitor extends ExternalPerson {
    public Visitor(String firstName, String lastName) {
        super(firstName, lastName, PersonType.VISITOR);
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
