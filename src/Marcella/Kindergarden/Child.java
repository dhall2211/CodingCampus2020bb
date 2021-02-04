package Marcella.Kindergarden;

import java.util.Random;

public class Child extends Person implements IDoSomething, IPrintAction {

    private int happyIndex;
    private static Random random = new Random(System.nanoTime());

    public Child(Kindergarden kindergarden, String name, String type, int happyIndex) {
        super(kindergarden, name, type);
        this.happyIndex = happyIndex;
    }

    public int getHappyIndex() {
        return happyIndex;
    }

    public void setHappyIndex(int happyIndex) {
        this.happyIndex = happyIndex;
    }

    @Override
    public void doSomething() {
        int randomChoice = random.nextInt(3);
        switch (randomChoice) {
            case 0:
                happyIndex++;
                System.out.println(this.name + TypeOfAction.CONTACT);
                return;
            case 1:
                happyIndex++;
                System.out.println(this.name + TypeOfAction.PLAYGOOD);
                return;
            case 2:
                happyIndex--;
                System.out.println(this.name + TypeOfAction.PLAYBAD);
                return;
        }

    }

    @Override
    public String printAction() {
        return null;
    }
}
