package Bokhee.Kindergarten;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Animal implements IAction {
    private String name;
    private Enum farbe;
    private Random random = new Random();

    public Animal(String name, Enum farbe) {
        this.name = name;
        this.farbe = farbe;
    }

    @Override
    public void doOwnThing(Vector<IAction> actionPartners) {
        System.out.println(name + " does nothing.");
        IAction partner = actionPartners.get(random.nextInt(actionPartners.size()));
        if (!partner.equals(partner instanceof Fisch)) {
            partner.interaction(this);
            System.out.println(this.name + " does something.");
        }
    }

    @Override
    public void interaction(IAction partner) {
        // TODO: 06.02.2021 Hier ist the logic missing.
        if ((partner instanceof Kind) || (partner instanceof Kindergartenerin)) {
            System.out.println(this.name + " interreacts with " + (partner));
        }
        else if(partner instanceof Katze){
            System.out.println(this.name + " slowly walks by.");
        }
        else if (partner instanceof Hund){
            System.out.println(this.name + " terrifies children with barking and running after them.");
        }
        else if (partner instanceof Fisch){
            System.out.println("Fish swims peacefully further");
        }
    }

    public void empower(Kind kind) {
        kind.addPower();
        System.out.println(kind.getName() + "is happier.");
    }
    public void depower(Kind kind) {
        kind.decreasePower();
        System.out.println(kind.getName() + " is terrified and less happier.");
    }

    public void wander(Vector<IAction> actionPartners) {
        IAction partner = actionPartners.get(random.nextInt(actionPartners.size()));
        if (partner != null) {
            System.out.println(this.name + " wanders to " + partner);
        }
        interaction(partner);
    }


    public String getName() {
        return name;
    }

    public Enum getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", farbe=" + farbe +
                '}';
    }
}