package Irene.zoo2ndchance;

import Irene.zoo.Veterinarian;

import java.util.Vector;

public class Zoo {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";

    private String zooName;
    private Vector<Compound> compoundList;
    private Vector<Zookeeper> zookeeperList;
    private Vector<Vet> vetList;

    public Zoo(String zooName) {
        this.zooName = zooName;
        compoundList = new Vector<>();
        zookeeperList = new Vector<>();
        vetList = new Vector<>();
    }

    public Compound searchOrCreateCompound(String compoundName) {
        for (int i = 0; i < compoundList.size(); i++) {
            if (compoundList.get(i).getCompoundName().equals(compoundName)) {
                return compoundList.get(i);
            }
        }
        Compound c = new Compound(compoundName);
        compoundList.add(c);
        return c;
    }

    public Zookeeper searchOrCreateZookeeper(String zookeeperName, String[] compoundNames, Animal favouriteAnimal) {
        for (int i = 0; i < zookeeperList.size(); i++) {
            if (zookeeperList.get(i).getZookeeperName().equals(zookeeperName)) {
                return zookeeperList.get(i);
            }
        }
        Vector<Compound> compoundsZookeeperIsResponsibleFor = new Vector<>();
        for (var compoundName:compoundNames) {
            var compound = searchOrCreateCompound(compoundName);
            compoundsZookeeperIsResponsibleFor.add(compound);
        }
        Zookeeper zookeeper = new Zookeeper(zookeeperName, compoundsZookeeperIsResponsibleFor, favouriteAnimal);
        zookeeperList.add(zookeeper);
        return zookeeper;
    }

    public Vet searchOrCreateVet(String vetName) {
        for (var vet : vetList) {
            if (vet.getVetName().equals(vetName)) {
                return vet;
            }
        }
        var vet = new Vet(vetName);
        vetList.add(vet);
        return vet;
    }

    public Animal createAAnimal(String animalName, String species, String compound) {
        return new Animal(this, animalName, species, compound);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + zooName);
        System.out.println(prefix + "  Compound:");
        for (int i = 0; i < compoundList.size(); i++) {
            compoundList.get(i).printStructureCompound(prefix + "    ");
        }
        System.out.println(prefix + "  Zookeeper:");
        for (int i = 0; i < zookeeperList.size(); i++) {
            zookeeperList.get(i).printZookeeperStructure("    ");
        }
        System.out.println("  Vet:");
        for (var veterinarian : vetList) {
            veterinarian.printStructureVet("    ");
        }
    }

    public void simulation() throws InterruptedException {
        System.out.println("----------------------------------------");
        System.out.println("A normal day in our zoo:");
        System.out.println("----------------------------------------");
        Thread.sleep(2000);

        // logic for all keepers
        for (Zookeeper zookeeper : zookeeperList) {
            keeperGoesToWork(zookeeper);

            // logic for all compounds of keeper
            var compounds = zookeeper.getCompounds();
            for (Compound compound : compoundList) {
                Thread.sleep(1000);
                keeperEntersCompound(zookeeper, compound);

                // logic for all animals in compound
                var animals = compound.getAnimalList();
                for (Animal animal : animals) {
                    Thread.sleep(1000);
                    keeperCaresForAnimal(zookeeper, animal);
                    keeperFeedsAnimal(zookeeper, animal);
                    keeperAdmiresAnimal(zookeeper, animal);
                }
            }
        }
    }

    // simulation methods ------------------------------------------------------------------------------
    private void keeperGoesToWork(Zookeeper keeper) {
        System.out.println();
        System.out.println(keeper.getZookeeperName() + " goes to work");
    }

    private void keeperEntersCompound(Zookeeper keeper, Compound compound) {
        System.out.println(" " + keeper.getZookeeperName() + " reaches " + compound.getCompoundName());
    }

    private void keeperCaresForAnimal(Zookeeper keeper, Animal animal) {
        System.out.println("----------------------------------------");
        System.out.println("  " + keeper.getZookeeperName() + " takes care for " + animal.getAnimalName());
    }

    private void keeperFeedsAnimal(Zookeeper keeper, Animal animal) {
        System.out.println("  " + keeper.getZookeeperName()+ " feeds " + animal.getAnimalName());
    }

    private void keeperAdmiresAnimal(Zookeeper keeper, Animal animal) {
        var isFavorite = keeper.getFavouriteAnimal().equals(animal);
        var careProbability = (isFavorite) ? getRandomNumber(2) : getRandomNumber(10);

        if (careProbability < 1) {
            System.out.println("    " + GREEN + keeper.getZookeeperName() + " admires " + animal.getAnimalName() + RESET);
        } else {
            System.out.println("    " + RED + keeper.getZookeeperName() + " has no time for " + animal.getAnimalName() + RESET);
        }
    }

    private int getRandomNumber(int max) {
        return (int) (Math.random() * (max));
    }
// ------------------------------------------------------------------------------ end of simulation methods
}
