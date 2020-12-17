package Sabrina.Zoo2;

import java.util.Vector;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species, Enclosure enclosure){
        this.name = name;
        this.species = species;
        enclosure.addAnimal(this);

    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name + " " + species);
    }
}
