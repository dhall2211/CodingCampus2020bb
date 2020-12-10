package Gyula.zoo;

import Ali.ghanmi.com.Teeeeeest;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;

    public Zoo(String name){
        this.name = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
    }


    public Futter searchAndCreateFutter(String name, String einheit) {
        Futter f = searchAndCreateFutter(name);
        f.setEinheit(einheit);
        return f;
    }

    public Futter searchAndCreateFutter(String name){
        for (int i = 0; i < futterList.size(); i++) {
            if (futterList.get(i).getName().equals(name)){
                return futterList.get(i);
            }
        }
        Futter f = new Futter(name, "N.N.");
        futterList.add(f);
        return f;
    }

    public Gehege searchAndCreateGehege(String name){
        for (int i = 0; i < gehegeList.size(); i++) {
            if (gehegeList.get(i).getName().equals(name)){
                return gehegeList.get(i);
            }
        }
        Gehege g = new Gehege(name);
        gehegeList.add(g);
        return g;
    }

    public Tier createTier(String gehege, String name, String gattung, String lieblingsFutter, int futterBedarf){
        return new Tier(this, gehege, name, gattung,lieblingsFutter,futterBedarf);
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
        System.out.println(prefix + "  Gehege:");
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "  Futter Tagesbedarf:");
        for (int i = 0; i < futterList.size(); i++) {
            futterList.get(i).printStruktur(prefix + "    ");
        }
    }
}
