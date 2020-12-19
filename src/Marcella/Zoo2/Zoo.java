package Marcella.Zoo2;

import java.util.Vector;

public class Zoo {

    private String name;
    private Vector<Enclosure> enclosures;
    private Vector<Ranger> rangers;
    private Vector<Vet> vets;


    public Zoo(String name) {
        this.name = name;
        this.enclosures = new Vector<>();
        this.rangers = new Vector<>();
        this.vets = new Vector<>();
    }

    public void addNewEnclosure(Enclosure newEnclosure) {
        if (!enclosures.contains(newEnclosure)) {
            enclosures.add(newEnclosure);
        }
    }

    public void addNewRanger(Ranger newRanger) {
        if (!rangers.contains(newRanger)) {
            rangers.add(newRanger);
        }
    }

    public Enclosure searchAndCreateRangersEnclosure(String rangersEnclosuresName) {
        for (Enclosure oneEnclosure : enclosures) {
            if (rangersEnclosuresName.equals(oneEnclosure.getName())) {
                return oneEnclosure;
            }
        }
        Enclosure newEnclosure = new Enclosure(this, rangersEnclosuresName);
        enclosures.add(newEnclosure);
        return newEnclosure;
    }

    public void addNewVet(Vet newVet) {
        if (!vets.contains(newVet)) {
            vets.add(newVet);
        }
    }

    public void printStructure() {
        System.out.println("Zoo: " + name);
        for (Enclosure oneEnclosure : enclosures) {
            oneEnclosure.printStructure();
        }
        for (Ranger oneRanger : rangers) {
            oneRanger.printStructure();
        }
        for (Vet oneVet : vets) {
            oneVet.printStructure();
        }
    }

}
