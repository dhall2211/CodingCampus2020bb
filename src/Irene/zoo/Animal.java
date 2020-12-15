package Irene.zoo;

public class Animal {
    private String animalName;
    private String species;
    private Fodder favouriteFodder;
    private int requiredFodder;

    public Animal(Zoo zoo, String animalName, String species, String favouriteFodder, int requiredFodder, String compound) {
        this.animalName = animalName;
        this.species = species;
        this.favouriteFodder = zoo.searchAndCreateFodder(favouriteFodder);
        this.requiredFodder = requiredFodder;
        this.favouriteFodder.addRequiredFodder(requiredFodder);

//        favoriteFodder.addRequiredFodder(requiredFodder);

        zoo.searchAndCreateCompound(compound).addAnimal(this);

//        compound.addAnimal(this);
    }

    public void printStructureAnimal(String prefix){
        System.out.printf("%s%s (%s) needs %d %s %s.%n",
                prefix,
                animalName,
                species,
                requiredFodder,
                favouriteFodder.getUnit(),
                favouriteFodder.getFodderName());
    }

    public String getAnimalName() {
        return animalName;
    }
}

