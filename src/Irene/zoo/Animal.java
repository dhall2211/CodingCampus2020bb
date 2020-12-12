package Irene.zoo;

public class Animal {
    private String animalName;
    private String species;
    private Fodder favoriteFodder;
    private int requiredFodder;

    public Animal(Zoo zoo, String animalName, String species, String favoriteFodder, int requiredFodder, String compound) {
        this.animalName = animalName;
        this.species = species;
        this.favoriteFodder = zoo.searchAndCreateFodder(favoriteFodder);
        this.requiredFodder = requiredFodder;
        this.favoriteFodder.addRequiredFodder(requiredFodder);

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
                favoriteFodder.getUnit(),
                favoriteFodder.getFodderName());
    }
}

