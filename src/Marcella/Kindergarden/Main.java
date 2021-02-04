package Marcella.Kindergarden;

public class Main {

    public static void main(String[] args) {

        Kindergarden kindergarden = new Kindergarden("Kindergarten Feldkirch");

        Animal hund = new Animal(kindergarden, "Wolle", "Hund");
        Animal katze = new Animal(kindergarden, "Mizi", "Katze");
        Animal fisch = new Animal(kindergarden, "Fritz", "Fisch");

        kindergarden.addAnimal(hund);
        kindergarden.addAnimal(katze);
        kindergarden.addAnimal(fisch);

        kindergarden.generatePeds(3);
        kindergarden.generateChildren(9);

        kindergarden.runSimultation();

    }

}
