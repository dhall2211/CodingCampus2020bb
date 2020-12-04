package Dan.pp;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String DOB;
    private String BirthPlace;
    private String gender;

    public Person(String firstName, String lastName, String DOB, String BirthPlace, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.BirthPlace = BirthPlace;
        this.gender = gender;

    }

    public String getDOB() {
        return DOB;
    }

    public String getBirthPlace() {
        return BirthPlace;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", BirthPlace='" + BirthPlace + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(DOB, person.DOB) &&
                Objects.equals(BirthPlace, person.BirthPlace) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, DOB, BirthPlace, gender);
    }
}
