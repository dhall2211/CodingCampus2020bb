package Bokhee.Zoo_III;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Vector<Compound> responsibleCompounds;
    private Animal favouriteAnimal;

    public Zookeeper(String name) {
        this.name = name;
        this.responsibleCompounds = new Vector<>();
        this.favouriteAnimal = null;
    }


    public void addFavouriteAnimal(String name, String species) {
        if (favouriteAnimal == null) {
            favouriteAnimal = new Animal(name, species);
        }
    }

   // public void work(){
  //      System.out.println(name + "goes to the compound " + responsibleCompounds.get() + "to observe the animal");
  //  }
    public void feedAnimals() {
        for (int i = 0; i < responsibleCompounds.size(); i++) {
            if (responsibleCompounds.get(i) != null) {
                System.out.println(favouriteAnimal + "in the compound" + responsibleCompounds.get(i).getName() + "is feeded");
            }
        }
    }
    public void marvelFavouriteAnimal(){
        System.out.println(name + " marvels  at " + favouriteAnimal.getName());
    }
    public void marvelAnimal(Animal animal){
        System.out.println(name + " marvels at " + animal.getName());
    }

        public Animal getFavouriteAnimal() {
        return favouriteAnimal;
    }


    public String getName() {
        return name;
    }

    public void printStructure(String prefix) {
        System.out.print(prefix + prefix + "Zookeeper Name : " + name + ", his favourite animal is : " );
        for (int i = 0; i < responsibleCompounds.size(); i++) {
            responsibleCompounds.get(i).getName().equals(name);
            responsibleCompounds.get(i).printStructure(prefix);
        }
        if(favouriteAnimal != null) {
            System.out.println(favouriteAnimal.getName());
        }

    }
}

