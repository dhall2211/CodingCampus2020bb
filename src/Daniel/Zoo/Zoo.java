package Daniel.Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Compound> compounds;
    private Vector<Food> foods;
    private Vector<Veterinary> veterinaries;
    private Vector<Zookeeper> zookeepers;

    public Zoo(String name) {
        this.name = name;
        this.compounds = new Vector<>();
        this.foods = new Vector<>();
        this.veterinaries = new Vector<>();
        this.zookeepers = new Vector<>();
    }


    public Food searchAndCreateFutter(String name, String einheit) {
        Food f = searchAndCreateFutter(name);
        f.setUnit(einheit);
        return f;
    }

    public Food searchAndCreateFutter(String name) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getName().equals(name)) {
                return foods.get(i);
            }
        }
        Food f = new Food(name, "N.N.");
        foods.add(f);
        return f;
    }

    public Compound searchAndCreateGehege(String name) {
        for (int i = 0; i < compounds.size(); i++) {
            if (compounds.get(i).getName().equals(name)) {
                return compounds.get(i);
            }
        }
        Compound g = new Compound(name);
        compounds.add(g);
        return g;
    }

    public Animal createAnimal(String compound, String name, String species, String favouriteFood, int foodDemand) {
        return new Animal(this, compound, name, species, favouriteFood, foodDemand);
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name);
        System.out.println(prefix + "  Gehege:");
        for (int i = 0; i < compounds.size(); i++) {
            compounds.get(i).printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "  Futter Tagesbedarf:");
        for (int i = 0; i < foods.size(); i++) {
            foods.get(i).printStruktur(prefix + "    ");
        }
        System.out.println("  Tierärzte:");
        for (var veterinary : veterinaries) {
            veterinary.printStruktur("    ");
        }
        System.out.println("  Pfleger:");
        for (var zookeeper : zookeepers) {
            zookeeper.printStruktur("    ");
        }
    }

    public Veterinary searchAndCreateVeterinary(String name) {
        // search
        for (var veterinary : veterinaries) {
            if (veterinary.getName().equals(name)) {
                return veterinary;
            }
        }

        // or create
        var veterinary = new Veterinary(name);
        veterinaries.add(veterinary);
        return veterinary;
    }

    public Zookeeper searchAndCreateZookeeper(String name, Animal favoriteAnimal, String[] compoundNames) {
        // search
        for (var zookeeper : zookeepers) {
            if (zookeeper.getName().equals(name)) {
                return zookeeper;
            }
        }

        Vector<Compound> compounds = new Vector<>();
        for (var compoundName:compoundNames) {
            var compound = searchAndCreateGehege(compoundName);
            compounds.add(compound);
        }

        // or create
        var zookeeper = new Zookeeper(name, favoriteAnimal, compounds);
        zookeepers.add(zookeeper);
        return zookeeper;
    }
}
