package Eric.zoo.keeper;

import Irene.zoo.Compound;

import java.util.ArrayList;
import java.util.List;

public class Keeper {
    private String name;
    private List compoundsToKeep;

    public Keeper(String name, List compoundsToKeep) {
        this.name = name;
        this.compoundsToKeep = compoundsToKeep;
    }

    public String getName() {
        return name;
    }

    public List getCompoundsToKeep() {
        return compoundsToKeep;
    }
}
