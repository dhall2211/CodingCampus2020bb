package Marcella.Zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("The big Zoo");

        Animal leo = zoo.createAnimal("Savanna", "Leo", "Lion", "Meat", 7);
        Animal atilla = zoo.createAnimal("Savanna","Atilla", "Antilope", "Gras", 15);
        Animal penelope = zoo.createAnimal("Savanna", "Penelope", "Antilope", "Gras", 20);
        Animal woolfi = zoo.createAnimal("Tundra","Woolfi", "Woolf", "Meat", 5);
        Animal bootsi = zoo.createAnimal("Western European","Bootsi", "Bird", "Seeds", 1);

        zoo.searchAndCreateFood("Meat", "kg");
        zoo.searchAndCreateFood("Gras", "kg");
        zoo.searchAndCreateFood("Seeds", "kg");

        zoo.searchAndCreateRanger("Tilda", atilla, new String[]{"Savanna"});
        zoo.searchAndCreateRanger("August", woolfi, new String[]{"Savanna", "Tundra"});
        zoo.searchAndCreateRanger("Brian", bootsi, new String[]{"Western European"});

        zoo.searchAndCreateVet("Daniel");

        zoo.printStructure("   ");

    }


}
