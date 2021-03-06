package Irene.zoo;

import java.util.Vector;

public class Caretaker {
    private String careName;
    private Animal favouriteAnimal;
    private Vector<Compound> responsibleFor;

    public Caretaker(String careName, Animal favouriteAnimal, Vector<Compound> responsibleFor) {
        this.careName = careName;
        this.favouriteAnimal = favouriteAnimal;
        this.responsibleFor = responsibleFor;
    }

//    public Caretaker(String careName) {
//        this.careName = careName;
//    }

    public String getCareName() {
        return careName;
    }

//    public void setCareName(String careName) {
//        this.careName = careName;
//    }

    public void printCaretakerStructure(String prefix) {
        System.out.println(prefix + this.careName);
        System.out.println(prefix + "  Favorite animal: " + favouriteAnimal.getAnimalName());
        System.out.println(prefix + "  " + "Compound:");
        for (var compound : responsibleFor) {
            System.out.println(prefix + "    " + compound.getCompoundName());
        }
    }
}
