package Marcella.Zoo2;

import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector <Animal> animals;

    public Enclosure(Zoo zoo, String name) {
        this.name = name;
        this.animals = new Vector<>();
        zoo.addNewEnclosure(this);
    }

    public String getName() {
        return name;
    }

    public void addNewAnimal(Animal newAnimal) {
        if (!animals.contains(newAnimal)) {
            animals.add(newAnimal);
        }
    }

    public void printStructure() {
        System.out.println("Gehege: " + name);
        for (Animal eachAnimal : animals) {
            eachAnimal.printStructure();
        }
    }

}
