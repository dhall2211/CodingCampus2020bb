package Irene.zoo2ndchance;

import java.util.Vector;

public class Zookeeper {
    private String zookeeperName;
    private Vector<Compound> responsibleFor;
    private Animal favouriteBug;


    public Zookeeper(String zookeeperName, Vector<Compound> responsibleFor, Animal favouriteBug) {
        this.zookeeperName = zookeeperName;
        this.responsibleFor = responsibleFor;
        this.favouriteBug = favouriteBug;
    }

    public String getZookeeperName() {
        return zookeeperName;
    }

    public void printZookeeperStructure(String prefix) {
        System.out.println(prefix + zookeeperName);
        System.out.println(prefix + "Favourite bug: " + favouriteBug.getAnimalName());
        System.out.println(prefix + "  " + "Compound:");
        for (int i = 0; i < responsibleFor.size(); i++) {
            System.out.println(prefix + "   " + responsibleFor.get(i).getCompoundName());
        }
    }

    public Animal getFavouriteAnimal() {
        return favouriteBug;
    }

    public Vector<Compound> getCompounds() {
        return responsibleFor;
    }
}
