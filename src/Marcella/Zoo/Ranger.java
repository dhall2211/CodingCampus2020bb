package Marcella.Zoo;

import java.util.Vector;

public class Ranger {
    private String name;
    private Vector <Enclosure> rangersEnclosures;
    private Animal lovedAnimal;

    public Ranger(String name, Animal lovedAnimal, Vector rangersEnclosures) {
        this.name = name;
        this.rangersEnclosures = rangersEnclosures;
        this.lovedAnimal = lovedAnimal;
    }

    public String getName() {
        return name;
    }

    public void feedAnimal(Enclosure enclosure) {
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name);
        System.out.println(prefix + "Lieblingstier" + lovedAnimal.getName());
        System.out.println(prefix + "  zuständig für folgende Gehege:");
        for (var enclosure : rangersEnclosures) {
            System.out.println(prefix + "    " + enclosure.getName());
        }}

}
