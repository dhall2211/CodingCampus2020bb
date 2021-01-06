package Marcella.Zoo2;

import java.util.Random;
import java.util.Vector;

public class Ranger {

    private static Random random = new Random();

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

    public void careForAnimals(String prefix) {
        System.out.println();
        System.out.println("PflegerIn " + name);
        for (Enclosure oneEnclosure : rangersEnclosures) {
            System.out.println(prefix + "Gehege " + oneEnclosure.getName());
            for (Animal rangersAnimal : oneEnclosure.getAnimals()) {
                System.out.println(prefix + "_ " + rangersAnimal.getName() + " gepflegt und gefüttert.");
                if (lovedAnimal.equals(rangersAnimal)) {
                    int randomNumberLovedAnimal = random.nextInt(2);
                    if (randomNumberLovedAnimal == 1) {
                        System.out.println(prefix + "_ " + rangersAnimal.getName() + " bewundert.");
                    }
                } else {
                    int randomNumberAnimal = random.nextInt(10);
                    if (randomNumberAnimal == 1) {
                        System.out.println(prefix + "_ " + rangersAnimal.getName() + " bewundert.");
                    }
                }
            }
        }
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + "Pfleger: " + name + ", Lieblingstier: " + lovedAnimal.getName());
        for (Enclosure eachRangersEnclosure : rangersEnclosures) {
            System.out.println(prefix + "_ " + eachRangersEnclosure.getName());
        }
    }

}
