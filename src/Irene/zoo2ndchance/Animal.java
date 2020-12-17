package Irene.zoo2ndchance;

public class Animal {
    private String animalName;
    private String species;

    public Animal(Zoo zoo, String animalName, String species, String compound) {
        this.animalName = animalName;
        this.species = species;

        zoo.searchOrCreateCompound(compound).addAnimal(this);
    }

    public void printStructureAnimal(String prefix) {
        System.out.printf("%s%s (%s)%n",
                prefix,
                animalName,
                species);
    }

    public String getAnimalName() {
        return animalName;
    }
}
