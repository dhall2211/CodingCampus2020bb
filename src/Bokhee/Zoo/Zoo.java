package Bokhee.Zoo;

import java.util.Vector;

public class Zoo {
    private String zooName;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;

    //private Gehege gehegeName;
    // private Tier animalName;

    public Zoo(String name) {
        this.zooName = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
    }

    public void addGehege(Gehege g) {
        if (!gehegeList.contains(g)) {
            gehegeList.add(g);
        }
    }

    public void addFutter(Futter f) {
        if (!futterList.contains(f)) {
            futterList.add(f);
        }
    }

    public String getZooName() {
        return zooName;
    }

    public void printStrukture(String prefix) {
        System.out.println(prefix + zooName);
        System.out.println(prefix + "  GEHEGE:" );
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "   ");
        }

        System.out.println(prefix + "  FUTTER:" );
        for (int i = 0; i < futterList.size() ; i++) {
         futterList.get(i).printStruktur(prefix + "    ");
        }
    }
}
