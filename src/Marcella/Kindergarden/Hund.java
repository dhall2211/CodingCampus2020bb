package Marcella.Kindergarden;

import java.util.Random;

public class Hund extends Animal {

    private static Random random = new Random(System.nanoTime());

    public Hund(Kindergarden kindergarden, String name, String type, String voice) {
        super(kindergarden, name, type, voice);
    }

    @Override
    public void doSomething() {
        Child choosenChild = kindergarden.getChildren().get(random.nextInt(kindergarden.getChildren().size()));
        if (choosenChild.getHappyIndex() != 0) {
            choosenChild.setHappyIndex(-1);
            System.out.println(this.name + " erschreckt " + choosenChild.name + ". " + choosenChild.name + " weint.");
        }
    }

}
