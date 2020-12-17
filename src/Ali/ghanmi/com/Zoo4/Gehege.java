package Ali.ghanmi.com.Zoo4;

import java.util.Vector;

public class Gehege {
    private String name;
    private Vector<Tier> tierList;

    public Gehege(String name){
        this.name = name;
        tierList = new Vector<>();
    }



    public void addTier(Tier t){
        if (!tierList.contains(t)){
            tierList.add(t);
        }
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
        for (int i = 0; i < tierList.size(); i++) {
            tierList.get(i).printStruktur(prefix + "  ");
        }
    }

    public Vector<Tier> getTierList() {
        return tierList;
    }

    public String getName() {
        return name;
    }
}
