package Daniel.Zoo;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Animal favouriteAnimal;
    private Vector<Compound> compounds;

    public Zookeeper(String name, Animal favouriteAnimal, Vector<Compound> compounds) {
        this.name = name;
        this.favouriteAnimal = favouriteAnimal;
        this.compounds = compounds;
    }

    public String getName() {
        return name;
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + this.name);
        System.out.println(prefix + "  Lieblingstier: " + favouriteAnimal.getName());
        System.out.println(prefix + "  Gehege:");
        for (var compound : compounds) {
            System.out.println(prefix + "    " + compound.getName());
        }
    }
}
