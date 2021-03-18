package Bokhee.Camera;

public class Camera {
    private String bezeichnung; // Pflicht-Parameter
    private float megapixel; // Pflicht-Parameter
    private String herkunftsLand; // Pflicht-Parameter
    private String funktionen; // Pflicht-Parameter
    private String besitzer; // Optional
    private Objectiv currentObjectiv; // Optional

    // Construktor
    Camera(String bezeichnung, float megapixel, String herkunftsLand, String funktionen){
        this.bezeichnung = bezeichnung;
        this.megapixel = megapixel;
        this.herkunftsLand = herkunftsLand;
        this.funktionen = funktionen;
        this.besitzer = "";
        this.currentObjectiv = null;
    }

    public void setCurrentObjectiv(Objectiv currentObjektiv) {
        this.currentObjectiv = currentObjektiv;
    }

    @Override
    public String toString() {
        if (currentObjectiv != null) {
            return String.format("%s %d-%dmm Objektiv",
                    bezeichnung,
                    currentObjectiv.getMinBrennweite(),
                    currentObjectiv.getMaxBrennweite());
        } else {
            return bezeichnung + " ohne Objektiv";
        }
    }
}
