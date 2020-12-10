package Alex.Zoo;

import java.util.Vector;

public class Zoo {
    private final String name;
    private final Vector<Gehege> gehegeList;
    private final Vector<Futter> futterList;

    public Zoo(String name){
        this.name = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
    }

    public void addGehege(Gehege g){
        if (!gehegeList.contains(g)){
            gehegeList.add(g);
        }
    }

    public void addFutter(Futter f){
        if (!futterList.contains(f)){
            futterList.add(f);
        }
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
       // System.out.println(prefix + "  Gehege:");
        for (Gehege gehege : gehegeList) {
            gehege.printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "    Futter Tagesbedarf:");
        for (Futter futter : futterList) {
            futter.printStruktur(prefix + "    ");
        }
    }
}
