package Ali.ghanmi.com.ZooLukasSabrina.Zoo2;

import java.util.Vector;

public class Enclosure {
    private String name;
    private Vector<Animal> animals;


    public Enclosure(String name, Zoo zoo) {
        this.name = name;
        zoo.addEnclosure(this);
        this.animals = new Vector<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name);
        for (Animal animal : animals) {
            animal.printStructure(prefix + "--");
              }
    }

    public String getName() {
        return name;
    }

    public Vector<Animal> getAnimals() {
       return animals;

        }
    }

