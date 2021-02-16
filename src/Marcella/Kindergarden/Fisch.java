package Marcella.Kindergarden;

import java.util.Random;

public class Fisch extends Animal{

    private static Random random = new Random(System.nanoTime());

    public Fisch(Kindergarden kindergarden, String name, String type, String voice) {
        super(kindergarden, name, type, voice);
    }

    @Override
    public void doSomething() {
        System.out.println(this.name + " macht " + this.voice);
    }

}
