package Irene.zoo;

public class Animal {
    private String animalName;
    private String species;
    private Fodder favoriteFodder;
    private int requiredFodder;

    public Animal(String animalName, String species, Fodder favoriteFodder, int requiredFodder, Compound compound) {
        this.animalName = animalName;
        this.species = species;
        this.favoriteFodder = favoriteFodder;
        this.requiredFodder = requiredFodder;
        favoriteFodder.addRequiredFodder(requiredFodder);

        compound.addAnimal(this);
    }

    public void printStructureAnimal(String prefix){
        System.out.printf("%s%s (%s) needs %d %s %s%n",
                prefix,
                animalName,
                species,
                requiredFodder,
                favoriteFodder.getUnit(),
                favoriteFodder.getFodderName());
    }
}

