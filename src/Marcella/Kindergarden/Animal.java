package Marcella.Kindergarden;

import java.util.Random;

public class Animal extends Being {

    protected String voice;
    private static Random random = new Random(System.nanoTime());

    public Animal(Kindergarden kindergarden, String name, String type, String voice) {
        super(kindergarden, name, type);
        this.voice = voice;
    }


    @Override
    public void doSomething() {
    }

}
