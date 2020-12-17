package Sabrina.Zoo2;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Vector<Enclosure> enclosures;
    private String favouriteAnimal;

    public Zookeeper(String name, String favouriteAnimal, Zoo zoo){
        this.name = name;
        this.favouriteAnimal = favouriteAnimal;
        this.enclosures = new Vector<>();
        zoo.addZookeeper(this);

    }
    public void assignEnclosure(Enclosure enclosure){
       enclosures.add(enclosure);
    }


    public void printStructure(String prefix) {
        System.out.print(prefix + "Pfleger: " + name + " Lieblingstier: " + favouriteAnimal + " Gehege: ");
        for (Enclosure enclosure : enclosures) {
            System.out.print(enclosure.getName() + ", ");

        }
        System.out.println();
    }
}
