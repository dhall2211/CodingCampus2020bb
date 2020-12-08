package Irene.zoo;

import java.util.ArrayList;
import java.util.Vector;

public class Animal {
    private String nameAnimal;
    private String species;

    public Animal(String nameAnimal, String species) {
        this.nameAnimal = nameAnimal;
        this.species = species;
    }

    @Override
    public String toString() {
        return nameAnimal + " is a " + species;
    }

    public void printStructureAnimal() {
        System.out.println(this.nameAnimal + " is a " + this.species + ".");
    }
}

