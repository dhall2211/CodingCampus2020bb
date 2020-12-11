package Irene.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wilhelma");

        Compound lionsden = new Compound(zoo, "Lion's den");
        Compound savanna = new Compound(zoo, "Savanna");
        Compound waterworld = new Compound(zoo, "Waterworld");

        Fodder meat = new Fodder(zoo, "Rump steak", "kg");
        Fodder fish = new Fodder(zoo, "Fish", "kg");
        Fodder rats = new Fodder(zoo, "Rats", "");
        Fodder greens = new Fodder(zoo, "Greens", "kg");
        Fodder bugs = new Fodder(zoo, "Bugs", "");

        Animal lion = new Animal("Simba", "Lion", meat, 15, lionsden);
        Animal lioness = new Animal("Nala", "Lion", meat, 11, lionsden);
        Animal snake = new Animal("Kaa", "Snake", rats, 2, savanna);
        Animal wartHog = new Animal("Pumba", "Wart hog", greens, 3, savanna);
        Animal meerkat = new Animal("Timon", "Meerkat", bugs, 20, savanna);
        Animal sealion = new Animal("Unesco", "Sea Lion", fish, 10, waterworld);
        Animal sealioness = new Animal("Salty", "Sea Lion", fish, 8, waterworld);
        Animal sealess = new Animal("Lady", "Seal", fish, 5, waterworld);
        Animal seal = new Animal("Tramp", "Seal", fish, 8, waterworld);

        zoo.printStructure("");
    }
}
