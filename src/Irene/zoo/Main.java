package Irene.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Wilhelma");

//        Compound lionsden = new Compound(zoo, "Lion's den");
//        Compound savanna = new Compound(zoo, "Savanna");
//        Compound waterworld = new Compound(zoo, "Waterworld");
//
//        Fodder meat = new Fodder(zoo, "Rump steak", "kg");
//        Fodder fish = new Fodder(zoo, "Fish", "kg");
//        Fodder rats = new Fodder(zoo, "Rats", "");
//        Fodder greens = new Fodder(zoo, "Greens", "kg");
//        Fodder bugs = new Fodder(zoo, "Bugs", "");

        Animal lion = zoo.createAnimal("Simba", "Lion", "Meat", 15, "Lionsden");
        Animal lioness = zoo.createAnimal("Nala", "Lion", "Meat", 11, "Lionsden");
        Animal snake = zoo.createAnimal("Kaa", "Snake", "Rats", 2, "Savanna");
        Animal wartHog = zoo.createAnimal("Pumba", "Wart hog", "Greens", 3, "Savanna");
        Animal meerkat = zoo.createAnimal("Timon", "Meerkat", "Bugs", 20, "Savanna");
        Animal sealion = zoo.createAnimal("Unesco", "Sea Lion", "Fish", 10, "Waterworld");
        Animal sealioness = zoo.createAnimal("Salty", "Sea Lion", "Fish", 8, "Waterworld");
        Animal sealess = zoo.createAnimal("Lady", "Seal", "Fish", 5, "Waterworld");
        Animal seal = zoo.createAnimal("Tramp", "Seal", "Fish", 8, "Waterworld");

        zoo.searchAndCreateFodder("Meat", "kg");
        zoo.searchAndCreateFodder("Fish", "kg");
        zoo.searchAndCreateFodder("Rats", "");
        zoo.searchAndCreateFodder("Greens", "kg");
        zoo.searchAndCreateFodder("Bugs", "");

        zoo.searchAndCreateCaretaker("Sepp", wartHog, new String[]{"Savanna"});
        zoo.searchAndCreateCaretaker("Hubert", sealess, new String[]{"Waterworld", "Lionsden"});

        zoo.searchAndCreateVeterinarian("DrDolittle");

        zoo.printStructure("");
    }
}
