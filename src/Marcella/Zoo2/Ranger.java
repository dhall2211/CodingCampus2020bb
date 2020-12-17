package Marcella.Zoo2;

import java.util.Vector;

public class Ranger {

    private String name;
    private Animal lovedAnimal;
    private Vector<Enclosure> rangersEnclosures;

    public Ranger(Zoo zoo, String[] rangersEnclosuresNames, String name, Animal lovedAnimal) {
        this.name = name;
        this.lovedAnimal = lovedAnimal;
        this.rangersEnclosures = new Vector<>();
        zoo.addNewRanger(this);
        for (String enclosureName: rangersEnclosuresNames) {
            rangersEnclosures.add(zoo.searchAndCreateRangersEnclosure(enclosureName));
        }
    }

    public void printStructure() {
        System.out.println("Pfleger: " + name + ", Lieblingstier: " + lovedAnimal.getName());
        for (Enclosure eachRangersEnclosure : rangersEnclosures) {
            System.out.println("_ " + eachRangersEnclosure.getName());
        }
    }

}
