package Irene.zoo2ndchance;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Zoo zoo = new Zoo("Bug Park");

        Animal ant = zoo.createAAnimal("Fred", "Ant", "Ant Wall");
        Animal spider = zoo.createAAnimal("Tobey", "Spider", "New York");
        Animal grasshopper = zoo.createAAnimal("Flip", "Grasshoper", "Ant Wall");
        Animal cricket = zoo.createAAnimal("Puck", "Cricket", "New York");
        Animal bee = zoo.createAAnimal("Maja", "Bee", "New York");
        Animal bug = zoo.createAAnimal("Lady", "Bug", "New York");

        zoo.searchOrCreateZookeeper("Orange", new String[]{"Ant Wall", "New York"}, bee);
        zoo.searchOrCreateZookeeper("Blue", new String[]{"New York"}, bug);

        zoo.searchOrCreateVet("DrDolittle");

        zoo.printStructure("");

        zoo.simulation();
    }
}
