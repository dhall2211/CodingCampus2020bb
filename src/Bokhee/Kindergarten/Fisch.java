package Bokhee.Kindergarten;

public class Fisch extends Animal {
    public Fisch(String name, Enum farbe) {
        super(name, farbe);
    }

    @Override
    public void empower(Kind kind) {
        System.out.println(kind.getName() + "is watching at " + this.getName());
    }
}
