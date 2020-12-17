package Eric.zoo_simple;

import java.util.Vector;

public class Compound {
    private String name;
    private Vector<Animal> animalList;

    public Compound(String name){
        this.name = name;
        animalList = new Vector<>();
    }

    public void addTier(Animal t){
        if (!animalList.contains(t)){
            animalList.add(t);
        }
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).printStruktur(prefix + "  ");
        }
    }

    public String getName() {
        return name;
    }

    public Vector<Animal> getAnimalList() {
        return animalList;
    }
}
