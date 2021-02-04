package Marcella.Kindergarden;

import java.util.Random;

public class Animal extends Person implements IDoSomething, IPrintAction {

    private static Random random = new Random(System.nanoTime());

    public Animal(Kindergarden kindergarden, String name, String type) {
        super(kindergarden, name, type);
    }


    @Override
    public void doSomething() {
        if (type.equals("Hund")) {
            Child choosenChild = kindergarden.getChildren().get(random.nextInt(kindergarden.getChildren().size()));
            if (choosenChild.getHappyIndex() != 0) {
                choosenChild.setHappyIndex(-1);
                System.out.println(this.name + " erschreckt " + choosenChild.name + ". " + choosenChild.name + " weint.");
            }
        } else if (type.equals("Katze")) {
            Child choosenChild = kindergarden.getChildren().get(random.nextInt(kindergarden.getChildren().size()));
            choosenChild.setHappyIndex(+1);
            System.out.println(this.name + " spielt mit " + choosenChild.name+ ". " + choosenChild.name + " freut sich.");
        } else if (type.equals("Fisch")) {
            System.out.println("Blub");
        }
    }

    @Override
    public String printAction() {
        return null;
    }
}
