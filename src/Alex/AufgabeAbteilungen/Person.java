package Alex.AufgabeAbteilungen;

public class Person {

    //Attribute
    private String name;
    private String position;

    //Constructor
    public Person(String name, String position) {
        this.name = name;
        this.position = position;
    }

    //Funktion(toString)
    @Override
    public String toString() {
        return name +
                " hat die Position: " + position;
    }
}
