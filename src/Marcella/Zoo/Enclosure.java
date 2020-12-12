package Marcella.Zoo;

import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector <Animal> animals;

    public Enclosure(String name, Zoo zoo) {
        this.name = name;
        this.animals = new Vector<>();
        if (zoo != null) {
            zoo.addEnclosure(this);
        }
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printStructure(String prefix){
        System.out.println(this.name);
        System.out.print(prefix + "Tiere: ");
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).printStructure();
            if (i != animals.size() -1) {
                System.out.print(" | ");
            }
        }
    }

}
