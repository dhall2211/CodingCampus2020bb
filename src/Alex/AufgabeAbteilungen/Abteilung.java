package Alex.AufgabeAbteilungen;

public class Abteilung {
    private String name;

    public Abteilung(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Abteilung: " + name;
    }
}
