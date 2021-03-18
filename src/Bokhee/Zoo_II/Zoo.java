package Bokhee.Zoo_II;

import java.util.Vector;

public class Zoo {
    private String zooName;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;
    private Vector<Pfleger> pflegerList;
    private Arzt arztName;

    //private Gehege gehegeName;
    // private Tier animalName;

    public Zoo(String name) {
        this.zooName = name;
        this.arztName = arztName;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
        pflegerList = new Vector<>();
    }

    /*public void addGehege(Gehege g) {
        if (!gehegeList.contains(g)) {
            gehegeList.add(g);
        }
    }

    public void addFutter(Futter f) {
        if (!futterList.contains(f)) {
            futterList.add(f);
        }
    }*/
    public void anfrageArztBesuch(){
        System.out.println("Telefonisch Kontak auf der Arzt :" + arztName.getName() + " aufgenommen.");
    }


    public Futter searchAndCreateFutter(String name, String einheit) {
        Futter f = searchAndCreateFutter(name);
        f.setEinheit(einheit);
        return f;
    }

    public Futter searchAndCreateFutter(String name) {
        for (int i = 0; i < futterList.size(); i++) {
            if (futterList.get(i).getFutterName().equals(name)) {
                return futterList.get(i);
            }
        }
        Futter f = new Futter(name, "N.N.");
        futterList.add(f);
        return f;
    }

    public Gehege searchAndCreateGehege(String name) {
        for (int i = 0; i < gehegeList.size(); i++) {
            if (gehegeList.get(i).getName().equals(name));
            return gehegeList.get(i);
        }

        Gehege g = new Gehege(name);
        gehegeList.add(g);
        return g;
    }

    public Pfleger searchAndCreatePfleger(String name, String pflegeTier){
        Pfleger p = searchAndCreatePfleger(name);
        p.setPflegeTiers(pflegeTier);
        return p;
    }

    public Pfleger searchAndCreatePfleger(String pflegerName){
        for (int i = 0; i < pflegerList.size(); i++) {
            if(pflegerList.get(i).getPflegerName().equals(pflegerName));
            return pflegerList.get(i);
        }
        Pfleger p;
        p = new Pfleger(pflegerName);
        pflegerList.add(p);
        return p;
    }

    public Tier createTier(String gehege, String name, String gattung,String lieblingsFutter, int futterBedarf) {
        return new Tier(this, gehege, name, gattung, lieblingsFutter, futterBedarf);
    }

    public String getZooName() {
        return zooName;
    }

    public void printStrukture(String prefix) {
        System.out.println(prefix + zooName);
        System.out.println(prefix + "  GEHEGE:");
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "   ");
        }

        System.out.println(prefix + "  FUTTER:");
        for (int i = 0; i < futterList.size(); i++) {
            futterList.get(i).printStruktur(prefix + "    ");
        }
    }
}
