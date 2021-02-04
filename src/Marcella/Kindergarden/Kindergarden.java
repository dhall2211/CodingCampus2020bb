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

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void generatePeds(int numberOfPeds) {
        for (int i = 0; i < numberOfPeds; i++) {
            String[] name = {"Hans", "Gerlinde", "Tom", "Victor", "Tatjana"};
            Ped newPed = new Ped(this, name[random.nextInt(name.length)], "Pädagog*in");
            this.peds.add(newPed);
        }
    }

    public void generateChildren(int numberOfChildren) {
        for (int i = 0; i < numberOfChildren; i++) {
            String[] name = {"Peter", "Paul", "Lisa", "Anna", "Victor", "Tatjana", "Zoe"};
            int[] happyIndex = {1,2,3,4,5,6,7,8,9,10};
            Child newChild = new Child(this, name[random.nextInt(name.length)], "Kind", happyIndex[random.nextInt(happyIndex.length)]);
            this.children.add(newChild);
        }
    }

    public void runSimultation() {
        for (Child oneChild : children) {
            oneChild.doSomething();
        }
        for (Ped onePed : peds) {
            onePed.doSomething();
        }
        for (Animal oneAnimal : animals) {
            oneAnimal.doSomething();
        }
    }

}
