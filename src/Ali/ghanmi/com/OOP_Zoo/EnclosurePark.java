package Ali.ghanmi.com.OOP_Zoo;

import java.util.Vector;

public class EnclosurePark {
    private String name;
    private int creation;
    private int size;
    private int maxCapacity;
    private Zoo zoo;
    private Vector<Animal> animals;

    public EnclosurePark(String name, int creation, int size, int maxCapacity, Zoo zoo) {
        this.name = name;
        this.creation = creation;
        this.size = size;
        this.maxCapacity = maxCapacity;
        this.zoo = zoo;
        this.animals =new Vector<>();
        zoo.addEnclosure(this);

    }
    public void add(Animal animal) {
        animals.add(animal);
    }


    public EnclosurePark(String name, int creation, int size, int maxCapacity) {
        this(name, creation, size, maxCapacity, null);
    }


    public void printStructure(String prefix) {
        System.out.println("* " + name + " BauJahr: " + creation);
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).printStructure(prefix + "    ");
        }

    }
    
}