package Irene.zoo;

import java.util.Vector;

public class Compound {
    private String compoundName;
    private Vector<Animal> animalList;

    public Compound(String compoundName){
        this.compoundName = compoundName;
        animalList = new Vector<>();

//        zoo.addCompound(this);
    }

    public void addAnimal(Animal a){
        if (!animalList.contains(a)){
            animalList.add(a);
        }
    }

    public String getCompoundName() {
        return compoundName;
    }

    public void printStructureCompound(String prefix){
        System.out.println(prefix + compoundName);
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).printStructureAnimal(prefix + "  ");
        }
    }
}
