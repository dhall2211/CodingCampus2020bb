package Marcella.Zoo;

import java.util.Vector;

public class Zoo {

    private String name;
    private Vector <Enclosure> enclosures;
    private Vector <Animal> animals;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new Vector<>();
        this.animals = new Vector<>();
    }

    @Override
    public String toString() {
        return "Zoo: " + name + "\n" + enclosures  + "\n" + animals;
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

}
