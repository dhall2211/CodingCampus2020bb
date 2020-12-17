package Marcella.Zoo2;

public class Animal {

    private String name;
    private String species;

    public Animal(Enclosure enclosure, String name, String species) {
        this.name = name;
        this.species = species;
        enclosure.addNewAnimal(this);
    }

    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.println("Tier: " + name + ", " + species);
    }

}
