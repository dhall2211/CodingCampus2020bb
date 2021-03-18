package Bokhee.Zoo_III;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Compound> compounds;
    private Veterinarian veterinarian;
    private Vector<Zookeeper> zookeepers;

    public Zoo(String name) {
        this.name = name;
        this.compounds = new Vector<>();
        this.veterinarian = null;
        this.zookeepers = new Vector<>();
    }

    public Zookeeper addZookeeper(String name) {
        for (int i = 0; i < zookeepers.size(); i++) {
            if (zookeepers.get(i).getName().equals(name)) {
                return zookeepers.get(i);
            }

        }
        Zookeeper z = new Zookeeper(name);
        zookeepers.add(z);
        return z;
    }

    public Compound addCompound(String name) {
        for (int i = 0; i < compounds.size(); i++) {
            if (compounds.get(i).getName().equals(name)) {
                return compounds.get(i);
            }
        }
        Compound c = new Compound(name);
        compounds.add(c);
        return c;
    }

    public void addVeterinarian(String name) {
        if (veterinarian == null) {
            veterinarian = new Veterinarian(name);
        }
    }



    public String getName() {
        return name;
    }

    public void printStructure(String prefix) {
        System.out.println("Zoo Name : " + name);
        for (int i = 0; i < compounds.size(); i++) {
            compounds.get(i).printStructure(prefix + "  ");
        }
        if (veterinarian != null) {
            veterinarian.printStructure(prefix);
        }
        for (int i = 0; i < zookeepers.size(); i++) {
            zookeepers.get(i).printStructure(prefix);

        }
    }
}
