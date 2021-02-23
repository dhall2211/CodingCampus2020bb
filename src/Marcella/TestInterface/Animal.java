package Marcella.TestInterface;

public abstract class Animal implements ISimulation {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
