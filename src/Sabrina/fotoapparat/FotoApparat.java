package Sabrina.fotoapparat;

public class FotoApparat {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objektiv currentObjektiv; // Optional

    // Construktor
    FotoApparat(String bezeichnung, float megapixel, String herkunftsLand, String funktionen) {
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

    public boolean makeFoto(Speicherkarte speicherkarte) {

        if (!hasPlace(speicherkarte)) {
            System.out.println("Es gibt keinen Speicherplatz mehr.");
            return false;
        } else {
            speicherkarte.setSpeicherPlatz(speicherkarte.getSpeicherPlatz() - speicherkarte.getFoto());
            System.out.println("Es gibt noch: " + speicherkarte.getSpeicherPlatz() + " MB Speicherplatz.");
        }
        return true;
    }

    public boolean hasPlace(Speicherkarte speicherkarte) {
        return speicherkarte.getSpeicherPlatz() >= speicherkarte.getFoto();
    }

    public void deleteAllFoto(Speicherkarte speicherkarte) {
        speicherkarte.setSpeicherPlatz(1000);
        System.out.println("Sie haben wieder " + speicherkarte.getSpeicherPlatz() + " MB.");
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
