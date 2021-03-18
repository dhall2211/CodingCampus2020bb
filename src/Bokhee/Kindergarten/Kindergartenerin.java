package Bokhee.Kindergarten;

import java.util.Vector;

public class Kindergartenerin implements IAction {
    private String name;
    private int happyState;

    public Kindergartenerin(String name,int happyState) {
        this.name = name;
        this.happyState = happyState;
    }

    @Override
    public void doOwnThing(Vector<IAction> actionPartners) {
        for (IAction actionPartner : actionPartners) {
            if (actionPartner instanceof Kind) {
                observe(((Kind) actionPartner));
                takeCare(((Kind) actionPartner));
                interaction(actionPartner);
            } else if (actionPartner instanceof Fisch) {
                System.out.println(this.name + " is watching Fish with interest. ");
            } else if (actionPartner instanceof Animal) {
                interaction(actionPartner);
            }
        }
    }

    @Override
    public void interaction(IAction partner) {
        // TODO: 06.02.2021
        interaction(partner);
        this.happyState += 3;
    }

    public void observe(Kind kind) {
        System.out.println(this.name + " observes " + kind);
        if (kind.getPowerlevel() < 20) {
            System.out.println(this.name + " goes to " + kind.getName() + " and talks.");
            takeCare(kind);
        }
    }

    public void takeCare(Kind kind) {
        if (kind.getPowerlevel() < 25) {
            System.out.println(this.name + " gives attention to " + kind.getName());
            kind.addPower();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kindergartenerin{" +
                "name='" + name + '\'' +
                '}';
    }
}
