package Alex.Zoo;

import java.util.Vector;

public class Gehege {
    private final String name;
    private final Vector<Tier> tierList;

    public Gehege(Zoo zoo, String name){
        this.name = name;
        tierList = new Vector<>();

        zoo.addGehege(this);
    }

    public void addTier(Tier t){
        if (!tierList.contains(t)){
            tierList.add(t);
        }
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
        for (Tier tier : tierList) {
            tier.printStruktur(prefix + "  ");
        }
    }
}
