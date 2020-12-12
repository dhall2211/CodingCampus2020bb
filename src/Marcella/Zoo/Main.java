package Marcella.Zoo;

public class Main {

    public static void main(String[] args) {

        Zoo bigZoo = new Zoo("The big Zoo");

        Enclosure tundra = new Enclosure("Tundra", bigZoo);
        Enclosure savanna = new Enclosure("Savanna", bigZoo);
        Enclosure westernEuropean = new Enclosure("Westeuropa", bigZoo);

        Animal leo = new Animal("Leo", "Lion", savanna, bigZoo);
        Animal atilla = new Animal("Atilla", "Antilope", savanna, bigZoo);
        Animal woolfi = new Animal("Woolfi", "Woolf", tundra, bigZoo);
        Animal bootsi = new Animal("Bootsi", "Bird", westernEuropean, bigZoo);

        bigZoo.printStructure("  ");

    }

}
