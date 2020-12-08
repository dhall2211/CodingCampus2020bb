package Marcella.Zoo;

public class Animal {

    private String name;
    private String species;
    private Enclosure enclosure;
    private Zoo zoo;

    public Animal(String name, String species, Enclosure enclosure, Zoo zoo) {
        this.name = name;
        this.species = species;
        this.enclosure = enclosure;
        this.zoo = zoo;
            zoo.addEnclosure(this.enclosure);
        if (zoo != null) {
            zoo.addAnimal(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
