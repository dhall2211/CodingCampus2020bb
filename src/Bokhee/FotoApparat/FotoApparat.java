package Bokhee.FotoApparat;

public class FotoApparat {
    private String beschreibung;
    private int megaPixel;
    private boolean bildStabilizierung;
    private int brennweite;
    private String herkunftsland;
    private SpeicherKarte currentSpeicherkarte;


    FotoApparat(String beschreibung, int megaPixel, boolean bildStabilizierung, int brennweite, String herkunftsland) {
        this.beschreibung = beschreibung;
        this.megaPixel = megaPixel;
        this.bildStabilizierung = bildStabilizierung;
        this.brennweite = brennweite;
        this.herkunftsland = herkunftsland;
    }
    public void machfoto() {
        if (currentSpeicherkarte.getFreierSpeicherPlatz() < 5) {
            System.out.println("kein Speicherplatz mehr! Geben Sie eine neue Karte"+"\n"+
                    "Freie Platz sind : "+ currentSpeicherkarte.getFreierSpeicherPlatz());
        } else {
            System.out.println("ein Foto ist gemacht worden.");
            currentSpeicherkarte.speichereFoto();
        }
    }

//    public String getSpeicherKarteStatus(){
//        System.out.println();
//        return SpeicherKarteStatus;
//    }


//    public void machfoto() throws Exception {
//        if (currentSpeicherkarte.getFreierSpeicherPlatz() < 5) {
//
//             throw new Exception ("kein Speicherplatz");
//        } else {
//            System.out.println("ein Foto ist gemacht worden.");
//            currentSpeicherkarte.speichereFoto();
//        }
//    }

    public SpeicherKarte getCurrentSpeicherkarte() {
        return currentSpeicherkarte;
    }

    public void setCurrentSpeicherKarte(SpeicherKarte currentSpeicherkarte) {

        this.currentSpeicherkarte = currentSpeicherkarte;
    }

    public void loeschenFoto(int menge){
        currentSpeicherkarte.setBenutzteSpeicherPlatz(currentSpeicherkarte.getBenutzteSpeicherPlatz()-(menge*5));
        System.out.println(menge+" Fotos wurde gelöscht."+"\n"+"Freie Platz sind : "+ currentSpeicherkarte.getFreierSpeicherPlatz());

    }

    public String getCountry() {
        return herkunftsland;
    }

    public void setCountry(String country) {
        this.herkunftsland = country;
    }

}
