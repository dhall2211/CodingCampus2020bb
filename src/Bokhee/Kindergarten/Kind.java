package Bokhee.Kindergarten;

import java.util.Random;
import java.util.Vector;
import java.util.function.ToDoubleBiFunction;

public class Kind implements IAction {

    private String name;
    private int powerlevel;
    public static Random random = new Random();

    public Kind(String name) {
        this.name = name;
        int standard = 10;
        this.powerlevel = standard;
        standard++;
    }

    @Override
    public void doOwnThing(Vector<IAction> actionPartners) {
        // TODO: 06.02.2021
        play(actionPartners);
        for (IAction a: actionPartners ) {

            interaction(a) ;
        }
    }

    @Override
    public void interaction(IAction partner) {
        // TODO: 06.02.2021
        if ((partner instanceof Animal) && (!(partner instanceof Fisch))
                || (partner instanceof Kind) || (partner instanceof Kindergartenerin)) {
            addPower();
        } else {
            System.out.println(name + " just watches " + partner);
        }
    }

    public void play(Vector<IAction> actionPartners) {
        for (IAction a: actionPartners) {
            System.out.println(this.name + " plays with " + a);
        }
    }

    public int addPower() {

        int randomPower = ((int) random.nextInt(10) + 3);
        this.powerlevel += randomPower;
        System.out.println(this.name + " increases his happy feeling power level to " + this.powerlevel);
        return this.powerlevel;

    }

    public int decreasePower() {

        int randomPower = ((int) random.nextInt(10) + 3);
        this.powerlevel -= randomPower;
        System.out.println(this.name + " decreased his happy feeling power level to " + this.powerlevel);
        return this.powerlevel;

    }

    public String getName() {
        return name;
    }

    public int getPowerlevel() {
        return powerlevel;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "name='" + name + '\'' +
                ", powerlevel=" + powerlevel +
                '}';
    }
}
