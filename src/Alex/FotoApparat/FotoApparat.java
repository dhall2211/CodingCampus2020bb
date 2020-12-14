package Alex.FotoApparat;

import Marcella.FotoApparat.Speicherkarte;

public class FotoApparat {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objektiv aktuellesObjektiv; // Optional
    private Speicherkarte aktuelleSpeicherkarte;


    // Construktor
    FotoApparat(String bezeichnung, float megapixel, String herkunftsLand, String funktionen) {
        this.bezeichnung = bezeichnung;
        this.megapixel = megapixel;
        this.herkunftsLand = herkunftsLand;
        this.funktionen = funktionen;
        this.besitzer = "";
        this.aktuellesObjektiv = null;
        this.aktuelleSpeicherkarte = null;

    }

    public void aktuellesObjektiv(Objektiv aktuellesObjektivObjektiv) {
        this.aktuellesObjektiv = aktuellesObjektivObjektiv;
    }

    public void aktuelleSpeicherkarte(Speicherkarte aktuelleSpeicherkarte) {
        this.aktuelleSpeicherkarte = aktuelleSpeicherkarte;
    }

    @Override
    public String toString() {
        if (aktuellesObjektiv != null) {
            return String.format("%s %d-%dmm Objektiv",
                    bezeichnung,
                    aktuellesObjektiv.getMinBrennweite(),
                    aktuellesObjektiv.getMaxBrennweite());
        } else {
            return bezeichnung + " ohne Objektiv";
        }
    }
    public void macheFoto() {
        
    }

}

