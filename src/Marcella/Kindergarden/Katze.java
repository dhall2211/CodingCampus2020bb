package Marcella.Kindergarden;

import java.util.Random;

public class Katze extends Animal {

    private static Random random = new Random(System.nanoTime());

    public Katze(Kindergarden kindergarden, String name, String type, String voice) {
        super(kindergarden, name, type, voice);
    }

    @Override
    public void doSomething() {
        Child choosenChild = kindergarden.getChildren().get(random.nextInt(kindergarden.getChildren().size()));
        choosenChild.setHappyIndex(+1);
        System.out.println(this.name + " spielt mit " + choosenChild.name + ". " + choosenChild.name + " freut sich.");
    }

}
