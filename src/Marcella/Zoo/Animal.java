package Marcella.Zoo;

public class Animal {

    private String name;
    private String species;

    public Animal(String name, String species, Enclosure enclosure, Zoo zoo) {
        this.name = name;
        this.species = species;
        if (zoo != null) {
            enclosure.addAnimal(this);
        }
    }

    public void printStructure(){
        System.out.print(this.name + ", " + species);
    }

}
