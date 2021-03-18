package Bokhee.Zoo_III;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void addAnimal(String name){

    }
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void printStructure(String prefix) {
        System.out.println(prefix +  "Animal Name : " + name +"  "+"(" + species + ")");

    }

    @Override
    public String toString() {
        return "Animal name: " +
                 name + " Species " + species ;
    }
}
