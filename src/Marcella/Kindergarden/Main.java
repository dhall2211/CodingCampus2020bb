package Marcella.Kindergarden;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Kindergarden kindergarden = new Kindergarden("Kindergarten Feldkirch");

        Vector<Animal> animals = new Vector<>();
        animals.add(new Hund(kindergarden, "Wolle", "Hund", "wuff"));
        animals.add(new Katze(kindergarden, "Mizi", "Katze", "miau"));
        animals.add(new Fisch(kindergarden, "Fritz", "Fisch", "blub"));

            for (Animal newAnimal : animals) {
                kindergarden.addAnimal(newAnimal);
            }

        kindergarden.generatePeds(3);
        kindergarden.generateChildren(9);

        kindergarden.runSimultation();

    }

}
