package Daniel.Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Compound> compounds;
    private Vector<Food> foods;
    private Vector<Veterinary> veterinarian;

    public Zoo(String name) {
        this.name = name;
        compounds = new Vector<>();
        foods = new Vector<>();
        veterinarian = new Vector<>();
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

    public Animal createTier(String gehege, String name, String gattung, String lieblingsFutter, int futterBedarf) {
        return new Animal(this, gehege, name, gattung, lieblingsFutter, futterBedarf);
    }

    public void printStruktur(String prefix) {
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
        for (var veterinary : veterinarian) {
            veterinary.printStruktur("    ");
        }
    }

    public Veterinary searchAndCreateVeterinary(String name) {
        // search
        for (var veterinary : veterinarian) {
            if (veterinary.getName().equals(name)) {
                return veterinary;
            }
        }

        // or create
        var veterinary = new Veterinary(name);
        veterinarian.add(veterinary);
        return veterinary;
    }
}
