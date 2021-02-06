package Marcella.Kindergarden;

import java.util.Random;
import java.util.Vector;

public class Kindergarden {

    private String name;
    private Vector<Ped> peds;
    private Vector<Child> children;
    private Vector<Animal> animals;
    private static Random random = new Random(System.nanoTime());

    public Kindergarden(String name) {
        this.name = name;
        this.peds = new Vector<>();
        this.children = new Vector<>();
        this.animals = new Vector<>();
    }

    public Vector<Child> getChildren() {
        return children;
    }

    public void generatePeds(int numberOfPeds) {
        for (int i = 0; i < numberOfPeds; i++) {
            String[] name = {"Hans", "Gerlinde", "Tom"};
            Ped newPed = new Ped(this, name[random.nextInt(name.length)], "Pädagog*in");
            this.peds.add(newPed);
        }
    }

    public void generateChildren(int numberOfChildren) {
        for (int i = 0; i < numberOfChildren; i++) {
            String[] firstName = {"Peter", "Paul", "Lisa", "Anna", "Victor", "Tatjana", "Zoe"};
            String[] lastName = {"M", "O", "F", "L", "P", "A", "H", "T", "C", "I", "V"};
            String name = (firstName[random.nextInt(firstName.length)] + " " + lastName[random.nextInt(lastName.length)]);
            int[] happyIndex = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Child newChild = new Child(this, name, "Kind", happyIndex[random.nextInt(happyIndex.length)]);
            this.children.add(newChild);
        }
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void runSimultation() {
        for (Animal oneAnimal : animals) {
            oneAnimal.doSomething();
        }
        for (Child oneChild : children) {
            oneChild.doSomething();
        }
        for (Ped onePed : peds) {
            onePed.doSomething();
        }
    }

}
