package Bokhee.Zoo_II;

import java.util.Vector;

public class Pfleger {
    private String pflegerName;
    private Gehege pflegeGehege;
    private Tier lieblingsTier;
    private Vector<Tier> pflegeTiers;
    private int lagerBestand;
    private Futter tagesBedarf;
    private int bestellMenge;


    public Pfleger(Zoo zoo, String pflegerName, String gehegeName, Tier lieblingsTier) {
      pflegeGehege  = zoo.searchAndCreateGehege(gehegeName);
      lieblingsTier = lieblingsTier;
        this.pflegerName = pflegerName;
        pflegeTiers = new Vector<>();

    }

    public Pfleger(String pflegerName) {
        this.pflegerName = pflegerName;
        pflegeTiers = new Vector<>();
    }

    public void addPflegeTier(Tier pt) {
        if (!pflegeTiers.contains(pt)) {
            pflegeTiers.add(pt);
        }
    }

    public String getPflegerName() {
        return pflegerName;
    }

    public void setPflegeTiers(String pflegeTier) {
    }

    public void bestellFutter() {
        int bedarfImLager = tagesBedarf.getTagesBedarf() *3;
        bestellMenge = bedarfImLager - tagesBedarf.getTagesBedarf();
        lagerBestand = bedarfImLager;
        System.out.println("Bestellung :" + tagesBedarf.getFutterName() +"  "+ bestellMenge);
    }

    public void futternTier(Tier tierName,  Gehege gehegeName, Futter futterName){
        System.out.println("Futtern die Tiere : " );
        System.out.printf("%s  %s   %d",
        tierName.getName(),
        gehegeName.getName(),
        futterName.getFutterName(),
        futterName.getTagesBedarf());
    }

    public void printPflegerArbeiten(){
        System.out.println(pflegerName +" hat in der "+ pflegeGehege);
        for (int i = 0; i < pflegeTiers.size(); i++) {
            System.out.println(pflegeTiers.get(i) + "   " + tagesBedarf + "gegeben");
        }

    }

}
