package Eric._zoo_simulation;

// TODO decouple relevant classes and separate View
// TODO create own simulation package and clean up Zoo class

public class Main {
    public static void main(String[] args) throws InterruptedException {

        var zoo = new ZooController();
        zoo.simulate(2, 10000.0);
    }
}