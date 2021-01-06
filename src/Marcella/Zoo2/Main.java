package Marcella.Zoo2;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Der neue Zoo");

        Enclosure arctis = new Enclosure(zoo, "Arktis");
        Enclosure savanna = new Enclosure(zoo, "Savanne");
        Enclosure rainforest = new Enclosure(zoo, "Regenwald");

        Animal ici = new Animal(arctis, "Ici", "Eisbärmännchen");
        Animal isolde = new Animal(arctis, "Isolde", "Eisbärweibchen");
        Animal susi = new Animal(arctis, "Susi", "Seehundweibchen");
        Animal leon = new Animal(savanna, "Leon", "Löwenmännchen");
        Animal lonie = new Animal(savanna, "Leoni", "löwenweibchen");
        Animal duola = new Animal(rainforest, "Duola", "Paradiesvogel");

        Ranger hans = new Ranger(zoo, new String[]{"Arktis", "Savanne"}, "Hans", lonie);
        Ranger luise = new Ranger(zoo, new String[]{"Regenwald"}, "Luise", duola);

        Vet anna = new Vet(zoo, "Anna");

        zoo.printStructure("  ");
        luise.careForAnimals("  ");
        hans.careForAnimals("  ");

    }

}
