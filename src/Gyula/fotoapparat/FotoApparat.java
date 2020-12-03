package Gyula.fotoapparat;

public class FotoApparat {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objektiv currentObjektiv; // Optional

    // Construktor
    FotoApparat(String bezeichnung, float megapixel, String herkunftsLand, String funktionen){
        this.bezeichnung = bezeichnung;
        this.megapixel = megapixel;
        this.herkunftsLand = herkunftsLand;
        this.funktionen = funktionen;
        this.besitzer = "";
        this.currentObjektiv = null;
    }

    public void setCurrentObjektiv(Objektiv currentObjektiv) {
        this.currentObjektiv = currentObjektiv;
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
}
