package Alex.Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;
    private Vector<TierArzt> tierÄrzte;
    private Vector<Pfleger>pfleger1;


    public Zoo(String name) {
        this.name = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
        tierÄrzte = new Vector<>();
        pfleger1=new Vector<>();
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

    public void printStruktur(String prefix) {
        System.out.println(prefix + name);
        for (Gehege gehege : gehegeList) {
            gehege.printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "    Futter Tagesbedarf:");
        for (Futter futter : futterList) {
            futter.printStruktur(prefix + "    ");
        }

        System.out.println("  Tierärzte:");
        for (var tierArzt : tierÄrzte) {
            tierArzt.printStrukturArzt("    ");
        }

        System.out.println("  Pfleger:");
        for (var pfleger : pfleger1) {
            pfleger.printStrukturPfleger("    ");
        }
    }
    public Pfleger searchAndCreatePfleger(String name){
        for (var pfleger:pfleger1) {
            if(pfleger.getName().equals(name)){
                return pfleger;
            }
        }
        var pfleger=new Pfleger(name);
        pfleger1.add(pfleger);
        return pfleger;
    }


    public TierArzt searchAndCreateTierArzt(String name) {
        for (var tierArzt : tierÄrzte) {
            if (tierArzt.getName().equals(name)) {
                return tierArzt;
            }
        }
        var tierArzt = new TierArzt(name);
        tierÄrzte.add(tierArzt);
        return tierArzt;
    }
}
