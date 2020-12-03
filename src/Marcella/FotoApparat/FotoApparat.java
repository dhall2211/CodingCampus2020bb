package Marcella.FotoApparat;

public class FotoApparat {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objektiv currentObjektiv; // Optional
    private Speicherkarte currentSpeicherkarte;

    // Construktor
    FotoApparat(String bezeichnung, float megapixel, String herkunftsLand, String funktionen){
        this.bezeichnung = bezeichnung;
        this.megapixel = megapixel;
        this.herkunftsLand = herkunftsLand;
        this.funktionen = funktionen;
        this.besitzer = "";
        this.currentObjektiv = null;
        this.currentSpeicherkarte = null;
    }

    public void setCurrentObjektiv(Objektiv currentObjektiv) {
        this.currentObjektiv = currentObjektiv;
    }

    public void setCurrentSpeicherkarte(Speicherkarte currentSpeicherkarte) {
        this.currentSpeicherkarte = currentSpeicherkarte;
    }

    @Override
    public String toString() {
        if (currentObjektiv != null) {
            return String.format("%s %d-%dmm Objektiv",
                    bezeichnung,
                    currentObjektiv.getMinBrennweite(),
                    currentObjektiv.getMaxBrennweite());
        } else {
            return bezeichnung + " ohne Objektiv";
        }
    }

    public void getFreePerCent() {
        double freePerCent = (this.currentSpeicherkarte.getFreeSize() / this.currentSpeicherkarte.getSize()) * 100;
        System.out.println("Auf der Speicherkarte " + this.currentSpeicherkarte.getName() + " sind noch " + freePerCent + " Prozent Speicher frei.");
    }

    public int getUsedSize() {
        return this.currentSpeicherkarte.getUsedSize();
    }

    public void makeFoto() {
        if (this.currentSpeicherkarte.getFotosLeft(5) >= 1) {
            this.currentSpeicherkarte.save(5);
        } else {
            System.out.println("Es ist nicht mehr genügend Speicherplatz vorhanden.");
        }
    }

}
