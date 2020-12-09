package Irene.zoo;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Simba", "lion");
        Animal lioness = new Animal("Nala", "lion");
        Animal snake = new Animal("Kaa", "snake");
        Animal wartHog = new Animal("Pumba", "wart hog");
        Animal meerkat = new Animal("Timon", "meerkat");

        lion.printStructureAnimal();
        lioness.printStructureAnimal();
        snake.printStructureAnimal();
        wartHog.printStructureAnimal();
        meerkat.printStructureAnimal();
    }
}
