package Marcella.Zoo;

import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector <Animal> animals;

    public Enclosure(String name) {
        this.name = name;
        this.animals = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    public void printStructure(String prefix){
        System.out.println(this.name);
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(prefix);
            animals.get(i).printStructure();
        }
    }

}
