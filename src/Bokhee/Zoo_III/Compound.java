package Bokhee.Zoo_III;

import java.util.Vector;

public class Compound {
    private String name;
    private Vector<Animal> animals;

    public Compound(String name) {
        this.name = name;
        this.animals = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public Animal addAnimal(String name, String species) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName().equals(name)) {
                return animals.get(i);
            }
        }
        Animal a = new Animal(name, species);
        animals.add(a);
        return a;
    }

    public void marvelChance(Zookeeper zookeeper) {
        int marvelChance = (int) (Math.random() * 10);

        switch (marvelChance) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:

                int index = (int) (animals.size() * (Math.random()));
                Animal randomAnimal = animals.get(index);
                zookeeper.marvelAnimal(randomAnimal);

            default:
                zookeeper.marvelFavouriteAnimal();
        }
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + "Compound Name : " + name);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).printStructure(prefix + "  ");
        }
    }
}
