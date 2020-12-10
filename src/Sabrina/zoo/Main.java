package Sabrina.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo happyAnimals = new Zoo("HappyAnimals");

        Cage tiger = new Cage("Tiger");
        Cage giraffe = new Cage("Giraffes");
        Cage elephant = new Cage("Elephants");
        Cage bird = new Cage("Birds");
        Cage snake = new Cage("Snakes");

        Animal animal = new Animal("Hans", "Tiger");
        Animal animal1 = new Animal("Susi", "Giraffe");
        Animal animal2 = new Animal("Leo", "Elephant");
        Animal animal3 = new Animal("Sweety", "Bird");
        Animal animal4 = new Animal("Rattle", "Snake");

        //Print Funktion muss noch optimiert werden, auch noch a und an richtig ausdrucken...
        System.out.println(happyAnimals);
        System.out.println("The zoo has all these cages: ");
        printCage(tiger);
        printCage(giraffe);
        printCage(elephant);
        printCage(bird);
        printCage(snake);
        System.out.println("All this animals by name belong to the zoo: ");
        printAnimal(animal);
        printAnimal(animal1);
        printAnimal(animal2);
        printAnimal(animal3);
        printAnimal(animal4);

    }

    public static void printCage(Cage c) {
        System.out.println(c.getName());
    }

    public static void printAnimal(Animal a) {
        System.out.println(a.getName() + " who is a " + a.getGenus()+".");
    }

}
