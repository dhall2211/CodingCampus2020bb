package Daniel;

import java.util.*;

public class Immutable {
    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public Animal copyOf(){
            return new Animal(name);
        }
    }

    public static class Cage {
        private Collection<Animal> animals;

        public Cage(Collection<Animal> animals) {
            this.animals = animals;
        }

        /**
         * Returns a copy of all animals in the cage.
         * @return
         */
        public Vector<Animal> getAnimals() {
            Vector<Animal> copyOfAnimals = new Vector<>();
            for (var animal : animals) {
                copyOfAnimals.add(animal.copyOf());
            }
            return copyOfAnimals;
        }

        @Override
        public String toString() {
            return "Cage{" +
                    "animals=" + animals +
                    '}';
        }
    }

    public static void main(String[] args){
        var ape = new Animal("Ape");
        var tiger = new Animal("Tiger");
        var lion = new Animal("Lion");

        var animals = Arrays.asList(new Animal[]{ape, tiger, lion});
        var cage = new Cage(animals);

        var animalsToChangeName = cage.getAnimals();
        var animalsList = new Vector<Animal>();
        for (var animal : animalsToChangeName) {
            var nameUpperCase = animal.getName().toUpperCase();
            animalsList.add(new Animal(nameUpperCase));
        }
        System.out.println(Arrays.toString(animalsList.toArray()));

        System.out.println(cage);
    }
}
