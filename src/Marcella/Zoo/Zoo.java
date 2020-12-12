package Marcella.Zoo;

import java.util.Vector;

public class Zoo {

    private String name;
    private Vector <Enclosure> enclosures;
    //private Vector <Food> food;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new Vector<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void printStructure(String prefix){
        System.out.println("Zoo: " + this.name);

        for (int i = 0; i < enclosures.size(); i++) {
            System.out.print(prefix + "Gehege: ");
            enclosures.get(i).printStructure("  " + prefix);
            System.out.println();
        }
    }

}
