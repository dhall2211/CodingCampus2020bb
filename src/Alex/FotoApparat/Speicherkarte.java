package Alex.FotoApparat;

public class Speicherkarte {
    private String marke;
    private int gesamtSpeicher;
    private int aktuellerSpeicher;


    public Speicherkarte(String marke, int gesamtSpeicher, int aktuellerSpeicher) {
        this.marke = marke;
        this.gesamtSpeicher = gesamtSpeicher;
        this.aktuellerSpeicher = aktuellerSpeicher;
    }


    @Override
    public String toString() {
        return "Marke der Speicherkarte: " + marke +"\n"+
                "Der Gesamtspeicher ist " + gesamtSpeicher +" MB groß"+"\n"+
                "Der Aktuellerspeicher ist " + aktuellerSpeicher+" MB groß";
    }
}

